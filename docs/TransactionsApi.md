# TransactionsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelTransaction**](TransactionsApi.md#cancelTransaction) | **POST** /transactions/{txId}/cancel | Cancel a transaction |
| [**createTransaction**](TransactionsApi.md#createTransaction) | **POST** /transactions | Create a new transaction |
| [**dropTransaction**](TransactionsApi.md#dropTransaction) | **POST** /transactions/{txId}/drop | Drop ETH (EVM) transaction by ID |
| [**estimateNetworkFee**](TransactionsApi.md#estimateNetworkFee) | **GET** /estimate_network_fee | Estimate the required fee for an asset |
| [**estimateTransactionFee**](TransactionsApi.md#estimateTransactionFee) | **POST** /transactions/estimate_fee | Estimate transaction fee |
| [**freezeTransaction**](TransactionsApi.md#freezeTransaction) | **POST** /transactions/{txId}/freeze | Freeze a transaction |
| [**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /transactions/{txId} | Get a specific transaction by Fireblocks transaction ID |
| [**getTransactionByExternalId**](TransactionsApi.md#getTransactionByExternalId) | **GET** /transactions/external_tx_id/{externalTxId} | Get a specific transaction by external transaction ID |
| [**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /transactions | Get transaction history |
| [**setConfirmationThresholdByTransactionHash**](TransactionsApi.md#setConfirmationThresholdByTransactionHash) | **POST** /txHash/{txHash}/set_confirmation_threshold | Set confirmation threshold by transaction hash |
| [**setTransactionConfirmationThreshold**](TransactionsApi.md#setTransactionConfirmationThreshold) | **POST** /transactions/{txId}/set_confirmation_threshold | Set confirmation threshold by Fireblocks Transaction ID |
| [**unfreezeTransaction**](TransactionsApi.md#unfreezeTransaction) | **POST** /transactions/{txId}/unfreeze | Unfreeze a transaction |
| [**validateAddress**](TransactionsApi.md#validateAddress) | **GET** /transactions/validate_address/{assetId}/{address} | Validate destination address |



## cancelTransaction

> CompletableFuture<ApiResponse<CancelTransactionResponse>> cancelTransaction cancelTransaction(txId, xEndUserWalletId, idempotencyKey)

Cancel a transaction

Cancels a transaction by Fireblocks Transaction ID.  Can be used only for transactions that did not get to the BROADCASTING state. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "txId_example"; // String | The ID of the transaction to cancel
        UUID xEndUserWalletId = UUID.randomUUID(); // UUID | Unique ID of the End-User wallet to the API request. Required for end-user wallet operations.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CancelTransactionResponse>> response = fireblocks.transactions().cancelTransaction(txId, xEndUserWalletId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#cancelTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#cancelTransaction");
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
| **txId** | **String**| The ID of the transaction to cancel | |
| **xEndUserWalletId** | **UUID**| Unique ID of the End-User wallet to the API request. Required for end-user wallet operations. | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CancelTransactionResponse**](CancelTransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createTransaction

> CompletableFuture<ApiResponse<CreateTransactionResponse>> createTransaction createTransaction(transactionRequest, xEndUserWalletId, idempotencyKey)

Create a new transaction

Creates a new transaction. This endpoint can be used for regular Transfers, Contract Calls, Raw &amp; Typed message signing. - For Transfers, the required parameters are: &#x60;assetId&#x60;, &#x60;source&#x60;, &#x60;destination&#x60; and &#x60;amount&#x60;. - For Contract Calls, the required parameters are: &#x60;operation.CONTRACT_CALL&#x60;, &#x60;assetId&#x60; (Base Asset), &#x60;source&#x60;,

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TransactionRequest transactionRequest = new TransactionRequest(); // TransactionRequest | 
        UUID xEndUserWalletId = UUID.randomUUID(); // UUID | Unique ID of the End-User wallet to the API request. Required for end-user wallet operations.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateTransactionResponse>> response = fireblocks.transactions().createTransaction(transactionRequest, xEndUserWalletId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#createTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#createTransaction");
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
| **transactionRequest** | [**TransactionRequest**](TransactionRequest.md)|  | [optional] |
| **xEndUserWalletId** | **UUID**| Unique ID of the End-User wallet to the API request. Required for end-user wallet operations. | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateTransactionResponse**](CreateTransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## dropTransaction

> CompletableFuture<ApiResponse<DropTransactionResponse>> dropTransaction dropTransaction(txId, dropTransactionRequest, xEndUserWalletId, idempotencyKey)

Drop ETH (EVM) transaction by ID

Drops a stuck ETH (EVM) transaction and creates a replacement transaction with 0 amount. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "txId_example"; // String | The ID of the transaction
        DropTransactionRequest dropTransactionRequest = new DropTransactionRequest(); // DropTransactionRequest | 
        UUID xEndUserWalletId = UUID.randomUUID(); // UUID | Unique ID of the End-User wallet to the API request. Required for end-user wallet operations.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<DropTransactionResponse>> response = fireblocks.transactions().dropTransaction(txId, dropTransactionRequest, xEndUserWalletId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#dropTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#dropTransaction");
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
| **txId** | **String**| The ID of the transaction | |
| **dropTransactionRequest** | [**DropTransactionRequest**](DropTransactionRequest.md)|  | [optional] |
| **xEndUserWalletId** | **UUID**| Unique ID of the End-User wallet to the API request. Required for end-user wallet operations. | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**DropTransactionResponse**](DropTransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Operation completed successfully |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## estimateNetworkFee

> CompletableFuture<ApiResponse<EstimatedNetworkFeeResponse>> estimateNetworkFee estimateNetworkFee(assetId)

Estimate the required fee for an asset

Gets the estimated required fee for an asset. Fireblocks fetches, calculates and caches the result every 30 seconds. Customers should query this API while taking the caching interval into consideration. Notes: - The &#x60;networkFee&#x60; parameter is the &#x60;gasPrice&#x60; with a given delta added, multiplied by the gasLimit plus the delta. - The estimation provided depends on the asset type.     - For UTXO-based assets, the response contains the &#x60;feePerByte&#x60; parameter     - For ETH-based and all EVM based assets, the response will contain &#x60;gasPrice&#x60; parameter. This is calculated by adding the &#x60;baseFee&#x60; to the &#x60;actualPriority&#x60; based on the latest 12 blocks. The response for ETH-based  contains the &#x60;baseFee&#x60;, &#x60;gasPrice&#x60;, and &#x60;priorityFee&#x60; parameters.     - For ADA-based assets, the response will contain the parameter &#x60;networkFee&#x60; and &#x60;feePerByte&#x60; parameters.     - For XRP and XLM, the response will contain the transaction fee.     - For other assets, the response will contain the &#x60;networkFee&#x60; parameter.  Learn more about Fireblocks Fee Management in the following [guide](https://developers.fireblocks.com/reference/estimate-transaction-fee). &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String assetId = "assetId_example"; // String | The asset for which to estimate the fee
        try {
            CompletableFuture<ApiResponse<EstimatedNetworkFeeResponse>> response = fireblocks.transactions().estimateNetworkFee(assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#estimateNetworkFee");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#estimateNetworkFee");
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
| **assetId** | **String**| The asset for which to estimate the fee | |

### Return type

CompletableFuture<ApiResponse<[**EstimatedNetworkFeeResponse**](EstimatedNetworkFeeResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimated fees response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## estimateTransactionFee

> CompletableFuture<ApiResponse<EstimatedTransactionFeeResponse>> estimateTransactionFee estimateTransactionFee(transactionRequest, idempotencyKey)

Estimate transaction fee

Estimates the transaction fee for a specific transaction request. This endpoint simulates a transaction which means that the system will expect to have the requested asset and balance in the specified wallet.   **Note**: Supports all Fireblocks assets except ZCash (ZEC). Learn more about Fireblocks Fee Management in the following [guide](https://developers.fireblocks.com/reference/estimate-transaction-fee). &lt;/br&gt;Endpoint Permission: Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TransactionRequest transactionRequest = new TransactionRequest(); // TransactionRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<EstimatedTransactionFeeResponse>> response = fireblocks.transactions().estimateTransactionFee(transactionRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#estimateTransactionFee");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#estimateTransactionFee");
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
| **transactionRequest** | [**TransactionRequest**](TransactionRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**EstimatedTransactionFeeResponse**](EstimatedTransactionFeeResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimated fees response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## freezeTransaction

> CompletableFuture<ApiResponse<FreezeTransactionResponse>> freezeTransaction freezeTransaction(txId, xEndUserWalletId, idempotencyKey)

Freeze a transaction

Freezes a transaction by ID.  Usually used for AML integrations when the incoming funds should be quarantined. For account based assets - the entire amount of the transaction is frozen  For UTXO based assets - all UTXOs of the specified transaction are frozen &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "txId_example"; // String | The ID of the transaction to freeze
        UUID xEndUserWalletId = UUID.randomUUID(); // UUID | Unique ID of the End-User wallet to the API request. Required for end-user wallet operations.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<FreezeTransactionResponse>> response = fireblocks.transactions().freezeTransaction(txId, xEndUserWalletId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#freezeTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#freezeTransaction");
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
| **txId** | **String**| The ID of the transaction to freeze | |
| **xEndUserWalletId** | **UUID**| Unique ID of the End-User wallet to the API request. Required for end-user wallet operations. | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**FreezeTransactionResponse**](FreezeTransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | freeze response |  * X-Request-ID -  <br>  |


## getTransaction

> CompletableFuture<ApiResponse<TransactionResponse>> getTransaction getTransaction(txId)

Get a specific transaction by Fireblocks transaction ID

Get a specific transaction data by Fireblocks Transaction ID &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "00000000-0000-0000-0000-000000000000"; // String | The ID of the transaction to return
        try {
            CompletableFuture<ApiResponse<TransactionResponse>> response = fireblocks.transactions().getTransaction(txId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#getTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransaction");
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
| **txId** | **String**| The ID of the transaction to return | |

### Return type

CompletableFuture<ApiResponse<[**TransactionResponse**](TransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Transaction object |  * X-Request-ID -  <br>  |
| **400** | Error Response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTransactionByExternalId

> CompletableFuture<ApiResponse<TransactionResponse>> getTransactionByExternalId getTransactionByExternalId(externalTxId)

Get a specific transaction by external transaction ID

Returns transaction by external transaction ID. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String externalTxId = "00000000-0000-0000-0000-000000000000"; // String | The external ID of the transaction to return
        try {
            CompletableFuture<ApiResponse<TransactionResponse>> response = fireblocks.transactions().getTransactionByExternalId(externalTxId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#getTransactionByExternalId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransactionByExternalId");
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
| **externalTxId** | **String**| The external ID of the transaction to return | |

### Return type

CompletableFuture<ApiResponse<[**TransactionResponse**](TransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTransactions

> CompletableFuture<ApiResponse<List<TransactionResponse>>> getTransactions getTransactions(next, prev, before, after, status, orderBy, sort, limit, sourceType, sourceId, destType, destId, assets, txHash, sourceWalletId, destWalletId)

Get transaction history

Get the transaction history for your workspace.  **Endpoint Permissions:** Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer. 

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String next = "next_example"; // String | Cursor returned in next-page header that can be used to fetch the next page of results
        String prev = "prev_example"; // String | Cursor returned in prev-page header that can be used to fetch the previous page of results
        String before = "before_example"; // String | Unix timestamp in milliseconds. Returns only transactions created before the specified date. Provides an explicit end time. If not provided, default value will be applied, and may change over time.  The current default value is the past 90 days. 
        String after = "after_example"; // String | Unix timestamp in milliseconds. Returns only transactions created after the specified date. Provides an explicit start time. If not provided, default value will be applied, and may change over time.  The current default value is the past 90 days. 
        String status = "status_example"; // String | You can filter by one of the statuses.
        String orderBy = "createdAt"; // String | The field to order the results by.  **Note:** Ordering by a field that is not `createdAt` may result in transactions that receive updates as you request the next or previous pages of results, resulting in missing those transactions. 
        String sort = "ASC"; // String | The direction to order the results by
        Integer limit = 200; // Integer | Limits the number of results. If not provided, a limit of 200 will be used. The maximum allowed limit is 500
        String sourceType = "VAULT_ACCOUNT"; // String | The source type of the transaction
        String sourceId = "sourceId_example"; // String | The source ID of the transaction
        String destType = "VAULT_ACCOUNT"; // String | The destination type of the transaction
        String destId = "destId_example"; // String | The destination ID of the transaction
        String assets = "assets_example"; // String | A list of assets to filter by, seperated by commas
        String txHash = "txHash_example"; // String | Returns only results with a specified txHash
        String sourceWalletId = "sourceWalletId_example"; // String | Returns only results where the source is a specific end user wallet
        String destWalletId = "destWalletId_example"; // String | Returns only results where the destination is a specific end user wallet
        try {
            CompletableFuture<ApiResponse<List<TransactionResponse>>> response = fireblocks.transactions().getTransactions(next, prev, before, after, status, orderBy, sort, limit, sourceType, sourceId, destType, destId, assets, txHash, sourceWalletId, destWalletId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#getTransactions");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransactions");
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
| **next** | **String**| Cursor returned in next-page header that can be used to fetch the next page of results | [optional] |
| **prev** | **String**| Cursor returned in prev-page header that can be used to fetch the previous page of results | [optional] |
| **before** | **String**| Unix timestamp in milliseconds. Returns only transactions created before the specified date. Provides an explicit end time. If not provided, default value will be applied, and may change over time.  The current default value is the past 90 days.  | [optional] |
| **after** | **String**| Unix timestamp in milliseconds. Returns only transactions created after the specified date. Provides an explicit start time. If not provided, default value will be applied, and may change over time.  The current default value is the past 90 days.  | [optional] |
| **status** | **String**| You can filter by one of the statuses. | [optional] |
| **orderBy** | **String**| The field to order the results by.  **Note:** Ordering by a field that is not &#x60;createdAt&#x60; may result in transactions that receive updates as you request the next or previous pages of results, resulting in missing those transactions.  | [optional] [enum: createdAt, lastUpdated] |
| **sort** | **String**| The direction to order the results by | [optional] [enum: ASC, DESC] |
| **limit** | **Integer**| Limits the number of results. If not provided, a limit of 200 will be used. The maximum allowed limit is 500 | [optional] [default to 200] |
| **sourceType** | **String**| The source type of the transaction | [optional] [enum: VAULT_ACCOUNT, EXCHANGE_ACCOUNT, INTERNAL_WALLET, EXTERNAL_WALLET, CONTRACT, FIAT_ACCOUNT, NETWORK_CONNECTION, COMPOUND, UNKNOWN, GAS_STATION, END_USER_WALLET] |
| **sourceId** | **String**| The source ID of the transaction | [optional] |
| **destType** | **String**| The destination type of the transaction | [optional] [enum: VAULT_ACCOUNT, EXCHANGE_ACCOUNT, INTERNAL_WALLET, EXTERNAL_WALLET, CONTRACT, FIAT_ACCOUNT, NETWORK_CONNECTION, COMPOUND, ONE_TIME_ADDRESS, END_USER_WALLET] |
| **destId** | **String**| The destination ID of the transaction | [optional] |
| **assets** | **String**| A list of assets to filter by, seperated by commas | [optional] |
| **txHash** | **String**| Returns only results with a specified txHash | [optional] |
| **sourceWalletId** | **String**| Returns only results where the source is a specific end user wallet | [optional] |
| **destWalletId** | **String**| Returns only results where the destination is a specific end user wallet | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;TransactionResponse&gt;**](TransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of transactions |  * X-Request-ID -  <br>  * next-page -  <br>  * prev-page -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setConfirmationThresholdByTransactionHash

> CompletableFuture<ApiResponse<SetConfirmationsThresholdResponse>> setConfirmationThresholdByTransactionHash setConfirmationThresholdByTransactionHash(txHash, setConfirmationsThresholdRequest, idempotencyKey)

Set confirmation threshold by transaction hash

Overrides the required number of confirmations for transaction completion by transaction hash. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txHash = "txHash_example"; // String | The TxHash
        SetConfirmationsThresholdRequest setConfirmationsThresholdRequest = new SetConfirmationsThresholdRequest(); // SetConfirmationsThresholdRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SetConfirmationsThresholdResponse>> response = fireblocks.transactions().setConfirmationThresholdByTransactionHash(txHash, setConfirmationsThresholdRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#setConfirmationThresholdByTransactionHash");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#setConfirmationThresholdByTransactionHash");
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
| **txHash** | **String**| The TxHash | |
| **setConfirmationsThresholdRequest** | [**SetConfirmationsThresholdRequest**](SetConfirmationsThresholdRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SetConfirmationsThresholdResponse**](SetConfirmationsThresholdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of transactions affected by the change |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setTransactionConfirmationThreshold

> CompletableFuture<ApiResponse<SetConfirmationsThresholdResponse>> setTransactionConfirmationThreshold setTransactionConfirmationThreshold(txId, setConfirmationsThresholdRequest, idempotencyKey)

Set confirmation threshold by Fireblocks Transaction ID

Overrides the required number of confirmations for transaction completion Fireblocks Transaction ID. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "txId_example"; // String | The ID of the transaction
        SetConfirmationsThresholdRequest setConfirmationsThresholdRequest = new SetConfirmationsThresholdRequest(); // SetConfirmationsThresholdRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SetConfirmationsThresholdResponse>> response = fireblocks.transactions().setTransactionConfirmationThreshold(txId, setConfirmationsThresholdRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#setTransactionConfirmationThreshold");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#setTransactionConfirmationThreshold");
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
| **txId** | **String**| The ID of the transaction | |
| **setConfirmationsThresholdRequest** | [**SetConfirmationsThresholdRequest**](SetConfirmationsThresholdRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SetConfirmationsThresholdResponse**](SetConfirmationsThresholdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set successfully |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## unfreezeTransaction

> CompletableFuture<ApiResponse<UnfreezeTransactionResponse>> unfreezeTransaction unfreezeTransaction(txId, xEndUserWalletId, idempotencyKey)

Unfreeze a transaction

Unfreezes a transaction by Fireblocks Transaction ID and makes the transaction available again. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "txId_example"; // String | The ID of the transaction to unfreeze
        UUID xEndUserWalletId = UUID.randomUUID(); // UUID | Unique ID of the End-User wallet to the API request. Required for end-user wallet operations.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UnfreezeTransactionResponse>> response = fireblocks.transactions().unfreezeTransaction(txId, xEndUserWalletId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#unfreezeTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#unfreezeTransaction");
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
| **txId** | **String**| The ID of the transaction to unfreeze | |
| **xEndUserWalletId** | **UUID**| Unique ID of the End-User wallet to the API request. Required for end-user wallet operations. | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**UnfreezeTransactionResponse**](UnfreezeTransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unfreeze response |  * X-Request-ID -  <br>  |


## validateAddress

> CompletableFuture<ApiResponse<ValidateAddressResponse>> validateAddress validateAddress(assetId, address)

Validate destination address

Checks if an address is valid and active (for XRP, DOT, XLM, and EOS). &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.TransactionsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String assetId = "assetId_example"; // String | The asset of the address
        String address = "address_example"; // String | The address to validate
        try {
            CompletableFuture<ApiResponse<ValidateAddressResponse>> response = fireblocks.transactions().validateAddress(assetId, address);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#validateAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#validateAddress");
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
| **assetId** | **String**| The asset of the address | |
| **address** | **String**| The address to validate | |

### Return type

CompletableFuture<ApiResponse<[**ValidateAddressResponse**](ValidateAddressResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

