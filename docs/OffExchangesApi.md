# OffExchangesApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOffExchange**](OffExchangesApi.md#addOffExchange) | **POST** /off_exchange/add | add collateral |
| [**addOffExchangeWithHttpInfo**](OffExchangesApi.md#addOffExchangeWithHttpInfo) | **POST** /off_exchange/add | add collateral |
| [**getOffExchangeCollateralAccounts**](OffExchangesApi.md#getOffExchangeCollateralAccounts) | **GET** /off_exchange/collateral_accounts/{mainExchangeAccountId} | Find a specific collateral exchange account |
| [**getOffExchangeCollateralAccountsWithHttpInfo**](OffExchangesApi.md#getOffExchangeCollateralAccountsWithHttpInfo) | **GET** /off_exchange/collateral_accounts/{mainExchangeAccountId} | Find a specific collateral exchange account |
| [**getOffExchangeSettlementTransactions**](OffExchangesApi.md#getOffExchangeSettlementTransactions) | **GET** /off_exchange/settlements/transactions | get settlements transactions from exchange |
| [**getOffExchangeSettlementTransactionsWithHttpInfo**](OffExchangesApi.md#getOffExchangeSettlementTransactionsWithHttpInfo) | **GET** /off_exchange/settlements/transactions | get settlements transactions from exchange |
| [**removeOffExchange**](OffExchangesApi.md#removeOffExchange) | **POST** /off_exchange/remove | remove collateral |
| [**removeOffExchangeWithHttpInfo**](OffExchangesApi.md#removeOffExchangeWithHttpInfo) | **POST** /off_exchange/remove | remove collateral |
| [**settleOffExchangeTrades**](OffExchangesApi.md#settleOffExchangeTrades) | **POST** /off_exchange/settlements/trader | create settlement for a trader |
| [**settleOffExchangeTradesWithHttpInfo**](OffExchangesApi.md#settleOffExchangeTradesWithHttpInfo) | **POST** /off_exchange/settlements/trader | create settlement for a trader |



## addOffExchange

> CompletableFuture<CreateTransactionResponse> addOffExchange(addCollateralRequestBody, idempotencyKey)

add collateral

add collateral, create deposit request

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        AddCollateralRequestBody addCollateralRequestBody = new AddCollateralRequestBody(); // AddCollateralRequestBody | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<CreateTransactionResponse> result = apiInstance.addOffExchange(addCollateralRequestBody, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#addOffExchange");
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
| **addCollateralRequestBody** | [**AddCollateralRequestBody**](AddCollateralRequestBody.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**CreateTransactionResponse**](CreateTransactionResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A transaction object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## addOffExchangeWithHttpInfo

> CompletableFuture<ApiResponse<CreateTransactionResponse>> addOffExchange addOffExchangeWithHttpInfo(addCollateralRequestBody, idempotencyKey)

add collateral

add collateral, create deposit request

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        AddCollateralRequestBody addCollateralRequestBody = new AddCollateralRequestBody(); // AddCollateralRequestBody | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateTransactionResponse>> response = apiInstance.addOffExchangeWithHttpInfo(addCollateralRequestBody, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OffExchangesApi#addOffExchange");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#addOffExchange");
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
| **addCollateralRequestBody** | [**AddCollateralRequestBody**](AddCollateralRequestBody.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateTransactionResponse**](CreateTransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A transaction object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getOffExchangeCollateralAccounts

> CompletableFuture<ExchangeAccount> getOffExchangeCollateralAccounts(mainExchangeAccountId)

Find a specific collateral exchange account

Returns a collateral account by mainExchangeAccountId.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        String mainExchangeAccountId = "mainExchangeAccountId_example"; // String | The id of the main exchange account for which the requested collateral account is associated with
        try {
            CompletableFuture<ExchangeAccount> result = apiInstance.getOffExchangeCollateralAccounts(mainExchangeAccountId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#getOffExchangeCollateralAccounts");
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
| **mainExchangeAccountId** | **String**| The id of the main exchange account for which the requested collateral account is associated with | |

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

## getOffExchangeCollateralAccountsWithHttpInfo

> CompletableFuture<ApiResponse<ExchangeAccount>> getOffExchangeCollateralAccounts getOffExchangeCollateralAccountsWithHttpInfo(mainExchangeAccountId)

Find a specific collateral exchange account

Returns a collateral account by mainExchangeAccountId.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        String mainExchangeAccountId = "mainExchangeAccountId_example"; // String | The id of the main exchange account for which the requested collateral account is associated with
        try {
            CompletableFuture<ApiResponse<ExchangeAccount>> response = apiInstance.getOffExchangeCollateralAccountsWithHttpInfo(mainExchangeAccountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OffExchangesApi#getOffExchangeCollateralAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#getOffExchangeCollateralAccounts");
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
| **mainExchangeAccountId** | **String**| The id of the main exchange account for which the requested collateral account is associated with | |

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


## getOffExchangeSettlementTransactions

> CompletableFuture<ExchangeSettlementTransactionsResponse> getOffExchangeSettlementTransactions(mainExchangeAccountId)

get settlements transactions from exchange

get settlements transactions from exchange

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        String mainExchangeAccountId = "mainExchangeAccountId_example"; // String | 
        try {
            CompletableFuture<ExchangeSettlementTransactionsResponse> result = apiInstance.getOffExchangeSettlementTransactions(mainExchangeAccountId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#getOffExchangeSettlementTransactions");
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
| **mainExchangeAccountId** | **String**|  | |

### Return type

CompletableFuture<[**ExchangeSettlementTransactionsResponse**](ExchangeSettlementTransactionsResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A settlement transactions |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getOffExchangeSettlementTransactionsWithHttpInfo

> CompletableFuture<ApiResponse<ExchangeSettlementTransactionsResponse>> getOffExchangeSettlementTransactions getOffExchangeSettlementTransactionsWithHttpInfo(mainExchangeAccountId)

get settlements transactions from exchange

get settlements transactions from exchange

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        String mainExchangeAccountId = "mainExchangeAccountId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<ExchangeSettlementTransactionsResponse>> response = apiInstance.getOffExchangeSettlementTransactionsWithHttpInfo(mainExchangeAccountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OffExchangesApi#getOffExchangeSettlementTransactions");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#getOffExchangeSettlementTransactions");
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
| **mainExchangeAccountId** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**ExchangeSettlementTransactionsResponse**](ExchangeSettlementTransactionsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A settlement transactions |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## removeOffExchange

> CompletableFuture<CreateTransactionResponse> removeOffExchange(removeCollateralRequestBody, idempotencyKey)

remove collateral

remove collateral, create withdraw request

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        RemoveCollateralRequestBody removeCollateralRequestBody = new RemoveCollateralRequestBody(); // RemoveCollateralRequestBody | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<CreateTransactionResponse> result = apiInstance.removeOffExchange(removeCollateralRequestBody, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#removeOffExchange");
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
| **removeCollateralRequestBody** | [**RemoveCollateralRequestBody**](RemoveCollateralRequestBody.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**CreateTransactionResponse**](CreateTransactionResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A transaction object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## removeOffExchangeWithHttpInfo

> CompletableFuture<ApiResponse<CreateTransactionResponse>> removeOffExchange removeOffExchangeWithHttpInfo(removeCollateralRequestBody, idempotencyKey)

remove collateral

remove collateral, create withdraw request

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        RemoveCollateralRequestBody removeCollateralRequestBody = new RemoveCollateralRequestBody(); // RemoveCollateralRequestBody | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateTransactionResponse>> response = apiInstance.removeOffExchangeWithHttpInfo(removeCollateralRequestBody, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OffExchangesApi#removeOffExchange");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#removeOffExchange");
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
| **removeCollateralRequestBody** | [**RemoveCollateralRequestBody**](RemoveCollateralRequestBody.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateTransactionResponse**](CreateTransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A transaction object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## settleOffExchangeTrades

> CompletableFuture<SettlementResponse> settleOffExchangeTrades(settlementRequestBody, idempotencyKey)

create settlement for a trader

create settlement for a trader

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        SettlementRequestBody settlementRequestBody = new SettlementRequestBody(); // SettlementRequestBody | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<SettlementResponse> result = apiInstance.settleOffExchangeTrades(settlementRequestBody, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#settleOffExchangeTrades");
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
| **settlementRequestBody** | [**SettlementRequestBody**](SettlementRequestBody.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**SettlementResponse**](SettlementResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A settlement object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## settleOffExchangeTradesWithHttpInfo

> CompletableFuture<ApiResponse<SettlementResponse>> settleOffExchangeTrades settleOffExchangeTradesWithHttpInfo(settlementRequestBody, idempotencyKey)

create settlement for a trader

create settlement for a trader

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.OffExchangesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        SettlementRequestBody settlementRequestBody = new SettlementRequestBody(); // SettlementRequestBody | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SettlementResponse>> response = apiInstance.settleOffExchangeTradesWithHttpInfo(settlementRequestBody, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OffExchangesApi#settleOffExchangeTrades");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OffExchangesApi#settleOffExchangeTrades");
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
| **settlementRequestBody** | [**SettlementRequestBody**](SettlementRequestBody.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SettlementResponse**](SettlementResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A settlement object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

