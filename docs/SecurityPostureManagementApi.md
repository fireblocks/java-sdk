# SecurityPostureManagementApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSecurityFindingById**](SecurityPostureManagementApi.md#getSecurityFindingById) | **GET** /security/fspm/findings/{id} | Get a FSPM security finding by ID |
| [**getSecurityFindings**](SecurityPostureManagementApi.md#getSecurityFindings) | **GET** /security/fspm/findings | Get FSPM security findings |
| [**updateSecurityFindingById**](SecurityPostureManagementApi.md#updateSecurityFindingById) | **PATCH** /security/fspm/findings/{id} | Update a FSPM security finding by ID |



## getSecurityFindingById

> CompletableFuture<ApiResponse<SecurityFindingDetailed>> getSecurityFindingById getSecurityFindingById(id)

Get a FSPM security finding by ID

Returns a single FSPM security finding for the workspace, redacted to the public field set. Endpoint Roles: Security Admin, Security Auditor. 

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
import com.fireblocks.sdk.api.SecurityPostureManagementApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID id = UUID.fromString("d7ca6101-a65e-4a9c-b6c1-b8bd697e0cd2"); // UUID | Unique identifier of the finding
        try {
            CompletableFuture<ApiResponse<SecurityFindingDetailed>> response = fireblocks.securityPostureManagement().getSecurityFindingById(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SecurityPostureManagementApi#getSecurityFindingById");
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
| **id** | **UUID**| Unique identifier of the finding | |

### Return type

CompletableFuture<ApiResponse<[**SecurityFindingDetailed**](SecurityFindingDetailed.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single FSPM finding |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getSecurityFindings

> CompletableFuture<ApiResponse<GetFindingsExternalResponse>> getSecurityFindings getSecurityFindings(pageCursor, pageSize, severity, category, status)

Get FSPM security findings

Returns a paginated list of FSPM security findings for the workspace. Endpoint Roles: Security Admin, Security Auditor. 

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
import com.fireblocks.sdk.api.SecurityPostureManagementApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "pageCursor_example"; // String | Cursor indicating the page position. Omit to fetch the first page.
        Integer pageSize = 10; // Integer | Number of results per page
        String severity = "INFO"; // String | Filter by severity level
        String category = "USER_MANAGEMENT"; // String | Filter by finding category
        String status = "OPEN"; // String | Filter by finding status
        try {
            CompletableFuture<ApiResponse<GetFindingsExternalResponse>> response = fireblocks.securityPostureManagement().getSecurityFindings(pageCursor, pageSize, severity, category, status);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SecurityPostureManagementApi#getSecurityFindings");
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
| **pageCursor** | **String**| Cursor indicating the page position. Omit to fetch the first page. | [optional] |
| **pageSize** | **Integer**| Number of results per page | [optional] [default to 10] |
| **severity** | **String**| Filter by severity level | [optional] [enum: INFO, LOW, MEDIUM, HIGH] |
| **category** | **String**| Filter by finding category | [optional] [enum: USER_MANAGEMENT, APPROVAL_GROUP_MANAGEMENT, POLICY_ENGINE_UTILIZATION, WORKSPACE_CONFIGURATION, DEFI_ACCESS, FLEET_MANAGEMENT] |
| **status** | **String**| Filter by finding status | [optional] [enum: OPEN, ACCEPTED, RESOLVED] |

### Return type

CompletableFuture<ApiResponse<[**GetFindingsExternalResponse**](GetFindingsExternalResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of FSPM findings |  * X-Request-ID -  <br>  |
| **400** | Bad request — invalid or malformed query parameters. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized — missing or invalid authentication token. |  * X-Request-ID -  <br>  |
| **403** | Forbidden — insufficient permissions or feature is disabled. |  * X-Request-ID -  <br>  |
| **429** | Too many requests — rate limit exceeded, slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateSecurityFindingById

> CompletableFuture<ApiResponse<SecurityFindingDetailed>> updateSecurityFindingById updateSecurityFindingById(updateFindingExternalRequest, id, idempotencyKey)

Update a FSPM security finding by ID

Accepts or reopens a finding for the workspace. When accepting a finding (&#x60;status: \&quot;ACCEPTED\&quot;&#x60;), &#x60;statusUpdatedReason&#x60; is required. Endpoint Roles: Security Admin. 

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
import com.fireblocks.sdk.api.SecurityPostureManagementApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpdateFindingExternalRequest updateFindingExternalRequest = new UpdateFindingExternalRequest(); // UpdateFindingExternalRequest | 
        UUID id = UUID.fromString("d7ca6101-a65e-4a9c-b6c1-b8bd697e0cd2"); // UUID | Unique identifier of the finding
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SecurityFindingDetailed>> response = fireblocks.securityPostureManagement().updateSecurityFindingById(updateFindingExternalRequest, id, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SecurityPostureManagementApi#updateSecurityFindingById");
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
| **updateFindingExternalRequest** | [**UpdateFindingExternalRequest**](UpdateFindingExternalRequest.md)|  | |
| **id** | **UUID**| Unique identifier of the finding | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SecurityFindingDetailed**](SecurityFindingDetailed.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated FSPM finding |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

