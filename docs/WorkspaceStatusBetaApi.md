# WorkspaceStatusBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWorkspaceStatus**](WorkspaceStatusBetaApi.md#getWorkspaceStatus) | **GET** /management/workspace_status | Returns current workspace status |
| [**getWorkspaceStatusWithHttpInfo**](WorkspaceStatusBetaApi.md#getWorkspaceStatusWithHttpInfo) | **GET** /management/workspace_status | Returns current workspace status |



## getWorkspaceStatus

> CompletableFuture<GetWorkspaceStatus200Response> getWorkspaceStatus()

Returns current workspace status

Returns current workspace status

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.WorkspaceStatusBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        WorkspaceStatusBetaApi apiInstance = new WorkspaceStatusBetaApi(defaultClient);
        try {
            CompletableFuture<GetWorkspaceStatus200Response> result = apiInstance.getWorkspaceStatus();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceStatusBetaApi#getWorkspaceStatus");
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

CompletableFuture<[**GetWorkspaceStatus200Response**](GetWorkspaceStatus200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current workspace status |  -  |
| **404** | Workspace not found |  -  |

## getWorkspaceStatusWithHttpInfo

> CompletableFuture<ApiResponse<GetWorkspaceStatus200Response>> getWorkspaceStatus getWorkspaceStatusWithHttpInfo()

Returns current workspace status

Returns current workspace status

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.WorkspaceStatusBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        WorkspaceStatusBetaApi apiInstance = new WorkspaceStatusBetaApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<GetWorkspaceStatus200Response>> response = apiInstance.getWorkspaceStatusWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WorkspaceStatusBetaApi#getWorkspaceStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkspaceStatusBetaApi#getWorkspaceStatus");
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

CompletableFuture<ApiResponse<[**GetWorkspaceStatus200Response**](GetWorkspaceStatus200Response.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current workspace status |  -  |
| **404** | Workspace not found |  -  |

