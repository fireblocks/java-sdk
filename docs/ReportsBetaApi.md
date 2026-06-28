# ReportsBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReport**](ReportsBetaApi.md#createReport) | **POST** /reports | Create a report |
| [**getReport**](ReportsBetaApi.md#getReport) | **GET** /reports/{reportId} | Get report status |
| [**listReports**](ReportsBetaApi.md#listReports) | **GET** /reports | List reports |



## createReport

> CompletableFuture<ApiResponse<CreateReportResponse>> createReport createReport(body, idempotencyKey)

Create a report

Creates a new asynchronous report job and returns a receipt containing the report ID. Poll &#x60;GET /v1/reports/{reportId}&#x60; to check status. When &#x60;status&#x60; is &#x60;COMPLETED&#x60;, the poll response includes a fresh pre-signed download URL in &#x60;links.downloadUrl&#x60;.  **Note:** These endpoints are currently in beta and might be subject to changes.  Endpoint Permission: Viewer and above. 

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
import com.fireblocks.sdk.api.ReportsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateAddressesReportRequest body = new CreateAddressesReportRequest(); // CreateAddressesReportRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateReportResponse>> response = fireblocks.reportsBeta().createReport(body, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ReportsBetaApi#createReport");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsBetaApi#createReport");
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
| **body** | **CreateAddressesReportRequest**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateReportResponse**](CreateReportResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Report job accepted and queued for processing |  * X-Request-ID -  <br>  |
| **409** | A report with the same type and filters is already being processed |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getReport

> CompletableFuture<ApiResponse<ReportJobResponse>> getReport getReport(reportId)

Get report status

Returns the current status of a report job. Check the &#x60;status&#x60; field to determine the outcome.  When &#x60;status&#x60; is &#x60;COMPLETED&#x60;, the response includes a fresh pre-signed download URL in &#x60;links.downloadUrl&#x60; (TTL ~1 hour). Re-poll this endpoint to obtain a new URL after expiry.  When &#x60;status&#x60; is &#x60;FAILED&#x60;, the &#x60;failedAt&#x60; timestamp indicates when the failure occurred.  **Note:** These endpoints are currently in beta and might be subject to changes.  Endpoint Permission: Viewer and above. 

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
import com.fireblocks.sdk.api.ReportsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String reportId = "0190b3c2-7e4a-7c31-9f2a-1b6d8e5a0c11"; // String | The unique identifier of the report job
        try {
            CompletableFuture<ApiResponse<ReportJobResponse>> response = fireblocks.reportsBeta().getReport(reportId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ReportsBetaApi#getReport");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsBetaApi#getReport");
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
| **reportId** | **String**| The unique identifier of the report job | |

### Return type

CompletableFuture<ApiResponse<[**ReportJobResponse**](ReportJobResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report job details |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listReports

> CompletableFuture<ApiResponse<ReportListResponse>> listReports listReports(pageCursor, pageSize, sortBy, order, status, reportType)

List reports

Returns a paginated list of report jobs scoped to the calling tenant.  **Note:** Download URLs are not included in list responses. Call &#x60;GET /v1/reports/{reportId}&#x60; to obtain a fresh signed download URL for a specific completed report.  **Note:** These endpoints are currently in beta and might be subject to changes.  Endpoint Permission: Viewer and above. 

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
import com.fireblocks.sdk.api.ReportsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "pageCursor_example"; // String | Opaque cursor returned from a previous list call
        Integer pageSize = 20; // Integer | Maximum number of items per page
        String sortBy = "createdAt"; // String | Field to sort by
        String order = "ASC"; // String | Sort direction
        List<ReportStatus> status = Arrays.asList(); // List<ReportStatus> | Filter by lifecycle status. Repeat the parameter to filter on multiple statuses (e.g., ?status=QUEUED&status=PROCESSING).
        List<ReportType> reportType = Arrays.asList(); // List<ReportType> | Filter by report type. Repeat the parameter to filter on multiple types.
        try {
            CompletableFuture<ApiResponse<ReportListResponse>> response = fireblocks.reportsBeta().listReports(pageCursor, pageSize, sortBy, order, status, reportType);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ReportsBetaApi#listReports");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsBetaApi#listReports");
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
| **pageCursor** | **String**| Opaque cursor returned from a previous list call | [optional] |
| **pageSize** | **Integer**| Maximum number of items per page | [optional] [default to 20] |
| **sortBy** | **String**| Field to sort by | [optional] [default to createdAt] [enum: createdAt, completedAt] |
| **order** | **String**| Sort direction | [optional] [default to DESC] [enum: ASC, DESC] |
| **status** | [**List&lt;ReportStatus&gt;**](ReportStatus.md)| Filter by lifecycle status. Repeat the parameter to filter on multiple statuses (e.g., ?status&#x3D;QUEUED&amp;status&#x3D;PROCESSING). | [optional] |
| **reportType** | [**List&lt;ReportType&gt;**](ReportType.md)| Filter by report type. Repeat the parameter to filter on multiple types. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ReportListResponse**](ReportListResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of report jobs |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

