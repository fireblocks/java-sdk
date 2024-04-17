import static org.mockito.Mockito.*;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.fireblocks.sdk.AdditionalOptions;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.InstanceTimeWrapper;
import com.fireblocks.sdk.api.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.time.Instant;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class FireblocksTest {

    private Fireblocks fireblocks;

    private void setupFireblocks(
            boolean isMockSecretKey,
            AdditionalOptions additionalOptions,
            ConfigurationOptions conf) {
        if (additionalOptions == null) {
            additionalOptions =
                    new AdditionalOptions().userAgent("testUserAgent").isAnonymousPlatform(true);
        }
        if (conf == null) {
            conf =
                    new ConfigurationOptions()
                            .basePath("https://api.fireblocks.io/v1")
                            .apiKey("testApiKey")
                            .secretKey("testSecretKey")
                            .additionalOptions(additionalOptions);
        }
        if (isMockSecretKey) {
            setupFireblocksWithMockedSecretKey(additionalOptions, conf);
        } else {
            setupFireblocksWithRealSecretKey(additionalOptions, conf);
        }
    }

    private void setupFireblocksWithRealSecretKey(
            AdditionalOptions additionalOptions, ConfigurationOptions conf) {
        String secretKey = null;
        try {
            secretKey =
                    new String(
                            Files.readAllBytes(
                                    Paths.get(
                                            "src/test/java/com/fireblocks/sdk/DummyTestKey.txt")));
        } catch (IOException e) {
            Assert.fail("Failed to read secret key file: " + e.getMessage());
        }
        conf.secretKey(secretKey);

        fireblocks = new Fireblocks(conf);
    }

    private void setupFireblocksWithMockedSecretKey(
            AdditionalOptions additionalOptions, ConfigurationOptions conf) {
        try (MockedStatic<Algorithm> mockedAlgorithm = Mockito.mockStatic(Algorithm.class);
                MockedStatic<KeyFactory> mockedKeyFactory = Mockito.mockStatic(KeyFactory.class);
                MockedStatic<Base64> mockedBase64 = Mockito.mockStatic(Base64.class)) {

            KeyFactory keyFactoryMock = Mockito.mock(KeyFactory.class);
            mockedKeyFactory.when(() -> KeyFactory.getInstance("RSA")).thenReturn(keyFactoryMock);

            Base64.Decoder decoderMock = Mockito.mock(Base64.Decoder.class);
            when(decoderMock.decode(anyString()))
                    .thenReturn(new byte[0]); // return a non-null byte array
            mockedBase64.when(() -> Base64.getDecoder()).thenReturn(decoderMock);

            fireblocks = new Fireblocks(conf);

            mockedAlgorithm.verify(() -> Algorithm.RSA256(any(), any()));
            mockedKeyFactory.verify(() -> KeyFactory.getInstance("RSA"));
        }
    }

    private void runAndVerifyAuthorizationValue(
            HttpRequest.Builder requestBuilder, String expectedAuthorizationValue) {
        setupFireblocks(false, null, null);
        ApiClient apiClient = fireblocks.getApiClient();
        Instant fixedInstant = Instant.parse("2024-03-21T13:16:22.684533Z");
        UUID fixedUUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        try (MockedStatic<InstanceTimeWrapper> mockedTime =
                        Mockito.mockStatic(InstanceTimeWrapper.class);
                MockedStatic<UUID> mockedUUID = Mockito.mockStatic(UUID.class)) {
            mockedTime.when(() -> InstanceTimeWrapper.now()).thenReturn(fixedInstant);
            mockedUUID.when(() -> UUID.randomUUID()).thenReturn(fixedUUID);

            // Spy on the real HttpRequest.Builder
            HttpRequest.Builder spyRequestBuilder = Mockito.spy(requestBuilder);

            // Apply the interceptor over the builder
            Consumer<HttpRequest.Builder> interceptor = apiClient.getRequestInterceptor();
            interceptor.accept(spyRequestBuilder);

            // Build the http request
            HttpRequest request = spyRequestBuilder.build();

            // Retrieve the headers from the http request
            HttpHeaders headers = request.headers();
            Map<String, List<String>> headerMap = headers.map();

            // Verify the headers of the request
            Assert.assertEquals(expectedAuthorizationValue, headerMap.get("Authorization").get(0));
            Assert.assertEquals("application/json", headerMap.get("Content-Type").get(0));
            Assert.assertEquals(
                    "testUserAgent fireblocks/sdk/java/1.1.0", headerMap.get("User-Agent").get(0));
            Assert.assertEquals("testApiKey", headerMap.get("X-API-Key").get(0));
        }
    }

    @Test
    public void testMissingApiKey() {
        AdditionalOptions additionalOptions =
                new AdditionalOptions().userAgent("testUserAgent").isAnonymousPlatform(true);
        ConfigurationOptions conf =
                new ConfigurationOptions()
                        .basePath("testBasePath")
                        .secretKey("testSecretKey")
                        .additionalOptions(additionalOptions);

        try {
            new Fireblocks(conf);
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(
                    "apiKey is required either in the configuration or as environment variable"
                            + " FIREBLOCKS_API_KEY",
                    e.getMessage());
        }
    }

    @Test
    public void testMissingSecretKey() {
        AdditionalOptions additionalOptions =
                new AdditionalOptions().userAgent("testUserAgent").isAnonymousPlatform(true);
        ConfigurationOptions conf =
                new ConfigurationOptions()
                        .basePath("testBasePath")
                        .apiKey("testApiKey")
                        .additionalOptions(additionalOptions);

        try {
            new Fireblocks(conf);
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(
                    "secretKey is required either in the configuration or as environment variable"
                            + " FIREBLOCKS_SECRET_KEY",
                    e.getMessage());
        }
    }

    @Test
    public void testMissingBasePath() {
        AdditionalOptions additionalOptions =
                new AdditionalOptions().userAgent("testUserAgent").isAnonymousPlatform(true);
        ConfigurationOptions conf =
                new ConfigurationOptions()
                        .apiKey("testApiKey")
                        .secretKey("testSecretKey")
                        .additionalOptions(additionalOptions);

        try {
            setupFireblocks(true, additionalOptions, conf);
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(
                    "basePath is required either in the configuration or as environment variable"
                            + " FIREBLOCKS_BASE_PATH",
                    e.getMessage());
        }
    }

    @Test
    public void testInvalidSecretKey() {
        AdditionalOptions additionalOptions =
                new AdditionalOptions().userAgent("testUserAgent").isAnonymousPlatform(true);
        ConfigurationOptions conf =
                new ConfigurationOptions()
                        .basePath("testBasePath")
                        .apiKey("testApiKey")
                        .secretKey("testSecretKey")
                        .additionalOptions(additionalOptions);

        try {
            new Fireblocks(conf);
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Invalid secretKey", e.getMessage());
        }
    }

    @Test
    public void testGetApiClient() {
        setupFireblocks(true, null, null);
        ApiClient apiClient = fireblocks.getApiClient();
        Assert.assertNotNull(apiClient);
        Assert.assertNotNull(apiClient.getRequestInterceptor());
    }

    @Test
    public void testHeadersExistsInRequest() {
        setupFireblocks(true, null, null);
        ApiClient apiClient = fireblocks.getApiClient();

        // Mock the JWT Creation and Sign methods
        try (MockedStatic<JWT> mocked = Mockito.mockStatic(JWT.class)) {
            JWTCreator.Builder mockBuilder = Mockito.mock(JWTCreator.Builder.class);
            Mockito.when(mockBuilder.sign(Mockito.any())).thenReturn("mockJwt");
            Mockito.when(mockBuilder.withClaim(Mockito.anyString(), Mockito.anyString()))
                    .thenReturn(mockBuilder); // Mock the withClaim method to return the
            // JWTCreator.Builder mock
            Mockito.when(mockBuilder.withClaim(Mockito.anyString(), Mockito.anyLong()))
                    .thenReturn(mockBuilder); // Mock the withClaim method to return the
            // JWTCreator.Builder mock
            Mockito.when(JWT.create()).thenReturn(mockBuilder);

            // Create a real HttpRequest.Builder and then spy on it
            HttpRequest.Builder requestBuilder =
                    HttpRequest.newBuilder().uri(URI.create("http://localhost"));
            ;
            HttpRequest.Builder spyRequestBuilder = Mockito.spy(requestBuilder);

            // Apply the interceptor over the builder
            Consumer<HttpRequest.Builder> interceptor = apiClient.getRequestInterceptor();
            interceptor.accept(spyRequestBuilder);

            // Build the http request
            HttpRequest request = spyRequestBuilder.build();

            // Retrieve the headers from the http request
            HttpHeaders headers = request.headers();
            Map<String, List<String>> headerMap = headers.map();

            // Verify the headers of the request
            Assert.assertEquals("Bearer mockJwt", headerMap.get("Authorization").get(0));
            Assert.assertEquals("application/json", headerMap.get("Content-Type").get(0));
            Assert.assertEquals(
                    "testUserAgent fireblocks/sdk/java/1.1.0", headerMap.get("User-Agent").get(0));
            Assert.assertEquals("testApiKey", headerMap.get("X-API-Key").get(0));
        }
    }

    @Test
    public void testAuthorizationValueWithoutBody() {
        HttpRequest.Builder requestBuilder =
                HttpRequest.newBuilder().uri(URI.create("http://localhost"));
        String expectedAuthorizationValue =
                "Bearer"
                    + " eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ0ZXN0QXBpS2V5IiwiYm9keUhhc2giOiJlM2IwYzQ0Mjk4ZmMxYzE0OWFmYmY0Yzg5OTZmYjkyNDI3YWU0MWU0NjQ5YjkzNGNhNDk1OTkxYjc4NTJiODU1IiwiZXhwIjoxNzExMDI3MDM3LCJ1cmkiOiIiLCJub25jZSI6IjEyM2U0NTY3LWU4OWItMTJkMy1hNDU2LTQyNjYxNDE3NDAwMCIsImlhdCI6MTcxMTAyNjk4Mn0.WGr-S5VVekZKFnx7ThzrdXeUm3YETzkP5oNa7QZUJcPN7Pm7j8ZQWGMlXL6bAQBuMUE7zBzMf_5iEUXOTa4iSseQaFR4ILzY5Rbi8Ps9EMGq--QaWFwWDoiE5qUcuU20gcALOY9L1cZtZPGFH-rcWrg1L99hFC3977pHu524IjBqXBELuxT1t3le4FcAS0mqcgi3XsLzOBCjSKNiWaqX1mRhTQgmvLCSJhcMMnGns-NERPvtQsMukRvYYErhx7RoTBv96Z1djsg2wrhKGqFmJyxWKVLA06k-XwAvXjJbIm1kl0S7KCXQdFpXzYLJH0OLXGMeQhhlz59d6WfivXd5Y7oKVGIke4AtImcUtzAht_bwG22IDY3UBNq1SEwe1-K_iW7Fh5UQy-4m62s5u38R-CDfV7q0oBAxLRB8sbH1zAm8bDU8kIyR8k7N9L_gWTF6hSVMnVP6QrScAhmVKgv1mFI2BySqBeKY6TdDIvBFHqSPL0F1fABz_tT7L3RZt_4GJnWfJXPr9ERlXbVTj2q1dEdgMscPFc6PfRRXzYSQRH10xbSOpvmi1ldx3wnjOeYJsDlLCG8kwSZExrIPXYNXme_2c6GYGoXpTwME2IfQhPtIPQcWBMMnP1z5UAUdx1SYLXafWYAiYKF7G8a91S07hEgmhT4nS2ZlBgGzb0dcsNE";
        runAndVerifyAuthorizationValue(requestBuilder, expectedAuthorizationValue);
    }

    @Test
    public void testAuthorizationValueWithEmptyBody() {
        HttpRequest.Builder requestBuilder =
                HttpRequest.newBuilder()
                        .uri(URI.create("http://localhost"))
                        .POST(HttpRequest.BodyPublishers.noBody());
        String expectedAuthorizationValue =
                "Bearer"
                    + " eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ0ZXN0QXBpS2V5IiwiYm9keUhhc2giOiJlM2IwYzQ0Mjk4ZmMxYzE0OWFmYmY0Yzg5OTZmYjkyNDI3YWU0MWU0NjQ5YjkzNGNhNDk1OTkxYjc4NTJiODU1IiwiZXhwIjoxNzExMDI3MDM3LCJ1cmkiOiIiLCJub25jZSI6IjEyM2U0NTY3LWU4OWItMTJkMy1hNDU2LTQyNjYxNDE3NDAwMCIsImlhdCI6MTcxMTAyNjk4Mn0.WGr-S5VVekZKFnx7ThzrdXeUm3YETzkP5oNa7QZUJcPN7Pm7j8ZQWGMlXL6bAQBuMUE7zBzMf_5iEUXOTa4iSseQaFR4ILzY5Rbi8Ps9EMGq--QaWFwWDoiE5qUcuU20gcALOY9L1cZtZPGFH-rcWrg1L99hFC3977pHu524IjBqXBELuxT1t3le4FcAS0mqcgi3XsLzOBCjSKNiWaqX1mRhTQgmvLCSJhcMMnGns-NERPvtQsMukRvYYErhx7RoTBv96Z1djsg2wrhKGqFmJyxWKVLA06k-XwAvXjJbIm1kl0S7KCXQdFpXzYLJH0OLXGMeQhhlz59d6WfivXd5Y7oKVGIke4AtImcUtzAht_bwG22IDY3UBNq1SEwe1-K_iW7Fh5UQy-4m62s5u38R-CDfV7q0oBAxLRB8sbH1zAm8bDU8kIyR8k7N9L_gWTF6hSVMnVP6QrScAhmVKgv1mFI2BySqBeKY6TdDIvBFHqSPL0F1fABz_tT7L3RZt_4GJnWfJXPr9ERlXbVTj2q1dEdgMscPFc6PfRRXzYSQRH10xbSOpvmi1ldx3wnjOeYJsDlLCG8kwSZExrIPXYNXme_2c6GYGoXpTwME2IfQhPtIPQcWBMMnP1z5UAUdx1SYLXafWYAiYKF7G8a91S07hEgmhT4nS2ZlBgGzb0dcsNE";
        runAndVerifyAuthorizationValue(requestBuilder, expectedAuthorizationValue);
    }

    @Test
    public void testAuthorizationValueWithBody() {
        HttpRequest.Builder requestBuilder =
                HttpRequest.newBuilder()
                        .uri(URI.create("http://localhost"))
                        .POST(HttpRequest.BodyPublishers.ofString("request body"));
        String expectedAuthorizationValue =
                "Bearer"
                    + " eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ0ZXN0QXBpS2V5IiwiYm9keUhhc2giOiI3ZjA3YzhiN2VhZGM3M2YyNzU1YzYwZWZiMWQ5ZDdhYzBmMDk0ZGQ3YzFkYmEzMDY5ZDNiZTAyMTRiZTEwZmI2IiwiZXhwIjoxNzExMDI3MDM3LCJ1cmkiOiIiLCJub25jZSI6IjEyM2U0NTY3LWU4OWItMTJkMy1hNDU2LTQyNjYxNDE3NDAwMCIsImlhdCI6MTcxMTAyNjk4Mn0.nW_ce87OPxWC4iqjrSjwaIXNLwrE8EAHYQE5fMM2V1iagmCEoalh0UdfNJOPZqv8-YHxBXOIPusY8l148rpjbfYN4a9Ru-PUWUmPybANyXEVkVutcE04d8SfAN_z2gpHRqfIJiz7NXtpIp5QUVuAh0Akrj4PeYG5Ctw74wh2XW8k5q12kD56mVUEmuDMDBAlckOpCHXpHqhFfDR92SoiqQjD62c1uQi1GExNfeu5WYPfjk8y5WXbhuL2MzYNarc4lt2O5gY-AgK63Z7ge0sPix1CilNwpNI6_hisvpdOjr3CqUANsS7Q_Sn0AoMnlA-1hicDk3gd1M3FEwU_SxNRzFAmyaDEnXGY-AvCKKvgwlDsEcootwVRlLNcNKVo0l_vpJMczDlY0-s4p4v4R-Rlqs-irDOuV1T_kGV3Gv-3d922mgktfpqIwITIIfP9_TsbXK_RhHsGWdE1wniFIpbQRFODpvIPLgn44iCwpN-vDBD_4YwLr4AvNXuPs4Vt_OAwaMJ6TDwg-lGYI_nT3KGBBJT0dRyMYGY9VWsKWDFILt7Wp38siHoVuSgCwKky8654PBcDtiYg2QwnasT2wTymu10TNbfzmopx9WkGjsq1jepORD9mt-tiaxRwZpZnZzSgIerdl3VW72AbD3pzF79jdJP6FrClJJA3ktkyeW_SPz0";
        runAndVerifyAuthorizationValue(requestBuilder, expectedAuthorizationValue);
    }

    @Test
    public void testAuthorizationValueWithBodyAndQueryParams() {
        HttpRequest.Builder requestBuilder =
                HttpRequest.newBuilder()
                        .uri(URI.create("http://localhost?queryParam1=value1&queryParam2=value2"))
                        .POST(
                                HttpRequest.BodyPublishers.ofString(
                                        "{\"param1\":\"value1\", \"param2\":\"value2\"}"));
        String expectedAuthorizationValue =
                "Bearer"
                    + " eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJ0ZXN0QXBpS2V5IiwiYm9keUhhc2giOiJjYjU3OWU5ODdmMDNhZjIyMDE5NWNhZDhjNGMxOTVmNWY5NTYzZjE0ZTZlMjgxYTljNTM2M2Q0ZGYzMzhkNzZjIiwiZXhwIjoxNzExMDI3MDM3LCJ1cmkiOiI_cXVlcnlQYXJhbTE9dmFsdWUxJnF1ZXJ5UGFyYW0yPXZhbHVlMiIsIm5vbmNlIjoiMTIzZTQ1NjctZTg5Yi0xMmQzLWE0NTYtNDI2NjE0MTc0MDAwIiwiaWF0IjoxNzExMDI2OTgyfQ.Os2X3BfG2I0FU3jSqKQPxToW1uuZB1bvroCGFIDXolxzZ0tqZ3xN_Vw2jJ26QofWhZKnTR0AzjsEPxjIp_BMJBzbvO24enBZzOvYHeOh-7iUrbZm1VDzLiE2ANzP7HXdFSkwadKIlx0yu9lP3DH8fewQMq7NYev4XHc2m95MTEKYz8NBAYvWq_52HcRgyx9ON1BFXVCKuFpZDuyFvkfgfhVz2sOlhHxMLBQQ_eVdjjn7OnNFNquTs2ydIhLDZ8j8pQd3fH2AuvN-0VqmwZNf-xMkfgciEQWApzeJnpouiA5We5N3rSzCki3QuThp3fkbN6hPbgQz4pKyRX34xxrAEbqOigQ4ii7B14qIwQgrh6mLNgC5jAkI9n7M0uR2uP5oSRQ53Nv0jdvvxZUirxOkTuPv9MuHe15ObOBqbQC6_cjZAnFh4AT3xWfqDqG4Cze8tdJD6tdpXJdorpsgXM72Y4mH71lwB0070s9kQT7RSHjuHSaoZg1bqkUZDmY5LMQtOS9g_4sCl3ZiqqhFz92Q6zHCjO9joi9K8JxVvfjcdZnKn28P6ubAWETnJg4Df8vqCqZYLPGohz2vv4I-IKuV7ISs3-hN8Pkc6IMRdc2guUZwsk1ztnd4M17f7FiyaIAHgZlbbAPniatu3DdMO9S3p5h4EYx1TyGQdoSmmzs0GWk";
        runAndVerifyAuthorizationValue(requestBuilder, expectedAuthorizationValue);
    }

    @Test
    public void testGetApiUserApi() {
        setupFireblocks(true, null, null);
        ApiUserApi apiUser = fireblocks.apiUser();
        Assert.assertNotNull(apiUser);
        Assert.assertSame(apiUser, fireblocks.apiUser());
    }

    @Test
    public void testGetAssetsApi() {
        setupFireblocks(true, null, null);
        AssetsApi assets = fireblocks.assets();
        Assert.assertNotNull(assets);
        Assert.assertSame(assets, fireblocks.assets());
    }

    @Test
    public void testGetAuditLogsApi() {
        setupFireblocks(true, null, null);
        AuditLogsApi auditLogs = fireblocks.auditLogs();
        Assert.assertNotNull(auditLogs);
        Assert.assertSame(auditLogs, fireblocks.auditLogs());
    }

    @Test
    public void testGetBlockchainsAssetsApi() {
        setupFireblocks(true, null, null);
        BlockchainsAssetsApi blockchainsAssets = fireblocks.blockchainsAssets();
        Assert.assertNotNull(blockchainsAssets);
        Assert.assertSame(blockchainsAssets, fireblocks.blockchainsAssets());
    }

    @Test
    public void testGetComplianceApi() {
        setupFireblocks(true, null, null);
        ComplianceApi compliance = fireblocks.compliance();
        Assert.assertNotNull(compliance);
        Assert.assertSame(compliance, fireblocks.compliance());
    }

    @Test
    public void testGetComplianceScreeningConfigurationApi() {
        setupFireblocks(true, null, null);
        ComplianceScreeningConfigurationApi complianceScreeningConfiguration =
                fireblocks.complianceScreeningConfiguration();
        Assert.assertNotNull(complianceScreeningConfiguration);
        Assert.assertSame(
                complianceScreeningConfiguration, fireblocks.complianceScreeningConfiguration());
    }

    @Test
    public void testGetConsoleUserApi() {
        setupFireblocks(true, null, null);
        ConsoleUserApi consoleUser = fireblocks.consoleUser();
        Assert.assertNotNull(consoleUser);
        Assert.assertSame(consoleUser, fireblocks.consoleUser());
    }

    @Test
    public void testGetContractsApi() {
        setupFireblocks(true, null, null);
        ContractsApi contracts = fireblocks.contracts();
        Assert.assertNotNull(contracts);
        Assert.assertSame(contracts, fireblocks.contracts());
    }

    @Test
    public void testGetCosignersBetaApi() {
        setupFireblocks(true, null, null);
        CosignersBetaApi cosignersBeta = fireblocks.cosignersBeta();
        Assert.assertNotNull(cosignersBeta);
        Assert.assertSame(cosignersBeta, fireblocks.cosignersBeta());
    }

    @Test
    public void testGetExchangeAccountsApi() {
        setupFireblocks(true, null, null);
        ExchangeAccountsApi exchangeAccounts = fireblocks.exchangeAccounts();
        Assert.assertNotNull(exchangeAccounts);
        Assert.assertSame(exchangeAccounts, fireblocks.exchangeAccounts());
    }

    @Test
    public void testGetExternalWalletsApi() {
        setupFireblocks(true, null, null);
        ExternalWalletsApi externalWallets = fireblocks.externalWallets();
        Assert.assertNotNull(externalWallets);
        Assert.assertSame(externalWallets, fireblocks.externalWallets());
    }

    @Test
    public void testGetFiatAccountsApi() {
        setupFireblocks(true, null, null);
        FiatAccountsApi fiatAccounts = fireblocks.fiatAccounts();
        Assert.assertNotNull(fiatAccounts);
        Assert.assertSame(fiatAccounts, fireblocks.fiatAccounts());
    }

    @Test
    public void testGetGasStationsApi() {
        setupFireblocks(true, null, null);
        GasStationsApi gasStations = fireblocks.gasStations();
        Assert.assertNotNull(gasStations);
        Assert.assertSame(gasStations, fireblocks.gasStations());
    }

    @Test
    public void testGetInternalWalletsApi() {
        setupFireblocks(true, null, null);
        InternalWalletsApi internalWallets = fireblocks.internalWallets();
        Assert.assertNotNull(internalWallets);
        Assert.assertSame(internalWallets, fireblocks.internalWallets());
    }

    @Test
    public void testGetJobManagementApi() {
        setupFireblocks(true, null, null);
        JobManagementApi jobManagement = fireblocks.jobManagement();
        Assert.assertNotNull(jobManagement);
        Assert.assertSame(jobManagement, fireblocks.jobManagement());
    }

    @Test
    public void testGetNetworkConnectionsApi() {
        setupFireblocks(true, null, null);
        NetworkConnectionsApi networkConnections = fireblocks.networkConnections();
        Assert.assertNotNull(networkConnections);
        Assert.assertSame(networkConnections, fireblocks.networkConnections());
    }

    @Test
    public void testGetNftsApi() {
        setupFireblocks(true, null, null);
        NftsApi nfts = fireblocks.nfts();
        Assert.assertNotNull(nfts);
        Assert.assertSame(nfts, fireblocks.nfts());
    }

    @Test
    public void testGetOffExchangesApi() {
        setupFireblocks(true, null, null);
        OffExchangesApi offExchanges = fireblocks.offExchanges();
        Assert.assertNotNull(offExchanges);
        Assert.assertSame(offExchanges, fireblocks.offExchanges());
    }

    @Test
    public void testGetOtaBetaApi() {
        setupFireblocks(true, null, null);
        OtaBetaApi otaBeta = fireblocks.otaBeta();
        Assert.assertNotNull(otaBeta);
        Assert.assertSame(otaBeta, fireblocks.otaBeta());
    }

    @Test
    public void testGetPaymentsPayoutApi() {
        setupFireblocks(true, null, null);
        PaymentsPayoutApi paymentsPayout = fireblocks.paymentsPayout();
        Assert.assertNotNull(paymentsPayout);
        Assert.assertSame(paymentsPayout, fireblocks.paymentsPayout());
    }

    @Test
    public void testGetPolicyEditorBetaApi() {
        setupFireblocks(true, null, null);
        PolicyEditorBetaApi policyEditorBeta = fireblocks.policyEditorBeta();
        Assert.assertNotNull(policyEditorBeta);
        Assert.assertSame(policyEditorBeta, fireblocks.policyEditorBeta());
    }

    @Test
    public void testGetResetDeviceApi() {
        setupFireblocks(true, null, null);
        ResetDeviceApi resetDevice = fireblocks.resetDevice();
        Assert.assertNotNull(resetDevice);
        Assert.assertSame(resetDevice, fireblocks.resetDevice());
    }

    @Test
    public void testGetSmartTransferApi() {
        setupFireblocks(true, null, null);
        SmartTransferApi smartTransfer = fireblocks.smartTransfer();
        Assert.assertNotNull(smartTransfer);
        Assert.assertSame(smartTransfer, fireblocks.smartTransfer());
    }

    @Test
    public void testGetStakingBetaApi() {
        setupFireblocks(true, null, null);
        StakingBetaApi stakingBeta = fireblocks.stakingBeta();
        Assert.assertNotNull(stakingBeta);
        Assert.assertSame(stakingBeta, fireblocks.stakingBeta());
    }

    @Test
    public void testGetTransactionsApi() {
        setupFireblocks(true, null, null);
        TransactionsApi transactions = fireblocks.transactions();
        Assert.assertNotNull(transactions);
        Assert.assertSame(transactions, fireblocks.transactions());
    }

    @Test
    public void testGetTravelRuleBetaApi() {
        setupFireblocks(true, null, null);
        TravelRuleBetaApi travelRuleBeta = fireblocks.travelRuleBeta();
        Assert.assertNotNull(travelRuleBeta);
        Assert.assertSame(travelRuleBeta, fireblocks.travelRuleBeta());
    }

    @Test
    public void testGetUserGroupsBetaApi() {
        setupFireblocks(true, null, null);
        UserGroupsBetaApi userGroupsBeta = fireblocks.userGroupsBeta();
        Assert.assertNotNull(userGroupsBeta);
        Assert.assertSame(userGroupsBeta, fireblocks.userGroupsBeta());
    }

    @Test
    public void testGetUsersApi() {
        setupFireblocks(true, null, null);
        UsersApi users = fireblocks.users();
        Assert.assertNotNull(users);
        Assert.assertSame(users, fireblocks.users());
    }

    @Test
    public void testGetVaultsApi() {
        setupFireblocks(true, null, null);
        VaultsApi vaults = fireblocks.vaults();
        Assert.assertNotNull(vaults);
        Assert.assertSame(vaults, fireblocks.vaults());
    }

    @Test
    public void testGetWeb3ConnectionsApi() {
        setupFireblocks(true, null, null);
        Web3ConnectionsApi web3Connections = fireblocks.web3Connections();
        Assert.assertNotNull(web3Connections);
        Assert.assertSame(web3Connections, fireblocks.web3Connections());
    }

    @Test
    public void testGetWebhooksApi() {
        setupFireblocks(true, null, null);
        WebhooksApi webhooks = fireblocks.webhooks();
        Assert.assertNotNull(webhooks);
        Assert.assertSame(webhooks, fireblocks.webhooks());
    }

    @Test
    public void testGetWhitelistIpAddressesApi() {
        setupFireblocks(true, null, null);
        WhitelistIpAddressesApi whitelistIpAddresses = fireblocks.whitelistIpAddresses();
        Assert.assertNotNull(whitelistIpAddresses);
        Assert.assertSame(whitelistIpAddresses, fireblocks.whitelistIpAddresses());
    }

    @Test
    public void testGetWorkspaceStatusBetaApi() {
        setupFireblocks(true, null, null);
        WorkspaceStatusBetaApi workspaceStatusBeta = fireblocks.workspaceStatusBeta();
        Assert.assertNotNull(workspaceStatusBeta);
        Assert.assertSame(workspaceStatusBeta, fireblocks.workspaceStatusBeta());
    }
}
