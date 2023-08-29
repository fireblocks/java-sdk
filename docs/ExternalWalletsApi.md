# ExternalWalletsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAssetToExternalWallet**](ExternalWalletsApi.md#addAssetToExternalWallet) | **POST** /external_wallets/{walletId}/{assetId} | Add an asset to an external wallet. |
| [**createExternalWallet**](ExternalWalletsApi.md#createExternalWallet) | **POST** /external_wallets | Create an external wallet |
| [**deleteExternalWallet**](ExternalWalletsApi.md#deleteExternalWallet) | **DELETE** /external_wallets/{walletId} | Delete an external wallet |
| [**getAssetInExternalWallet**](ExternalWalletsApi.md#getAssetInExternalWallet) | **GET** /external_wallets/{walletId}/{assetId} | Get an asset from an external wallet |
| [**getExternalWalletById**](ExternalWalletsApi.md#getExternalWalletById) | **GET** /external_wallets/{walletId} | Find an external wallet |
| [**getExternalWallets**](ExternalWalletsApi.md#getExternalWallets) | **GET** /external_wallets | List external wallets |
| [**removeAssetFromExternalWallet**](ExternalWalletsApi.md#removeAssetFromExternalWallet) | **DELETE** /external_wallets/{walletId}/{assetId} | Delete an asset from an external wallet |
| [**setCustomerRefIdForExternalWallet**](ExternalWalletsApi.md#setCustomerRefIdForExternalWallet) | **POST** /external_wallets/{walletId}/set_customer_ref_id | Set an AML customer reference ID for an external wallet |



## addAssetToExternalWallet

> ExternalWalletAsset addAssetToExternalWallet(walletId, assetId, addAssetToExternalWalletRequest)

Add an asset to an external wallet.

Adds an asset to an existing external wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ExternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(configuration);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to add
        AddAssetToExternalWalletRequest addAssetToExternalWalletRequest = new AddAssetToExternalWalletRequest(); // AddAssetToExternalWalletRequest | 
        try {
            ExternalWalletAsset result = apiInstance.addAssetToExternalWallet(walletId, assetId, addAssetToExternalWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#addAssetToExternalWallet");
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
| **addAssetToExternalWalletRequest** | [**AddAssetToExternalWalletRequest**](AddAssetToExternalWalletRequest.md)|  | [optional] |

### Return type

[**ExternalWalletAsset**](ExternalWalletAsset.md)

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


## createExternalWallet

> UnmanagedWallet createExternalWallet(createInternalWalletRequest)

Create an external wallet

Creates a new external wallet with the requested name.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ExternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(configuration);
        CreateInternalWalletRequest createInternalWalletRequest = new CreateInternalWalletRequest(); // CreateInternalWalletRequest | 
        try {
            UnmanagedWallet result = apiInstance.createExternalWallet(createInternalWalletRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#createExternalWallet");
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
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteExternalWallet

> deleteExternalWallet(walletId)

Delete an external wallet

Deletes an external wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ExternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(configuration);
        String walletId = "walletId_example"; // String | The ID of the wallet to delete
        try {
            apiInstance.deleteExternalWallet(walletId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#deleteExternalWallet");
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


## getAssetInExternalWallet

> ExternalWalletAsset getAssetInExternalWallet(walletId, assetId)

Get an asset from an external wallet

Returns an external wallet by wallet ID and asset ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ExternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(configuration);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            ExternalWalletAsset result = apiInstance.getAssetInExternalWallet(walletId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getAssetInExternalWallet");
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

[**ExternalWalletAsset**](ExternalWalletAsset.md)

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


## getExternalWalletById

> UnmanagedWallet getExternalWalletById(walletId)

Find an external wallet

Returns an external wallet by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ExternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(configuration);
        String walletId = "walletId_example"; // String | The ID of the wallet to return
        try {
            UnmanagedWallet result = apiInstance.getExternalWalletById(walletId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWalletById");
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


## getExternalWallets

> List&lt;UnmanagedWallet&gt; getExternalWallets()

List external wallets

Gets a list of external wallets under the workspace.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ExternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(configuration);
        try {
            List<UnmanagedWallet> result = apiInstance.getExternalWallets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#getExternalWallets");
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
| **200** | A list of external wallets |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## removeAssetFromExternalWallet

> removeAssetFromExternalWallet(walletId, assetId)

Delete an asset from an external wallet

Deletes an external wallet asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ExternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(configuration);
        String walletId = "walletId_example"; // String | The ID of the wallet
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            apiInstance.removeAssetFromExternalWallet(walletId, assetId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#removeAssetFromExternalWallet");
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


## setCustomerRefIdForExternalWallet

> setCustomerRefIdForExternalWallet(walletId, setCustomerRefIdForVaultAccountRequest)

Set an AML customer reference ID for an external wallet

Sets an AML/KYT customer reference ID for the specific external wallet.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ExternalWalletsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ExternalWalletsApi apiInstance = new ExternalWalletsApi(configuration);
        String walletId = "walletId_example"; // String | The wallet ID
        SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest = new SetCustomerRefIdForVaultAccountRequest(); // SetCustomerRefIdForVaultAccountRequest | 
        try {
            apiInstance.setCustomerRefIdForExternalWallet(walletId, setCustomerRefIdForVaultAccountRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalWalletsApi#setCustomerRefIdForExternalWallet");
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

