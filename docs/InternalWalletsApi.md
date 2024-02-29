# InternalWalletsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInternalWallet**](InternalWalletsApi.md#createInternalWallet) | **POST** /internal_wallets | Create an internal wallet |
| [**createInternalWalletWithHttpInfo**](InternalWalletsApi.md#createInternalWalletWithHttpInfo) | **POST** /internal_wallets | Create an internal wallet |
| [**createInternalWalletAsset**](InternalWalletsApi.md#createInternalWalletAsset) | **POST** /internal_wallets/{walletId}/{assetId} | Add an asset to an internal wallet |
| [**createInternalWalletAssetWithHttpInfo**](InternalWalletsApi.md#createInternalWalletAssetWithHttpInfo) | **POST** /internal_wallets/{walletId}/{assetId} | Add an asset to an internal wallet |
| [**deleteInternalWallet**](InternalWalletsApi.md#deleteInternalWallet) | **DELETE** /internal_wallets/{walletId} | Delete an internal wallet |
| [**deleteInternalWalletWithHttpInfo**](InternalWalletsApi.md#deleteInternalWalletWithHttpInfo) | **DELETE** /internal_wallets/{walletId} | Delete an internal wallet |
| [**deleteInternalWalletAsset**](InternalWalletsApi.md#deleteInternalWalletAsset) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address from an internal wallet |
| [**deleteInternalWalletAssetWithHttpInfo**](InternalWalletsApi.md#deleteInternalWalletAssetWithHttpInfo) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address from an internal wallet |
| [**getInternalWallet**](InternalWalletsApi.md#getInternalWallet) | **GET** /internal_wallets/{walletId} | Get assets for internal wallet |
| [**getInternalWalletWithHttpInfo**](InternalWalletsApi.md#getInternalWalletWithHttpInfo) | **GET** /internal_wallets/{walletId} | Get assets for internal wallet |
| [**getInternalWalletAsset**](InternalWalletsApi.md#getInternalWalletAsset) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet |
| [**getInternalWalletAssetWithHttpInfo**](InternalWalletsApi.md#getInternalWalletAssetWithHttpInfo) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet |
| [**getInternalWallets**](InternalWalletsApi.md#getInternalWallets) | **GET** /internal_wallets | List internal wallets |
| [**getInternalWalletsWithHttpInfo**](InternalWalletsApi.md#getInternalWalletsWithHttpInfo) | **GET** /internal_wallets | List internal wallets |
| [**setCustomerRefIdForInternalWallet**](InternalWalletsApi.md#setCustomerRefIdForInternalWallet) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet |
| [**setCustomerRefIdForInternalWalletWithHttpInfo**](InternalWalletsApi.md#setCustomerRefIdForInternalWalletWithHttpInfo) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet |



## createInternalWallet

> CompletableFuture<UnmanagedWallet> createInternalWallet(createWalletRequest, idempotencyKey)

Create an internal wallet

Creates a new internal wallet with the requested name.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        CreateWalletRequest createWalletRequest = new CreateWalletRequest(); // CreateWalletRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<UnmanagedWallet> result = apiInstance.createInternalWallet(createWalletRequest, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#createInternalWallet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<[**UnmanagedWallet**](UnmanagedWallet.md)>


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

## createInternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<UnmanagedWallet>> createInternalWallet createInternalWalletWithHttpInfo(createWalletRequest, idempotencyKey)

Create an internal wallet

Creates a new internal wallet with the requested name.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        CreateWalletRequest createWalletRequest = new CreateWalletRequest(); // CreateWalletRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UnmanagedWallet>> response = apiInstance.createInternalWalletWithHttpInfo(createWalletRequest, idempotencyKey);
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

> CompletableFuture<WalletAsset> createInternalWalletAsset(walletId, assetId, createInternalWalletAssetRequest, idempotencyKey)

Add an asset to an internal wallet

Adds an asset to an existing internal wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to add
        CreateInternalWalletAssetRequest createInternalWalletAssetRequest = new CreateInternalWalletAssetRequest(); // CreateInternalWalletAssetRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<WalletAsset> result = apiInstance.createInternalWalletAsset(walletId, assetId, createInternalWalletAssetRequest, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#createInternalWalletAsset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<[**WalletAsset**](WalletAsset.md)>


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

## createInternalWalletAssetWithHttpInfo

> CompletableFuture<ApiResponse<WalletAsset>> createInternalWalletAsset createInternalWalletAssetWithHttpInfo(walletId, assetId, createInternalWalletAssetRequest, idempotencyKey)

Add an asset to an internal wallet

Adds an asset to an existing internal wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to add
        CreateInternalWalletAssetRequest createInternalWalletAssetRequest = new CreateInternalWalletAssetRequest(); // CreateInternalWalletAssetRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<WalletAsset>> response = apiInstance.createInternalWalletAssetWithHttpInfo(walletId, assetId, createInternalWalletAssetRequest, idempotencyKey);
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

> CompletableFuture<Void> deleteInternalWallet(walletId)

Delete an internal wallet

Deletes an internal wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to delete
        try {
            CompletableFuture<Void> result = apiInstance.deleteInternalWallet(walletId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#deleteInternalWallet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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


CompletableFuture<void> (empty response body)

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

## deleteInternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<Void>> deleteInternalWallet deleteInternalWalletWithHttpInfo(walletId)

Delete an internal wallet

Deletes an internal wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to delete
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.deleteInternalWalletWithHttpInfo(walletId);
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

> CompletableFuture<Void> deleteInternalWalletAsset(walletId, assetId)

Delete a whitelisted address from an internal wallet

Deletes a whitelisted address (for an asset) from an internal wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            CompletableFuture<Void> result = apiInstance.deleteInternalWalletAsset(walletId, assetId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#deleteInternalWalletAsset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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


CompletableFuture<void> (empty response body)

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

## deleteInternalWalletAssetWithHttpInfo

> CompletableFuture<ApiResponse<Void>> deleteInternalWalletAsset deleteInternalWalletAssetWithHttpInfo(walletId, assetId)

Delete a whitelisted address from an internal wallet

Deletes a whitelisted address (for an asset) from an internal wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.deleteInternalWalletAssetWithHttpInfo(walletId, assetId);
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

> CompletableFuture<UnmanagedWallet> getInternalWallet(walletId)

Get assets for internal wallet

Returns all assets in an internal wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to return
        try {
            CompletableFuture<UnmanagedWallet> result = apiInstance.getInternalWallet(walletId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWallet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<[**UnmanagedWallet**](UnmanagedWallet.md)>


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

## getInternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<UnmanagedWallet>> getInternalWallet getInternalWalletWithHttpInfo(walletId)

Get assets for internal wallet

Returns all assets in an internal wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to return
        try {
            CompletableFuture<ApiResponse<UnmanagedWallet>> response = apiInstance.getInternalWalletWithHttpInfo(walletId);
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

> CompletableFuture<WalletAsset> getInternalWalletAsset(walletId, assetId)

Get an asset from an internal wallet

Returns information for an asset in an internal wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<WalletAsset> result = apiInstance.getInternalWalletAsset(walletId, assetId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWalletAsset");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<[**WalletAsset**](WalletAsset.md)>


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

## getInternalWalletAssetWithHttpInfo

> CompletableFuture<ApiResponse<WalletAsset>> getInternalWalletAsset getInternalWalletAssetWithHttpInfo(walletId, assetId)

Get an asset from an internal wallet

Returns information for an asset in an internal wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ApiResponse<WalletAsset>> response = apiInstance.getInternalWalletAssetWithHttpInfo(walletId, assetId);
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


## getInternalWallets

> CompletableFuture<List<UnmanagedWallet>> getInternalWallets()

List internal wallets

Gets a list of internal wallets.  **Note**: BTC-based assets belonging to whitelisted addresses cannot be retrieved between 00:00 UTC and 00:01 UTC daily due to third-party provider, Blockchair, being unavailable for this 60 second period. Please wait until the next minute to retrieve BTC-based assets. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        try {
            CompletableFuture<List<UnmanagedWallet>> result = apiInstance.getInternalWallets();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWallets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<[**List&lt;UnmanagedWallet&gt;**](UnmanagedWallet.md)>


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

## getInternalWalletsWithHttpInfo

> CompletableFuture<ApiResponse<List<UnmanagedWallet>>> getInternalWallets getInternalWalletsWithHttpInfo()

List internal wallets

Gets a list of internal wallets.  **Note**: BTC-based assets belonging to whitelisted addresses cannot be retrieved between 00:00 UTC and 00:01 UTC daily due to third-party provider, Blockchair, being unavailable for this 60 second period. Please wait until the next minute to retrieve BTC-based assets. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<UnmanagedWallet>>> response = apiInstance.getInternalWalletsWithHttpInfo();
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

> CompletableFuture<Void> setCustomerRefIdForInternalWallet(setCustomerRefIdRequest, walletId, idempotencyKey)

Set an AML/KYT customer reference ID for an internal wallet

Sets an AML/KYT customer reference ID for the specific internal wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        SetCustomerRefIdRequest setCustomerRefIdRequest = new SetCustomerRefIdRequest(); // SetCustomerRefIdRequest | 
        String walletId = "walletId_example"; // String | The wallet ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.setCustomerRefIdForInternalWallet(setCustomerRefIdRequest, walletId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#setCustomerRefIdForInternalWallet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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


CompletableFuture<void> (empty response body)

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

## setCustomerRefIdForInternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<Void>> setCustomerRefIdForInternalWallet setCustomerRefIdForInternalWalletWithHttpInfo(setCustomerRefIdRequest, walletId, idempotencyKey)

Set an AML/KYT customer reference ID for an internal wallet

Sets an AML/KYT customer reference ID for the specific internal wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.InternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        SetCustomerRefIdRequest setCustomerRefIdRequest = new SetCustomerRefIdRequest(); // SetCustomerRefIdRequest | 
        String walletId = "walletId_example"; // String | The wallet ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.setCustomerRefIdForInternalWalletWithHttpInfo(setCustomerRefIdRequest, walletId, idempotencyKey);
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

