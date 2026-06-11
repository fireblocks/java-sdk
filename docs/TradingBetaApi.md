# TradingBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrder**](TradingBetaApi.md#createOrder) | **POST** /trading/orders | Create an order |
| [**createQuote**](TradingBetaApi.md#createQuote) | **POST** /trading/quotes | Create a quote |
| [**fetchAllOffers**](TradingBetaApi.md#fetchAllOffers) | **POST** /trading/offers | Get all offers |
| [**fetchRates**](TradingBetaApi.md#fetchRates) | **POST** /trading/rates | Get rates |
| [**getOrder**](TradingBetaApi.md#getOrder) | **GET** /trading/orders/{orderId} | Get order details |
| [**getOrderRequirements**](TradingBetaApi.md#getOrderRequirements) | **GET** /trading/orders/{orderId}/requirement | Get order requirement details for an order |
| [**getOrders**](TradingBetaApi.md#getOrders) | **GET** /trading/orders | Get orders |
| [**getTradingProviderById**](TradingBetaApi.md#getTradingProviderById) | **GET** /trading/providers/{providerId} | Get trading provider by ID |
| [**getTradingProviders**](TradingBetaApi.md#getTradingProviders) | **GET** /trading/providers | Get providers |
| [**submitOrderRequirements**](TradingBetaApi.md#submitOrderRequirements) | **POST** /trading/orders/{orderId}/requirement/data | Submit a response to an order requirement |
| [**uploadOrderRequirementFile**](TradingBetaApi.md#uploadOrderRequirementFile) | **POST** /trading/orders/{orderId}/requirement/file | Upload a file for an order requirement |



## createOrder

> CompletableFuture<ApiResponse<OrderDetails>> createOrder createOrder(createOrderRequest, idempotencyKey)

Create an order

Create an order to buy or sell an asset. If no source is given, an external source will be use.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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
| **202** | Order creation response |  * X-Request-ID -  <br>  |
| **400** | Bad request: invalid input parameters, malformed request body, or validation failure. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createQuote

> CompletableFuture<ApiResponse<QuotesResponse>> createQuote createQuote(createQuote, idempotencyKey)

Create a quote

Generate a time-limited quote for asset conversion, providing exchange rate and amount calculations.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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
| **201** | Quote created |  * X-Request-ID -  <br>  |
| **400** | Bad request: invalid input parameters, malformed request body, or validation failure. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## fetchAllOffers

> CompletableFuture<ApiResponse<OffersResponse>> fetchAllOffers fetchAllOffers(createOffersRequest, idempotencyKey)

Get all offers

Retrieve all available offers across the workspace for a given asset pair. Always operates in open scope — no provider or account selection required. Returns a mix of indicative rates and committed quotes as applicable per provider.  If no slippageBps is provided, it defaults to 50 bps (0.5%). Slippage and settlement configuration do not affect the returned rate.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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

        CreateOffersRequest createOffersRequest = new CreateOffersRequest(); // CreateOffersRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<OffersResponse>> response = fireblocks.tradingBeta().fetchAllOffers(createOffersRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#fetchAllOffers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#fetchAllOffers");
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
| **createOffersRequest** | [**CreateOffersRequest**](CreateOffersRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**OffersResponse**](OffersResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Offers response |  * X-Request-ID -  <br>  |
| **400** | Bad request: invalid input parameters, malformed request body, or validation failure. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## fetchRates

> CompletableFuture<ApiResponse<RatesResponse>> fetchRates fetchRates(ratesRequest, idempotencyKey)

Get rates

Retrieve indicative exchange rate from specified providers for a given asset pair. Rates are non-executable price signals intended for discovery and display purposes.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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

        RatesRequest ratesRequest = new RatesRequest(); // RatesRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<RatesResponse>> response = fireblocks.tradingBeta().fetchRates(ratesRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#fetchRates");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#fetchRates");
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
| **ratesRequest** | [**RatesRequest**](RatesRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**RatesResponse**](RatesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rate response |  * X-Request-ID -  <br>  |
| **400** | Bad request: invalid input parameters, malformed request body, or validation failure. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getOrder

> CompletableFuture<ApiResponse<OrderDetails>> getOrder getOrder(orderId)

Get order details

Retrieve detailed information about a specific order by its ID.  Note:These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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
| **200** | Order response |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., order). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getOrderRequirements

> CompletableFuture<ApiResponse<OrderRequirementDetails>> getOrderRequirements getOrderRequirements(orderId)

Get order requirement details for an order

Fetch order requirement details for an order that is in &#x60;AWAITING_INFORMATION&#x60; status.  The response includes &#x60;requirementId&#x60; and &#x60;dueBy&#x60; metadata, a &#x60;requiredData&#x60; JSON Schema (Draft-7) describing the shape of the &#x60;data&#x60; object expected on &#x60;POST /trading/orders/{orderId}/requirement/data&#x60;, and &#x60;requiredFiles&#x60; descriptors for any files the provider requires (uploaded via &#x60;POST /trading/orders/{orderId}/requirement/file&#x60;).  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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

        String orderId = "orderId_example"; // String | The ID of the order for which the order requirement is issued.
        try {
            CompletableFuture<ApiResponse<OrderRequirementDetails>> response = fireblocks.tradingBeta().getOrderRequirements(orderId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#getOrderRequirements");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#getOrderRequirements");
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
| **orderId** | **String**| The ID of the order for which the order requirement is issued. | |

### Return type

CompletableFuture<ApiResponse<[**OrderRequirementDetails**](OrderRequirementDetails.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order requirement details |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: the order does not exist. |  * X-Request-ID -  <br>  |
| **409** | Conflict: the order exists but does not have an active order requirement (e.g., the order is not in &#x60;AWAITING_INFORMATION&#x60;). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getOrders

> CompletableFuture<ApiResponse<GetOrdersResponse>> getOrders getOrders(pageSize, pageCursor, order, accountId, providerId, statuses, startTime, endTime, assetConversionType)

Get orders

Retrieve a paginated list of orders with optional filtering by account, provider, status, and time range.  Note:These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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
| **200** | Orders response |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTradingProviderById

> CompletableFuture<ApiResponse<TradingProvider>> getTradingProviderById getTradingProviderById(providerId)

Get trading provider by ID

Retrieve a single provider by ID.  **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  **Endpoint Permission:** Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes). 

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

        String providerId = "providerId_example"; // String | The unique identifier of the provider.
        try {
            CompletableFuture<ApiResponse<TradingProvider>> response = fireblocks.tradingBeta().getTradingProviderById(providerId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#getTradingProviderById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#getTradingProviderById");
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
| **providerId** | **String**| The unique identifier of the provider. | |

### Return type

CompletableFuture<ApiResponse<[**TradingProvider**](TradingProvider.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Single provider details. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden - insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Provider not found. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded - slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTradingProviders

> CompletableFuture<ApiResponse<ProvidersListResponse>> getTradingProviders getTradingProviders(pageSize, pageCursor)

Get providers

Retrieve a list of all available external providers supporting trading activities through the platform.  **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  **Endpoint Permission:** Owner, Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes). 

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
| **200** | Providers response |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## submitOrderRequirements

> CompletableFuture<ApiResponse<Void>> submitOrderRequirements submitOrderRequirements(submitOrderRequirementRequest, orderId, idempotencyKey)

Submit a response to an order requirement

Submit the user&#39;s textual response to an order requirement on an order that is in &#x60;AWAITING_INFORMATION&#x60; status.  The request body carries &#x60;data&#x60; — a free-form object conforming to the &#x60;requiredData&#x60; JSON Schema returned by the GET endpoint. Any required files are uploaded separately via &#x60;POST /trading/orders/{orderId}/requirement/file&#x60;.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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

        SubmitOrderRequirementRequest submitOrderRequirementRequest = new SubmitOrderRequirementRequest(); // SubmitOrderRequirementRequest | 
        String orderId = "orderId_example"; // String | The ID of the order to submit the order requirement response for.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.tradingBeta().submitOrderRequirements(submitOrderRequirementRequest, orderId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#submitOrderRequirements");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#submitOrderRequirements");
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
| **submitOrderRequirementRequest** | [**SubmitOrderRequirementRequest**](SubmitOrderRequirementRequest.md)|  | |
| **orderId** | **String**| The ID of the order to submit the order requirement response for. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Order requirement submission accepted for processing. |  * X-Request-ID -  <br>  |
| **400** | Bad request: invalid input parameters, malformed request body, or validation failure. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: the order does not exist. |  * X-Request-ID -  <br>  |
| **409** | Conflict: the order exists but does not have an active order requirement (e.g., the order is not in &#x60;AWAITING_INFORMATION&#x60;). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## uploadOrderRequirementFile

> CompletableFuture<ApiResponse<Void>> uploadOrderRequirementFile uploadOrderRequirementFile(fileKey, _file, orderId, idempotencyKey)

Upload a file for an order requirement

Upload a single file (multipart/form-data) in response to an order requirement on an order that is in &#x60;AWAITING_INFORMATION&#x60; status. Call this endpoint once per required file.  Send &#x60;fileKey&#x60; (matching a &#x60;fileKey&#x60; from &#x60;requiredFiles&#x60; on the GET response) and the binary &#x60;file&#x60;. Its type must be one of the supported file formats. Fireblocks encrypts each file and uploads it individually to the underlying provider. The textual response is submitted separately via &#x60;POST /trading/orders/{orderId}/requirement/data&#x60;.  Note: These endpoints are currently in beta and might be subject to changes.  If you want to participate and learn more about the Fireblocks Trading, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Editor.  For detailed information about error codes and troubleshooting, please refer to our [API Error Codes documentation](https://developers.fireblocks.com/reference/api-error-codes).

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

        String fileKey = "fileKey_example"; // String | Identifier of the required file this upload satisfies. Must match a `fileKey` from `requiredFiles` on the GET response.
        File _file = new File("/path/to/file"); // File | The binary file content. The file's type must be one of the supported OrderRequirementAllowedFileType values; the file name and type are derived from the uploaded part.
        String orderId = "orderId_example"; // String | The ID of the order to upload the order requirement file for.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.tradingBeta().uploadOrderRequirementFile(fileKey, _file, orderId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TradingBetaApi#uploadOrderRequirementFile");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingBetaApi#uploadOrderRequirementFile");
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
| **fileKey** | **String**| Identifier of the required file this upload satisfies. Must match a &#x60;fileKey&#x60; from &#x60;requiredFiles&#x60; on the GET response. | |
| **_file** | **File**| The binary file content. The file&#39;s type must be one of the supported OrderRequirementAllowedFileType values; the file name and type are derived from the uploaded part. | |
| **orderId** | **String**| The ID of the order to upload the order requirement file for. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | File accepted for processing. |  * X-Request-ID -  <br>  |
| **400** | Bad request: unsupported file type, missing fileKey, malformed request, or validation failure. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted access. |  * X-Request-ID -  <br>  |
| **404** | Not found: the order does not exist. |  * X-Request-ID -  <br>  |
| **409** | Conflict: the order exists but does not have an active order requirement (e.g., the order is not in &#x60;AWAITING_INFORMATION&#x60;). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **5XX** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

