# VaultsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateAssetForVaultAccount**](VaultsApi.md#activateAssetForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account |
| [**createLegacyAddressForVaultAccountAsset**](VaultsApi.md#createLegacyAddressForVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format |
| [**createVaultAccount**](VaultsApi.md#createVaultAccount) | **POST** /vault/accounts | Create a new vault account |
| [**createVaultAccountAsset**](VaultsApi.md#createVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet |
| [**createVaultAccountAssetAddress**](VaultsApi.md#createVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address |
| [**getAssetWallets**](VaultsApi.md#getAssetWallets) | **GET** /vault/asset_wallets | List asset wallets (Paginated) |
| [**getMaxSpendableAmount**](VaultsApi.md#getMaxSpendableAmount) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount | Get the maximum spendable amount in a single transaction. |
| [**getPagedVaultAccounts**](VaultsApi.md#getPagedVaultAccounts) | **GET** /vault/accounts_paged | List vault acounts (Paginated) |
| [**getPublicKeyInfo**](VaultsApi.md#getPublicKeyInfo) | **GET** /vault/public_key_info/ | Get the public key information |
| [**getPublicKeyInfoForAddress**](VaultsApi.md#getPublicKeyInfoForAddress) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key for a vault account |
| [**getVaultAccountAsset**](VaultsApi.md#getVaultAccountAsset) | **GET** /vault/accounts/{vaultAccountId}/{assetId} | Get the asset balance for a vault account |
| [**getVaultAccountAssetAddresses**](VaultsApi.md#getVaultAccountAssetAddresses) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Get asset addresses |
| [**getVaultAccountAssetUnspentInputs**](VaultsApi.md#getVaultAccountAssetUnspentInputs) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs | Get UTXO unspent inputs information |
| [**getVaultAccountById**](VaultsApi.md#getVaultAccountById) | **GET** /vault/accounts/{vaultAccountId} | Find a vault account by ID |
| [**getVaultAccounts**](VaultsApi.md#getVaultAccounts) | **GET** /vault/accounts | List vault accounts |
| [**getVaultAssetById**](VaultsApi.md#getVaultAssetById) | **GET** /vault/assets/{assetId} | Get vault balance by asset |
| [**getVaultAssets**](VaultsApi.md#getVaultAssets) | **GET** /vault/assets | Get asset balance for chosen assets |
| [**hideVaultAccount**](VaultsApi.md#hideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/hide | Hide a vault account in the console |
| [**setAutoFuelForVaultAccount**](VaultsApi.md#setAutoFuelForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/set_auto_fuel | Turn autofueling on or off |
| [**setCustomerRefIdForVaultAccount**](VaultsApi.md#setCustomerRefIdForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/set_customer_ref_id | Set an AML/KYT customer reference ID for a vault account |
| [**setCustomerRefIdForVaultAccountAssetAddress**](VaultsApi.md#setCustomerRefIdForVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id | Assign AML customer reference ID |
| [**unhideVaultAccount**](VaultsApi.md#unhideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/unhide | Unhide a vault account in the console |
| [**updateVaultAccount**](VaultsApi.md#updateVaultAccount) | **PUT** /vault/accounts/{vaultAccountId} | Rename a vault account |
| [**updateVaultAccountAssetAddress**](VaultsApi.md#updateVaultAccountAssetAddress) | **PUT** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId} | Update address description |
| [**updateVaultAccountAssetBalance**](VaultsApi.md#updateVaultAccountAssetBalance) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/balance | Refresh asset balance data |



## activateAssetForVaultAccount

> CreateVaultAssetResponse activateAssetForVaultAccount(vaultAccountId, assetId)

Activate a wallet in a vault account

Initiates activation for a wallet in a vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CreateVaultAssetResponse result = apiInstance.activateAssetForVaultAccount(vaultAccountId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#activateAssetForVaultAccount");
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
| **vaultAccountId** | **String**| The ID of the vault account to return, or &#39;default&#39; for the default vault account | |
| **assetId** | **String**| The ID of the asset | |

### Return type

[**CreateVaultAssetResponse**](CreateVaultAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createLegacyAddressForVaultAccountAsset

> CreateAddressResponse createLegacyAddressForVaultAccountAsset(vaultAccountId, assetId, addressId)

Convert a segwit address to legacy format

Converts an existing segwit address to the legacy format.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The segwit address to translate
        try {
            CreateAddressResponse result = apiInstance.createLegacyAddressForVaultAccountAsset(vaultAccountId, assetId, addressId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createLegacyAddressForVaultAccountAsset");
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
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |
| **addressId** | **String**| The segwit address to translate | |

### Return type

[**CreateAddressResponse**](CreateAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created address |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createVaultAccount

> VaultAccount createVaultAccount(createVaultAccountRequest)

Create a new vault account

Creates a new vault account with the requested name.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        CreateVaultAccountRequest createVaultAccountRequest = new CreateVaultAccountRequest(); // CreateVaultAccountRequest | 
        try {
            VaultAccount result = apiInstance.createVaultAccount(createVaultAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createVaultAccount");
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
| **createVaultAccountRequest** | [**CreateVaultAccountRequest**](CreateVaultAccountRequest.md)|  | |

### Return type

[**VaultAccount**](VaultAccount.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Vault Account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createVaultAccountAsset

> CreateVaultAssetResponse createVaultAccountAsset(vaultAccountId, assetId, createVaultAccountAssetRequest)

Create a new wallet

Creates a wallet for a specific asset in a vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        CreateVaultAccountAssetRequest createVaultAccountAssetRequest = new CreateVaultAccountAssetRequest(); // CreateVaultAccountAssetRequest | 
        try {
            CreateVaultAssetResponse result = apiInstance.createVaultAccountAsset(vaultAccountId, assetId, createVaultAccountAssetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createVaultAccountAsset");
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
| **vaultAccountId** | **String**| The ID of the vault account to return, or &#39;default&#39; for the default vault account | |
| **assetId** | **String**| The ID of the asset | |
| **createVaultAccountAssetRequest** | [**CreateVaultAccountAssetRequest**](CreateVaultAccountAssetRequest.md)|  | [optional] |

### Return type

[**CreateVaultAssetResponse**](CreateVaultAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createVaultAccountAssetAddress

> CreateAddressResponse createVaultAccountAssetAddress(vaultAccountId, assetId, createVaultAccountAssetAddressRequest)

Create new asset deposit address

Creates a new deposit address for an asset of a vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        CreateVaultAccountAssetAddressRequest createVaultAccountAssetAddressRequest = new CreateVaultAccountAssetAddressRequest(); // CreateVaultAccountAssetAddressRequest | 
        try {
            CreateAddressResponse result = apiInstance.createVaultAccountAssetAddress(vaultAccountId, assetId, createVaultAccountAssetAddressRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createVaultAccountAssetAddress");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |
| **createVaultAccountAssetAddressRequest** | [**CreateVaultAccountAssetAddressRequest**](CreateVaultAccountAssetAddressRequest.md)|  | [optional] |

### Return type

[**CreateAddressResponse**](CreateAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created address |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getAssetWallets

> PaginatedAssetWalletResponse getAssetWallets(totalAmountLargerThan, assetId, before, after, limit)

List asset wallets (Paginated)

Gets all asset wallets at all of the vault accounts in your workspace. An asset wallet is an asset at a vault account. This method allows fast traversal of all account balances. **Note:**   - This API endpoint is in limited availability and available for selected customers. If you would like to get early access to this endpoint, please reach out to [Fireblocks Support](https://support.fireblocks.io/hc/en-us/requests/new?ticket_form_id&#x3D;36000337220)   - This API call is subject to [rate limits](https://developers.fireblocks.com/reference/rate-limiting). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        BigDecimal totalAmountLargerThan = new BigDecimal(78); // BigDecimal | When specified, only asset wallets with total balance larger than this amount are returned.
        String assetId = "assetId_example"; // String | When specified, only asset wallets cross vault accounts that have this asset ID are returned.
        String before = "before_example"; // String | Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page.
        String after = "after_example"; // String | Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page.
        BigDecimal limit = new BigDecimal("200"); // BigDecimal | The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000.
        try {
            PaginatedAssetWalletResponse result = apiInstance.getAssetWallets(totalAmountLargerThan, assetId, before, after, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getAssetWallets");
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
| **totalAmountLargerThan** | **BigDecimal**| When specified, only asset wallets with total balance larger than this amount are returned. | [optional] |
| **assetId** | **String**| When specified, only asset wallets cross vault accounts that have this asset ID are returned. | [optional] |
| **before** | **String**| Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page. | [optional] |
| **after** | **String**| Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page. | [optional] |
| **limit** | **BigDecimal**| The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000. | [optional] [default to 200] |

### Return type

[**PaginatedAssetWalletResponse**](PaginatedAssetWalletResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A PaginatedAssetWalletResponse object |  * X-Request-ID -  <br>  |


## getMaxSpendableAmount

> getMaxSpendableAmount(vaultAccountId, assetId, manualSignging)

Get the maximum spendable amount in a single transaction.

Get the maximum amount of a particular asset that can be spent in a single transaction from a specified vault account (UTXO assets only, with a limitation on number of inputs embedded). Send several transactions if you want to spend more than the maximum spendable amount.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        Boolean manualSignging = true; // Boolean | False by default. The maximum number of inputs depends if the transaction will be signed by an automated co-signer server or on a mobile device.
        try {
            apiInstance.getMaxSpendableAmount(vaultAccountId, assetId, manualSignging);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getMaxSpendableAmount");
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
| **vaultAccountId** | **String**| The ID of the vault account, or &#39;default&#39; for the default vault account | |
| **assetId** | **String**| The ID of the asset | |
| **manualSignging** | **Boolean**| False by default. The maximum number of inputs depends if the transaction will be signed by an automated co-signer server or on a mobile device. | [optional] |

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
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getPagedVaultAccounts

> VaultAccountsPagedResponse getPagedVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId, maxBip44AddressIndexUsed, maxBip44ChangeAddressIndexUsed, orderBy, before, after, limit)

List vault acounts (Paginated)

Gets all vault accounts in your workspace. This endpoint returns a limited amount of results with a quick response time.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String namePrefix = "namePrefix_example"; // String | 
        String nameSuffix = "nameSuffix_example"; // String | 
        BigDecimal minAmountThreshold = new BigDecimal(78); // BigDecimal | 
        String assetId = "assetId_example"; // String | 
        BigDecimal maxBip44AddressIndexUsed = new BigDecimal(78); // BigDecimal | 
        BigDecimal maxBip44ChangeAddressIndexUsed = new BigDecimal(78); // BigDecimal | 
        String orderBy = "ASC"; // String | 
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        BigDecimal limit = new BigDecimal("200"); // BigDecimal | 
        try {
            VaultAccountsPagedResponse result = apiInstance.getPagedVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId, maxBip44AddressIndexUsed, maxBip44ChangeAddressIndexUsed, orderBy, before, after, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getPagedVaultAccounts");
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
| **namePrefix** | **String**|  | [optional] |
| **nameSuffix** | **String**|  | [optional] |
| **minAmountThreshold** | **BigDecimal**|  | [optional] |
| **assetId** | **String**|  | [optional] |
| **maxBip44AddressIndexUsed** | **BigDecimal**|  | [optional] |
| **maxBip44ChangeAddressIndexUsed** | **BigDecimal**|  | [optional] |
| **orderBy** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **before** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **BigDecimal**|  | [optional] [default to 200] |

### Return type

[**VaultAccountsPagedResponse**](VaultAccountsPagedResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAccountsPagedResponse object |  * X-Request-ID -  <br>  |


## getPublicKeyInfo

> PublicKeyInformation getPublicKeyInfo(derivationPath, algorithm, compressed)

Get the public key information

Gets the public key information based on derivation path and signing algorithm.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String derivationPath = "derivationPath_example"; // String | 
        String algorithm = "algorithm_example"; // String | 
        Boolean compressed = true; // Boolean | 
        try {
            PublicKeyInformation result = apiInstance.getPublicKeyInfo(derivationPath, algorithm, compressed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getPublicKeyInfo");
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
| **derivationPath** | **String**|  | |
| **algorithm** | **String**|  | |
| **compressed** | **Boolean**|  | [optional] |

### Return type

[**PublicKeyInformation**](PublicKeyInformation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public key information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getPublicKeyInfoForAddress

> PublicKeyInformation getPublicKeyInfoForAddress(vaultAccountId, assetId, change, addressIndex, compressed)

Get the public key for a vault account

Gets the public key information for the vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | 
        String assetId = "assetId_example"; // String | 
        BigDecimal change = new BigDecimal(78); // BigDecimal | 
        BigDecimal addressIndex = new BigDecimal(78); // BigDecimal | 
        Boolean compressed = true; // Boolean | 
        try {
            PublicKeyInformation result = apiInstance.getPublicKeyInfoForAddress(vaultAccountId, assetId, change, addressIndex, compressed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getPublicKeyInfoForAddress");
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
| **vaultAccountId** | **String**|  | |
| **assetId** | **String**|  | |
| **change** | **BigDecimal**|  | |
| **addressIndex** | **BigDecimal**|  | |
| **compressed** | **Boolean**|  | [optional] |

### Return type

[**PublicKeyInformation**](PublicKeyInformation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public Key Information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccountAsset

> VaultAsset getVaultAccountAsset(vaultAccountId, assetId)

Get the asset balance for a vault account

Returns a wallet for a specific asset of a vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            VaultAsset result = apiInstance.getVaultAccountAsset(vaultAccountId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccountAsset");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |

### Return type

[**VaultAsset**](VaultAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAsset object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccountAssetAddresses

> List&lt;VaultWalletAddress&gt; getVaultAccountAssetAddresses(vaultAccountId, assetId)

Get asset addresses

Lists all addresses for specific asset of vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            List<VaultWalletAddress> result = apiInstance.getVaultAccountAssetAddresses(vaultAccountId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccountAssetAddresses");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |

### Return type

[**List&lt;VaultWalletAddress&gt;**](VaultWalletAddress.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of deposit addresses |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccountAssetUnspentInputs

> List&lt;UnspentInputsResponse&gt; getVaultAccountAssetUnspentInputs(vaultAccountId, assetId)

Get UTXO unspent inputs information

Returns unspent inputs information of an asset in a vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            List<UnspentInputsResponse> result = apiInstance.getVaultAccountAssetUnspentInputs(vaultAccountId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccountAssetUnspentInputs");
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
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |

### Return type

[**List&lt;UnspentInputsResponse&gt;**](UnspentInputsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Unspent information per input |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccountById

> VaultAccount getVaultAccountById(vaultAccountId)

Find a vault account by ID

Returns the requested vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return type: string
        try {
            VaultAccount result = apiInstance.getVaultAccountById(vaultAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccountById");
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
| **vaultAccountId** | **String**| The ID of the vault account to return type: string | |

### Return type

[**VaultAccount**](VaultAccount.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Vault Account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccounts

> List&lt;VaultAccount&gt; getVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId, maxBip44AddressIndexUsed, maxBip44ChangeAddressIndexUsed)

List vault accounts

Gets all vault accounts in your workspace.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String namePrefix = "namePrefix_example"; // String | 
        String nameSuffix = "nameSuffix_example"; // String | 
        BigDecimal minAmountThreshold = new BigDecimal(78); // BigDecimal | 
        String assetId = "assetId_example"; // String | 
        BigDecimal maxBip44AddressIndexUsed = new BigDecimal(78); // BigDecimal | 
        BigDecimal maxBip44ChangeAddressIndexUsed = new BigDecimal(78); // BigDecimal | 
        try {
            List<VaultAccount> result = apiInstance.getVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId, maxBip44AddressIndexUsed, maxBip44ChangeAddressIndexUsed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccounts");
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
| **namePrefix** | **String**|  | [optional] |
| **nameSuffix** | **String**|  | [optional] |
| **minAmountThreshold** | **BigDecimal**|  | [optional] |
| **assetId** | **String**|  | [optional] |
| **maxBip44AddressIndexUsed** | **BigDecimal**|  | [optional] |
| **maxBip44ChangeAddressIndexUsed** | **BigDecimal**|  | [optional] |

### Return type

[**List&lt;VaultAccount&gt;**](VaultAccount.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of vault accounts |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAssetById

> VaultAsset getVaultAssetById(assetId)

Get vault balance by asset

Gets the vault balance summary for an asset.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String assetId = "assetId_example"; // String | 
        try {
            VaultAsset result = apiInstance.getVaultAssetById(assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAssetById");
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
| **assetId** | **String**|  | |

### Return type

[**VaultAsset**](VaultAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vault amount by asset |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAssets

> List&lt;VaultAsset&gt; getVaultAssets(accountNamePrefix, accountNameSuffix)

Get asset balance for chosen assets

Gets the assets amount summary for all accounts or filtered accounts.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String accountNamePrefix = "accountNamePrefix_example"; // String | 
        String accountNameSuffix = "accountNameSuffix_example"; // String | 
        try {
            List<VaultAsset> result = apiInstance.getVaultAssets(accountNamePrefix, accountNameSuffix);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAssets");
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
| **accountNamePrefix** | **String**|  | [optional] |
| **accountNameSuffix** | **String**|  | [optional] |

### Return type

[**List&lt;VaultAsset&gt;**](VaultAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Amount by asset |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## hideVaultAccount

> hideVaultAccount(vaultAccountId)

Hide a vault account in the console

Hides the requested vault account from the web console view.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account to hide
        try {
            apiInstance.hideVaultAccount(vaultAccountId);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#hideVaultAccount");
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
| **vaultAccountId** | **String**| The vault account to hide | |

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


## setAutoFuelForVaultAccount

> setAutoFuelForVaultAccount(vaultAccountId, setAutoFuelForVaultAccountRequest)

Turn autofueling on or off

Sets the autofueling property of the vault account to enabled or disabled.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account ID
        SetAutoFuelForVaultAccountRequest setAutoFuelForVaultAccountRequest = new SetAutoFuelForVaultAccountRequest(); // SetAutoFuelForVaultAccountRequest | 
        try {
            apiInstance.setAutoFuelForVaultAccount(vaultAccountId, setAutoFuelForVaultAccountRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setAutoFuelForVaultAccount");
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
| **vaultAccountId** | **String**| The vault account ID | |
| **setAutoFuelForVaultAccountRequest** | [**SetAutoFuelForVaultAccountRequest**](SetAutoFuelForVaultAccountRequest.md)|  | |

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


## setCustomerRefIdForVaultAccount

> setCustomerRefIdForVaultAccount(vaultAccountId, setCustomerRefIdForVaultAccountRequest)

Set an AML/KYT customer reference ID for a vault account

Assigns an AML/KYT customer reference ID for the vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account ID
        SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest = new SetCustomerRefIdForVaultAccountRequest(); // SetCustomerRefIdForVaultAccountRequest | 
        try {
            apiInstance.setCustomerRefIdForVaultAccount(vaultAccountId, setCustomerRefIdForVaultAccountRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setCustomerRefIdForVaultAccount");
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
| **vaultAccountId** | **String**| The vault account ID | |
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


## setCustomerRefIdForVaultAccountAssetAddress

> setCustomerRefIdForVaultAccountAssetAddress(vaultAccountId, assetId, addressId, setCustomerRefIdForVaultAccountRequest)

Assign AML customer reference ID

Sets an AML/KYT customer reference ID for a specific address.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The address for which to add a description. For XRP, use <address>:<tag>, for all other assets, use only the address
        SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest = new SetCustomerRefIdForVaultAccountRequest(); // SetCustomerRefIdForVaultAccountRequest | 
        try {
            apiInstance.setCustomerRefIdForVaultAccountAssetAddress(vaultAccountId, assetId, addressId, setCustomerRefIdForVaultAccountRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setCustomerRefIdForVaultAccountAssetAddress");
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
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |
| **addressId** | **String**| The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address | |
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


## unhideVaultAccount

> unhideVaultAccount(vaultAccountId)

Unhide a vault account in the console

Makes a hidden vault account visible in web console view.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account to unhide
        try {
            apiInstance.unhideVaultAccount(vaultAccountId);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#unhideVaultAccount");
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
| **vaultAccountId** | **String**| The vault account to unhide | |

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


## updateVaultAccount

> updateVaultAccount(vaultAccountId, updateVaultAccountRequest)

Rename a vault account

Renames the requested vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to edit
        UpdateVaultAccountRequest updateVaultAccountRequest = new UpdateVaultAccountRequest(); // UpdateVaultAccountRequest | 
        try {
            apiInstance.updateVaultAccount(vaultAccountId, updateVaultAccountRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#updateVaultAccount");
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
| **vaultAccountId** | **String**| The ID of the vault account to edit | |
| **updateVaultAccountRequest** | [**UpdateVaultAccountRequest**](UpdateVaultAccountRequest.md)|  | |

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


## updateVaultAccountAssetAddress

> updateVaultAccountAssetAddress(vaultAccountId, assetId, addressId, updateVaultAccountAssetAddressRequest)

Update address description

Updates the description of an existing address of an asset in a vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The address for which to add a description. For XRP, use <address>:<tag>, for all other assets, use only the address
        UpdateVaultAccountAssetAddressRequest updateVaultAccountAssetAddressRequest = new UpdateVaultAccountAssetAddressRequest(); // UpdateVaultAccountAssetAddressRequest | 
        try {
            apiInstance.updateVaultAccountAssetAddress(vaultAccountId, assetId, addressId, updateVaultAccountAssetAddressRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#updateVaultAccountAssetAddress");
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
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |
| **addressId** | **String**| The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address | |
| **updateVaultAccountAssetAddressRequest** | [**UpdateVaultAccountAssetAddressRequest**](UpdateVaultAccountAssetAddressRequest.md)|  | [optional] |

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


## updateVaultAccountAssetBalance

> VaultAsset updateVaultAccountAssetBalance(vaultAccountId, assetId, body)

Refresh asset balance data

Updates the balance of a specific asset in a vault account.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        Object body = null; // Object | 
        try {
            VaultAsset result = apiInstance.updateVaultAccountAssetBalance(vaultAccountId, assetId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#updateVaultAccountAssetBalance");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |
| **body** | **Object**|  | [optional] |

### Return type

[**VaultAsset**](VaultAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAsset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

