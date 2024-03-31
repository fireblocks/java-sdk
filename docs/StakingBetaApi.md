# StakingBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveTermsOfServiceByProviderId**](StakingBetaApi.md#approveTermsOfServiceByProviderId) | **POST** /staking/providers/{providerId}/approveTermsOfService |  |
| [**executeAction**](StakingBetaApi.md#executeAction) | **POST** /staking/chains/{chainDescriptor}/{actionId} |  |
| [**getAllDelegations**](StakingBetaApi.md#getAllDelegations) | **GET** /staking/positions |  |
| [**getChainInfo**](StakingBetaApi.md#getChainInfo) | **GET** /staking/chains/{chainDescriptor}/chainInfo |  |
| [**getChains**](StakingBetaApi.md#getChains) | **GET** /staking/chains |  |
| [**getDelegationById**](StakingBetaApi.md#getDelegationById) | **GET** /staking/positions/{id} |  |
| [**getProviders**](StakingBetaApi.md#getProviders) | **GET** /staking/providers |  |
| [**getSummary**](StakingBetaApi.md#getSummary) | **GET** /staking/positions/summary |  |
| [**getSummaryByVault**](StakingBetaApi.md#getSummaryByVault) | **GET** /staking/positions/summary/vaults |  |



## approveTermsOfServiceByProviderId

> CompletableFuture<ApiResponse<Object>> approveTermsOfServiceByProviderId approveTermsOfServiceByProviderId(providerId, idempotencyKey)



Approve the terms of service of the staking provider. This must be called before performing a staking action for the first time with this provider.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        String providerId = "kiln"; // String | The unique identifier of the staking provider
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Object>> response = apiInstance.approveTermsOfServiceByProviderId(providerId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#approveTermsOfServiceByProviderId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#approveTermsOfServiceByProviderId");
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
| **providerId** | **String**| The unique identifier of the staking provider | [enum: kiln, figment] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<**Object**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The terms of service have been successfully approved and is associated with 201 status code. |  -  |


## executeAction

> CompletableFuture<ApiResponse<ExecuteActionResponse>> executeAction executeAction(executeActionRequest, chainDescriptor, actionId, idempotencyKey)



Perform a chain-specific staking action (e.g. stake, unstake, withdraw).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        ExecuteActionRequest executeActionRequest = new ExecuteActionRequest(); // ExecuteActionRequest | 
        String chainDescriptor = "ETH"; // String | The protocol identifier (e.g. \"ETH\"/\"SOL\") to use
        String actionId = "stake"; // String | The operation that can be executed on a vault/position
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ExecuteActionResponse>> response = apiInstance.executeAction(executeActionRequest, chainDescriptor, actionId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#executeAction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#executeAction");
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
| **executeActionRequest** | [**ExecuteActionRequest**](ExecuteActionRequest.md)|  | |
| **chainDescriptor** | **String**| The protocol identifier (e.g. \&quot;ETH\&quot;/\&quot;SOL\&quot;) to use | [enum: ETH, SOL, ETH_TEST3, SOL_TEST] |
| **actionId** | **String**| The operation that can be executed on a vault/position | [enum: stake, unstake, withdraw] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ExecuteActionResponse**](ExecuteActionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A chain-specific action has been executed successfully on vault/position and is associated with 201 status code. |  -  |


## getAllDelegations

> CompletableFuture<ApiResponse<List<DelegationDto>>> getAllDelegations getAllDelegations(chainDescriptor)



Return detailed information on all staking positions, including the staked amount, rewards, status and more.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        String chainDescriptor = "chainDescriptor_example"; // String | Use \"ETH\" / \"SOL\" in order to obtain information related to the specific blockchain network or retrieve information about all chains that have data available by providing no argument.
        try {
            CompletableFuture<ApiResponse<List<DelegationDto>>> response = apiInstance.getAllDelegations(chainDescriptor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#getAllDelegations");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getAllDelegations");
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
| **chainDescriptor** | **String**| Use \&quot;ETH\&quot; / \&quot;SOL\&quot; in order to obtain information related to the specific blockchain network or retrieve information about all chains that have data available by providing no argument. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;DelegationDto&gt;**](DelegationDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of position data was returned successfully |  -  |


## getChainInfo

> CompletableFuture<ApiResponse<ChainInfoResponseDto>> getChainInfo getChainInfo(chainDescriptor)



Return chain-specific, staking-related information summary (e.g. epoch details, lockup durations, estimated rewards, etc.)

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        String chainDescriptor = "ETH"; // String | The protocol identifier (e.g. \"ETH\"/\"SOL\") to use
        try {
            CompletableFuture<ApiResponse<ChainInfoResponseDto>> response = apiInstance.getChainInfo(chainDescriptor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#getChainInfo");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getChainInfo");
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
| **chainDescriptor** | **String**| The protocol identifier (e.g. \&quot;ETH\&quot;/\&quot;SOL\&quot;) to use | [enum: ETH, SOL, ETH_TEST3, SOL_TEST] |

### Return type

CompletableFuture<ApiResponse<[**ChainInfoResponseDto**](ChainInfoResponseDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chain specific info summary was returned successfully |  -  |


## getChains

> CompletableFuture<ApiResponse<List<String>>> getChains getChains()



Return an alphabetical list of supported chains.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<String>>> response = apiInstance.getChains();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#getChains");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getChains");
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

CompletableFuture<ApiResponse<**List&lt;String&gt;**>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## getDelegationById

> CompletableFuture<ApiResponse<DelegationDto>> getDelegationById getDelegationById(id)



Return detailed information on a staking position, including the staked amount, rewards, status and more.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        String id = "id_example"; // String | The unique identifier of the staking position
        try {
            CompletableFuture<ApiResponse<DelegationDto>> response = apiInstance.getDelegationById(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#getDelegationById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getDelegationById");
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
| **id** | **String**| The unique identifier of the staking position | |

### Return type

CompletableFuture<ApiResponse<[**DelegationDto**](DelegationDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Position data was returned successfully |  -  |


## getProviders

> CompletableFuture<ApiResponse<List<ProviderDto>>> getProviders getProviders()



Return information on all the available staking providers.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<ProviderDto>>> response = apiInstance.getProviders();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#getProviders");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getProviders");
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

CompletableFuture<ApiResponse<[**List&lt;ProviderDto&gt;**](ProviderDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of supported providers was returned successfully |  -  |


## getSummary

> CompletableFuture<ApiResponse<DelegationSummaryDto>> getSummary getSummary()



Return a summary of all vaults, categorized by their status (active, inactive), the total amounts staked and total rewards per-chain.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<DelegationSummaryDto>> response = apiInstance.getSummary();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#getSummary");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getSummary");
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

CompletableFuture<ApiResponse<[**DelegationSummaryDto**](DelegationSummaryDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A summary for all vaults were returned successfully |  -  |


## getSummaryByVault

> CompletableFuture<ApiResponse<Map<String, DelegationSummaryDto>>> getSummaryByVault getSummaryByVault()



Return a summary for each vault, categorized by their status (active, inactive), the total amounts staked and total rewards per-chain.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.StakingBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        StakingBetaApi apiInstance = new StakingBetaApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<Map<String, DelegationSummaryDto>>> response = apiInstance.getSummaryByVault();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling StakingBetaApi#getSummaryByVault");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getSummaryByVault");
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

CompletableFuture<ApiResponse<[**Map&lt;String, DelegationSummaryDto&gt;**](DelegationSummaryDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A summary for each vault were returned successfully |  -  |

