# UsersGroupsBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserGroup**](UsersGroupsBetaApi.md#createUserGroup) | **POST** /users_groups | Create users group |
| [**deleteUserGroup**](UsersGroupsBetaApi.md#deleteUserGroup) | **DELETE** /users_groups/{groupId} | Delete users group |
| [**getUserGroup**](UsersGroupsBetaApi.md#getUserGroup) | **GET** /users_groups/{groupId} | Get users group |
| [**getUserGroups**](UsersGroupsBetaApi.md#getUserGroups) | **GET** /users_groups | List users groups |
| [**updateUserGroup**](UsersGroupsBetaApi.md#updateUserGroup) | **PUT** /users_groups/{groupId} | Update users group |



## createUserGroup

> CreateUsersGroupResponse createUserGroup(userGroupCreateRequest)

Create users group

Create a new users group.</br>

**Note**:
- This endpoint is now in Beta, disabled for general availability at this time.
- Please note that this endpoint is available only for API keys with Admin permissions.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.UsersGroupsBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        UsersGroupsBetaApi apiInstance = new UsersGroupsBetaApi(configuration);
        UserGroupCreateRequest userGroupCreateRequest = new UserGroupCreateRequest(); // UserGroupCreateRequest | 
        try {
            CreateUsersGroupResponse result = apiInstance.createUserGroup(userGroupCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersGroupsBetaApi#createUserGroup");
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
| **userGroupCreateRequest** | [**UserGroupCreateRequest**](UserGroupCreateRequest.md)|  | |

### Return type

[**CreateUsersGroupResponse**](CreateUsersGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Users group created and pending approval |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteUserGroup

> deleteUserGroup(groupId)

Delete users group

Delete a users group by ID.</br>

**Note**:
- This endpoint is now in Beta, disabled for general availability at this time.
- Please note that this endpoint is available only for API keys with Admin permissions.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.UsersGroupsBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        UsersGroupsBetaApi apiInstance = new UsersGroupsBetaApi(configuration);
        String groupId = "groupId_example"; // String | The ID of the users group
        try {
            apiInstance.deleteUserGroup(groupId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersGroupsBetaApi#deleteUserGroup");
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
| **groupId** | **String**| The ID of the users group | |

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
| **204** | Request to delete users group submitted for approval |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getUserGroup

> UsersGroupResponse getUserGroup(groupId)

Get users group

Get a users group by ID.</br>

**Note**:
- This endpoint is now in Beta, disabled for general availability at this time.
- Please note that this endpoint is available only for API keys with Admin permissions.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.UsersGroupsBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        UsersGroupsBetaApi apiInstance = new UsersGroupsBetaApi(configuration);
        String groupId = "groupId_example"; // String | The ID of the users group
        try {
            UsersGroupResponse result = apiInstance.getUserGroup(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersGroupsBetaApi#getUserGroup");
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
| **groupId** | **String**| The ID of the users group | |

### Return type

[**UsersGroupResponse**](UsersGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Users group |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getUserGroups

> List&lt;UsersGroupResponse&gt; getUserGroups()

List users groups

Get all user groups in your workspace. </br>

**Note**:
- This endpoint is now in Beta, disabled for general availability at this time.
- Please note that this endpoint is available only for API keys with Admin permissions.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.UsersGroupsBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        UsersGroupsBetaApi apiInstance = new UsersGroupsBetaApi(configuration);
        try {
            List<UsersGroupResponse> result = apiInstance.getUserGroups();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersGroupsBetaApi#getUserGroups");
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

[**List&lt;UsersGroupResponse&gt;**](UsersGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of the users groups in your workspace |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateUserGroup

> UserGroupCreateResponse updateUserGroup(groupId, userGroupUpdateRequest)

Update users group

Update a users group by ID.</br>

**Note**:
- This endpoint is now in Beta, disabled for general availability at this time.
- Please note that this endpoint is available only for API keys with Admin permissions.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.UsersGroupsBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        UsersGroupsBetaApi apiInstance = new UsersGroupsBetaApi(configuration);
        String groupId = "groupId_example"; // String | The ID of the users group
        UserGroupUpdateRequest userGroupUpdateRequest = new UserGroupUpdateRequest(); // UserGroupUpdateRequest | 
        try {
            UserGroupCreateResponse result = apiInstance.updateUserGroup(groupId, userGroupUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersGroupsBetaApi#updateUserGroup");
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
| **groupId** | **String**| The ID of the users group | |
| **userGroupUpdateRequest** | [**UserGroupUpdateRequest**](UserGroupUpdateRequest.md)|  | |

### Return type

[**UserGroupCreateResponse**](UserGroupCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Users group updated and the changes are pending approval |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

