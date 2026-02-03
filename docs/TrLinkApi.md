# TrLinkApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assessTRLinkTravelRuleRequirement**](TrLinkApi.md#assessTRLinkTravelRuleRequirement) | **POST** /screening/trlink/customers/integration/{customerIntegrationId}/trm/assess | Assess Travel Rule requirement |
| [**cancelTRLinkTrm**](TrLinkApi.md#cancelTRLinkTrm) | **POST** /screening/trlink/customers/integration/{customerIntegrationId}/trm/{trmId}/cancel | Cancel Travel Rule Message |
| [**connectTRLinkIntegration**](TrLinkApi.md#connectTRLinkIntegration) | **PUT** /screening/trlink/customers/integration/{customerIntegrationId} | Connect customer integration |
| [**createTRLinkCustomer**](TrLinkApi.md#createTRLinkCustomer) | **POST** /screening/trlink/customers | Create customer |
| [**createTRLinkIntegration**](TrLinkApi.md#createTRLinkIntegration) | **POST** /screening/trlink/customers/integration | Create customer integration |
| [**createTRLinkTrm**](TrLinkApi.md#createTRLinkTrm) | **POST** /screening/trlink/customers/integration/{customerIntegrationId}/trm | Create Travel Rule Message |
| [**deleteTRLinkCustomer**](TrLinkApi.md#deleteTRLinkCustomer) | **DELETE** /screening/trlink/customers/{customerId} | Delete customer |
| [**disconnectTRLinkIntegration**](TrLinkApi.md#disconnectTRLinkIntegration) | **DELETE** /screening/trlink/customers/integration/{customerIntegrationId} | Disconnect customer integration |
| [**getTRLinkCustomerById**](TrLinkApi.md#getTRLinkCustomerById) | **GET** /screening/trlink/customers/{customerId} | Get customer by ID |
| [**getTRLinkCustomerIntegrationById**](TrLinkApi.md#getTRLinkCustomerIntegrationById) | **GET** /screening/trlink/customers/{customerId}/integrations/{customerIntegrationId} | Get customer integration by ID |
| [**getTRLinkCustomerIntegrations**](TrLinkApi.md#getTRLinkCustomerIntegrations) | **GET** /screening/trlink/customers/{customerId}/integrations | Get customer integrations |
| [**getTRLinkCustomers**](TrLinkApi.md#getTRLinkCustomers) | **GET** /screening/trlink/customers | Get all customers |
| [**getTRLinkIntegrationPublicKey**](TrLinkApi.md#getTRLinkIntegrationPublicKey) | **GET** /screening/trlink/customers/integration/{customerIntegrationId}/public_key | Get public key for PII encryption |
| [**getTRLinkPartners**](TrLinkApi.md#getTRLinkPartners) | **GET** /screening/trlink/partners | List available TRLink partners |
| [**getTRLinkPolicy**](TrLinkApi.md#getTRLinkPolicy) | **GET** /screening/trlink/policy | Get TRLink policy |
| [**getTRLinkSupportedAsset**](TrLinkApi.md#getTRLinkSupportedAsset) | **GET** /screening/trlink/customers/integration/{customerIntegrationId}/assets/{assetId} | Get supported asset by ID |
| [**getTRLinkTrmById**](TrLinkApi.md#getTRLinkTrmById) | **GET** /screening/trlink/customers/integration/{customerIntegrationId}/trm/{trmId} | Get TRM by ID |
| [**getTRLinkVaspById**](TrLinkApi.md#getTRLinkVaspById) | **GET** /screening/trlink/customers/integration/{customerIntegrationId}/vasps/{vaspId} | Get VASP by ID |
| [**listTRLinkSupportedAssets**](TrLinkApi.md#listTRLinkSupportedAssets) | **GET** /screening/trlink/customers/integration/{customerIntegrationId}/assets | List supported assets |
| [**listTRLinkVasps**](TrLinkApi.md#listTRLinkVasps) | **GET** /screening/trlink/customers/integration/{customerIntegrationId}/vasps | List VASPs |
| [**redirectTRLinkTrm**](TrLinkApi.md#redirectTRLinkTrm) | **POST** /screening/trlink/customers/integration/{customerIntegrationId}/trm/{trmId}/redirect | Redirect Travel Rule Message |
| [**setTRLinkDestinationTravelRuleMessageId**](TrLinkApi.md#setTRLinkDestinationTravelRuleMessageId) | **POST** /screening/trlink/transaction/{txId}/destination/travel_rule_message_id | Set destination travel rule message ID |
| [**setTRLinkTransactionTravelRuleMessageId**](TrLinkApi.md#setTRLinkTransactionTravelRuleMessageId) | **POST** /screening/trlink/transaction/{txId}/travel_rule_message_id | Set transaction travel rule message ID |
| [**testTRLinkIntegrationConnection**](TrLinkApi.md#testTRLinkIntegrationConnection) | **POST** /screening/trlink/customers/integration/{customerIntegrationId}/test_connection | Test connection |
| [**updateTRLinkCustomer**](TrLinkApi.md#updateTRLinkCustomer) | **PUT** /screening/trlink/customers/{customerId} | Update customer |



## assessTRLinkTravelRuleRequirement

> CompletableFuture<ApiResponse<TRLinkAssessTravelRuleResponse>> assessTRLinkTravelRuleRequirement assessTRLinkTravelRuleRequirement(trLinkAssessTravelRuleRequest, customerIntegrationId, idempotencyKey)

Assess Travel Rule requirement

Assesses travel rule requirement for a transaction by validating stored credentials and determining whether Travel Rule compliance is required based on amount, jurisdiction, and partner thresholds.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkAssessTravelRuleRequest trLinkAssessTravelRuleRequest = new TRLinkAssessTravelRuleRequest(); // TRLinkAssessTravelRuleRequest | 
        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkAssessTravelRuleResponse>> response = fireblocks.trLink().assessTRLinkTravelRuleRequirement(trLinkAssessTravelRuleRequest, customerIntegrationId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#assessTRLinkTravelRuleRequirement");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#assessTRLinkTravelRuleRequirement");
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
| **trLinkAssessTravelRuleRequest** | [**TRLinkAssessTravelRuleRequest**](TRLinkAssessTravelRuleRequest.md)|  | |
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkAssessTravelRuleResponse**](TRLinkAssessTravelRuleResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Travel rule assessment completed |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## cancelTRLinkTrm

> CompletableFuture<ApiResponse<TRLinkTrmInfoResponse>> cancelTRLinkTrm cancelTRLinkTrm(trLinkCancelTrmRequest, customerIntegrationId, trmId, idempotencyKey)

Cancel Travel Rule Message

Cancels a travel rule message. The TRM status will be updated to cancelled and the partner will be notified.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkCancelTrmRequest trLinkCancelTrmRequest = new TRLinkCancelTrmRequest(); // TRLinkCancelTrmRequest | 
        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        String trmId = "trmId_example"; // String | Travel Rule Message unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkTrmInfoResponse>> response = fireblocks.trLink().cancelTRLinkTrm(trLinkCancelTrmRequest, customerIntegrationId, trmId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#cancelTRLinkTrm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#cancelTRLinkTrm");
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
| **trLinkCancelTrmRequest** | [**TRLinkCancelTrmRequest**](TRLinkCancelTrmRequest.md)|  | |
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **trmId** | **String**| Travel Rule Message unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkTrmInfoResponse**](TRLinkTrmInfoResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Transaction cancellation request accepted |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## connectTRLinkIntegration

> CompletableFuture<ApiResponse<TRLinkCustomerIntegrationResponse>> connectTRLinkIntegration connectTRLinkIntegration(trLinkConnectIntegrationRequest, customerIntegrationId, idempotencyKey)

Connect customer integration

Connects a customer integration by providing API credentials. Stores encrypted credentials and enables the integration for use.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkConnectIntegrationRequest trLinkConnectIntegrationRequest = new TRLinkConnectIntegrationRequest(); // TRLinkConnectIntegrationRequest | 
        UUID customerIntegrationId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | Customer integration unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkCustomerIntegrationResponse>> response = fireblocks.trLink().connectTRLinkIntegration(trLinkConnectIntegrationRequest, customerIntegrationId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#connectTRLinkIntegration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#connectTRLinkIntegration");
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
| **trLinkConnectIntegrationRequest** | [**TRLinkConnectIntegrationRequest**](TRLinkConnectIntegrationRequest.md)|  | |
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkCustomerIntegrationResponse**](TRLinkCustomerIntegrationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer integration connected successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createTRLinkCustomer

> CompletableFuture<ApiResponse<TRLinkCustomerResponse>> createTRLinkCustomer createTRLinkCustomer(trLinkCreateCustomerRequest, idempotencyKey)

Create customer

Creates a new customer (legal entity/VASP) for TRLink Travel Rule compliance operations. The customer represents your organization in the Travel Rule network and contains IVMS101-compliant identity information.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkCreateCustomerRequest trLinkCreateCustomerRequest = new TRLinkCreateCustomerRequest(); // TRLinkCreateCustomerRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkCustomerResponse>> response = fireblocks.trLink().createTRLinkCustomer(trLinkCreateCustomerRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#createTRLinkCustomer");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#createTRLinkCustomer");
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
| **trLinkCreateCustomerRequest** | [**TRLinkCreateCustomerRequest**](TRLinkCreateCustomerRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkCustomerResponse**](TRLinkCustomerResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Customer created successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createTRLinkIntegration

> CompletableFuture<ApiResponse<TRLinkCustomerIntegrationResponse>> createTRLinkIntegration createTRLinkIntegration(trLinkCreateIntegrationRequest, idempotencyKey)

Create customer integration

Creates a new TRLink integration for a customer. This establishes a connection placeholder between a customer and a Travel Rule partner. Use the connect endpoint to provide credentials after creation.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkCreateIntegrationRequest trLinkCreateIntegrationRequest = new TRLinkCreateIntegrationRequest(); // TRLinkCreateIntegrationRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkCustomerIntegrationResponse>> response = fireblocks.trLink().createTRLinkIntegration(trLinkCreateIntegrationRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#createTRLinkIntegration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#createTRLinkIntegration");
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
| **trLinkCreateIntegrationRequest** | [**TRLinkCreateIntegrationRequest**](TRLinkCreateIntegrationRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkCustomerIntegrationResponse**](TRLinkCustomerIntegrationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Customer integration created successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createTRLinkTrm

> CompletableFuture<ApiResponse<TRLinkTrmInfoResponse>> createTRLinkTrm createTRLinkTrm(trLinkCreateTrmRequest, customerIntegrationId, idempotencyKey)

Create Travel Rule Message

Creates a new travel rule message with IVMS101-compliant PII data. Encrypts sensitive originator and beneficiary information before sending to partner.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkCreateTrmRequest trLinkCreateTrmRequest = new TRLinkCreateTrmRequest(); // TRLinkCreateTrmRequest | 
        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkTrmInfoResponse>> response = fireblocks.trLink().createTRLinkTrm(trLinkCreateTrmRequest, customerIntegrationId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#createTRLinkTrm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#createTRLinkTrm");
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
| **trLinkCreateTrmRequest** | [**TRLinkCreateTrmRequest**](TRLinkCreateTrmRequest.md)|  | |
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkTrmInfoResponse**](TRLinkTrmInfoResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | TRM created successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteTRLinkCustomer

> CompletableFuture<ApiResponse<Void>> deleteTRLinkCustomer deleteTRLinkCustomer(customerId)

Delete customer

Deletes a customer and all associated integrations. This action cannot be undone.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerId = UUID.fromString("550e8400-e29b-41d4-a716-446655440001"); // UUID | Customer unique identifier
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.trLink().deleteTRLinkCustomer(customerId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#deleteTRLinkCustomer");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#deleteTRLinkCustomer");
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
| **customerId** | **UUID**| Customer unique identifier | |

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
| **204** | Customer deleted successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## disconnectTRLinkIntegration

> CompletableFuture<ApiResponse<Void>> disconnectTRLinkIntegration disconnectTRLinkIntegration(customerIntegrationId)

Disconnect customer integration

Disconnects a customer integration by removing stored credentials. The integration record is deleted and cannot be recovered.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerIntegrationId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | Customer integration unique identifier
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.trLink().disconnectTRLinkIntegration(customerIntegrationId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#disconnectTRLinkIntegration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#disconnectTRLinkIntegration");
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
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |

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
| **204** | Customer integration disconnected successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkCustomerById

> CompletableFuture<ApiResponse<TRLinkCustomerResponse>> getTRLinkCustomerById getTRLinkCustomerById(customerId)

Get customer by ID

Retrieves detailed information about a specific customer by their unique identifier.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerId = UUID.fromString("550e8400-e29b-41d4-a716-446655440001"); // UUID | Customer unique identifier
        try {
            CompletableFuture<ApiResponse<TRLinkCustomerResponse>> response = fireblocks.trLink().getTRLinkCustomerById(customerId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkCustomerById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkCustomerById");
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
| **customerId** | **UUID**| Customer unique identifier | |

### Return type

CompletableFuture<ApiResponse<[**TRLinkCustomerResponse**](TRLinkCustomerResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkCustomerIntegrationById

> CompletableFuture<ApiResponse<TRLinkCustomerIntegrationResponse>> getTRLinkCustomerIntegrationById getTRLinkCustomerIntegrationById(customerId, customerIntegrationId)

Get customer integration by ID

Retrieves detailed information about a specific customer integration.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerId = UUID.fromString("550e8400-e29b-41d4-a716-446655440001"); // UUID | Customer unique identifier
        UUID customerIntegrationId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | Customer integration unique identifier
        try {
            CompletableFuture<ApiResponse<TRLinkCustomerIntegrationResponse>> response = fireblocks.trLink().getTRLinkCustomerIntegrationById(customerId, customerIntegrationId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkCustomerIntegrationById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkCustomerIntegrationById");
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
| **customerId** | **UUID**| Customer unique identifier | |
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |

### Return type

CompletableFuture<ApiResponse<[**TRLinkCustomerIntegrationResponse**](TRLinkCustomerIntegrationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer integration retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkCustomerIntegrations

> CompletableFuture<ApiResponse<List<TRLinkCustomerIntegrationResponse>>> getTRLinkCustomerIntegrations getTRLinkCustomerIntegrations(customerId)

Get customer integrations

Retrieves all TRLink integrations for a specific customer. Returns a list of partner integrations configured for Travel Rule compliance.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerId = UUID.fromString("550e8400-e29b-41d4-a716-446655440001"); // UUID | Customer unique identifier
        try {
            CompletableFuture<ApiResponse<List<TRLinkCustomerIntegrationResponse>>> response = fireblocks.trLink().getTRLinkCustomerIntegrations(customerId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkCustomerIntegrations");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkCustomerIntegrations");
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
| **customerId** | **UUID**| Customer unique identifier | |

### Return type

CompletableFuture<ApiResponse<[**List&lt;TRLinkCustomerIntegrationResponse&gt;**](TRLinkCustomerIntegrationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer integrations retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkCustomers

> CompletableFuture<ApiResponse<List<TRLinkCustomerResponse>>> getTRLinkCustomers getTRLinkCustomers()

Get all customers

Retrieves all customers associated with the authenticated tenant. Returns a list of legal entities configured for Travel Rule compliance.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<List<TRLinkCustomerResponse>>> response = fireblocks.trLink().getTRLinkCustomers();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkCustomers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkCustomers");
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

CompletableFuture<ApiResponse<[**List&lt;TRLinkCustomerResponse&gt;**](TRLinkCustomerResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customers retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkIntegrationPublicKey

> CompletableFuture<ApiResponse<TRLinkPublicKeyResponse>> getTRLinkIntegrationPublicKey getTRLinkIntegrationPublicKey(customerIntegrationId)

Get public key for PII encryption

Retrieves the partner&#39;s public key in JWK format for encrypting PII data in Travel Rule Messages. Use this key to encrypt sensitive originator and beneficiary information before sending Travel Rule messages.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerIntegrationId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | Customer integration unique identifier
        try {
            CompletableFuture<ApiResponse<TRLinkPublicKeyResponse>> response = fireblocks.trLink().getTRLinkIntegrationPublicKey(customerIntegrationId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkIntegrationPublicKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkIntegrationPublicKey");
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
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |

### Return type

CompletableFuture<ApiResponse<[**TRLinkPublicKeyResponse**](TRLinkPublicKeyResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public key retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkPartners

> CompletableFuture<ApiResponse<List<TRLinkPartnerResponse>>> getTRLinkPartners getTRLinkPartners()

List available TRLink partners

Retrieves a list of all available Travel Rule Link integration partners. Partners provide Travel Rule compliance services such as VASP discovery, TRM exchange, and PII encryption.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<List<TRLinkPartnerResponse>>> response = fireblocks.trLink().getTRLinkPartners();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkPartners");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkPartners");
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

CompletableFuture<ApiResponse<[**List&lt;TRLinkPartnerResponse&gt;**](TRLinkPartnerResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of partners retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkPolicy

> CompletableFuture<ApiResponse<TRLinkPolicyResponse>> getTRLinkPolicy getTRLinkPolicy()

Get TRLink policy

Retrieves the complete TRLink policy for the authenticated tenant, including pre-screening rules, post-screening rules, and missing TRM rules. Pre-screening rules determine whether transactions should be screened. Post-screening rules determine actions based on screening results. Missing TRM rules handle cases when screening data is unavailable.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<TRLinkPolicyResponse>> response = fireblocks.trLink().getTRLinkPolicy();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkPolicy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkPolicy");
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

CompletableFuture<ApiResponse<[**TRLinkPolicyResponse**](TRLinkPolicyResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Policy retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkSupportedAsset

> CompletableFuture<ApiResponse<TRLinkGetSupportedAssetResponse>> getTRLinkSupportedAsset getTRLinkSupportedAsset(customerIntegrationId, assetId)

Get supported asset by ID

Retrieves detailed information about a specific asset by its Fireblocks asset ID. Returns the transformed Fireblocks asset data, raw partner response, and support status.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        String assetId = "assetId_example"; // String | Fireblocks asset ID
        try {
            CompletableFuture<ApiResponse<TRLinkGetSupportedAssetResponse>> response = fireblocks.trLink().getTRLinkSupportedAsset(customerIntegrationId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkSupportedAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkSupportedAsset");
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
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **assetId** | **String**| Fireblocks asset ID | |

### Return type

CompletableFuture<ApiResponse<[**TRLinkGetSupportedAssetResponse**](TRLinkGetSupportedAssetResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Asset retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkTrmById

> CompletableFuture<ApiResponse<TRLinkTrmInfoResponse>> getTRLinkTrmById getTRLinkTrmById(customerIntegrationId, trmId)

Get TRM by ID

Retrieves a Travel Rule Message by its unique identifier from the partner provider. Returns full TRM details including status, IVMS101 data, and transaction information.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        String trmId = "trmId_example"; // String | Travel Rule Message unique identifier
        try {
            CompletableFuture<ApiResponse<TRLinkTrmInfoResponse>> response = fireblocks.trLink().getTRLinkTrmById(customerIntegrationId, trmId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkTrmById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkTrmById");
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
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **trmId** | **String**| Travel Rule Message unique identifier | |

### Return type

CompletableFuture<ApiResponse<[**TRLinkTrmInfoResponse**](TRLinkTrmInfoResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | TRM retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTRLinkVaspById

> CompletableFuture<ApiResponse<TRLinkVaspDto>> getTRLinkVaspById getTRLinkVaspById(customerIntegrationId, vaspId)

Get VASP by ID

Retrieves detailed information about a specific VASP by its unique identifier. Returns VASP details including public key if available.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        String vaspId = "vaspId_example"; // String | VASP unique identifier (DID format)
        try {
            CompletableFuture<ApiResponse<TRLinkVaspDto>> response = fireblocks.trLink().getTRLinkVaspById(customerIntegrationId, vaspId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#getTRLinkVaspById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#getTRLinkVaspById");
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
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **vaspId** | **String**| VASP unique identifier (DID format) | |

### Return type

CompletableFuture<ApiResponse<[**TRLinkVaspDto**](TRLinkVaspDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VASP retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listTRLinkSupportedAssets

> CompletableFuture<ApiResponse<TRLinkAssetsListPagedResponse>> listTRLinkSupportedAssets listTRLinkSupportedAssets(customerIntegrationId, pageSize, pageCursor)

List supported assets

Retrieves a paginated list of assets supported by the partner integration. Includes a flag indicating whether the partner can handle assets not explicitly listed. Supports cursor-based pagination.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        Integer pageSize = 100; // Integer | Number of results per page (max 100)
        String pageCursor = "pageCursor_example"; // String | Cursor for pagination (from previous response)
        try {
            CompletableFuture<ApiResponse<TRLinkAssetsListPagedResponse>> response = fireblocks.trLink().listTRLinkSupportedAssets(customerIntegrationId, pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#listTRLinkSupportedAssets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#listTRLinkSupportedAssets");
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
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **pageSize** | **Integer**| Number of results per page (max 100) | [optional] [default to 100] |
| **pageCursor** | **String**| Cursor for pagination (from previous response) | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkAssetsListPagedResponse**](TRLinkAssetsListPagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Supported assets retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listTRLinkVasps

> CompletableFuture<ApiResponse<TRLinkAPIPagedResponse>> listTRLinkVasps listTRLinkVasps(customerIntegrationId, pageSize, pageCursor)

List VASPs

Retrieves a paginated list of VASPs (Virtual Asset Service Providers) available through the partner integration. Supports cursor-based pagination.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        Integer pageSize = 100; // Integer | Number of results per page (max 100)
        String pageCursor = "pageCursor_example"; // String | Cursor for pagination (from previous response)
        try {
            CompletableFuture<ApiResponse<TRLinkAPIPagedResponse>> response = fireblocks.trLink().listTRLinkVasps(customerIntegrationId, pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#listTRLinkVasps");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#listTRLinkVasps");
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
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **pageSize** | **Integer**| Number of results per page (max 100) | [optional] [default to 100] |
| **pageCursor** | **String**| Cursor for pagination (from previous response) | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkAPIPagedResponse**](TRLinkAPIPagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VASPs retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## redirectTRLinkTrm

> CompletableFuture<ApiResponse<TRLinkTrmInfoResponse>> redirectTRLinkTrm redirectTRLinkTrm(trLinkRedirectTrmRequest, customerIntegrationId, trmId, idempotencyKey)

Redirect Travel Rule Message

Redirects a Travel Rule Message to a subsidiary VASP. This operation requires the partner to support nested VASPs functionality.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkRedirectTrmRequest trLinkRedirectTrmRequest = new TRLinkRedirectTrmRequest(); // TRLinkRedirectTrmRequest | 
        UUID customerIntegrationId = UUID.randomUUID(); // UUID | Customer integration unique identifier
        String trmId = "trmId_example"; // String | Travel Rule Message unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkTrmInfoResponse>> response = fireblocks.trLink().redirectTRLinkTrm(trLinkRedirectTrmRequest, customerIntegrationId, trmId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#redirectTRLinkTrm");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#redirectTRLinkTrm");
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
| **trLinkRedirectTrmRequest** | [**TRLinkRedirectTrmRequest**](TRLinkRedirectTrmRequest.md)|  | |
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **trmId** | **String**| Travel Rule Message unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkTrmInfoResponse**](TRLinkTrmInfoResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Transaction redirect request accepted |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setTRLinkDestinationTravelRuleMessageId

> CompletableFuture<ApiResponse<TRLinkSetDestinationTravelRuleMessageIdResponse>> setTRLinkDestinationTravelRuleMessageId setTRLinkDestinationTravelRuleMessageId(trLinkSetDestinationTravelRuleMessageIdRequest, txId, idempotencyKey)

Set destination travel rule message ID

Associates a Travel Rule Message ID with a specific destination in a multi-destination Fireblocks transaction. Matches destinations by amount and peer path.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkSetDestinationTravelRuleMessageIdRequest trLinkSetDestinationTravelRuleMessageIdRequest = new TRLinkSetDestinationTravelRuleMessageIdRequest(); // TRLinkSetDestinationTravelRuleMessageIdRequest | 
        UUID txId = UUID.randomUUID(); // UUID | Fireblocks transaction unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkSetDestinationTravelRuleMessageIdResponse>> response = fireblocks.trLink().setTRLinkDestinationTravelRuleMessageId(trLinkSetDestinationTravelRuleMessageIdRequest, txId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#setTRLinkDestinationTravelRuleMessageId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#setTRLinkDestinationTravelRuleMessageId");
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
| **trLinkSetDestinationTravelRuleMessageIdRequest** | [**TRLinkSetDestinationTravelRuleMessageIdRequest**](TRLinkSetDestinationTravelRuleMessageIdRequest.md)|  | |
| **txId** | **UUID**| Fireblocks transaction unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkSetDestinationTravelRuleMessageIdResponse**](TRLinkSetDestinationTravelRuleMessageIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Destination travel rule message ID set successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setTRLinkTransactionTravelRuleMessageId

> CompletableFuture<ApiResponse<TRLinkSetTransactionTravelRuleMessageIdResponse>> setTRLinkTransactionTravelRuleMessageId setTRLinkTransactionTravelRuleMessageId(trLinkSetTransactionTravelRuleMessageIdRequest, txId, idempotencyKey)

Set transaction travel rule message ID

Associates a Travel Rule Message ID with a Fireblocks transaction. This links the TRM compliance data to the blockchain transaction.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkSetTransactionTravelRuleMessageIdRequest trLinkSetTransactionTravelRuleMessageIdRequest = new TRLinkSetTransactionTravelRuleMessageIdRequest(); // TRLinkSetTransactionTravelRuleMessageIdRequest | 
        UUID txId = UUID.randomUUID(); // UUID | Fireblocks transaction unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkSetTransactionTravelRuleMessageIdResponse>> response = fireblocks.trLink().setTRLinkTransactionTravelRuleMessageId(trLinkSetTransactionTravelRuleMessageIdRequest, txId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#setTRLinkTransactionTravelRuleMessageId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#setTRLinkTransactionTravelRuleMessageId");
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
| **trLinkSetTransactionTravelRuleMessageIdRequest** | [**TRLinkSetTransactionTravelRuleMessageIdRequest**](TRLinkSetTransactionTravelRuleMessageIdRequest.md)|  | |
| **txId** | **UUID**| Fireblocks transaction unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkSetTransactionTravelRuleMessageIdResponse**](TRLinkSetTransactionTravelRuleMessageIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Travel rule message ID set successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## testTRLinkIntegrationConnection

> CompletableFuture<ApiResponse<TRLinkTestConnectionResponse>> testTRLinkIntegrationConnection testTRLinkIntegrationConnection(customerIntegrationId, idempotencyKey)

Test connection

Tests the connection to a customer integration by validating stored credentials and attempting communication with the Travel Rule partner. Returns connection status and any error messages.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID customerIntegrationId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | Customer integration unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkTestConnectionResponse>> response = fireblocks.trLink().testTRLinkIntegrationConnection(customerIntegrationId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#testTRLinkIntegrationConnection");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#testTRLinkIntegrationConnection");
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
| **customerIntegrationId** | **UUID**| Customer integration unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkTestConnectionResponse**](TRLinkTestConnectionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Connection test completed (success or failure details in response body) |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateTRLinkCustomer

> CompletableFuture<ApiResponse<TRLinkCustomerResponse>> updateTRLinkCustomer updateTRLinkCustomer(trLinkUpdateCustomerRequest, customerId, idempotencyKey)

Update customer

Updates an existing customer&#39;s information. All fields are optional - only provided fields will be updated.

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
import com.fireblocks.sdk.api.TrLinkApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TRLinkUpdateCustomerRequest trLinkUpdateCustomerRequest = new TRLinkUpdateCustomerRequest(); // TRLinkUpdateCustomerRequest | 
        UUID customerId = UUID.fromString("550e8400-e29b-41d4-a716-446655440001"); // UUID | Customer unique identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TRLinkCustomerResponse>> response = fireblocks.trLink().updateTRLinkCustomer(trLinkUpdateCustomerRequest, customerId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TrLinkApi#updateTRLinkCustomer");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TrLinkApi#updateTRLinkCustomer");
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
| **trLinkUpdateCustomerRequest** | [**TRLinkUpdateCustomerRequest**](TRLinkUpdateCustomerRequest.md)|  | |
| **customerId** | **UUID**| Customer unique identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TRLinkCustomerResponse**](TRLinkCustomerResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer updated successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

