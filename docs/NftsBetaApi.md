# NftsBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNFTTokenById**](NftsBetaApi.md#getNFTTokenById) | **GET** /nfts/tokens/{id} | List token data by ID |
| [**getNFTTokens**](NftsBetaApi.md#getNFTTokens) | **GET** /nfts/tokens | List tokens by IDs |
| [**getOwnershipTokens**](NftsBetaApi.md#getOwnershipTokens) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated) |
| [**updateNFTTokenById**](NftsBetaApi.md#updateNFTTokenById) | **PUT** /nfts/tokens/{id} | Refresh token metadata |
| [**updateNFTTokenStatus**](NftsBetaApi.md#updateNFTTokenStatus) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status |
| [**updateOwnershipTokens**](NftsBetaApi.md#updateOwnershipTokens) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens |



## getNFTTokenById

> TokenResponse getNFTTokenById(id)

List token data by ID

Returns the requested token data.  **Note**: This endpoint is now in Beta, disabled for general availability at this time.  To enroll in beta &amp; enable this endpoint, contact your Fireblocks Customer Success Manager or reach out to [CSM@fireblocks.com](mailto:CSM@fireblocks.com). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NftsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsBetaApi apiInstance = new NftsBetaApi(defaultClient);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        try {
            TokenResponse result = apiInstance.getNFTTokenById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsBetaApi#getNFTTokenById");
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


## getNFTTokens

> GetNFTTokens200Response getNFTTokens(ids, pageCursor, pageSize, sort, order)

List tokens by IDs

Returns the requested tokens data  **Note**: This endpoint is now in Beta, disabled for general availability at this time.  To enroll in beta &amp; enable this endpoint, contact your Fireblocks Customer Success Manager or reach out to [CSM@fireblocks.com](mailto:CSM@fireblocks.com). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NftsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsBetaApi apiInstance = new NftsBetaApi(defaultClient);
        String ids = "ids_example"; // String | A comma separated list of NFT IDs. Up to 100 are allowed in a single request.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        try {
            GetNFTTokens200Response result = apiInstance.getNFTTokens(ids, pageCursor, pageSize, sort, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsBetaApi#getNFTTokens");
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
| **sort** | [**List&lt;String&gt;**](String.md)| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: collection.name, name] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |

### Return type

[**GetNFTTokens200Response**](GetNFTTokens200Response.md)

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

> GetOwnershipTokens200Response getOwnershipTokens(blockchainDescriptor, vaultAccountIds, ids, collectionIds, pageCursor, pageSize, sort, order, status)

List all owned tokens (paginated)

Returns all tokens and their data in your workspace.  **Note**: This endpoint is now in Beta, disabled for general availability at this time.  To enroll in beta &amp; enable this endpoint, contact your Fireblocks Customer Success Manager or reach out to [CSM@fireblocks.com](mailto:CSM@fireblocks.com). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NftsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsBetaApi apiInstance = new NftsBetaApi(defaultClient);
        String blockchainDescriptor = "ETH"; // String | Blockchain descriptor filter
        String vaultAccountIds = "vaultAccountIds_example"; // String | A comma separated list of Vault Account IDs. Up to 100 are allowed in a single request
        String ids = "ids_example"; // String | A comma separated list of NFT IDs. Up to 100 are allowed in a single request.
        String collectionIds = "collectionIds_example"; // String | A comma separated list of collection IDs. Up to 100 are allowed in a single request.
        String pageCursor = "pageCursor_example"; // String | Page cursor to fetch
        BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Items per page (max 100)
        List<String> sort = Arrays.asList(); // List<String> | Sort by param, it can be one param or a list of params separated by comma
        String order = "DESC"; // String | Order direction, it can be `ASC` for ascending or `DESC` for descending
        String status = "LISTED"; // String | Token ownership status
        try {
            GetOwnershipTokens200Response result = apiInstance.getOwnershipTokens(blockchainDescriptor, vaultAccountIds, ids, collectionIds, pageCursor, pageSize, sort, order, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsBetaApi#getOwnershipTokens");
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
| **sort** | [**List&lt;String&gt;**](String.md)| Sort by param, it can be one param or a list of params separated by comma | [optional] [enum: ownershipLastUpdateTime, name, collection.name] |
| **order** | **String**| Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending | [optional] [default to ASC] [enum: DESC, ASC] |
| **status** | **String**| Token ownership status | [optional] [default to LISTED] [enum: LISTED, ARCHIVED] |

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


## updateNFTTokenById

> updateNFTTokenById(id)

Refresh token metadata

Updates the latest token metadata.  **Note**: This endpoint is now in Beta, disabled for general availability at this time.  To enroll in beta &amp; enable this endpoint, contact your Fireblocks Customer Success Manager or reach out to [CSM@fireblocks.com](mailto:CSM@fireblocks.com). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NftsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsBetaApi apiInstance = new NftsBetaApi(defaultClient);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        try {
            apiInstance.updateNFTTokenById(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsBetaApi#updateNFTTokenById");
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


## updateNFTTokenStatus

> updateNFTTokenStatus(id, updateTokenOwnershipStatusDto)

Update token ownership status

Updates token ownership status for a tenant, in all tenant vaults.  **Note**: This endpoint is now in Beta, disabled for general availability at this time.  To enroll in beta &amp; enable this endpoint, contact your Fireblocks Customer Success Manager or reach out to [CSM@fireblocks.com](mailto:CSM@fireblocks.com). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NftsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsBetaApi apiInstance = new NftsBetaApi(defaultClient);
        String id = "NFT-abcdefabcdefabcdefabcdefabcdefabcdefabcd"; // String | NFT ID
        UpdateTokenOwnershipStatusDto updateTokenOwnershipStatusDto = new UpdateTokenOwnershipStatusDto(); // UpdateTokenOwnershipStatusDto | 
        try {
            apiInstance.updateNFTTokenStatus(id, updateTokenOwnershipStatusDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsBetaApi#updateNFTTokenStatus");
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


## updateOwnershipTokens

> updateOwnershipTokens(blockchainDescriptor, vaultAccountId)

Refresh vault account tokens

Updates all tokens and balances per blockchain and vault account.  **Note**: This endpoint is now in Beta, disabled for general availability at this time.  To enroll in beta &amp; enable this endpoint, contact your Fireblocks Customer Success Manager or reach out to [CSM@fireblocks.com](mailto:CSM@fireblocks.com). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NftsBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NftsBetaApi apiInstance = new NftsBetaApi(defaultClient);
        String blockchainDescriptor = "ETH"; // String | Blockchain descriptor filter
        String vaultAccountId = "vaultAccountId_example"; // String | Vault account filter
        try {
            apiInstance.updateOwnershipTokens(blockchainDescriptor, vaultAccountId);
        } catch (ApiException e) {
            System.err.println("Exception when calling NftsBetaApi#updateOwnershipTokens");
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

