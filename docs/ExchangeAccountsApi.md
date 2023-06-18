# ExchangeAccountsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convertAssets**](ExchangeAccountsApi.md#convertAssets) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC, USDC to USD) and Bitso (MXN to USD) are supported conversions. |
| [**getExchangeAccountAsset**](ExchangeAccountsApi.md#getExchangeAccountAsset) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account |
| [**getExchangeAccountById**](ExchangeAccountsApi.md#getExchangeAccountById) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account |
| [**getExchangeAccounts**](ExchangeAccountsApi.md#getExchangeAccounts) | **GET** /exchange_accounts | List exchange accounts |
| [**internalTransfer**](ExchangeAccountsApi.md#internalTransfer) | **POST** /exchange_accounts/{exchangeAccountId}/internal_transfer | Internal tranfer for exchange accounts |



## convertAssets

> convertAssets(exchangeAccountId, convertAssetsRequest)

Convert exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC, USDC to USD) and Bitso (MXN to USD) are supported conversions.

Convert assets within an exchange account

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account. Please make sure the exchange supports conversions. To find the ID of your exchange account, use GET/exchange_accounts.
        ConvertAssetsRequest convertAssetsRequest = new ConvertAssetsRequest(); // ConvertAssetsRequest | 
        try {
            apiInstance.convertAssets(exchangeAccountId, convertAssetsRequest);
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
| **200** | Conversion successful |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getExchangeAccountAsset

> ExchangeAsset getExchangeAccountAsset(exchangeAccountId, assetId)

Find an asset for an exchange account

Returns an asset for an exchange account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            ExchangeAsset result = apiInstance.getExchangeAccountAsset(exchangeAccountId, assetId);
            System.out.println(result);
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

[**ExchangeAsset**](ExchangeAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An ExchangeAccountAsset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getExchangeAccountById

> ExchangeAccount getExchangeAccountById(exchangeAccountId)

Find a specific exchange account

Returns an exchange account by ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        try {
            ExchangeAccount result = apiInstance.getExchangeAccountById(exchangeAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeAccountsApi#getExchangeAccountById");
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


## getExchangeAccounts

> List&lt;ExchangeAccount&gt; getExchangeAccounts()

List exchange accounts

Returns all exchange accounts.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        try {
            List<ExchangeAccount> result = apiInstance.getExchangeAccounts();
            System.out.println(result);
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

[**List&lt;ExchangeAccount&gt;**](ExchangeAccount.md)

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


## internalTransfer

> internalTransfer(exchangeAccountId, internalTransferRequest)

Internal tranfer for exchange accounts

Transfers funds between trading accounts under the same exchange account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExchangeAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ExchangeAccountsApi apiInstance = new ExchangeAccountsApi(defaultClient);
        String exchangeAccountId = "exchangeAccountId_example"; // String | The ID of the exchange account to return
        InternalTransferRequest internalTransferRequest = new InternalTransferRequest(); // InternalTransferRequest | 
        try {
            apiInstance.internalTransfer(exchangeAccountId, internalTransferRequest);
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
| **internalTransferRequest** | [**InternalTransferRequest**](InternalTransferRequest.md)|  | [optional] |

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

