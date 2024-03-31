# UserGroupsBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserGroup**](UserGroupsBetaApi.md#createUserGroup) | **POST** /management/user_groups | Create user group |
| [**deleteUserGroup**](UserGroupsBetaApi.md#deleteUserGroup) | **DELETE** /management/user_groups/{groupId} | Delete user group |
| [**getUserGroup**](UserGroupsBetaApi.md#getUserGroup) | **GET** /management/user_groups/{groupId} | Get user group |
| [**getUserGroups**](UserGroupsBetaApi.md#getUserGroups) | **GET** /management/user_groups | List user groups |
| [**updateUserGroup**](UserGroupsBetaApi.md#updateUserGroup) | **PUT** /management/user_groups/{groupId} | Update user group |



## createUserGroup

> CompletableFuture<ApiResponse<CreateUserGroupResponse>> createUserGroup createUserGroup(userGroupCreateRequest, idempotencyKey)

Create user group

Create a new user group.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.UserGroupsBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        UserGroupsBetaApi apiInstance = new UserGroupsBetaApi(defaultClient);
        UserGroupCreateRequest userGroupCreateRequest = new UserGroupCreateRequest(); // UserGroupCreateRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateUserGroupResponse>> response = apiInstance.createUserGroup(userGroupCreateRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UserGroupsBetaApi#createUserGroup");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGroupsBetaApi#createUserGroup");
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
| **userGroupCreateRequest** | [**UserGroupCreateRequest**](UserGroupCreateRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateUserGroupResponse**](CreateUserGroupResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User group created and pending approval |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteUserGroup

> CompletableFuture<ApiResponse<Void>> deleteUserGroup deleteUserGroup(groupId)

Delete user group

Delete a user group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.UserGroupsBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        UserGroupsBetaApi apiInstance = new UserGroupsBetaApi(defaultClient);
        String groupId = "groupId_example"; // String | The ID of the user group
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.deleteUserGroup(groupId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UserGroupsBetaApi#deleteUserGroup");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGroupsBetaApi#deleteUserGroup");
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
| **groupId** | **String**| The ID of the user group | |

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
| **204** | Request to delete user group submitted for approval |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getUserGroup

> CompletableFuture<ApiResponse<UserGroupResponse>> getUserGroup getUserGroup(groupId)

Get user group

Get a user group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.UserGroupsBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        UserGroupsBetaApi apiInstance = new UserGroupsBetaApi(defaultClient);
        String groupId = "groupId_example"; // String | The ID of the user group
        try {
            CompletableFuture<ApiResponse<UserGroupResponse>> response = apiInstance.getUserGroup(groupId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UserGroupsBetaApi#getUserGroup");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGroupsBetaApi#getUserGroup");
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
| **groupId** | **String**| The ID of the user group | |

### Return type

CompletableFuture<ApiResponse<[**UserGroupResponse**](UserGroupResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User group |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getUserGroups

> CompletableFuture<ApiResponse<List<UserGroupResponse>>> getUserGroups getUserGroups()

List user groups

Get all user groups in your workspace. &lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.UserGroupsBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        UserGroupsBetaApi apiInstance = new UserGroupsBetaApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<UserGroupResponse>>> response = apiInstance.getUserGroups();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UserGroupsBetaApi#getUserGroups");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGroupsBetaApi#getUserGroups");
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

CompletableFuture<ApiResponse<[**List&lt;UserGroupResponse&gt;**](UserGroupResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of the user groups in your workspace |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateUserGroup

> CompletableFuture<ApiResponse<UserGroupCreateResponse>> updateUserGroup updateUserGroup(userGroupUpdateRequest, groupId, idempotencyKey)

Update user group

Update a user group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.UserGroupsBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        UserGroupsBetaApi apiInstance = new UserGroupsBetaApi(defaultClient);
        UserGroupUpdateRequest userGroupUpdateRequest = new UserGroupUpdateRequest(); // UserGroupUpdateRequest | 
        String groupId = "groupId_example"; // String | The ID of the user group
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UserGroupCreateResponse>> response = apiInstance.updateUserGroup(userGroupUpdateRequest, groupId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UserGroupsBetaApi#updateUserGroup");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserGroupsBetaApi#updateUserGroup");
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
| **userGroupUpdateRequest** | [**UserGroupUpdateRequest**](UserGroupUpdateRequest.md)|  | |
| **groupId** | **String**| The ID of the user group | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**UserGroupCreateResponse**](UserGroupCreateResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User group updated and the changes are pending approval |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

