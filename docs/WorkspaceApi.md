# WorkspaceApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**freezeWorkspace**](WorkspaceApi.md#freezeWorkspace) | **POST** /workspace/freeze | Freeze Workspace |
| [**freezeWorkspaceWithHttpInfo**](WorkspaceApi.md#freezeWorkspaceWithHttpInfo) | **POST** /workspace/freeze | Freeze Workspace |



## freezeWorkspace

> CompletableFuture<Void> freezeWorkspace(idempotencyKey)

Freeze Workspace

Freezes a Workspace so that ALL operations by ANY user are blocked.  You should only perform this action when the workspace faces imminent risk, such as when you have a security breach.  To unfreeze a workspace, the workspace Owner must submit a request to Fireblocks Support.  **NOTE:**  - This operation can only be performed by the workspace Owner - Your workspace continues to receive incoming transfers during this time. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.WorkspaceApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.freezeWorkspace(idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#freezeWorkspace");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | indicates that the workspace is now frozen |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## freezeWorkspaceWithHttpInfo

> CompletableFuture<ApiResponse<Void>> freezeWorkspace freezeWorkspaceWithHttpInfo(idempotencyKey)

Freeze Workspace

Freezes a Workspace so that ALL operations by ANY user are blocked.  You should only perform this action when the workspace faces imminent risk, such as when you have a security breach.  To unfreeze a workspace, the workspace Owner must submit a request to Fireblocks Support.  **NOTE:**  - This operation can only be performed by the workspace Owner - Your workspace continues to receive incoming transfers during this time. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.WorkspaceApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.freezeWorkspaceWithHttpInfo(idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WorkspaceApi#freezeWorkspace");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceApi#freezeWorkspace");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | indicates that the workspace is now frozen |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

