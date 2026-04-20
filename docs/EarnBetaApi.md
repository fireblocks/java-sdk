# EarnBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveTermsOfService**](EarnBetaApi.md#approveTermsOfService) | **POST** /earn/providers/{providerId}/approve_terms_of_service | Approve earn provider terms of service |
| [**createEarnAction**](EarnBetaApi.md#createEarnAction) | **POST** /earn/actions | Create and execute a lending action (deposit or withdraw) |
| [**getEarnAction**](EarnBetaApi.md#getEarnAction) | **GET** /earn/actions/{id} | Get a single earn lending action |
| [**getEarnActions**](EarnBetaApi.md#getEarnActions) | **GET** /earn/actions | List earn lending actions |
| [**getEarnOpportunities**](EarnBetaApi.md#getEarnOpportunities) | **GET** /earn/opportunities | Get list of earn opportunities |
| [**getEarnPositions**](EarnBetaApi.md#getEarnPositions) | **GET** /earn/positions | Get list of earn positions |
| [**getEarnProviders**](EarnBetaApi.md#getEarnProviders) | **GET** /earn/providers | Get list of earn providers |



## approveTermsOfService

> CompletableFuture<ApiResponse<Void>> approveTermsOfService approveTermsOfService(providerId, idempotencyKey)

Approve earn provider terms of service

Approves the lending provider&#39;s terms of service for this workspace. When &#x60;isTermsApprovalRequired&#x60; is true on the provider (see list providers), call this once before creating or executing earn actions with that provider. After success, &#x60;GET /earn/providers&#x60; reflects &#x60;isTermsOfServiceApproved&#x60;.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.EarnBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String providerId = "MORPHO"; // String | Stable protocol identifier for the earn provider (`MORPHO` or `AAVE`).
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.earnBeta().approveTermsOfService(providerId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EarnBetaApi#approveTermsOfService");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnBetaApi#approveTermsOfService");
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
| **providerId** | **String**| Stable protocol identifier for the earn provider (&#x60;MORPHO&#x60; or &#x60;AAVE&#x60;). | [enum: MORPHO, AAVE] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

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
| **204** | Terms of service accepted. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createEarnAction

> CompletableFuture<ApiResponse<CreateEarnActionResponse>> createEarnAction createEarnAction(createEarnActionRequest, idempotencyKey)

Create and execute a lending action (deposit or withdraw)

Creates and runs a sequence of on-chain steps for either a deposit into or a withdrawal from an earn vault/market. Specify the operation with &#x60;action&#x60; in the request body (&#x60;DEPOSIT&#x60; or &#x60;WITHDRAW&#x60;).  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.EarnBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateEarnActionRequest createEarnActionRequest = new CreateEarnActionRequest(); // CreateEarnActionRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateEarnActionResponse>> response = fireblocks.earnBeta().createEarnAction(createEarnActionRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EarnBetaApi#createEarnAction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnBetaApi#createEarnAction");
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
| **createEarnActionRequest** | [**CreateEarnActionRequest**](CreateEarnActionRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateEarnActionResponse**](CreateEarnActionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., opportunity, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEarnAction

> CompletableFuture<ApiResponse<GetActionResponse>> getEarnAction getEarnAction(id)

Get a single earn lending action

Returns one lending action by its action sequence id (tenant-scoped).  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.EarnBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "id_example"; // String | Action sequence id (UUID).
        try {
            CompletableFuture<ApiResponse<GetActionResponse>> response = fireblocks.earnBeta().getEarnAction(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EarnBetaApi#getEarnAction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnBetaApi#getEarnAction");
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
| **id** | **String**| Action sequence id (UUID). | |

### Return type

CompletableFuture<ApiResponse<[**GetActionResponse**](GetActionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: action does not exist or is not visible for this tenant. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEarnActions

> CompletableFuture<ApiResponse<GetActionsResponse>> getEarnActions getEarnActions(pageCursor, pageSize, sortBy, order)

List earn lending actions

Returns a paginated list of lending actions (deposits and withdrawals) for the authenticated tenant.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.EarnBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "pageCursor_example"; // String | Cursor for the next or previous page of results.
        Integer pageSize = 100; // Integer | Number of items per page (default 100, max 100).
        String sortBy = "createdAt"; // String | Field to sort results by.
        String order = "ASC"; // String | Sort order (ASC or DESC).
        try {
            CompletableFuture<ApiResponse<GetActionsResponse>> response = fireblocks.earnBeta().getEarnActions(pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EarnBetaApi#getEarnActions");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnBetaApi#getEarnActions");
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
| **pageCursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **pageSize** | **Integer**| Number of items per page (default 100, max 100). | [optional] [default to 100] |
| **sortBy** | **String**| Field to sort results by. | [optional] [enum: createdAt, updatedAt] |
| **order** | **String**| Sort order (ASC or DESC). | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**GetActionsResponse**](GetActionsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEarnOpportunities

> CompletableFuture<ApiResponse<GetOpportunitiesResponse>> getEarnOpportunities getEarnOpportunities(pageCursor, pageSize, sortBy, order)

Get list of earn opportunities

Get list of earn opportunities (vaults).  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.EarnBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "pageCursor_example"; // String | Cursor for the next or previous page of results.
        Integer pageSize = 100; // Integer | Number of items per page.
        String sortBy = "sortBy_example"; // String | Field to sort results by.
        String order = "ASC"; // String | Sort order (ASC or DESC).
        try {
            CompletableFuture<ApiResponse<GetOpportunitiesResponse>> response = fireblocks.earnBeta().getEarnOpportunities(pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EarnBetaApi#getEarnOpportunities");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnBetaApi#getEarnOpportunities");
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
| **pageCursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 100] |
| **sortBy** | **String**| Field to sort results by. | [optional] |
| **order** | **String**| Sort order (ASC or DESC). | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**GetOpportunitiesResponse**](GetOpportunitiesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEarnPositions

> CompletableFuture<ApiResponse<GetPositionsResponse>> getEarnPositions getEarnPositions(chainId, providerId, pageCursor, pageSize, sortBy, order)

Get list of earn positions

Get list of earn positions for accounts tracked for this workspace.  Optional query parameters filter by chain, provider, and pagination.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.EarnBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        Integer chainId = 56; // Integer | 
        String providerId = "MORPHO"; // String | 
        String pageCursor = "pageCursor_example"; // String | Cursor for the next or previous page of results.
        Integer pageSize = 100; // Integer | Number of items per page.
        String sortBy = "sortBy_example"; // String | Field to sort results by.
        String order = "ASC"; // String | Sort order (ASC or DESC).
        try {
            CompletableFuture<ApiResponse<GetPositionsResponse>> response = fireblocks.earnBeta().getEarnPositions(chainId, providerId, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EarnBetaApi#getEarnPositions");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnBetaApi#getEarnPositions");
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
| **chainId** | **Integer**|  | [optional] |
| **providerId** | **String**|  | [optional] [enum: MORPHO, AAVE] |
| **pageCursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 100] |
| **sortBy** | **String**| Field to sort results by. | [optional] |
| **order** | **String**| Sort order (ASC or DESC). | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**GetPositionsResponse**](GetPositionsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getEarnProviders

> CompletableFuture<ApiResponse<GetProvidersResponse>> getEarnProviders getEarnProviders(pageCursor, pageSize, sortBy, order)

Get list of earn providers

Get list of earn providers.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.EarnBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "pageCursor_example"; // String | Cursor for the next or previous page of results.
        Integer pageSize = 100; // Integer | Number of items per page.
        String sortBy = "sortBy_example"; // String | Field to sort results by.
        String order = "ASC"; // String | Sort order (ASC or DESC).
        try {
            CompletableFuture<ApiResponse<GetProvidersResponse>> response = fireblocks.earnBeta().getEarnProviders(pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling EarnBetaApi#getEarnProviders");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnBetaApi#getEarnProviders");
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
| **pageCursor** | **String**| Cursor for the next or previous page of results. | [optional] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 100] |
| **sortBy** | **String**| Field to sort results by. | [optional] |
| **order** | **String**| Sort order (ASC or DESC). | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**GetProvidersResponse**](GetProvidersResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

