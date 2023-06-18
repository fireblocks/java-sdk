# InternalWalletsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInternalWallet**](InternalWalletsApi.md#createInternalWallet) | **POST** /internal_wallets | Create an internal wallet |
| [**createInternalWalletAsset**](InternalWalletsApi.md#createInternalWalletAsset) | **POST** /internal_wallets/{walletId}/{assetId} | Add an asset to an internal wallet |
| [**deleteInternalWallet**](InternalWalletsApi.md#deleteInternalWallet) | **DELETE** /internal_wallets/{walletId} | Delete an internal wallet |
| [**deleteInternalWalletAsset**](InternalWalletsApi.md#deleteInternalWalletAsset) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address from an internal wallet |
| [**getInternalWalletAsset**](InternalWalletsApi.md#getInternalWalletAsset) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet |
| [**getInternalWalletById**](InternalWalletsApi.md#getInternalWalletById) | **GET** /internal_wallets/{walletId} | Get assets for internal wallet |
| [**getInternalWallets**](InternalWalletsApi.md#getInternalWallets) | **GET** /internal_wallets | List internal wallets |
| [**setCustomerRefIdForInternalWallet**](InternalWalletsApi.md#setCustomerRefIdForInternalWallet) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet |



## createInternalWallet

> UnmanagedWallet createInternalWallet(createInternalWalletRequest)

Create an internal wallet

Creates a new internal wallet with the requested name.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        CreateInternalWalletRequest createInternalWalletRequest = new CreateInternalWalletRequest(); // CreateInternalWalletRequest | 
        try {
            UnmanagedWallet result = apiInstance.createInternalWallet(createInternalWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#createInternalWallet");
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
| **createInternalWalletRequest** | [**CreateInternalWalletRequest**](CreateInternalWalletRequest.md)|  | [optional] |

### Return type

[**UnmanagedWallet**](UnmanagedWallet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A new wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createInternalWalletAsset

> WalletAsset createInternalWalletAsset(walletId, assetId, createInternalWalletAssetRequest)

Add an asset to an internal wallet

Adds an asset to an existing internal wallet.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to add
        CreateInternalWalletAssetRequest createInternalWalletAssetRequest = new CreateInternalWalletAssetRequest(); // CreateInternalWalletAssetRequest | 
        try {
            WalletAsset result = apiInstance.createInternalWalletAsset(walletId, assetId, createInternalWalletAssetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#createInternalWalletAsset");
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
| **walletId** | **String**| The ID of the wallet | |
| **assetId** | **String**| The ID of the asset to add | |
| **createInternalWalletAssetRequest** | [**CreateInternalWalletAssetRequest**](CreateInternalWalletAssetRequest.md)|  | [optional] |

### Return type

[**WalletAsset**](WalletAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteInternalWallet

> deleteInternalWallet(walletId)

Delete an internal wallet

Deletes an internal wallet by ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to delete
        try {
            apiInstance.deleteInternalWallet(walletId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#deleteInternalWallet");
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
| **walletId** | **String**| The ID of the wallet to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteInternalWalletAsset

> deleteInternalWalletAsset(walletId, assetId)

Delete a whitelisted address from an internal wallet

Deletes a whitelisted address (for an asset) from an internal wallet.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            apiInstance.deleteInternalWalletAsset(walletId, assetId);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#deleteInternalWalletAsset");
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
| **walletId** | **String**| The ID of the wallet | |
| **assetId** | **String**| The ID of the asset to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getInternalWalletAsset

> WalletAsset getInternalWalletAsset(walletId, assetId)

Get an asset from an internal wallet

Returns information for an asset in an internal wallet.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            WalletAsset result = apiInstance.getInternalWalletAsset(walletId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWalletAsset");
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
| **walletId** | **String**| The ID of the wallet | |
| **assetId** | **String**| The ID of the asset to return | |

### Return type

[**WalletAsset**](WalletAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getInternalWalletById

> UnmanagedWallet getInternalWalletById(walletId)

Get assets for internal wallet

Returns all assets in an internal wallet by ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The ID of the wallet to return
        try {
            UnmanagedWallet result = apiInstance.getInternalWalletById(walletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWalletById");
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
| **walletId** | **String**| The ID of the wallet to return | |

### Return type

[**UnmanagedWallet**](UnmanagedWallet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getInternalWallets

> List&lt;UnmanagedWallet&gt; getInternalWallets()

List internal wallets

Gets a list of internal wallets.  **Note**: BTC-based assets belonging to whitelisted addresses cannot be retrieved between 00:00 UTC and 00:01 UTC daily due to third-party provider, Blockchair, being unavailable for this 60 second period. Please wait until the next minute to retrieve BTC-based assets. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        try {
            List<UnmanagedWallet> result = apiInstance.getInternalWallets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#getInternalWallets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;UnmanagedWallet&gt;**](UnmanagedWallet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of internal wallets |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setCustomerRefIdForInternalWallet

> setCustomerRefIdForInternalWallet(walletId, setCustomerRefIdForVaultAccountRequest)

Set an AML/KYT customer reference ID for an internal wallet

Sets an AML/KYT customer reference ID for the specific internal wallet.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        InternalWalletsApi apiInstance = new InternalWalletsApi(defaultClient);
        String walletId = "walletId_example"; // String | The wallet ID
        SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest = new SetCustomerRefIdForVaultAccountRequest(); // SetCustomerRefIdForVaultAccountRequest | 
        try {
            apiInstance.setCustomerRefIdForInternalWallet(walletId, setCustomerRefIdForVaultAccountRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling InternalWalletsApi#setCustomerRefIdForInternalWallet");
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
| **walletId** | **String**| The wallet ID | |
| **setCustomerRefIdForVaultAccountRequest** | [**SetCustomerRefIdForVaultAccountRequest**](SetCustomerRefIdForVaultAccountRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

