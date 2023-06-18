# UsersApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUsers**](UsersApi.md#getUsers) | **GET** /users | List users |



## getUsers

> GetUsersResponse getUsers()

List users

List all users for the workspace.  Please note that this endpoint is available only for API keys with Admin permissions. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        UsersApi apiInstance = new UsersApi(defaultClient);
        try {
            GetUsersResponse result = apiInstance.getUsers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsers");
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

[**GetUsersResponse**](GetUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of users |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

