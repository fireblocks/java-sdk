# ExternalWalletsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAssetToExternalWallet**](ExternalWalletsApi.md#addAssetToExternalWallet) | **POST** /external_wallets/{walletId}/{assetId} | Add an asset to an external wallet. |
| [**addAssetToExternalWalletWithHttpInfo**](ExternalWalletsApi.md#addAssetToExternalWalletWithHttpInfo) | **POST** /external_wallets/{walletId}/{assetId} | Add an asset to an external wallet. |
| [**createExternalWallet**](ExternalWalletsApi.md#createExternalWallet) | **POST** /external_wallets | Create an external wallet |
| [**createExternalWalletWithHttpInfo**](ExternalWalletsApi.md#createExternalWalletWithHttpInfo) | **POST** /external_wallets | Create an external wallet |
| [**deleteExternalWallet**](ExternalWalletsApi.md#deleteExternalWallet) | **DELETE** /external_wallets/{walletId} | Delete an external wallet |
| [**deleteExternalWalletWithHttpInfo**](ExternalWalletsApi.md#deleteExternalWalletWithHttpInfo) | **DELETE** /external_wallets/{walletId} | Delete an external wallet |
| [**getExternalWallet**](ExternalWalletsApi.md#getExternalWallet) | **GET** /external_wallets/{walletId} | Find an external wallet |
| [**getExternalWalletWithHttpInfo**](ExternalWalletsApi.md#getExternalWalletWithHttpInfo) | **GET** /external_wallets/{walletId} | Find an external wallet |
| [**getExternalWalletAsset**](ExternalWalletsApi.md#getExternalWalletAsset) | **GET** /external_wallets/{walletId}/{assetId} | Get an asset from an external wallet |
| [**getExternalWalletAssetWithHttpInfo**](ExternalWalletsApi.md#getExternalWalletAssetWithHttpInfo) | **GET** /external_wallets/{walletId}/{assetId} | Get an asset from an external wallet |
| [**getExternalWallets**](ExternalWalletsApi.md#getExternalWallets) | **GET** /external_wallets | List external wallets |
| [**getExternalWalletsWithHttpInfo**](ExternalWalletsApi.md#getExternalWalletsWithHttpInfo) | **GET** /external_wallets | List external wallets |
| [**removeAssetFromExternalWallet**](ExternalWalletsApi.md#removeAssetFromExternalWallet) | **DELETE** /external_wallets/{walletId}/{assetId} | Delete an asset from an external wallet |
| [**removeAssetFromExternalWalletWithHttpInfo**](ExternalWalletsApi.md#removeAssetFromExternalWalletWithHttpInfo) | **DELETE** /external_wallets/{walletId}/{assetId} | Delete an asset from an external wallet |
| [**setExternalWalletCustomerRefId**](ExternalWalletsApi.md#setExternalWalletCustomerRefId) | **POST** /external_wallets/{walletId}/set_customer_ref_id | Set an AML customer reference ID for an external wallet |
| [**setExternalWalletCustomerRefIdWithHttpInfo**](ExternalWalletsApi.md#setExternalWalletCustomerRefIdWithHttpInfo) | **POST** /external_wallets/{walletId}/set_customer_ref_id | Set an AML customer reference ID for an external wallet |



## addAssetToExternalWallet

> CompletableFuture<ExternalWalletAsset> addAssetToExternalWallet(walletId, assetId, addAssetToExternalWalletRequest, idempotencyKey)

Add an asset to an external wallet.

Adds an asset to an existing external wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to add
        AddAssetToExternalWalletRequest addAssetToExternalWalletRequest = new AddAssetToExternalWalletRequest(); // AddAssetToExternalWalletRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ExternalWalletAsset> result = apiInstance.addAssetToExternalWallet(walletId, assetId, addAssetToExternalWalletRequest, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#addAssetToExternalWallet");
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
| **addAssetToExternalWalletRequest** | [**AddAssetToExternalWalletRequest**](AddAssetToExternalWalletRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**ExternalWalletAsset**](ExternalWalletAsset.md)>


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

## addAssetToExternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<ExternalWalletAsset>> addAssetToExternalWallet addAssetToExternalWalletWithHttpInfo(walletId, assetId, addAssetToExternalWalletRequest, idempotencyKey)

Add an asset to an external wallet.

Adds an asset to an existing external wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to add
        AddAssetToExternalWalletRequest addAssetToExternalWalletRequest = new AddAssetToExternalWalletRequest(); // AddAssetToExternalWalletRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ExternalWalletAsset>> response = apiInstance.addAssetToExternalWalletWithHttpInfo(walletId, assetId, addAssetToExternalWalletRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExternalWalletsApi#addAssetToExternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#addAssetToExternalWallet");
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
| **addAssetToExternalWalletRequest** | [**AddAssetToExternalWalletRequest**](AddAssetToExternalWalletRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ExternalWalletAsset**](ExternalWalletAsset.md)>>


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


## createExternalWallet

> CompletableFuture<UnmanagedWallet> createExternalWallet(createWalletRequest, idempotencyKey)

Create an external wallet

Creates a new external wallet with the requested name.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        CreateWalletRequest createWalletRequest = new CreateWalletRequest(); // CreateWalletRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<UnmanagedWallet> result = apiInstance.createExternalWallet(createWalletRequest, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#createExternalWallet");
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
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createExternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<UnmanagedWallet>> createExternalWallet createExternalWalletWithHttpInfo(createWalletRequest, idempotencyKey)

Create an external wallet

Creates a new external wallet with the requested name.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        CreateWalletRequest createWalletRequest = new CreateWalletRequest(); // CreateWalletRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UnmanagedWallet>> response = apiInstance.createExternalWalletWithHttpInfo(createWalletRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExternalWalletsApi#createExternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#createExternalWallet");
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
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteExternalWallet

> CompletableFuture<Void> deleteExternalWallet(walletId)

Delete an external wallet

Deletes an external wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to delete
        try {
            CompletableFuture<Void> result = apiInstance.deleteExternalWallet(walletId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#deleteExternalWallet");
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

## deleteExternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<Void>> deleteExternalWallet deleteExternalWalletWithHttpInfo(walletId)

Delete an external wallet

Deletes an external wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to delete
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.deleteExternalWalletWithHttpInfo(walletId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExternalWalletsApi#deleteExternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#deleteExternalWallet");
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


## getExternalWallet

> CompletableFuture<UnmanagedWallet> getExternalWallet(walletId)

Find an external wallet

Returns an external wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to return
        try {
            CompletableFuture<UnmanagedWallet> result = apiInstance.getExternalWallet(walletId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWallet");
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

## getExternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<UnmanagedWallet>> getExternalWallet getExternalWalletWithHttpInfo(walletId)

Find an external wallet

Returns an external wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to return
        try {
            CompletableFuture<ApiResponse<UnmanagedWallet>> response = apiInstance.getExternalWalletWithHttpInfo(walletId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWallet");
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


## getExternalWalletAsset

> CompletableFuture<ExternalWalletAsset> getExternalWalletAsset(walletId, assetId)

Get an asset from an external wallet

Returns an external wallet by wallet ID and asset ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ExternalWalletAsset> result = apiInstance.getExternalWalletAsset(walletId, assetId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWalletAsset");
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

CompletableFuture<[**ExternalWalletAsset**](ExternalWalletAsset.md)>


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

## getExternalWalletAssetWithHttpInfo

> CompletableFuture<ApiResponse<ExternalWalletAsset>> getExternalWalletAsset getExternalWalletAssetWithHttpInfo(walletId, assetId)

Get an asset from an external wallet

Returns an external wallet by wallet ID and asset ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ApiResponse<ExternalWalletAsset>> response = apiInstance.getExternalWalletAssetWithHttpInfo(walletId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWalletAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWalletAsset");
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

CompletableFuture<ApiResponse<[**ExternalWalletAsset**](ExternalWalletAsset.md)>>


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


## getExternalWallets

> CompletableFuture<List<UnmanagedWallet>> getExternalWallets()

List external wallets

Gets a list of external wallets under the workspace.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        try {
            CompletableFuture<List<UnmanagedWallet>> result = apiInstance.getExternalWallets();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWallets");
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
| **200** | A list of external wallets |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getExternalWalletsWithHttpInfo

> CompletableFuture<ApiResponse<List<UnmanagedWallet>>> getExternalWallets getExternalWalletsWithHttpInfo()

List external wallets

Gets a list of external wallets under the workspace.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<UnmanagedWallet>>> response = apiInstance.getExternalWalletsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWallets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWallets");
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
| **200** | A list of external wallets |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## removeAssetFromExternalWallet

> CompletableFuture<Void> removeAssetFromExternalWallet(walletId, assetId)

Delete an asset from an external wallet

Deletes an external wallet asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            CompletableFuture<Void> result = apiInstance.removeAssetFromExternalWallet(walletId, assetId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#removeAssetFromExternalWallet");
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

## removeAssetFromExternalWalletWithHttpInfo

> CompletableFuture<ApiResponse<Void>> removeAssetFromExternalWallet removeAssetFromExternalWalletWithHttpInfo(walletId, assetId)

Delete an asset from an external wallet

Deletes an external wallet asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.removeAssetFromExternalWalletWithHttpInfo(walletId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExternalWalletsApi#removeAssetFromExternalWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#removeAssetFromExternalWallet");
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


## setExternalWalletCustomerRefId

> CompletableFuture<Void> setExternalWalletCustomerRefId(setCustomerRefIdRequest, walletId, idempotencyKey)

Set an AML customer reference ID for an external wallet

Sets an AML/KYT customer reference ID for the specific external wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        SetCustomerRefIdRequest setCustomerRefIdRequest = new SetCustomerRefIdRequest(); // SetCustomerRefIdRequest | 
        String walletId = "walletId_example"; // String | The wallet ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.setExternalWalletCustomerRefId(setCustomerRefIdRequest, walletId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#setExternalWalletCustomerRefId");
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

## setExternalWalletCustomerRefIdWithHttpInfo

> CompletableFuture<ApiResponse<Void>> setExternalWalletCustomerRefId setExternalWalletCustomerRefIdWithHttpInfo(setCustomerRefIdRequest, walletId, idempotencyKey)

Set an AML customer reference ID for an external wallet

Sets an AML/KYT customer reference ID for the specific external wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExternalWalletsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(defaultClient);
        SetCustomerRefIdRequest setCustomerRefIdRequest = new SetCustomerRefIdRequest(); // SetCustomerRefIdRequest | 
        String walletId = "walletId_example"; // String | The wallet ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.setExternalWalletCustomerRefIdWithHttpInfo(setCustomerRefIdRequest, walletId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExternalWalletsApi#setExternalWalletCustomerRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#setExternalWalletCustomerRefId");
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

