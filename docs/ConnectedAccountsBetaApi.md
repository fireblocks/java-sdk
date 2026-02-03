# ConnectedAccountsBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**disconnectConnectedAccount**](ConnectedAccountsBetaApi.md#disconnectConnectedAccount) | **DELETE** /connected_accounts/{accountId} | Disconnect connected account |
| [**getConnectedAccount**](ConnectedAccountsBetaApi.md#getConnectedAccount) | **GET** /connected_accounts/{accountId} | Get connected account |
| [**getConnectedAccountBalances**](ConnectedAccountsBetaApi.md#getConnectedAccountBalances) | **GET** /connected_accounts/{accountId}/balances | Get balances for an account |
| [**getConnectedAccountRates**](ConnectedAccountsBetaApi.md#getConnectedAccountRates) | **GET** /connected_accounts/{accountId}/rates | Get exchange rates for an account |
| [**getConnectedAccountTradingPairs**](ConnectedAccountsBetaApi.md#getConnectedAccountTradingPairs) | **GET** /connected_accounts/{accountId}/manifest/capabilities/trading/pairs | Get supported trading pairs for an account |
| [**getConnectedAccounts**](ConnectedAccountsBetaApi.md#getConnectedAccounts) | **GET** /connected_accounts | Get connected accounts |
| [**renameConnectedAccount**](ConnectedAccountsBetaApi.md#renameConnectedAccount) | **POST** /connected_accounts/{accountId}/rename | Rename Connected Account |



## disconnectConnectedAccount

> CompletableFuture<ApiResponse<Void>> disconnectConnectedAccount disconnectConnectedAccount(accountId)

Disconnect connected account

Disconnect a connected account by ID. &lt;/br&gt; **Note**: - This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.ConnectedAccountsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String accountId = "accountId_example"; // String | The ID of the account to disconnect.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.connectedAccountsBeta().disconnectConnectedAccount(accountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#disconnectConnectedAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#disconnectConnectedAccount");
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
| **accountId** | **String**| The ID of the account to disconnect. | |

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
| **204** | Account disconnected successfully |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConnectedAccount

> CompletableFuture<ApiResponse<ConnectedSingleAccountResponse>> getConnectedAccount getConnectedAccount(accountId)

Get connected account

Retrieve detailed information about a specific connected account by ID.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.ConnectedAccountsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String accountId = "accountId_example"; // String | The ID of the account to fetch.
        try {
            CompletableFuture<ApiResponse<ConnectedSingleAccountResponse>> response = fireblocks.connectedAccountsBeta().getConnectedAccount(accountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccount");
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
| **accountId** | **String**| The ID of the account to fetch. | |

### Return type

CompletableFuture<ApiResponse<[**ConnectedSingleAccountResponse**](ConnectedSingleAccountResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConnectedAccountBalances

> CompletableFuture<ApiResponse<ConnectedAccountBalancesResponse>> getConnectedAccountBalances getConnectedAccountBalances(accountId, pageSize, pageCursor)

Get balances for an account

Retrieve current asset balances for a specific connected account as a flat list (one row per &#x60;assetId&#x60;, &#x60;balanceType&#x60;).  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.ConnectedAccountsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String accountId = "accountId_example"; // String | The ID of the account to fetch balances for.
        Integer pageSize = 56; // Integer | Page size for pagination.
        String pageCursor = "pageCursor_example"; // String | Page cursor for pagination.
        try {
            CompletableFuture<ApiResponse<ConnectedAccountBalancesResponse>> response = fireblocks.connectedAccountsBeta().getConnectedAccountBalances(accountId, pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountBalances");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountBalances");
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
| **accountId** | **String**| The ID of the account to fetch balances for. | |
| **pageSize** | **Integer**| Page size for pagination. | [optional] |
| **pageCursor** | **String**| Page cursor for pagination. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ConnectedAccountBalancesResponse**](ConnectedAccountBalancesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account balances response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConnectedAccountRates

> CompletableFuture<ApiResponse<ConnectedAccountRateResponse>> getConnectedAccountRates getConnectedAccountRates(accountId, baseAssetId, quoteAssetId)

Get exchange rates for an account

Retrieve current exchange rates for converting between specific assets in a connected account.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.ConnectedAccountsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String accountId = "accountId_example"; // String | The ID of the account to fetch rates for.
        String baseAssetId = "baseAssetId_example"; // String | The ID of the asset to fetch rates for.
        String quoteAssetId = "quoteAssetId_example"; // String | The ID of the asset to get the rates nominally.
        try {
            CompletableFuture<ApiResponse<ConnectedAccountRateResponse>> response = fireblocks.connectedAccountsBeta().getConnectedAccountRates(accountId, baseAssetId, quoteAssetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountRates");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountRates");
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
| **accountId** | **String**| The ID of the account to fetch rates for. | |
| **baseAssetId** | **String**| The ID of the asset to fetch rates for. | |
| **quoteAssetId** | **String**| The ID of the asset to get the rates nominally. | |

### Return type

CompletableFuture<ApiResponse<[**ConnectedAccountRateResponse**](ConnectedAccountRateResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rates response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConnectedAccountTradingPairs

> CompletableFuture<ApiResponse<ConnectedAccountTradingPairsResponse>> getConnectedAccountTradingPairs getConnectedAccountTradingPairs(accountId, pageSize, pageCursor)

Get supported trading pairs for an account

Retrieve all asset trading pairs supported by a specific connected account, including the pair type (&#x60;quote&#x60;, &#x60;market&#x60;, &#x60;onOffRamp&#x60;).  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.ConnectedAccountsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String accountId = "accountId_example"; // String | The ID of the account to fetch supported pairs for.
        Integer pageSize = 100; // Integer | Page size for pagination.
        String pageCursor = "pageCursor_example"; // String | Page cursor for pagination.
        try {
            CompletableFuture<ApiResponse<ConnectedAccountTradingPairsResponse>> response = fireblocks.connectedAccountsBeta().getConnectedAccountTradingPairs(accountId, pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountTradingPairs");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountTradingPairs");
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
| **accountId** | **String**| The ID of the account to fetch supported pairs for. | |
| **pageSize** | **Integer**| Page size for pagination. | [optional] [default to 100] |
| **pageCursor** | **String**| Page cursor for pagination. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ConnectedAccountTradingPairsResponse**](ConnectedAccountTradingPairsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Supported pairs response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConnectedAccounts

> CompletableFuture<ApiResponse<ConnectedAccountsResponse>> getConnectedAccounts getConnectedAccounts(mainAccounts, pageSize, pageCursor)

Get connected accounts

Returns all connected accounts.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.ConnectedAccountsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        Boolean mainAccounts = false; // Boolean | Whether to include only main accounts in the response.
        Integer pageSize = 56; // Integer | Page size for pagination.
        String pageCursor = "pageCursor_example"; // String | Page cursor for pagination.
        try {
            CompletableFuture<ApiResponse<ConnectedAccountsResponse>> response = fireblocks.connectedAccountsBeta().getConnectedAccounts(mainAccounts, pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccounts");
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
| **mainAccounts** | **Boolean**| Whether to include only main accounts in the response. | [optional] [default to false] |
| **pageSize** | **Integer**| Page size for pagination. | [optional] |
| **pageCursor** | **String**| Page cursor for pagination. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ConnectedAccountsResponse**](ConnectedAccountsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get accounts response |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## renameConnectedAccount

> CompletableFuture<ApiResponse<RenameConnectedAccountResponse>> renameConnectedAccount renameConnectedAccount(renameConnectedAccountRequest, accountId, idempotencyKey)

Rename Connected Account

Rename a connected account by account ID.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.ConnectedAccountsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        RenameConnectedAccountRequest renameConnectedAccountRequest = new RenameConnectedAccountRequest(); // RenameConnectedAccountRequest | 
        String accountId = "accountId_example"; // String | The unique identifier of the connected account
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<RenameConnectedAccountResponse>> response = fireblocks.connectedAccountsBeta().renameConnectedAccount(renameConnectedAccountRequest, accountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#renameConnectedAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#renameConnectedAccount");
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
| **renameConnectedAccountRequest** | [**RenameConnectedAccountRequest**](RenameConnectedAccountRequest.md)|  | |
| **accountId** | **String**| The unique identifier of the connected account | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**RenameConnectedAccountResponse**](RenameConnectedAccountResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully renamed connected account. |  * X-Request-ID -  <br>  |
| **400** | Bad request. Missing tenantId, accountId, or accountName. |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **403** | Failed to rename connected account. |  -  |
| **404** | Connected account not found |  -  |
| **409** | Conflict. Account name is already in use by another account. |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

