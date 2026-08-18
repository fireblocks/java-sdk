# BlockchainLinkBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateBlockchainLinkChain**](BlockchainLinkBetaApi.md#activateBlockchainLinkChain) | **POST** /blockchain_link/blockchains/{blockchainId}/activate | Activate a blockchain (triggers activation workflow) |
| [**createBlockchainLinkChain**](BlockchainLinkBetaApi.md#createBlockchainLinkChain) | **POST** /blockchain_link/blockchains | Create a new blockchain |
| [**deleteBlockchainLinkChain**](BlockchainLinkBetaApi.md#deleteBlockchainLinkChain) | **DELETE** /blockchain_link/blockchains/{blockchainId} | Delete a blockchain |
| [**getBlockchainLinkBillingInfo**](BlockchainLinkBetaApi.md#getBlockchainLinkBillingInfo) | **GET** /blockchain_link/blockchains/billing_info | Get tenant billing info |
| [**getBlockchainLinkChain**](BlockchainLinkBetaApi.md#getBlockchainLinkChain) | **GET** /blockchain_link/blockchains/{blockchainId} | Get a blockchain by ID |
| [**getBlockchainLinkTestWalletAddress**](BlockchainLinkBetaApi.md#getBlockchainLinkTestWalletAddress) | **GET** /blockchain_link/blockchains/test_wallet_address | Get the test wallet address |
| [**listBlockchainLinkChains**](BlockchainLinkBetaApi.md#listBlockchainLinkChains) | **GET** /blockchain_link/blockchains | List blockchains with pagination and filtering |
| [**triggerBlockchainLinkValidation**](BlockchainLinkBetaApi.md#triggerBlockchainLinkValidation) | **POST** /blockchain_link/blockchains/{blockchainId}/validate | Trigger validation workflow |
| [**updateBlockchainLinkChain**](BlockchainLinkBetaApi.md#updateBlockchainLinkChain) | **PUT** /blockchain_link/blockchains/{blockchainId} | Update a blockchain |



## activateBlockchainLinkChain

> CompletableFuture<ApiResponse<ActivateBlockchainResponse>> activateBlockchainLinkChain activateBlockchainLinkChain(blockchainId, idempotencyKey)

Activate a blockchain (triggers activation workflow)

Starts the asynchronous activation workflow for the blockchain identified by its ID, transitioning it towards the ACTIVATED state.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String blockchainId = "blockchainId_example"; // String | Required blockchain ID to activate
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ActivateBlockchainResponse>> response = fireblocks.blockchainLinkBeta().activateBlockchainLinkChain(blockchainId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#activateBlockchainLinkChain");
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
| **blockchainId** | **String**| Required blockchain ID to activate | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ActivateBlockchainResponse**](ActivateBlockchainResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createBlockchainLinkChain

> CompletableFuture<ApiResponse<CreateBlockchainResponse>> createBlockchainLinkChain createBlockchainLinkChain(createBlockchainRequest, idempotencyKey)

Create a new blockchain

Registers a new tenant-managed blockchain from the supplied declared properties. The blockchain starts in the CREATED state and must be activated separately before it can be used.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateBlockchainRequest createBlockchainRequest = new CreateBlockchainRequest(); // CreateBlockchainRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateBlockchainResponse>> response = fireblocks.blockchainLinkBeta().createBlockchainLinkChain(createBlockchainRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#createBlockchainLinkChain");
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
| **createBlockchainRequest** | [**CreateBlockchainRequest**](CreateBlockchainRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateBlockchainResponse**](CreateBlockchainResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteBlockchainLinkChain

> CompletableFuture<ApiResponse<Void>> deleteBlockchainLinkChain deleteBlockchainLinkChain(blockchainId)

Delete a blockchain

Permanently removes a blockchain identified by its ID. The blockchain must not be in an active lifecycle state.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String blockchainId = "blockchainId_example"; // String | tenant_id is extracted from JWT token context
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.blockchainLinkBeta().deleteBlockchainLinkChain(blockchainId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#deleteBlockchainLinkChain");
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
| **blockchainId** | **String**| tenant_id is extracted from JWT token context | |

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
| **204** | No Content |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getBlockchainLinkBillingInfo

> CompletableFuture<ApiResponse<GetBillingInfoResponse>> getBlockchainLinkBillingInfo getBlockchainLinkBillingInfo()

Get tenant billing info

Returns the tenant&#39;s blockchain activation limit and current usage. tenant_id is derived from the JWT token context.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
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
            CompletableFuture<ApiResponse<GetBillingInfoResponse>> response = fireblocks.blockchainLinkBeta().getBlockchainLinkBillingInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#getBlockchainLinkBillingInfo");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**GetBillingInfoResponse**](GetBillingInfoResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getBlockchainLinkChain

> CompletableFuture<ApiResponse<GetBlockchainByIdResponse>> getBlockchainLinkChain getBlockchainLinkChain(blockchainId)

Get a blockchain by ID

Returns a single blockchain owned by the tenant, identified by its ID.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String blockchainId = "f47ac10b-58cc-4372-a567-0e02b2c3d479"; // String | ID of the blockchain to retrieve (supplied as a path parameter).
        try {
            CompletableFuture<ApiResponse<GetBlockchainByIdResponse>> response = fireblocks.blockchainLinkBeta().getBlockchainLinkChain(blockchainId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#getBlockchainLinkChain");
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
| **blockchainId** | **String**| ID of the blockchain to retrieve (supplied as a path parameter). | |

### Return type

CompletableFuture<ApiResponse<[**GetBlockchainByIdResponse**](GetBlockchainByIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getBlockchainLinkTestWalletAddress

> CompletableFuture<ApiResponse<GetTestWalletAddressResponse>> getBlockchainLinkTestWalletAddress getBlockchainLinkTestWalletAddress()

Get the test wallet address

Returns the Ethereum address derived from the configured external wallet private key, used by the UI for test transfers. tenant_id is derived from the JWT token context.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
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
            CompletableFuture<ApiResponse<GetTestWalletAddressResponse>> response = fireblocks.blockchainLinkBeta().getBlockchainLinkTestWalletAddress();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#getBlockchainLinkTestWalletAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**GetTestWalletAddressResponse**](GetTestWalletAddressResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listBlockchainLinkChains

> CompletableFuture<ApiResponse<ListBlockchainsResponse2>> listBlockchainLinkChains listBlockchainLinkChains(pageCursor, pageSize, search, status, blockchainEnv, sortBy, order, statusExclude)

List blockchains with pagination and filtering

Returns the tenant&#39;s blockchains, paginated and filterable by state, network environment, and free-text search, with configurable sorting.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "1"; // String | tenant_id is extracted from JWT token context. Opaque cursor for the requested page. Currently encodes the 1-based page number as a decimal string (\"1\", \"2\", ...); treat as opaque on the client. Absent = first page.
        BigDecimal pageSize = new BigDecimal("20"); // BigDecimal | Maximum number of items per page. Default 20, clamped to [1, 1000].
        String search = "eth"; // String | Free-text search across chain and symbol name.
        List<BlockchainStateFilter> status = Arrays.asList(); // List<BlockchainStateFilter> | Include filter (repeated query params).
        BlockchainEnvironment blockchainEnv = BlockchainEnvironment.fromValue("MAINNET"); // BlockchainEnvironment | Filter by network.
        BlockchainSortField sortBy = BlockchainSortField.fromValue("createdAt"); // BlockchainSortField | Sort field. Default: createdAt.
        String order = "ASC"; // String | Sort order. Default: DESC.
        List<BlockchainStateFilter> statusExclude = Arrays.asList(); // List<BlockchainStateFilter> | Exclude filter (repeated query params).
        try {
            CompletableFuture<ApiResponse<ListBlockchainsResponse2>> response = fireblocks.blockchainLinkBeta().listBlockchainLinkChains(pageCursor, pageSize, search, status, blockchainEnv, sortBy, order, statusExclude);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#listBlockchainLinkChains");
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
| **pageCursor** | **String**| tenant_id is extracted from JWT token context. Opaque cursor for the requested page. Currently encodes the 1-based page number as a decimal string (\&quot;1\&quot;, \&quot;2\&quot;, ...); treat as opaque on the client. Absent &#x3D; first page. | [optional] |
| **pageSize** | **BigDecimal**| Maximum number of items per page. Default 20, clamped to [1, 1000]. | [optional] [default to 20] |
| **search** | **String**| Free-text search across chain and symbol name. | [optional] |
| **status** | [**List&lt;BlockchainStateFilter&gt;**](BlockchainStateFilter.md)| Include filter (repeated query params). | [optional] |
| **blockchainEnv** | [**BlockchainEnvironment**](.md)| Filter by network. | [optional] [enum: MAINNET, TESTNET] |
| **sortBy** | [**BlockchainSortField**](.md)| Sort field. Default: createdAt. | [optional] [enum: createdAt, chainName, symbolName, status] |
| **order** | **String**| Sort order. Default: DESC. | [optional] [default to DESC] [enum: ASC, DESC] |
| **statusExclude** | [**List&lt;BlockchainStateFilter&gt;**](BlockchainStateFilter.md)| Exclude filter (repeated query params). | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ListBlockchainsResponse2**](ListBlockchainsResponse2.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## triggerBlockchainLinkValidation

> CompletableFuture<ApiResponse<TriggerValidationFlowResponse>> triggerBlockchainLinkValidation triggerBlockchainLinkValidation(blockchainId, idempotencyKey)

Trigger validation workflow

Starts the asynchronous validation workflow for a blockchain and its associated validation session.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID blockchainId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"); // UUID | ID of the blockchain to validate.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TriggerValidationFlowResponse>> response = fireblocks.blockchainLinkBeta().triggerBlockchainLinkValidation(blockchainId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#triggerBlockchainLinkValidation");
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
| **blockchainId** | **UUID**| ID of the blockchain to validate. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TriggerValidationFlowResponse**](TriggerValidationFlowResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateBlockchainLinkChain

> CompletableFuture<ApiResponse<UpdateBlockchainResponse>> updateBlockchainLinkChain updateBlockchainLinkChain(blockchainDeclaredProperties, blockchainId, idempotencyKey)

Update a blockchain

Updates the declared properties of an existing blockchain identified by its ID. Only the fields supplied in the request are modified.

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
import com.fireblocks.sdk.api.BlockchainLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        BlockchainDeclaredProperties blockchainDeclaredProperties = new BlockchainDeclaredProperties(); // BlockchainDeclaredProperties | 
        String blockchainId = "f47ac10b-58cc-4372-a567-0e02b2c3d479"; // String | ID of the blockchain to update (supplied as a path parameter).
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UpdateBlockchainResponse>> response = fireblocks.blockchainLinkBeta().updateBlockchainLinkChain(blockchainDeclaredProperties, blockchainId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling BlockchainLinkBetaApi#updateBlockchainLinkChain");
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
| **blockchainDeclaredProperties** | [**BlockchainDeclaredProperties**](BlockchainDeclaredProperties.md)|  | |
| **blockchainId** | **String**| ID of the blockchain to update (supplied as a path parameter). | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**UpdateBlockchainResponse**](UpdateBlockchainResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

