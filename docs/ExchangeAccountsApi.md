# ExchangeAccountsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convertAssets**](ExchangeAccountsApi.md#convertAssets) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset. |
| [**convertAssetsWithHttpInfo**](ExchangeAccountsApi.md#convertAssetsWithHttpInfo) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset. |
| [**getExchangeAccount**](ExchangeAccountsApi.md#getExchangeAccount) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account |
| [**getExchangeAccountWithHttpInfo**](ExchangeAccountsApi.md#getExchangeAccountWithHttpInfo) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account |
| [**getExchangeAccountAsset**](ExchangeAccountsApi.md#getExchangeAccountAsset) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account |
| [**getExchangeAccountAssetWithHttpInfo**](ExchangeAccountsApi.md#getExchangeAccountAssetWithHttpInfo) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account |
| [**getExchangeAccounts**](ExchangeAccountsApi.md#getExchangeAccounts) | **GET** /exchange_accounts | List exchange accounts |
| [**getExchangeAccountsWithHttpInfo**](ExchangeAccountsApi.md#getExchangeAccountsWithHttpInfo) | **GET** /exchange_accounts | List exchange accounts |
| [**getPagedExchangeAccounts**](ExchangeAccountsApi.md#getPagedExchangeAccounts) | **GET** /exchange_accounts/paged | Pagination list exchange accounts |
| [**getPagedExchangeAccountsWithHttpInfo**](ExchangeAccountsApi.md#getPagedExchangeAccountsWithHttpInfo) | **GET** /exchange_accounts/paged | Pagination list exchange accounts |
| [**internalTransfer**](ExchangeAccountsApi.md#internalTransfer) | **POST** /exchange_accounts/{exchangeAccountId}/internal_transfer | Internal transfer for exchange accounts |
| [**internalTransferWithHttpInfo**](ExchangeAccountsApi.md#internalTransferWithHttpInfo) | **POST** /exchange_accounts/{exchangeAccountId}/internal_transfer | Internal transfer for exchange accounts |



## convertAssets

> CompletableFuture<Void> convertAssets(exchangeAccountId, convertAssetsRequest, idempotencyKey)

Convert exchange account funds from the source asset to the destination asset.

Convert exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC, USDC to USD) and Bitso (MXN to USD) are supported conversions.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account. Please make sure the exchange supports conversions. To find the ID of your exchange account, use GET/exchange_accounts.
        ConvertAssetsRequest convertAssetsRequest = new ConvertAssetsRequest(); // ConvertAssetsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.convertAssets(exchangeAccountId, convertAssetsRequest, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#convertAssets");
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
| **exchangeAccountId** | **String**| The ID of the exchange account. Please make sure the exchange supports conversions. To find the ID of your exchange account, use GET/exchange_accounts. | |
| **convertAssetsRequest** | [**ConvertAssetsRequest**](ConvertAssetsRequest.md)|  | [optional] |
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
| **200** | Conversion successful |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## convertAssetsWithHttpInfo

> CompletableFuture<ApiResponse<Void>> convertAssets convertAssetsWithHttpInfo(exchangeAccountId, convertAssetsRequest, idempotencyKey)

Convert exchange account funds from the source asset to the destination asset.

Convert exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC, USDC to USD) and Bitso (MXN to USD) are supported conversions.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account. Please make sure the exchange supports conversions. To find the ID of your exchange account, use GET/exchange_accounts.
        ConvertAssetsRequest convertAssetsRequest = new ConvertAssetsRequest(); // ConvertAssetsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.convertAssetsWithHttpInfo(exchangeAccountId, convertAssetsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
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


CompletableFuture<ApiResponse<Void>>

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

> CompletableFuture<ExchangeAccount> getExchangeAccount(exchangeAccountId)

Find a specific exchange account

Returns an exchange account by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        try {
            CompletableFuture<ExchangeAccount> result = apiInstance.getExchangeAccount(exchangeAccountId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccount");
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
| **exchangeAccountId** | **String**| The ID of the exchange account to return | |

### Return type

CompletableFuture<[**ExchangeAccount**](ExchangeAccount.md)>


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

## getExchangeAccountWithHttpInfo

> CompletableFuture<ApiResponse<ExchangeAccount>> getExchangeAccount getExchangeAccountWithHttpInfo(exchangeAccountId)

Find a specific exchange account

Returns an exchange account by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        try {
            CompletableFuture<ApiResponse<ExchangeAccount>> response = apiInstance.getExchangeAccountWithHttpInfo(exchangeAccountId);
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

> CompletableFuture<ExchangeAsset> getExchangeAccountAsset(exchangeAccountId, assetId)

Find an asset for an exchange account

Returns an asset for an exchange account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ExchangeAsset> result = apiInstance.getExchangeAccountAsset(exchangeAccountId, assetId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccountAsset");
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
| **exchangeAccountId** | **String**| The ID of the exchange account to return | |
| **assetId** | **String**| The ID of the asset to return | |

### Return type

CompletableFuture<[**ExchangeAsset**](ExchangeAsset.md)>


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

## getExchangeAccountAssetWithHttpInfo

> CompletableFuture<ApiResponse<ExchangeAsset>> getExchangeAccountAsset getExchangeAccountAssetWithHttpInfo(exchangeAccountId, assetId)

Find an asset for an exchange account

Returns an asset for an exchange account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ApiResponse<ExchangeAsset>> response = apiInstance.getExchangeAccountAssetWithHttpInfo(exchangeAccountId, assetId);
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


## getExchangeAccounts

> CompletableFuture<List<ExchangeAccount>> getExchangeAccounts()

List exchange accounts

Deprecated (use new &#39;paged&#39; endpoint) - Returns all exchange accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        try {
            CompletableFuture<List<ExchangeAccount>> result = apiInstance.getExchangeAccounts();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccounts");
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

CompletableFuture<[**List&lt;ExchangeAccount&gt;**](ExchangeAccount.md)>


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

## getExchangeAccountsWithHttpInfo

> CompletableFuture<ApiResponse<List<ExchangeAccount>>> getExchangeAccounts getExchangeAccountsWithHttpInfo()

List exchange accounts

Deprecated (use new &#39;paged&#39; endpoint) - Returns all exchange accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<ExchangeAccount>>> response = apiInstance.getExchangeAccountsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccounts");
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

CompletableFuture<ApiResponse<[**List&lt;ExchangeAccount&gt;**](ExchangeAccount.md)>>


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


## getPagedExchangeAccounts

> CompletableFuture<List<ExchangeAccountsPaged>> getPagedExchangeAccounts(limit, before, after)

Pagination list exchange accounts

Returns a page include exchange accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        BigDecimal limit = new BigDecimal("3"); // BigDecimal | number of exchanges per page
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        try {
            CompletableFuture<List<ExchangeAccountsPaged>> result = apiInstance.getPagedExchangeAccounts(limit, before, after);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getPagedExchangeAccounts");
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
| **limit** | **BigDecimal**| number of exchanges per page | [default to 3] |
| **before** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |

### Return type

CompletableFuture<[**List&lt;ExchangeAccountsPaged&gt;**](ExchangeAccountsPaged.md)>


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

## getPagedExchangeAccountsWithHttpInfo

> CompletableFuture<ApiResponse<List<ExchangeAccountsPaged>>> getPagedExchangeAccounts getPagedExchangeAccountsWithHttpInfo(limit, before, after)

Pagination list exchange accounts

Returns a page include exchange accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        BigDecimal limit = new BigDecimal("3"); // BigDecimal | number of exchanges per page
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        try {
            CompletableFuture<ApiResponse<List<ExchangeAccountsPaged>>> response = apiInstance.getPagedExchangeAccountsWithHttpInfo(limit, before, after);
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

CompletableFuture<ApiResponse<[**List&lt;ExchangeAccountsPaged&gt;**](ExchangeAccountsPaged.md)>>


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

> CompletableFuture<Void> internalTransfer(exchangeAccountId, createInternalTransferRequest, idempotencyKey)

Internal transfer for exchange accounts

Transfers funds between trading accounts under the same exchange account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        CreateInternalTransferRequest createInternalTransferRequest = new CreateInternalTransferRequest(); // CreateInternalTransferRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.internalTransfer(exchangeAccountId, createInternalTransferRequest, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#internalTransfer");
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
| **exchangeAccountId** | **String**| The ID of the exchange account to return | |
| **createInternalTransferRequest** | [**CreateInternalTransferRequest**](CreateInternalTransferRequest.md)|  | [optional] |
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
| **201** | Transfer succeeded |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## internalTransferWithHttpInfo

> CompletableFuture<ApiResponse<Void>> internalTransfer internalTransferWithHttpInfo(exchangeAccountId, createInternalTransferRequest, idempotencyKey)

Internal transfer for exchange accounts

Transfers funds between trading accounts under the same exchange account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ExchangeAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        CreateInternalTransferRequest createInternalTransferRequest = new CreateInternalTransferRequest(); // CreateInternalTransferRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.internalTransferWithHttpInfo(exchangeAccountId, createInternalTransferRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
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


CompletableFuture<ApiResponse<Void>>

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

