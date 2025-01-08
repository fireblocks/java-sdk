# BlockchainsAssetsBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssetById**](BlockchainsAssetsBetaApi.md#getAssetById) | **GET** /assets/{id} | Get an asset |
| [**getBlockchainById**](BlockchainsAssetsBetaApi.md#getBlockchainById) | **GET** /blockchains/{id} | Get an blockchain |
| [**listAssets**](BlockchainsAssetsBetaApi.md#listAssets) | **GET** /assets | List assets |
| [**listBlockchains**](BlockchainsAssetsBetaApi.md#listBlockchains) | **GET** /blockchains | List blockchains |



## getAssetById

> CompletableFuture<ApiResponse<AssetResponseBeta>> getAssetById getAssetById(id, idempotencyKey)

Get an asset

Returns an asset by ID or legacyID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "ETH"; // String | The ID or legacyId of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AssetResponseBeta>> response = fireblocks.blockchainsAssetsBeta().getAssetById(id, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsBetaApi#getAssetById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsBetaApi#getAssetById");
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
| **id** | **String**| The ID or legacyId of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AssetResponseBeta**](AssetResponseBeta.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Asset with requested identification |  * X-Request-ID -  <br>  |
| **404** | - Asset with specified ID or legacy ID is not found. Error code 1504  |  -  |
| **500** | Error occurred while getting an asset |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getBlockchainById

> CompletableFuture<ApiResponse<BlockchainResponse>> getBlockchainById getBlockchainById(id)

Get an blockchain

Returns an blockchain by ID or legacyID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "ETH"; // String | The ID or legacyId of the blockchain
        try {
            CompletableFuture<ApiResponse<BlockchainResponse>> response = fireblocks.blockchainsAssetsBeta().getBlockchainById(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsBetaApi#getBlockchainById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsBetaApi#getBlockchainById");
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
| **id** | **String**| The ID or legacyId of the blockchain | |

### Return type

CompletableFuture<ApiResponse<[**BlockchainResponse**](BlockchainResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Blockchain with requested identification |  * X-Request-ID -  <br>  |
| **404** | - Blockchain with specified ID or legacy ID is not found. Error code 1505  |  -  |
| **500** | Error occurred while getting an blockchain |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listAssets

> CompletableFuture<ApiResponse<ListAssetsResponse>> listAssets listAssets(blockchainId, assetClass, symbol, scope, deprecated, pageCursor, pageSize, idempotencyKey)

List assets

Returns all asset type supported by Fireblocks.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String blockchainId = "0f672204-a28b-464a-b318-a387abd3d3c7"; // String | Blockchain id of the assets
        AssetClassBeta assetClass = AssetClassBeta.fromValue("NATIVE"); // AssetClassBeta | Assets class
        String symbol = "ETH"; // String | Assets onchain symbol
        String scope = "Global"; // String | Scope of the assets
        Boolean deprecated = false; // Boolean | Are assets deprecated
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Next page cursor to fetch
        BigDecimal pageSize = new BigDecimal("500"); // BigDecimal | Items per page
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ListAssetsResponse>> response = fireblocks.blockchainsAssetsBeta().listAssets(blockchainId, assetClass, symbol, scope, deprecated, pageCursor, pageSize, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsBetaApi#listAssets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsBetaApi#listAssets");
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
| **blockchainId** | **String**| Blockchain id of the assets | [optional] |
| **assetClass** | [**AssetClassBeta**](.md)| Assets class | [optional] [enum: NATIVE, FT, FIAT, NFT, SFT] |
| **symbol** | **String**| Assets onchain symbol | [optional] |
| **scope** | **String**| Scope of the assets | [optional] [enum: Global, Local] |
| **deprecated** | **Boolean**| Are assets deprecated | [optional] |
| **pageCursor** | **String**| Next page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page | [optional] [default to 500] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ListAssetsResponse**](ListAssetsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of assets |  -  |
| **500** | Error occurred while listing assets |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listBlockchains

> CompletableFuture<ApiResponse<ListBlockchainsResponse>> listBlockchains listBlockchains(protocol, deprecated, test, pageCursor, pageSize)

List blockchains

Returns all blockchains supported by Fireblocks.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String protocol = "SOL"; // String | Blockchain protocol
        Boolean deprecated = false; // Boolean | Is blockchain deprecated
        Boolean test = false; // Boolean | Is test blockchain
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal("500"); // BigDecimal | Items per page (max 500)
        try {
            CompletableFuture<ApiResponse<ListBlockchainsResponse>> response = fireblocks.blockchainsAssetsBeta().listBlockchains(protocol, deprecated, test, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsBetaApi#listBlockchains");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsBetaApi#listBlockchains");
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
| **protocol** | **String**| Blockchain protocol | [optional] |
| **deprecated** | **Boolean**| Is blockchain deprecated | [optional] |
| **test** | **Boolean**| Is test blockchain | [optional] |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 500) | [optional] [default to 500] |

### Return type

CompletableFuture<ApiResponse<[**ListBlockchainsResponse**](ListBlockchainsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of supported blockchains |  -  |
| **500** | Error occurred while listing blockchains |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

