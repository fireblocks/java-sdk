# TokenizationApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**burnCollectionToken**](TokenizationApi.md#burnCollectionToken) | **POST** /tokenization/collections/{id}/tokens/burn | Burn tokens |
| [**createNewCollection**](TokenizationApi.md#createNewCollection) | **POST** /tokenization/collections | Create a new collection |
| [**deactivateAndUnlinkAdapters**](TokenizationApi.md#deactivateAndUnlinkAdapters) | **DELETE** /tokenization/multichain/bridge/layerzero | Remove LayerZero adapters |
| [**deployAndLinkAdapters**](TokenizationApi.md#deployAndLinkAdapters) | **POST** /tokenization/multichain/bridge/layerzero | Deploy LayerZero adapters |
| [**fetchCollectionTokenDetails**](TokenizationApi.md#fetchCollectionTokenDetails) | **GET** /tokenization/collections/{id}/tokens/{tokenId} | Get collection token details |
| [**getCollectionById**](TokenizationApi.md#getCollectionById) | **GET** /tokenization/collections/{id} | Get a collection by id |
| [**getDeployableAddress**](TokenizationApi.md#getDeployableAddress) | **POST** /tokenization/multichain/deterministic_address | Get deterministic address for contract deployment |
| [**getLayerZeroDvnConfig**](TokenizationApi.md#getLayerZeroDvnConfig) | **GET** /tokenization/multichain/bridge/layerzero/config/{adapterTokenLinkId}/dvns | Get LayerZero DVN configuration |
| [**getLayerZeroPeers**](TokenizationApi.md#getLayerZeroPeers) | **GET** /tokenization/multichain/bridge/layerzero/config/{adapterTokenLinkId}/peers | Get LayerZero peers |
| [**getLinkedCollections**](TokenizationApi.md#getLinkedCollections) | **GET** /tokenization/collections | Get collections |
| [**getLinkedToken**](TokenizationApi.md#getLinkedToken) | **GET** /tokenization/tokens/{id} | Return a linked token |
| [**getLinkedTokens**](TokenizationApi.md#getLinkedTokens) | **GET** /tokenization/tokens | List all linked tokens |
| [**getLinkedTokensCount**](TokenizationApi.md#getLinkedTokensCount) | **GET** /tokenization/tokens/count | Get the total count of linked tokens |
| [**getTokenAccessRegistryAddresses**](TokenizationApi.md#getTokenAccessRegistryAddresses) | **GET** /tokenization/access_registries/{id}/addresses | Get current state of addresses in an access registry |
| [**getTokenAccessRegistrySummary**](TokenizationApi.md#getTokenAccessRegistrySummary) | **GET** /tokenization/access_registries/{id}/summary | Get summary of an access registry |
| [**getTokenBalanceForAccount**](TokenizationApi.md#getTokenBalanceForAccount) | **GET** /tokenization/tokens/{id}/balances/{accountAddress} | Get the latest balance for a specific account |
| [**getTokenBalanceHistory**](TokenizationApi.md#getTokenBalanceHistory) | **GET** /tokenization/tokens/{id}/balances/{accountAddress}/history | Get balance history for a specific account |
| [**getTokenBalances**](TokenizationApi.md#getTokenBalances) | **GET** /tokenization/tokens/{id}/balances | Get latest balances for all holders of a token |
| [**getTokenContractSummary**](TokenizationApi.md#getTokenContractSummary) | **GET** /tokenization/tokens/{id}/summary | Get onchain summary for a token |
| [**getTokenRbac**](TokenizationApi.md#getTokenRbac) | **GET** /tokenization/tokens/{id}/rbac | Get active RBAC roles for a token |
| [**getTokenTotalSupply**](TokenizationApi.md#getTokenTotalSupply) | **GET** /tokenization/tokens/{id}/total_supply | Get historical total supply for a token |
| [**getTokenTransactions**](TokenizationApi.md#getTokenTransactions) | **GET** /tokenization/tokens/{id}/transactions | Get onchain transactions for a token |
| [**getTokenTransfers**](TokenizationApi.md#getTokenTransfers) | **GET** /tokenization/tokens/{id}/transfers | Get onchain transfers for a token |
| [**issueNewToken**](TokenizationApi.md#issueNewToken) | **POST** /tokenization/tokens | Issue a new token |
| [**issueTokenMultiChain**](TokenizationApi.md#issueTokenMultiChain) | **POST** /tokenization/multichain/tokens | Issue a token on one or more blockchains |
| [**link**](TokenizationApi.md#link) | **POST** /tokenization/tokens/link | Link a contract |
| [**mintCollectionToken**](TokenizationApi.md#mintCollectionToken) | **POST** /tokenization/collections/{id}/tokens/mint | Mint tokens |
| [**reIssueTokenMultiChain**](TokenizationApi.md#reIssueTokenMultiChain) | **POST** /tokenization/multichain/reissue/token/{tokenLinkId} | Reissue a multichain token |
| [**removeLayerZeroPeers**](TokenizationApi.md#removeLayerZeroPeers) | **DELETE** /tokenization/multichain/bridge/layerzero/config/peers | Remove LayerZero peers |
| [**setLayerZeroDvnConfig**](TokenizationApi.md#setLayerZeroDvnConfig) | **POST** /tokenization/multichain/bridge/layerzero/config/dvns | Set LayerZero DVN configuration |
| [**setLayerZeroPeers**](TokenizationApi.md#setLayerZeroPeers) | **POST** /tokenization/multichain/bridge/layerzero/config/peers | Set LayerZero peers |
| [**unlink**](TokenizationApi.md#unlink) | **DELETE** /tokenization/tokens/{id} | Unlink a token |
| [**unlinkCollection**](TokenizationApi.md#unlinkCollection) | **DELETE** /tokenization/collections/{id} | Delete a collection link |
| [**validateLayerZeroChannelConfig**](TokenizationApi.md#validateLayerZeroChannelConfig) | **GET** /tokenization/multichain/bridge/layerzero/validate | Validate LayerZero channel configuration |



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

Create a new collection and link it as a token. Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, and Editor.

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


## deactivateAndUnlinkAdapters

> CompletableFuture<ApiResponse<RemoveLayerZeroAdaptersResponse>> deactivateAndUnlinkAdapters deactivateAndUnlinkAdapters(removeLayerZeroAdaptersRequest, idempotencyKey)

Remove LayerZero adapters

Remove LayerZero adapters by deactivating and unlinking them. This endpoint revokes roles and deactivates the specified adapter contracts.

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

        RemoveLayerZeroAdaptersRequest removeLayerZeroAdaptersRequest = new RemoveLayerZeroAdaptersRequest(); // RemoveLayerZeroAdaptersRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<RemoveLayerZeroAdaptersResponse>> response = fireblocks.tokenization().deactivateAndUnlinkAdapters(removeLayerZeroAdaptersRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#deactivateAndUnlinkAdapters");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#deactivateAndUnlinkAdapters");
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
| **removeLayerZeroAdaptersRequest** | [**RemoveLayerZeroAdaptersRequest**](RemoveLayerZeroAdaptersRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**RemoveLayerZeroAdaptersResponse**](RemoveLayerZeroAdaptersResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LayerZero adapters removal process completed |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **404** | Token link not found |  -  |
| **409** | Token link processing error |  -  |
| **500** | Internal server error |  -  |


## deployAndLinkAdapters

> CompletableFuture<ApiResponse<List<AdapterProcessingResult>>> deployAndLinkAdapters deployAndLinkAdapters(deployLayerZeroAdaptersRequest, idempotencyKey)

Deploy LayerZero adapters

Deploy LayerZero adapters for multichain token bridging functionality. This endpoint creates adapter contracts that enable cross-chain token transfers.

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

        DeployLayerZeroAdaptersRequest deployLayerZeroAdaptersRequest = new DeployLayerZeroAdaptersRequest(); // DeployLayerZeroAdaptersRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<List<AdapterProcessingResult>>> response = fireblocks.tokenization().deployAndLinkAdapters(deployLayerZeroAdaptersRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#deployAndLinkAdapters");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#deployAndLinkAdapters");
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
| **deployLayerZeroAdaptersRequest** | [**DeployLayerZeroAdaptersRequest**](DeployLayerZeroAdaptersRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;AdapterProcessingResult&gt;**](AdapterProcessingResult.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LayerZero adapters deployed successfully |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **404** | Token link not found |  -  |
| **409** | Token link preparation error |  -  |
| **422** | Token link is not fungible |  -  |
| **500** | Internal server error |  -  |


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


## getLayerZeroDvnConfig

> CompletableFuture<ApiResponse<GetLayerZeroDvnConfigResponse>> getLayerZeroDvnConfig getLayerZeroDvnConfig(adapterTokenLinkId, peerAdapterTokenLinkId)

Get LayerZero DVN configuration

Retrieve the DVN (Data Verification Network) configuration for a specific adapter. Returns DVN configurations for channels between the source adapter and its peers.

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

        UUID adapterTokenLinkId = UUID.fromString("b70701f4-d7b1-4795-a8ee-b09cdb5b850d"); // UUID | The token link id of the adapter token link
        UUID peerAdapterTokenLinkId = UUID.fromString("6add4f2a-b206-4114-8f94-2882618ffbb4"); // UUID | Optional peer adapter token link ID to filter results
        try {
            CompletableFuture<ApiResponse<GetLayerZeroDvnConfigResponse>> response = fireblocks.tokenization().getLayerZeroDvnConfig(adapterTokenLinkId, peerAdapterTokenLinkId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getLayerZeroDvnConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getLayerZeroDvnConfig");
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
| **adapterTokenLinkId** | **UUID**| The token link id of the adapter token link | |
| **peerAdapterTokenLinkId** | **UUID**| Optional peer adapter token link ID to filter results | [optional] |

### Return type

CompletableFuture<ApiResponse<[**GetLayerZeroDvnConfigResponse**](GetLayerZeroDvnConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LayerZero DVN configuration retrieved successfully |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **404** | Token link not found |  -  |
| **500** | Internal server error |  -  |


## getLayerZeroPeers

> CompletableFuture<ApiResponse<GetLayerZeroPeersResponse>> getLayerZeroPeers getLayerZeroPeers(adapterTokenLinkId)

Get LayerZero peers

Retrieve the LayerZero peers configured for a specific adapter. Returns information about peer relationships for cross-chain communication.

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

        UUID adapterTokenLinkId = UUID.fromString("b70701f4-d7b1-4795-a8ee-b09cdb5b850d"); // UUID | The token link id of the adapter token link
        try {
            CompletableFuture<ApiResponse<GetLayerZeroPeersResponse>> response = fireblocks.tokenization().getLayerZeroPeers(adapterTokenLinkId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getLayerZeroPeers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getLayerZeroPeers");
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
| **adapterTokenLinkId** | **UUID**| The token link id of the adapter token link | |

### Return type

CompletableFuture<ApiResponse<[**GetLayerZeroPeersResponse**](GetLayerZeroPeersResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LayerZero peers retrieved successfully |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **404** | Token link not found |  -  |
| **500** | Internal server error |  -  |


## getLinkedCollections

> CompletableFuture<ApiResponse<GetLinkedCollectionsPaginatedResponse>> getLinkedCollections getLinkedCollections(pageCursor, pageSize, status)

Get collections

Get collections (paginated). Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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


## getLinkedTokensCount

> CompletableFuture<ApiResponse<LinkedTokensCount>> getLinkedTokensCount getLinkedTokensCount()

Get the total count of linked tokens

Get the total count of linked tokens

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

        try {
            CompletableFuture<ApiResponse<LinkedTokensCount>> response = fireblocks.tokenization().getLinkedTokensCount();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getLinkedTokensCount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getLinkedTokensCount");
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

CompletableFuture<ApiResponse<[**LinkedTokensCount**](LinkedTokensCount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Count fetched successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenAccessRegistryAddresses

> CompletableFuture<ApiResponse<AccessRegistryCurrentStateResponse>> getTokenAccessRegistryAddresses getTokenAccessRegistryAddresses(id, pageCursor, pageSize, sortBy, order)

Get current state of addresses in an access registry

Returns the currently active addresses in the access registry (added but not removed).

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
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more than 100 will return 100 items
        String sortBy = "dateAdded"; // String | Sorting field (enum).
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<AccessRegistryCurrentStateResponse>> response = fireblocks.tokenization().getTokenAccessRegistryAddresses(id, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenAccessRegistryAddresses");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenAccessRegistryAddresses");
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
| **pageCursor** | **String**| Page cursor to get the next page | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more than 100 will return 100 items | [optional] |
| **sortBy** | **String**| Sorting field (enum). | [optional] [default to dateAdded] [enum: dateAdded, address] |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**AccessRegistryCurrentStateResponse**](AccessRegistryCurrentStateResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Access registry addresses retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenAccessRegistrySummary

> CompletableFuture<ApiResponse<AccessRegistrySummaryResponse>> getTokenAccessRegistrySummary getTokenAccessRegistrySummary(id)

Get summary of an access registry

Returns a summary of the current state of the access registry.

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
            CompletableFuture<ApiResponse<AccessRegistrySummaryResponse>> response = fireblocks.tokenization().getTokenAccessRegistrySummary(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenAccessRegistrySummary");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenAccessRegistrySummary");
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

CompletableFuture<ApiResponse<[**AccessRegistrySummaryResponse**](AccessRegistrySummaryResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Access registry summary retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenBalanceForAccount

> CompletableFuture<ApiResponse<AddressBalanceItemDto>> getTokenBalanceForAccount getTokenBalanceForAccount(id, accountAddress)

Get the latest balance for a specific account

Returns the latest token balance for the specified account address.

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
        String accountAddress = "0x1234567890abcdef1234567890abcdef12345678"; // String | The account address to get balance history for
        try {
            CompletableFuture<ApiResponse<AddressBalanceItemDto>> response = fireblocks.tokenization().getTokenBalanceForAccount(id, accountAddress);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenBalanceForAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenBalanceForAccount");
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
| **accountAddress** | **String**| The account address to get balance history for | |

### Return type

CompletableFuture<ApiResponse<[**AddressBalanceItemDto**](AddressBalanceItemDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the balance for the account |  -  |
| **404** | Token not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenBalanceHistory

> CompletableFuture<ApiResponse<BalanceHistoryPagedResponse>> getTokenBalanceHistory getTokenBalanceHistory(id, accountAddress, startDate, endDate, interval, pageCursor, pageSize, sortBy, order)

Get balance history for a specific account

Returns paginated balance history for the specified account address with optional time-range filtering.

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
        String accountAddress = "0x1234567890abcdef1234567890abcdef12345678"; // String | The account address to get balance history for
        OffsetDateTime startDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | Start date of the time range in ISO 8601 format
        OffsetDateTime endDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | End date of the time range in ISO 8601 format
        String interval = "HOUR"; // String | Time interval for grouping data
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more than 100 will return 100 items
        String sortBy = "blockTimestamp"; // String | Sorting field (enum). Sorting only supported by 'blockTimestamp'
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<BalanceHistoryPagedResponse>> response = fireblocks.tokenization().getTokenBalanceHistory(id, accountAddress, startDate, endDate, interval, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenBalanceHistory");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenBalanceHistory");
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
| **accountAddress** | **String**| The account address to get balance history for | |
| **startDate** | **OffsetDateTime**| Start date of the time range in ISO 8601 format | [optional] |
| **endDate** | **OffsetDateTime**| End date of the time range in ISO 8601 format | [optional] |
| **interval** | **String**| Time interval for grouping data | [optional] [default to DAY] [enum: HOUR, DAY, WEEK, MONTH] |
| **pageCursor** | **String**| Page cursor to get the next page | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more than 100 will return 100 items | [optional] |
| **sortBy** | **String**| Sorting field (enum). Sorting only supported by &#39;blockTimestamp&#39; | [optional] [default to blockTimestamp] [enum: blockTimestamp] |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**BalanceHistoryPagedResponse**](BalanceHistoryPagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the balance history |  -  |
| **404** | Token not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenBalances

> CompletableFuture<ApiResponse<AddressBalancePagedResponse>> getTokenBalances getTokenBalances(id, pageCursor, pageSize, sortBy, order)

Get latest balances for all holders of a token

Returns the latest balance for each unique address holding this token.

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
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more than 100 will return 100 items
        String sortBy = "accountAddress"; // String | Sorting field for balances
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<AddressBalancePagedResponse>> response = fireblocks.tokenization().getTokenBalances(id, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenBalances");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenBalances");
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
| **pageCursor** | **String**| Page cursor to get the next page | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more than 100 will return 100 items | [optional] |
| **sortBy** | **String**| Sorting field for balances | [optional] [default to blockTimestamp] [enum: accountAddress, blockTimestamp] |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**AddressBalancePagedResponse**](AddressBalancePagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the latest balances for the token |  -  |
| **404** | Token not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenContractSummary

> CompletableFuture<ApiResponse<TokenContractSummaryResponse>> getTokenContractSummary getTokenContractSummary(id)

Get onchain summary for a token

Returns the total number of unique holders and the total supply for the token contract.

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
            CompletableFuture<ApiResponse<TokenContractSummaryResponse>> response = fireblocks.tokenization().getTokenContractSummary(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenContractSummary");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenContractSummary");
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

CompletableFuture<ApiResponse<[**TokenContractSummaryResponse**](TokenContractSummaryResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the summary for the token contract |  -  |
| **404** | Token not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenRbac

> CompletableFuture<ApiResponse<ActiveRolesResponse>> getTokenRbac getTokenRbac(id)

Get active RBAC roles for a token

Returns a list of currently active roles for the token contract.

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
            CompletableFuture<ApiResponse<ActiveRolesResponse>> response = fireblocks.tokenization().getTokenRbac(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenRbac");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenRbac");
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

CompletableFuture<ApiResponse<[**ActiveRolesResponse**](ActiveRolesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of active roles |  -  |
| **404** | Token not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenTotalSupply

> CompletableFuture<ApiResponse<TotalSupplyPagedResponse>> getTokenTotalSupply getTokenTotalSupply(id, startDate, endDate, interval, pageCursor, pageSize, sortBy, order)

Get historical total supply for a token

Returns paginated total supply history for the token contract with optional time-range filtering and binning.

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
        OffsetDateTime startDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | Start date of the time range in ISO 8601 format
        OffsetDateTime endDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | End date of the time range in ISO 8601 format
        String interval = "HOUR"; // String | Time interval for grouping data
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more than 100 will return 100 items
        String sortBy = "blockTimestamp"; // String | Sorting field (enum). Sorting only supported by 'blockTimestamp'
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<TotalSupplyPagedResponse>> response = fireblocks.tokenization().getTokenTotalSupply(id, startDate, endDate, interval, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenTotalSupply");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenTotalSupply");
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
| **startDate** | **OffsetDateTime**| Start date of the time range in ISO 8601 format | [optional] |
| **endDate** | **OffsetDateTime**| End date of the time range in ISO 8601 format | [optional] |
| **interval** | **String**| Time interval for grouping data | [optional] [default to DAY] [enum: HOUR, DAY, WEEK, MONTH] |
| **pageCursor** | **String**| Page cursor to get the next page | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more than 100 will return 100 items | [optional] |
| **sortBy** | **String**| Sorting field (enum). Sorting only supported by &#39;blockTimestamp&#39; | [optional] [default to blockTimestamp] [enum: blockTimestamp] |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**TotalSupplyPagedResponse**](TotalSupplyPagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the token total supply history |  -  |
| **404** | Token not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenTransactions

> CompletableFuture<ApiResponse<OnchainTransactionsPagedResponse>> getTokenTransactions getTokenTransactions(id, startDate, endDate, pageCursor, pageSize, sortBy, order)

Get onchain transactions for a token

Returns a paginated list of onchain transactions for the token contract, optionally filtered by date range.

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
        OffsetDateTime startDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | Start date of the time range in ISO 8601 format
        OffsetDateTime endDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | End date of the time range in ISO 8601 format
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more than 100 will return 100 items
        String sortBy = "blockTimestamp"; // String | Sorting field (enum).
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<OnchainTransactionsPagedResponse>> response = fireblocks.tokenization().getTokenTransactions(id, startDate, endDate, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenTransactions");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenTransactions");
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
| **startDate** | **OffsetDateTime**| Start date of the time range in ISO 8601 format | [optional] |
| **endDate** | **OffsetDateTime**| End date of the time range in ISO 8601 format | [optional] |
| **pageCursor** | **String**| Page cursor to get the next page | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more than 100 will return 100 items | [optional] |
| **sortBy** | **String**| Sorting field (enum). | [optional] [default to blockTimestamp] [enum: blockTimestamp, blockNumber, transactionHash] |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**OnchainTransactionsPagedResponse**](OnchainTransactionsPagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Onchain transactions fetched successfully |  -  |
| **404** | Token not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTokenTransfers

> CompletableFuture<ApiResponse<OnchainTransfersPagedResponse>> getTokenTransfers getTokenTransfers(id, startDate, endDate, pageCursor, pageSize, sortBy, order, sender, receiver)

Get onchain transfers for a token

Returns a paginated list of ERC20 transfer events for the token contract, optionally filtered by date range.

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
        OffsetDateTime startDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | Start date of the time range in ISO 8601 format
        OffsetDateTime endDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | End date of the time range in ISO 8601 format
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more than 100 will return 100 items
        String sortBy = "blockTimeStamp"; // String | Sorting field for transfers
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        String sender = "0xabcdef1234567890abcdef1234567890abcdef12"; // String | Filter transfers by sender address
        String receiver = "0x1234567890abcdef1234567890abcdef12345678"; // String | Filter transfers by receiver address
        try {
            CompletableFuture<ApiResponse<OnchainTransfersPagedResponse>> response = fireblocks.tokenization().getTokenTransfers(id, startDate, endDate, pageCursor, pageSize, sortBy, order, sender, receiver);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#getTokenTransfers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#getTokenTransfers");
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
| **startDate** | **OffsetDateTime**| Start date of the time range in ISO 8601 format | [optional] |
| **endDate** | **OffsetDateTime**| End date of the time range in ISO 8601 format | [optional] |
| **pageCursor** | **String**| Page cursor to get the next page | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more than 100 will return 100 items | [optional] |
| **sortBy** | **String**| Sorting field for transfers | [optional] [default to blockTimeStamp] [enum: blockTimeStamp] |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |
| **sender** | **String**| Filter transfers by sender address | [optional] |
| **receiver** | **String**| Filter transfers by receiver address | [optional] |

### Return type

CompletableFuture<ApiResponse<[**OnchainTransfersPagedResponse**](OnchainTransfersPagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Onchain transfers fetched successfully |  -  |
| **404** | Token not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## issueNewToken

> CompletableFuture<ApiResponse<TokenLinkDto>> issueNewToken issueNewToken(createTokenRequestDto, idempotencyKey)

Issue a new token

Facilitates the creation of a new token, supporting both EVM-based and Stellar/Ripple platforms. For EVM, it deploys the corresponding contract template to the blockchain and links the token to the workspace. For Stellar/Ripple, it links a newly created token directly to the workspace without deploying a contract. Returns the token link with status \&quot;PENDING\&quot; until the token is deployed or \&quot;SUCCESS\&quot; if no deployment is needed. Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, and Editor.

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


## removeLayerZeroPeers

> CompletableFuture<ApiResponse<RemoveLayerZeroPeersResponse>> removeLayerZeroPeers removeLayerZeroPeers(removeLayerZeroPeersRequest, idempotencyKey)

Remove LayerZero peers

Remove LayerZero peers to disconnect adapter contracts. This endpoint removes peer relationships between LayerZero adapters.

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

        RemoveLayerZeroPeersRequest removeLayerZeroPeersRequest = new RemoveLayerZeroPeersRequest(); // RemoveLayerZeroPeersRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<RemoveLayerZeroPeersResponse>> response = fireblocks.tokenization().removeLayerZeroPeers(removeLayerZeroPeersRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#removeLayerZeroPeers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#removeLayerZeroPeers");
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
| **removeLayerZeroPeersRequest** | [**RemoveLayerZeroPeersRequest**](RemoveLayerZeroPeersRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**RemoveLayerZeroPeersResponse**](RemoveLayerZeroPeersResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LayerZero peers removal process completed |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **404** | Token link not found |  -  |
| **409** | Token link processing error |  -  |
| **500** | Internal server error |  -  |


## setLayerZeroDvnConfig

> CompletableFuture<ApiResponse<SetLayerZeroDvnConfigResponse>> setLayerZeroDvnConfig setLayerZeroDvnConfig(setLayerZeroDvnConfigRequest, idempotencyKey)

Set LayerZero DVN configuration

Configure DVN settings for LayerZero adapters. This endpoint sets up the DVN configuration for message verification between source and destination adapters.

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

        SetLayerZeroDvnConfigRequest setLayerZeroDvnConfigRequest = new SetLayerZeroDvnConfigRequest(); // SetLayerZeroDvnConfigRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SetLayerZeroDvnConfigResponse>> response = fireblocks.tokenization().setLayerZeroDvnConfig(setLayerZeroDvnConfigRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#setLayerZeroDvnConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#setLayerZeroDvnConfig");
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
| **setLayerZeroDvnConfigRequest** | [**SetLayerZeroDvnConfigRequest**](SetLayerZeroDvnConfigRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SetLayerZeroDvnConfigResponse**](SetLayerZeroDvnConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LayerZero DVN configuration set successfully |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **404** | Token link not found |  -  |
| **409** | Token link preparation error |  -  |
| **422** | Bridging protocol blockchain metadata not found |  -  |
| **500** | Internal server error |  -  |


## setLayerZeroPeers

> CompletableFuture<ApiResponse<SetLayerZeroPeersResponse>> setLayerZeroPeers setLayerZeroPeers(setLayerZeroPeersRequest, idempotencyKey)

Set LayerZero peers

Set LayerZero peers to establish connections between adapter contracts. This endpoint creates peer relationships that enable cross-chain communication. It sets the destination adapter as a peer of the source adapter. If &#x60;bidirectional&#x60; is true, it also sets the source adapter as a peer of the destination adapter(s).

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

        SetLayerZeroPeersRequest setLayerZeroPeersRequest = new SetLayerZeroPeersRequest(); // SetLayerZeroPeersRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SetLayerZeroPeersResponse>> response = fireblocks.tokenization().setLayerZeroPeers(setLayerZeroPeersRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#setLayerZeroPeers");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#setLayerZeroPeers");
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
| **setLayerZeroPeersRequest** | [**SetLayerZeroPeersRequest**](SetLayerZeroPeersRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SetLayerZeroPeersResponse**](SetLayerZeroPeersResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LayerZero peers set successfully |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **404** | Token link not found |  -  |
| **409** | Token link preparation error |  -  |
| **422** | Token link is not fungible |  -  |
| **500** | Internal server error |  -  |


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


## validateLayerZeroChannelConfig

> CompletableFuture<ApiResponse<ValidateLayerZeroChannelResponse>> validateLayerZeroChannelConfig validateLayerZeroChannelConfig(adapterTokenLinkId, peerAdapterTokenLinkId)

Validate LayerZero channel configuration

Validate the LayerZero channel configuration between adapters. This endpoint checks if the channel configuration is correct and returns any validation errors.

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

        UUID adapterTokenLinkId = UUID.fromString("b70701f4-d7b1-4795-a8ee-b09cdb5b850d"); // UUID | The token link ID of the adapter
        UUID peerAdapterTokenLinkId = UUID.fromString("6add4f2a-b206-4114-8f94-2882618ffbb4"); // UUID | Peer adapter token link ID to validate against
        try {
            CompletableFuture<ApiResponse<ValidateLayerZeroChannelResponse>> response = fireblocks.tokenization().validateLayerZeroChannelConfig(adapterTokenLinkId, peerAdapterTokenLinkId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TokenizationApi#validateLayerZeroChannelConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenizationApi#validateLayerZeroChannelConfig");
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
| **adapterTokenLinkId** | **UUID**| The token link ID of the adapter | |
| **peerAdapterTokenLinkId** | **UUID**| Peer adapter token link ID to validate against | |

### Return type

CompletableFuture<ApiResponse<[**ValidateLayerZeroChannelResponse**](ValidateLayerZeroChannelResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | LayerZero channel configuration validation completed |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **404** | Token link not found |  -  |
| **422** | Bridging protocol blockchain metadata not found |  -  |
| **500** | Internal server error |  -  |

