# FiatAccountsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**depositFundsFromLinkedDDA**](FiatAccountsApi.md#depositFundsFromLinkedDDA) | **POST** /fiat_accounts/{accountId}/deposit_from_linked_dda | Deposit funds from DDA |
| [**depositFundsFromLinkedDDAWithHttpInfo**](FiatAccountsApi.md#depositFundsFromLinkedDDAWithHttpInfo) | **POST** /fiat_accounts/{accountId}/deposit_from_linked_dda | Deposit funds from DDA |
| [**getFiatAccount**](FiatAccountsApi.md#getFiatAccount) | **GET** /fiat_accounts/{accountId} | Find a specific fiat account |
| [**getFiatAccountWithHttpInfo**](FiatAccountsApi.md#getFiatAccountWithHttpInfo) | **GET** /fiat_accounts/{accountId} | Find a specific fiat account |
| [**getFiatAccounts**](FiatAccountsApi.md#getFiatAccounts) | **GET** /fiat_accounts | List fiat accounts |
| [**getFiatAccountsWithHttpInfo**](FiatAccountsApi.md#getFiatAccountsWithHttpInfo) | **GET** /fiat_accounts | List fiat accounts |
| [**redeemFundsToLinkedDDA**](FiatAccountsApi.md#redeemFundsToLinkedDDA) | **POST** /fiat_accounts/{accountId}/redeem_to_linked_dda | Redeem funds to DDA |
| [**redeemFundsToLinkedDDAWithHttpInfo**](FiatAccountsApi.md#redeemFundsToLinkedDDAWithHttpInfo) | **POST** /fiat_accounts/{accountId}/redeem_to_linked_dda | Redeem funds to DDA |



## depositFundsFromLinkedDDA

> CompletableFuture<Void> depositFundsFromLinkedDDA(accountId, funds, idempotencyKey)

Deposit funds from DDA

Deposits funds from the linked DDA.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.FiatAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        FiatAccountsApi apiInstance = new FiatAccountsApi(defaultClient);
        String accountId = "accountId_example"; // String | The ID of the fiat account to use
        Funds funds = new Funds(); // Funds | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.depositFundsFromLinkedDDA(accountId, funds, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#depositFundsFromLinkedDDA");
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
| **accountId** | **String**| The ID of the fiat account to use | |
| **funds** | [**Funds**](Funds.md)|  | [optional] |
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

## depositFundsFromLinkedDDAWithHttpInfo

> CompletableFuture<ApiResponse<Void>> depositFundsFromLinkedDDA depositFundsFromLinkedDDAWithHttpInfo(accountId, funds, idempotencyKey)

Deposit funds from DDA

Deposits funds from the linked DDA.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.FiatAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        FiatAccountsApi apiInstance = new FiatAccountsApi(defaultClient);
        String accountId = "accountId_example"; // String | The ID of the fiat account to use
        Funds funds = new Funds(); // Funds | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.depositFundsFromLinkedDDAWithHttpInfo(accountId, funds, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling FiatAccountsApi#depositFundsFromLinkedDDA");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#depositFundsFromLinkedDDA");
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
| **accountId** | **String**| The ID of the fiat account to use | |
| **funds** | [**Funds**](Funds.md)|  | [optional] |
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


## getFiatAccount

> CompletableFuture<FiatAccount> getFiatAccount(accountId)

Find a specific fiat account

Returns a fiat account by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.FiatAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        FiatAccountsApi apiInstance = new FiatAccountsApi(defaultClient);
        String accountId = "accountId_example"; // String | The ID of the fiat account to return
        try {
            CompletableFuture<FiatAccount> result = apiInstance.getFiatAccount(accountId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#getFiatAccount");
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
| **accountId** | **String**| The ID of the fiat account to return | |

### Return type

CompletableFuture<[**FiatAccount**](FiatAccount.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A fiat account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getFiatAccountWithHttpInfo

> CompletableFuture<ApiResponse<FiatAccount>> getFiatAccount getFiatAccountWithHttpInfo(accountId)

Find a specific fiat account

Returns a fiat account by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.FiatAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        FiatAccountsApi apiInstance = new FiatAccountsApi(defaultClient);
        String accountId = "accountId_example"; // String | The ID of the fiat account to return
        try {
            CompletableFuture<ApiResponse<FiatAccount>> response = apiInstance.getFiatAccountWithHttpInfo(accountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling FiatAccountsApi#getFiatAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#getFiatAccount");
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
| **accountId** | **String**| The ID of the fiat account to return | |

### Return type

CompletableFuture<ApiResponse<[**FiatAccount**](FiatAccount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A fiat account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getFiatAccounts

> CompletableFuture<List<FiatAccount>> getFiatAccounts()

List fiat accounts

Returns all fiat accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.FiatAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        FiatAccountsApi apiInstance = new FiatAccountsApi(defaultClient);
        try {
            CompletableFuture<List<FiatAccount>> result = apiInstance.getFiatAccounts();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#getFiatAccounts");
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

CompletableFuture<[**List&lt;FiatAccount&gt;**](FiatAccount.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A fiat account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getFiatAccountsWithHttpInfo

> CompletableFuture<ApiResponse<List<FiatAccount>>> getFiatAccounts getFiatAccountsWithHttpInfo()

List fiat accounts

Returns all fiat accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.FiatAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        FiatAccountsApi apiInstance = new FiatAccountsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<FiatAccount>>> response = apiInstance.getFiatAccountsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling FiatAccountsApi#getFiatAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#getFiatAccounts");
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

CompletableFuture<ApiResponse<[**List&lt;FiatAccount&gt;**](FiatAccount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A fiat account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## redeemFundsToLinkedDDA

> CompletableFuture<Void> redeemFundsToLinkedDDA(accountId, funds, idempotencyKey)

Redeem funds to DDA

Redeems funds to the linked DDA.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.FiatAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        FiatAccountsApi apiInstance = new FiatAccountsApi(defaultClient);
        String accountId = "accountId_example"; // String | The ID of the fiat account to use
        Funds funds = new Funds(); // Funds | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.redeemFundsToLinkedDDA(accountId, funds, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#redeemFundsToLinkedDDA");
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
| **accountId** | **String**| The ID of the fiat account to use | |
| **funds** | [**Funds**](Funds.md)|  | [optional] |
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

## redeemFundsToLinkedDDAWithHttpInfo

> CompletableFuture<ApiResponse<Void>> redeemFundsToLinkedDDA redeemFundsToLinkedDDAWithHttpInfo(accountId, funds, idempotencyKey)

Redeem funds to DDA

Redeems funds to the linked DDA.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.FiatAccountsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        FiatAccountsApi apiInstance = new FiatAccountsApi(defaultClient);
        String accountId = "accountId_example"; // String | The ID of the fiat account to use
        Funds funds = new Funds(); // Funds | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.redeemFundsToLinkedDDAWithHttpInfo(accountId, funds, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling FiatAccountsApi#redeemFundsToLinkedDDA");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#redeemFundsToLinkedDDA");
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
| **accountId** | **String**| The ID of the fiat account to use | |
| **funds** | [**Funds**](Funds.md)|  | [optional] |
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

