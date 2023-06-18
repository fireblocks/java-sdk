# OffExchangesApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOffExchange**](OffExchangesApi.md#addOffExchange) | **POST** /off_exchange/add | add collateral |
| [**getOffExchangeCollateralAccounts**](OffExchangesApi.md#getOffExchangeCollateralAccounts) | **GET** /off_exchange/collateral_accounts/{mainExchangeAccountId} | Find a specific collateral exchange account |
| [**getOffExchangeSettlementTransactions**](OffExchangesApi.md#getOffExchangeSettlementTransactions) | **GET** /off_exchange/settlements/transactions | get settlements transactions from exchange |
| [**removeOffExchange**](OffExchangesApi.md#removeOffExchange) | **POST** /off_exchange/remove | remove collateral |
| [**settleOffExchangeTrades**](OffExchangesApi.md#settleOffExchangeTrades) | **POST** /off_exchange/settlements/trader | create settlement for a trader |



## addOffExchange

> CreateTransactionResponse addOffExchange(addCollateralRequestBody)

add collateral

add collateral, create deposit request

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffExchangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        AddCollateralRequestBody addCollateralRequestBody = new AddCollateralRequestBody(); // AddCollateralRequestBody | 
        try {
            CreateTransactionResponse result = apiInstance.addOffExchange(addCollateralRequestBody);
            System.out.println(result);
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

### Return type

[**CreateTransactionResponse**](CreateTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A transaction object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getOffExchangeCollateralAccounts

> ExchangeAccount getOffExchangeCollateralAccounts(mainExchangeAccountId)

Find a specific collateral exchange account

Returns a collateral account by mainExchangeAccountId.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffExchangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        String mainExchangeAccountId = "mainExchangeAccountId_example"; // String | The id of the main exchange account for which the requested collateral account is associated with
        try {
            ExchangeAccount result = apiInstance.getOffExchangeCollateralAccounts(mainExchangeAccountId);
            System.out.println(result);
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

[**ExchangeAccount**](ExchangeAccount.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An ExchangeAccount object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getOffExchangeSettlementTransactions

> SettlementResponse getOffExchangeSettlementTransactions(mainExchangeAccountId)

get settlements transactions from exchange

get settlements transactions from exchange

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffExchangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        String mainExchangeAccountId = "mainExchangeAccountId_example"; // String | 
        try {
            SettlementResponse result = apiInstance.getOffExchangeSettlementTransactions(mainExchangeAccountId);
            System.out.println(result);
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

[**SettlementResponse**](SettlementResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A settlement transactions |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## removeOffExchange

> CreateTransactionResponse removeOffExchange(removeCollateralRequestBody)

remove collateral

remove collateral, create withdraw request

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffExchangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        RemoveCollateralRequestBody removeCollateralRequestBody = new RemoveCollateralRequestBody(); // RemoveCollateralRequestBody | 
        try {
            CreateTransactionResponse result = apiInstance.removeOffExchange(removeCollateralRequestBody);
            System.out.println(result);
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

### Return type

[**CreateTransactionResponse**](CreateTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A transaction object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## settleOffExchangeTrades

> SettlementResponse settleOffExchangeTrades(settlementRequestBody)

create settlement for a trader

create settlement for a trader

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffExchangesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        OffExchangesApi apiInstance = new OffExchangesApi(defaultClient);
        SettlementRequestBody settlementRequestBody = new SettlementRequestBody(); // SettlementRequestBody | 
        try {
            SettlementResponse result = apiInstance.settleOffExchangeTrades(settlementRequestBody);
            System.out.println(result);
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

### Return type

[**SettlementResponse**](SettlementResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A settlement object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

