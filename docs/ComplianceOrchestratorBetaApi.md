# ComplianceOrchestratorBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getScreeningResult**](ComplianceOrchestratorBetaApi.md#getScreeningResult) | **GET** /compliance/orchestrator/screenings/{screeningId} | Get a Compliance Orchestrator screening&#39;s result |
| [**getWorkflow**](ComplianceOrchestratorBetaApi.md#getWorkflow) | **GET** /compliance/orchestrator/workflows/{workflowId} | Get a Compliance Orchestrator workflow |
| [**triggerScreening**](ComplianceOrchestratorBetaApi.md#triggerScreening) | **POST** /compliance/orchestrator/screenings | Trigger a Compliance Orchestrator screening |
| [**updateWorkflowStatus**](ComplianceOrchestratorBetaApi.md#updateWorkflowStatus) | **PATCH** /compliance/orchestrator/workflows/{workflowId}/status | Update a Compliance Orchestrator workflow&#39;s status |



## getScreeningResult

> CompletableFuture<ApiResponse<GetScreeningResultResponse>> getScreeningResult getScreeningResult(screeningId)

Get a Compliance Orchestrator screening&#39;s result

Returns the result of a screening started by &#x60;POST /v1/compliance/orchestrator/screenings&#x60;, with a result per workflow step and an audit log. Safe to poll: a screening still in flight reports &#x60;PENDING&#x60; or &#x60;RUNNING&#x60;. Only screenings owned by the requesting tenant are returned.

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
import com.fireblocks.sdk.api.ComplianceOrchestratorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String screeningId = "a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5d"; // String | The screening's identifier, returned by `POST /v1/compliance/orchestrator/screenings`.
        try {
            CompletableFuture<ApiResponse<GetScreeningResultResponse>> response = fireblocks.complianceOrchestratorBeta().getScreeningResult(screeningId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceOrchestratorBetaApi#getScreeningResult");
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
| **screeningId** | **String**| The screening&#39;s identifier, returned by &#x60;POST /v1/compliance/orchestrator/screenings&#x60;. | |

### Return type

CompletableFuture<ApiResponse<[**GetScreeningResultResponse**](GetScreeningResultResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Screening result |  * X-Request-ID -  <br>  |
| **400** | Invalid request arguments. |  * X-Request-ID -  <br>  |
| **404** | Screening result not found. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getWorkflow

> CompletableFuture<ApiResponse<GetWorkflowResponse>> getWorkflow getWorkflow(workflowId)

Get a Compliance Orchestrator workflow

Returns a workflow&#39;s status and its steps in execution order. Read it to see what a given &#x60;workflowId&#x60; will screen, and which fields its rules may reference.

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
import com.fireblocks.sdk.api.ComplianceOrchestratorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String workflowId = "f47ac10b-58cc-4372-a567-0e02b2c3d479"; // String | The workflow's identifier.
        try {
            CompletableFuture<ApiResponse<GetWorkflowResponse>> response = fireblocks.complianceOrchestratorBeta().getWorkflow(workflowId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceOrchestratorBetaApi#getWorkflow");
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
| **workflowId** | **String**| The workflow&#39;s identifier. | |

### Return type

CompletableFuture<ApiResponse<[**GetWorkflowResponse**](GetWorkflowResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Workflow |  * X-Request-ID -  <br>  |
| **400** | Invalid request arguments. |  * X-Request-ID -  <br>  |
| **404** | Workflow not found. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## triggerScreening

> CompletableFuture<ApiResponse<TriggerScreeningResponse>> triggerScreening triggerScreening(triggerScreeningRequest, idempotencyKey)

Trigger a Compliance Orchestrator screening

Starts a compliance screening against an active workflow and returns a &#x60;screeningId&#x60;. The screening runs asynchronously — poll &#x60;GET /v1/compliance/orchestrator/screenings/{screeningId}&#x60; for the result.  Unlike the screening that applies automatically to submitted transactions under &#x60;/v1/screening&#x60;, this is called on demand, before anything exists on-chain.

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
import com.fireblocks.sdk.api.ComplianceOrchestratorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TriggerScreeningRequest triggerScreeningRequest = new TriggerScreeningRequest(); // TriggerScreeningRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TriggerScreeningResponse>> response = fireblocks.complianceOrchestratorBeta().triggerScreening(triggerScreeningRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceOrchestratorBetaApi#triggerScreening");
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
| **triggerScreeningRequest** | [**TriggerScreeningRequest**](TriggerScreeningRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TriggerScreeningResponse**](TriggerScreeningResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Screening accepted |  * X-Request-ID -  <br>  |
| **400** | Invalid or missing required input fields. |  * X-Request-ID -  <br>  |
| **404** | Workflow not found. |  * X-Request-ID -  <br>  |
| **409** | Workflow is not active. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateWorkflowStatus

> CompletableFuture<ApiResponse<UpdateWorkflowStatusResponse>> updateWorkflowStatus updateWorkflowStatus(updateWorkflowStatusRequest, workflowId, idempotencyKey)

Update a Compliance Orchestrator workflow&#39;s status

Moves a workflow between &#x60;DRAFT&#x60; and &#x60;ACTIVE&#x60;. A workflow must be &#x60;ACTIVE&#x60; before &#x60;POST /v1/compliance/orchestrator/screenings&#x60; will accept a screening against it. Returns the workflow&#39;s id and new status, not its full configuration.

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
import com.fireblocks.sdk.api.ComplianceOrchestratorBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpdateWorkflowStatusRequest updateWorkflowStatusRequest = new UpdateWorkflowStatusRequest(); // UpdateWorkflowStatusRequest | 
        String workflowId = "f47ac10b-58cc-4372-a567-0e02b2c3d479"; // String | The workflow's identifier.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UpdateWorkflowStatusResponse>> response = fireblocks.complianceOrchestratorBeta().updateWorkflowStatus(updateWorkflowStatusRequest, workflowId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceOrchestratorBetaApi#updateWorkflowStatus");
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
| **updateWorkflowStatusRequest** | [**UpdateWorkflowStatusRequest**](UpdateWorkflowStatusRequest.md)|  | |
| **workflowId** | **String**| The workflow&#39;s identifier. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**UpdateWorkflowStatusResponse**](UpdateWorkflowStatusResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Workflow status updated |  * X-Request-ID -  <br>  |
| **400** | Invalid request arguments. |  * X-Request-ID -  <br>  |
| **404** | Workflow not found. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

