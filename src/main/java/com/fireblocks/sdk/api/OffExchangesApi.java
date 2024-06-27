/*
 * Fireblocks API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.6.2
 * Contact: support@fireblocks.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.fireblocks.sdk.api;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Pair;
import com.fireblocks.sdk.ValidationUtils;
import com.fireblocks.sdk.model.AddCollateralRequestBody;
import com.fireblocks.sdk.model.CreateTransactionResponse;
import com.fireblocks.sdk.model.ExchangeAccount;
import com.fireblocks.sdk.model.ExchangeSettlementTransactionsResponse;
import com.fireblocks.sdk.model.RemoveCollateralRequestBody;
import com.fireblocks.sdk.model.SettlementRequestBody;
import com.fireblocks.sdk.model.SettlementResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OffExchangesApi {
    private final HttpClient memberVarHttpClient;
    private final ObjectMapper memberVarObjectMapper;
    private final String memberVarBaseUri;
    private final Consumer<HttpRequest.Builder> memberVarInterceptor;
    private final Duration memberVarReadTimeout;
    private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
    private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

    public OffExchangesApi() {
        this(new ApiClient());
    }

    public OffExchangesApi(ApiClient apiClient) {
        memberVarHttpClient = apiClient.getHttpClient();
        memberVarObjectMapper = apiClient.getObjectMapper();
        memberVarBaseUri = apiClient.getBaseUri();
        memberVarInterceptor = apiClient.getRequestInterceptor();
        memberVarReadTimeout = apiClient.getReadTimeout();
        memberVarResponseInterceptor = apiClient.getResponseInterceptor();
        memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
    }

    private ApiException getApiException(String operationId, HttpResponse<String> response) {
        String message =
                formatExceptionMessage(operationId, response.statusCode(), response.body());
        return new ApiException(
                response.statusCode(), message, response.headers(), response.body());
    }

    private String formatExceptionMessage(String operationId, int statusCode, String body) {
        if (body == null || body.isEmpty()) {
            body = "[no body]";
        }
        return operationId + " call failed with: " + statusCode + " - " + body;
    }

    /**
     * add collateral add collateral, create deposit request
     *
     * @param addCollateralRequestBody (optional)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;CreateTransactionResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<CreateTransactionResponse>> addOffExchange(
            AddCollateralRequestBody addCollateralRequestBody, String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    addOffExchangeRequestBuilder(addCollateralRequestBody, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("addOffExchange", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<CreateTransactionResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            CreateTransactionResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder addOffExchangeRequestBuilder(
            AddCollateralRequestBody addCollateralRequestBody, String idempotencyKey)
            throws ApiException {

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/off_exchange/add";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(addCollateralRequestBody);
            localVarRequestBuilder.method(
                    "POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
        } catch (IOException e) {
            throw new ApiException(e);
        }
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * Find a specific collateral exchange account Returns a collateral account by
     * mainExchangeAccountId.
     *
     * @param mainExchangeAccountId The id of the main exchange account for which the requested
     *     collateral account is associated with (required)
     * @return CompletableFuture&lt;ApiResponse&lt;ExchangeAccount&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<ExchangeAccount>> getOffExchangeCollateralAccounts(
            String mainExchangeAccountId) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getOffExchangeCollateralAccountsRequestBuilder(mainExchangeAccountId);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException(
                                                    "getOffExchangeCollateralAccounts",
                                                    localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<ExchangeAccount>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            ExchangeAccount>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getOffExchangeCollateralAccountsRequestBuilder(
            String mainExchangeAccountId) throws ApiException {
        ValidationUtils.assertParamExistsAndNotEmpty(
                "getOffExchangeCollateralAccounts", "mainExchangeAccountId", mainExchangeAccountId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/off_exchange/collateral_accounts/{mainExchangeAccountId}"
                        .replace(
                                "{mainExchangeAccountId}",
                                ApiClient.urlEncode(mainExchangeAccountId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        localVarRequestBuilder.header("Accept", "application/json");

        localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * get settlements transactions from exchange get settlements transactions from exchange
     *
     * @param mainExchangeAccountId (required)
     * @return CompletableFuture&lt;ApiResponse&lt;ExchangeSettlementTransactionsResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<ExchangeSettlementTransactionsResponse>>
            getOffExchangeSettlementTransactions(String mainExchangeAccountId) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getOffExchangeSettlementTransactionsRequestBuilder(mainExchangeAccountId);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException(
                                                    "getOffExchangeSettlementTransactions",
                                                    localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<ExchangeSettlementTransactionsResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            ExchangeSettlementTransactionsResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getOffExchangeSettlementTransactionsRequestBuilder(
            String mainExchangeAccountId) throws ApiException {
        ValidationUtils.assertParamExistsAndNotEmpty(
                "getOffExchangeSettlementTransactions",
                "mainExchangeAccountId",
                mainExchangeAccountId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/off_exchange/settlements/transactions";

        List<Pair> localVarQueryParams = new ArrayList<>();
        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        localVarQueryParameterBaseName = "mainExchangeAccountId";
        localVarQueryParams.addAll(
                ApiClient.parameterToPairs("mainExchangeAccountId", mainExchangeAccountId));

        if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
            StringJoiner queryJoiner = new StringJoiner("&");
            localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
            if (localVarQueryStringJoiner.length() != 0) {
                queryJoiner.add(localVarQueryStringJoiner.toString());
            }
            localVarRequestBuilder.uri(
                    URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
        } else {
            localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
        }

        localVarRequestBuilder.header("Accept", "application/json");

        localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * remove collateral remove collateral, create withdraw request
     *
     * @param removeCollateralRequestBody (optional)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;CreateTransactionResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<CreateTransactionResponse>> removeOffExchange(
            RemoveCollateralRequestBody removeCollateralRequestBody, String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    removeOffExchangeRequestBuilder(removeCollateralRequestBody, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("removeOffExchange", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<CreateTransactionResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            CreateTransactionResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder removeOffExchangeRequestBuilder(
            RemoveCollateralRequestBody removeCollateralRequestBody, String idempotencyKey)
            throws ApiException {

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/off_exchange/remove";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(removeCollateralRequestBody);
            localVarRequestBuilder.method(
                    "POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
        } catch (IOException e) {
            throw new ApiException(e);
        }
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * create settlement for a trader create settlement for a trader
     *
     * @param settlementRequestBody (optional)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;SettlementResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<SettlementResponse>> settleOffExchangeTrades(
            SettlementRequestBody settlementRequestBody, String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    settleOffExchangeTradesRequestBuilder(settlementRequestBody, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException(
                                                    "settleOffExchangeTrades", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<SettlementResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            SettlementResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder settleOffExchangeTradesRequestBuilder(
            SettlementRequestBody settlementRequestBody, String idempotencyKey)
            throws ApiException {

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/off_exchange/settlements/trader";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(settlementRequestBody);
            localVarRequestBuilder.method(
                    "POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
        } catch (IOException e) {
            throw new ApiException(e);
        }
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
}
