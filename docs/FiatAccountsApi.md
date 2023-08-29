# FiatAccountsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**depositFundsFromLinkedDDA**](FiatAccountsApi.md#depositFundsFromLinkedDDA) | **POST** /fiat_accounts/{accountId}/deposit_from_linked_dda | Deposit funds from DDA |
| [**getFiatAccountById**](FiatAccountsApi.md#getFiatAccountById) | **GET** /fiat_accounts/{accountId} | Find a specific fiat account |
| [**getFiatAccounts**](FiatAccountsApi.md#getFiatAccounts) | **GET** /fiat_accounts | List fiat accounts |
| [**redeemFundsToLinkedDDA**](FiatAccountsApi.md#redeemFundsToLinkedDDA) | **POST** /fiat_accounts/{accountId}/redeem_to_linked_dda | Redeem funds to DDA |



## depositFundsFromLinkedDDA

> depositFundsFromLinkedDDA(accountId, redeemFundsToLinkedDDARequest)

Deposit funds from DDA

Deposits funds from the linked DDA.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.FiatAccountsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        FiatAccountsApi apiInstance = new FiatAccountsApi(configuration);
        String accountId = "accountId_example"; // String | The ID of the fiat account to use
        RedeemFundsToLinkedDDARequest redeemFundsToLinkedDDARequest = new RedeemFundsToLinkedDDARequest(); // RedeemFundsToLinkedDDARequest | 
        try {
            apiInstance.depositFundsFromLinkedDDA(accountId, redeemFundsToLinkedDDARequest);
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
| **redeemFundsToLinkedDDARequest** | [**RedeemFundsToLinkedDDARequest**](RedeemFundsToLinkedDDARequest.md)|  | [optional] |

### Return type

null (empty response body)

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


## getFiatAccountById

> FiatAccount getFiatAccountById(accountId)

Find a specific fiat account

Returns a fiat account by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.FiatAccountsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        FiatAccountsApi apiInstance = new FiatAccountsApi(configuration);
        String accountId = "accountId_example"; // String | The ID of the fiat account to return
        try {
            FiatAccount result = apiInstance.getFiatAccountById(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiatAccountsApi#getFiatAccountById");
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

[**FiatAccount**](FiatAccount.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A fiat account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getFiatAccounts

> List&lt;FiatAccount&gt; getFiatAccounts()

List fiat accounts

Returns all fiat accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.FiatAccountsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        FiatAccountsApi apiInstance = new FiatAccountsApi(configuration);
        try {
            List<FiatAccount> result = apiInstance.getFiatAccounts();
            System.out.println(result);
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

[**List&lt;FiatAccount&gt;**](FiatAccount.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A fiat account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## redeemFundsToLinkedDDA

> redeemFundsToLinkedDDA(accountId, redeemFundsToLinkedDDARequest)

Redeem funds to DDA

Redeems funds to the linked DDA.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.FiatAccountsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        FiatAccountsApi apiInstance = new FiatAccountsApi(configuration);
        String accountId = "accountId_example"; // String | The ID of the fiat account to use
        RedeemFundsToLinkedDDARequest redeemFundsToLinkedDDARequest = new RedeemFundsToLinkedDDARequest(); // RedeemFundsToLinkedDDARequest | 
        try {
            apiInstance.redeemFundsToLinkedDDA(accountId, redeemFundsToLinkedDDARequest);
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
| **redeemFundsToLinkedDDARequest** | [**RedeemFundsToLinkedDDARequest**](RedeemFundsToLinkedDDARequest.md)|  | [optional] |

### Return type

null (empty response body)

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

