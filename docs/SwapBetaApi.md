# SwapBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveTermsOfService**](SwapBetaApi.md#approveTermsOfService) | **POST** /swap/providers/{providerId}/approve_terms | Approve terms of service |
| [**createQuote**](SwapBetaApi.md#createQuote) | **POST** /swap/providers/{providerId}/quote | Create a quote |
| [**createSwapOperation**](SwapBetaApi.md#createSwapOperation) | **POST** /swap/operations | Create swap operation |
| [**getSwapOperationById**](SwapBetaApi.md#getSwapOperationById) | **GET** /swap/operations/{operationId} | Get operation details |
| [**getSwapOperations**](SwapBetaApi.md#getSwapOperations) | **GET** /swap/operations | Get Operations list |
| [**getSwapProviders**](SwapBetaApi.md#getSwapProviders) | **GET** /swap/providers | Get Providers List |



## approveTermsOfService

> CompletableFuture<ApiResponse<SwapProvider>> approveTermsOfService approveTermsOfService(providerId, idempotencyKey)

Approve terms of service

Approve the terms of service for a swap provider. Some providers require this approval before performing a swap action for the first time.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Swap, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.

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
import com.fireblocks.sdk.api.SwapBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID providerId = UUID.randomUUID(); // UUID | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SwapProvider>> response = fireblocks.swapBeta().approveTermsOfService(providerId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SwapBetaApi#approveTermsOfService");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SwapBetaApi#approveTermsOfService");
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
| **providerId** | **UUID**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SwapProvider**](SwapProvider.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successfully approve terms of service |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createQuote

> CompletableFuture<ApiResponse<QuoteResponse>> createQuote createQuote(quoteRequest, providerId, idempotencyKey)

Create a quote

Create a quote from specific swap provider.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Swap, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.SwapBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        QuoteRequest quoteRequest = new QuoteRequest(); // QuoteRequest | 
        UUID providerId = UUID.randomUUID(); // UUID | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<QuoteResponse>> response = fireblocks.swapBeta().createQuote(quoteRequest, providerId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SwapBetaApi#createQuote");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SwapBetaApi#createQuote");
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
| **quoteRequest** | [**QuoteRequest**](QuoteRequest.md)|  | |
| **providerId** | **UUID**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**QuoteResponse**](QuoteResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The response can be one of two possible DTOs, depending if the request contains the accountId property. |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createSwapOperation

> CompletableFuture<ApiResponse<SwapOperation>> createSwapOperation createSwapOperation(swapOperationRequest, idempotencyKey)

Create swap operation

Create swap operation based on a provided quote Id  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Swap, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.

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
import com.fireblocks.sdk.api.SwapBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        SwapOperationRequest swapOperationRequest = new SwapOperationRequest(); // SwapOperationRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SwapOperation>> response = fireblocks.swapBeta().createSwapOperation(swapOperationRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SwapBetaApi#createSwapOperation");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SwapBetaApi#createSwapOperation");
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
| **swapOperationRequest** | [**SwapOperationRequest**](SwapOperationRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SwapOperation**](SwapOperation.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getSwapOperationById

> CompletableFuture<ApiResponse<SwapOperation>> getSwapOperationById getSwapOperationById(operationId)

Get operation details

Get swap operation Details by ID.  Note:These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Swap, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.SwapBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String operationId = "operationId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<SwapOperation>> response = fireblocks.swapBeta().getSwapOperationById(operationId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SwapBetaApi#getSwapOperationById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SwapBetaApi#getSwapOperationById");
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
| **operationId** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**SwapOperation**](SwapOperation.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getSwapOperations

> CompletableFuture<ApiResponse<SwapOperationsPaginatedResponse>> getSwapOperations getSwapOperations(pageCursor, pageSize)

Get Operations list

Return a list of swap operations for the specific workspace The operations are sorted by creation date in descending order, meaning the most recent operation appears first.  Note:These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.SwapBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "pageCursor_example"; // String | Cursor of the required page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Number of items in a page, Acceptable values are 1-100. Maximum value is 100
        try {
            CompletableFuture<ApiResponse<SwapOperationsPaginatedResponse>> response = fireblocks.swapBeta().getSwapOperations(pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SwapBetaApi#getSwapOperations");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SwapBetaApi#getSwapOperations");
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
| **pageCursor** | **String**| Cursor of the required page | [optional] |
| **pageSize** | **BigDecimal**| Number of items in a page, Acceptable values are 1-100. Maximum value is 100 | [optional] [default to 10] |

### Return type

CompletableFuture<ApiResponse<[**SwapOperationsPaginatedResponse**](SwapOperationsPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated response containing OperationDto objects |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getSwapProviders

> CompletableFuture<ApiResponse<SwapProvidersPaginatedResponse>> getSwapProviders getSwapProviders(pageCursor, pageSize)

Get Providers List

Return a list of all supported swap providers.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Swap, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.SwapBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "pageCursor_example"; // String | Cursor of the required page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Number of items in a page, Acceptable values are 1-100. Maximum value is 100
        try {
            CompletableFuture<ApiResponse<SwapProvidersPaginatedResponse>> response = fireblocks.swapBeta().getSwapProviders(pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SwapBetaApi#getSwapProviders");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SwapBetaApi#getSwapProviders");
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
| **pageCursor** | **String**| Cursor of the required page | [optional] |
| **pageSize** | **BigDecimal**| Number of items in a page, Acceptable values are 1-100. Maximum value is 100 | [optional] [default to 10] |

### Return type

CompletableFuture<ApiResponse<[**SwapProvidersPaginatedResponse**](SwapProvidersPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated response containing ProviderDto objects |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

