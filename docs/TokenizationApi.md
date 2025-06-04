# TokenizationApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**burnCollectionToken**](TokenizationApi.md#burnCollectionToken) | **POST** /tokenization/collections/{id}/tokens/burn | Burn tokens |
| [**createNewCollection**](TokenizationApi.md#createNewCollection) | **POST** /tokenization/collections | Create a new collection |
| [**fetchCollectionTokenDetails**](TokenizationApi.md#fetchCollectionTokenDetails) | **GET** /tokenization/collections/{id}/tokens/{tokenId} | Get collection token details |
| [**getCollectionById**](TokenizationApi.md#getCollectionById) | **GET** /tokenization/collections/{id} | Get a collection by id |
| [**getDeployableAddress**](TokenizationApi.md#getDeployableAddress) | **POST** /tokenization/multichain/deterministic_address | Get deterministic address for contract deployment |
| [**getLinkedCollections**](TokenizationApi.md#getLinkedCollections) | **GET** /tokenization/collections | Get collections |
| [**getLinkedToken**](TokenizationApi.md#getLinkedToken) | **GET** /tokenization/tokens/{id} | Return a linked token |
| [**getLinkedTokens**](TokenizationApi.md#getLinkedTokens) | **GET** /tokenization/tokens | List all linked tokens |
| [**issueNewToken**](TokenizationApi.md#issueNewToken) | **POST** /tokenization/tokens | Issue a new token |
| [**issueTokenMultiChain**](TokenizationApi.md#issueTokenMultiChain) | **POST** /tokenization/multichain/tokens | Issue a token on one or more blockchains |
| [**link**](TokenizationApi.md#link) | **POST** /tokenization/tokens/link | Link a contract |
| [**mintCollectionToken**](TokenizationApi.md#mintCollectionToken) | **POST** /tokenization/collections/{id}/tokens/mint | Mint tokens |
| [**reIssueTokenMultiChain**](TokenizationApi.md#reIssueTokenMultiChain) | **POST** /tokenization/multichain/reissue/token/{tokenLinkId} | Reissue a multichain token |
| [**unlink**](TokenizationApi.md#unlink) | **DELETE** /tokenization/tokens/{id} | Unlink a token |
| [**unlinkCollection**](TokenizationApi.md#unlinkCollection) | **DELETE** /tokenization/collections/{id} | Delete a collection link |



## burnCollectionToken

> CompletableFuture<ApiResponse<CollectionBurnResponseDto>> burnCollectionToken burnCollectionToken(collectionBurnRequestDto, id, idempotencyKey)

Burn tokens

Burn tokens in a collection

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

        CollectionBurnRequestDto collectionBurnRequestDto = new CollectionBurnRequestDto(); // CollectionBurnRequestDto | 
        String id = "fbfbfbfb-fbfb-fbfb-fbfb-fbfbfbfbfbfb"; // String | The collection link id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CollectionBurnResponseDto>> response = fireblocks.tokenization().burnCollectionToken(collectionBurnRequestDto, id, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#burnCollectionToken");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#burnCollectionToken");
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
| **collectionBurnRequestDto** | [**CollectionBurnRequestDto**](CollectionBurnRequestDto.md)|  | |
| **id** | **String**| The collection link id | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CollectionBurnResponseDto**](CollectionBurnResponseDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Tokens burned successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createNewCollection

> CompletableFuture<ApiResponse<CollectionLinkDto>> createNewCollection createNewCollection(collectionDeployRequestDto, idempotencyKey)

Create a new collection

Create a new collection and link it as a token

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

        CollectionDeployRequestDto collectionDeployRequestDto = new CollectionDeployRequestDto(); // CollectionDeployRequestDto | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CollectionLinkDto>> response = fireblocks.tokenization().createNewCollection(collectionDeployRequestDto, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#createNewCollection");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#createNewCollection");
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
| **collectionDeployRequestDto** | [**CollectionDeployRequestDto**](CollectionDeployRequestDto.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CollectionLinkDto**](CollectionLinkDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Collection was created successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## fetchCollectionTokenDetails

> CompletableFuture<ApiResponse<CollectionLinkDto>> fetchCollectionTokenDetails fetchCollectionTokenDetails(id, tokenId)

Get collection token details

Get collection token details by id

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

        String id = "fbfbfbfb-fbfb-fbfb-fbfb-fbfbfbfbfbfb"; // String | The collection link id
        String tokenId = "1"; // String | The tokenId as it appears on the blockchain
        try {
            CompletableFuture<ApiResponse<CollectionLinkDto>> response = fireblocks.tokenization().fetchCollectionTokenDetails(id, tokenId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#fetchCollectionTokenDetails");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#fetchCollectionTokenDetails");
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
| **id** | **String**| The collection link id | |
| **tokenId** | **String**| The tokenId as it appears on the blockchain | |

### Return type

CompletableFuture<ApiResponse<[**CollectionLinkDto**](CollectionLinkDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection token details were fetched successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getCollectionById

> CompletableFuture<ApiResponse<CollectionLinkDto>> getCollectionById getCollectionById(id)

Get a collection by id

Get a collection by id

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
            CompletableFuture<ApiResponse<CollectionLinkDto>> response = fireblocks.tokenization().getCollectionById(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getCollectionById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getCollectionById");
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

CompletableFuture<ApiResponse<[**CollectionLinkDto**](CollectionLinkDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection fetched successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getDeployableAddress

> CompletableFuture<ApiResponse<DeployableAddressResponse>> getDeployableAddress getDeployableAddress(getDeployableAddressRequest, idempotencyKey)

Get deterministic address for contract deployment

Get a deterministic address for contract deployment. The address is derived from the contract&#39;s bytecode and  provided salt. This endpoint is used to get the address of a contract that will be deployed in the future.

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

        GetDeployableAddressRequest getDeployableAddressRequest = new GetDeployableAddressRequest(); // GetDeployableAddressRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<DeployableAddressResponse>> response = fireblocks.tokenization().getDeployableAddress(getDeployableAddressRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getDeployableAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getDeployableAddress");
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
| **getDeployableAddressRequest** | [**GetDeployableAddressRequest**](GetDeployableAddressRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**DeployableAddressResponse**](DeployableAddressResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deterministic address for contract deployment |  -  |
| **400** | Invalid parameters or template has no bytecode |  -  |
| **409** | Address is already taken |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getLinkedCollections

> CompletableFuture<ApiResponse<GetLinkedCollectionsPaginatedResponse>> getLinkedCollections getLinkedCollections(pageCursor, pageSize, status)

Get collections

Get collections (paginated)

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

        String pageCursor = "pageCursor_example"; // String | Page cursor to get the next page, for example - \"MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA==\"
        BigDecimal pageSize = new BigDecimal("100"); // BigDecimal | Number of items per page (max 100), requesting more then 100 will return 100 items
        Object status = COMPLETED; // Object | A comma separated list of statuses to filter. Default is \"COMPLETED\"
        try {
            CompletableFuture<ApiResponse<GetLinkedCollectionsPaginatedResponse>> response = fireblocks.tokenization().getLinkedCollections(pageCursor, pageSize, status);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getLinkedCollections");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getLinkedCollections");
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
| **pageCursor** | **String**| Page cursor to get the next page, for example - \&quot;MjAyMy0xMi0xMyAyMDozNjowOC4zMDI&#x3D;:MTEwMA&#x3D;&#x3D;\&quot; | [optional] |
| **pageSize** | **BigDecimal**| Number of items per page (max 100), requesting more then 100 will return 100 items | [optional] [default to 100] |
| **status** | [**Object**](.md)| A comma separated list of statuses to filter. Default is \&quot;COMPLETED\&quot; | [optional] |

### Return type

CompletableFuture<ApiResponse<[**GetLinkedCollectionsPaginatedResponse**](GetLinkedCollectionsPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection fetched successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


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


## issueTokenMultiChain

> CompletableFuture<ApiResponse<List<TokenLinkDto>>> issueTokenMultiChain issueTokenMultiChain(createMultichainTokenRequest, idempotencyKey)

Issue a token on one or more blockchains

Facilitates the creation of a new token on one or more blockchains.

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

        CreateMultichainTokenRequest createMultichainTokenRequest = new CreateMultichainTokenRequest(); // CreateMultichainTokenRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<List<TokenLinkDto>>> response = fireblocks.tokenization().issueTokenMultiChain(createMultichainTokenRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#issueTokenMultiChain");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#issueTokenMultiChain");
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
| **createMultichainTokenRequest** | [**CreateMultichainTokenRequest**](CreateMultichainTokenRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;TokenLinkDto&gt;**](TokenLinkDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tokens were created successfully |  -  |
| **400** | Invalid input. |  -  |
| **409** | Address is already taken. |  -  |


## link

> CompletableFuture<ApiResponse<TokenLinkDto>> link link(tokenLinkRequestDto, idempotencyKey)

Link a contract

Link an a contract

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
| **404** | Could not find the underlying contract to link to |  -  |
| **409** | Token link for {refId} already exists |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## mintCollectionToken

> CompletableFuture<ApiResponse<CollectionMintResponseDto>> mintCollectionToken mintCollectionToken(collectionMintRequestDto, id, idempotencyKey)

Mint tokens

Mint tokens and upload metadata

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

        CollectionMintRequestDto collectionMintRequestDto = new CollectionMintRequestDto(); // CollectionMintRequestDto | 
        String id = "fbfbfbfb-fbfb-fbfb-fbfb-fbfbfbfbfbfb"; // String | The collection link id
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CollectionMintResponseDto>> response = fireblocks.tokenization().mintCollectionToken(collectionMintRequestDto, id, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#mintCollectionToken");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#mintCollectionToken");
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
| **collectionMintRequestDto** | [**CollectionMintRequestDto**](CollectionMintRequestDto.md)|  | |
| **id** | **String**| The collection link id | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CollectionMintResponseDto**](CollectionMintResponseDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Tokens minted successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## reIssueTokenMultiChain

> CompletableFuture<ApiResponse<List<TokenLinkDto>>> reIssueTokenMultiChain reIssueTokenMultiChain(reissueMultichainTokenRequest, tokenLinkId, idempotencyKey)

Reissue a multichain token

Reissue a multichain token. This endpoint allows you to reissue a token on one or more blockchains. The token must be initially issued using the issueTokenMultiChain endpoint.

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

        ReissueMultichainTokenRequest reissueMultichainTokenRequest = new ReissueMultichainTokenRequest(); // ReissueMultichainTokenRequest | 
        String tokenLinkId = "tokenLinkId_example"; // String | The ID of the token link
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<List<TokenLinkDto>>> response = fireblocks.tokenization().reIssueTokenMultiChain(reissueMultichainTokenRequest, tokenLinkId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#reIssueTokenMultiChain");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#reIssueTokenMultiChain");
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
| **reissueMultichainTokenRequest** | [**ReissueMultichainTokenRequest**](ReissueMultichainTokenRequest.md)|  | |
| **tokenLinkId** | **String**| The ID of the token link | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;TokenLinkDto&gt;**](TokenLinkDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully reissued multichain token |  -  |
| **400** | Invalid input |  -  |
| **404** | Deployed contract not found |  -  |
| **409** | Address is already taken |  -  |
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


## unlinkCollection

> CompletableFuture<ApiResponse<Void>> unlinkCollection unlinkCollection(id)

Delete a collection link

Delete a collection link

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
            CompletableFuture<ApiResponse<Void>> response = fireblocks.tokenization().unlinkCollection(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#unlinkCollection");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#unlinkCollection");
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
| **204** | Collection unlinked successfully |  -  |
| **404** | Link for collection does not exist |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

