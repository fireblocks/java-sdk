# PolicyEditorV2BetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActivePolicy**](PolicyEditorV2BetaApi.md#getActivePolicy) | **GET** /policy/active_policy | Get the active policy and its validation by policy type |
| [**getDraft**](PolicyEditorV2BetaApi.md#getDraft) | **GET** /policy/draft | Get the active draft by policy type |
| [**publishDraft**](PolicyEditorV2BetaApi.md#publishDraft) | **POST** /policy/draft | Send publish request for a certain draft id |
| [**updateDraft**](PolicyEditorV2BetaApi.md#updateDraft) | **PUT** /policy/draft | Update the draft with a new set of rules by policy types |



## getActivePolicy

> CompletableFuture<ApiResponse<PolicyAndValidationResponse>> getActivePolicy getActivePolicy(policyType)

Get the active policy and its validation by policy type

Returns the active policy and its validation for a specific policy type. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. 

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

        PolicyType policyType = PolicyType.fromValue("TRANSFER"); // PolicyType | The policy type(s) to retrieve. Can be a single type or multiple types by repeating the parameter (e.g., ?policyType=TRANSFER&policyType=MINT).
        try {
            CompletableFuture<ApiResponse<PolicyAndValidationResponse>> response = fireblocks.policyEditorV2Beta().getActivePolicy(policyType);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorV2BetaApi#getActivePolicy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorV2BetaApi#getActivePolicy");
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
| **policyType** | [**PolicyType**](.md)| The policy type(s) to retrieve. Can be a single type or multiple types by repeating the parameter (e.g., ?policyType&#x3D;TRANSFER&amp;policyType&#x3D;MINT). | [enum: TRANSFER, STAKE, CONTRACT_CALL, TYPED_MESSAGE, APPROVE, MINT, BURN, RAW, COMPLIANCE, DEPLOYMENT, PROGRAM_CALL, DAPP_CONNECTION, UPGRADE, ORDER, AML_CHAINALYSIS_V2_SCREENING, AML_CHAINALYSIS_V2_POST_SCREENING, AML_ELLIPTIC_HOLISTIC_SCREENING, AML_ELLIPTIC_HOLISTIC_POST_SCREENING, TR_NOTABENE_SCREENING, TR_NOTABENE_POST_SCREENING] |

### Return type

CompletableFuture<ApiResponse<[**PolicyAndValidationResponse**](PolicyAndValidationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A policy object with validation |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getDraft

> CompletableFuture<ApiResponse<DraftReviewAndValidationResponse>> getDraft getDraft(policyType)

Get the active draft by policy type

Returns the active draft and its validation for a specific policy type. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. 

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

        PolicyType policyType = PolicyType.fromValue("TRANSFER"); // PolicyType | The policy type(s) to retrieve. Can be a single type or multiple types by repeating the parameter (e.g., ?policyType=TRANSFER&policyType=MINT).
        try {
            CompletableFuture<ApiResponse<DraftReviewAndValidationResponse>> response = fireblocks.policyEditorV2Beta().getDraft(policyType);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorV2BetaApi#getDraft");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorV2BetaApi#getDraft");
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
| **policyType** | [**PolicyType**](.md)| The policy type(s) to retrieve. Can be a single type or multiple types by repeating the parameter (e.g., ?policyType&#x3D;TRANSFER&amp;policyType&#x3D;MINT). | [enum: TRANSFER, STAKE, CONTRACT_CALL, TYPED_MESSAGE, APPROVE, MINT, BURN, RAW, COMPLIANCE, DEPLOYMENT, PROGRAM_CALL, DAPP_CONNECTION, UPGRADE, ORDER, AML_CHAINALYSIS_V2_SCREENING, AML_CHAINALYSIS_V2_POST_SCREENING, AML_ELLIPTIC_HOLISTIC_SCREENING, AML_ELLIPTIC_HOLISTIC_POST_SCREENING, TR_NOTABENE_SCREENING, TR_NOTABENE_POST_SCREENING] |

### Return type

CompletableFuture<ApiResponse<[**DraftReviewAndValidationResponse**](DraftReviewAndValidationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A draft validation response object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## publishDraft

> CompletableFuture<ApiResponse<PublishResult>> publishDraft publishDraft(publishDraftRequest, idempotencyKey)

Send publish request for a certain draft id

Send publish request of certain draft id and returns the response. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Policy Editor, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

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

        PublishDraftRequest publishDraftRequest = new PublishDraftRequest(); // PublishDraftRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<PublishResult>> response = fireblocks.policyEditorV2Beta().publishDraft(publishDraftRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorV2BetaApi#publishDraft");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorV2BetaApi#publishDraft");
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
| **publishDraftRequest** | [**PublishDraftRequest**](PublishDraftRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PublishResult**](PublishResult.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A policy publish result object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateDraft

> CompletableFuture<ApiResponse<DraftReviewAndValidationResponse>> updateDraft updateDraft(updateDraftRequest, idempotencyKey)

Update the draft with a new set of rules by policy types

Update the draft and return its validation for specific policy types. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. 

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

        UpdateDraftRequest updateDraftRequest = new UpdateDraftRequest(); // UpdateDraftRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<DraftReviewAndValidationResponse>> response = fireblocks.policyEditorV2Beta().updateDraft(updateDraftRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorV2BetaApi#updateDraft");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorV2BetaApi#updateDraft");
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
| **updateDraftRequest** | [**UpdateDraftRequest**](UpdateDraftRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**DraftReviewAndValidationResponse**](DraftReviewAndValidationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A draft validation response object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

