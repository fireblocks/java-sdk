# SmartTransferApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelTicket**](SmartTransferApi.md#cancelTicket) | **PUT** /smart-transfers/{ticketId}/cancel | Cancel Ticket |
| [**createTicket**](SmartTransferApi.md#createTicket) | **POST** /smart-transfers | Create Ticket |
| [**createTicketTerm**](SmartTransferApi.md#createTicketTerm) | **POST** /smart-transfers/{ticketId}/terms | Create leg (term) |
| [**findTicketById**](SmartTransferApi.md#findTicketById) | **GET** /smart-transfers/{ticketId} | Search Tickets by ID |
| [**findTicketTermById**](SmartTransferApi.md#findTicketTermById) | **GET** /smart-transfers/{ticketId}/terms/{termId} | Search ticket by leg (term) ID |
| [**fulfillTicket**](SmartTransferApi.md#fulfillTicket) | **PUT** /smart-transfers/{ticketId}/fulfill | Fund ticket manually |
| [**fundTicketTerm**](SmartTransferApi.md#fundTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/fund | Define funding source |
| [**getSmartTransferUserGroups**](SmartTransferApi.md#getSmartTransferUserGroups) | **GET** /smart-transfers/settings/user-groups | Get user group |
| [**manuallyFundTicketTerm**](SmartTransferApi.md#manuallyFundTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/manually-fund | Manually add term transaction |
| [**removeTicketTerm**](SmartTransferApi.md#removeTicketTerm) | **DELETE** /smart-transfers/{ticketId}/terms/{termId} | Delete ticket leg (term) |
| [**searchTickets**](SmartTransferApi.md#searchTickets) | **GET** /smart-transfers | Find Ticket |
| [**setExternalRefId**](SmartTransferApi.md#setExternalRefId) | **PUT** /smart-transfers/{ticketId}/external-id | Add external ref. ID |
| [**setTicketExpiration**](SmartTransferApi.md#setTicketExpiration) | **PUT** /smart-transfers/{ticketId}/expires-in | Set expiration |
| [**setUserGroups**](SmartTransferApi.md#setUserGroups) | **POST** /smart-transfers/settings/user-groups | Set user group |
| [**submitTicket**](SmartTransferApi.md#submitTicket) | **PUT** /smart-transfers/{ticketId}/submit | Submit ticket |
| [**updateTicketTerm**](SmartTransferApi.md#updateTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId} | Update ticket leg (term) |



## cancelTicket

> CompletableFuture<ApiResponse<SmartTransferTicketResponse>> cancelTicket cancelTicket(ticketId, idempotencyKey)

Cancel Ticket

Cancel Smart Transfer ticket

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        String ticketId = "ticketId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response = apiInstance.cancelTicket(ticketId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#cancelTicket");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#cancelTicket");
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
| **ticketId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketResponse**](SmartTransferTicketResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Smart Transfer ticket successfully canceled |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **422** | Bad Request |  -  |


## createTicket

> CompletableFuture<ApiResponse<SmartTransferTicketResponse>> createTicket createTicket(smartTransferCreateTicket, idempotencyKey)

Create Ticket

Creates new Smart Transfer ticket

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferCreateTicket smartTransferCreateTicket = new SmartTransferCreateTicket(); // SmartTransferCreateTicket | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response = apiInstance.createTicket(smartTransferCreateTicket, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#createTicket");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#createTicket");
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
| **smartTransferCreateTicket** | [**SmartTransferCreateTicket**](SmartTransferCreateTicket.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketResponse**](SmartTransferTicketResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Smart Transfer ticket was created successfully |  -  |
| **403** | Unauthorized |  -  |
| **422** | Bad Request |  -  |


## createTicketTerm

> CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> createTicketTerm createTicketTerm(smartTransferCreateTicketTerm, ticketId, idempotencyKey)

Create leg (term)

Creates new smart transfer ticket term (when the ticket status is DRAFT)

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferCreateTicketTerm smartTransferCreateTicketTerm = new SmartTransferCreateTicketTerm(); // SmartTransferCreateTicketTerm | 
        String ticketId = "ticketId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response = apiInstance.createTicketTerm(smartTransferCreateTicketTerm, ticketId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#createTicketTerm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#createTicketTerm");
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
| **smartTransferCreateTicketTerm** | [**SmartTransferCreateTicketTerm**](SmartTransferCreateTicketTerm.md)|  | |
| **ticketId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketTermResponse**](SmartTransferTicketTermResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Smart Transfer ticket term was created successfully |  -  |
| **403** | Unauthorized |  -  |
| **422** | Bad Request |  -  |


## findTicketById

> CompletableFuture<ApiResponse<SmartTransferTicketResponse>> findTicketById findTicketById(ticketId)

Search Tickets by ID

Find Smart Transfer ticket by id

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        String ticketId = "ticketId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response = apiInstance.findTicketById(ticketId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#findTicketById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#findTicketById");
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
| **ticketId** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketResponse**](SmartTransferTicketResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Smart Transfer ticket returned successfully |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |


## findTicketTermById

> CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> findTicketTermById findTicketTermById(ticketId, termId)

Search ticket by leg (term) ID

Find Smart Transfer ticket term by id

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        String ticketId = "ticketId_example"; // String | 
        String termId = "termId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response = apiInstance.findTicketTermById(ticketId, termId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#findTicketTermById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#findTicketTermById");
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
| **ticketId** | **String**|  | |
| **termId** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketTermResponse**](SmartTransferTicketTermResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Smart Transfer ticket term returned successfully |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |


## fulfillTicket

> CompletableFuture<ApiResponse<SmartTransferTicketResponse>> fulfillTicket fulfillTicket(ticketId, idempotencyKey)

Fund ticket manually

Manually fulfill ticket, in case when all terms (legs) are funded manually

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        String ticketId = "ticketId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response = apiInstance.fulfillTicket(ticketId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#fulfillTicket");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#fulfillTicket");
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
| **ticketId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketResponse**](SmartTransferTicketResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fulfilled on Smart Transfer ticket |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **422** | Bad Request |  -  |


## fundTicketTerm

> CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> fundTicketTerm fundTicketTerm(smartTransferFundTerm, ticketId, termId, idempotencyKey)

Define funding source

Set funding source for ticket term (in case of ASYNC tickets, this will execute transfer immediately)

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferFundTerm smartTransferFundTerm = new SmartTransferFundTerm(); // SmartTransferFundTerm | 
        String ticketId = "ticketId_example"; // String | 
        String termId = "termId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response = apiInstance.fundTicketTerm(smartTransferFundTerm, ticketId, termId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#fundTicketTerm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#fundTicketTerm");
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
| **smartTransferFundTerm** | [**SmartTransferFundTerm**](SmartTransferFundTerm.md)|  | |
| **ticketId** | **String**|  | |
| **termId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketTermResponse**](SmartTransferTicketTermResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Funding source for ticket term successfully done |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **422** | Bad Request |  -  |


## getSmartTransferUserGroups

> CompletableFuture<ApiResponse<SmartTransferUserGroupsResponse>> getSmartTransferUserGroups getSmartTransferUserGroups()

Get user group

Get Smart Transfer user groups

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<SmartTransferUserGroupsResponse>> response = apiInstance.getSmartTransferUserGroups();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#getSmartTransferUserGroups");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#getSmartTransferUserGroups");
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

CompletableFuture<ApiResponse<[**SmartTransferUserGroupsResponse**](SmartTransferUserGroupsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User group settings were returned successfully |  -  |
| **403** | Unauthorized |  -  |
| **422** | Bad Request |  -  |


## manuallyFundTicketTerm

> CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> manuallyFundTicketTerm manuallyFundTicketTerm(smartTransferManuallyFundTerm, ticketId, termId, idempotencyKey)

Manually add term transaction

Manually set ticket term transaction

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferManuallyFundTerm smartTransferManuallyFundTerm = new SmartTransferManuallyFundTerm(); // SmartTransferManuallyFundTerm | 
        String ticketId = "ticketId_example"; // String | 
        String termId = "termId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response = apiInstance.manuallyFundTicketTerm(smartTransferManuallyFundTerm, ticketId, termId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#manuallyFundTicketTerm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#manuallyFundTicketTerm");
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
| **smartTransferManuallyFundTerm** | [**SmartTransferManuallyFundTerm**](SmartTransferManuallyFundTerm.md)|  | |
| **ticketId** | **String**|  | |
| **termId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketTermResponse**](SmartTransferTicketTermResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully manually set ticket term transaction |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **422** | Bad Request |  -  |


## removeTicketTerm

> CompletableFuture<ApiResponse<Void>> removeTicketTerm removeTicketTerm(ticketId, termId)

Delete ticket leg (term)

Delete ticket term when ticket is in DRAFT status

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        String ticketId = "ticketId_example"; // String | 
        String termId = "termId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.removeTicketTerm(ticketId, termId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#removeTicketTerm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#removeTicketTerm");
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
| **ticketId** | **String**|  | |
| **termId** | **String**|  | |

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
| **204** | Smart Transfer ticket term successfully removed |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |


## searchTickets

> CompletableFuture<ApiResponse<SmartTransferTicketFilteredResponse>> searchTickets searchTickets(q, statuses, networkId, createdByMe, expiresAfter, expiresBefore, type, externalRefId, after, limit)

Find Ticket

Finds Smart Transfer tickets that match the submitted criteria

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        String q = "q_example"; // String | Search string - counterparty name or asset or ticketId. Optional
        List<String> statuses = Arrays.asList(); // List<String> | Ticket statuses for Smart Transfer tickets. Optional
        String networkId = "networkId_example"; // String | NetworkId that is used in the ticket . Optional
        Boolean createdByMe = true; // Boolean | Filter created tickets by created by self or by others. Optional
        OffsetDateTime expiresAfter = OffsetDateTime.now(); // OffsetDateTime | Lower bound of search range. Optional
        OffsetDateTime expiresBefore = OffsetDateTime.now(); // OffsetDateTime | Upper bound of search range. Optional
        String type = "ASYNC"; // String | Type of transfer. ASYNC executes transfers as they are funded, ATOMIC executes all terms (legs) as one atomic transfer
        String externalRefId = "externalRefId_example"; // String | External ref. ID that workspace can use to identify ticket outside of Fireblocks system.
        String after = "after_example"; // String | ID of the record after which to fetch $limit records
        BigDecimal limit = new BigDecimal(78); // BigDecimal | Number of records to fetch. By default, it is 100
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketFilteredResponse>> response = apiInstance.searchTickets(q, statuses, networkId, createdByMe, expiresAfter, expiresBefore, type, externalRefId, after, limit);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#searchTickets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#searchTickets");
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
| **q** | **String**| Search string - counterparty name or asset or ticketId. Optional | [optional] |
| **statuses** | [**List&lt;String&gt;**](String.md)| Ticket statuses for Smart Transfer tickets. Optional | [optional] [enum: DRAFT, PENDING_APPROVAL, OPEN, IN_SETTLEMENT, FULFILLED, EXPIRED, CANCELED] |
| **networkId** | **String**| NetworkId that is used in the ticket . Optional | [optional] |
| **createdByMe** | **Boolean**| Filter created tickets by created by self or by others. Optional | [optional] |
| **expiresAfter** | **OffsetDateTime**| Lower bound of search range. Optional | [optional] |
| **expiresBefore** | **OffsetDateTime**| Upper bound of search range. Optional | [optional] |
| **type** | **String**| Type of transfer. ASYNC executes transfers as they are funded, ATOMIC executes all terms (legs) as one atomic transfer | [optional] [enum: ASYNC] |
| **externalRefId** | **String**| External ref. ID that workspace can use to identify ticket outside of Fireblocks system. | [optional] |
| **after** | **String**| ID of the record after which to fetch $limit records | [optional] |
| **limit** | **BigDecimal**| Number of records to fetch. By default, it is 100 | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketFilteredResponse**](SmartTransferTicketFilteredResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Smart Transfer tickets were returned successfully |  -  |
| **403** | Unauthorized |  -  |


## setExternalRefId

> CompletableFuture<ApiResponse<SmartTransferTicketResponse>> setExternalRefId setExternalRefId(smartTransferSetTicketExternalId, ticketId, idempotencyKey)

Add external ref. ID

Set external id Smart Transfer ticket

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferSetTicketExternalId smartTransferSetTicketExternalId = new SmartTransferSetTicketExternalId(); // SmartTransferSetTicketExternalId | 
        String ticketId = "ticketId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response = apiInstance.setExternalRefId(smartTransferSetTicketExternalId, ticketId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#setExternalRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#setExternalRefId");
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
| **smartTransferSetTicketExternalId** | [**SmartTransferSetTicketExternalId**](SmartTransferSetTicketExternalId.md)|  | |
| **ticketId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketResponse**](SmartTransferTicketResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully set external id on Smart Transfer ticket |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **422** | Bad Request |  -  |


## setTicketExpiration

> CompletableFuture<ApiResponse<SmartTransferTicketResponse>> setTicketExpiration setTicketExpiration(smartTransferSetTicketExpiration, ticketId, idempotencyKey)

Set expiration

Set expiration date on Smart Transfer ticket

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferSetTicketExpiration smartTransferSetTicketExpiration = new SmartTransferSetTicketExpiration(); // SmartTransferSetTicketExpiration | 
        String ticketId = "ticketId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response = apiInstance.setTicketExpiration(smartTransferSetTicketExpiration, ticketId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#setTicketExpiration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#setTicketExpiration");
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
| **smartTransferSetTicketExpiration** | [**SmartTransferSetTicketExpiration**](SmartTransferSetTicketExpiration.md)|  | |
| **ticketId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketResponse**](SmartTransferTicketResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully set expiration date on Smart Transfer ticket |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **422** | Bad Request |  -  |


## setUserGroups

> CompletableFuture<ApiResponse<SmartTransferUserGroupsResponse>> setUserGroups setUserGroups(smartTransferSetUserGroups, idempotencyKey)

Set user group

Set Smart Transfer user group

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferSetUserGroups smartTransferSetUserGroups = new SmartTransferSetUserGroups(); // SmartTransferSetUserGroups | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferUserGroupsResponse>> response = apiInstance.setUserGroups(smartTransferSetUserGroups, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#setUserGroups");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#setUserGroups");
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
| **smartTransferSetUserGroups** | [**SmartTransferSetUserGroups**](SmartTransferSetUserGroups.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferUserGroupsResponse**](SmartTransferUserGroupsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User group settings were set successfully |  -  |
| **403** | Unauthorized |  -  |
| **422** | Bad Request |  -  |


## submitTicket

> CompletableFuture<ApiResponse<SmartTransferTicketResponse>> submitTicket submitTicket(smartTransferSubmitTicket, ticketId, idempotencyKey)

Submit ticket

Submit Smart Transfer ticket - change status into ready for approval if auto approval is not turned on, or OPEN if auto approval is on

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferSubmitTicket smartTransferSubmitTicket = new SmartTransferSubmitTicket(); // SmartTransferSubmitTicket | 
        String ticketId = "ticketId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response = apiInstance.submitTicket(smartTransferSubmitTicket, ticketId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#submitTicket");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#submitTicket");
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
| **smartTransferSubmitTicket** | [**SmartTransferSubmitTicket**](SmartTransferSubmitTicket.md)|  | |
| **ticketId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketResponse**](SmartTransferTicketResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully submitted Smart Transfer ticket |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **422** | Bad Request |  -  |


## updateTicketTerm

> CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> updateTicketTerm updateTicketTerm(smartTransferUpdateTicketTerm, ticketId, termId, idempotencyKey)

Update ticket leg (term)

Update ticket term (when ticket status is DRAFT)

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.SmartTransferApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SmartTransferApi apiInstance = new SmartTransferApi(defaultClient);
        SmartTransferUpdateTicketTerm smartTransferUpdateTicketTerm = new SmartTransferUpdateTicketTerm(); // SmartTransferUpdateTicketTerm | 
        String ticketId = "ticketId_example"; // String | 
        String termId = "termId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response = apiInstance.updateTicketTerm(smartTransferUpdateTicketTerm, ticketId, termId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SmartTransferApi#updateTicketTerm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SmartTransferApi#updateTicketTerm");
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
| **smartTransferUpdateTicketTerm** | [**SmartTransferUpdateTicketTerm**](SmartTransferUpdateTicketTerm.md)|  | |
| **ticketId** | **String**|  | |
| **termId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SmartTransferTicketTermResponse**](SmartTransferTicketTermResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Smart Transfer ticket term updated successfully |  -  |
| **403** | Unauthorized |  -  |
| **404** | Not found |  -  |

