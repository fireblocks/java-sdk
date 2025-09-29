# ExchangeAccountsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExchangeAccount**](ExchangeAccountsApi.md#addExchangeAccount) | **POST** /exchange_accounts | Add an exchange account |
| [**convertAssets**](ExchangeAccountsApi.md#convertAssets) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset. |
| [**getExchangeAccount**](ExchangeAccountsApi.md#getExchangeAccount) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account |
| [**getExchangeAccountAsset**](ExchangeAccountsApi.md#getExchangeAccountAsset) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account |
| [**getExchangeAccountsCredentialsPublicKey**](ExchangeAccountsApi.md#getExchangeAccountsCredentialsPublicKey) | **GET** /exchange_accounts/credentials_public_key | Get public key to encrypt exchange credentials |
| [**getPagedExchangeAccounts**](ExchangeAccountsApi.md#getPagedExchangeAccounts) | **GET** /exchange_accounts/paged | Pagination list exchange accounts |
| [**internalTransfer**](ExchangeAccountsApi.md#internalTransfer) | **POST** /exchange_accounts/{exchangeAccountId}/internal_transfer | Internal transfer for exchange accounts |



## addExchangeAccount

> CompletableFuture<ApiResponse<AddExchangeAccountResponse>> addExchangeAccount addExchangeAccount(addExchangeAccountRequest, idempotencyKey)

Add an exchange account

Add an exchange account to exchanges.

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
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        AddExchangeAccountRequest addExchangeAccountRequest = new AddExchangeAccountRequest(); // AddExchangeAccountRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AddExchangeAccountResponse>> response = fireblocks.exchangeAccounts().addExchangeAccount(addExchangeAccountRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExchangeAccountsApi#addExchangeAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#addExchangeAccount");
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
| **addExchangeAccountRequest** | [**AddExchangeAccountRequest**](AddExchangeAccountRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AddExchangeAccountResponse**](AddExchangeAccountResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | An Exchange Account identifier object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## convertAssets

> CompletableFuture<ApiResponse<ConvertAssetsResponse>> convertAssets convertAssets(exchangeAccountId, convertAssetsRequest, idempotencyKey)

Convert exchange account funds from the source asset to the destination asset.

Convert exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC, USDC to USD) and Bitso (MXN to USD) are supported conversions.

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
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account. Please make sure the exchange supports conversions. To find the ID of your exchange account, use GET/exchange_accounts.
        ConvertAssetsRequest convertAssetsRequest = new ConvertAssetsRequest(); // ConvertAssetsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ConvertAssetsResponse>> response = fireblocks.exchangeAccounts().convertAssets(exchangeAccountId, convertAssetsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExchangeAccountsApi#convertAssets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#convertAssets");
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
| **exchangeAccountId** | **String**| The ID of the exchange account. Please make sure the exchange supports conversions. To find the ID of your exchange account, use GET/exchange_accounts. | |
| **convertAssetsRequest** | [**ConvertAssetsRequest**](ConvertAssetsRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ConvertAssetsResponse**](ConvertAssetsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conversion successful |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getExchangeAccount

> CompletableFuture<ApiResponse<ExchangeAccount>> getExchangeAccount getExchangeAccount(exchangeAccountId)

Find a specific exchange account

Returns an exchange account by ID.

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
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        try {
            CompletableFuture<ApiResponse<ExchangeAccount>> response = fireblocks.exchangeAccounts().getExchangeAccount(exchangeAccountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccount");
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
| **exchangeAccountId** | **String**| The ID of the exchange account to return | |

### Return type

CompletableFuture<ApiResponse<[**ExchangeAccount**](ExchangeAccount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An ExchangeAccount object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getExchangeAccountAsset

> CompletableFuture<ApiResponse<ExchangeAsset>> getExchangeAccountAsset getExchangeAccountAsset(exchangeAccountId, assetId)

Find an asset for an exchange account

Returns an asset for an exchange account.

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
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ApiResponse<ExchangeAsset>> response = fireblocks.exchangeAccounts().getExchangeAccountAsset(exchangeAccountId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccountAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccountAsset");
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
| **exchangeAccountId** | **String**| The ID of the exchange account to return | |
| **assetId** | **String**| The ID of the asset to return | |

### Return type

CompletableFuture<ApiResponse<[**ExchangeAsset**](ExchangeAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An ExchangeAccountAsset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getExchangeAccountsCredentialsPublicKey

> CompletableFuture<ApiResponse<GetExchangeAccountsCredentialsPublicKeyResponse>> getExchangeAccountsCredentialsPublicKey getExchangeAccountsCredentialsPublicKey()

Get public key to encrypt exchange credentials

Return public key

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
import com.fireblocks.sdk.api.ExchangeAccountsApi;
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
            CompletableFuture<ApiResponse<GetExchangeAccountsCredentialsPublicKeyResponse>> response = fireblocks.exchangeAccounts().getExchangeAccountsCredentialsPublicKey();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccountsCredentialsPublicKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccountsCredentialsPublicKey");
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

CompletableFuture<ApiResponse<[**GetExchangeAccountsCredentialsPublicKeyResponse**](GetExchangeAccountsCredentialsPublicKeyResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | public key as string |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getPagedExchangeAccounts

> CompletableFuture<ApiResponse<GetPagedExchangeAccountsResponse>> getPagedExchangeAccounts getPagedExchangeAccounts(limit, before, after)

Pagination list exchange accounts

Returns a page include exchange accounts.

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
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        BigDecimal limit = new BigDecimal("3"); // BigDecimal | number of exchanges per page
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        try {
            CompletableFuture<ApiResponse<GetPagedExchangeAccountsResponse>> response = fireblocks.exchangeAccounts().getPagedExchangeAccounts(limit, before, after);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExchangeAccountsApi#getPagedExchangeAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getPagedExchangeAccounts");
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
| **limit** | **BigDecimal**| number of exchanges per page | [default to 3] |
| **before** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**GetPagedExchangeAccountsResponse**](GetPagedExchangeAccountsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An ExchangeAccount object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## internalTransfer

> CompletableFuture<ApiResponse<InternalTransferResponse>> internalTransfer internalTransfer(exchangeAccountId, createInternalTransferRequest, idempotencyKey)

Internal transfer for exchange accounts

Transfers funds between trading accounts under the same exchange account.

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
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        CreateInternalTransferRequest createInternalTransferRequest = new CreateInternalTransferRequest(); // CreateInternalTransferRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<InternalTransferResponse>> response = fireblocks.exchangeAccounts().internalTransfer(exchangeAccountId, createInternalTransferRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExchangeAccountsApi#internalTransfer");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#internalTransfer");
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
| **exchangeAccountId** | **String**| The ID of the exchange account to return | |
| **createInternalTransferRequest** | [**CreateInternalTransferRequest**](CreateInternalTransferRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**InternalTransferResponse**](InternalTransferResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Transfer succeeded |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

