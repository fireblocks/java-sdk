# AuditLogsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditLogs**](AuditLogsApi.md#getAuditLogs) | **GET** /management/audit_logs | Get audit logs |
| [**getAudits**](AuditLogsApi.md#getAudits) | **GET** /audits | Get audit logs |



## getAuditLogs

> CompletableFuture<ApiResponse<Void>> getAuditLogs getAuditLogs(timePeriod, cursor)

Get audit logs

Get all audits

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.AuditLogsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        String timePeriod = "DAY"; // String | The last time period to fetch audit logs
        String cursor = "cursor_example"; // String | The next id to start fetch audit logs from
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.getAuditLogs(timePeriod, cursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AuditLogsApi#getAuditLogs");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#getAuditLogs");
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
| **timePeriod** | **String**| The last time period to fetch audit logs | [optional] [enum: DAY, WEEK] |
| **cursor** | **String**| The next id to start fetch audit logs from | [optional] |

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
| **200** | Audit logs from requested time period |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getAudits

> CompletableFuture<ApiResponse<GetAuditLogsResponseDTO>> getAudits getAudits(timePeriod)

Get audit logs

Get all audits

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.AuditLogsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        String timePeriod = "DAY"; // String | The last time period to fetch audit logs
        try {
            CompletableFuture<ApiResponse<GetAuditLogsResponseDTO>> response = apiInstance.getAudits(timePeriod);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AuditLogsApi#getAudits");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#getAudits");
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
| **timePeriod** | **String**| The last time period to fetch audit logs | [optional] [enum: DAY, WEEK] |

### Return type

CompletableFuture<ApiResponse<[**GetAuditLogsResponseDTO**](GetAuditLogsResponseDTO.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audit logs from requested time period |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

