# PaymentsPayoutApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPayout**](PaymentsPayoutApi.md#createPayout) | **POST** /payments/payout | Create a payout instruction set |
| [**executePayoutAction**](PaymentsPayoutApi.md#executePayoutAction) | **POST** /payments/payout/{payoutId}/actions/execute | Execute a payout instruction set |
| [**getPayout**](PaymentsPayoutApi.md#getPayout) | **GET** /payments/payout/{payoutId} | Get the status of a payout instruction set |



## createPayout

> CompletableFuture<ApiResponse<PayoutResponse>> createPayout createPayout(createPayoutRequest, idempotencyKey)

Create a payout instruction set

**Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; &lt;/br&gt; &lt;b u&gt;Create a payout instruction set.&lt;/b&gt; &lt;/u&gt;&lt;/br&gt; A payout instruction set is a set of instructions for distributing payments from a single payment account to a list of payee accounts. &lt;/br&gt; The instruction set defines: &lt;/br&gt; &lt;ul&gt; &lt;li&gt;the payment account and its account type (vault, exchange, or fiat). &lt;/li&gt; &lt;li&gt;the account type (vault account, exchange account, whitelisted address, network connection, fiat account, or merchant account), the amount, and the asset of payment for each payee account.&lt;/li&gt; &lt;/ul&gt; 

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
import com.fireblocks.sdk.api.PaymentsPayoutApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreatePayoutRequest createPayoutRequest = new CreatePayoutRequest(); // CreatePayoutRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<PayoutResponse>> response = fireblocks.paymentsPayout().createPayout(createPayoutRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PaymentsPayoutApi#createPayout");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsPayoutApi#createPayout");
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
| **createPayoutRequest** | [**CreatePayoutRequest**](CreatePayoutRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PayoutResponse**](PayoutResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The payout instruction set creation succeeded and returns the generated instruction set with a unique payout IDThe payout ID will be used for executing the payout and checking the payout status. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **5XX** | Internal error. |  -  |


## executePayoutAction

> CompletableFuture<ApiResponse<DispatchPayoutResponse>> executePayoutAction executePayoutAction(payoutId, idempotencyKey)

Execute a payout instruction set

**Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; &lt;/br&gt;&lt;b u&gt;Execute a payout instruction set.&lt;/b&gt; &lt;/u&gt; &lt;/br&gt; &lt;/br&gt;The instruction set will be verified and executed.&lt;/br&gt; &lt;b&gt;&lt;u&gt;Source locking&lt;/br&gt;&lt;/b&gt; &lt;/u&gt; If you are executing a payout instruction set from a payment account with an already active payout the active payout will complete before the new payout instruction set can be executed. &lt;/br&gt; You cannot execute the same payout instruction set more than once. 

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
import com.fireblocks.sdk.api.PaymentsPayoutApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String payoutId = "1fe3b61f-7e1f-4a19-aff0-4f0a524d44d7"; // String | the payout id received from the creation of the payout instruction set
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<DispatchPayoutResponse>> response = fireblocks.paymentsPayout().executePayoutAction(payoutId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PaymentsPayoutApi#executePayoutAction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsPayoutApi#executePayoutAction");
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
| **payoutId** | **String**| the payout id received from the creation of the payout instruction set | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**DispatchPayoutResponse**](DispatchPayoutResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Executed the payout instruction set |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **5XX** | Internal error. |  -  |


## getPayout

> CompletableFuture<ApiResponse<PayoutResponse>> getPayout getPayout(payoutId)

Get the status of a payout instruction set

**Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; 

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
import com.fireblocks.sdk.api.PaymentsPayoutApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String payoutId = "1fe3b61f-7e1f-4a19-aff0-4f0a524d44d7"; // String | the payout id received from the creation of the payout instruction set
        try {
            CompletableFuture<ApiResponse<PayoutResponse>> response = fireblocks.paymentsPayout().getPayout(payoutId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PaymentsPayoutApi#getPayout");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsPayoutApi#getPayout");
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
| **payoutId** | **String**| the payout id received from the creation of the payout instruction set | |

### Return type

CompletableFuture<ApiResponse<[**PayoutResponse**](PayoutResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the current status of the payout instruction set, including the status of each payout instruction and the transactions created in the process. |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | No payout with the given payout ID exists. |  -  |
| **5XX** | Internal error. |  -  |

