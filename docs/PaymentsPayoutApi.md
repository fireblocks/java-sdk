# PaymentsPayoutApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPayout**](PaymentsPayoutApi.md#createPayout) | **POST** /payments/payout | Create a payout instruction set |
| [**executePayoutAction**](PaymentsPayoutApi.md#executePayoutAction) | **POST** /payments/payout/{payoutId}/actions/execute | Execute a payout instruction set |
| [**getPayoutById**](PaymentsPayoutApi.md#getPayoutById) | **GET** /payments/payout/{payoutId} | Get the status of a payout instruction set |



## createPayout

> PayoutResponse createPayout(createPayoutRequest)

Create a payout instruction set

**Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. </br>
</br>These endpoints are currently in beta and might be subject to changes.</br>
</br>If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. </br>
</br> <b u>Create a payout instruction set.</b> </u></br>
A payout instruction set is a set of instructions for distributing payments from a single payment account to a list of payee accounts. </br>
The instruction set defines: </br>
<ul>
<li>the payment account and its account type (vault, exchange, or fiat). </li>
<li>the account type (vault account, exchange account, whitelisted address, network connection, fiat account, or merchant account), the amount, and the asset of payment for each payee account.</li>
</ul>


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.PaymentsPayoutApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        PaymentsPayoutApi apiInstance = new PaymentsPayoutApi(configuration);
        CreatePayoutRequest createPayoutRequest = new CreatePayoutRequest(); // CreatePayoutRequest | 
        try {
            PayoutResponse result = apiInstance.createPayout(createPayoutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsPayoutApi#createPayout");
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
| **createPayoutRequest** | [**CreatePayoutRequest**](CreatePayoutRequest.md)|  | [optional] |

### Return type

[**PayoutResponse**](PayoutResponse.md)

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

> DispatchPayoutResponse executePayoutAction(payoutId)

Execute a payout instruction set

**Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. </br>
</br>These endpoints are currently in beta and might be subject to changes.</br>
</br>If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. </br>
</br><b u>Execute a payout instruction set.</b> </u> </br>
</br>The instruction set will be verified and executed.</br>
<b><u>Source locking</br></b> </u>
If you are executing a payout instruction set from a payment account with an already active payout the active payout will complete before the new payout instruction set can be executed. </br>
You cannot execute the same payout instruction set more than once.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.PaymentsPayoutApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        PaymentsPayoutApi apiInstance = new PaymentsPayoutApi(configuration);
        String payoutId = "1fe3b61f-7e1f-4a19-aff0-4f0a524d44d7"; // String | the payout id received from the creation of the payout instruction set
        try {
            DispatchPayoutResponse result = apiInstance.executePayoutAction(payoutId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsPayoutApi#executePayoutAction");
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
| **payoutId** | **String**| the payout id received from the creation of the payout instruction set | |

### Return type

[**DispatchPayoutResponse**](DispatchPayoutResponse.md)

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


## getPayoutById

> PayoutResponse getPayoutById(payoutId)

Get the status of a payout instruction set

**Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. </br>
</br>These endpoints are currently in beta and might be subject to changes.</br>
</br>If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. </br>


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.PaymentsPayoutApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        PaymentsPayoutApi apiInstance = new PaymentsPayoutApi(configuration);
        String payoutId = "1fe3b61f-7e1f-4a19-aff0-4f0a524d44d7"; // String | the payout id received from the creation of the payout instruction set
        try {
            PayoutResponse result = apiInstance.getPayoutById(payoutId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsPayoutApi#getPayoutById");
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
| **payoutId** | **String**| the payout id received from the creation of the payout instruction set | |

### Return type

[**PayoutResponse**](PayoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the current status of the payout instruction set, including the status of each payout instruction and the transactions created in the process. |  -  |
| **404** | No payout with the given payout ID exists. |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **5XX** | Internal error. |  -  |

