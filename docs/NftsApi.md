# NftsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNFT**](NftsApi.md#getNFT) | **GET** /nfts/tokens/{id} | List token data by ID |
| [**getNFTs**](NftsApi.md#getNFTs) | **GET** /nfts/tokens | List tokens by IDs |
| [**getOwnershipTokens**](NftsApi.md#getOwnershipTokens) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated) |
| [**listOwnedCollections**](NftsApi.md#listOwnedCollections) | **GET** /nfts/ownership/collections | List owned collections (paginated) |
| [**refreshNFTMetadata**](NftsApi.md#refreshNFTMetadata) | **PUT** /nfts/tokens/{id} | Refresh token metadata |
| [**updateOwnershipTokens**](NftsApi.md#updateOwnershipTokens) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens |
| [**updateTokenOwnershipStatus**](NftsApi.md#updateTokenOwnershipStatus) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status |



## getNFT

> TokenResponse getNFT(id)

List token data by ID

Returns the requested token data.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.NftsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        NftsApi apiInstance = new NftsApi(configuration);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        try {
            TokenResponse result = apiInstance.getNFT(id);
            System.out.println(result);
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

[**TokenResponse**](TokenResponse.md)

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

> GetNFTs200Response getNFTs(ids, pageCursor, pageSize, sort, order)

List tokens by IDs

Returns the requested tokens data.


### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.NftsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        NftsApi apiInstance = new NftsApi(configuration);
        String ids = "ids_example"; // String | A comma separated list of NFT IDs. Up to 100 are allowed in a single request.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        try {
            GetNFTs200Response result = apiInstance.getNFTs(ids, pageCursor, pageSize, sort, order);
            System.out.println(result);
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
| **sort** | **List&lt;String&gt;**| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: collection.name, name, blockchainDescriptor] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |

### Return type

[**GetNFTs200Response**](GetNFTs200Response.md)

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

> GetOwnershipTokens200Response getOwnershipTokens(blockchainDescriptor, vaultAccountIds, ids, collectionIds, pageCursor, pageSize, sort, order, status, search)

List all owned tokens (paginated)

Returns all tokens and their data in your workspace.


### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.NftsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        NftsApi apiInstance = new NftsApi(configuration);
        String blockchainDescriptor = "ETH"; // String | Blockchain descriptor filter
        String vaultAccountIds = "vaultAccountIds_example"; // String | A comma separated list of Vault Account IDs. Up to 100 are allowed in a single request
        String ids = "ids_example"; // String | A comma separated list of NFT IDs. Up to 100 are allowed in a single request.
        String collectionIds = "collectionIds_example"; // String | A comma separated list of collection IDs. Up to 100 are allowed in a single request.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        String status = "LISTED"; // String | Token ownership status
        String search = "search_example"; // String | Search owned tokens and their collections. Possible criteria for search:  token name and id within the contract/collection, collection name, blockchain descriptor and name.
        try {
            GetOwnershipTokens200Response result = apiInstance.getOwnershipTokens(blockchainDescriptor, vaultAccountIds, ids, collectionIds, pageCursor, pageSize, sort, order, status, search);
            System.out.println(result);
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
| **blockchainDescriptor** | **String**| Blockchain descriptor filter | [optional] [enum: ETH, ETH_TEST3, POLYGON, POLYGON_TEST_MUMBAI] |
| **vaultAccountIds** | **String**| A comma separated list of Vault Account IDs. Up to 100 are allowed in a single request | [optional] |
| **ids** | **String**| A comma separated list of NFT IDs. Up to 100 are allowed in a single request. | [optional] |
| **collectionIds** | **String**| A comma separated list of collection IDs. Up to 100 are allowed in a single request. | [optional] |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 100) | [optional] |
| **sort** | **List&lt;String&gt;**| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: ownershipLastUpdateTime, name, collection.name, blockchainDescriptor] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |
| **status** | **String**| Token ownership status | [optional] [default to LISTED] [enum: LISTED, ARCHIVED] |
| **search** | **String**| Search owned tokens and their collections. Possible criteria for search:  token name and id within the contract/collection, collection name, blockchain descriptor and name. | [optional] |

### Return type

[**GetOwnershipTokens200Response**](GetOwnershipTokens200Response.md)

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

> ListOwnedCollections200Response listOwnedCollections(search, pageCursor, pageSize, sort, order)

List owned collections (paginated)

Returns all collections in your workspace


### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.NftsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        NftsApi apiInstance = new NftsApi(configuration);
        String search = "search_example"; // String | Search owned collections. Possible criteria for search: collection name, collection contract address.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        try {
            ListOwnedCollections200Response result = apiInstance.listOwnedCollections(search, pageCursor, pageSize, sort, order);
            System.out.println(result);
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
| **search** | **String**| Search owned collections. Possible criteria for search: collection name, collection contract address. | [optional] |
| **pageCursor** | **String**| Page cursor to fetch | [optional] |
| **pageSize** | **BigDecimal**| Items per page (max 100) | [optional] |
| **sort** | **List&lt;String&gt;**| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: name] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |

### Return type

[**ListOwnedCollections200Response**](ListOwnedCollections200Response.md)

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

> refreshNFTMetadata(id)

Refresh token metadata

Updates the latest token metadata.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.NftsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        NftsApi apiInstance = new NftsApi(configuration);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        try {
            apiInstance.refreshNFTMetadata(id);
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

### Return type

null (empty response body)

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

> updateOwnershipTokens(blockchainDescriptor, vaultAccountId)

Refresh vault account tokens

Updates all tokens and balances per blockchain and vault account.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.NftsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        NftsApi apiInstance = new NftsApi(configuration);
        String blockchainDescriptor = "ETH"; // String | Blockchain descriptor filter
        String vaultAccountId = "vaultAccountId_example"; // String | Vault account filter
        try {
            apiInstance.updateOwnershipTokens(blockchainDescriptor, vaultAccountId);
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
| **blockchainDescriptor** | **String**| Blockchain descriptor filter | [enum: ETH, ETH_TEST3, POLYGON, POLYGON_TEST_MUMBAI] |
| **vaultAccountId** | **String**| Vault account filter | |

### Return type

null (empty response body)

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

> updateTokenOwnershipStatus(id, updateTokenOwnershipStatusDto)

Update token ownership status

Updates token ownership status for a tenant, in all tenant vaults.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.NftsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        NftsApi apiInstance = new NftsApi(configuration);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        UpdateTokenOwnershipStatusDto updateTokenOwnershipStatusDto = new UpdateTokenOwnershipStatusDto(); // UpdateTokenOwnershipStatusDto | 
        try {
            apiInstance.updateTokenOwnershipStatus(id, updateTokenOwnershipStatusDto);
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
| **id** | **String**| NFT ID | |
| **updateTokenOwnershipStatusDto** | [**UpdateTokenOwnershipStatusDto**](UpdateTokenOwnershipStatusDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  * X-Request-ID -  <br>  |

