# StakingBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveTermsOfServiceByProviderId**](StakingBetaApi.md#approveTermsOfServiceByProviderId) | **POST** /staking/providers/{providerId}/approveTermsOfService |  |
| [**approveTermsOfServiceByProviderIdWithHttpInfo**](StakingBetaApi.md#approveTermsOfServiceByProviderIdWithHttpInfo) | **POST** /staking/providers/{providerId}/approveTermsOfService |  |
| [**executeAction**](StakingBetaApi.md#executeAction) | **POST** /staking/chains/{chainDescriptor}/{actionId} |  |
| [**executeActionWithHttpInfo**](StakingBetaApi.md#executeActionWithHttpInfo) | **POST** /staking/chains/{chainDescriptor}/{actionId} |  |
| [**getAllDelegations**](StakingBetaApi.md#getAllDelegations) | **GET** /staking/positions |  |
| [**getAllDelegationsWithHttpInfo**](StakingBetaApi.md#getAllDelegationsWithHttpInfo) | **GET** /staking/positions |  |
| [**getChainInfo**](StakingBetaApi.md#getChainInfo) | **GET** /staking/chains/{chainDescriptor}/chainInfo |  |
| [**getChainInfoWithHttpInfo**](StakingBetaApi.md#getChainInfoWithHttpInfo) | **GET** /staking/chains/{chainDescriptor}/chainInfo |  |
| [**getChains**](StakingBetaApi.md#getChains) | **GET** /staking/chains |  |
| [**getChainsWithHttpInfo**](StakingBetaApi.md#getChainsWithHttpInfo) | **GET** /staking/chains |  |
| [**getDelegationById**](StakingBetaApi.md#getDelegationById) | **GET** /staking/positions/{id} |  |
| [**getDelegationByIdWithHttpInfo**](StakingBetaApi.md#getDelegationByIdWithHttpInfo) | **GET** /staking/positions/{id} |  |
| [**getProviders**](StakingBetaApi.md#getProviders) | **GET** /staking/providers |  |
| [**getProvidersWithHttpInfo**](StakingBetaApi.md#getProvidersWithHttpInfo) | **GET** /staking/providers |  |
| [**getSummary**](StakingBetaApi.md#getSummary) | **GET** /staking/positions/summary |  |
| [**getSummaryWithHttpInfo**](StakingBetaApi.md#getSummaryWithHttpInfo) | **GET** /staking/positions/summary |  |
| [**getSummaryByVault**](StakingBetaApi.md#getSummaryByVault) | **GET** /staking/positions/summary/vaults |  |
| [**getSummaryByVaultWithHttpInfo**](StakingBetaApi.md#getSummaryByVaultWithHttpInfo) | **GET** /staking/positions/summary/vaults |  |



## approveTermsOfServiceByProviderId

> CompletableFuture<Object> approveTermsOfServiceByProviderId(providerId, idempotencyKey)



Approve the terms of service of the staking provider. This must be called before performing a staking action for the first time with this provider.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<Object> result = apiInstance.approveTermsOfServiceByProviderId(providerId, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#approveTermsOfServiceByProviderId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<**Object**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The terms of service have been successfully approved and is associated with 201 status code. |  -  |

## approveTermsOfServiceByProviderIdWithHttpInfo

> CompletableFuture<ApiResponse<Object>> approveTermsOfServiceByProviderId approveTermsOfServiceByProviderIdWithHttpInfo(providerId, idempotencyKey)



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
            CompletableFuture<ApiResponse<Object>> response = apiInstance.approveTermsOfServiceByProviderIdWithHttpInfo(providerId, idempotencyKey);
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

> CompletableFuture<ExecuteActionResponse> executeAction(executeActionRequest, chainDescriptor, actionId, idempotencyKey)



Perform a chain-specific staking action (e.g. stake, unstake, withdraw).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<ExecuteActionResponse> result = apiInstance.executeAction(executeActionRequest, chainDescriptor, actionId, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#executeAction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<[**ExecuteActionResponse**](ExecuteActionResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A chain-specific action has been executed successfully on vault/position and is associated with 201 status code. |  -  |

## executeActionWithHttpInfo

> CompletableFuture<ApiResponse<ExecuteActionResponse>> executeAction executeActionWithHttpInfo(executeActionRequest, chainDescriptor, actionId, idempotencyKey)



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
            CompletableFuture<ApiResponse<ExecuteActionResponse>> response = apiInstance.executeActionWithHttpInfo(executeActionRequest, chainDescriptor, actionId, idempotencyKey);
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

> CompletableFuture<List<DelegationDto>> getAllDelegations(chainDescriptor)



Return detailed information on all staking positions, including the staked amount, rewards, status and more.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<List<DelegationDto>> result = apiInstance.getAllDelegations(chainDescriptor);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getAllDelegations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<[**List&lt;DelegationDto&gt;**](DelegationDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of position data was returned successfully |  -  |

## getAllDelegationsWithHttpInfo

> CompletableFuture<ApiResponse<List<DelegationDto>>> getAllDelegations getAllDelegationsWithHttpInfo(chainDescriptor)



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
            CompletableFuture<ApiResponse<List<DelegationDto>>> response = apiInstance.getAllDelegationsWithHttpInfo(chainDescriptor);
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

> CompletableFuture<ChainInfoResponseDto> getChainInfo(chainDescriptor)



Return chain-specific, staking-related information summary (e.g. epoch details, lockup durations, estimated rewards, etc.)

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<ChainInfoResponseDto> result = apiInstance.getChainInfo(chainDescriptor);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getChainInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<[**ChainInfoResponseDto**](ChainInfoResponseDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chain specific info summary was returned successfully |  -  |

## getChainInfoWithHttpInfo

> CompletableFuture<ApiResponse<ChainInfoResponseDto>> getChainInfo getChainInfoWithHttpInfo(chainDescriptor)



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
            CompletableFuture<ApiResponse<ChainInfoResponseDto>> response = apiInstance.getChainInfoWithHttpInfo(chainDescriptor);
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

> CompletableFuture<List<String>> getChains()



Return an alphabetical list of supported chains.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<List<String>> result = apiInstance.getChains();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getChains");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<**List&lt;String&gt;**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

## getChainsWithHttpInfo

> CompletableFuture<ApiResponse<List<String>>> getChains getChainsWithHttpInfo()



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
            CompletableFuture<ApiResponse<List<String>>> response = apiInstance.getChainsWithHttpInfo();
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

> CompletableFuture<DelegationDto> getDelegationById(id)



Return detailed information on a staking position, including the staked amount, rewards, status and more.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<DelegationDto> result = apiInstance.getDelegationById(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getDelegationById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
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

CompletableFuture<[**DelegationDto**](DelegationDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Position data was returned successfully |  -  |

## getDelegationByIdWithHttpInfo

> CompletableFuture<ApiResponse<DelegationDto>> getDelegationById getDelegationByIdWithHttpInfo(id)



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
            CompletableFuture<ApiResponse<DelegationDto>> response = apiInstance.getDelegationByIdWithHttpInfo(id);
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

> CompletableFuture<List<ProviderDto>> getProviders()



Return information on all the available staking providers.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<List<ProviderDto>> result = apiInstance.getProviders();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<[**List&lt;ProviderDto&gt;**](ProviderDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of supported providers was returned successfully |  -  |

## getProvidersWithHttpInfo

> CompletableFuture<ApiResponse<List<ProviderDto>>> getProviders getProvidersWithHttpInfo()



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
            CompletableFuture<ApiResponse<List<ProviderDto>>> response = apiInstance.getProvidersWithHttpInfo();
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

> CompletableFuture<DelegationSummaryDto> getSummary()



Return a summary of all vaults, categorized by their status (active, inactive), the total amounts staked and total rewards per-chain.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<DelegationSummaryDto> result = apiInstance.getSummary();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getSummary");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<[**DelegationSummaryDto**](DelegationSummaryDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A summary for all vaults were returned successfully |  -  |

## getSummaryWithHttpInfo

> CompletableFuture<ApiResponse<DelegationSummaryDto>> getSummary getSummaryWithHttpInfo()



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
            CompletableFuture<ApiResponse<DelegationSummaryDto>> response = apiInstance.getSummaryWithHttpInfo();
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

> CompletableFuture<Map<String, DelegationSummaryDto>> getSummaryByVault()



Return a summary for each vault, categorized by their status (active, inactive), the total amounts staked and total rewards per-chain.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
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
            CompletableFuture<Map<String, DelegationSummaryDto>> result = apiInstance.getSummaryByVault();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling StakingBetaApi#getSummaryByVault");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<[**Map&lt;String, DelegationSummaryDto&gt;**](DelegationSummaryDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A summary for each vault were returned successfully |  -  |

## getSummaryByVaultWithHttpInfo

> CompletableFuture<ApiResponse<Map<String, DelegationSummaryDto>>> getSummaryByVault getSummaryByVaultWithHttpInfo()



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
            CompletableFuture<ApiResponse<Map<String, DelegationSummaryDto>>> response = apiInstance.getSummaryByVaultWithHttpInfo();
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

