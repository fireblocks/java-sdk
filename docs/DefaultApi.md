# DefaultApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelJob**](DefaultApi.md#cancelJob) | **POST** /batch/{jobId}/cancel | Cancel a running job |
| [**cancelJobWithHttpInfo**](DefaultApi.md#cancelJobWithHttpInfo) | **POST** /batch/{jobId}/cancel | Cancel a running job |
| [**continueJob**](DefaultApi.md#continueJob) | **POST** /batch/{jobId}/continue | Continue a paused job |
| [**continueJobWithHttpInfo**](DefaultApi.md#continueJobWithHttpInfo) | **POST** /batch/{jobId}/continue | Continue a paused job |
| [**getJob**](DefaultApi.md#getJob) | **GET** /batch/{jobId} | Get job details |
| [**getJobWithHttpInfo**](DefaultApi.md#getJobWithHttpInfo) | **GET** /batch/{jobId} | Get job details |
| [**getJobTasks**](DefaultApi.md#getJobTasks) | **GET** /batch/{jobId}/tasks | Return a list of tasks for given job |
| [**getJobTasksWithHttpInfo**](DefaultApi.md#getJobTasksWithHttpInfo) | **GET** /batch/{jobId}/tasks | Return a list of tasks for given job |
| [**getJobs**](DefaultApi.md#getJobs) | **GET** /batch/jobs | Return a list of jobs belonging to tenant |
| [**getJobsWithHttpInfo**](DefaultApi.md#getJobsWithHttpInfo) | **GET** /batch/jobs | Return a list of jobs belonging to tenant |
| [**pauseJob**](DefaultApi.md#pauseJob) | **POST** /batch/{jobId}/pause | Pause a job |
| [**pauseJobWithHttpInfo**](DefaultApi.md#pauseJobWithHttpInfo) | **POST** /batch/{jobId}/pause | Pause a job |



## cancelJob

> CompletableFuture<Void> cancelJob(jobId, idempotencyKey)

Cancel a running job

Stop the given job immediately. If the job is in the ‘Active’ state, the job will be canceled after completing the current task. Vault accounts and Wallets that are already created will not be affected.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.cancelJob(jobId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cancelJob");
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
| **jobId** | **String**| The requested job id | |
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
| **200** | canceled successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## cancelJobWithHttpInfo

> CompletableFuture<ApiResponse<Void>> cancelJob cancelJobWithHttpInfo(jobId, idempotencyKey)

Cancel a running job

Stop the given job immediately. If the job is in the ‘Active’ state, the job will be canceled after completing the current task. Vault accounts and Wallets that are already created will not be affected.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.cancelJobWithHttpInfo(jobId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DefaultApi#cancelJob");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cancelJob");
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
| **jobId** | **String**| The requested job id | |
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
| **200** | canceled successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## continueJob

> CompletableFuture<Void> continueJob(jobId, idempotencyKey)

Continue a paused job

Continue the given paused job.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.continueJob(jobId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#continueJob");
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
| **jobId** | **String**| The requested job id | |
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
| **200** | continued successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## continueJobWithHttpInfo

> CompletableFuture<ApiResponse<Void>> continueJob continueJobWithHttpInfo(jobId, idempotencyKey)

Continue a paused job

Continue the given paused job.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.continueJobWithHttpInfo(jobId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DefaultApi#continueJob");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#continueJob");
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
| **jobId** | **String**| The requested job id | |
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
| **200** | continued successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getJob

> CompletableFuture<Job> getJob(jobId)

Get job details

Get an object describing the given job

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        try {
            CompletableFuture<Job> result = apiInstance.getJob(jobId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getJob");
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
| **jobId** | **String**| The requested job id | |

### Return type

CompletableFuture<[**Job**](Job.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object that describes the job |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getJobWithHttpInfo

> CompletableFuture<ApiResponse<Job>> getJob getJobWithHttpInfo(jobId)

Get job details

Get an object describing the given job

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        try {
            CompletableFuture<ApiResponse<Job>> response = apiInstance.getJobWithHttpInfo(jobId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DefaultApi#getJob");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getJob");
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
| **jobId** | **String**| The requested job id | |

### Return type

CompletableFuture<ApiResponse<[**Job**](Job.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object that describes the job |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getJobTasks

> CompletableFuture<List<Task>> getJobTasks(jobId)

Return a list of tasks for given job

Return a list of tasks for given job

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        try {
            CompletableFuture<List<Task>> result = apiInstance.getJobTasks(jobId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getJobTasks");
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
| **jobId** | **String**| The requested job id | |

### Return type

CompletableFuture<[**List&lt;Task&gt;**](Task.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of tasks |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getJobTasksWithHttpInfo

> CompletableFuture<ApiResponse<List<Task>>> getJobTasks getJobTasksWithHttpInfo(jobId)

Return a list of tasks for given job

Return a list of tasks for given job

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        try {
            CompletableFuture<ApiResponse<List<Task>>> response = apiInstance.getJobTasksWithHttpInfo(jobId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DefaultApi#getJobTasks");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getJobTasks");
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
| **jobId** | **String**| The requested job id | |

### Return type

CompletableFuture<ApiResponse<[**List&lt;Task&gt;**](Task.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of tasks |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getJobs

> CompletableFuture<List<Job>> getJobs(fromTime, toTime)

Return a list of jobs belonging to tenant

Get an array of objects including all active, paused, canceled, and complete jobs in a workspace.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer fromTime = 56; // Integer | Start of time range in ms since 1970
        Integer toTime = 56; // Integer | End of time range in ms since 1970
        try {
            CompletableFuture<List<Job>> result = apiInstance.getJobs(fromTime, toTime);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getJobs");
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
| **fromTime** | **Integer**| Start of time range in ms since 1970 | [optional] |
| **toTime** | **Integer**| End of time range in ms since 1970 | [optional] |

### Return type

CompletableFuture<[**List&lt;Job&gt;**](Job.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of jobs |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getJobsWithHttpInfo

> CompletableFuture<ApiResponse<List<Job>>> getJobs getJobsWithHttpInfo(fromTime, toTime)

Return a list of jobs belonging to tenant

Get an array of objects including all active, paused, canceled, and complete jobs in a workspace.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer fromTime = 56; // Integer | Start of time range in ms since 1970
        Integer toTime = 56; // Integer | End of time range in ms since 1970
        try {
            CompletableFuture<ApiResponse<List<Job>>> response = apiInstance.getJobsWithHttpInfo(fromTime, toTime);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DefaultApi#getJobs");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getJobs");
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
| **fromTime** | **Integer**| Start of time range in ms since 1970 | [optional] |
| **toTime** | **Integer**| End of time range in ms since 1970 | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;Job&gt;**](Job.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of jobs |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## pauseJob

> CompletableFuture<Void> pauseJob(jobId, idempotencyKey)

Pause a job

Pause the given job, after the current task is done. A paused job can later be resumed by calling ‘continue’, or canceled.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.pauseJob(jobId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pauseJob");
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
| **jobId** | **String**| The requested job id | |
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
| **200** | paused successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## pauseJobWithHttpInfo

> CompletableFuture<ApiResponse<Void>> pauseJob pauseJobWithHttpInfo(jobId, idempotencyKey)

Pause a job

Pause the given job, after the current task is done. A paused job can later be resumed by calling ‘continue’, or canceled.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.DefaultApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String jobId = "jobId_example"; // String | The requested job id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.pauseJobWithHttpInfo(jobId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DefaultApi#pauseJob");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pauseJob");
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
| **jobId** | **String**| The requested job id | |
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
| **200** | paused successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

