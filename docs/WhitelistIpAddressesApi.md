# WhitelistIpAddressesApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWhitelistIpAddresses**](WhitelistIpAddressesApi.md#getWhitelistIpAddresses) | **GET** /management/api_users/{userId}/whitelist_ip_addresses | gets ip addresses |
| [**getWhitelistIpAddressesWithHttpInfo**](WhitelistIpAddressesApi.md#getWhitelistIpAddressesWithHttpInfo) | **GET** /management/api_users/{userId}/whitelist_ip_addresses | gets ip addresses |



## getWhitelistIpAddresses

> CompletableFuture<Void> getWhitelistIpAddresses(userId)

gets ip addresses

gets ip addresses

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.WhitelistIpAddressesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        WhitelistIpAddressesApi apiInstance = new WhitelistIpAddressesApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user
        try {
            CompletableFuture<Void> result = apiInstance.getWhitelistIpAddresses(userId);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhitelistIpAddressesApi#getWhitelistIpAddresses");
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
| **userId** | **String**| The ID of the user | |

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
| **200** | successfully whitelisted |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Lacking permissions. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getWhitelistIpAddressesWithHttpInfo

> CompletableFuture<ApiResponse<Void>> getWhitelistIpAddresses getWhitelistIpAddressesWithHttpInfo(userId)

gets ip addresses

gets ip addresses

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.WhitelistIpAddressesApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        WhitelistIpAddressesApi apiInstance = new WhitelistIpAddressesApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.getWhitelistIpAddressesWithHttpInfo(userId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WhitelistIpAddressesApi#getWhitelistIpAddresses");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WhitelistIpAddressesApi#getWhitelistIpAddresses");
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
| **userId** | **String**| The ID of the user | |

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
| **200** | successfully whitelisted |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Lacking permissions. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

