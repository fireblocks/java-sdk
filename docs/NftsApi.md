# NftsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNFT**](NftsApi.md#getNFT) | **GET** /nfts/tokens/{id} | List token data by ID |
| [**getNFTWithHttpInfo**](NftsApi.md#getNFTWithHttpInfo) | **GET** /nfts/tokens/{id} | List token data by ID |
| [**getNFTs**](NftsApi.md#getNFTs) | **GET** /nfts/tokens | List tokens by IDs |
| [**getNFTsWithHttpInfo**](NftsApi.md#getNFTsWithHttpInfo) | **GET** /nfts/tokens | List tokens by IDs |
| [**getOwnershipTokens**](NftsApi.md#getOwnershipTokens) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated) |
| [**getOwnershipTokensWithHttpInfo**](NftsApi.md#getOwnershipTokensWithHttpInfo) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated) |
| [**listOwnedCollections**](NftsApi.md#listOwnedCollections) | **GET** /nfts/ownership/collections | List owned collections (paginated) |
| [**listOwnedCollectionsWithHttpInfo**](NftsApi.md#listOwnedCollectionsWithHttpInfo) | **GET** /nfts/ownership/collections | List owned collections (paginated) |
| [**listOwnedTokens**](NftsApi.md#listOwnedTokens) | **GET** /nfts/ownership/assets | List all distinct owned tokens (paginated) |
| [**listOwnedTokensWithHttpInfo**](NftsApi.md#listOwnedTokensWithHttpInfo) | **GET** /nfts/ownership/assets | List all distinct owned tokens (paginated) |
| [**refreshNFTMetadata**](NftsApi.md#refreshNFTMetadata) | **PUT** /nfts/tokens/{id} | Refresh token metadata |
| [**refreshNFTMetadataWithHttpInfo**](NftsApi.md#refreshNFTMetadataWithHttpInfo) | **PUT** /nfts/tokens/{id} | Refresh token metadata |
| [**updateOwnershipTokens**](NftsApi.md#updateOwnershipTokens) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens |
| [**updateOwnershipTokensWithHttpInfo**](NftsApi.md#updateOwnershipTokensWithHttpInfo) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens |
| [**updateTokenOwnershipStatus**](NftsApi.md#updateTokenOwnershipStatus) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status |
| [**updateTokenOwnershipStatusWithHttpInfo**](NftsApi.md#updateTokenOwnershipStatusWithHttpInfo) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status |
| [**updateTokensOwnershipSpam**](NftsApi.md#updateTokensOwnershipSpam) | **PUT** /nfts/ownership/tokens/spam | Update tokens ownership spam property |
| [**updateTokensOwnershipSpamWithHttpInfo**](NftsApi.md#updateTokensOwnershipSpamWithHttpInfo) | **PUT** /nfts/ownership/tokens/spam | Update tokens ownership spam property |
| [**updateTokensOwnershipStatus**](NftsApi.md#updateTokensOwnershipStatus) | **PUT** /nfts/ownership/tokens/status | Update tokens ownership status |
| [**updateTokensOwnershipStatusWithHttpInfo**](NftsApi.md#updateTokensOwnershipStatusWithHttpInfo) | **PUT** /nfts/ownership/tokens/status | Update tokens ownership status |



## getNFT

> CompletableFuture<TokenResponse> getNFT(id)

List token data by ID

Returns the requested token data. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        try {
            CompletableFuture<TokenResponse> result = apiInstance.getNFT(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#getNFT");
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
| **id** | **String**| NFT ID | |

### Return type

CompletableFuture<[**TokenResponse**](TokenResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |

## getNFTWithHttpInfo

> CompletableFuture<ApiResponse<TokenResponse>> getNFT getNFTWithHttpInfo(id)

List token data by ID

Returns the requested token data. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        try {
            CompletableFuture<ApiResponse<TokenResponse>> response = apiInstance.getNFTWithHttpInfo(id);
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

> CompletableFuture<ListOwnedTokens200Response> getNFTs(ids, pageCursor, pageSize, sort, order)

List tokens by IDs

Returns the requested tokens data. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String ids = "ids_example"; // String | A comma separated list of NFT IDs. Up to 100 are allowed in a single request.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        try {
            CompletableFuture<ListOwnedTokens200Response> result = apiInstance.getNFTs(ids, pageCursor, pageSize, sort, order);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#getNFTs");
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
| **ids** | **String**| A comma separated list of NFT IDs. Up to 100 are allowed in a single request. | |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 100) | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: collection.name, name, blockchainDescriptor] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |

### Return type

CompletableFuture<[**ListOwnedTokens200Response**](ListOwnedTokens200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |

## getNFTsWithHttpInfo

> CompletableFuture<ApiResponse<ListOwnedTokens200Response>> getNFTs getNFTsWithHttpInfo(ids, pageCursor, pageSize, sort, order)

List tokens by IDs

Returns the requested tokens data. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String ids = "ids_example"; // String | A comma separated list of NFT IDs. Up to 100 are allowed in a single request.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        try {
            CompletableFuture<ApiResponse<ListOwnedTokens200Response>> response = apiInstance.getNFTsWithHttpInfo(ids, pageCursor, pageSize, sort, order);
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

CompletableFuture<ApiResponse<[**ListOwnedTokens200Response**](ListOwnedTokens200Response.md)>>


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

> CompletableFuture<GetOwnershipTokens200Response> getOwnershipTokens(blockchainDescriptor, vaultAccountIds, ncwId, ncwAccountIds, walletType, ids, collectionIds, pageCursor, pageSize, sort, order, status, search, spam)

List all owned tokens (paginated)

Returns all tokens and their data in your workspace. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
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
            CompletableFuture<GetOwnershipTokens200Response> result = apiInstance.getOwnershipTokens(blockchainDescriptor, vaultAccountIds, ncwId, ncwAccountIds, walletType, ids, collectionIds, pageCursor, pageSize, sort, order, status, search, spam);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#getOwnershipTokens");
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
| **blockchainDescriptor** | **String**| Blockchain descriptor filter | [optional] [enum: ETH, ETH_TEST3, ETH_TEST5, POLYGON, POLYGON_TEST_MUMBAI, XTZ, XTZ_TEST, BASECHAIN_ETH] |
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

CompletableFuture<[**GetOwnershipTokens200Response**](GetOwnershipTokens200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |

## getOwnershipTokensWithHttpInfo

> CompletableFuture<ApiResponse<GetOwnershipTokens200Response>> getOwnershipTokens getOwnershipTokensWithHttpInfo(blockchainDescriptor, vaultAccountIds, ncwId, ncwAccountIds, walletType, ids, collectionIds, pageCursor, pageSize, sort, order, status, search, spam)

List all owned tokens (paginated)

Returns all tokens and their data in your workspace. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
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
            CompletableFuture<ApiResponse<GetOwnershipTokens200Response>> response = apiInstance.getOwnershipTokensWithHttpInfo(blockchainDescriptor, vaultAccountIds, ncwId, ncwAccountIds, walletType, ids, collectionIds, pageCursor, pageSize, sort, order, status, search, spam);
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
| **blockchainDescriptor** | **String**| Blockchain descriptor filter | [optional] [enum: ETH, ETH_TEST3, ETH_TEST5, POLYGON, POLYGON_TEST_MUMBAI, XTZ, XTZ_TEST, BASECHAIN_ETH] |
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

CompletableFuture<ApiResponse<[**GetOwnershipTokens200Response**](GetOwnershipTokens200Response.md)>>


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

> CompletableFuture<ListOwnedCollections200Response> listOwnedCollections(ncwId, walletType, search, pageCursor, pageSize, sort, order, status)

List owned collections (paginated)

Returns all collections in your workspace 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String ncwId = "ncwId_example"; // String | Tenant's Non-Custodial Wallet ID
        String walletType = "VAULT_ACCOUNT"; // String | Wallet type, it can be `VAULT_ACCOUNT` or `END_USER_WALLET`
        String search = "search_example"; // String | Search owned collections. Possible criteria for search: collection name, collection contract address.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        String status = "LISTED"; // String | Token ownership status
        try {
            CompletableFuture<ListOwnedCollections200Response> result = apiInstance.listOwnedCollections(ncwId, walletType, search, pageCursor, pageSize, sort, order, status);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#listOwnedCollections");
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
| **ncwId** | **String**| Tenant&#39;s Non-Custodial Wallet ID | [optional] |
| **walletType** | **String**| Wallet type, it can be &#x60;VAULT_ACCOUNT&#x60; or &#x60;END_USER_WALLET&#x60; | [optional] [default to VAULT_ACCOUNT] [enum: VAULT_ACCOUNT, END_USER_WALLET] |
| **search** | **String**| Search owned collections. Possible criteria for search: collection name, collection contract address. | [optional] |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 100) | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: name] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |
| **status** | **String**| Token ownership status | [optional] [default to LISTED] [enum: LISTED, ARCHIVED] |

### Return type

CompletableFuture<[**ListOwnedCollections200Response**](ListOwnedCollections200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |

## listOwnedCollectionsWithHttpInfo

> CompletableFuture<ApiResponse<ListOwnedCollections200Response>> listOwnedCollections listOwnedCollectionsWithHttpInfo(ncwId, walletType, search, pageCursor, pageSize, sort, order, status)

List owned collections (paginated)

Returns all collections in your workspace 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String ncwId = "ncwId_example"; // String | Tenant's Non-Custodial Wallet ID
        String walletType = "VAULT_ACCOUNT"; // String | Wallet type, it can be `VAULT_ACCOUNT` or `END_USER_WALLET`
        String search = "search_example"; // String | Search owned collections. Possible criteria for search: collection name, collection contract address.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        String status = "LISTED"; // String | Token ownership status
        try {
            CompletableFuture<ApiResponse<ListOwnedCollections200Response>> response = apiInstance.listOwnedCollectionsWithHttpInfo(ncwId, walletType, search, pageCursor, pageSize, sort, order, status);
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

CompletableFuture<ApiResponse<[**ListOwnedCollections200Response**](ListOwnedCollections200Response.md)>>


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

> CompletableFuture<ListOwnedTokens200Response> listOwnedTokens(ncwId, walletType, pageCursor, pageSize, sort, order, status, search, spam)

List all distinct owned tokens (paginated)

Returns all owned distinct tokens (for your tenant) and their data in your workspace. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
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
            CompletableFuture<ListOwnedTokens200Response> result = apiInstance.listOwnedTokens(ncwId, walletType, pageCursor, pageSize, sort, order, status, search, spam);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#listOwnedTokens");
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

CompletableFuture<[**ListOwnedTokens200Response**](ListOwnedTokens200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |

## listOwnedTokensWithHttpInfo

> CompletableFuture<ApiResponse<ListOwnedTokens200Response>> listOwnedTokens listOwnedTokensWithHttpInfo(ncwId, walletType, pageCursor, pageSize, sort, order, status, search, spam)

List all distinct owned tokens (paginated)

Returns all owned distinct tokens (for your tenant) and their data in your workspace. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
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
            CompletableFuture<ApiResponse<ListOwnedTokens200Response>> response = apiInstance.listOwnedTokensWithHttpInfo(ncwId, walletType, pageCursor, pageSize, sort, order, status, search, spam);
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

CompletableFuture<ApiResponse<[**ListOwnedTokens200Response**](ListOwnedTokens200Response.md)>>


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

> CompletableFuture<Void> refreshNFTMetadata(id, idempotencyKey)

Refresh token metadata

Updates the latest token metadata. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.refreshNFTMetadata(id, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#refreshNFTMetadata");
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
| **id** | **String**| NFT ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  * X-Request-ID -  <br>  |

## refreshNFTMetadataWithHttpInfo

> CompletableFuture<ApiResponse<Void>> refreshNFTMetadata refreshNFTMetadataWithHttpInfo(id, idempotencyKey)

Refresh token metadata

Updates the latest token metadata. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.refreshNFTMetadataWithHttpInfo(id, idempotencyKey);
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

> CompletableFuture<Void> updateOwnershipTokens(blockchainDescriptor, vaultAccountId, idempotencyKey)

Refresh vault account tokens

Updates all tokens and balances per blockchain and vault account. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String blockchainDescriptor = "ETH"; // String | Blockchain descriptor filter
        String vaultAccountId = "vaultAccountId_example"; // String | Vault account filter
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.updateOwnershipTokens(blockchainDescriptor, vaultAccountId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#updateOwnershipTokens");
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
| **blockchainDescriptor** | **String**| Blockchain descriptor filter | [enum: ETH, ETH_TEST3, ETH_TEST5, POLYGON, POLYGON_TEST_MUMBAI, BASECHAIN_ETH] |
| **vaultAccountId** | **String**| Vault account filter | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  * X-Request-ID -  <br>  |

## updateOwnershipTokensWithHttpInfo

> CompletableFuture<ApiResponse<Void>> updateOwnershipTokens updateOwnershipTokensWithHttpInfo(blockchainDescriptor, vaultAccountId, idempotencyKey)

Refresh vault account tokens

Updates all tokens and balances per blockchain and vault account. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        String blockchainDescriptor = "ETH"; // String | Blockchain descriptor filter
        String vaultAccountId = "vaultAccountId_example"; // String | Vault account filter
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.updateOwnershipTokensWithHttpInfo(blockchainDescriptor, vaultAccountId, idempotencyKey);
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
| **blockchainDescriptor** | **String**| Blockchain descriptor filter | [enum: ETH, ETH_TEST3, ETH_TEST5, POLYGON, POLYGON_TEST_MUMBAI, BASECHAIN_ETH] |
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

> CompletableFuture<Void> updateTokenOwnershipStatus(updateTokenOwnershipStatusDto, id, idempotencyKey)

Update token ownership status

Updates token status for a tenant, in all tenant vaults. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        UpdateTokenOwnershipStatusDto updateTokenOwnershipStatusDto = new UpdateTokenOwnershipStatusDto(); // UpdateTokenOwnershipStatusDto | 
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.updateTokenOwnershipStatus(updateTokenOwnershipStatusDto, id, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#updateTokenOwnershipStatus");
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
| **updateTokenOwnershipStatusDto** | [**UpdateTokenOwnershipStatusDto**](UpdateTokenOwnershipStatusDto.md)|  | |
| **id** | **String**| NFT ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |

## updateTokenOwnershipStatusWithHttpInfo

> CompletableFuture<ApiResponse<Void>> updateTokenOwnershipStatus updateTokenOwnershipStatusWithHttpInfo(updateTokenOwnershipStatusDto, id, idempotencyKey)

Update token ownership status

Updates token status for a tenant, in all tenant vaults. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        UpdateTokenOwnershipStatusDto updateTokenOwnershipStatusDto = new UpdateTokenOwnershipStatusDto(); // UpdateTokenOwnershipStatusDto | 
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.updateTokenOwnershipStatusWithHttpInfo(updateTokenOwnershipStatusDto, id, idempotencyKey);
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

> CompletableFuture<Void> updateTokensOwnershipSpam(tokenOwnershipSpamUpdatePayload, idempotencyKey)

Update tokens ownership spam property

Updates tokens spam property for a tenant&#39;s token ownerships, in all tenant vaults.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        List<TokenOwnershipSpamUpdatePayload> tokenOwnershipSpamUpdatePayload = Arrays.asList(); // List<TokenOwnershipSpamUpdatePayload> | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.updateTokensOwnershipSpam(tokenOwnershipSpamUpdatePayload, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#updateTokensOwnershipSpam");
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
| **tokenOwnershipSpamUpdatePayload** | [**List&lt;TokenOwnershipSpamUpdatePayload&gt;**](TokenOwnershipSpamUpdatePayload.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## updateTokensOwnershipSpamWithHttpInfo

> CompletableFuture<ApiResponse<Void>> updateTokensOwnershipSpam updateTokensOwnershipSpamWithHttpInfo(tokenOwnershipSpamUpdatePayload, idempotencyKey)

Update tokens ownership spam property

Updates tokens spam property for a tenant&#39;s token ownerships, in all tenant vaults.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        List<TokenOwnershipSpamUpdatePayload> tokenOwnershipSpamUpdatePayload = Arrays.asList(); // List<TokenOwnershipSpamUpdatePayload> | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.updateTokensOwnershipSpamWithHttpInfo(tokenOwnershipSpamUpdatePayload, idempotencyKey);
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

> CompletableFuture<Void> updateTokensOwnershipStatus(tokenOwnershipStatusUpdatePayload, idempotencyKey)

Update tokens ownership status

Updates tokens status for a tenant, in all tenant vaults.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        List<TokenOwnershipStatusUpdatePayload> tokenOwnershipStatusUpdatePayload = Arrays.asList(); // List<TokenOwnershipStatusUpdatePayload> | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.updateTokensOwnershipStatus(tokenOwnershipStatusUpdatePayload, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsApi#updateTokensOwnershipStatus");
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
| **tokenOwnershipStatusUpdatePayload** | [**List&lt;TokenOwnershipStatusUpdatePayload&gt;**](TokenOwnershipStatusUpdatePayload.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## updateTokensOwnershipStatusWithHttpInfo

> CompletableFuture<ApiResponse<Void>> updateTokensOwnershipStatus updateTokensOwnershipStatusWithHttpInfo(tokenOwnershipStatusUpdatePayload, idempotencyKey)

Update tokens ownership status

Updates tokens status for a tenant, in all tenant vaults.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NftsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsApi apiInstance = new NftsApi(defaultClient);
        List<TokenOwnershipStatusUpdatePayload> tokenOwnershipStatusUpdatePayload = Arrays.asList(); // List<TokenOwnershipStatusUpdatePayload> | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.updateTokensOwnershipStatusWithHttpInfo(tokenOwnershipStatusUpdatePayload, idempotencyKey);
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

