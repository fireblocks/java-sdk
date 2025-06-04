# EmbeddedWalletsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEmbeddedWalletAsset**](EmbeddedWalletsApi.md#addEmbeddedWalletAsset) | **POST** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId} | Add asset to account |
| [**createEmbeddedWallet**](EmbeddedWalletsApi.md#createEmbeddedWallet) | **POST** /ncw/wallets | Create a new wallet |
| [**createEmbeddedWalletAccount**](EmbeddedWalletsApi.md#createEmbeddedWalletAccount) | **POST** /ncw/wallets/{walletId}/accounts | Create a new account |
| [**getEmbeddedWallet**](EmbeddedWalletsApi.md#getEmbeddedWallet) | **GET** /ncw/wallets/{walletId} | Get a wallet |
| [**getEmbeddedWalletAccount**](EmbeddedWalletsApi.md#getEmbeddedWalletAccount) | **GET** /ncw/wallets/{walletId}/accounts/{accountId} | Get a account |
| [**getEmbeddedWalletAddresses**](EmbeddedWalletsApi.md#getEmbeddedWalletAddresses) | **GET** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId}/addresses | Retrieve asset addresses |
| [**getEmbeddedWalletAsset**](EmbeddedWalletsApi.md#getEmbeddedWalletAsset) | **GET** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId} | Retrieve asset |
| [**getEmbeddedWalletAssetBalance**](EmbeddedWalletsApi.md#getEmbeddedWalletAssetBalance) | **GET** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId}/balance | Retrieve asset balance |
| [**getEmbeddedWalletDevice**](EmbeddedWalletsApi.md#getEmbeddedWalletDevice) | **GET** /ncw/wallets/{walletId}/devices/{deviceId} | Get Embedded Wallet Device |
| [**getEmbeddedWalletDeviceSetupState**](EmbeddedWalletsApi.md#getEmbeddedWalletDeviceSetupState) | **GET** /ncw/wallets/{walletId}/devices/{deviceId}/setup_status | Get device key setup state |
| [**getEmbeddedWalletLatestBackup**](EmbeddedWalletsApi.md#getEmbeddedWalletLatestBackup) | **GET** /ncw/wallets/{walletId}/backup/latest | Get wallet Latest Backup details |
| [**getEmbeddedWalletPublicKeyInfoForAddress**](EmbeddedWalletsApi.md#getEmbeddedWalletPublicKeyInfoForAddress) | **GET** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key of an asset |
| [**getEmbeddedWalletSupportedAssets**](EmbeddedWalletsApi.md#getEmbeddedWalletSupportedAssets) | **GET** /ncw/wallets/supported_assets | Retrieve supported assets |
| [**getEmbeddedWallets**](EmbeddedWalletsApi.md#getEmbeddedWallets) | **GET** /ncw/wallets | List wallets |
| [**getPublicKeyInfoNcw**](EmbeddedWalletsApi.md#getPublicKeyInfoNcw) | **GET** /ncw/wallets/{walletId}/public_key_info | Get the public key for a derivation path |
| [**refreshEmbeddedWalletAssetBalance**](EmbeddedWalletsApi.md#refreshEmbeddedWalletAssetBalance) | **PUT** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId}/balance | Refresh asset balance |



## addEmbeddedWalletAsset

> CompletableFuture<ApiResponse<EmbeddedWalletAddressDetails>> addEmbeddedWalletAsset addEmbeddedWalletAsset(walletId, accountId, assetId, idempotencyKey)

Add asset to account

Get the addresses of a specific asset, under a specific account, under a specific Non Custodial Wallet

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        String accountId = "0"; // String | The ID of the account
        String assetId = "BTC"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletAddressDetails>> response = fireblocks.embeddedWallets().addEmbeddedWalletAsset(walletId, accountId, assetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#addEmbeddedWalletAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#addEmbeddedWalletAsset");
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
| **walletId** | **String**| Wallet Id | |
| **accountId** | **String**| The ID of the account | |
| **assetId** | **String**| The ID of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletAddressDetails**](EmbeddedWalletAddressDetails.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createEmbeddedWallet

> CompletableFuture<ApiResponse<EmbeddedWallet>> createEmbeddedWallet createEmbeddedWallet(idempotencyKey)

Create a new wallet

Create new Non Custodial Wallet

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

        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<EmbeddedWallet>> response = fireblocks.embeddedWallets().createEmbeddedWallet(idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#createEmbeddedWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#createEmbeddedWallet");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWallet**](EmbeddedWallet.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Wallet created successfully |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createEmbeddedWalletAccount

> CompletableFuture<ApiResponse<EmbeddedWalletAccount>> createEmbeddedWalletAccount createEmbeddedWalletAccount(walletId, idempotencyKey)

Create a new account

Create a new account under a specific Non Custodial Wallet

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletAccount>> response = fireblocks.embeddedWallets().createEmbeddedWalletAccount(walletId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#createEmbeddedWalletAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#createEmbeddedWalletAccount");
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
| **walletId** | **String**| Wallet Id | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletAccount**](EmbeddedWalletAccount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Account Created |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWallet

> CompletableFuture<ApiResponse<EmbeddedWallet>> getEmbeddedWallet getEmbeddedWallet(walletId)

Get a wallet

Get a wallet

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        try {
            CompletableFuture<ApiResponse<EmbeddedWallet>> response = fireblocks.embeddedWallets().getEmbeddedWallet(walletId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWallet");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWallet");
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
| **walletId** | **String**| Wallet Id | |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWallet**](EmbeddedWallet.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWalletAccount

> CompletableFuture<ApiResponse<EmbeddedWalletAccount>> getEmbeddedWalletAccount getEmbeddedWalletAccount(walletId, accountId)

Get a account

Get a specific account under a specific Non Custodial Wallet

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | WalletId
        String accountId = "0"; // String | The ID of the account
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletAccount>> response = fireblocks.embeddedWallets().getEmbeddedWalletAccount(walletId, accountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletAccount");
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
| **walletId** | **String**| WalletId | |
| **accountId** | **String**| The ID of the account | |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletAccount**](EmbeddedWalletAccount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWalletAddresses

> CompletableFuture<ApiResponse<EmbeddedWalletPaginatedAddressesResponse>> getEmbeddedWalletAddresses getEmbeddedWalletAddresses(walletId, accountId, assetId, pageCursor, pageSize, sort, order, enabled)

Retrieve asset addresses

Get the addresses of a specific asset, under a specific account, under a specific Non Custodial Wallet

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        String accountId = "0"; // String | The ID of the account
        String assetId = "BTC"; // String | The ID of the asset
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Cursor to the next page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Items per page
        String sort = "address"; // String | Sort by address
        String order = "DESC"; // String | Is the order ascending or descending
        Boolean enabled = true; // Boolean | Enabled
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletPaginatedAddressesResponse>> response = fireblocks.embeddedWallets().getEmbeddedWalletAddresses(walletId, accountId, assetId, pageCursor, pageSize, sort, order, enabled);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletAddresses");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletAddresses");
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
| **walletId** | **String**| Wallet Id | |
| **accountId** | **String**| The ID of the account | |
| **assetId** | **String**| The ID of the asset | |
| **pageCursor** | **String**| Cursor to the next page | [optional] |
| **pageSize** | **BigDecimal**| Items per page | [optional] |
| **sort** | **String**| Sort by address | [optional] [default to createdAt] [enum: address, createdAt] |
| **order** | **String**| Is the order ascending or descending | [optional] [default to ASC] [enum: DESC, ASC] |
| **enabled** | **Boolean**| Enabled | [optional] |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletPaginatedAddressesResponse**](EmbeddedWalletPaginatedAddressesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWalletAsset

> CompletableFuture<ApiResponse<EmbeddedWalletAssetResponse>> getEmbeddedWalletAsset getEmbeddedWalletAsset(walletId, accountId, assetId)

Retrieve asset

Get asset under a specific account, under a specific Non Custodial Wallet

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        String accountId = "0"; // String | The ID of the account
        String assetId = "BTC"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletAssetResponse>> response = fireblocks.embeddedWallets().getEmbeddedWalletAsset(walletId, accountId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletAsset");
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
| **walletId** | **String**| Wallet Id | |
| **accountId** | **String**| The ID of the account | |
| **assetId** | **String**| The ID of the asset | |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletAssetResponse**](EmbeddedWalletAssetResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWalletAssetBalance

> CompletableFuture<ApiResponse<EmbeddedWalletAssetBalance>> getEmbeddedWalletAssetBalance getEmbeddedWalletAssetBalance(walletId, accountId, assetId)

Retrieve asset balance

Get balance for specific asset, under a specific account

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        String accountId = "0"; // String | The ID of the account
        String assetId = "BTC"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletAssetBalance>> response = fireblocks.embeddedWallets().getEmbeddedWalletAssetBalance(walletId, accountId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletAssetBalance");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletAssetBalance");
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
| **walletId** | **String**| Wallet Id | |
| **accountId** | **String**| The ID of the account | |
| **assetId** | **String**| The ID of the asset | |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletAssetBalance**](EmbeddedWalletAssetBalance.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWalletDevice

> CompletableFuture<ApiResponse<EmbeddedWalletDevice>> getEmbeddedWalletDevice getEmbeddedWalletDevice(walletId, deviceId)

Get Embedded Wallet Device

Get specific device for a specific s Wallet

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        String deviceId = "9ee1bff0-6dba-4f0c-9b75-03fe90e66fa3"; // String | Device Id
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletDevice>> response = fireblocks.embeddedWallets().getEmbeddedWalletDevice(walletId, deviceId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletDevice");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletDevice");
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
| **walletId** | **String**| Wallet Id | |
| **deviceId** | **String**| Device Id | |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletDevice**](EmbeddedWalletDevice.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWalletDeviceSetupState

> CompletableFuture<ApiResponse<EmbeddedWalletDeviceKeySetupResponse>> getEmbeddedWalletDeviceSetupState getEmbeddedWalletDeviceSetupState(walletId, deviceId)

Get device key setup state

Get the state of the specific device setup key under a specific Non Custodial Wallet

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        String deviceId = "9ee1bff0-6dba-4f0c-9b75-03fe90e66fa3"; // String | Device Id
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletDeviceKeySetupResponse>> response = fireblocks.embeddedWallets().getEmbeddedWalletDeviceSetupState(walletId, deviceId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletDeviceSetupState");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletDeviceSetupState");
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
| **walletId** | **String**| Wallet Id | |
| **deviceId** | **String**| Device Id | |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletDeviceKeySetupResponse**](EmbeddedWalletDeviceKeySetupResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWalletLatestBackup

> CompletableFuture<ApiResponse<EmbeddedWalletLatestBackupResponse>> getEmbeddedWalletLatestBackup getEmbeddedWalletLatestBackup(walletId)

Get wallet Latest Backup details

Get wallet Latest Backup details, including the deviceId, and backup time

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletLatestBackupResponse>> response = fireblocks.embeddedWallets().getEmbeddedWalletLatestBackup(walletId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletLatestBackup");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletLatestBackup");
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
| **walletId** | **String**| Wallet Id | |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletLatestBackupResponse**](EmbeddedWalletLatestBackupResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWalletPublicKeyInfoForAddress

> CompletableFuture<ApiResponse<PublicKeyInformation>> getEmbeddedWalletPublicKeyInfoForAddress getEmbeddedWalletPublicKeyInfoForAddress(xEndUserWalletId, walletId, accountId, assetId, change, addressIndex, compressed)

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

        UUID xEndUserWalletId = UUID.randomUUID(); // UUID | Unique ID of the End-User wallet to the API request. Required for end-user wallet operations.
        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | The ID of the Non-Custodial wallet
        String accountId = "0"; // String | The ID of the account
        String assetId = "BTC"; // String | The ID of the asset
        BigDecimal change = new BigDecimal("0"); // BigDecimal | BIP44 derivation path - change value
        BigDecimal addressIndex = new BigDecimal("0"); // BigDecimal | BIP44 derivation path - index value
        Boolean compressed = true; // Boolean | Compressed/Uncompressed public key format
        try {
            CompletableFuture<ApiResponse<PublicKeyInformation>> response = fireblocks.embeddedWallets().getEmbeddedWalletPublicKeyInfoForAddress(xEndUserWalletId, walletId, accountId, assetId, change, addressIndex, compressed);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletPublicKeyInfoForAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletPublicKeyInfoForAddress");
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
| **xEndUserWalletId** | **UUID**| Unique ID of the End-User wallet to the API request. Required for end-user wallet operations. | |
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


## getEmbeddedWalletSupportedAssets

> CompletableFuture<ApiResponse<EmbeddedWalletPaginatedAssetsResponse>> getEmbeddedWalletSupportedAssets getEmbeddedWalletSupportedAssets(pageCursor, pageSize, onlyBaseAssets)

Retrieve supported assets

Get all the available supported assets for the Non-Custodial Wallet

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

        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Next page cursor to fetch
        BigDecimal pageSize = new BigDecimal("200"); // BigDecimal | Items per page
        Boolean onlyBaseAssets = true; // Boolean | Only base assets
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletPaginatedAssetsResponse>> response = fireblocks.embeddedWallets().getEmbeddedWalletSupportedAssets(pageCursor, pageSize, onlyBaseAssets);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletSupportedAssets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWalletSupportedAssets");
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
| **pageCursor** | **String**| Next page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page | [optional] [default to 200] |
| **onlyBaseAssets** | **Boolean**| Only base assets | [optional] |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletPaginatedAssetsResponse**](EmbeddedWalletPaginatedAssetsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEmbeddedWallets

> CompletableFuture<ApiResponse<EmbeddedWalletPaginatedWalletsResponse>> getEmbeddedWallets getEmbeddedWallets(pageCursor, pageSize, sort, order, enabled)

List wallets

Get all Non Custodial Wallets

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

        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Next page cursor to fetch
        BigDecimal pageSize = new BigDecimal("200"); // BigDecimal | Items per page
        String sort = "createdAt"; // String | Field(s) to use for sorting
        String order = "ASC"; // String | Is the order ascending or descending
        Boolean enabled = true; // Boolean | Enabled Wallets
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletPaginatedWalletsResponse>> response = fireblocks.embeddedWallets().getEmbeddedWallets(pageCursor, pageSize, sort, order, enabled);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWallets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#getEmbeddedWallets");
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
| **pageCursor** | **String**| Next page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page | [optional] [default to 200] |
| **sort** | **String**| Field(s) to use for sorting | [optional] [default to createdAt] [enum: createdAt] |
| **order** | **String**| Is the order ascending or descending | [optional] [default to ASC] [enum: ASC, DESC] |
| **enabled** | **Boolean**| Enabled Wallets | [optional] |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletPaginatedWalletsResponse**](EmbeddedWalletPaginatedWalletsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getPublicKeyInfoNcw

> CompletableFuture<ApiResponse<PublicKeyInformation>> getPublicKeyInfoNcw getPublicKeyInfoNcw(xEndUserWalletId, walletId, derivationPath, algorithm, compressed)

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

        UUID xEndUserWalletId = UUID.randomUUID(); // UUID | Unique ID of the End-User wallet to the API request. Required for end-user wallet operations.
        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | The ID of the Non-Custodial wallet
        String derivationPath = "[44,0,0,0,0]"; // String | An array of integers (passed as JSON stringified array) representing the full BIP44 derivation path of the requested public key.  The first element must always be 44. 
        String algorithm = "MPC_ECDSA_SECP256K1"; // String | Elliptic Curve
        Boolean compressed = true; // Boolean | Compressed/Uncompressed public key format
        try {
            CompletableFuture<ApiResponse<PublicKeyInformation>> response = fireblocks.embeddedWallets().getPublicKeyInfoNcw(xEndUserWalletId, walletId, derivationPath, algorithm, compressed);
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
| **xEndUserWalletId** | **UUID**| Unique ID of the End-User wallet to the API request. Required for end-user wallet operations. | |
| **walletId** | **String**| The ID of the Non-Custodial wallet | |
| **derivationPath** | **String**| An array of integers (passed as JSON stringified array) representing the full BIP44 derivation path of the requested public key.  The first element must always be 44.  | |
| **algorithm** | **String**| Elliptic Curve | [enum: MPC_ECDSA_SECP256K1, MPC_ECDSA_SECP256R1, MPC_EDDSA_ED25519] |
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
| **200** | Public key information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## refreshEmbeddedWalletAssetBalance

> CompletableFuture<ApiResponse<EmbeddedWalletAssetBalance>> refreshEmbeddedWalletAssetBalance refreshEmbeddedWalletAssetBalance(walletId, accountId, assetId, idempotencyKey)

Refresh asset balance

Refresh the balance of an asset in a specific account

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

        String walletId = "550e8400-e29b-41d4-a716-446655440000"; // String | Wallet Id
        String accountId = "0"; // String | The ID of the account
        String assetId = "BTC"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<EmbeddedWalletAssetBalance>> response = fireblocks.embeddedWallets().refreshEmbeddedWalletAssetBalance(walletId, accountId, assetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EmbeddedWalletsApi#refreshEmbeddedWalletAssetBalance");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddedWalletsApi#refreshEmbeddedWalletAssetBalance");
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
| **walletId** | **String**| Wallet Id | |
| **accountId** | **String**| The ID of the account | |
| **assetId** | **String**| The ID of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**EmbeddedWalletAssetBalance**](EmbeddedWalletAssetBalance.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

