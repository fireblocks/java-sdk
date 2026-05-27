# AuditLogsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditLogs**](AuditLogsApi.md#getAuditLogs) | **GET** /management/audit_logs | Get audit logs |



## getAuditLogs

> CompletableFuture<ApiResponse<GetAuditLogsResponse>> getAuditLogs getAuditLogs(startTime, endTime, timePeriod, category, subject, event, user, userId, order, pageSize, pageCursor, cursor)

Get audit logs

Retrieve audit log events for the workspace with optional filtering, date range, sorting, and cursor-based pagination.  Filters within the same field are combined as OR (e.g. category&#x3D;Administration&amp;category&#x3D;Security returns events in either category). Filters across different fields are combined as AND.  **Deprecated parameters:** &#x60;timePeriod&#x60; and &#x60;cursor&#x60; remain functional for backward compatibility but new integrations should use &#x60;startTime&#x60;/&#x60;endTime&#x60; and &#x60;pageCursor&#x60; instead.  Endpoint Permission: Admin, Non-Signing Admin, Auditor, Security Admin, Security Auditor.

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

        Integer startTime = 56; // Integer | Start of date range as epoch time in milliseconds. Takes precedence over timePeriod when provided. Must be no more than 1 year before the current time.
        Integer endTime = 56; // Integer | End of date range as epoch time in milliseconds. Must be after startTime. Defaults to now when omitted.
        String timePeriod = "DAY"; // String | Deprecated. Use startTime/endTime instead. Ignored when startTime is provided. Defaults to DAY when neither timePeriod nor startTime is supplied.
        List<String> category = Arrays.asList(); // List<String> | Filter by event category. Repeat the parameter for multiple values (OR logic within field).
        List<String> subject = Arrays.asList(); // List<String> | Filter by event subject. Repeat the parameter for multiple values.
        List<String> event = Arrays.asList(); // List<String> | Filter by event type. Repeat the parameter for multiple values.
        List<String> user = Arrays.asList(); // List<String> | Filter by user name. Repeat the parameter for multiple values.
        List<String> userId = Arrays.asList(); // List<String> | Filter by user ID. Repeat the parameter for multiple values.
        String order = "ASC"; // String | Sort direction. Defaults to DESC.
        Integer pageSize = 200; // Integer | Number of results per page. Maximum 500. Defaults to 200.
        String pageCursor = "pageCursor_example"; // String | Cursor returned from the previous response to fetch the next page.
        String cursor = "cursor_example"; // String | Deprecated. Use pageCursor instead.
        try {
            CompletableFuture<ApiResponse<GetAuditLogsResponse>> response = fireblocks.auditLogs().getAuditLogs(startTime, endTime, timePeriod, category, subject, event, user, userId, order, pageSize, pageCursor, cursor);
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
| **startTime** | **Integer**| Start of date range as epoch time in milliseconds. Takes precedence over timePeriod when provided. Must be no more than 1 year before the current time. | [optional] |
| **endTime** | **Integer**| End of date range as epoch time in milliseconds. Must be after startTime. Defaults to now when omitted. | [optional] |
| **timePeriod** | **String**| Deprecated. Use startTime/endTime instead. Ignored when startTime is provided. Defaults to DAY when neither timePeriod nor startTime is supplied. | [optional] [enum: DAY, WEEK] |
| **category** | [**List&lt;String&gt;**](String.md)| Filter by event category. Repeat the parameter for multiple values (OR logic within field). | [optional] |
| **subject** | [**List&lt;String&gt;**](String.md)| Filter by event subject. Repeat the parameter for multiple values. | [optional] |
| **event** | [**List&lt;String&gt;**](String.md)| Filter by event type. Repeat the parameter for multiple values. | [optional] |
| **user** | [**List&lt;String&gt;**](String.md)| Filter by user name. Repeat the parameter for multiple values. | [optional] |
| **userId** | [**List&lt;String&gt;**](String.md)| Filter by user ID. Repeat the parameter for multiple values. | [optional] |
| **order** | **String**| Sort direction. Defaults to DESC. | [optional] [default to DESC] [enum: ASC, DESC] |
| **pageSize** | **Integer**| Number of results per page. Maximum 500. Defaults to 200. | [optional] [default to 200] |
| **pageCursor** | **String**| Cursor returned from the previous response to fetch the next page. | [optional] |
| **cursor** | **String**| Deprecated. Use pageCursor instead. | [optional] |

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
| **200** | Audit log events matching the requested filters and date range |  * X-Request-ID -  <br>  |
| **400** | Error Response |  * X-Request-ID -  <br>  |
| **403** | Error Response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

