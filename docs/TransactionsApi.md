# TransactionsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelTransaction**](TransactionsApi.md#cancelTransaction) | **POST** /transactions/{txId}/cancel | Cancel a transaction |
| [**createTransaction**](TransactionsApi.md#createTransaction) | **POST** /transactions | Create a new transaction |
| [**dropTransaction**](TransactionsApi.md#dropTransaction) | **POST** /transactions/{txId}/drop | Drop ETH transaction by ID |
| [**estimateNetworkFee**](TransactionsApi.md#estimateNetworkFee) | **GET** /estimate_network_fee | Estimate the required fee for an asset |
| [**estimateTransactionFee**](TransactionsApi.md#estimateTransactionFee) | **POST** /transactions/estimate_fee | Estimate transaction fee |
| [**freezeTransaction**](TransactionsApi.md#freezeTransaction) | **POST** /transactions/{txId}/freeze | Freeze a transaction |
| [**getTransactionByExternalId**](TransactionsApi.md#getTransactionByExternalId) | **GET** /transactions/external_tx_id/{externalTxId}/ | Find a specific transaction by external transaction ID |
| [**getTransactionById**](TransactionsApi.md#getTransactionById) | **GET** /transactions/{txId} | Find a specific transaction by Fireblocks transaction ID |
| [**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /transactions | List transaction history |
| [**setConfirmationThresholdForTransaction**](TransactionsApi.md#setConfirmationThresholdForTransaction) | **POST** /transactions/{txId}/set_confirmation_threshold | Set confirmation threshold by transaction ID |
| [**setConfirmationThresholdForTransactionByHash**](TransactionsApi.md#setConfirmationThresholdForTransactionByHash) | **POST** /txHash/{txHash}/set_confirmation_threshold | Set confirmation threshold by transaction hash |
| [**unfreezeTransaction**](TransactionsApi.md#unfreezeTransaction) | **POST** /transactions/{txId}/unfreeze | Unfreeze a transaction |
| [**validateAddress**](TransactionsApi.md#validateAddress) | **GET** /transactions/validate_address/{assetId}/{address} | Validate destination address |



## cancelTransaction

> CancelTransactionResponse cancelTransaction(txId)

Cancel a transaction

Cancels a transaction by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String txId = "txId_example"; // String | The ID of the transaction to cancel
        try {
            CancelTransactionResponse result = apiInstance.cancelTransaction(txId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#cancelTransaction");
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
| **txId** | **String**| The ID of the transaction to cancel | |

### Return type

[**CancelTransactionResponse**](CancelTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createTransaction

> CreateTransactionResponse createTransaction(transactionRequest)

Create a new transaction

Creates a new transaction.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        TransactionRequest transactionRequest = new TransactionRequest(); // TransactionRequest | 
        try {
            CreateTransactionResponse result = apiInstance.createTransaction(transactionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#createTransaction");
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
| **transactionRequest** | [**TransactionRequest**](TransactionRequest.md)|  | [optional] |

### Return type

[**CreateTransactionResponse**](CreateTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## dropTransaction

> DropTransactionResponse dropTransaction(txId, dropTransactionRequest)

Drop ETH transaction by ID

Drops a stuck ETH transaction and creates a replacement transaction.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String txId = "txId_example"; // String | The ID of the transaction
        DropTransactionRequest dropTransactionRequest = new DropTransactionRequest(); // DropTransactionRequest | 
        try {
            DropTransactionResponse result = apiInstance.dropTransaction(txId, dropTransactionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#dropTransaction");
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
| **txId** | **String**| The ID of the transaction | |
| **dropTransactionRequest** | [**DropTransactionRequest**](DropTransactionRequest.md)|  | [optional] |

### Return type

[**DropTransactionResponse**](DropTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created successfully |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## estimateNetworkFee

> EstimatedNetworkFeeResponse estimateNetworkFee(assetId)

Estimate the required fee for an asset

Gets the estimated required fee for an asset. For UTXO based assets, the response will contain the suggested fee per byte, for ETH/ETC based assets, the suggested gas price, and for XRP/XLM, the transaction fee.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String assetId = "assetId_example"; // String | The asset for which to estimate the fee
        try {
            EstimatedNetworkFeeResponse result = apiInstance.estimateNetworkFee(assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#estimateNetworkFee");
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
| **assetId** | **String**| The asset for which to estimate the fee | |

### Return type

[**EstimatedNetworkFeeResponse**](EstimatedNetworkFeeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimated fees response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## estimateTransactionFee

> EstimatedTransactionFeeResponse estimateTransactionFee(transactionRequest)

Estimate transaction fee

Estimates the transaction fee for a transaction request.
* Note: Supports all Fireblocks assets except ZCash (ZEC).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        TransactionRequest transactionRequest = new TransactionRequest(); // TransactionRequest | 
        try {
            EstimatedTransactionFeeResponse result = apiInstance.estimateTransactionFee(transactionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#estimateTransactionFee");
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
| **transactionRequest** | [**TransactionRequest**](TransactionRequest.md)|  | [optional] |

### Return type

[**EstimatedTransactionFeeResponse**](EstimatedTransactionFeeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimated fees response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## freezeTransaction

> FreezeTransactionResponse freezeTransaction(txId)

Freeze a transaction

Freezes a transaction by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String txId = "txId_example"; // String | The ID of the transaction to freeze
        try {
            FreezeTransactionResponse result = apiInstance.freezeTransaction(txId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#freezeTransaction");
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
| **txId** | **String**| The ID of the transaction to freeze | |

### Return type

[**FreezeTransactionResponse**](FreezeTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | freeze response |  * X-Request-ID -  <br>  |


## getTransactionByExternalId

> TransactionResponse getTransactionByExternalId(externalTxId)

Find a specific transaction by external transaction ID

Returns transaction by external transaction ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String externalTxId = "00000000-0000-0000-0000-000000000000"; // String | The external ID of the transaction to return
        try {
            TransactionResponse result = apiInstance.getTransactionByExternalId(externalTxId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransactionByExternalId");
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
| **externalTxId** | **String**| The external ID of the transaction to return | |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTransactionById

> TransactionResponse getTransactionById(txId)

Find a specific transaction by Fireblocks transaction ID

Returns a transaction by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String txId = "00000000-0000-0000-0000-000000000000"; // String | The ID of the transaction to return
        try {
            TransactionResponse result = apiInstance.getTransactionById(txId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransactionById");
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
| **txId** | **String**| The ID of the transaction to return | |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Transaction object |  * X-Request-ID -  <br>  |
| **400** | Error Response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getTransactions

> List&lt;TransactionResponse&gt; getTransactions(before, after, status, orderBy, sort, limit, sourceType, sourceId, destType, destId, assets, txHash, sourceWalletId, destWalletId)

List transaction history

Lists the transaction history for your workspace.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
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
            List<TransactionResponse> result = apiInstance.getTransactions(before, after, status, orderBy, sort, limit, sourceType, sourceId, destType, destId, assets, txHash, sourceWalletId, destWalletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransactions");
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
| **before** | **String**| Unix timestamp in milliseconds. Returns only transactions created before the specified date | [optional] |
| **after** | **String**| Unix timestamp in milliseconds. Returns only transactions created after the specified date | [optional] |
| **status** | **String**| You can filter by one of the statuses. | [optional] |
| **orderBy** | **String**| The field to order the results by  **Note**: Ordering by a field that is not createdAt may result with transactions that receive updates as you request the next or previous pages of results, resulting with missing those transactions. | [optional] [enum: createdAt, lastUpdated] |
| **sort** | **String**| The direction to order the results by | [optional] [enum: ASC, DESC] |
| **limit** | **Integer**| Limits the number of results. If not provided, a limit of 200 will be used. The maximum allowed limit is 500 | [optional] [default to 200] |
| **sourceType** | **String**| The source type of the transaction | [optional] [enum: VAULT_ACCOUNT, EXCHANGE_ACCOUNT, INTERNAL_WALLET, EXTERNAL_WALLET, FIAT_ACCOUNT, NETWORK_CONNECTION, COMPOUND, UNKNOWN, GAS_STATION, END_USER_WALLET] |
| **sourceId** | **String**| The source ID of the transaction | [optional] |
| **destType** | **String**| The destination type of the transaction | [optional] [enum: VAULT_ACCOUNT, EXCHANGE_ACCOUNT, INTERNAL_WALLET, EXTERNAL_WALLET, FIAT_ACCOUNT, NETWORK_CONNECTION, COMPOUND, ONE_TIME_ADDRESS, END_USER_WALLET] |
| **destId** | **String**| The destination ID of the transaction | [optional] |
| **assets** | **String**| A list of assets to filter by, seperated by commas | [optional] |
| **txHash** | **String**| Returns only results with a specified txHash | [optional] |
| **sourceWalletId** | **String**| Returns only results where the source is a specific end user wallet | [optional] |
| **destWalletId** | **String**| Returns only results where the destination is a specific end user wallet | [optional] |

### Return type

[**List&lt;TransactionResponse&gt;**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of transactions |  * X-Request-ID -  <br>  * next-page -  <br>  * prev-page -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setConfirmationThresholdForTransaction

> SetConfirmationsThresholdResponse setConfirmationThresholdForTransaction(txId, setConfirmationsThresholdRequest)

Set confirmation threshold by transaction ID

Overrides the required number of confirmations for transaction completion by transaction ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String txId = "txId_example"; // String | The ID of the transaction
        SetConfirmationsThresholdRequest setConfirmationsThresholdRequest = new SetConfirmationsThresholdRequest(); // SetConfirmationsThresholdRequest | 
        try {
            SetConfirmationsThresholdResponse result = apiInstance.setConfirmationThresholdForTransaction(txId, setConfirmationsThresholdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#setConfirmationThresholdForTransaction");
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
| **txId** | **String**| The ID of the transaction | |
| **setConfirmationsThresholdRequest** | [**SetConfirmationsThresholdRequest**](SetConfirmationsThresholdRequest.md)|  | [optional] |

### Return type

[**SetConfirmationsThresholdResponse**](SetConfirmationsThresholdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set successfully |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setConfirmationThresholdForTransactionByHash

> SetConfirmationsThresholdResponse setConfirmationThresholdForTransactionByHash(txHash, setConfirmationsThresholdRequest)

Set confirmation threshold by transaction hash

Overrides the required number of confirmations for transaction completion by transaction hash.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String txHash = "txHash_example"; // String | The TxHash
        SetConfirmationsThresholdRequest setConfirmationsThresholdRequest = new SetConfirmationsThresholdRequest(); // SetConfirmationsThresholdRequest | 
        try {
            SetConfirmationsThresholdResponse result = apiInstance.setConfirmationThresholdForTransactionByHash(txHash, setConfirmationsThresholdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#setConfirmationThresholdForTransactionByHash");
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
| **txHash** | **String**| The TxHash | |
| **setConfirmationsThresholdRequest** | [**SetConfirmationsThresholdRequest**](SetConfirmationsThresholdRequest.md)|  | [optional] |

### Return type

[**SetConfirmationsThresholdResponse**](SetConfirmationsThresholdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of transactions affected by the change |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## unfreezeTransaction

> UnfreezeTransactionResponse unfreezeTransaction(txId)

Unfreeze a transaction

Unfreezes a transaction by ID and makes the transaction available again.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String txId = "txId_example"; // String | The ID of the transaction to unfreeze
        try {
            UnfreezeTransactionResponse result = apiInstance.unfreezeTransaction(txId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#unfreezeTransaction");
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
| **txId** | **String**| The ID of the transaction to unfreeze | |

### Return type

[**UnfreezeTransactionResponse**](UnfreezeTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unfreeze response |  * X-Request-ID -  <br>  |


## validateAddress

> ValidateAddressResponse validateAddress(assetId, address)

Validate destination address

Checks if an address is valid (for XRP, DOT, XLM, and EOS).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        TransactionsApi apiInstance = new TransactionsApi(configuration);
        String assetId = "assetId_example"; // String | The asset of the address
        String address = "address_example"; // String | The address to validate
        try {
            ValidateAddressResponse result = apiInstance.validateAddress(assetId, address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#validateAddress");
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
| **assetId** | **String**| The asset of the address | |
| **address** | **String**| The address to validate | |

### Return type

[**ValidateAddressResponse**](ValidateAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

