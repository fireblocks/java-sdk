# ConnectedAccountsBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addConnectedAccount**](ConnectedAccountsBetaApi.md#addConnectedAccount) | **POST** /connected_accounts | Add a connected account |
| [**disconnectConnectedAccount**](ConnectedAccountsBetaApi.md#disconnectConnectedAccount) | **DELETE** /connected_accounts/{accountId} | Disconnect connected account |
| [**getConnectedAccount**](ConnectedAccountsBetaApi.md#getConnectedAccount) | **GET** /connected_accounts/{accountId} | Get connected account |
| [**getConnectedAccountAllowlist**](ConnectedAccountsBetaApi.md#getConnectedAccountAllowlist) | **GET** /connected_accounts/{accountId}/allowlist | Get allowlist for connected account |
| [**getConnectedAccountAllowlistEntry**](ConnectedAccountsBetaApi.md#getConnectedAccountAllowlistEntry) | **GET** /connected_accounts/{accountId}/allowlist/{allowlistId} | Get a single allowlist entry for a connected account |
| [**getConnectedAccountBalances**](ConnectedAccountsBetaApi.md#getConnectedAccountBalances) | **GET** /connected_accounts/{accountId}/balances | Get balances for an account |
| [**getConnectedAccountRates**](ConnectedAccountsBetaApi.md#getConnectedAccountRates) | **GET** /connected_accounts/{accountId}/rates | Get exchange rates for an account |
| [**getConnectedAccountTradingPairs**](ConnectedAccountsBetaApi.md#getConnectedAccountTradingPairs) | **GET** /connected_accounts/{accountId}/manifest/capabilities/trading/pairs | Get supported trading pairs for an account |
| [**getConnectedAccounts**](ConnectedAccountsBetaApi.md#getConnectedAccounts) | **GET** /connected_accounts | Get connected accounts |
| [**renameConnectedAccount**](ConnectedAccountsBetaApi.md#renameConnectedAccount) | **POST** /connected_accounts/{accountId}/rename | Rename Connected Account |
| [**syncConnectedAccountAllowlist**](ConnectedAccountsBetaApi.md#syncConnectedAccountAllowlist) | **POST** /connected_accounts/{accountId}/allowlist/sync | Sync allowlist for connected account |



## addConnectedAccount

> CompletableFuture<ApiResponse<AddConnectedAccountResponse>> addConnectedAccount addConnectedAccount(addConnectedAccountRequest, idempotencyKey)

Add a connected account

Creates a new connected account for the authenticated tenant.  The &#x60;creds&#x60; field must be a Base64-encoded RSA-encrypted credential blob. Use &#x60;GET /exchange_accounts/credentials_public_key&#x60; to retrieve the public key for encryption.  The &#x60;providerType&#x60; is derived server-side from the &#x60;providerId&#x60; — callers do not supply it.  Endpoint Permission: Editor, Admin, Non-Signing Admin.  **Note:** This endpoint is currently in beta and might be subject to changes. 

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

        AddConnectedAccountRequest addConnectedAccountRequest = new AddConnectedAccountRequest(); // AddConnectedAccountRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AddConnectedAccountResponse>> response = fireblocks.connectedAccountsBeta().addConnectedAccount(addConnectedAccountRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#addConnectedAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#addConnectedAccount");
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
| **addConnectedAccountRequest** | [**AddConnectedAccountRequest**](AddConnectedAccountRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AddConnectedAccountResponse**](AddConnectedAccountResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Account created (or pending approval). |  * X-Request-ID -  <br>  |
| **400** | Bad request — invalid field or provider constraints violated. |  * X-Request-ID -  <br>  |
| **401** | Unauthorized. Missing / invalid JWT token, or insufficient role (Editor or higher required). |  * X-Request-ID -  <br>  |
| **403** | Feature not enabled for this tenant. |  * X-Request-ID -  <br>  |
| **404** | mainAccountId not found. |  * X-Request-ID -  <br>  |
| **422** | Invalid credentials. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## disconnectConnectedAccount

> CompletableFuture<ApiResponse<Void>> disconnectConnectedAccount disconnectConnectedAccount(accountId)

Disconnect connected account

Disconnect a connected account by ID.  **Note**: - This endpoint is currently in beta and might be subject to changes. 

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


## getConnectedAccountAllowlist

> CompletableFuture<ApiResponse<AllowlistResponse>> getConnectedAccountAllowlist getConnectedAccountAllowlist(accountId, status, assetId, networkId, address, pageCursor, pageSize, sortBy, order)

Get allowlist for connected account

Retrieves the address allowlist for a specified connected account.  **Note:** This endpoint is currently in beta and might be subject to changes. Currently supports CoinbaseExchange/Binance accounts only. 

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

        String accountId = "accountId_example"; // String | The connected account identifier
        AllowlistEntryStatus status = AllowlistEntryStatus.fromValue("ACTIVE"); // AllowlistEntryStatus | Filter by allowlist entry status
        String assetId = "assetId_example"; // String | Filter by Fireblocks asset ID.  See [List assets](https://developers.fireblocks.com/reference/listassets) for the canonical list of Fireblocks asset IDs. 
        String networkId = "networkId_example"; // String | Filter by Fireblocks network ID.  See [List blockchains](https://developers.fireblocks.com/reference/listblockchains) for the canonical list of Fireblocks blockchain identifiers. 
        String address = "address_example"; // String | Filter by specific address
        String pageCursor = "pageCursor_example"; // String | Pagination cursor for next page
        Integer pageSize = 56; // Integer | Maximum number of entries to return
        String sortBy = "addedAt"; // String | Field to sort results by.
        String order = "ASC"; // String | Sort order (ASC or DESC).
        try {
            CompletableFuture<ApiResponse<AllowlistResponse>> response = fireblocks.connectedAccountsBeta().getConnectedAccountAllowlist(accountId, status, assetId, networkId, address, pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountAllowlist");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountAllowlist");
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
| **accountId** | **String**| The connected account identifier | |
| **status** | [**AllowlistEntryStatus**](.md)| Filter by allowlist entry status | [optional] [enum: ACTIVE, PENDING_PROVIDER_COOLDOWN, PENDING_PROVIDER_REVIEW, PENDING_APPROVAL, REJECTED, REMOVED] |
| **assetId** | **String**| Filter by Fireblocks asset ID.  See [List assets](https://developers.fireblocks.com/reference/listassets) for the canonical list of Fireblocks asset IDs.  | [optional] |
| **networkId** | **String**| Filter by Fireblocks network ID.  See [List blockchains](https://developers.fireblocks.com/reference/listblockchains) for the canonical list of Fireblocks blockchain identifiers.  | [optional] |
| **address** | **String**| Filter by specific address | [optional] |
| **pageCursor** | **String**| Pagination cursor for next page | [optional] |
| **pageSize** | **Integer**| Maximum number of entries to return | [optional] |
| **sortBy** | **String**| Field to sort results by. | [optional] [default to addedAt] [enum: addedAt, lastSyncedAt] |
| **order** | **String**| Sort order (ASC or DESC). | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**AllowlistResponse**](AllowlistResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Allowlist entries response |  * X-Request-ID -  <br>  |
| **404** | Connected account not found |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConnectedAccountAllowlistEntry

> CompletableFuture<ApiResponse<AllowlistEntryResponse>> getConnectedAccountAllowlistEntry getConnectedAccountAllowlistEntry(accountId, allowlistId)

Get a single allowlist entry for a connected account

Retrieves a single allowlist entry by its Fireblocks identifier for a specified connected account.  **Note:** This endpoint is currently in beta and might be subject to changes. Currently supports CoinbaseExchange/Binance accounts only. 

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

        String accountId = "accountId_example"; // String | The connected account identifier
        String allowlistId = "allowlistId_example"; // String | The Fireblocks allowlist entry identifier
        try {
            CompletableFuture<ApiResponse<AllowlistEntryResponse>> response = fireblocks.connectedAccountsBeta().getConnectedAccountAllowlistEntry(accountId, allowlistId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountAllowlistEntry");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#getConnectedAccountAllowlistEntry");
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
| **accountId** | **String**| The connected account identifier | |
| **allowlistId** | **String**| The Fireblocks allowlist entry identifier | |

### Return type

CompletableFuture<ApiResponse<[**AllowlistEntryResponse**](AllowlistEntryResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Allowlist entry response |  * X-Request-ID -  <br>  |
| **404** | Connected account or allowlist entry not found |  * X-Request-ID -  <br>  |
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


## syncConnectedAccountAllowlist

> CompletableFuture<ApiResponse<Void>> syncConnectedAccountAllowlist syncConnectedAccountAllowlist(accountId, idempotencyKey)

Sync allowlist for connected account

Triggers an on-demand sync from the exchange, bypassing the cache and fetching live data immediately.  **Rate limit:** 1 request per minute per connected account.  **Note:** This endpoint is currently in beta and might be subject to changes. Currently supports CoinbaseExchange/Binance accounts only. 

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

        String accountId = "accountId_example"; // String | The connected account identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.connectedAccountsBeta().syncConnectedAccountAllowlist(accountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectedAccountsBetaApi#syncConnectedAccountAllowlist");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectedAccountsBetaApi#syncConnectedAccountAllowlist");
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
| **accountId** | **String**| The connected account identifier | |
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
| **202** | Sync request accepted and processing |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

