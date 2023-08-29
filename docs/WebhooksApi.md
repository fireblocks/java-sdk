# WebhooksApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resendWebhooks**](WebhooksApi.md#resendWebhooks) | **POST** /webhooks/resend | Resend failed webhooks |
| [**resendWebhooksForTransaction**](WebhooksApi.md#resendWebhooksForTransaction) | **POST** /webhooks/resend/{txId} | Resend failed webhooks for a transaction by ID |



## resendWebhooks

> ResendWebhooksResponse resendWebhooks()

Resend failed webhooks

Resends all failed webhook notifications.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        WebhooksApi apiInstance = new WebhooksApi(configuration);
        try {
            ResendWebhooksResponse result = apiInstance.resendWebhooks();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#resendWebhooks");
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

[**ResendWebhooksResponse**](ResendWebhooksResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## resendWebhooksForTransaction

> resendWebhooksForTransaction(txId, resendWebhooksForTransactionRequest)

Resend failed webhooks for a transaction by ID

Resends failed webhook notifications for a transaction by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        WebhooksApi apiInstance = new WebhooksApi(configuration);
        String txId = "txId_example"; // String | The ID of the transaction for webhooks
        ResendWebhooksForTransactionRequest resendWebhooksForTransactionRequest = new ResendWebhooksForTransactionRequest(); // ResendWebhooksForTransactionRequest | 
        try {
            apiInstance.resendWebhooksForTransaction(txId, resendWebhooksForTransactionRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#resendWebhooksForTransaction");
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
| **txId** | **String**| The ID of the transaction for webhooks | |
| **resendWebhooksForTransactionRequest** | [**ResendWebhooksForTransactionRequest**](ResendWebhooksForTransactionRequest.md)|  | |

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
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

