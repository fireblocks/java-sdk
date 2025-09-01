# PolicyEditorBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActivePolicyLegacy**](PolicyEditorBetaApi.md#getActivePolicyLegacy) | **GET** /tap/active_policy | Get the active policy and its validation |
| [**getDraftLegacy**](PolicyEditorBetaApi.md#getDraftLegacy) | **GET** /tap/draft | Get the active draft |
| [**publishDraftLegacy**](PolicyEditorBetaApi.md#publishDraftLegacy) | **POST** /tap/draft | Send publish request for a certain draft id |
| [**publishPolicyRules**](PolicyEditorBetaApi.md#publishPolicyRules) | **POST** /tap/publish | Send publish request for a set of policy rules |
| [**updateDraftLegacy**](PolicyEditorBetaApi.md#updateDraftLegacy) | **PUT** /tap/draft | Update the draft with a new set of rules |



## getActivePolicyLegacy

> CompletableFuture<ApiResponse<LegacyPolicyAndValidationResponse>> getActivePolicyLegacy getActivePolicyLegacy()

Get the active policy and its validation

Legacy Endpoint – Returns the active policy and its validation. &lt;/br&gt; **Note:**  - This endpoint will remain available for the foreseeable future and is not deprecated.&lt;/br&gt; - The &#x60;getActivePolicy&#x60; endpoint under policy/paths provides policy type-specific operations and improved functionality.&lt;/br&gt; - These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

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
import com.fireblocks.sdk.api.PolicyEditorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<LegacyPolicyAndValidationResponse>> response = fireblocks.policyEditorBeta().getActivePolicyLegacy();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorBetaApi#getActivePolicyLegacy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#getActivePolicyLegacy");
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

CompletableFuture<ApiResponse<[**LegacyPolicyAndValidationResponse**](LegacyPolicyAndValidationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A policy object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getDraftLegacy

> CompletableFuture<ApiResponse<LegacyDraftReviewAndValidationResponse>> getDraftLegacy getDraftLegacy()

Get the active draft

Legacy Endpoint – Returns the active draft and its validation. &lt;/br&gt; **Note:**  - This endpoint will remain available for the foreseeable future and is not deprecated.&lt;/br&gt; - The &#x60;getDraft&#x60; endpoint under policy/paths provides policy type-specific operations and improved functionality.&lt;/br&gt; - These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

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
import com.fireblocks.sdk.api.PolicyEditorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<LegacyDraftReviewAndValidationResponse>> response = fireblocks.policyEditorBeta().getDraftLegacy();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorBetaApi#getDraftLegacy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#getDraftLegacy");
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

CompletableFuture<ApiResponse<[**LegacyDraftReviewAndValidationResponse**](LegacyDraftReviewAndValidationResponse.md)>>


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


## publishDraftLegacy

> CompletableFuture<ApiResponse<LegacyPublishResult>> publishDraftLegacy publishDraftLegacy(legacyPublishDraftRequest, idempotencyKey)

Send publish request for a certain draft id

Legacy Endpoint – Send publish request of certain draft id and returns the response. &lt;/br&gt; **Note:**  - This endpoint will remain available for the foreseeable future and is not deprecated.&lt;/br&gt; - The &#x60;publishDraft&#x60; endpoint under policy/paths provides improved functionality and better performance.&lt;/br&gt; - These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

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
import com.fireblocks.sdk.api.PolicyEditorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        LegacyPublishDraftRequest legacyPublishDraftRequest = new LegacyPublishDraftRequest(); // LegacyPublishDraftRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<LegacyPublishResult>> response = fireblocks.policyEditorBeta().publishDraftLegacy(legacyPublishDraftRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorBetaApi#publishDraftLegacy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#publishDraftLegacy");
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
| **legacyPublishDraftRequest** | [**LegacyPublishDraftRequest**](LegacyPublishDraftRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**LegacyPublishResult**](LegacyPublishResult.md)>>


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


## publishPolicyRules

> CompletableFuture<ApiResponse<LegacyPublishResult>> publishPolicyRules publishPolicyRules(legacyPolicyRules, idempotencyKey)

Send publish request for a set of policy rules

Send publish request of set of policy rules and returns the response. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

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
import com.fireblocks.sdk.api.PolicyEditorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        LegacyPolicyRules legacyPolicyRules = new LegacyPolicyRules(); // LegacyPolicyRules | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<LegacyPublishResult>> response = fireblocks.policyEditorBeta().publishPolicyRules(legacyPolicyRules, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorBetaApi#publishPolicyRules");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#publishPolicyRules");
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
| **legacyPolicyRules** | [**LegacyPolicyRules**](LegacyPolicyRules.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**LegacyPublishResult**](LegacyPublishResult.md)>>


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


## updateDraftLegacy

> CompletableFuture<ApiResponse<LegacyDraftReviewAndValidationResponse>> updateDraftLegacy updateDraftLegacy(legacyPolicyRules, idempotencyKey)

Update the draft with a new set of rules

Legacy Endpoint – Update the draft and return its validation. &lt;/br&gt; **Note:**  - This endpoint will remain available for the foreseeable future and is not deprecated.&lt;/br&gt; - The &#x60;updateDraft&#x60; endpoint under policy/paths provides policy type-specific operations and improved functionality.&lt;/br&gt; - These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

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
import com.fireblocks.sdk.api.PolicyEditorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        LegacyPolicyRules legacyPolicyRules = new LegacyPolicyRules(); // LegacyPolicyRules | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<LegacyDraftReviewAndValidationResponse>> response = fireblocks.policyEditorBeta().updateDraftLegacy(legacyPolicyRules, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling PolicyEditorBetaApi#updateDraftLegacy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#updateDraftLegacy");
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
| **legacyPolicyRules** | [**LegacyPolicyRules**](LegacyPolicyRules.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**LegacyDraftReviewAndValidationResponse**](LegacyDraftReviewAndValidationResponse.md)>>


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

