# Web3ConnectionsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](Web3ConnectionsApi.md#create) | **POST** /connections/wc | Create a new Web3 connection. |
| [**get**](Web3ConnectionsApi.md#get) | **GET** /connections | List all open Web3 connections. |
| [**remove**](Web3ConnectionsApi.md#remove) | **DELETE** /connections/wc/{id} | Remove an existing Web3 connection. |
| [**submit**](Web3ConnectionsApi.md#submit) | **PUT** /connections/wc/{id} | Respond to a pending Web3 connection request. |



## create

> CompletableFuture<ApiResponse<CreateConnectionResponse>> create create(createConnectionRequest, idempotencyKey)

Create a new Web3 connection.

Initiate a new Web3 connection.  * Note: After this succeeds, make a request to &#x60;PUT /v1/connections/wc/{id}&#x60; (below) to approve or reject the new Web3 connection.

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
import com.fireblocks.sdk.api.Web3ConnectionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateConnectionRequest createConnectionRequest = new CreateConnectionRequest(); // CreateConnectionRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateConnectionResponse>> response = fireblocks.web3Connections().create(createConnectionRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling Web3ConnectionsApi#create");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#create");
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
| **createConnectionRequest** | [**CreateConnectionRequest**](CreateConnectionRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateConnectionResponse**](CreateConnectionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Web3 connection initiated successfully |  * X-Request-ID -  <br>  |
| **400** | Invalid data sent |  * X-Request-ID -  <br>  |
| **500** | Something went wrong |  * X-Request-ID -  <br>  |


## get

> CompletableFuture<ApiResponse<GetConnectionsResponse>> get get(order, filter, sort, pageSize, next)

List all open Web3 connections.

Get open Web3 connections.

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
import com.fireblocks.sdk.api.Web3ConnectionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String order = "ASC"; // String | List order; ascending or descending.
        GetFilterParameter filter = new GetFilterParameter(); // GetFilterParameter | Parsed filter object
        String sort = "id"; // String | Property to sort Web3 connections by.
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Amount of results to return in the next page.
        String next = "next_example"; // String | Cursor to the next page
        try {
            CompletableFuture<ApiResponse<GetConnectionsResponse>> response = fireblocks.web3Connections().get(order, filter, sort, pageSize, next);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling Web3ConnectionsApi#get");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#get");
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
| **order** | **String**| List order; ascending or descending. | [optional] [default to ASC] [enum: ASC, DESC] |
| **filter** | [**GetFilterParameter**](.md)| Parsed filter object | [optional] |
| **sort** | **String**| Property to sort Web3 connections by. | [optional] [default to createdAt] [enum: id, userId, vaultAccountId, createdAt, feeLevel, appUrl, appName] |
| **pageSize** | **BigDecimal**| Amount of results to return in the next page. | [optional] [default to 10] |
| **next** | **String**| Cursor to the next page | [optional] |

### Return type

CompletableFuture<ApiResponse<[**GetConnectionsResponse**](GetConnectionsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |
| **400** | Query parameters were invalid |  * X-Request-ID -  <br>  |
| **500** | Something went wrong |  * X-Request-ID -  <br>  |


## remove

> CompletableFuture<ApiResponse<Void>> remove remove(id)

Remove an existing Web3 connection.

Remove a Web3 connection

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
import com.fireblocks.sdk.api.Web3ConnectionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "id_example"; // String | The ID of the existing Web3 connection to remove.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.web3Connections().remove(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling Web3ConnectionsApi#remove");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#remove");
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
| **id** | **String**| The ID of the existing Web3 connection to remove. | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection removed successfully |  * X-Request-ID -  <br>  |
| **404** | Connection not found |  * X-Request-ID -  <br>  |
| **500** | Something went wrong |  * X-Request-ID -  <br>  |


## submit

> CompletableFuture<ApiResponse<Void>> submit submit(respondToConnectionRequest, id, idempotencyKey)

Respond to a pending Web3 connection request.

Submit a response to *approve* or *reject* an initiated Web3 connection. * Note: This call is used to complete your &#x60;POST /v1/connections/wc/&#x60; request.  After this succeeds, your new Web3 connection is created and functioning.

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
import com.fireblocks.sdk.api.Web3ConnectionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        RespondToConnectionRequest respondToConnectionRequest = new RespondToConnectionRequest(); // RespondToConnectionRequest | 
        String id = "id_example"; // String | The ID of the initiated Web3 connection to approve.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.web3Connections().submit(respondToConnectionRequest, id, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling Web3ConnectionsApi#submit");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#submit");
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
| **respondToConnectionRequest** | [**RespondToConnectionRequest**](RespondToConnectionRequest.md)|  | |
| **id** | **String**| The ID of the initiated Web3 connection to approve. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection submitted successfully |  * X-Request-ID -  <br>  |
| **400** | Invalid data sent |  * X-Request-ID -  <br>  |
| **404** | Connection not found |  * X-Request-ID -  <br>  |
| **500** | Something went wrong |  * X-Request-ID -  <br>  |

