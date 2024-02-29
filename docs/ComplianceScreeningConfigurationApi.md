# ComplianceScreeningConfigurationApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAmlScreeningConfiguration**](ComplianceScreeningConfigurationApi.md#getAmlScreeningConfiguration) | **GET** /screening/aml/policy_configuration | Get AML Screening Policy Configuration |
| [**getAmlScreeningConfigurationWithHttpInfo**](ComplianceScreeningConfigurationApi.md#getAmlScreeningConfigurationWithHttpInfo) | **GET** /screening/aml/policy_configuration | Get AML Screening Policy Configuration |
| [**getScreeningConfiguration**](ComplianceScreeningConfigurationApi.md#getScreeningConfiguration) | **GET** /screening/travel_rule/policy_configuration | Get Travel Rule Screening Policy Configuration |
| [**getScreeningConfigurationWithHttpInfo**](ComplianceScreeningConfigurationApi.md#getScreeningConfigurationWithHttpInfo) | **GET** /screening/travel_rule/policy_configuration | Get Travel Rule Screening Policy Configuration |



## getAmlScreeningConfiguration

> CompletableFuture<ScreeningConfigurationsRequest> getAmlScreeningConfiguration()

Get AML Screening Policy Configuration

Retrieves the configuration for Travel Rule screening policy.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ComplianceScreeningConfigurationApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ComplianceScreeningConfigurationApi apiInstance = new ComplianceScreeningConfigurationApi(defaultClient);
        try {
            CompletableFuture<ScreeningConfigurationsRequest> result = apiInstance.getAmlScreeningConfiguration();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceScreeningConfigurationApi#getAmlScreeningConfiguration");
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

CompletableFuture<[**ScreeningConfigurationsRequest**](ScreeningConfigurationsRequest.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Screening policy configuration retrieved successfully. |  -  |

## getAmlScreeningConfigurationWithHttpInfo

> CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> getAmlScreeningConfiguration getAmlScreeningConfigurationWithHttpInfo()

Get AML Screening Policy Configuration

Retrieves the configuration for Travel Rule screening policy.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ComplianceScreeningConfigurationApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ComplianceScreeningConfigurationApi apiInstance = new ComplianceScreeningConfigurationApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> response = apiInstance.getAmlScreeningConfigurationWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceScreeningConfigurationApi#getAmlScreeningConfiguration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceScreeningConfigurationApi#getAmlScreeningConfiguration");
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

CompletableFuture<ApiResponse<[**ScreeningConfigurationsRequest**](ScreeningConfigurationsRequest.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Screening policy configuration retrieved successfully. |  -  |


## getScreeningConfiguration

> CompletableFuture<ScreeningConfigurationsRequest> getScreeningConfiguration()

Get Travel Rule Screening Policy Configuration

Retrieves the configuration for Travel Rule screening policy.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ComplianceScreeningConfigurationApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ComplianceScreeningConfigurationApi apiInstance = new ComplianceScreeningConfigurationApi(defaultClient);
        try {
            CompletableFuture<ScreeningConfigurationsRequest> result = apiInstance.getScreeningConfiguration();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceScreeningConfigurationApi#getScreeningConfiguration");
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

CompletableFuture<[**ScreeningConfigurationsRequest**](ScreeningConfigurationsRequest.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Screening policy configuration retrieved successfully. |  -  |

## getScreeningConfigurationWithHttpInfo

> CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> getScreeningConfiguration getScreeningConfigurationWithHttpInfo()

Get Travel Rule Screening Policy Configuration

Retrieves the configuration for Travel Rule screening policy.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ComplianceScreeningConfigurationApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ComplianceScreeningConfigurationApi apiInstance = new ComplianceScreeningConfigurationApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> response = apiInstance.getScreeningConfigurationWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceScreeningConfigurationApi#getScreeningConfiguration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceScreeningConfigurationApi#getScreeningConfiguration");
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

CompletableFuture<ApiResponse<[**ScreeningConfigurationsRequest**](ScreeningConfigurationsRequest.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Screening policy configuration retrieved successfully. |  -  |

