# NftsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNFT**](NftsApi.md#getNFT) | **GET** /nfts/tokens/{id} | List token data by ID |
| [**getNFTs**](NftsApi.md#getNFTs) | **GET** /nfts/tokens | List tokens by IDs |
| [**getOwnershipTokens**](NftsApi.md#getOwnershipTokens) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated) |
| [**listOwnedCollections**](NftsApi.md#listOwnedCollections) | **GET** /nfts/ownership/collections | List owned collections (paginated) |
| [**listOwnedTokens**](NftsApi.md#listOwnedTokens) | **GET** /nfts/ownership/assets | List all distinct owned tokens (paginated) |
| [**refreshNFTMetadata**](NftsApi.md#refreshNFTMetadata) | **PUT** /nfts/tokens/{id} | Refresh token metadata |
| [**updateOwnershipTokens**](NftsApi.md#updateOwnershipTokens) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens |
| [**updateTokenOwnershipStatus**](NftsApi.md#updateTokenOwnershipStatus) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status |
| [**updateTokensOwnershipSpam**](NftsApi.md#updateTokensOwnershipSpam) | **PUT** /nfts/ownership/tokens/spam | Update tokens ownership spam property |
| [**updateTokensOwnershipStatus**](NftsApi.md#updateTokensOwnershipStatus) | **PUT** /nfts/ownership/tokens/status | Update tokens ownership status |



## getNFT

> CompletableFuture<ApiResponse<TokenResponse>> getNFT getNFT(id)

List token data by ID

Returns the requested token data. 

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        try {
            CompletableFuture<ApiResponse<TokenResponse>> response = fireblocks.nfts().getNFT(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#getNFT");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#getNFT");
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
| **id** | **String**| NFT ID | |

### Return type

CompletableFuture<ApiResponse<[**TokenResponse**](TokenResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |


## getNFTs

> CompletableFuture<ApiResponse<GetNFTsResponse>> getNFTs getNFTs(ids, pageCursor, pageSize, sort, order)

List tokens by IDs

Returns the requested tokens data. 

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String ids = "ids_example"; // String | A comma separated list of NFT IDs. Up to 100 are allowed in a single request.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        try {
            CompletableFuture<ApiResponse<GetNFTsResponse>> response = fireblocks.nfts().getNFTs(ids, pageCursor, pageSize, sort, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#getNFTs");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#getNFTs");
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
| **ids** | **String**| A comma separated list of NFT IDs. Up to 100 are allowed in a single request. | |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 100) | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: collection.name, name, blockchainDescriptor] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |

### Return type

CompletableFuture<ApiResponse<[**GetNFTsResponse**](GetNFTsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |


## getOwnershipTokens

> CompletableFuture<ApiResponse<GetOwnershipTokensResponse>> getOwnershipTokens getOwnershipTokens(blockchainDescriptor, vaultAccountIds, ncwId, ncwAccountIds, walletType, ids, collectionIds, pageCursor, pageSize, sort, order, status, search, spam)

List all owned tokens (paginated)

Returns all tokens and their data in your workspace. 

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String blockchainDescriptor = "ETH"; // String | Blockchain descriptor filter
        String vaultAccountIds = "vaultAccountIds_example"; // String | A comma separated list of Vault Account IDs. Up to 100 are allowed in a single request.  This field will be ignored when walletType=END_USER_WALLET or ncwId is provided.
        String ncwId = "ncwId_example"; // String | Tenant's Non-Custodial Wallet ID
        String ncwAccountIds = "ncwAccountIds_example"; // String | A comma separated list of Non-Custodial account IDs. Up to 100 are allowed in a single request. This field will be ignored when walletType=VAULT_ACCOUNT or ncwId is not provided.
        String walletType = "VAULT_ACCOUNT"; // String | Wallet type, it can be `VAULT_ACCOUNT` or `END_USER_WALLET`
        String ids = "ids_example"; // String | A comma separated list of NFT IDs. Up to 100 are allowed in a single request.
        String collectionIds = "collectionIds_example"; // String | A comma separated list of collection IDs. Up to 100 are allowed in a single request.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        String status = "LISTED"; // String | Token ownership status
        String search = "search_example"; // String | Search owned tokens and their collections. Possible criteria for search:  token name and id within the contract/collection, collection name, blockchain descriptor and name.
        String spam = "true"; // String | Token ownership spam status.
        try {
            CompletableFuture<ApiResponse<GetOwnershipTokensResponse>> response = fireblocks.nfts().getOwnershipTokens(blockchainDescriptor, vaultAccountIds, ncwId, ncwAccountIds, walletType, ids, collectionIds, pageCursor, pageSize, sort, order, status, search, spam);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#getOwnershipTokens");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#getOwnershipTokens");
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
| **blockchainDescriptor** | **String**| Blockchain descriptor filter | [optional] [enum: ETH, ETH_TEST3, ETH_TEST5, ETH_TEST6, POLYGON, POLYGON_TEST_MUMBAI, AMOY_POLYGON_TEST, XTZ, XTZ_TEST, BASECHAIN_ETH, BASECHAIN_ETH_TEST3] |
| **vaultAccountIds** | **String**| A comma separated list of Vault Account IDs. Up to 100 are allowed in a single request.  This field will be ignored when walletType&#x3D;END_USER_WALLET or ncwId is provided. | [optional] |
| **ncwId** | **String**| Tenant&#39;s Non-Custodial Wallet ID | [optional] |
| **ncwAccountIds** | **String**| A comma separated list of Non-Custodial account IDs. Up to 100 are allowed in a single request. This field will be ignored when walletType&#x3D;VAULT_ACCOUNT or ncwId is not provided. | [optional] |
| **walletType** | **String**| Wallet type, it can be &#x60;VAULT_ACCOUNT&#x60; or &#x60;END_USER_WALLET&#x60; | [optional] [default to VAULT_ACCOUNT] [enum: VAULT_ACCOUNT, END_USER_WALLET] |
| **ids** | **String**| A comma separated list of NFT IDs. Up to 100 are allowed in a single request. | [optional] |
| **collectionIds** | **String**| A comma separated list of collection IDs. Up to 100 are allowed in a single request. | [optional] |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 100) | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: ownershipLastUpdateTime, name, collection.name, blockchainDescriptor] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |
| **status** | **String**| Token ownership status | [optional] [default to LISTED] [enum: LISTED, ARCHIVED] |
| **search** | **String**| Search owned tokens and their collections. Possible criteria for search:  token name and id within the contract/collection, collection name, blockchain descriptor and name. | [optional] |
| **spam** | **String**| Token ownership spam status. | [optional] [enum: true, false, all] |

### Return type

CompletableFuture<ApiResponse<[**GetOwnershipTokensResponse**](GetOwnershipTokensResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |


## listOwnedCollections

> CompletableFuture<ApiResponse<ListOwnedCollectionsResponse>> listOwnedCollections listOwnedCollections(ncwId, walletType, search, pageCursor, pageSize, sort, order, status)

List owned collections (paginated)

Returns all collections in your workspace 

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String ncwId = "ncwId_example"; // String | Tenant's Non-Custodial Wallet ID
        String walletType = "VAULT_ACCOUNT"; // String | Wallet type, it can be `VAULT_ACCOUNT` or `END_USER_WALLET`
        String search = "search_example"; // String | Search owned collections. Possible criteria for search: collection name, collection contract address.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        String status = "LISTED"; // String | Token ownership status
        try {
            CompletableFuture<ApiResponse<ListOwnedCollectionsResponse>> response = fireblocks.nfts().listOwnedCollections(ncwId, walletType, search, pageCursor, pageSize, sort, order, status);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#listOwnedCollections");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#listOwnedCollections");
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
| **ncwId** | **String**| Tenant&#39;s Non-Custodial Wallet ID | [optional] |
| **walletType** | **String**| Wallet type, it can be &#x60;VAULT_ACCOUNT&#x60; or &#x60;END_USER_WALLET&#x60; | [optional] [default to VAULT_ACCOUNT] [enum: VAULT_ACCOUNT, END_USER_WALLET] |
| **search** | **String**| Search owned collections. Possible criteria for search: collection name, collection contract address. | [optional] |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 100) | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: name] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |
| **status** | **String**| Token ownership status | [optional] [default to LISTED] [enum: LISTED, ARCHIVED] |

### Return type

CompletableFuture<ApiResponse<[**ListOwnedCollectionsResponse**](ListOwnedCollectionsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |


## listOwnedTokens

> CompletableFuture<ApiResponse<ListOwnedTokensResponse>> listOwnedTokens listOwnedTokens(ncwId, walletType, pageCursor, pageSize, sort, order, status, search, spam)

List all distinct owned tokens (paginated)

Returns all owned distinct tokens (for your tenant) and their data in your workspace. 

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String ncwId = "ncwId_example"; // String | Tenant's Non-Custodial Wallet ID
        String walletType = "VAULT_ACCOUNT"; // String | Wallet type, it can be `VAULT_ACCOUNT` or `END_USER_WALLET`
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        String status = "LISTED"; // String | Token ownership status
        String search = "search_example"; // String | Search owned tokens by token name
        String spam = "true"; // String | Token ownership spam status.
        try {
            CompletableFuture<ApiResponse<ListOwnedTokensResponse>> response = fireblocks.nfts().listOwnedTokens(ncwId, walletType, pageCursor, pageSize, sort, order, status, search, spam);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#listOwnedTokens");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#listOwnedTokens");
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
| **ncwId** | **String**| Tenant&#39;s Non-Custodial Wallet ID | [optional] |
| **walletType** | **String**| Wallet type, it can be &#x60;VAULT_ACCOUNT&#x60; or &#x60;END_USER_WALLET&#x60; | [optional] [default to VAULT_ACCOUNT] [enum: VAULT_ACCOUNT, END_USER_WALLET] |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 100) | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: name] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |
| **status** | **String**| Token ownership status | [optional] [default to LISTED] [enum: LISTED, ARCHIVED] |
| **search** | **String**| Search owned tokens by token name | [optional] |
| **spam** | **String**| Token ownership spam status. | [optional] [enum: true, false, all] |

### Return type

CompletableFuture<ApiResponse<[**ListOwnedTokensResponse**](ListOwnedTokensResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |


## refreshNFTMetadata

> CompletableFuture<ApiResponse<Void>> refreshNFTMetadata refreshNFTMetadata(id, idempotencyKey)

Refresh token metadata

Updates the latest token metadata. 

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.nfts().refreshNFTMetadata(id, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#refreshNFTMetadata");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#refreshNFTMetadata");
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
| **id** | **String**| NFT ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  * X-Request-ID -  <br>  |


## updateOwnershipTokens

> CompletableFuture<ApiResponse<Void>> updateOwnershipTokens updateOwnershipTokens(blockchainDescriptor, vaultAccountId, idempotencyKey)

Refresh vault account tokens

Updates all tokens and balances per blockchain and vault account. 

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String blockchainDescriptor = "ETH"; // String | Blockchain descriptor filter
        String vaultAccountId = "vaultAccountId_example"; // String | Vault account filter
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.nfts().updateOwnershipTokens(blockchainDescriptor, vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#updateOwnershipTokens");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#updateOwnershipTokens");
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
| **blockchainDescriptor** | **String**| Blockchain descriptor filter | [enum: ETH, ETH_TEST5, ETH_TEST6, POLYGON, POLYGON_TEST_MUMBAI, AMOY_POLYGON_TEST, BASECHAIN_ETH] |
| **vaultAccountId** | **String**| Vault account filter | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  * X-Request-ID -  <br>  |


## updateTokenOwnershipStatus

> CompletableFuture<ApiResponse<Void>> updateTokenOwnershipStatus updateTokenOwnershipStatus(updateTokenOwnershipStatusDto, id, idempotencyKey)

Update token ownership status

Updates token status for a tenant, in all tenant vaults. 

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpdateTokenOwnershipStatusDto updateTokenOwnershipStatusDto = new UpdateTokenOwnershipStatusDto(); // UpdateTokenOwnershipStatusDto | 
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.nfts().updateTokenOwnershipStatus(updateTokenOwnershipStatusDto, id, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#updateTokenOwnershipStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#updateTokenOwnershipStatus");
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
| **updateTokenOwnershipStatusDto** | [**UpdateTokenOwnershipStatusDto**](UpdateTokenOwnershipStatusDto.md)|  | |
| **id** | **String**| NFT ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |


## updateTokensOwnershipSpam

> CompletableFuture<ApiResponse<Void>> updateTokensOwnershipSpam updateTokensOwnershipSpam(tokenOwnershipSpamUpdatePayload, idempotencyKey)

Update tokens ownership spam property

Updates tokens spam property for a tenant&#39;s token ownerships, in all tenant vaults.

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        List<TokenOwnershipSpamUpdatePayload> tokenOwnershipSpamUpdatePayload = Arrays.asList(); // List<TokenOwnershipSpamUpdatePayload> | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.nfts().updateTokensOwnershipSpam(tokenOwnershipSpamUpdatePayload, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#updateTokensOwnershipSpam");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#updateTokensOwnershipSpam");
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
| **tokenOwnershipSpamUpdatePayload** | [**List&lt;TokenOwnershipSpamUpdatePayload&gt;**](TokenOwnershipSpamUpdatePayload.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All token spam properties have been updated |  * X-Request-ID -  <br>  |
| **400** | Invalid data sent |  * X-Request-ID -  <br>  |
| **404** | When ownership for token ID is not found |  * X-Request-ID -  <br>  |


## updateTokensOwnershipStatus

> CompletableFuture<ApiResponse<Void>> updateTokensOwnershipStatus updateTokensOwnershipStatus(tokenOwnershipStatusUpdatePayload, idempotencyKey)

Update tokens ownership status

Updates tokens status for a tenant, in all tenant vaults.

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
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        List<TokenOwnershipStatusUpdatePayload> tokenOwnershipStatusUpdatePayload = Arrays.asList(); // List<TokenOwnershipStatusUpdatePayload> | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.nfts().updateTokensOwnershipStatus(tokenOwnershipStatusUpdatePayload, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NftsApi#updateTokensOwnershipStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#updateTokensOwnershipStatus");
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
| **tokenOwnershipStatusUpdatePayload** | [**List&lt;TokenOwnershipStatusUpdatePayload&gt;**](TokenOwnershipStatusUpdatePayload.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All token statuses have been updated |  * X-Request-ID -  <br>  |
| **400** | Invalid data sent |  * X-Request-ID -  <br>  |
| **404** | When ownership for token ID is not found |  * X-Request-ID -  <br>  |

