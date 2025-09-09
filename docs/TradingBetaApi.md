# TradingBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrder**](TradingBetaApi.md#createOrder) | **POST** /trading/orders | Create an order |
| [**createQuote**](TradingBetaApi.md#createQuote) | **POST** /trading/quotes | Create a quote |
| [**getOrder**](TradingBetaApi.md#getOrder) | **GET** /trading/orders/{orderId} | Get order details |
| [**getOrders**](TradingBetaApi.md#getOrders) | **GET** /trading/orders | Get orders |
| [**getTradingProviders**](TradingBetaApi.md#getTradingProviders) | **GET** /trading/providers | Get providers |



## createOrder

> CompletableFuture<ApiResponse<OrderDetails>> createOrder createOrder(createOrderRequest, idempotencyKey)

Create an order

Create an order to buy or sell an asset. If no source is given, an external source will be use.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.

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
import com.fireblocks.sdk.api.TradingBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateOrderRequest createOrderRequest = new CreateOrderRequest(); // CreateOrderRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<OrderDetails>> response = fireblocks.tradingBeta().createOrder(createOrderRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#createOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#createOrder");
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
| **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**OrderDetails**](OrderDetails.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Order creation response |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | Not found |  -  |
| **5XX** | Internal error. |  -  |


## createQuote

> CompletableFuture<ApiResponse<QuotesResponse>> createQuote createQuote(createQuote, idempotencyKey)

Create a quote

Generate a time-limited quote for asset conversion, providing exchange rate and amount calculations.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.

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
import com.fireblocks.sdk.api.TradingBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateQuote createQuote = new CreateQuote(); // CreateQuote | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<QuotesResponse>> response = fireblocks.tradingBeta().createQuote(createQuote, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#createQuote");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#createQuote");
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
| **createQuote** | [**CreateQuote**](CreateQuote.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**QuotesResponse**](QuotesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Quote created |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | Not found |  -  |
| **5XX** | Internal error. |  -  |


## getOrder

> CompletableFuture<ApiResponse<OrderDetails>> getOrder getOrder(orderId)

Get order details

Retrieve detailed information about a specific order by its ID.  Note:These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.TradingBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String orderId = "orderId_example"; // String | The ID of the order to fetch.
        try {
            CompletableFuture<ApiResponse<OrderDetails>> response = fireblocks.tradingBeta().getOrder(orderId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#getOrder");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#getOrder");
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
| **orderId** | **String**| The ID of the order to fetch. | |

### Return type

CompletableFuture<ApiResponse<[**OrderDetails**](OrderDetails.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order response |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | Not found |  -  |
| **5XX** | Internal error. |  -  |


## getOrders

> CompletableFuture<ApiResponse<GetOrdersResponse>> getOrders getOrders(pageSize, pageCursor, order, accountId, providerId, statuses, startTime, endTime, assetConversionType)

Get orders

Retrieve a paginated list of orders with optional filtering by account, provider, status, and time range.  Note:These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.TradingBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        Integer pageSize = 56; // Integer | pageSize for pagination.
        String pageCursor = "pageCursor_example"; // String | 
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        List<String> accountId = Arrays.asList(); // List<String> | Filter by accountId.
        List<String> providerId = Arrays.asList(); // List<String> | Filter by providerId.
        List<OrderStatus> statuses = Arrays.asList(); // List<OrderStatus> | Filter by order status.
        Integer startTime = 56; // Integer | 
        Integer endTime = 56; // Integer | 
        String assetConversionType = "DIGITAL_ONLY"; // String | 
        try {
            CompletableFuture<ApiResponse<GetOrdersResponse>> response = fireblocks.tradingBeta().getOrders(pageSize, pageCursor, order, accountId, providerId, statuses, startTime, endTime, assetConversionType);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#getOrders");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#getOrders");
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
| **pageSize** | **Integer**| pageSize for pagination. | |
| **pageCursor** | **String**|  | [optional] |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |
| **accountId** | [**List&lt;String&gt;**](String.md)| Filter by accountId. | [optional] |
| **providerId** | [**List&lt;String&gt;**](String.md)| Filter by providerId. | [optional] |
| **statuses** | [**List&lt;OrderStatus&gt;**](OrderStatus.md)| Filter by order status. | [optional] |
| **startTime** | **Integer**|  | [optional] |
| **endTime** | **Integer**|  | [optional] |
| **assetConversionType** | **String**|  | [optional] [enum: DIGITAL_ONLY, FIAT] |

### Return type

CompletableFuture<ApiResponse<[**GetOrdersResponse**](GetOrdersResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Orders response |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | Not found |  -  |
| **5XX** | Internal error. |  -  |


## getTradingProviders

> CompletableFuture<ApiResponse<ProvidersListResponse>> getTradingProviders getTradingProviders(pageSize, pageCursor)

Get providers

Retrieve a list of all available external providers supporting trading activities through the platform.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.TradingBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        Integer pageSize = 20; // Integer | Page size for pagination.
        String pageCursor = "pageCursor_example"; // String | Page cursor for pagination.
        try {
            CompletableFuture<ApiResponse<ProvidersListResponse>> response = fireblocks.tradingBeta().getTradingProviders(pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#getTradingProviders");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#getTradingProviders");
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
| **pageSize** | **Integer**| Page size for pagination. | [optional] [default to 20] |
| **pageCursor** | **String**| Page cursor for pagination. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ProvidersListResponse**](ProvidersListResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Providers response |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **5XX** | Internal error. |  -  |

