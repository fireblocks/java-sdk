# PolicyEditorV2BetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPolicyRuleQuota**](PolicyEditorV2BetaApi.md#getPolicyRuleQuota) | **POST** /policy/rules/quota | Calculate the AOT quota for a policy rule |



## getPolicyRuleQuota

> CompletableFuture<ApiResponse<PolicyRuleQuotaResponse>> getPolicyRuleQuota getPolicyRuleQuota(policyRuleQuotaRequest, idempotencyKey)

Calculate the AOT quota for a policy rule

Returns the Amount Over Time (AOT) quota calculated for a specific policy rule.  Endpoint Permissions: Owner, Admin, Non-Signing Admin. 

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
import com.fireblocks.sdk.api.PolicyEditorV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        PolicyRuleQuotaRequest policyRuleQuotaRequest = new PolicyRuleQuotaRequest(); // PolicyRuleQuotaRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<PolicyRuleQuotaResponse>> response = fireblocks.policyEditorV2Beta().getPolicyRuleQuota(policyRuleQuotaRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorV2BetaApi#getPolicyRuleQuota");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyRuleQuotaRequest** | [**PolicyRuleQuotaRequest**](PolicyRuleQuotaRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PolicyRuleQuotaResponse**](PolicyRuleQuotaResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The calculated AOT quota for the rule |  * X-Request-ID -  <br>  |
| **400** | Invalid request parameters or rule configuration prevents AOT calculation. |  * X-Request-ID -  <br>  |
| **403** | Caller lacks permission to access the requested rule. |  * X-Request-ID -  <br>  |
| **404** | The requested policy rule was not found. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal server error while calculating AOT quota. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

