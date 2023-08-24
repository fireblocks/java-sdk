# Web3ConnectionsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](Web3ConnectionsApi.md#create) | **POST** /connections/wc | Create a new Web3 connection. |
| [**get**](Web3ConnectionsApi.md#get) | **GET** /connections | List all open Web3 connections. |
| [**remove**](Web3ConnectionsApi.md#remove) | **DELETE** /connections/wc/{id} | Remove an existing Web3 connection. |
| [**submit**](Web3ConnectionsApi.md#submit) | **PUT** /connections/wc/{id} | Respond to a pending Web3 connection request. |



## create

> CreateConnectionResponse create(createConnectionRequest)

Create a new Web3 connection.

Initiate a new Web3 connection.

* Note: After this succeeds, make a request to `PUT /v1/connections/wc/{id}` (below) to approve or reject the new Web3 connection.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.Web3ConnectionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        Web3ConnectionsApi apiInstance = new Web3ConnectionsApi(configuration);
        CreateConnectionRequest createConnectionRequest = new CreateConnectionRequest(); // CreateConnectionRequest | 
        try {
            CreateConnectionResponse result = apiInstance.create(createConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#create");
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
| **createConnectionRequest** | [**CreateConnectionRequest**](CreateConnectionRequest.md)|  | |

### Return type

[**CreateConnectionResponse**](CreateConnectionResponse.md)

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

> GetConnectionsResponse get(order, filter, sort, pageSize, next)

List all open Web3 connections.

Get open Web3 connections.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.Web3ConnectionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        Web3ConnectionsApi apiInstance = new Web3ConnectionsApi(configuration);
        String order = "ASC"; // String | List order; ascending or descending.
        GetFilterParameter filter = new HashMap(); // GetFilterParameter | Parsed filter object
        String sort = "id"; // String | Property to sort Web3 connections by.
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Amount of results to return in the next page.
        String next = "next_example"; // String | Cursor to the next page
        try {
            GetConnectionsResponse result = apiInstance.get(order, filter, sort, pageSize, next);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#get");
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
| **order** | **String**| List order; ascending or descending. | [optional] [default to ASC] [enum: ASC, DESC] |
| **filter** | [**GetFilterParameter**](GetFilterParameter.md)| Parsed filter object | [optional] |
| **sort** | **String**| Property to sort Web3 connections by. | [optional] [default to createdAt] [enum: id, userId, vaultAccountId, createdAt, feeLevel, appUrl, appName] |
| **pageSize** | **BigDecimal**| Amount of results to return in the next page. | [optional] [default to 10] |
| **next** | **String**| Cursor to the next page | [optional] |

### Return type

[**GetConnectionsResponse**](GetConnectionsResponse.md)

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

> remove(id)

Remove an existing Web3 connection.

Remove a Web3 connection

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.Web3ConnectionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        Web3ConnectionsApi apiInstance = new Web3ConnectionsApi(configuration);
        String id = "id_example"; // String | The ID of the existing Web3 connection to remove.
        try {
            apiInstance.remove(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#remove");
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
| **id** | **String**| The ID of the existing Web3 connection to remove. | |

### Return type

null (empty response body)

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

> submit(id, respondToConnectionRequest)

Respond to a pending Web3 connection request.

Submit a response to *approve* or *reject* an initiated Web3 connection.
* Note: This call is used to complete your `POST /v1/connections/wc/` request.

After this succeeds, your new Web3 connection is created and functioning.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.Web3ConnectionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        Web3ConnectionsApi apiInstance = new Web3ConnectionsApi(configuration);
        String id = "id_example"; // String | The ID of the initiated Web3 connection to approve.
        RespondToConnectionRequest respondToConnectionRequest = new RespondToConnectionRequest(); // RespondToConnectionRequest | 
        try {
            apiInstance.submit(id, respondToConnectionRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#submit");
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
| **id** | **String**| The ID of the initiated Web3 connection to approve. | |
| **respondToConnectionRequest** | [**RespondToConnectionRequest**](RespondToConnectionRequest.md)|  | |

### Return type

null (empty response body)

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

