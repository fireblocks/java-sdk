# InternalWalletsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInternalWallet**](InternalWalletsApi.md#createInternalWallet) | **POST** /internal_wallets | Create an internal wallet |
| [**createInternalWalletAsset**](InternalWalletsApi.md#createInternalWalletAsset) | **POST** /internal_wallets/{walletId}/{assetId} | Add an asset to an internal wallet |
| [**deleteInternalWallet**](InternalWalletsApi.md#deleteInternalWallet) | **DELETE** /internal_wallets/{walletId} | Delete an internal wallet |
| [**deleteInternalWalletAsset**](InternalWalletsApi.md#deleteInternalWalletAsset) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address |
| [**getInternalWallet**](InternalWalletsApi.md#getInternalWallet) | **GET** /internal_wallets/{walletId} | Get an asset from an internal wallet |
| [**getInternalWalletAsset**](InternalWalletsApi.md#getInternalWalletAsset) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet |
| [**getInternalWalletAssetsPaginated**](InternalWalletsApi.md#getInternalWalletAssetsPaginated) | **GET** /internal_wallets/{walletId}/assets | List assets in an internal wallet (Paginated) |
| [**getInternalWallets**](InternalWalletsApi.md#getInternalWallets) | **GET** /internal_wallets | List internal wallets |
| [**setCustomerRefIdForInternalWallet**](InternalWalletsApi.md#setCustomerRefIdForInternalWallet) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet |



## createInternalWallet

> CompletableFuture<ApiResponse<UnmanagedWallet>> createInternalWallet createInternalWallet(createWalletRequest, idempotencyKey)

Create an internal wallet

Creates a new internal wallet with the requested name.  Learn more about Whitelisted Internal Addresses [here](https://developers.fireblocks.com/docs/whitelist-addresses#internal-wallets)  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateWalletRequest createWalletRequest = new CreateWalletRequest(); // CreateWalletRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UnmanagedWallet>> response = fireblocks.internalWallets().createInternalWallet(createWalletRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#createInternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#createInternalWallet");
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
| **createWalletRequest** | [**CreateWalletRequest**](CreateWalletRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**UnmanagedWallet**](UnmanagedWallet.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A new wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createInternalWalletAsset

> CompletableFuture<ApiResponse<WalletAsset>> createInternalWalletAsset createInternalWalletAsset(walletId, assetId, createInternalWalletAssetRequest, idempotencyKey)

Add an asset to an internal wallet

Adds an asset to an existing internal wallet.  Internal Wallets are whitelisted wallets that belong to you outside of Fireblocks.    - You can see the balance of the Internal Wallet via Fireblocks   - You cannot initiate transactions from Internal Wallets through Fireblocks    Learn more about Whitelisted Internal Addresses [here](https://developers.fireblocks.com/docs/whitelist-addresses#internal-wallets)  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to add
        CreateInternalWalletAssetRequest createInternalWalletAssetRequest = new CreateInternalWalletAssetRequest(); // CreateInternalWalletAssetRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<WalletAsset>> response = fireblocks.internalWallets().createInternalWalletAsset(walletId, assetId, createInternalWalletAssetRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#createInternalWalletAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#createInternalWalletAsset");
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
| **walletId** | **String**| The ID of the wallet | |
| **assetId** | **String**| The ID of the asset to add | |
| **createInternalWalletAssetRequest** | [**CreateInternalWalletAssetRequest**](CreateInternalWalletAssetRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**WalletAsset**](WalletAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteInternalWallet

> CompletableFuture<ApiResponse<Void>> deleteInternalWallet deleteInternalWallet(walletId)

Delete an internal wallet

Deletes an internal wallet by ID. Internal Wallets are whitelisted wallets that belong to you outside of Fireblocks.    - You can see the balance of the Internal Wallet via Fireblocks   - You cannot initiate transactions from Internal Wallets through Fireblocks  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String walletId = "walletId_example"; // String | The ID of the wallet to delete
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.internalWallets().deleteInternalWallet(walletId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#deleteInternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#deleteInternalWallet");
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
| **walletId** | **String**| The ID of the wallet to delete | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteInternalWalletAsset

> CompletableFuture<ApiResponse<Void>> deleteInternalWalletAsset deleteInternalWalletAsset(walletId, assetId)

Delete a whitelisted address

Deletes a whitelisted address (for an asset) from an internal wallet.  Internal Wallets are whitelisted wallets that belong to you outside of Fireblocks.    - You can see the balance of the Internal Wallet via Fireblocks   - You cannot initiate transactions from Internal Wallets through Fireblocks  Learn more about Whitelisted Internal Addresses [here](https://developers.fireblocks.com/docs/whitelist-addresses#internal-wallets)  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.internalWallets().deleteInternalWalletAsset(walletId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#deleteInternalWalletAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#deleteInternalWalletAsset");
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
| **walletId** | **String**| The ID of the wallet | |
| **assetId** | **String**| The ID of the asset to delete | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getInternalWallet

> CompletableFuture<ApiResponse<UnmanagedWallet>> getInternalWallet getInternalWallet(walletId)

Get an asset from an internal wallet

Returns information for an asset in an internal wallet.  This endpoint will be deprecated after 6 months. &lt;/br&gt;As part of the depreciation process this endpoint will no longer return balances, only addresses. &lt;/br&gt;Until it is deprecated, this endpoint will behave the same way.  Internal Wallets are whitelisted wallets that belong to you outside of Fireblocks.    - You can see the balance of the Internal Wallet via Fireblocks   - You cannot initiate transactions from Internal Wallets through Fireblocks  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String walletId = "walletId_example"; // String | The ID of the wallet to return
        try {
            CompletableFuture<ApiResponse<UnmanagedWallet>> response = fireblocks.internalWallets().getInternalWallet(walletId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#getInternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWallet");
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
| **walletId** | **String**| The ID of the wallet to return | |

### Return type

CompletableFuture<ApiResponse<[**UnmanagedWallet**](UnmanagedWallet.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getInternalWalletAsset

> CompletableFuture<ApiResponse<WalletAsset>> getInternalWalletAsset getInternalWalletAsset(walletId, assetId)

Get an asset from an internal wallet

Returns information for an asset in an internal wallet.  Internal Wallets are whitelisted wallets that belong to you outside of Fireblocks.    - You can see the balance of the Internal Wallet via Fireblocks   - You cannot initiate transactions from Internal Wallets through Fireblocks  Learn more about Whitelisted Internal Addresses [here](https://developers.fireblocks.com/docs/whitelist-addresses#internal-wallets)  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ApiResponse<WalletAsset>> response = fireblocks.internalWallets().getInternalWalletAsset(walletId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#getInternalWalletAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWalletAsset");
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
| **walletId** | **String**| The ID of the wallet | |
| **assetId** | **String**| The ID of the asset to return | |

### Return type

CompletableFuture<ApiResponse<[**WalletAsset**](WalletAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getInternalWalletAssetsPaginated

> CompletableFuture<ApiResponse<PaginatedAssetsResponse>> getInternalWalletAssetsPaginated getInternalWalletAssetsPaginated(walletId, pageSize, pageCursor)

List assets in an internal wallet (Paginated)

Returns a paginated response of assets in an internal wallet.  This is a new paginated endpoint that gets all the assets from the wallet container with balances. &lt;/br&gt;This endpoint returns a limited amount of results with a quick response time.  Internal Wallets are whitelisted wallets that belong to you outside of Fireblocks.    - You can see the balance of the Internal Wallet via Fireblocks   - You cannot initiate transactions from Internal Wallets through Fireblocks  Learn more about Whitelisted Internal Addresses [here](https://developers.fireblocks.com/docs/whitelist-addresses#internal-wallets)  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String walletId = "walletId_example"; // String | The ID of the internal wallet to return assets for
        BigDecimal pageSize = new BigDecimal("50"); // BigDecimal | 
        String pageCursor = "pageCursor_example"; // String | 
        try {
            CompletableFuture<ApiResponse<PaginatedAssetsResponse>> response = fireblocks.internalWallets().getInternalWalletAssetsPaginated(walletId, pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#getInternalWalletAssetsPaginated");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWalletAssetsPaginated");
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
| **walletId** | **String**| The ID of the internal wallet to return assets for | |
| **pageSize** | **BigDecimal**|  | [optional] [default to 50] |
| **pageCursor** | **String**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PaginatedAssetsResponse**](PaginatedAssetsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated response of assets for the internal wallet |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getInternalWallets

> CompletableFuture<ApiResponse<List<UnmanagedWallet>>> getInternalWallets getInternalWallets()

List internal wallets

Gets a list of internal wallets.   **Note**: - BTC-based assets belonging to whitelisted addresses cannot be   retrieved between 00:00 UTC and 00:01 UTC daily due to third-party   provider, Blockchain, being unavailable for this 60 second period.   &lt;/br&gt;Please wait until the next minute to retrieve BTC-based assets. - The list of assets returned will NOT include the balances anymore.  Internal Wallets are whitelisted wallets that belong to you outside of Fireblocks.    - You can see the balance of the Internal Wallet via Fireblocks   - You cannot initiate transactions from Internal Wallets through Fireblocks  Learn more about Whitelisted Internal Addresses [here](https://developers.fireblocks.com/docs/whitelist-addresses#internal-wallets)  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
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
            CompletableFuture<ApiResponse<List<UnmanagedWallet>>> response = fireblocks.internalWallets().getInternalWallets();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#getInternalWallets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWallets");
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

CompletableFuture<ApiResponse<[**List&lt;UnmanagedWallet&gt;**](UnmanagedWallet.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of internal wallets |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setCustomerRefIdForInternalWallet

> CompletableFuture<ApiResponse<Void>> setCustomerRefIdForInternalWallet setCustomerRefIdForInternalWallet(setCustomerRefIdRequest, walletId, idempotencyKey)

Set an AML/KYT customer reference ID for an internal wallet

Sets an AML/KYT customer reference ID for the specific internal wallet.  Internal Wallets are whitelisted wallets that belong to you outside of Fireblocks.    - You can see the balance of the Internal Wallet via Fireblocks   - You cannot initiate transactions from Internal Wallets through Fireblocks  Learn more about Whitelisted Internal Addresses [here](https://developers.fireblocks.com/docs/whitelist-addresses#internal-wallets)  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        SetCustomerRefIdRequest setCustomerRefIdRequest = new SetCustomerRefIdRequest(); // SetCustomerRefIdRequest | 
        String walletId = "walletId_example"; // String | The wallet ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.internalWallets().setCustomerRefIdForInternalWallet(setCustomerRefIdRequest, walletId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling InternalWalletsApi#setCustomerRefIdForInternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#setCustomerRefIdForInternalWallet");
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
| **setCustomerRefIdRequest** | [**SetCustomerRefIdRequest**](SetCustomerRefIdRequest.md)|  | |
| **walletId** | **String**| The wallet ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

