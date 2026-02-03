# ContractInteractionsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**decodeContractData**](ContractInteractionsApi.md#decodeContractData) | **POST** /contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/decode | Decode a function call data, error, or event log |
| [**getContractAddress**](ContractInteractionsApi.md#getContractAddress) | **GET** /contract_interactions/base_asset_id/{baseAssetId}/tx_hash/{txHash} | Get contract address by transaction hash |
| [**getDeployedContractAbi**](ContractInteractionsApi.md#getDeployedContractAbi) | **GET** /contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions | Return deployed contract&#39;s ABI |
| [**getTransactionReceipt**](ContractInteractionsApi.md#getTransactionReceipt) | **GET** /contract_interactions/base_asset_id/{baseAssetId}/tx_hash/{txHash}/receipt | Get transaction receipt |
| [**readCallFunction**](ContractInteractionsApi.md#readCallFunction) | **POST** /contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions/read | Call a read function on a deployed contract |
| [**writeCallFunction**](ContractInteractionsApi.md#writeCallFunction) | **POST** /contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions/write | Call a write function on a deployed contract |



## decodeContractData

> CompletableFuture<ApiResponse<ContractDataDecodedResponse>> decodeContractData decodeContractData(contractDataDecodeRequest, contractAddress, baseAssetId, idempotencyKey)

Decode a function call data, error, or event log

Decode a function call data, error, or event log from a deployed contract by blockchain native asset id and contract address.

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
import com.fireblocks.sdk.api.ContractInteractionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ContractDataDecodeRequest contractDataDecodeRequest = new ContractDataDecodeRequest(); // ContractDataDecodeRequest | 
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract's onchain address
        String baseAssetId = "ETH"; // String | The blockchain native asset identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ContractDataDecodedResponse>> response = fireblocks.contractInteractions().decodeContractData(contractDataDecodeRequest, contractAddress, baseAssetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractInteractionsApi#decodeContractData");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractInteractionsApi#decodeContractData");
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
| **contractDataDecodeRequest** | [**ContractDataDecodeRequest**](ContractDataDecodeRequest.md)|  | |
| **contractAddress** | **String**| The contract&#39;s onchain address | |
| **baseAssetId** | **String**| The blockchain native asset identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ContractDataDecodedResponse**](ContractDataDecodedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Decoded data retrieved successfully |  -  |
| **400** | Bad request, invalid input data or parameters |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContractAddress

> CompletableFuture<ApiResponse<ContractAddressResponse>> getContractAddress getContractAddress(baseAssetId, txHash, idempotencyKey)

Get contract address by transaction hash

Retrieve the contract address by blockchain native asset ID and transaction hash

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
import com.fireblocks.sdk.api.ContractInteractionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String baseAssetId = "ETH_TEST3"; // String | The blockchain base assetId
        String txHash = "0x3b015ca0518c55d7bff4e3f5aa5d0431705771553ba8a95cf20e34cb597f57f6"; // String | The transaction hash
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ContractAddressResponse>> response = fireblocks.contractInteractions().getContractAddress(baseAssetId, txHash, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractInteractionsApi#getContractAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractInteractionsApi#getContractAddress");
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
| **baseAssetId** | **String**| The blockchain base assetId | |
| **txHash** | **String**| The transaction hash | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ContractAddressResponse**](ContractAddressResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved The Contract Address Successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getDeployedContractAbi

> CompletableFuture<ApiResponse<ContractAbiResponseDto>> getDeployedContractAbi getDeployedContractAbi(contractAddress, baseAssetId, idempotencyKey)

Return deployed contract&#39;s ABI

Return deployed contract&#39;s ABI by blockchain native asset id and contract address. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, and Viewer.

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
import com.fireblocks.sdk.api.ContractInteractionsApi;
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
        String baseAssetId = "ETH"; // String | The blockchain base assetId
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ContractAbiResponseDto>> response = fireblocks.contractInteractions().getDeployedContractAbi(contractAddress, baseAssetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractInteractionsApi#getDeployedContractAbi");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractInteractionsApi#getDeployedContractAbi");
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
| **baseAssetId** | **String**| The blockchain base assetId | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ContractAbiResponseDto**](ContractAbiResponseDto.md)>>


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


## getTransactionReceipt

> CompletableFuture<ApiResponse<TransactionReceiptResponse>> getTransactionReceipt getTransactionReceipt(baseAssetId, txHash)

Get transaction receipt

Retrieve the transaction receipt by blockchain native asset ID and transaction hash &gt; **Note** &gt; This functionality is exclusively available for EVM (Ethereum Virtual Machine) compatible chains.  &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, and Viewer.

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
import com.fireblocks.sdk.api.ContractInteractionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String baseAssetId = "ETH_TEST6"; // String | The blockchain base assetId
        String txHash = "0x3b015ca0518c55d7bff4e3f5aa5d0431705771553ba8a95cf20e34cb597f57f6"; // String | The transaction hash
        try {
            CompletableFuture<ApiResponse<TransactionReceiptResponse>> response = fireblocks.contractInteractions().getTransactionReceipt(baseAssetId, txHash);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractInteractionsApi#getTransactionReceipt");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractInteractionsApi#getTransactionReceipt");
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
| **baseAssetId** | **String**| The blockchain base assetId | |
| **txHash** | **String**| The transaction hash | |

### Return type

CompletableFuture<ApiResponse<[**TransactionReceiptResponse**](TransactionReceiptResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved The Transaction Receipt Successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## readCallFunction

> CompletableFuture<ApiResponse<List<ParameterWithValue>>> readCallFunction readCallFunction(readCallFunctionDto, contractAddress, baseAssetId, idempotencyKey)

Call a read function on a deployed contract

Call a read function on a deployed contract by blockchain native asset id and contract address

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
import com.fireblocks.sdk.api.ContractInteractionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ReadCallFunctionDto readCallFunctionDto = new ReadCallFunctionDto(); // ReadCallFunctionDto | 
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract's onchain address
        String baseAssetId = "baseAssetId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<List<ParameterWithValue>>> response = fireblocks.contractInteractions().readCallFunction(readCallFunctionDto, contractAddress, baseAssetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractInteractionsApi#readCallFunction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractInteractionsApi#readCallFunction");
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
| **readCallFunctionDto** | [**ReadCallFunctionDto**](ReadCallFunctionDto.md)|  | |
| **contractAddress** | **String**| The contract&#39;s onchain address | |
| **baseAssetId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;ParameterWithValue&gt;**](ParameterWithValue.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Read Call Retrieved Successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## writeCallFunction

> CompletableFuture<ApiResponse<WriteCallFunctionResponseDto>> writeCallFunction writeCallFunction(writeCallFunctionDto, contractAddress, baseAssetId, idempotencyKey)

Call a write function on a deployed contract

Call a write function on a deployed contract by blockchain native asset id and contract address. This creates an onchain transaction, thus it is an async operation. It returns a transaction id that can be polled for status check

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
import com.fireblocks.sdk.api.ContractInteractionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        WriteCallFunctionDto writeCallFunctionDto = new WriteCallFunctionDto(); // WriteCallFunctionDto | 
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract's onchain address
        String baseAssetId = "baseAssetId_example"; // String | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<WriteCallFunctionResponseDto>> response = fireblocks.contractInteractions().writeCallFunction(writeCallFunctionDto, contractAddress, baseAssetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractInteractionsApi#writeCallFunction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractInteractionsApi#writeCallFunction");
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
| **writeCallFunctionDto** | [**WriteCallFunctionDto**](WriteCallFunctionDto.md)|  | |
| **contractAddress** | **String**| The contract&#39;s onchain address | |
| **baseAssetId** | **String**|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**WriteCallFunctionResponseDto**](WriteCallFunctionResponseDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

