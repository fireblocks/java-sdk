# StakingApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveTermsOfServiceByProviderId**](StakingApi.md#approveTermsOfServiceByProviderId) | **POST** /staking/providers/{providerId}/approveTermsOfService | Approve provider terms of service |
| [**claimRewards**](StakingApi.md#claimRewards) | **POST** /staking/chains/{chainDescriptor}/claim_rewards | Claim accrued rewards |
| [**getAllDelegations**](StakingApi.md#getAllDelegations) | **GET** /staking/positions | List staking positions |
| [**getChainInfo**](StakingApi.md#getChainInfo) | **GET** /staking/chains/{chainDescriptor}/chainInfo | Get chain-level staking parameters |
| [**getChains**](StakingApi.md#getChains) | **GET** /staking/chains | List supported staking chains |
| [**getDelegationById**](StakingApi.md#getDelegationById) | **GET** /staking/positions/{id} | Get position details |
| [**getProviders**](StakingApi.md#getProviders) | **GET** /staking/providers | List staking providers |
| [**getSummary**](StakingApi.md#getSummary) | **GET** /staking/positions/summary | Get positions summary |
| [**getSummaryByVault**](StakingApi.md#getSummaryByVault) | **GET** /staking/positions/summary/vaults | Get positions summary by vault |
| [**mergeStakeAccounts**](StakingApi.md#mergeStakeAccounts) | **POST** /staking/chains/{chainDescriptor}/merge | Merge staking positions |
| [**split**](StakingApi.md#split) | **POST** /staking/chains/{chainDescriptor}/split | Split a staking position |
| [**stake**](StakingApi.md#stake) | **POST** /staking/chains/{chainDescriptor}/stake | Initiate or add to existing stake |
| [**unstake**](StakingApi.md#unstake) | **POST** /staking/chains/{chainDescriptor}/unstake | Initiate unstake |
| [**withdraw**](StakingApi.md#withdraw) | **POST** /staking/chains/{chainDescriptor}/withdraw | Withdraw staked funds |



## approveTermsOfServiceByProviderId

> CompletableFuture<ApiResponse<Void>> approveTermsOfServiceByProviderId approveTermsOfServiceByProviderId(providerId, idempotencyKey)

Approve provider terms of service

Approves the provider&#39;s terms of service. Must be called once before performing any staking operation with this provider.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        StakingProvider providerId = StakingProvider.fromValue("kiln"); // StakingProvider | Unique identifier of the staking provider.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.staking().approveTermsOfServiceByProviderId(providerId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#approveTermsOfServiceByProviderId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#approveTermsOfServiceByProviderId");
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
| **providerId** | [**StakingProvider**](.md)| Unique identifier of the staking provider. | [enum: kiln, figment, lido, p2p, blockdaemon, galaxy, pierTwo, kraken] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

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
| **201** | Terms of service accepted. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## claimRewards

> CompletableFuture<ApiResponse<Void>> claimRewards claimRewards(claimRewardsRequest, chainDescriptor, idempotencyKey)

Claim accrued rewards

Claims available staking rewards for the specified chain and vault. Supported chains: Solana and Polygon (Matic). Behavior depends on protocol reward distribution.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ClaimRewardsRequest claimRewardsRequest = new ClaimRewardsRequest(); // ClaimRewardsRequest | 
        String chainDescriptor = "SOL"; // String | Protocol identifier for the claim rewards staking operation (e.g., MATIC/SOL).
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.staking().claimRewards(claimRewardsRequest, chainDescriptor, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#claimRewards");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#claimRewards");
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
| **claimRewardsRequest** | [**ClaimRewardsRequest**](ClaimRewardsRequest.md)|  | |
| **chainDescriptor** | **String**| Protocol identifier for the claim rewards staking operation (e.g., MATIC/SOL). | [enum: SOL, SOL_TEST, MATIC] |
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
| **201** | Claim-rewards request accepted and created. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getAllDelegations

> CompletableFuture<ApiResponse<List<Delegation>>> getAllDelegations getAllDelegations(chainDescriptor)

List staking positions

Returns all staking positions with core details: amounts, rewards, status, chain, and vault. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ChainDescriptor chainDescriptor = ChainDescriptor.fromValue("ATOM_COS"); // ChainDescriptor | Protocol identifier to filter positions (e.g., ATOM_COS/AXL/CELESTIA}). If omitted, positions across all supported chains are returned.
        try {
            CompletableFuture<ApiResponse<List<Delegation>>> response = fireblocks.staking().getAllDelegations(chainDescriptor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#getAllDelegations");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#getAllDelegations");
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
| **chainDescriptor** | [**ChainDescriptor**](.md)| Protocol identifier to filter positions (e.g., ATOM_COS/AXL/CELESTIA}). If omitted, positions across all supported chains are returned. | [optional] [enum: ATOM_COS, AXL, AXL_TEST, CELESTIA, DYDX_DYDX, ETH, ETH_TEST6, ETH_TEST_HOODI, INJ_INJ, MANTRA, MATIC, OSMO, SOL, SOL_TEST, STETH_ETH, STETH_ETH_TEST6_DZFA, STETH_ETH_TEST_HOODI] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;Delegation&gt;**](Delegation.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Positions retrieved successfully. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getChainInfo

> CompletableFuture<ApiResponse<ChainInfoResponse>> getChainInfo getChainInfo(chainDescriptor)

Get chain-level staking parameters

Returns chain-specific staking information such as epoch/slot cadence, lockup or unbonding periods, fee/reward mechanics, and other operational constraints.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ChainDescriptor chainDescriptor = ChainDescriptor.fromValue("ATOM_COS"); // ChainDescriptor | Protocol identifier for the chain info staking operation (e.g., ETH/MATIC/SOL).
        try {
            CompletableFuture<ApiResponse<ChainInfoResponse>> response = fireblocks.staking().getChainInfo(chainDescriptor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#getChainInfo");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#getChainInfo");
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
| **chainDescriptor** | [**ChainDescriptor**](.md)| Protocol identifier for the chain info staking operation (e.g., ETH/MATIC/SOL). | [enum: ATOM_COS, AXL, AXL_TEST, CELESTIA, DYDX_DYDX, ETH, ETH_TEST6, ETH_TEST_HOODI, INJ_INJ, MANTRA, MATIC, OSMO, SOL, SOL_TEST, STETH_ETH, STETH_ETH_TEST6_DZFA, STETH_ETH_TEST_HOODI] |

### Return type

CompletableFuture<ApiResponse<[**ChainInfoResponse**](ChainInfoResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chain-specific staking information returned successfully. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getChains

> CompletableFuture<ApiResponse<List<ChainDescriptor>>> getChains getChains()

List supported staking chains

Returns an alphabetical list of blockchains supported for staking by the current workspace context. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.StakingApi;
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
            CompletableFuture<ApiResponse<List<ChainDescriptor>>> response = fireblocks.staking().getChains();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#getChains");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#getChains");
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

CompletableFuture<ApiResponse<[**List&lt;ChainDescriptor&gt;**](ChainDescriptor.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of supported chains was returned successfully. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getDelegationById

> CompletableFuture<ApiResponse<Delegation>> getDelegationById getDelegationById(id)

Get position details

Returns full details for a single staking position: amounts, rewards, status, chain, and vault.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "id_example"; // String | Unique identifier of the staking position.
        try {
            CompletableFuture<ApiResponse<Delegation>> response = fireblocks.staking().getDelegationById(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#getDelegationById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#getDelegationById");
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
| **id** | **String**| Unique identifier of the staking position. | |

### Return type

CompletableFuture<ApiResponse<[**Delegation**](Delegation.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Position retrieved successfully. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getProviders

> CompletableFuture<ApiResponse<List<Provider>>> getProviders getProviders()

List staking providers

Returns all available staking providers with metadata such as name, ID, and supported chains. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.StakingApi;
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
            CompletableFuture<ApiResponse<List<Provider>>> response = fireblocks.staking().getProviders();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#getProviders");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#getProviders");
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

CompletableFuture<ApiResponse<[**List&lt;Provider&gt;**](Provider.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Supported providers retrieved successfully. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getSummary

> CompletableFuture<ApiResponse<DelegationSummary>> getSummary getSummary()

Get positions summary

Returns an aggregated cross-vault summary: active/inactive counts, total staked, and total rewards per chain.

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
import com.fireblocks.sdk.api.StakingApi;
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
            CompletableFuture<ApiResponse<DelegationSummary>> response = fireblocks.staking().getSummary();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#getSummary");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#getSummary");
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

CompletableFuture<ApiResponse<[**DelegationSummary**](DelegationSummary.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Summary across all vaults returned successfully. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getSummaryByVault

> CompletableFuture<ApiResponse<Map<String, DelegationSummary>>> getSummaryByVault getSummaryByVault()

Get positions summary by vault

Returns per-vault aggregates: status breakdown, total staked, and total rewards per chain.

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
import com.fireblocks.sdk.api.StakingApi;
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
            CompletableFuture<ApiResponse<Map<String, DelegationSummary>>> response = fireblocks.staking().getSummaryByVault();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#getSummaryByVault");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#getSummaryByVault");
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

CompletableFuture<ApiResponse<[**Map&lt;String, DelegationSummary&gt;**](DelegationSummary.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Per-vault summary returned successfully. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## mergeStakeAccounts

> CompletableFuture<ApiResponse<MergeStakeAccountsResponse>> mergeStakeAccounts mergeStakeAccounts(mergeStakeAccountsRequest, chainDescriptor, idempotencyKey)

Merge staking positions

Merges the source stake account into the destination, consolidating the balance into the destination and closing the source account once complete. Both accounts must be from the same validator provider and of same vault account.. Supported chains: Solana (SOL). &lt;/br&gt;Endpoint Permission: Owner, Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        MergeStakeAccountsRequest mergeStakeAccountsRequest = new MergeStakeAccountsRequest(); // MergeStakeAccountsRequest | 
        String chainDescriptor = "SOL"; // String | Protocol identifier for the merge staking operation (e.g., SOL).
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<MergeStakeAccountsResponse>> response = fireblocks.staking().mergeStakeAccounts(mergeStakeAccountsRequest, chainDescriptor, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#mergeStakeAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#mergeStakeAccounts");
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
| **mergeStakeAccountsRequest** | [**MergeStakeAccountsRequest**](MergeStakeAccountsRequest.md)|  | |
| **chainDescriptor** | **String**| Protocol identifier for the merge staking operation (e.g., SOL). | [enum: SOL, SOL_TEST] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**MergeStakeAccountsResponse**](MergeStakeAccountsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Merge request accepted and created. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## split

> CompletableFuture<ApiResponse<SplitResponse>> split split(splitRequest, chainDescriptor, idempotencyKey)

Split a staking position

Splits a staking position by creating a new stake account with the requested amount, while keeping the original account with the remaining balance. Supported chains: Solana (SOL).

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        SplitRequest splitRequest = new SplitRequest(); // SplitRequest | 
        String chainDescriptor = "SOL"; // String | Protocol identifier for the staking operation (e.g., SOL).
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SplitResponse>> response = fireblocks.staking().split(splitRequest, chainDescriptor, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#split");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#split");
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
| **splitRequest** | [**SplitRequest**](SplitRequest.md)|  | |
| **chainDescriptor** | **String**| Protocol identifier for the staking operation (e.g., SOL). | [enum: SOL, SOL_TEST] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SplitResponse**](SplitResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Split request accepted and created. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## stake

> CompletableFuture<ApiResponse<StakeResponse>> stake stake(stakeRequest, chainDescriptor, idempotencyKey)

Initiate or add to existing stake

Creates a new staking position and returns its unique ID. For Ethereum compounding validator (EIP-7251): when the &#39;id&#39; of an existing compounding validator position is provided, adds to that position; otherwise creates a new position. For Ethereum legacy validator: creates a new position regardless of existing delegations. For Cosmos chains and Ethereum liquid staking (Lido): automatically add to existing positions for the same validator provider and same vault account if one exists, otherwise create a new position. For Solana and Polygon: always create new positions regardless of existing delegations.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        StakeRequest stakeRequest = new StakeRequest(); // StakeRequest | 
        ChainDescriptor chainDescriptor = ChainDescriptor.fromValue("ATOM_COS"); // ChainDescriptor | Protocol identifier for the stake staking operation (e.g., ATOM_COS/AXL/CELESTIA).
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<StakeResponse>> response = fireblocks.staking().stake(stakeRequest, chainDescriptor, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#stake");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#stake");
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
| **stakeRequest** | [**StakeRequest**](StakeRequest.md)|  | |
| **chainDescriptor** | [**ChainDescriptor**](.md)| Protocol identifier for the stake staking operation (e.g., ATOM_COS/AXL/CELESTIA). | [enum: ATOM_COS, AXL, AXL_TEST, CELESTIA, DYDX_DYDX, ETH, ETH_TEST6, ETH_TEST_HOODI, INJ_INJ, MANTRA, MATIC, OSMO, SOL, SOL_TEST, STETH_ETH, STETH_ETH_TEST6_DZFA, STETH_ETH_TEST_HOODI] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**StakeResponse**](StakeResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Stake request accepted and created. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## unstake

> CompletableFuture<ApiResponse<Void>> unstake unstake(unstakeRequest, chainDescriptor, idempotencyKey)

Initiate unstake

Submits a chain-specific unstake request.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UnstakeRequest unstakeRequest = new UnstakeRequest(); // UnstakeRequest | 
        ChainDescriptor chainDescriptor = ChainDescriptor.fromValue("ATOM_COS"); // ChainDescriptor | Protocol identifier for the unstake staking operation (e.g., SOL/SOL_TEST/MATIC).
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.staking().unstake(unstakeRequest, chainDescriptor, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#unstake");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#unstake");
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
| **unstakeRequest** | [**UnstakeRequest**](UnstakeRequest.md)|  | |
| **chainDescriptor** | [**ChainDescriptor**](.md)| Protocol identifier for the unstake staking operation (e.g., SOL/SOL_TEST/MATIC). | [enum: ATOM_COS, AXL, AXL_TEST, CELESTIA, DYDX_DYDX, ETH, ETH_TEST6, ETH_TEST_HOODI, INJ_INJ, MANTRA, MATIC, OSMO, SOL, SOL_TEST, STETH_ETH, STETH_ETH_TEST6_DZFA, STETH_ETH_TEST_HOODI] |
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
| **201** | Unstake request accepted and created. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## withdraw

> CompletableFuture<ApiResponse<Void>> withdraw withdraw(withdrawRequest, chainDescriptor, idempotencyKey)

Withdraw staked funds

Withdraws funds that have completed the unbonding period. Typically requires the position to be deactivated first (unstake → unbond → withdraw). Amount and timing vary by chain protocol.

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
import com.fireblocks.sdk.api.StakingApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        WithdrawRequest withdrawRequest = new WithdrawRequest(); // WithdrawRequest | 
        ChainDescriptor chainDescriptor = ChainDescriptor.fromValue("ATOM_COS"); // ChainDescriptor | Protocol identifier for the withdraw staking operation (e.g., ATOM_COS/ETH/STETH_ETH).
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.staking().withdraw(withdrawRequest, chainDescriptor, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingApi#withdraw");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingApi#withdraw");
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
| **withdrawRequest** | [**WithdrawRequest**](WithdrawRequest.md)|  | |
| **chainDescriptor** | [**ChainDescriptor**](.md)| Protocol identifier for the withdraw staking operation (e.g., ATOM_COS/ETH/STETH_ETH). | [enum: ATOM_COS, AXL, AXL_TEST, CELESTIA, DYDX_DYDX, ETH, ETH_TEST6, ETH_TEST_HOODI, INJ_INJ, MANTRA, MATIC, OSMO, SOL, SOL_TEST, STETH_ETH, STETH_ETH_TEST6_DZFA, STETH_ETH_TEST_HOODI] |
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
| **201** | Withdraw request accepted and created. |  * X-Request-ID -  <br>  |
| **400** | Bad request: missing/invalid fields, unsupported amount, or malformed payload. |  * X-Request-ID -  <br>  |
| **403** | Forbidden: insufficient permissions, disabled feature, or restricted provider/validator. |  * X-Request-ID -  <br>  |
| **404** | Not found: requested resource does not exist (e.g., position, validator, provider, or wallet). |  * X-Request-ID -  <br>  |
| **429** | Rate limit exceeded: slow down and retry later. |  * X-Request-ID -  <br>  |
| **500** | Internal error while processing the request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

