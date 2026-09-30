# ConsoleUserApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConsoleUser**](ConsoleUserApi.md#createConsoleUser) | **POST** /management/users | Create console user |
| [**deleteConsoleUser**](ConsoleUserApi.md#deleteConsoleUser) | **DELETE** /management/users/{id} | Request deletion of a console user |
| [**getConsoleUsers**](ConsoleUserApi.md#getConsoleUsers) | **GET** /management/users | Get console users |



## createConsoleUser

> CompletableFuture<ApiResponse<Void>> createConsoleUser createConsoleUser(createConsoleUser, idempotencyKey)

Create console user

Create console users in your workspace - Please note that this endpoint is available only for API keys with Admin/Non Signing Admin permissions. Learn more about Fireblocks Users management in the following [guide](https://developers.fireblocks.com/docs/manage-users). Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.ConsoleUserApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateConsoleUser createConsoleUser = new CreateConsoleUser(); // CreateConsoleUser | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.consoleUser().createConsoleUser(createConsoleUser, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConsoleUserApi#createConsoleUser");
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
| **200** | User creation approval request has been sent |  * X-Request-ID -  <br>  |
| **400** | bad request |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Lacking permissions. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteConsoleUser

> CompletableFuture<ApiResponse<ConsoleUser>> deleteConsoleUser deleteConsoleUser(id, force)

Request deletion of a console user

Requests deletion of a console user. The request is asynchronous: it goes through the workspace&#39;s configured \&quot;Delete users\&quot; approval policy (Settings &gt; Quorums), exactly as deleting a user from the console does, and the user is removed only once that approval completes. - Track progress by polling GET /management/users; deletion is complete when the user is disabled. - Please note that this endpoint is available only for API keys with Admin/Non Signing Admin permissions. Endpoint Permission: Admin, Non-Signing Admin. **Note:** This endpoint is currently in beta and might be subject to changes.

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
import com.fireblocks.sdk.api.ConsoleUserApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "id_example"; // String | The ID of the console user to delete
        Boolean force = false; // Boolean | Acknowledges the impact of removing this user and proceeds anyway. Overrides both USER_REFERENCED_IN_TAP and QUORUM_INTEGRITY, the same way the acknowledgement checkbox does in the console.
        try {
            CompletableFuture<ApiResponse<ConsoleUser>> response = fireblocks.consoleUser().deleteConsoleUser(id, force);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConsoleUserApi#deleteConsoleUser");
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
| **id** | **String**| The ID of the console user to delete | |
| **force** | **Boolean**| Acknowledges the impact of removing this user and proceeds anyway. Overrides both USER_REFERENCED_IN_TAP and QUORUM_INTEGRITY, the same way the acknowledgement checkbox does in the console. | [optional] [default to false] |

### Return type

CompletableFuture<ApiResponse<[**ConsoleUser**](ConsoleUser.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Deletion request accepted. Returns the console user that will be removed once the workspace&#39;s configured approval completes. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Lacking permissions, or the target cannot be deleted: the user is the workspace Owner, or the caller is the target. |  * X-Request-ID -  <br>  |
| **404** | Console user not found. Also returned for users in other workspaces and for API users, so the endpoint does not reveal whether an ID exists. |  * X-Request-ID -  <br>  |
| **409** | PENDING_REQUEST_EXISTS - a deletion request for this user is already awaiting approval; USER_REFERENCED_IN_TAP - the user is referenced by the workspace transaction authorization policy (can be overridden with force&#x3D;true); or USER_PENDING_ONBOARDING - the user has not completed onboarding, so there is nothing to delete yet. Revoke the invitation from the console instead. |  * X-Request-ID -  <br>  |
| **422** | QUORUM_INTEGRITY - the user is required to complete the workspace&#39;s admin approval quorum. Can be overridden with force&#x3D;true, matching the console&#39;s acknowledgement checkbox. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConsoleUsers

> CompletableFuture<ApiResponse<GetConsoleUsersResponse>> getConsoleUsers getConsoleUsers()

Get console users

Get console users for your workspace. - Please note that this endpoint is available only for API keys with Admin/Non Signing Admin permissions. Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.ConsoleUserApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<GetConsoleUsersResponse>> response = fireblocks.consoleUser().getConsoleUsers();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConsoleUserApi#getConsoleUsers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**GetConsoleUsersResponse**](GetConsoleUsersResponse.md)>>


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

