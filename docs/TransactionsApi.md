# TransactionsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelTransaction**](TransactionsApi.md#cancelTransaction) | **POST** /transactions/{txId}/cancel | Cancel a transaction |
| [**createTransaction**](TransactionsApi.md#createTransaction) | **POST** /transactions | Create a new transaction |
| [**dropTransaction**](TransactionsApi.md#dropTransaction) | **POST** /transactions/{txId}/drop | Drop ETH transaction by ID |
| [**estimateNetworkFee**](TransactionsApi.md#estimateNetworkFee) | **GET** /estimate_network_fee | Estimate the required fee for an asset |
| [**estimateTransactionFee**](TransactionsApi.md#estimateTransactionFee) | **POST** /transactions/estimate_fee | Estimate transaction fee |
| [**freezeTransaction**](TransactionsApi.md#freezeTransaction) | **POST** /transactions/{txId}/freeze | Freeze a transaction |
| [**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /transactions/{txId} | Find a specific transaction by Fireblocks transaction ID |
| [**getTransactionByExternalId**](TransactionsApi.md#getTransactionByExternalId) | **GET** /transactions/external_tx_id/{externalTxId} | Find a specific transaction by external transaction ID |
| [**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /transactions | List transaction history |
| [**rescanTransactionsBeta**](TransactionsApi.md#rescanTransactionsBeta) | **POST** /transactions/rescan | rescan array of transactions |
| [**setConfirmationThresholdByTransactionHash**](TransactionsApi.md#setConfirmationThresholdByTransactionHash) | **POST** /txHash/{txHash}/set_confirmation_threshold | Set confirmation threshold by transaction hash |
| [**setTransactionConfirmationThreshold**](TransactionsApi.md#setTransactionConfirmationThreshold) | **POST** /transactions/{txId}/set_confirmation_threshold | Set confirmation threshold by transaction ID |
| [**unfreezeTransaction**](TransactionsApi.md#unfreezeTransaction) | **POST** /transactions/{txId}/unfreeze | Unfreeze a transaction |
| [**validateAddress**](TransactionsApi.md#validateAddress) | **GET** /transactions/validate_address/{assetId}/{address} | Validate destination address |



## cancelTransaction

> CompletableFuture<ApiResponse<CancelTransactionResponse>> cancelTransaction cancelTransaction(txId, xEndUserWalletId, idempotencyKey)

Cancel a transaction

Cancels a transaction by ID.

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

Creates a new transaction.

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

Drop ETH transaction by ID

Drops a stuck ETH transaction and creates a replacement transaction.

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

Gets the estimated required fee for an asset. For UTXO based assets, the response will contain the suggested fee per byte, for ETH/ETC based assets, the suggested gas price, and for XRP/XLM, the transaction fee.

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

Estimates the transaction fee for a transaction request. * Note: Supports all Fireblocks assets except ZCash (ZEC).

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

Freezes a transaction by ID.

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

Find a specific transaction by Fireblocks transaction ID

Returns a transaction by ID.

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

Find a specific transaction by external transaction ID

Returns transaction by external transaction ID.

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

> CompletableFuture<ApiResponse<List<TransactionResponse>>> getTransactions getTransactions(before, after, status, orderBy, sort, limit, sourceType, sourceId, destType, destId, assets, txHash, sourceWalletId, destWalletId)

List transaction history

Lists the transaction history for your workspace.

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

        String before = "before_example"; // String | Unix timestamp in milliseconds. Returns only transactions created before the specified date
        String after = "after_example"; // String | Unix timestamp in milliseconds. Returns only transactions created after the specified date
        String status = "status_example"; // String | You can filter by one of the statuses.
        String orderBy = "createdAt"; // String | The field to order the results by  **Note**: Ordering by a field that is not createdAt may result with transactions that receive updates as you request the next or previous pages of results, resulting with missing those transactions.
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
            CompletableFuture<ApiResponse<List<TransactionResponse>>> response = fireblocks.transactions().getTransactions(before, after, status, orderBy, sort, limit, sourceType, sourceId, destType, destId, assets, txHash, sourceWalletId, destWalletId);
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
| **before** | **String**| Unix timestamp in milliseconds. Returns only transactions created before the specified date | [optional] |
| **after** | **String**| Unix timestamp in milliseconds. Returns only transactions created after the specified date | [optional] |
| **status** | **String**| You can filter by one of the statuses. | [optional] |
| **orderBy** | **String**| The field to order the results by  **Note**: Ordering by a field that is not createdAt may result with transactions that receive updates as you request the next or previous pages of results, resulting with missing those transactions. | [optional] [enum: createdAt, lastUpdated] |
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


## rescanTransactionsBeta

> CompletableFuture<ApiResponse<List<ValidatedTransactionsForRescan>>> rescanTransactionsBeta rescanTransactionsBeta(rescanTransaction, idempotencyKey)

rescan array of transactions

rescan transaction by running an async job. &lt;/br&gt; **Note**: - These endpoints are currently in beta and might be subject to changes. - We limit the amount of the transaction to 16 per request. 

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

        List<RescanTransaction> rescanTransaction = Arrays.asList(); // List<RescanTransaction> | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<List<ValidatedTransactionsForRescan>>> response = fireblocks.transactions().rescanTransactionsBeta(rescanTransaction, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TransactionsApi#rescanTransactionsBeta");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#rescanTransactionsBeta");
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
| **rescanTransaction** | [**List&lt;RescanTransaction&gt;**](RescanTransaction.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;ValidatedTransactionsForRescan&gt;**](ValidatedTransactionsForRescan.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A array of validated transactions that were sent to rescan |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setConfirmationThresholdByTransactionHash

> CompletableFuture<ApiResponse<SetConfirmationsThresholdResponse>> setConfirmationThresholdByTransactionHash setConfirmationThresholdByTransactionHash(txHash, setConfirmationsThresholdRequest, idempotencyKey)

Set confirmation threshold by transaction hash

Overrides the required number of confirmations for transaction completion by transaction hash.

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

Set confirmation threshold by transaction ID

Overrides the required number of confirmations for transaction completion by transaction ID.

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

Unfreezes a transaction by ID and makes the transaction available again.

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

Checks if an address is valid (for XRP, DOT, XLM, and EOS).

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

