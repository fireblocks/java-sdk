# VaultsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateAssetForVaultAccount**](VaultsApi.md#activateAssetForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account |
| [**activateAssetForVaultAccountWithHttpInfo**](VaultsApi.md#activateAssetForVaultAccountWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account |
| [**createLegacyAddress**](VaultsApi.md#createLegacyAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format |
| [**createLegacyAddressWithHttpInfo**](VaultsApi.md#createLegacyAddressWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format |
| [**createMultipleAccounts**](VaultsApi.md#createMultipleAccounts) | **POST** /vault/accounts/bulk | Bulk creation of new vault accounts |
| [**createMultipleAccountsWithHttpInfo**](VaultsApi.md#createMultipleAccountsWithHttpInfo) | **POST** /vault/accounts/bulk | Bulk creation of new vault accounts |
| [**createVaultAccount**](VaultsApi.md#createVaultAccount) | **POST** /vault/accounts | Create a new vault account |
| [**createVaultAccountWithHttpInfo**](VaultsApi.md#createVaultAccountWithHttpInfo) | **POST** /vault/accounts | Create a new vault account |
| [**createVaultAccountAsset**](VaultsApi.md#createVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet |
| [**createVaultAccountAssetWithHttpInfo**](VaultsApi.md#createVaultAccountAssetWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet |
| [**createVaultAccountAssetAddress**](VaultsApi.md#createVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address |
| [**createVaultAccountAssetAddressWithHttpInfo**](VaultsApi.md#createVaultAccountAssetAddressWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address |
| [**getAssetWallets**](VaultsApi.md#getAssetWallets) | **GET** /vault/asset_wallets | List asset wallets (Paginated) |
| [**getAssetWalletsWithHttpInfo**](VaultsApi.md#getAssetWalletsWithHttpInfo) | **GET** /vault/asset_wallets | List asset wallets (Paginated) |
| [**getMaxSpendableAmount**](VaultsApi.md#getMaxSpendableAmount) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount | Get the maximum spendable amount in a single transaction. |
| [**getMaxSpendableAmountWithHttpInfo**](VaultsApi.md#getMaxSpendableAmountWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount | Get the maximum spendable amount in a single transaction. |
| [**getPagedVaultAccounts**](VaultsApi.md#getPagedVaultAccounts) | **GET** /vault/accounts_paged | List vault accounts (Paginated) |
| [**getPagedVaultAccountsWithHttpInfo**](VaultsApi.md#getPagedVaultAccountsWithHttpInfo) | **GET** /vault/accounts_paged | List vault accounts (Paginated) |
| [**getPublicKeyInfo**](VaultsApi.md#getPublicKeyInfo) | **GET** /vault/public_key_info | Get the public key information |
| [**getPublicKeyInfoWithHttpInfo**](VaultsApi.md#getPublicKeyInfoWithHttpInfo) | **GET** /vault/public_key_info | Get the public key information |
| [**getPublicKeyInfoForAddress**](VaultsApi.md#getPublicKeyInfoForAddress) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key for a vault account |
| [**getPublicKeyInfoForAddressWithHttpInfo**](VaultsApi.md#getPublicKeyInfoForAddressWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key for a vault account |
| [**getUnspentInputs**](VaultsApi.md#getUnspentInputs) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs | Get UTXO unspent inputs information |
| [**getUnspentInputsWithHttpInfo**](VaultsApi.md#getUnspentInputsWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs | Get UTXO unspent inputs information |
| [**getVaultAccount**](VaultsApi.md#getVaultAccount) | **GET** /vault/accounts/{vaultAccountId} | Find a vault account by ID |
| [**getVaultAccountWithHttpInfo**](VaultsApi.md#getVaultAccountWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId} | Find a vault account by ID |
| [**getVaultAccountAsset**](VaultsApi.md#getVaultAccountAsset) | **GET** /vault/accounts/{vaultAccountId}/{assetId} | Get the asset balance for a vault account |
| [**getVaultAccountAssetWithHttpInfo**](VaultsApi.md#getVaultAccountAssetWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId} | Get the asset balance for a vault account |
| [**getVaultAccountAssetAddresses**](VaultsApi.md#getVaultAccountAssetAddresses) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Get asset addresses |
| [**getVaultAccountAssetAddressesWithHttpInfo**](VaultsApi.md#getVaultAccountAssetAddressesWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Get asset addresses |
| [**getVaultAccountAssetAddressesPaginated**](VaultsApi.md#getVaultAccountAssetAddressesPaginated) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated | List addresses (Paginated) |
| [**getVaultAccountAssetAddressesPaginatedWithHttpInfo**](VaultsApi.md#getVaultAccountAssetAddressesPaginatedWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated | List addresses (Paginated) |
| [**getVaultAccounts**](VaultsApi.md#getVaultAccounts) | **GET** /vault/accounts | List vault accounts |
| [**getVaultAccountsWithHttpInfo**](VaultsApi.md#getVaultAccountsWithHttpInfo) | **GET** /vault/accounts | List vault accounts |
| [**getVaultAssets**](VaultsApi.md#getVaultAssets) | **GET** /vault/assets | Get asset balance for chosen assets |
| [**getVaultAssetsWithHttpInfo**](VaultsApi.md#getVaultAssetsWithHttpInfo) | **GET** /vault/assets | Get asset balance for chosen assets |
| [**getVaultBalanceByAsset**](VaultsApi.md#getVaultBalanceByAsset) | **GET** /vault/assets/{assetId} | Get vault balance by asset |
| [**getVaultBalanceByAssetWithHttpInfo**](VaultsApi.md#getVaultBalanceByAssetWithHttpInfo) | **GET** /vault/assets/{assetId} | Get vault balance by asset |
| [**hideVaultAccount**](VaultsApi.md#hideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/hide | Hide a vault account in the console |
| [**hideVaultAccountWithHttpInfo**](VaultsApi.md#hideVaultAccountWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/hide | Hide a vault account in the console |
| [**setCustomerRefIdForAddress**](VaultsApi.md#setCustomerRefIdForAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id | Assign AML customer reference ID |
| [**setCustomerRefIdForAddressWithHttpInfo**](VaultsApi.md#setCustomerRefIdForAddressWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id | Assign AML customer reference ID |
| [**setVaultAccountAutoFuel**](VaultsApi.md#setVaultAccountAutoFuel) | **POST** /vault/accounts/{vaultAccountId}/set_auto_fuel | Turn autofueling on or off |
| [**setVaultAccountAutoFuelWithHttpInfo**](VaultsApi.md#setVaultAccountAutoFuelWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/set_auto_fuel | Turn autofueling on or off |
| [**setVaultAccountCustomerRefId**](VaultsApi.md#setVaultAccountCustomerRefId) | **POST** /vault/accounts/{vaultAccountId}/set_customer_ref_id | Set an AML/KYT customer reference ID for a vault account |
| [**setVaultAccountCustomerRefIdWithHttpInfo**](VaultsApi.md#setVaultAccountCustomerRefIdWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/set_customer_ref_id | Set an AML/KYT customer reference ID for a vault account |
| [**unhideVaultAccount**](VaultsApi.md#unhideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/unhide | Unhide a vault account in the console |
| [**unhideVaultAccountWithHttpInfo**](VaultsApi.md#unhideVaultAccountWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/unhide | Unhide a vault account in the console |
| [**updateVaultAccount**](VaultsApi.md#updateVaultAccount) | **PUT** /vault/accounts/{vaultAccountId} | Rename a vault account |
| [**updateVaultAccountWithHttpInfo**](VaultsApi.md#updateVaultAccountWithHttpInfo) | **PUT** /vault/accounts/{vaultAccountId} | Rename a vault account |
| [**updateVaultAccountAssetAddress**](VaultsApi.md#updateVaultAccountAssetAddress) | **PUT** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId} | Update address description |
| [**updateVaultAccountAssetAddressWithHttpInfo**](VaultsApi.md#updateVaultAccountAssetAddressWithHttpInfo) | **PUT** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId} | Update address description |
| [**updateVaultAccountAssetBalance**](VaultsApi.md#updateVaultAccountAssetBalance) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/balance | Refresh asset balance data |
| [**updateVaultAccountAssetBalanceWithHttpInfo**](VaultsApi.md#updateVaultAccountAssetBalanceWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/balance | Refresh asset balance data |



## activateAssetForVaultAccount

> CompletableFuture<CreateVaultAssetResponse> activateAssetForVaultAccount(vaultAccountId, assetId, idempotencyKey)

Activate a wallet in a vault account

Initiates activation for a wallet in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<CreateVaultAssetResponse> result = apiInstance.activateAssetForVaultAccount(vaultAccountId, assetId, idempotencyKey);
            System.out.println(result.get());
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**CreateVaultAssetResponse**](CreateVaultAssetResponse.md)>


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

## activateAssetForVaultAccountWithHttpInfo

> CompletableFuture<ApiResponse<CreateVaultAssetResponse>> activateAssetForVaultAccount activateAssetForVaultAccountWithHttpInfo(vaultAccountId, assetId, idempotencyKey)

Activate a wallet in a vault account

Initiates activation for a wallet in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateVaultAssetResponse>> response = apiInstance.activateAssetForVaultAccountWithHttpInfo(vaultAccountId, assetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#activateAssetForVaultAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#activateAssetForVaultAccount");
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
| **vaultAccountId** | **String**| The ID of the vault account to return, or &#39;default&#39; for the default vault account | |
| **assetId** | **String**| The ID of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateVaultAssetResponse**](CreateVaultAssetResponse.md)>>


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


## createLegacyAddress

> CompletableFuture<CreateAddressResponse> createLegacyAddress(vaultAccountId, assetId, addressId, idempotencyKey)

Convert a segwit address to legacy format

Converts an existing segwit address to the legacy format.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The segwit address to translate
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<CreateAddressResponse> result = apiInstance.createLegacyAddress(vaultAccountId, assetId, addressId, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createLegacyAddress");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**CreateAddressResponse**](CreateAddressResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created address |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createLegacyAddressWithHttpInfo

> CompletableFuture<ApiResponse<CreateAddressResponse>> createLegacyAddress createLegacyAddressWithHttpInfo(vaultAccountId, assetId, addressId, idempotencyKey)

Convert a segwit address to legacy format

Converts an existing segwit address to the legacy format.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The segwit address to translate
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateAddressResponse>> response = apiInstance.createLegacyAddressWithHttpInfo(vaultAccountId, assetId, addressId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#createLegacyAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createLegacyAddress");
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
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |
| **addressId** | **String**| The segwit address to translate | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateAddressResponse**](CreateAddressResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created address |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createMultipleAccounts

> CompletableFuture<JobCreated> createMultipleAccounts(createMultipleAccountsRequest, idempotencyKey)

Bulk creation of new vault accounts

Create multiple vault accounts by running an async job. &lt;/br&gt; **Note**: - These endpoints are currently in beta and might be subject to changes. - We limit accounts to 10k per operation and 200k per customer during beta testing. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        CreateMultipleAccountsRequest createMultipleAccountsRequest = new CreateMultipleAccountsRequest(); // CreateMultipleAccountsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<JobCreated> result = apiInstance.createMultipleAccounts(createMultipleAccountsRequest, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createMultipleAccounts");
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
| **createMultipleAccountsRequest** | [**CreateMultipleAccountsRequest**](CreateMultipleAccountsRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**JobCreated**](JobCreated.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JobCreated object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createMultipleAccountsWithHttpInfo

> CompletableFuture<ApiResponse<JobCreated>> createMultipleAccounts createMultipleAccountsWithHttpInfo(createMultipleAccountsRequest, idempotencyKey)

Bulk creation of new vault accounts

Create multiple vault accounts by running an async job. &lt;/br&gt; **Note**: - These endpoints are currently in beta and might be subject to changes. - We limit accounts to 10k per operation and 200k per customer during beta testing. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        CreateMultipleAccountsRequest createMultipleAccountsRequest = new CreateMultipleAccountsRequest(); // CreateMultipleAccountsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<JobCreated>> response = apiInstance.createMultipleAccountsWithHttpInfo(createMultipleAccountsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#createMultipleAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createMultipleAccounts");
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
| **createMultipleAccountsRequest** | [**CreateMultipleAccountsRequest**](CreateMultipleAccountsRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**JobCreated**](JobCreated.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JobCreated object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createVaultAccount

> CompletableFuture<VaultAccount> createVaultAccount(createVaultAccountRequest, idempotencyKey)

Create a new vault account

Creates a new vault account with the requested name.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        CreateVaultAccountRequest createVaultAccountRequest = new CreateVaultAccountRequest(); // CreateVaultAccountRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<VaultAccount> result = apiInstance.createVaultAccount(createVaultAccountRequest, idempotencyKey);
            System.out.println(result.get());
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**VaultAccount**](VaultAccount.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Vault Account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createVaultAccountWithHttpInfo

> CompletableFuture<ApiResponse<VaultAccount>> createVaultAccount createVaultAccountWithHttpInfo(createVaultAccountRequest, idempotencyKey)

Create a new vault account

Creates a new vault account with the requested name.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        CreateVaultAccountRequest createVaultAccountRequest = new CreateVaultAccountRequest(); // CreateVaultAccountRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultAccount>> response = apiInstance.createVaultAccountWithHttpInfo(createVaultAccountRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#createVaultAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createVaultAccount");
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
| **createVaultAccountRequest** | [**CreateVaultAccountRequest**](CreateVaultAccountRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**VaultAccount**](VaultAccount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Vault Account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createVaultAccountAsset

> CompletableFuture<CreateVaultAssetResponse> createVaultAccountAsset(vaultAccountId, assetId, createAssetsRequest, idempotencyKey)

Create a new wallet

Creates a wallet for a specific asset in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        CreateAssetsRequest createAssetsRequest = new CreateAssetsRequest(); // CreateAssetsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<CreateVaultAssetResponse> result = apiInstance.createVaultAccountAsset(vaultAccountId, assetId, createAssetsRequest, idempotencyKey);
            System.out.println(result.get());
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
| **createAssetsRequest** | [**CreateAssetsRequest**](CreateAssetsRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**CreateVaultAssetResponse**](CreateVaultAssetResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createVaultAccountAssetWithHttpInfo

> CompletableFuture<ApiResponse<CreateVaultAssetResponse>> createVaultAccountAsset createVaultAccountAssetWithHttpInfo(vaultAccountId, assetId, createAssetsRequest, idempotencyKey)

Create a new wallet

Creates a wallet for a specific asset in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        CreateAssetsRequest createAssetsRequest = new CreateAssetsRequest(); // CreateAssetsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateVaultAssetResponse>> response = apiInstance.createVaultAccountAssetWithHttpInfo(vaultAccountId, assetId, createAssetsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#createVaultAccountAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createVaultAccountAsset");
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
| **vaultAccountId** | **String**| The ID of the vault account to return, or &#39;default&#39; for the default vault account | |
| **assetId** | **String**| The ID of the asset | |
| **createAssetsRequest** | [**CreateAssetsRequest**](CreateAssetsRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateVaultAssetResponse**](CreateVaultAssetResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createVaultAccountAssetAddress

> CompletableFuture<CreateAddressResponse> createVaultAccountAssetAddress(vaultAccountId, assetId, createAddressRequest, idempotencyKey)

Create new asset deposit address

Creates a new deposit address for an asset of a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        CreateAddressRequest createAddressRequest = new CreateAddressRequest(); // CreateAddressRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<CreateAddressResponse> result = apiInstance.createVaultAccountAssetAddress(vaultAccountId, assetId, createAddressRequest, idempotencyKey);
            System.out.println(result.get());
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
| **createAddressRequest** | [**CreateAddressRequest**](CreateAddressRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**CreateAddressResponse**](CreateAddressResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created address |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createVaultAccountAssetAddressWithHttpInfo

> CompletableFuture<ApiResponse<CreateAddressResponse>> createVaultAccountAssetAddress createVaultAccountAssetAddressWithHttpInfo(vaultAccountId, assetId, createAddressRequest, idempotencyKey)

Create new asset deposit address

Creates a new deposit address for an asset of a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        CreateAddressRequest createAddressRequest = new CreateAddressRequest(); // CreateAddressRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateAddressResponse>> response = apiInstance.createVaultAccountAssetAddressWithHttpInfo(vaultAccountId, assetId, createAddressRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#createVaultAccountAssetAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createVaultAccountAssetAddress");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |
| **createAddressRequest** | [**CreateAddressRequest**](CreateAddressRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateAddressResponse**](CreateAddressResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created address |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getAssetWallets

> CompletableFuture<PaginatedAssetWalletResponse> getAssetWallets(totalAmountLargerThan, assetId, orderBy, before, after, limit)

List asset wallets (Paginated)

Gets all asset wallets at all of the vault accounts in your workspace. An asset wallet is an asset at a vault account. This method allows fast traversal of all account balances. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        BigDecimal totalAmountLargerThan = new BigDecimal(78); // BigDecimal | When specified, only asset wallets with total balance larger than this amount are returned.
        String assetId = "assetId_example"; // String | When specified, only asset wallets cross vault accounts that have this asset ID are returned.
        String orderBy = "ASC"; // String | 
        String before = "before_example"; // String | Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page.
        String after = "after_example"; // String | Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page.
        BigDecimal limit = new BigDecimal("200"); // BigDecimal | The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000.
        try {
            CompletableFuture<PaginatedAssetWalletResponse> result = apiInstance.getAssetWallets(totalAmountLargerThan, assetId, orderBy, before, after, limit);
            System.out.println(result.get());
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
| **orderBy** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **before** | **String**| Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page. | [optional] |
| **after** | **String**| Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page. | [optional] |
| **limit** | **BigDecimal**| The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000. | [optional] [default to 200] |

### Return type

CompletableFuture<[**PaginatedAssetWalletResponse**](PaginatedAssetWalletResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A PaginatedAssetWalletResponse object |  * X-Request-ID -  <br>  |

## getAssetWalletsWithHttpInfo

> CompletableFuture<ApiResponse<PaginatedAssetWalletResponse>> getAssetWallets getAssetWalletsWithHttpInfo(totalAmountLargerThan, assetId, orderBy, before, after, limit)

List asset wallets (Paginated)

Gets all asset wallets at all of the vault accounts in your workspace. An asset wallet is an asset at a vault account. This method allows fast traversal of all account balances. 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        BigDecimal totalAmountLargerThan = new BigDecimal(78); // BigDecimal | When specified, only asset wallets with total balance larger than this amount are returned.
        String assetId = "assetId_example"; // String | When specified, only asset wallets cross vault accounts that have this asset ID are returned.
        String orderBy = "ASC"; // String | 
        String before = "before_example"; // String | Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page.
        String after = "after_example"; // String | Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page.
        BigDecimal limit = new BigDecimal("200"); // BigDecimal | The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000.
        try {
            CompletableFuture<ApiResponse<PaginatedAssetWalletResponse>> response = apiInstance.getAssetWalletsWithHttpInfo(totalAmountLargerThan, assetId, orderBy, before, after, limit);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getAssetWallets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getAssetWallets");
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
| **totalAmountLargerThan** | **BigDecimal**| When specified, only asset wallets with total balance larger than this amount are returned. | [optional] |
| **assetId** | **String**| When specified, only asset wallets cross vault accounts that have this asset ID are returned. | [optional] |
| **orderBy** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **before** | **String**| Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page. | [optional] |
| **after** | **String**| Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page. | [optional] |
| **limit** | **BigDecimal**| The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000. | [optional] [default to 200] |

### Return type

CompletableFuture<ApiResponse<[**PaginatedAssetWalletResponse**](PaginatedAssetWalletResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A PaginatedAssetWalletResponse object |  * X-Request-ID -  <br>  |


## getMaxSpendableAmount

> CompletableFuture<Void> getMaxSpendableAmount(vaultAccountId, assetId, manualSignging)

Get the maximum spendable amount in a single transaction.

Get the maximum amount of a particular asset that can be spent in a single transaction from a specified vault account (UTXO assets only, with a limitation on number of inputs embedded). Send several transactions if you want to spend more than the maximum spendable amount.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        Boolean manualSignging = true; // Boolean | False by default. The maximum number of inputs depends if the transaction will be signed by an automated co-signer server or on a mobile device.
        try {
            CompletableFuture<Void> result = apiInstance.getMaxSpendableAmount(vaultAccountId, assetId, manualSignging);
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


CompletableFuture<void> (empty response body)

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

## getMaxSpendableAmountWithHttpInfo

> CompletableFuture<ApiResponse<Void>> getMaxSpendableAmount getMaxSpendableAmountWithHttpInfo(vaultAccountId, assetId, manualSignging)

Get the maximum spendable amount in a single transaction.

Get the maximum amount of a particular asset that can be spent in a single transaction from a specified vault account (UTXO assets only, with a limitation on number of inputs embedded). Send several transactions if you want to spend more than the maximum spendable amount.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        Boolean manualSignging = true; // Boolean | False by default. The maximum number of inputs depends if the transaction will be signed by an automated co-signer server or on a mobile device.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.getMaxSpendableAmountWithHttpInfo(vaultAccountId, assetId, manualSignging);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getMaxSpendableAmount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getMaxSpendableAmount");
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
| **vaultAccountId** | **String**| The ID of the vault account, or &#39;default&#39; for the default vault account | |
| **assetId** | **String**| The ID of the asset | |
| **manualSignging** | **Boolean**| False by default. The maximum number of inputs depends if the transaction will be signed by an automated co-signer server or on a mobile device. | [optional] |

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
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getPagedVaultAccounts

> CompletableFuture<VaultAccountsPagedResponse> getPagedVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId, orderBy, before, after, limit)

List vault accounts (Paginated)

Gets all vault accounts in your workspace. This endpoint returns a limited amount of results with a quick response time.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String namePrefix = "namePrefix_example"; // String | 
        String nameSuffix = "nameSuffix_example"; // String | 
        BigDecimal minAmountThreshold = new BigDecimal(78); // BigDecimal | Specifying minAmountThreshold will filter accounts with balances greater than this value, otherwise, it will return all accounts.
        String assetId = "assetId_example"; // String | 
        String orderBy = "ASC"; // String | 
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        BigDecimal limit = new BigDecimal("200"); // BigDecimal | 
        try {
            CompletableFuture<VaultAccountsPagedResponse> result = apiInstance.getPagedVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId, orderBy, before, after, limit);
            System.out.println(result.get());
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
| **minAmountThreshold** | **BigDecimal**| Specifying minAmountThreshold will filter accounts with balances greater than this value, otherwise, it will return all accounts. | [optional] |
| **assetId** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **before** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **BigDecimal**|  | [optional] [default to 200] |

### Return type

CompletableFuture<[**VaultAccountsPagedResponse**](VaultAccountsPagedResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAccountsPagedResponse object |  * X-Request-ID -  <br>  |

## getPagedVaultAccountsWithHttpInfo

> CompletableFuture<ApiResponse<VaultAccountsPagedResponse>> getPagedVaultAccounts getPagedVaultAccountsWithHttpInfo(namePrefix, nameSuffix, minAmountThreshold, assetId, orderBy, before, after, limit)

List vault accounts (Paginated)

Gets all vault accounts in your workspace. This endpoint returns a limited amount of results with a quick response time.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String namePrefix = "namePrefix_example"; // String | 
        String nameSuffix = "nameSuffix_example"; // String | 
        BigDecimal minAmountThreshold = new BigDecimal(78); // BigDecimal | Specifying minAmountThreshold will filter accounts with balances greater than this value, otherwise, it will return all accounts.
        String assetId = "assetId_example"; // String | 
        String orderBy = "ASC"; // String | 
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        BigDecimal limit = new BigDecimal("200"); // BigDecimal | 
        try {
            CompletableFuture<ApiResponse<VaultAccountsPagedResponse>> response = apiInstance.getPagedVaultAccountsWithHttpInfo(namePrefix, nameSuffix, minAmountThreshold, assetId, orderBy, before, after, limit);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getPagedVaultAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getPagedVaultAccounts");
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
| **namePrefix** | **String**|  | [optional] |
| **nameSuffix** | **String**|  | [optional] |
| **minAmountThreshold** | **BigDecimal**| Specifying minAmountThreshold will filter accounts with balances greater than this value, otherwise, it will return all accounts. | [optional] |
| **assetId** | **String**|  | [optional] |
| **orderBy** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **before** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |
| **limit** | **BigDecimal**|  | [optional] [default to 200] |

### Return type

CompletableFuture<ApiResponse<[**VaultAccountsPagedResponse**](VaultAccountsPagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAccountsPagedResponse object |  * X-Request-ID -  <br>  |


## getPublicKeyInfo

> CompletableFuture<PublicKeyInformation> getPublicKeyInfo(derivationPath, algorithm, compressed)

Get the public key information

Gets the public key information based on derivation path and signing algorithm.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String derivationPath = "derivationPath_example"; // String | 
        String algorithm = "algorithm_example"; // String | 
        Boolean compressed = true; // Boolean | 
        try {
            CompletableFuture<PublicKeyInformation> result = apiInstance.getPublicKeyInfo(derivationPath, algorithm, compressed);
            System.out.println(result.get());
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

CompletableFuture<[**PublicKeyInformation**](PublicKeyInformation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public key information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getPublicKeyInfoWithHttpInfo

> CompletableFuture<ApiResponse<PublicKeyInformation>> getPublicKeyInfo getPublicKeyInfoWithHttpInfo(derivationPath, algorithm, compressed)

Get the public key information

Gets the public key information based on derivation path and signing algorithm.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String derivationPath = "derivationPath_example"; // String | 
        String algorithm = "algorithm_example"; // String | 
        Boolean compressed = true; // Boolean | 
        try {
            CompletableFuture<ApiResponse<PublicKeyInformation>> response = apiInstance.getPublicKeyInfoWithHttpInfo(derivationPath, algorithm, compressed);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getPublicKeyInfo");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getPublicKeyInfo");
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
| **derivationPath** | **String**|  | |
| **algorithm** | **String**|  | |
| **compressed** | **Boolean**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PublicKeyInformation**](PublicKeyInformation.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public key information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getPublicKeyInfoForAddress

> CompletableFuture<PublicKeyInformation> getPublicKeyInfoForAddress(vaultAccountId, assetId, change, addressIndex, compressed)

Get the public key for a vault account

Gets the public key information for the vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

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
            CompletableFuture<PublicKeyInformation> result = apiInstance.getPublicKeyInfoForAddress(vaultAccountId, assetId, change, addressIndex, compressed);
            System.out.println(result.get());
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

CompletableFuture<[**PublicKeyInformation**](PublicKeyInformation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public Key Information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getPublicKeyInfoForAddressWithHttpInfo

> CompletableFuture<ApiResponse<PublicKeyInformation>> getPublicKeyInfoForAddress getPublicKeyInfoForAddressWithHttpInfo(vaultAccountId, assetId, change, addressIndex, compressed)

Get the public key for a vault account

Gets the public key information for the vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

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
            CompletableFuture<ApiResponse<PublicKeyInformation>> response = apiInstance.getPublicKeyInfoForAddressWithHttpInfo(vaultAccountId, assetId, change, addressIndex, compressed);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getPublicKeyInfoForAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getPublicKeyInfoForAddress");
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
| **vaultAccountId** | **String**|  | |
| **assetId** | **String**|  | |
| **change** | **BigDecimal**|  | |
| **addressIndex** | **BigDecimal**|  | |
| **compressed** | **Boolean**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PublicKeyInformation**](PublicKeyInformation.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Public Key Information |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getUnspentInputs

> CompletableFuture<List<UnspentInputsResponse>> getUnspentInputs(vaultAccountId, assetId)

Get UTXO unspent inputs information

Returns unspent inputs information of an asset in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<List<UnspentInputsResponse>> result = apiInstance.getUnspentInputs(vaultAccountId, assetId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getUnspentInputs");
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

CompletableFuture<[**List&lt;UnspentInputsResponse&gt;**](UnspentInputsResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Unspent information per input |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getUnspentInputsWithHttpInfo

> CompletableFuture<ApiResponse<List<UnspentInputsResponse>>> getUnspentInputs getUnspentInputsWithHttpInfo(vaultAccountId, assetId)

Get UTXO unspent inputs information

Returns unspent inputs information of an asset in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<List<UnspentInputsResponse>>> response = apiInstance.getUnspentInputsWithHttpInfo(vaultAccountId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getUnspentInputs");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getUnspentInputs");
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
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |

### Return type

CompletableFuture<ApiResponse<[**List&lt;UnspentInputsResponse&gt;**](UnspentInputsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Unspent information per input |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccount

> CompletableFuture<VaultAccount> getVaultAccount(vaultAccountId)

Find a vault account by ID

Returns the requested vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return type: string
        try {
            CompletableFuture<VaultAccount> result = apiInstance.getVaultAccount(vaultAccountId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccount");
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

CompletableFuture<[**VaultAccount**](VaultAccount.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Vault Account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getVaultAccountWithHttpInfo

> CompletableFuture<ApiResponse<VaultAccount>> getVaultAccount getVaultAccountWithHttpInfo(vaultAccountId)

Find a vault account by ID

Returns the requested vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return type: string
        try {
            CompletableFuture<ApiResponse<VaultAccount>> response = apiInstance.getVaultAccountWithHttpInfo(vaultAccountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getVaultAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccount");
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
| **vaultAccountId** | **String**| The ID of the vault account to return type: string | |

### Return type

CompletableFuture<ApiResponse<[**VaultAccount**](VaultAccount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Vault Account object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccountAsset

> CompletableFuture<VaultAsset> getVaultAccountAsset(vaultAccountId, assetId)

Get the asset balance for a vault account

Returns a wallet for a specific asset of a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<VaultAsset> result = apiInstance.getVaultAccountAsset(vaultAccountId, assetId);
            System.out.println(result.get());
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

CompletableFuture<[**VaultAsset**](VaultAsset.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAsset object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getVaultAccountAssetWithHttpInfo

> CompletableFuture<ApiResponse<VaultAsset>> getVaultAccountAsset getVaultAccountAssetWithHttpInfo(vaultAccountId, assetId)

Get the asset balance for a vault account

Returns a wallet for a specific asset of a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<VaultAsset>> response = apiInstance.getVaultAccountAssetWithHttpInfo(vaultAccountId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getVaultAccountAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccountAsset");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |

### Return type

CompletableFuture<ApiResponse<[**VaultAsset**](VaultAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAsset object |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccountAssetAddresses

> CompletableFuture<List<VaultWalletAddress>> getVaultAccountAssetAddresses(vaultAccountId, assetId)

Get asset addresses

Lists all addresses for specific asset of vault account. - This endpoint will be deprecated on Mar 31,2024. - If your application logic or scripts rely on the deprecated endpoint, you should update to account for GET/V1/vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated before Mar 31,2024. - All workspaces created after Mar 31,2024. will have it disabled. If it is disabled for your workspace and you attempt to use it, you will receive the following error message: \&quot;This endpoint is unavailable. - Please use the GET/V1/vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated endpoint to return all the wallet addresses associated with the specified vault account and asset in a paginated list. - This API call is subject to rate limits.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<List<VaultWalletAddress>> result = apiInstance.getVaultAccountAssetAddresses(vaultAccountId, assetId);
            System.out.println(result.get());
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

CompletableFuture<[**List&lt;VaultWalletAddress&gt;**](VaultWalletAddress.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of deposit addresses |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getVaultAccountAssetAddressesWithHttpInfo

> CompletableFuture<ApiResponse<List<VaultWalletAddress>>> getVaultAccountAssetAddresses getVaultAccountAssetAddressesWithHttpInfo(vaultAccountId, assetId)

Get asset addresses

Lists all addresses for specific asset of vault account. - This endpoint will be deprecated on Mar 31,2024. - If your application logic or scripts rely on the deprecated endpoint, you should update to account for GET/V1/vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated before Mar 31,2024. - All workspaces created after Mar 31,2024. will have it disabled. If it is disabled for your workspace and you attempt to use it, you will receive the following error message: \&quot;This endpoint is unavailable. - Please use the GET/V1/vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated endpoint to return all the wallet addresses associated with the specified vault account and asset in a paginated list. - This API call is subject to rate limits.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<List<VaultWalletAddress>>> response = apiInstance.getVaultAccountAssetAddressesWithHttpInfo(vaultAccountId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getVaultAccountAssetAddresses");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccountAssetAddresses");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |

### Return type

CompletableFuture<ApiResponse<[**List&lt;VaultWalletAddress&gt;**](VaultWalletAddress.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of deposit addresses |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccountAssetAddressesPaginated

> CompletableFuture<PaginatedAddressResponse> getVaultAccountAssetAddressesPaginated(vaultAccountId, assetId, limit, before, after)

List addresses (Paginated)

Returns a paginated response of the addresses for a given vault account and asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        BigDecimal limit = new BigDecimal(78); // BigDecimal | 
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        try {
            CompletableFuture<PaginatedAddressResponse> result = apiInstance.getVaultAccountAssetAddressesPaginated(vaultAccountId, assetId, limit, before, after);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccountAssetAddressesPaginated");
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
| **limit** | **BigDecimal**|  | [optional] |
| **before** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |

### Return type

CompletableFuture<[**PaginatedAddressResponse**](PaginatedAddressResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of addresses, and pagination info. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getVaultAccountAssetAddressesPaginatedWithHttpInfo

> CompletableFuture<ApiResponse<PaginatedAddressResponse>> getVaultAccountAssetAddressesPaginated getVaultAccountAssetAddressesPaginatedWithHttpInfo(vaultAccountId, assetId, limit, before, after)

List addresses (Paginated)

Returns a paginated response of the addresses for a given vault account and asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        BigDecimal limit = new BigDecimal(78); // BigDecimal | 
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        try {
            CompletableFuture<ApiResponse<PaginatedAddressResponse>> response = apiInstance.getVaultAccountAssetAddressesPaginatedWithHttpInfo(vaultAccountId, assetId, limit, before, after);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getVaultAccountAssetAddressesPaginated");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccountAssetAddressesPaginated");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |
| **limit** | **BigDecimal**|  | [optional] |
| **before** | **String**|  | [optional] |
| **after** | **String**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**PaginatedAddressResponse**](PaginatedAddressResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of addresses, and pagination info. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAccounts

> CompletableFuture<List<VaultAccount>> getVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId)

List vault accounts

Gets all vault accounts in your workspace.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String namePrefix = "namePrefix_example"; // String | 
        String nameSuffix = "nameSuffix_example"; // String | 
        BigDecimal minAmountThreshold = new BigDecimal(78); // BigDecimal | 
        String assetId = "assetId_example"; // String | 
        try {
            CompletableFuture<List<VaultAccount>> result = apiInstance.getVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId);
            System.out.println(result.get());
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

### Return type

CompletableFuture<[**List&lt;VaultAccount&gt;**](VaultAccount.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of vault accounts |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getVaultAccountsWithHttpInfo

> CompletableFuture<ApiResponse<List<VaultAccount>>> getVaultAccounts getVaultAccountsWithHttpInfo(namePrefix, nameSuffix, minAmountThreshold, assetId)

List vault accounts

Gets all vault accounts in your workspace.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String namePrefix = "namePrefix_example"; // String | 
        String nameSuffix = "nameSuffix_example"; // String | 
        BigDecimal minAmountThreshold = new BigDecimal(78); // BigDecimal | 
        String assetId = "assetId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<List<VaultAccount>>> response = apiInstance.getVaultAccountsWithHttpInfo(namePrefix, nameSuffix, minAmountThreshold, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getVaultAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAccounts");
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
| **namePrefix** | **String**|  | [optional] |
| **nameSuffix** | **String**|  | [optional] |
| **minAmountThreshold** | **BigDecimal**|  | [optional] |
| **assetId** | **String**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;VaultAccount&gt;**](VaultAccount.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of vault accounts |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAssets

> CompletableFuture<List<VaultAsset>> getVaultAssets(accountNamePrefix, accountNameSuffix)

Get asset balance for chosen assets

Gets the assets amount summary for all accounts or filtered accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String accountNamePrefix = "accountNamePrefix_example"; // String | 
        String accountNameSuffix = "accountNameSuffix_example"; // String | 
        try {
            CompletableFuture<List<VaultAsset>> result = apiInstance.getVaultAssets(accountNamePrefix, accountNameSuffix);
            System.out.println(result.get());
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

CompletableFuture<[**List&lt;VaultAsset&gt;**](VaultAsset.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Amount by asset |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getVaultAssetsWithHttpInfo

> CompletableFuture<ApiResponse<List<VaultAsset>>> getVaultAssets getVaultAssetsWithHttpInfo(accountNamePrefix, accountNameSuffix)

Get asset balance for chosen assets

Gets the assets amount summary for all accounts or filtered accounts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String accountNamePrefix = "accountNamePrefix_example"; // String | 
        String accountNameSuffix = "accountNameSuffix_example"; // String | 
        try {
            CompletableFuture<ApiResponse<List<VaultAsset>>> response = apiInstance.getVaultAssetsWithHttpInfo(accountNamePrefix, accountNameSuffix);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getVaultAssets");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultAssets");
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
| **accountNamePrefix** | **String**|  | [optional] |
| **accountNameSuffix** | **String**|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**List&lt;VaultAsset&gt;**](VaultAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Amount by asset |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultBalanceByAsset

> CompletableFuture<VaultAsset> getVaultBalanceByAsset(assetId)

Get vault balance by asset

Gets the vault balance summary for an asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String assetId = "assetId_example"; // String | 
        try {
            CompletableFuture<VaultAsset> result = apiInstance.getVaultBalanceByAsset(assetId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultBalanceByAsset");
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

CompletableFuture<[**VaultAsset**](VaultAsset.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vault amount by asset |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getVaultBalanceByAssetWithHttpInfo

> CompletableFuture<ApiResponse<VaultAsset>> getVaultBalanceByAsset getVaultBalanceByAssetWithHttpInfo(assetId)

Get vault balance by asset

Gets the vault balance summary for an asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String assetId = "assetId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<VaultAsset>> response = apiInstance.getVaultBalanceByAssetWithHttpInfo(assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getVaultBalanceByAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getVaultBalanceByAsset");
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
| **assetId** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**VaultAsset**](VaultAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vault amount by asset |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## hideVaultAccount

> CompletableFuture<Void> hideVaultAccount(vaultAccountId, idempotencyKey)

Hide a vault account in the console

Hides the requested vault account from the web console view.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account to hide
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.hideVaultAccount(vaultAccountId, idempotencyKey);
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## hideVaultAccountWithHttpInfo

> CompletableFuture<ApiResponse<Void>> hideVaultAccount hideVaultAccountWithHttpInfo(vaultAccountId, idempotencyKey)

Hide a vault account in the console

Hides the requested vault account from the web console view.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account to hide
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.hideVaultAccountWithHttpInfo(vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#hideVaultAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#hideVaultAccount");
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
| **vaultAccountId** | **String**| The vault account to hide | |
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
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setCustomerRefIdForAddress

> CompletableFuture<Void> setCustomerRefIdForAddress(setCustomerRefIdForAddressRequest, vaultAccountId, assetId, addressId, idempotencyKey)

Assign AML customer reference ID

Sets an AML/KYT customer reference ID for a specific address.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        SetCustomerRefIdForAddressRequest setCustomerRefIdForAddressRequest = new SetCustomerRefIdForAddressRequest(); // SetCustomerRefIdForAddressRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The address for which to add a description. For XRP, use <address>:<tag>, for all other assets, use only the address
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.setCustomerRefIdForAddress(setCustomerRefIdForAddressRequest, vaultAccountId, assetId, addressId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setCustomerRefIdForAddress");
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
| **setCustomerRefIdForAddressRequest** | [**SetCustomerRefIdForAddressRequest**](SetCustomerRefIdForAddressRequest.md)|  | |
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |
| **addressId** | **String**| The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## setCustomerRefIdForAddressWithHttpInfo

> CompletableFuture<ApiResponse<Void>> setCustomerRefIdForAddress setCustomerRefIdForAddressWithHttpInfo(setCustomerRefIdForAddressRequest, vaultAccountId, assetId, addressId, idempotencyKey)

Assign AML customer reference ID

Sets an AML/KYT customer reference ID for a specific address.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        SetCustomerRefIdForAddressRequest setCustomerRefIdForAddressRequest = new SetCustomerRefIdForAddressRequest(); // SetCustomerRefIdForAddressRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The address for which to add a description. For XRP, use <address>:<tag>, for all other assets, use only the address
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.setCustomerRefIdForAddressWithHttpInfo(setCustomerRefIdForAddressRequest, vaultAccountId, assetId, addressId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#setCustomerRefIdForAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setCustomerRefIdForAddress");
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
| **setCustomerRefIdForAddressRequest** | [**SetCustomerRefIdForAddressRequest**](SetCustomerRefIdForAddressRequest.md)|  | |
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |
| **addressId** | **String**| The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

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


## setVaultAccountAutoFuel

> CompletableFuture<Void> setVaultAccountAutoFuel(setAutoFuelRequest, vaultAccountId, idempotencyKey)

Turn autofueling on or off

Sets the autofueling property of the vault account to enabled or disabled.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        SetAutoFuelRequest setAutoFuelRequest = new SetAutoFuelRequest(); // SetAutoFuelRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.setVaultAccountAutoFuel(setAutoFuelRequest, vaultAccountId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setVaultAccountAutoFuel");
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
| **setAutoFuelRequest** | [**SetAutoFuelRequest**](SetAutoFuelRequest.md)|  | |
| **vaultAccountId** | **String**| The vault account ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## setVaultAccountAutoFuelWithHttpInfo

> CompletableFuture<ApiResponse<Void>> setVaultAccountAutoFuel setVaultAccountAutoFuelWithHttpInfo(setAutoFuelRequest, vaultAccountId, idempotencyKey)

Turn autofueling on or off

Sets the autofueling property of the vault account to enabled or disabled.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        SetAutoFuelRequest setAutoFuelRequest = new SetAutoFuelRequest(); // SetAutoFuelRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.setVaultAccountAutoFuelWithHttpInfo(setAutoFuelRequest, vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#setVaultAccountAutoFuel");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setVaultAccountAutoFuel");
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
| **setAutoFuelRequest** | [**SetAutoFuelRequest**](SetAutoFuelRequest.md)|  | |
| **vaultAccountId** | **String**| The vault account ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

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


## setVaultAccountCustomerRefId

> CompletableFuture<Void> setVaultAccountCustomerRefId(setCustomerRefIdRequest, vaultAccountId, idempotencyKey)

Set an AML/KYT customer reference ID for a vault account

Assigns an AML/KYT customer reference ID for the vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        SetCustomerRefIdRequest setCustomerRefIdRequest = new SetCustomerRefIdRequest(); // SetCustomerRefIdRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.setVaultAccountCustomerRefId(setCustomerRefIdRequest, vaultAccountId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setVaultAccountCustomerRefId");
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
| **setCustomerRefIdRequest** | [**SetCustomerRefIdRequest**](SetCustomerRefIdRequest.md)|  | |
| **vaultAccountId** | **String**| The vault account ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## setVaultAccountCustomerRefIdWithHttpInfo

> CompletableFuture<ApiResponse<Void>> setVaultAccountCustomerRefId setVaultAccountCustomerRefIdWithHttpInfo(setCustomerRefIdRequest, vaultAccountId, idempotencyKey)

Set an AML/KYT customer reference ID for a vault account

Assigns an AML/KYT customer reference ID for the vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        SetCustomerRefIdRequest setCustomerRefIdRequest = new SetCustomerRefIdRequest(); // SetCustomerRefIdRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.setVaultAccountCustomerRefIdWithHttpInfo(setCustomerRefIdRequest, vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#setVaultAccountCustomerRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#setVaultAccountCustomerRefId");
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
| **setCustomerRefIdRequest** | [**SetCustomerRefIdRequest**](SetCustomerRefIdRequest.md)|  | |
| **vaultAccountId** | **String**| The vault account ID | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

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

> CompletableFuture<Void> unhideVaultAccount(vaultAccountId, idempotencyKey)

Unhide a vault account in the console

Makes a hidden vault account visible in web console view.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account to unhide
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.unhideVaultAccount(vaultAccountId, idempotencyKey);
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## unhideVaultAccountWithHttpInfo

> CompletableFuture<ApiResponse<Void>> unhideVaultAccount unhideVaultAccountWithHttpInfo(vaultAccountId, idempotencyKey)

Unhide a vault account in the console

Makes a hidden vault account visible in web console view.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account to unhide
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.unhideVaultAccountWithHttpInfo(vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#unhideVaultAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#unhideVaultAccount");
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
| **vaultAccountId** | **String**| The vault account to unhide | |
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
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateVaultAccount

> CompletableFuture<Void> updateVaultAccount(updateVaultAccountRequest, vaultAccountId, idempotencyKey)

Rename a vault account

Renames the requested vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        UpdateVaultAccountRequest updateVaultAccountRequest = new UpdateVaultAccountRequest(); // UpdateVaultAccountRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to edit
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.updateVaultAccount(updateVaultAccountRequest, vaultAccountId, idempotencyKey);
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
| **updateVaultAccountRequest** | [**UpdateVaultAccountRequest**](UpdateVaultAccountRequest.md)|  | |
| **vaultAccountId** | **String**| The ID of the vault account to edit | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## updateVaultAccountWithHttpInfo

> CompletableFuture<ApiResponse<Void>> updateVaultAccount updateVaultAccountWithHttpInfo(updateVaultAccountRequest, vaultAccountId, idempotencyKey)

Rename a vault account

Renames the requested vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        UpdateVaultAccountRequest updateVaultAccountRequest = new UpdateVaultAccountRequest(); // UpdateVaultAccountRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to edit
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.updateVaultAccountWithHttpInfo(updateVaultAccountRequest, vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#updateVaultAccount");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#updateVaultAccount");
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
| **updateVaultAccountRequest** | [**UpdateVaultAccountRequest**](UpdateVaultAccountRequest.md)|  | |
| **vaultAccountId** | **String**| The ID of the vault account to edit | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

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

> CompletableFuture<Void> updateVaultAccountAssetAddress(vaultAccountId, assetId, addressId, updateVaultAccountAssetAddressRequest, idempotencyKey)

Update address description

Updates the description of an existing address of an asset in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The address for which to add a description. For XRP, use <address>:<tag>, for all other assets, use only the address
        UpdateVaultAccountAssetAddressRequest updateVaultAccountAssetAddressRequest = new UpdateVaultAccountAssetAddressRequest(); // UpdateVaultAccountAssetAddressRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.updateVaultAccountAssetAddress(vaultAccountId, assetId, addressId, updateVaultAccountAssetAddressRequest, idempotencyKey);
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## updateVaultAccountAssetAddressWithHttpInfo

> CompletableFuture<ApiResponse<Void>> updateVaultAccountAssetAddress updateVaultAccountAssetAddressWithHttpInfo(vaultAccountId, assetId, addressId, updateVaultAccountAssetAddressRequest, idempotencyKey)

Update address description

Updates the description of an existing address of an asset in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The address for which to add a description. For XRP, use <address>:<tag>, for all other assets, use only the address
        UpdateVaultAccountAssetAddressRequest updateVaultAccountAssetAddressRequest = new UpdateVaultAccountAssetAddressRequest(); // UpdateVaultAccountAssetAddressRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.updateVaultAccountAssetAddressWithHttpInfo(vaultAccountId, assetId, addressId, updateVaultAccountAssetAddressRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#updateVaultAccountAssetAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#updateVaultAccountAssetAddress");
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
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |
| **addressId** | **String**| The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address | |
| **updateVaultAccountAssetAddressRequest** | [**UpdateVaultAccountAssetAddressRequest**](UpdateVaultAccountAssetAddressRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

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

> CompletableFuture<VaultAsset> updateVaultAccountAssetBalance(vaultAccountId, assetId, idempotencyKey)

Refresh asset balance data

Updates the balance of a specific asset in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<VaultAsset> result = apiInstance.updateVaultAccountAssetBalance(vaultAccountId, assetId, idempotencyKey);
            System.out.println(result.get());
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**VaultAsset**](VaultAsset.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAsset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## updateVaultAccountAssetBalanceWithHttpInfo

> CompletableFuture<ApiResponse<VaultAsset>> updateVaultAccountAssetBalance updateVaultAccountAssetBalanceWithHttpInfo(vaultAccountId, assetId, idempotencyKey)

Refresh asset balance data

Updates the balance of a specific asset in a vault account.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        VaultsApi apiInstance = new VaultsApi(defaultClient);
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultAsset>> response = apiInstance.updateVaultAccountAssetBalanceWithHttpInfo(vaultAccountId, assetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#updateVaultAccountAssetBalance");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#updateVaultAccountAssetBalance");
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
| **vaultAccountId** | **String**| The ID of the vault account to return | |
| **assetId** | **String**| The ID of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**VaultAsset**](VaultAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A VaultAsset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

