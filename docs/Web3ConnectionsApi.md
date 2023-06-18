# Web3ConnectionsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWCConnection**](Web3ConnectionsApi.md#createWCConnection) | **POST** /connections/wc | Create a new Web3 connection. |
| [**deleteWCConnection**](Web3ConnectionsApi.md#deleteWCConnection) | **DELETE** /connections/wc/{id} | Remove an existing Web3 connection. |
| [**getConnections**](Web3ConnectionsApi.md#getConnections) | **GET** /connections | List all open Web3 connections. |
| [**updateWCConnection**](Web3ConnectionsApi.md#updateWCConnection) | **PUT** /connections/wc/{id} | Respond to a pending Web3 connection request. |



## createWCConnection

> CreateConnectionResponse createWCConnection(createConnectionRequest)

Create a new Web3 connection.

Initiate a new Web3 connection.  * Note: After this succeeds, make a request to &#x60;PUT /v1/connections/wc/{id}&#x60; (below) to approve or reject the new Web3 connection.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Web3ConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        Web3ConnectionsApi apiInstance = new Web3ConnectionsApi(defaultClient);
        CreateConnectionRequest createConnectionRequest = new CreateConnectionRequest(); // CreateConnectionRequest | 
        try {
            CreateConnectionResponse result = apiInstance.createWCConnection(createConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#createWCConnection");
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


## deleteWCConnection

> deleteWCConnection(id)

Remove an existing Web3 connection.

Remove a Web3 connection

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Web3ConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        Web3ConnectionsApi apiInstance = new Web3ConnectionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the existing Web3 connection to remove.
        try {
            apiInstance.deleteWCConnection(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#deleteWCConnection");
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


## getConnections

> GetConnectionsResponse getConnections(order, filter, sort, pageSize, next)

List all open Web3 connections.

Get open Web3 connections.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Web3ConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        Web3ConnectionsApi apiInstance = new Web3ConnectionsApi(defaultClient);
        String order = "ASC"; // String | List order; ascending or descending.
        GetConnectionsFilterParameter filter = new HashMap(); // GetConnectionsFilterParameter | Parsed filter object
        String sort = "id"; // String | Property to sort Web3 connections by.
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Amount of results to return in the next page.
        String next = "next_example"; // String | Cursor to the next page
        try {
            GetConnectionsResponse result = apiInstance.getConnections(order, filter, sort, pageSize, next);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#getConnections");
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
| **filter** | [**GetConnectionsFilterParameter**](.md)| Parsed filter object | [optional] |
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


## updateWCConnection

> updateWCConnection(id, respondToConnectionRequest)

Respond to a pending Web3 connection request.

Submit a response to *approve* or *reject* an initiated Web3 connection. * Note: This call is used to complete your &#x60;POST /v1/connections/wc/&#x60; request.  After this succeeds, your new Web3 connection is created and functioning.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Web3ConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        Web3ConnectionsApi apiInstance = new Web3ConnectionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the initiated Web3 connection to approve.
        RespondToConnectionRequest respondToConnectionRequest = new RespondToConnectionRequest(); // RespondToConnectionRequest | 
        try {
            apiInstance.updateWCConnection(id, respondToConnectionRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling Web3ConnectionsApi#updateWCConnection");
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

