# BlockchainsAssetsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAsset**](BlockchainsAssetsApi.md#getAsset) | **GET** /assets/{id} | Get an asset |
| [**getBlockchain**](BlockchainsAssetsApi.md#getBlockchain) | **GET** /blockchains/{id} | Get an blockchain |
| [**getSupportedAssets**](BlockchainsAssetsApi.md#getSupportedAssets) | **GET** /supported_assets | List all asset types supported by Fireblocks - legacy endpoint |
| [**listAssets**](BlockchainsAssetsApi.md#listAssets) | **GET** /assets | List assets |
| [**listBlockchains**](BlockchainsAssetsApi.md#listBlockchains) | **GET** /blockchains | List blockchains |
| [**registerNewAsset**](BlockchainsAssetsApi.md#registerNewAsset) | **POST** /assets | Register an asset |
| [**setAssetPrice**](BlockchainsAssetsApi.md#setAssetPrice) | **POST** /assets/prices/{id} | Set asset price |
| [**updateAssetUserMetadata**](BlockchainsAssetsApi.md#updateAssetUserMetadata) | **PATCH** /assets/{id} | Update the user’s metadata for an asset |



## getAsset

> CompletableFuture<ApiResponse<Asset>> getAsset getAsset(id, idempotencyKey)

Get an asset

Returns an asset by ID or legacyID.&lt;/br&gt;  **Note**:    - We will continue displaying and supporting the legacy ID (API ID). Since not all Fireblocks services fully support the new Assets UUID, please use only the legacy ID until further notice. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsApi;
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
            CompletableFuture<ApiResponse<Asset>> response = fireblocks.blockchainsAssets().getAsset(id, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsApi#getAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsApi#getAsset");
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

CompletableFuture<ApiResponse<[**Asset**](Asset.md)>>


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


## getBlockchain

> CompletableFuture<ApiResponse<BlockchainResponse>> getBlockchain getBlockchain(id)

Get an blockchain

Returns an blockchain by ID or legacyID. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsApi;
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
            CompletableFuture<ApiResponse<BlockchainResponse>> response = fireblocks.blockchainsAssets().getBlockchain(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsApi#getBlockchain");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsApi#getBlockchain");
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


## getSupportedAssets

> CompletableFuture<ApiResponse<List<AssetTypeResponse>>> getSupportedAssets getSupportedAssets()

List all asset types supported by Fireblocks - legacy endpoint

Legacy Endpoint – Retrieves all assets supported by Fireblocks in your workspace without extended information.&lt;/br&gt; **Note**:    - This endpoint will remain available for the foreseeable future and is not deprecated.&lt;/br&gt;   - The &#x60;listAssets&#x60; endpoint provides more detailed asset information and improved performance.&lt;/br&gt;   - We recommend transitioning to the &#x60;listAssets&#x60; endpoint for better results. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<List<AssetTypeResponse>>> response = fireblocks.blockchainsAssets().getSupportedAssets();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsApi#getSupportedAssets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsApi#getSupportedAssets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**List&lt;AssetTypeResponse&gt;**](AssetTypeResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listAssets

> CompletableFuture<ApiResponse<ListAssetsResponse>> listAssets listAssets(blockchainId, assetClass, symbol, scope, deprecated, ids, pageCursor, pageSize, idempotencyKey)

List assets

Retrieves all assets supported by Fireblocks in your workspace, providing extended information and enhanced performance compared to the legacy &#x60;supported_assets&#x60; endpoint.&lt;/br&gt; **Note**:    - We will continue displaying and supporting the legacy ID (API ID). Since not all Fireblocks services fully support the new Assets UUID, please use only the legacy ID until further notice.&lt;/br&gt; 

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
import com.fireblocks.sdk.api.BlockchainsAssetsApi;
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
        AssetClass assetClass = AssetClass.fromValue("NATIVE"); // AssetClass | Assets class
        String symbol = "ETH"; // String | Assets onchain symbol
        AssetScope scope = AssetScope.fromValue("GLOBAL"); // AssetScope | Scope of the assets
        Boolean deprecated = false; // Boolean | Are assets deprecated
        List<String> ids = Arrays.asList(); // List<String> | A list of asset IDs (max 100)
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Next page cursor to fetch
        BigDecimal pageSize = new BigDecimal("500"); // BigDecimal | Items per page
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ListAssetsResponse>> response = fireblocks.blockchainsAssets().listAssets(blockchainId, assetClass, symbol, scope, deprecated, ids, pageCursor, pageSize, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsApi#listAssets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsApi#listAssets");
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
| **assetClass** | [**AssetClass**](.md)| Assets class | [optional] [enum: NATIVE, FT, FIAT, NFT, SFT] |
| **symbol** | **String**| Assets onchain symbol | [optional] |
| **scope** | [**AssetScope**](.md)| Scope of the assets | [optional] [enum: GLOBAL, LOCAL] |
| **deprecated** | **Boolean**| Are assets deprecated | [optional] |
| **ids** | [**List&lt;String&gt;**](String.md)| A list of asset IDs (max 100) | [optional] |
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

> CompletableFuture<ApiResponse<ListBlockchainsResponse>> listBlockchains listBlockchains(protocol, deprecated, test, ids, pageCursor, pageSize)

List blockchains

Returns all blockchains supported by Fireblocks. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsApi;
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
        List<String> ids = Arrays.asList(); // List<String> | A list of blockchain IDs (max 100)
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal("500"); // BigDecimal | Items per page (max 500)
        try {
            CompletableFuture<ApiResponse<ListBlockchainsResponse>> response = fireblocks.blockchainsAssets().listBlockchains(protocol, deprecated, test, ids, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsApi#listBlockchains");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsApi#listBlockchains");
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
| **ids** | [**List&lt;String&gt;**](String.md)| A list of blockchain IDs (max 100) | [optional] |
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


## registerNewAsset

> CompletableFuture<ApiResponse<AssetResponse>> registerNewAsset registerNewAsset(registerNewAssetRequest, idempotencyKey)

Register an asset

Register a new asset to a workspace and return the newly created asset&#39;s details. Currently supported chains are: - EVM based chains - Stellar - Algorand - TRON - NEAR - Solana 

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
import com.fireblocks.sdk.api.BlockchainsAssetsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        RegisterNewAssetRequest registerNewAssetRequest = new RegisterNewAssetRequest(); // RegisterNewAssetRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AssetResponse>> response = fireblocks.blockchainsAssets().registerNewAsset(registerNewAssetRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsApi#registerNewAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsApi#registerNewAsset");
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
| **registerNewAssetRequest** | [**RegisterNewAssetRequest**](RegisterNewAssetRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AssetResponse**](AssetResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A new asset has been created successfully |  -  |
| **400** | - Listing an asset on the requested blockchain is not supported. Error code: 1000  - The asset address is invalid. Error code: 1003  - Self serve listing an asset on the requested blockchain is currently not supported, please contact support. Error code: 1004  - Blockchain is deprecated. Error code: 1006  - The asset&#39;s standard is not supported. Error code: 1007  - Unable to get expected metadata: decimals | name | symbol. Error code: 1010  |  -  |
| **403** | - The asset creation quota reached. Error code: 1005  - Tenant is not allowed to create testnet assets. Error code: 1008  - Tenant is not allowed to create mainnet assets. Error code: 1009  |  -  |
| **404** | - Invalid address, could not get asset information. Error code 1003  |  -  |
| **409** | - The asset is already supported globally. Error code: 1001  - The asset has already been added to this workspace. Error code: 1002  |  -  |
| **500** | Failed to create asset |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setAssetPrice

> CompletableFuture<ApiResponse<AssetPriceResponse>> setAssetPrice setAssetPrice(id, setAssetPriceRequest, idempotencyKey)

Set asset price

Set asset price for the given asset id. Returns the asset price response. 

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
import com.fireblocks.sdk.api.BlockchainsAssetsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "ETH"; // String | The ID of the asset
        SetAssetPriceRequest setAssetPriceRequest = new SetAssetPriceRequest(); // SetAssetPriceRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AssetPriceResponse>> response = fireblocks.blockchainsAssets().setAssetPrice(id, setAssetPriceRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsApi#setAssetPrice");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsApi#setAssetPrice");
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
| **id** | **String**| The ID of the asset | |
| **setAssetPriceRequest** | [**SetAssetPriceRequest**](SetAssetPriceRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AssetPriceResponse**](AssetPriceResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Asset price has been set successfully. |  -  |
| **403** | - Tenant is not allowed to set rate. Error code: 1002.  |  -  |
| **404** | - Currency not found. Error code 1001  |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateAssetUserMetadata

> CompletableFuture<ApiResponse<Asset>> updateAssetUserMetadata updateAssetUserMetadata(id, updateAssetUserMetadataRequest, idempotencyKey)

Update the user’s metadata for an asset

Update the user’s metadata for an asset.  Endpoint Permission: Owner, Admin, Non-Signing Admin, NCW Admin, Signer, Editor.

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
import com.fireblocks.sdk.api.BlockchainsAssetsApi;
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
        UpdateAssetUserMetadataRequest updateAssetUserMetadataRequest = new UpdateAssetUserMetadataRequest(); // UpdateAssetUserMetadataRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Asset>> response = fireblocks.blockchainsAssets().updateAssetUserMetadata(id, updateAssetUserMetadataRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainsAssetsApi#updateAssetUserMetadata");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockchainsAssetsApi#updateAssetUserMetadata");
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
| **updateAssetUserMetadataRequest** | [**UpdateAssetUserMetadataRequest**](UpdateAssetUserMetadataRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**Asset**](Asset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated asset user metadata |  * X-Request-ID -  <br>  |
| **404** | - Asset with specified ID or legacy ID is not found. Error code 1504  |  -  |
| **500** | Error occurred while updating asset user metadata |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

