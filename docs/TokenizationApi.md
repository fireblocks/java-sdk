# TokenizationApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLinkedToken**](TokenizationApi.md#getLinkedToken) | **GET** /tokenization/tokens/{id} | Return a linked token |
| [**getLinkedTokens**](TokenizationApi.md#getLinkedTokens) | **GET** /tokenization/tokens | List all linked tokens |
| [**issueNewToken**](TokenizationApi.md#issueNewToken) | **POST** /tokenization/tokens | Issue a new token |
| [**link**](TokenizationApi.md#link) | **POST** /tokenization/tokens/link | Link a token |
| [**unlink**](TokenizationApi.md#unlink) | **DELETE** /tokenization/tokens/{id} | Unlink a token |



## getLinkedToken

> CompletableFuture<ApiResponse<TokenLinkDto>> getLinkedToken getLinkedToken(id)

Return a linked token

Return a linked token, with its status and metadata.

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
import com.fireblocks.sdk.api.TokenizationApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "fbfbfbfb-fbfb-fbfb-fbfb-fbfbfbfbfbfb"; // String | The token link id
        try {
            CompletableFuture<ApiResponse<TokenLinkDto>> response = fireblocks.tokenization().getLinkedToken(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getLinkedToken");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getLinkedToken");
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
| **id** | **String**| The token link id | |

### Return type

CompletableFuture<ApiResponse<[**TokenLinkDto**](TokenLinkDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token fetched successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getLinkedTokens

> CompletableFuture<ApiResponse<TokensPaginatedResponse>> getLinkedTokens getLinkedTokens(pageCursor, pageSize, status)

List all linked tokens

Return all linked tokens (paginated)

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
import com.fireblocks.sdk.api.TokenizationApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Number of items per page, requesting more then max will return max items
        Object status = COMPLETED; // Object | A comma separated list of statuses to filter. Default is \"COMPLETED\"
        try {
            CompletableFuture<ApiResponse<TokensPaginatedResponse>> response = fireblocks.tokenization().getLinkedTokens(pageCursor, pageSize, status);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getLinkedTokens");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getLinkedTokens");
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
| **pageCursor** | **String**| Page cursor to get the next page | [optional] |
| **pageSize** | **BigDecimal**| Number of items per page, requesting more then max will return max items | [optional] |
| **status** | [**Object**](.md)| A comma separated list of statuses to filter. Default is \&quot;COMPLETED\&quot; | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TokensPaginatedResponse**](TokensPaginatedResponse.md)>>


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


## issueNewToken

> CompletableFuture<ApiResponse<TokenLinkDto>> issueNewToken issueNewToken(createTokenRequestDto, idempotencyKey)

Issue a new token

Facilitates the creation of a new token, supporting both EVM-based and Stellar/Ripple platforms. For EVM, it deploys the corresponding contract template to the blockchain and links the token to the workspace. For Stellar/Ripple, it links a newly created token directly to the workspace without deploying a contract. Returns the token link with status \&quot;PENDING\&quot; until the token is deployed or \&quot;SUCCESS\&quot; if no deployment is needed.

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
import com.fireblocks.sdk.api.TokenizationApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateTokenRequestDto createTokenRequestDto = new CreateTokenRequestDto(); // CreateTokenRequestDto | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TokenLinkDto>> response = fireblocks.tokenization().issueNewToken(createTokenRequestDto, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#issueNewToken");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#issueNewToken");
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
| **createTokenRequestDto** | [**CreateTokenRequestDto**](CreateTokenRequestDto.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TokenLinkDto**](TokenLinkDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Token was created successfully |  -  |
| **409** | Asset already exists |  -  |


## link

> CompletableFuture<ApiResponse<TokenLinkDto>> link link(tokenLinkRequestDto, idempotencyKey)

Link a token

Link an already existing token (by assetId, collectionId or contractId as refId) to a workspace across EVM, Stellar, or Ripple platforms. The token will be linked to the workspace if it does not already exist.

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
import com.fireblocks.sdk.api.TokenizationApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TokenLinkRequestDto tokenLinkRequestDto = new TokenLinkRequestDto(); // TokenLinkRequestDto | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TokenLinkDto>> response = fireblocks.tokenization().link(tokenLinkRequestDto, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#link");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#link");
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
| **tokenLinkRequestDto** | [**TokenLinkRequestDto**](TokenLinkRequestDto.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TokenLinkDto**](TokenLinkDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token linked successfully |  -  |
| **201** |  |  -  |
| **404** | Could not find the underlying token identifier (refId) to link the token to |  -  |
| **409** | Token link for {refId} already exists |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## unlink

> CompletableFuture<ApiResponse<Void>> unlink unlink(id)

Unlink a token

Unlink a token. The token will be unlinked from the workspace. The token will not be deleted on chain nor the refId, only the link to the workspace will be removed.

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
import com.fireblocks.sdk.api.TokenizationApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "fbfbfbfb-fbfb-fbfb-fbfb-fbfbfbfbfbfb"; // String | The token link id
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.tokenization().unlink(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#unlink");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#unlink");
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
| **id** | **String**| The token link id | |

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
| **200** | Token unlinked successfully |  -  |
| **204** |  |  -  |
| **404** | Link did not exist |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

