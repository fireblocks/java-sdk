# ConsoleUserApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConsoleUser**](ConsoleUserApi.md#createConsoleUser) | **POST** /management/users | create console user |
| [**createConsoleUserWithHttpInfo**](ConsoleUserApi.md#createConsoleUserWithHttpInfo) | **POST** /management/users | create console user |
| [**getConsoleUsers**](ConsoleUserApi.md#getConsoleUsers) | **GET** /management/users | get console users |
| [**getConsoleUsersWithHttpInfo**](ConsoleUserApi.md#getConsoleUsersWithHttpInfo) | **GET** /management/users | get console users |



## createConsoleUser

> CompletableFuture<Void> createConsoleUser(createConsoleUser, idempotencyKey)

create console user

creates fireblocks console user

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ConsoleUserApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ConsoleUserApi apiInstance = new ConsoleUserApi(defaultClient);
        CreateConsoleUser createConsoleUser = new CreateConsoleUser(); // CreateConsoleUser | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.createConsoleUser(createConsoleUser, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsoleUserApi#createConsoleUser");
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
| **createConsoleUser** | [**CreateConsoleUser**](CreateConsoleUser.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Users sent for creation |  * X-Request-ID -  <br>  |
| **400** | bad request |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Lacking permissions. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createConsoleUserWithHttpInfo

> CompletableFuture<ApiResponse<Void>> createConsoleUser createConsoleUserWithHttpInfo(createConsoleUser, idempotencyKey)

create console user

creates fireblocks console user

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ConsoleUserApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ConsoleUserApi apiInstance = new ConsoleUserApi(defaultClient);
        CreateConsoleUser createConsoleUser = new CreateConsoleUser(); // CreateConsoleUser | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.createConsoleUserWithHttpInfo(createConsoleUser, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConsoleUserApi#createConsoleUser");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsoleUserApi#createConsoleUser");
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
| **createConsoleUser** | [**CreateConsoleUser**](CreateConsoleUser.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Users sent for creation |  * X-Request-ID -  <br>  |
| **400** | bad request |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Lacking permissions. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConsoleUsers

> CompletableFuture<Void> getConsoleUsers()

get console users

get console users from the current tenant

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ConsoleUserApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ConsoleUserApi apiInstance = new ConsoleUserApi(defaultClient);
        try {
            CompletableFuture<Void> result = apiInstance.getConsoleUsers();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsoleUserApi#getConsoleUsers");
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


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | got console users |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Lacking permissions. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getConsoleUsersWithHttpInfo

> CompletableFuture<ApiResponse<Void>> getConsoleUsers getConsoleUsersWithHttpInfo()

get console users

get console users from the current tenant

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ConsoleUserApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ConsoleUserApi apiInstance = new ConsoleUserApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.getConsoleUsersWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConsoleUserApi#getConsoleUsers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsoleUserApi#getConsoleUsers");
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


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | got console users |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Lacking permissions. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

