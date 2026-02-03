# AuditLogsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditLogs**](AuditLogsApi.md#getAuditLogs) | **GET** /management/audit_logs | Get audit logs |



## getAuditLogs

> CompletableFuture<ApiResponse<GetAuditLogsResponse>> getAuditLogs getAuditLogs(timePeriod, cursor)

Get audit logs

Get Audit logs for the last Day/Week.  - Please note that this endpoint is available only for API keys with Admin/Non Signing Admin permissions. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.AuditLogsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String timePeriod = "DAY"; // String | The last time period to fetch audit logs
        String cursor = "cursor_example"; // String | The next id to start fetch audit logs from
        try {
            CompletableFuture<ApiResponse<GetAuditLogsResponse>> response = fireblocks.auditLogs().getAuditLogs(timePeriod, cursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**GetAuditLogsResponse**](GetAuditLogsResponse.md)>>


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

