# DeployedContractsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addContractABI**](DeployedContractsApi.md#addContractABI) | **POST** /tokenization/contracts/abi | Save contract ABI |
| [**fetchContractAbi**](DeployedContractsApi.md#fetchContractAbi) | **POST** /tokenization/contracts/fetch_abi | Fetch the contract ABI |
| [**getDeployedContractByAddress**](DeployedContractsApi.md#getDeployedContractByAddress) | **GET** /tokenization/contracts/{assetId}/{contractAddress} | Return deployed contract data |
| [**getDeployedContractById**](DeployedContractsApi.md#getDeployedContractById) | **GET** /tokenization/contracts/{id} | Return deployed contract data by id |
| [**getDeployedContracts**](DeployedContractsApi.md#getDeployedContracts) | **GET** /tokenization/contracts | List deployed contracts data |



## addContractABI

> CompletableFuture<ApiResponse<ContractWithAbiDto>> addContractABI addContractABI(addAbiRequestDto, idempotencyKey)

Save contract ABI

Save contract ABI for the tenant

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
import com.fireblocks.sdk.api.DeployedContractsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        AddAbiRequestDto addAbiRequestDto = new AddAbiRequestDto(); // AddAbiRequestDto | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ContractWithAbiDto>> response = fireblocks.deployedContracts().addContractABI(addAbiRequestDto, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DeployedContractsApi#addContractABI");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployedContractsApi#addContractABI");
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
| **addAbiRequestDto** | [**AddAbiRequestDto**](AddAbiRequestDto.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ContractWithAbiDto**](ContractWithAbiDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract ABI created (or updated) for the tenant |  -  |
| **409** | Contract ABI already exists. |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## fetchContractAbi

> CompletableFuture<ApiResponse<ContractWithAbiDto>> fetchContractAbi fetchContractAbi(fetchAbiRequestDto, idempotencyKey)

Fetch the contract ABI

Fetch the ABI. If not found fetch the ABI from the block explorer

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
import com.fireblocks.sdk.api.DeployedContractsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        FetchAbiRequestDto fetchAbiRequestDto = new FetchAbiRequestDto(); // FetchAbiRequestDto | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ContractWithAbiDto>> response = fireblocks.deployedContracts().fetchContractAbi(fetchAbiRequestDto, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DeployedContractsApi#fetchContractAbi");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployedContractsApi#fetchContractAbi");
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
| **fetchAbiRequestDto** | [**FetchAbiRequestDto**](FetchAbiRequestDto.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ContractWithAbiDto**](ContractWithAbiDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract ABI found. |  -  |
| **404** | Contract ABI not found |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getDeployedContractByAddress

> CompletableFuture<ApiResponse<DeployedContractResponseDto>> getDeployedContractByAddress getDeployedContractByAddress(contractAddress, assetId)

Return deployed contract data

Return deployed contract data by blockchain native asset id and contract address

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
import com.fireblocks.sdk.api.DeployedContractsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract's onchain address
        String assetId = "assetId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<DeployedContractResponseDto>> response = fireblocks.deployedContracts().getDeployedContractByAddress(contractAddress, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DeployedContractsApi#getDeployedContractByAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployedContractsApi#getDeployedContractByAddress");
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
| **contractAddress** | **String**| The contract&#39;s onchain address | |
| **assetId** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**DeployedContractResponseDto**](DeployedContractResponseDto.md)>>


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


## getDeployedContractById

> CompletableFuture<ApiResponse<DeployedContractResponseDto>> getDeployedContractById getDeployedContractById(id)

Return deployed contract data by id

Return deployed contract data by id

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
import com.fireblocks.sdk.api.DeployedContractsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "b70701f4-d7b1-4795-a8ee-b09cdb5b850d"; // String | The deployed contract data identifier
        try {
            CompletableFuture<ApiResponse<DeployedContractResponseDto>> response = fireblocks.deployedContracts().getDeployedContractById(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DeployedContractsApi#getDeployedContractById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployedContractsApi#getDeployedContractById");
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
| **id** | **String**| The deployed contract data identifier | |

### Return type

CompletableFuture<ApiResponse<[**DeployedContractResponseDto**](DeployedContractResponseDto.md)>>


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


## getDeployedContracts

> CompletableFuture<ApiResponse<DeployedContractsPaginatedResponse>> getDeployedContracts getDeployedContracts(pageCursor, pageSize, contractAddress, baseAssetId, templateId)

List deployed contracts data

Return a filtered lean representation of the deployed contracts data on all blockchains (paginated)

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
import com.fireblocks.sdk.api.DeployedContractsApi;
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
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract's onchain address
        String baseAssetId = "baseAssetId_example"; // String | 
        String templateId = "templateId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<DeployedContractsPaginatedResponse>> response = fireblocks.deployedContracts().getDeployedContracts(pageCursor, pageSize, contractAddress, baseAssetId, templateId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling DeployedContractsApi#getDeployedContracts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployedContractsApi#getDeployedContracts");
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
| **contractAddress** | **String**| The contract&#39;s onchain address | [optional] |
| **baseAssetId** | **String**|  | [optional] |
| **templateId** | **String**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**DeployedContractsPaginatedResponse**](DeployedContractsPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deployed contracts fetched successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

