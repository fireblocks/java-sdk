# AuditLogsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAudits**](AuditLogsApi.md#getAudits) | **GET** /audits | Get audit logs |



## getAudits

> getAudits(timePeriod)

Get audit logs

Get all audits

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuditLogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        String timePeriod = "DAY"; // String | The last time period to fetch audit logs
        try {
            apiInstance.getAudits(timePeriod);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#getAudits");
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
| **timePeriod** | **String**| The last time period to fetch audit logs | [enum: DAY, WEEK] |

### Return type

null (empty response body)

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

