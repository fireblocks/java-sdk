# CosignersBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCosigner**](CosignersBetaApi.md#addCosigner) | **POST** /cosigners | Add cosigner |
| [**getApiKey**](CosignersBetaApi.md#getApiKey) | **GET** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Get API key |
| [**getApiKeys**](CosignersBetaApi.md#getApiKeys) | **GET** /cosigners/{cosignerId}/api_keys | Get all API keys |
| [**getCosigner**](CosignersBetaApi.md#getCosigner) | **GET** /cosigners/{cosignerId} | Get cosigner |
| [**getCosigners**](CosignersBetaApi.md#getCosigners) | **GET** /cosigners | Get all cosigners |
| [**getRequestStatus**](CosignersBetaApi.md#getRequestStatus) | **GET** /cosigners/{cosignerId}/api_keys/{apiKeyId}/{requestId} | Get request status |
| [**pairApiKey**](CosignersBetaApi.md#pairApiKey) | **PUT** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Pair API key |
| [**renameCosigner**](CosignersBetaApi.md#renameCosigner) | **PATCH** /cosigners/{cosignerId} | Rename cosigner |
| [**unpairApiKey**](CosignersBetaApi.md#unpairApiKey) | **DELETE** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Unpair API key |
| [**updateCallbackHandler**](CosignersBetaApi.md#updateCallbackHandler) | **PATCH** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Update API key callback handler |



## addCosigner

> CompletableFuture<ApiResponse<AddCosignerResponse>> addCosigner addCosigner(addCosignerRequest, idempotencyKey)

Add cosigner

Add a new cosigner. The cosigner will be pending pairing until the API key is manually paired &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        AddCosignerRequest addCosignerRequest = new AddCosignerRequest(); // AddCosignerRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AddCosignerResponse>> response = fireblocks.cosignersBeta().addCosigner(addCosignerRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#addCosigner");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#addCosigner");
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
| **addCosignerRequest** | [**AddCosignerRequest**](AddCosignerRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AddCosignerResponse**](AddCosignerResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Pending cosigner added |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getApiKey

> CompletableFuture<ApiResponse<ApiKey>> getApiKey getApiKey(cosignerId, apiKeyId)

Get API key

Get an API key by ID. **Note:** These endpoints are currently in beta and might be subject to changes. &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        String apiKeyId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API key
        try {
            CompletableFuture<ApiResponse<ApiKey>> response = fireblocks.cosignersBeta().getApiKey(cosignerId, apiKeyId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#getApiKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#getApiKey");
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
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiKeyId** | **String**| The unique identifier of the API key | |

### Return type

CompletableFuture<ApiResponse<[**ApiKey**](ApiKey.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An ApiKey object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getApiKeys

> CompletableFuture<ApiResponse<ApiKeysPaginatedResponse>> getApiKeys getApiKeys(cosignerId, order, pageCursor, pageSize)

Get all API keys

Get all cosigner paired API keys (paginated). **Note:** These endpoints are currently in beta and might be subject to changes. &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        String pageCursor = "pageCursor_example"; // String | Cursor of the required page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Maximum number of items in the page
        try {
            CompletableFuture<ApiResponse<ApiKeysPaginatedResponse>> response = fireblocks.cosignersBeta().getApiKeys(cosignerId, order, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#getApiKeys");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#getApiKeys");
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
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |
| **pageCursor** | **String**| Cursor of the required page | [optional] |
| **pageSize** | **BigDecimal**| Maximum number of items in the page | [optional] [default to 10] |

### Return type

CompletableFuture<ApiResponse<[**ApiKeysPaginatedResponse**](ApiKeysPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated response containing ApiKey objects |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getCosigner

> CompletableFuture<ApiResponse<Cosigner>> getCosigner getCosigner(cosignerId)

Get cosigner

Get a cosigner by ID. **Note:** These endpoints are currently in beta and might be subject to changes. &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        try {
            CompletableFuture<ApiResponse<Cosigner>> response = fireblocks.cosignersBeta().getCosigner(cosignerId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#getCosigner");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#getCosigner");
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
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |

### Return type

CompletableFuture<ApiResponse<[**Cosigner**](Cosigner.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A cosigner object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getCosigners

> CompletableFuture<ApiResponse<CosignersPaginatedResponse>> getCosigners getCosigners(order, pageCursor, pageSize)

Get all cosigners

Get all workspace cosigners (paginated). **Note:** These endpoints are currently in beta and might be subject to changes. &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        String pageCursor = "pageCursor_example"; // String | Cursor of the required page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Maximum number of items in the page
        try {
            CompletableFuture<ApiResponse<CosignersPaginatedResponse>> response = fireblocks.cosignersBeta().getCosigners(order, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#getCosigners");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#getCosigners");
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
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |
| **pageCursor** | **String**| Cursor of the required page | [optional] |
| **pageSize** | **BigDecimal**| Maximum number of items in the page | [optional] [default to 10] |

### Return type

CompletableFuture<ApiResponse<[**CosignersPaginatedResponse**](CosignersPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated response containing Cosigner objects |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getRequestStatus

> CompletableFuture<ApiResponse<Status>> getRequestStatus getRequestStatus(cosignerId, apiKeyId, requestId)

Get request status

Get the status of an asynchronous request &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        String apiKeyId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API key
        String requestId = "requestId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<Status>> response = fireblocks.cosignersBeta().getRequestStatus(cosignerId, apiKeyId, requestId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#getRequestStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#getRequestStatus");
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
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiKeyId** | **String**| The unique identifier of the API key | |
| **requestId** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**Status**](Status.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The status of the request |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## pairApiKey

> CompletableFuture<ApiResponse<PairApiKeyResponse>> pairApiKey pairApiKey(pairApiKeyRequest, cosignerId, apiKeyId, idempotencyKey)

Pair API key

Pair an API key to a cosigner &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        PairApiKeyRequest pairApiKeyRequest = new PairApiKeyRequest(); // PairApiKeyRequest | 
        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        String apiKeyId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API key
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<PairApiKeyResponse>> response = fireblocks.cosignersBeta().pairApiKey(pairApiKeyRequest, cosignerId, apiKeyId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#pairApiKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#pairApiKey");
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
| **pairApiKeyRequest** | [**PairApiKeyRequest**](PairApiKeyRequest.md)|  | |
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiKeyId** | **String**| The unique identifier of the API key | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PairApiKeyResponse**](PairApiKeyResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The API key object to be paired |  * X-Request-ID -  <br>  * Location -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## renameCosigner

> CompletableFuture<ApiResponse<Cosigner>> renameCosigner renameCosigner(renameCosigner, cosignerId)

Rename cosigner

Rename a cosigner by ID. **Note:** These endpoints are currently in beta and might be subject to changes. &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        RenameCosigner renameCosigner = new RenameCosigner(); // RenameCosigner | 
        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        try {
            CompletableFuture<ApiResponse<Cosigner>> response = fireblocks.cosignersBeta().renameCosigner(renameCosigner, cosignerId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#renameCosigner");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#renameCosigner");
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
| **renameCosigner** | [**RenameCosigner**](RenameCosigner.md)|  | |
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |

### Return type

CompletableFuture<ApiResponse<[**Cosigner**](Cosigner.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A cosigner object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## unpairApiKey

> CompletableFuture<ApiResponse<ApiKey>> unpairApiKey unpairApiKey(cosignerId, apiKeyId)

Unpair API key

Unpair an API key from a cosigner &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        String apiKeyId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API key
        try {
            CompletableFuture<ApiResponse<ApiKey>> response = fireblocks.cosignersBeta().unpairApiKey(cosignerId, apiKeyId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#unpairApiKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#unpairApiKey");
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
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiKeyId** | **String**| The unique identifier of the API key | |

### Return type

CompletableFuture<ApiResponse<[**ApiKey**](ApiKey.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The API key object to be unpaired |  * X-Request-ID -  <br>  * Location -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateCallbackHandler

> CompletableFuture<ApiResponse<UpdateCallbackHandlerResponse>> updateCallbackHandler updateCallbackHandler(updateCallbackHandlerRequest, cosignerId, apiKeyId)

Update API key callback handler

Update the callback handler of an API key &lt;/br&gt;Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpdateCallbackHandlerRequest updateCallbackHandlerRequest = new UpdateCallbackHandlerRequest(); // UpdateCallbackHandlerRequest | 
        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        String apiKeyId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API key
        try {
            CompletableFuture<ApiResponse<UpdateCallbackHandlerResponse>> response = fireblocks.cosignersBeta().updateCallbackHandler(updateCallbackHandlerRequest, cosignerId, apiKeyId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersBetaApi#updateCallbackHandler");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CosignersBetaApi#updateCallbackHandler");
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
| **updateCallbackHandlerRequest** | [**UpdateCallbackHandlerRequest**](UpdateCallbackHandlerRequest.md)|  | |
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiKeyId** | **String**| The unique identifier of the API key | |

### Return type

CompletableFuture<ApiResponse<[**UpdateCallbackHandlerResponse**](UpdateCallbackHandlerResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The API key object with the new callback handler |  * X-Request-ID -  <br>  * Location -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

