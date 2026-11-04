# CosignersApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCosigner**](CosignersApi.md#addCosigner) | **POST** /cosigners | Add cosigner |
| [**getCosigner**](CosignersApi.md#getCosigner) | **GET** /cosigners/{cosignerId} | Get cosigner |
| [**getCosignerApiUser**](CosignersApi.md#getCosignerApiUser) | **GET** /cosigners/{cosignerId}/api_users/{apiUserId} | Get API user |
| [**getCosignerApiUserRequestStatus**](CosignersApi.md#getCosignerApiUserRequestStatus) | **GET** /cosigners/{cosignerId}/api_users/{apiUserId}/{requestId} | Get API user request status |
| [**getCosignerApiUsers**](CosignersApi.md#getCosignerApiUsers) | **GET** /cosigners/{cosignerId}/api_users | Get all API users |
| [**getCosigners**](CosignersApi.md#getCosigners) | **GET** /cosigners | Get all cosigners |
| [**pairCosignerApiUser**](CosignersApi.md#pairCosignerApiUser) | **PUT** /cosigners/{cosignerId}/api_users/{apiUserId} | Pair API user |
| [**renameCosigner**](CosignersApi.md#renameCosigner) | **PATCH** /cosigners/{cosignerId} | Rename cosigner |
| [**unpairCosignerApiUser**](CosignersApi.md#unpairCosignerApiUser) | **DELETE** /cosigners/{cosignerId}/api_users/{apiUserId} | Unpair API user |
| [**updateCosignerApiUserCallbackHandler**](CosignersApi.md#updateCosignerApiUserCallbackHandler) | **PATCH** /cosigners/{cosignerId}/api_users/{apiUserId} | Update API user callback handler |



## addCosigner

> CompletableFuture<ApiResponse<AddCosignerResponse>> addCosigner addCosigner(addCosignerRequest, idempotencyKey)

Add cosigner

Add a new cosigner. The cosigner will be pending pairing until the API user is manually paired (see &#x60;pairCosignerApiUser&#x60;). Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
            CompletableFuture<ApiResponse<AddCosignerResponse>> response = fireblocks.cosigners().addCosigner(addCosignerRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#addCosigner");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
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


## getCosigner

> CompletableFuture<ApiResponse<Cosigner>> getCosigner getCosigner(cosignerId)

Get cosigner

Get a cosigner by ID. Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
            CompletableFuture<ApiResponse<Cosigner>> response = fireblocks.cosigners().getCosigner(cosignerId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#getCosigner");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
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


## getCosignerApiUser

> CompletableFuture<ApiResponse<CosignerApiUser>> getCosignerApiUser getCosignerApiUser(cosignerId, apiUserId)

Get API user

Get an API user by ID. Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
        String apiUserId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API user
        try {
            CompletableFuture<ApiResponse<CosignerApiUser>> response = fireblocks.cosigners().getCosignerApiUser(cosignerId, apiUserId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#getCosignerApiUser");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiUserId** | **String**| The unique identifier of the API user | |

### Return type

CompletableFuture<ApiResponse<[**CosignerApiUser**](CosignerApiUser.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A CosignerApiUser object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getCosignerApiUserRequestStatus

> CompletableFuture<ApiResponse<Status>> getCosignerApiUserRequestStatus getCosignerApiUserRequestStatus(cosignerId, apiUserId, requestId)

Get API user request status

Get the status of an asynchronous request Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
        String apiUserId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API user
        String requestId = "requestId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<Status>> response = fireblocks.cosigners().getCosignerApiUserRequestStatus(cosignerId, apiUserId, requestId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#getCosignerApiUserRequestStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiUserId** | **String**| The unique identifier of the API user | |
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


## getCosignerApiUsers

> CompletableFuture<ApiResponse<ApiUsersPaginatedResponse>> getCosignerApiUsers getCosignerApiUsers(cosignerId, order, pageCursor, pageSize)

Get all API users

Get all cosigner paired API users (paginated). Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
            CompletableFuture<ApiResponse<ApiUsersPaginatedResponse>> response = fireblocks.cosigners().getCosignerApiUsers(cosignerId, order, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#getCosignerApiUsers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
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

CompletableFuture<ApiResponse<[**ApiUsersPaginatedResponse**](ApiUsersPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated response containing CosignerApiUser objects |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getCosigners

> CompletableFuture<ApiResponse<CosignersPaginatedResponse>> getCosigners getCosigners(order, pageCursor, pageSize)

Get all cosigners

Get all workspace cosigners (paginated). Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
            CompletableFuture<ApiResponse<CosignersPaginatedResponse>> response = fireblocks.cosigners().getCosigners(order, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#getCosigners");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
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


## pairCosignerApiUser

> CompletableFuture<ApiResponse<PairApiUserResponse>> pairCosignerApiUser pairCosignerApiUser(pairApiUserRequest, cosignerId, apiUserId, idempotencyKey)

Pair API user

Pair an API user to a cosigner Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        PairApiUserRequest pairApiUserRequest = new PairApiUserRequest(); // PairApiUserRequest | 
        UUID cosignerId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the cosigner
        String apiUserId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API user
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<PairApiUserResponse>> response = fireblocks.cosigners().pairCosignerApiUser(pairApiUserRequest, cosignerId, apiUserId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#pairCosignerApiUser");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pairApiUserRequest** | [**PairApiUserRequest**](PairApiUserRequest.md)|  | |
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiUserId** | **String**| The unique identifier of the API user | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PairApiUserResponse**](PairApiUserResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The API user object to be paired |  * X-Request-ID -  <br>  * Location -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## renameCosigner

> CompletableFuture<ApiResponse<Cosigner>> renameCosigner renameCosigner(renameCosigner, cosignerId)

Rename cosigner

Rename a cosigner by ID. Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
            CompletableFuture<ApiResponse<Cosigner>> response = fireblocks.cosigners().renameCosigner(renameCosigner, cosignerId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#renameCosigner");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
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


## unpairCosignerApiUser

> CompletableFuture<ApiResponse<CosignerApiUser>> unpairCosignerApiUser unpairCosignerApiUser(cosignerId, apiUserId)

Unpair API user

Unpair an API user from a cosigner Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
        String apiUserId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API user
        try {
            CompletableFuture<ApiResponse<CosignerApiUser>> response = fireblocks.cosigners().unpairCosignerApiUser(cosignerId, apiUserId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#unpairCosignerApiUser");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cosignerId** | **UUID**| The unique identifier of the cosigner | |
| **apiUserId** | **String**| The unique identifier of the API user | |

### Return type

CompletableFuture<ApiResponse<[**CosignerApiUser**](CosignerApiUser.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The API user object to be unpaired |  * X-Request-ID -  <br>  * Location -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateCosignerApiUserCallbackHandler

> CompletableFuture<ApiResponse<UpdateCallbackHandlerResponse>> updateCosignerApiUserCallbackHandler updateCosignerApiUserCallbackHandler(updateCallbackHandlerRequest, cosignerId, apiUserId)

Update API user callback handler

Update the callback handler of an API user Endpoint Permission: Admin and Non-Signing Admin.

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
import com.fireblocks.sdk.api.CosignersApi;
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
        String apiUserId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | The unique identifier of the API user
        try {
            CompletableFuture<ApiResponse<UpdateCallbackHandlerResponse>> response = fireblocks.cosigners().updateCosignerApiUserCallbackHandler(updateCallbackHandlerRequest, cosignerId, apiUserId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CosignersApi#updateCosignerApiUserCallbackHandler");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
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
| **apiUserId** | **String**| The unique identifier of the API user | |

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
| **202** | The API user object with the new callback handler |  * X-Request-ID -  <br>  * Location -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

