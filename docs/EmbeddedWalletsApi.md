# EmbeddedWalletsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPublicKeyInfoForAddressNcw**](EmbeddedWalletsApi.md#getPublicKeyInfoForAddressNcw) | **GET** /ncw/{walletId}/accounts/{accountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key of an asset |
| [**getPublicKeyInfoNcw**](EmbeddedWalletsApi.md#getPublicKeyInfoNcw) | **GET** /ncw/{walletId}/public_key_info | Get the public key for a derivation path |



## getPublicKeyInfoForAddressNcw

> CompletableFuture<ApiResponse<PublicKeyInformation>> getPublicKeyInfoForAddressNcw getPublicKeyInfoForAddressNcw(walletId, accountId, assetId, change, addressIndex, compressed)

Get the public key of an asset

Gets the public key of an asset associated with a specific account within a Non-Custodial Wallet

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.EmbeddedWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | The ID of the Non-Custodial wallet
        String accountId = "0"; // String | The ID of the account
        String assetId = "BTC"; // String | The ID of the asset
        BigDecimal change = new BigDecimal("0"); // BigDecimal | BIP44 derivation path - change value
        BigDecimal addressIndex = new BigDecimal("0"); // BigDecimal | BIP44 derivation path - index value
        Boolean compressed = true; // Boolean | Compressed/Uncompressed public key format
        try {
            CompletableFuture<ApiResponse<PublicKeyInformation>> response = fireblocks.embeddedWallets().getPublicKeyInfoForAddressNcw(walletId, accountId, assetId, change, addressIndex, compressed);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getPublicKeyInfoForAddressNcw");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getPublicKeyInfoForAddressNcw");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **String**| The ID of the Non-Custodial wallet | |
| **accountId** | **String**| The ID of the account | |
| **assetId** | **String**| The ID of the asset | |
| **change** | **BigDecimal**| BIP44 derivation path - change value | |
| **addressIndex** | **BigDecimal**| BIP44 derivation path - index value | |
| **compressed** | **Boolean**| Compressed/Uncompressed public key format | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PublicKeyInformation**](PublicKeyInformation.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public Key Information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getPublicKeyInfoNcw

> CompletableFuture<ApiResponse<PublicKeyInformation>> getPublicKeyInfoNcw getPublicKeyInfoNcw(walletId, derivationPath, algorithm, compressed)

Get the public key for a derivation path

Gets the public key information based on derivation path and signing algorithm within a Non-Custodial Wallet

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.EmbeddedWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | The ID of the Non-Custodial wallet
        String derivationPath = "[44,0,0,0,0]"; // String | An array of integers (passed as JSON stringified array) representing the full BIP44 derivation path of the requested public key.  The first element must always be 44. 
        String algorithm = "MPC_ECDSA_SECP256K1"; // String | Elliptic Curve
        Boolean compressed = true; // Boolean | 
        try {
            CompletableFuture<ApiResponse<PublicKeyInformation>> response = fireblocks.embeddedWallets().getPublicKeyInfoNcw(walletId, derivationPath, algorithm, compressed);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getPublicKeyInfoNcw");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getPublicKeyInfoNcw");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **String**| The ID of the Non-Custodial wallet | |
| **derivationPath** | **String**| An array of integers (passed as JSON stringified array) representing the full BIP44 derivation path of the requested public key.  The first element must always be 44.  | |
| **algorithm** | **String**| Elliptic Curve | [enum: MPC_ECDSA_SECP256K1, MPC_ECDSA_SECP256R1, MPC_EDDSA_ED25519] |
| **compressed** | **Boolean**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PublicKeyInformation**](PublicKeyInformation.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public key information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

