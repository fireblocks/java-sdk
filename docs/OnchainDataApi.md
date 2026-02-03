# OnchainDataApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccessRegistryCurrentState**](OnchainDataApi.md#getAccessRegistryCurrentState) | **GET** /onchain_data/base_asset_id/{baseAssetId}/access_registry_address/{accessRegistryAddress}/list | Get the current state of addresses in an access registry |
| [**getAccessRegistrySummary**](OnchainDataApi.md#getAccessRegistrySummary) | **GET** /onchain_data/base_asset_id/{baseAssetId}/access_registry_address/{accessRegistryAddress}/summary | Summary of access registry state |
| [**getActiveRolesForContract**](OnchainDataApi.md#getActiveRolesForContract) | **GET** /onchain_data/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/roles | List of active roles for a given contract address and base asset ID |
| [**getContractBalanceHistory**](OnchainDataApi.md#getContractBalanceHistory) | **GET** /onchain_data/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/account_address/{accountAddress}/balance_history | Get historical balance data for a specific account in a contract |
| [**getContractBalancesSummary**](OnchainDataApi.md#getContractBalancesSummary) | **GET** /onchain_data/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/summary | Get summary for the token contract |
| [**getContractTotalSupply**](OnchainDataApi.md#getContractTotalSupply) | **GET** /onchain_data/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/total_supply | Get historical total supply data for a contract |
| [**getLatestBalancesForContract**](OnchainDataApi.md#getLatestBalancesForContract) | **GET** /onchain_data/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/balances | Get latest balances for all addresses holding tokens from a contract |
| [**getOnchainTransactions**](OnchainDataApi.md#getOnchainTransactions) | **GET** /onchain_data/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/transactions | Fetch onchain transactions for a contract |



## getAccessRegistryCurrentState

> CompletableFuture<ApiResponse<AccessRegistryCurrentStateResponse>> getAccessRegistryCurrentState getAccessRegistryCurrentState(baseAssetId, accessRegistryAddress, pageCursor, pageSize, sortBy, order)

Get the current state of addresses in an access registry

Returns the current state of addresses in the specified access registry. Only addresses that are currently active (added but not removed) are included.

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
import com.fireblocks.sdk.api.OnchainDataApi;
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
        String accessRegistryAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The access registry address
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page\"
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more then 100 will return 100 items
        String sortBy = "dateAdded"; // String | Sorting field (enum).
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<AccessRegistryCurrentStateResponse>> response = fireblocks.onchainData().getAccessRegistryCurrentState(baseAssetId, accessRegistryAddress, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OnchainDataApi#getAccessRegistryCurrentState");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OnchainDataApi#getAccessRegistryCurrentState");
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
| **accessRegistryAddress** | **String**| The access registry address | |
| **pageCursor** | **String**| Page cursor to get the next page\&quot; | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more then 100 will return 100 items | [optional] |
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
| **200** | Access registry current state retrieved successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getAccessRegistrySummary

> CompletableFuture<ApiResponse<AccessRegistrySummaryResponse>> getAccessRegistrySummary getAccessRegistrySummary(baseAssetId, accessRegistryAddress)

Summary of access registry state

Returns a summary of the current state of the access registry for the specified baseAssetId and accessRegistryAddress.

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
import com.fireblocks.sdk.api.OnchainDataApi;
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
        String accessRegistryAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The access registry address
        try {
            CompletableFuture<ApiResponse<AccessRegistrySummaryResponse>> response = fireblocks.onchainData().getAccessRegistrySummary(baseAssetId, accessRegistryAddress);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OnchainDataApi#getAccessRegistrySummary");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OnchainDataApi#getAccessRegistrySummary");
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
| **accessRegistryAddress** | **String**| The access registry address | |

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
| **200** | Successfully retrieved the summary of the access registry state |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getActiveRolesForContract

> CompletableFuture<ApiResponse<Map<String, RoleDetails>>> getActiveRolesForContract getActiveRolesForContract(baseAssetId, contractAddress)

List of active roles for a given contract address and base asset ID

Returns a list of currently active roles for the specified baseAssetId and contractAddress.

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
import com.fireblocks.sdk.api.OnchainDataApi;
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
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract address
        try {
            CompletableFuture<ApiResponse<Map<String, RoleDetails>>> response = fireblocks.onchainData().getActiveRolesForContract(baseAssetId, contractAddress);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OnchainDataApi#getActiveRolesForContract");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OnchainDataApi#getActiveRolesForContract");
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
| **contractAddress** | **String**| The contract address | |

### Return type

CompletableFuture<ApiResponse<[**Map&lt;String, RoleDetails&gt;**](RoleDetails.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list of active roles |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContractBalanceHistory

> CompletableFuture<ApiResponse<BalanceHistoryPagedResponse>> getContractBalanceHistory getContractBalanceHistory(baseAssetId, contractAddress, accountAddress, startDate, endDate, interval, pageCursor, pageSize, sortBy, order)

Get historical balance data for a specific account in a contract

Returns the paginated balance history of the specified account in a contract with optional date range and interval filtering.

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
import com.fireblocks.sdk.api.OnchainDataApi;
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
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract address
        String accountAddress = "0x1234567890abcdef1234567890abcdef12345678"; // String | The account address to get balance history for
        OffsetDateTime startDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | Start date of the time range in ISO 8601 format
        OffsetDateTime endDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | End date of the time range in ISO 8601 format
        String interval = "hour"; // String | Time interval for grouping data
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page\"
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more then 100 will return 100 items
        String sortBy = "blockTimestamp"; // String | Sorting field (enum). Sorting only supported by 'blockTimestamp'
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<BalanceHistoryPagedResponse>> response = fireblocks.onchainData().getContractBalanceHistory(baseAssetId, contractAddress, accountAddress, startDate, endDate, interval, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OnchainDataApi#getContractBalanceHistory");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OnchainDataApi#getContractBalanceHistory");
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
| **contractAddress** | **String**| The contract address | |
| **accountAddress** | **String**| The account address to get balance history for | |
| **startDate** | **OffsetDateTime**| Start date of the time range in ISO 8601 format | [optional] |
| **endDate** | **OffsetDateTime**| End date of the time range in ISO 8601 format | [optional] |
| **interval** | **String**| Time interval for grouping data | [optional] [default to day] [enum: hour, day, week, month] |
| **pageCursor** | **String**| Page cursor to get the next page\&quot; | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more then 100 will return 100 items | [optional] |
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
| **200** | Successfully retrieved the contract balance history |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContractBalancesSummary

> CompletableFuture<ApiResponse<TokenContractSummaryResponse>> getContractBalancesSummary getContractBalancesSummary(baseAssetId, contractAddress)

Get summary for the token contract

Returns the total number of unique addresses holding balances and the total supply for the specified contract.

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
import com.fireblocks.sdk.api.OnchainDataApi;
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
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract address
        try {
            CompletableFuture<ApiResponse<TokenContractSummaryResponse>> response = fireblocks.onchainData().getContractBalancesSummary(baseAssetId, contractAddress);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OnchainDataApi#getContractBalancesSummary");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OnchainDataApi#getContractBalancesSummary");
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
| **contractAddress** | **String**| The contract address | |

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
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContractTotalSupply

> CompletableFuture<ApiResponse<TotalSupplyPagedResponse>> getContractTotalSupply getContractTotalSupply(baseAssetId, contractAddress, startDate, endDate, interval, pageCursor, pageSize, sortBy, order)

Get historical total supply data for a contract

Returns the paginated total supply history of the specified contract with optional date range and interval filtering.

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
import com.fireblocks.sdk.api.OnchainDataApi;
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
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract address
        OffsetDateTime startDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | Start date of the time range in ISO 8601 format
        OffsetDateTime endDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | End date of the time range in ISO 8601 format
        String interval = "hour"; // String | Time interval for grouping data
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page\"
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more then 100 will return 100 items
        String sortBy = "blockTimestamp"; // String | Sorting field (enum). Sorting only supported by 'blockTimestamp'
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<TotalSupplyPagedResponse>> response = fireblocks.onchainData().getContractTotalSupply(baseAssetId, contractAddress, startDate, endDate, interval, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OnchainDataApi#getContractTotalSupply");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OnchainDataApi#getContractTotalSupply");
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
| **contractAddress** | **String**| The contract address | |
| **startDate** | **OffsetDateTime**| Start date of the time range in ISO 8601 format | [optional] |
| **endDate** | **OffsetDateTime**| End date of the time range in ISO 8601 format | [optional] |
| **interval** | **String**| Time interval for grouping data | [optional] [default to day] [enum: hour, day, week, month] |
| **pageCursor** | **String**| Page cursor to get the next page\&quot; | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more then 100 will return 100 items | [optional] |
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
| **200** | Successfully retrieved the contract total supply history |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getLatestBalancesForContract

> CompletableFuture<ApiResponse<AddressBalancePagedResponse>> getLatestBalancesForContract getLatestBalancesForContract(baseAssetId, contractAddress, accountAddress, pageCursor, pageSize, sortBy, order)

Get latest balances for all addresses holding tokens from a contract

Returns the latest balance for each unique address with support for numeric balance sorting. The &#x60;prev&#x60; cursor is reserved for future support.

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
import com.fireblocks.sdk.api.OnchainDataApi;
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
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract address
        String accountAddress = "0x1234567890abcdef1234567890abcdef12345678"; // String | Optional filter to get balance for a specific account address
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page\"
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more then 100 will return 100 items
        String sortBy = "accountAddress"; // String | Sorting field for balances
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<AddressBalancePagedResponse>> response = fireblocks.onchainData().getLatestBalancesForContract(baseAssetId, contractAddress, accountAddress, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OnchainDataApi#getLatestBalancesForContract");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OnchainDataApi#getLatestBalancesForContract");
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
| **contractAddress** | **String**| The contract address | |
| **accountAddress** | **String**| Optional filter to get balance for a specific account address | [optional] |
| **pageCursor** | **String**| Page cursor to get the next page\&quot; | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more then 100 will return 100 items | [optional] |
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
| **200** | Successfully retrieved the latest balances for the contract |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getOnchainTransactions

> CompletableFuture<ApiResponse<OnchainTransactionsPagedResponse>> getOnchainTransactions getOnchainTransactions(baseAssetId, contractAddress, startDate, endDate, pageCursor, pageSize, sortBy, order)

Fetch onchain transactions for a contract

Returns a paginated list of onchain transactions for the specified contract address and base asset ID, optionally filtered by date range.

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
import com.fireblocks.sdk.api.OnchainDataApi;
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
        String contractAddress = "0xC2c4e1Db41F0bB97996D0eD0542D2170d146FB66"; // String | The contract address
        OffsetDateTime startDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | Start date of the time range in ISO 8601 format
        OffsetDateTime endDate = OffsetDateTime.parse("2025-01-16T15:45:00Z"); // OffsetDateTime | End date of the time range in ISO 8601 format
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page\"
        Integer pageSize = 10; // Integer | Number of items per page (max 100), requesting more then 100 will return 100 items
        String sortBy = "blockTimestamp"; // String | Sorting field (enum).
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        try {
            CompletableFuture<ApiResponse<OnchainTransactionsPagedResponse>> response = fireblocks.onchainData().getOnchainTransactions(baseAssetId, contractAddress, startDate, endDate, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling OnchainDataApi#getOnchainTransactions");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OnchainDataApi#getOnchainTransactions");
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
| **contractAddress** | **String**| The contract address | |
| **startDate** | **OffsetDateTime**| Start date of the time range in ISO 8601 format | [optional] |
| **endDate** | **OffsetDateTime**| End date of the time range in ISO 8601 format | [optional] |
| **pageCursor** | **String**| Page cursor to get the next page\&quot; | [optional] |
| **pageSize** | **Integer**| Number of items per page (max 100), requesting more then 100 will return 100 items | [optional] |
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
| **0** | Error Response |  * X-Request-ID -  <br>  |

