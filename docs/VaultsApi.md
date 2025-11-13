# VaultsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateAssetForVaultAccount**](VaultsApi.md#activateAssetForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account |
| [**attachOrDetachTagsFromVaultAccounts**](VaultsApi.md#attachOrDetachTagsFromVaultAccounts) | **POST** /vault/accounts/attached_tags | Attach or detach tags from a vault accounts |
| [**attachTagsToVaultAccounts**](VaultsApi.md#attachTagsToVaultAccounts) | **POST** /vault/accounts/attached_tags/attach | Attach tags to a vault accounts (deprecated) |
| [**createLegacyAddress**](VaultsApi.md#createLegacyAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format |
| [**createMultipleAccounts**](VaultsApi.md#createMultipleAccounts) | **POST** /vault/accounts/bulk | Bulk creation of new vault accounts |
| [**createMultipleDepositAddresses**](VaultsApi.md#createMultipleDepositAddresses) | **POST** /vault/accounts/addresses/bulk | Bulk creation of new deposit addresses |
| [**createVaultAccount**](VaultsApi.md#createVaultAccount) | **POST** /vault/accounts | Create a new vault account |
| [**createVaultAccountAsset**](VaultsApi.md#createVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet |
| [**createVaultAccountAssetAddress**](VaultsApi.md#createVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address |
| [**detachTagsFromVaultAccounts**](VaultsApi.md#detachTagsFromVaultAccounts) | **POST** /vault/accounts/attached_tags/detach | Detach tags from a vault accounts (deprecated) |
| [**getAssetWallets**](VaultsApi.md#getAssetWallets) | **GET** /vault/asset_wallets | List asset wallets (Paginated) |
| [**getCreateMultipleDepositAddressesJobStatus**](VaultsApi.md#getCreateMultipleDepositAddressesJobStatus) | **GET** /vault/accounts/addresses/bulk/{jobId} | Get job status of bulk creation of new deposit addresses |
| [**getCreateMultipleVaultAccountsJobStatus**](VaultsApi.md#getCreateMultipleVaultAccountsJobStatus) | **GET** /vault/accounts/bulk/{jobId} | Get job status of bulk creation of new vault accounts |
| [**getMaxSpendableAmount**](VaultsApi.md#getMaxSpendableAmount) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount | Get the maximum spendable amount in a single transaction. |
| [**getPagedVaultAccounts**](VaultsApi.md#getPagedVaultAccounts) | **GET** /vault/accounts_paged | List vault accounts (Paginated) |
| [**getPublicKeyInfo**](VaultsApi.md#getPublicKeyInfo) | **GET** /vault/public_key_info | Get the public key information |
| [**getPublicKeyInfoForAddress**](VaultsApi.md#getPublicKeyInfoForAddress) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key for a vault account |
| [**getUnspentInputs**](VaultsApi.md#getUnspentInputs) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs | Get UTXO unspent inputs information |
| [**getVaultAccount**](VaultsApi.md#getVaultAccount) | **GET** /vault/accounts/{vaultAccountId} | Find a vault account by ID |
| [**getVaultAccountAsset**](VaultsApi.md#getVaultAccountAsset) | **GET** /vault/accounts/{vaultAccountId}/{assetId} | Get the asset balance for a vault account |
| [**getVaultAccountAssetAddressesPaginated**](VaultsApi.md#getVaultAccountAssetAddressesPaginated) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated | List addresses (Paginated) |
| [**getVaultAssets**](VaultsApi.md#getVaultAssets) | **GET** /vault/assets | Get asset balance for chosen assets |
| [**getVaultBalanceByAsset**](VaultsApi.md#getVaultBalanceByAsset) | **GET** /vault/assets/{assetId} | Get vault balance by asset |
| [**hideVaultAccount**](VaultsApi.md#hideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/hide | Hide a vault account in the console |
| [**setCustomerRefIdForAddress**](VaultsApi.md#setCustomerRefIdForAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id | Assign AML customer reference ID |
| [**setVaultAccountAutoFuel**](VaultsApi.md#setVaultAccountAutoFuel) | **POST** /vault/accounts/{vaultAccountId}/set_auto_fuel | Turn autofueling on or off |
| [**setVaultAccountCustomerRefId**](VaultsApi.md#setVaultAccountCustomerRefId) | **POST** /vault/accounts/{vaultAccountId}/set_customer_ref_id | Set an AML/KYT customer reference ID for a vault account |
| [**unhideVaultAccount**](VaultsApi.md#unhideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/unhide | Unhide a vault account in the console |
| [**updateVaultAccount**](VaultsApi.md#updateVaultAccount) | **PUT** /vault/accounts/{vaultAccountId} | Rename a vault account |
| [**updateVaultAccountAssetAddress**](VaultsApi.md#updateVaultAccountAssetAddress) | **PUT** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId} | Update address description |
| [**updateVaultAccountAssetBalance**](VaultsApi.md#updateVaultAccountAssetBalance) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/balance | Refresh asset balance data |



## activateAssetForVaultAccount

> CompletableFuture<ApiResponse<CreateVaultAssetResponse>> activateAssetForVaultAccount activateAssetForVaultAccount(vaultAccountId, assetId, idempotencyKey)

Activate a wallet in a vault account

Initiates activation for a wallet in a vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateVaultAssetResponse>> response = fireblocks.vaults().activateAssetForVaultAccount(vaultAccountId, assetId, idempotencyKey);
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


## attachOrDetachTagsFromVaultAccounts

> CompletableFuture<ApiResponse<VaultAccountsTagAttachmentOperationsResponse>> attachOrDetachTagsFromVaultAccounts attachOrDetachTagsFromVaultAccounts(vaultAccountsTagAttachmentOperationsRequest, idempotencyKey)

Attach or detach tags from a vault accounts

Attach or detach one or more tags from the requested vault accounts.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        VaultAccountsTagAttachmentOperationsRequest vaultAccountsTagAttachmentOperationsRequest = new VaultAccountsTagAttachmentOperationsRequest(); // VaultAccountsTagAttachmentOperationsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultAccountsTagAttachmentOperationsResponse>> response = fireblocks.vaults().attachOrDetachTagsFromVaultAccounts(vaultAccountsTagAttachmentOperationsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#attachOrDetachTagsFromVaultAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#attachOrDetachTagsFromVaultAccounts");
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
| **vaultAccountsTagAttachmentOperationsRequest** | [**VaultAccountsTagAttachmentOperationsRequest**](VaultAccountsTagAttachmentOperationsRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**VaultAccountsTagAttachmentOperationsResponse**](VaultAccountsTagAttachmentOperationsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tags were attached/detached successfully |  * X-Request-ID -  <br>  |
| **400** | - Invalid request parameters. - Same tag ID is provided in both tagIdsToAttach and tagIdsToDetach. - Vault accounts are archived.  |  * X-Request-ID -  <br>  |
| **404** | - Tags with the requested ID not found. - Vault accounts with the requested ID not found.  |  * X-Request-ID -  <br>  |


## attachTagsToVaultAccounts

> CompletableFuture<ApiResponse<Void>> attachTagsToVaultAccounts attachTagsToVaultAccounts(vaultAccountsTagAttachmentsRequest, idempotencyKey)

Attach tags to a vault accounts (deprecated)

Attach one or more tags to the requested vault accounts. This endpoint is deprecated. Please use /vault/accounts/attached_tags instead.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        VaultAccountsTagAttachmentsRequest vaultAccountsTagAttachmentsRequest = new VaultAccountsTagAttachmentsRequest(); // VaultAccountsTagAttachmentsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.vaults().attachTagsToVaultAccounts(vaultAccountsTagAttachmentsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#attachTagsToVaultAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#attachTagsToVaultAccounts");
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
| **vaultAccountsTagAttachmentsRequest** | [**VaultAccountsTagAttachmentsRequest**](VaultAccountsTagAttachmentsRequest.md)|  | |
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
| **204** | Tags were attached successfully |  -  |


## createLegacyAddress

> CompletableFuture<ApiResponse<CreateAddressResponse>> createLegacyAddress createLegacyAddress(vaultAccountId, assetId, addressId, idempotencyKey)

Convert a segwit address to legacy format

Converts an existing segwit address to the legacy format.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The segwit address to translate
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateAddressResponse>> response = fireblocks.vaults().createLegacyAddress(vaultAccountId, assetId, addressId, idempotencyKey);
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

> CompletableFuture<ApiResponse<JobCreated>> createMultipleAccounts createMultipleAccounts(createMultipleAccountsRequest, idempotencyKey)

Bulk creation of new vault accounts

Create multiple vault accounts by running an async job. &lt;/br&gt; **Note**: - These endpoints are currently in beta and might be subject to changes. - We limit accounts to 10k per operation and 200k per customer during beta testing. Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor. 

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateMultipleAccountsRequest createMultipleAccountsRequest = new CreateMultipleAccountsRequest(); // CreateMultipleAccountsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<JobCreated>> response = fireblocks.vaults().createMultipleAccounts(createMultipleAccountsRequest, idempotencyKey);
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


## createMultipleDepositAddresses

> CompletableFuture<ApiResponse<JobCreated>> createMultipleDepositAddresses createMultipleDepositAddresses(createMultipleDepositAddressesRequest, idempotencyKey)

Bulk creation of new deposit addresses

Create multiple deposit address by running an async job. &lt;/br&gt; **Note**: - We limit accounts to 10k per operation. Endpoint Permission: Admin, Non-Signing Admin. 

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateMultipleDepositAddressesRequest createMultipleDepositAddressesRequest = new CreateMultipleDepositAddressesRequest(); // CreateMultipleDepositAddressesRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<JobCreated>> response = fireblocks.vaults().createMultipleDepositAddresses(createMultipleDepositAddressesRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#createMultipleDepositAddresses");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#createMultipleDepositAddresses");
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
| **createMultipleDepositAddressesRequest** | [**CreateMultipleDepositAddressesRequest**](CreateMultipleDepositAddressesRequest.md)|  | |
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

> CompletableFuture<ApiResponse<VaultAccount>> createVaultAccount createVaultAccount(createVaultAccountRequest, idempotencyKey)

Create a new vault account

Creates a new vault account with the requested name.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateVaultAccountRequest createVaultAccountRequest = new CreateVaultAccountRequest(); // CreateVaultAccountRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultAccount>> response = fireblocks.vaults().createVaultAccount(createVaultAccountRequest, idempotencyKey);
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

> CompletableFuture<ApiResponse<CreateVaultAssetResponse>> createVaultAccountAsset createVaultAccountAsset(vaultAccountId, assetId, createAssetsRequest, idempotencyKey)

Create a new wallet

Creates a wallet for a specific asset in a vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        CreateAssetsRequest createAssetsRequest = new CreateAssetsRequest(); // CreateAssetsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateVaultAssetResponse>> response = fireblocks.vaults().createVaultAccountAsset(vaultAccountId, assetId, createAssetsRequest, idempotencyKey);
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

> CompletableFuture<ApiResponse<CreateAddressResponse>> createVaultAccountAssetAddress createVaultAccountAssetAddress(vaultAccountId, assetId, createAddressRequest, idempotencyKey)

Create new asset deposit address

Creates a new deposit address for an asset of a vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        CreateAddressRequest createAddressRequest = new CreateAddressRequest(); // CreateAddressRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateAddressResponse>> response = fireblocks.vaults().createVaultAccountAssetAddress(vaultAccountId, assetId, createAddressRequest, idempotencyKey);
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


## detachTagsFromVaultAccounts

> CompletableFuture<ApiResponse<Void>> detachTagsFromVaultAccounts detachTagsFromVaultAccounts(vaultAccountsTagAttachmentsRequest, idempotencyKey)

Detach tags from a vault accounts (deprecated)

Detach one or more tags from the requested vault account. This endpoint is deprecated. Please use /vault/accounts/attached_tags instead.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        VaultAccountsTagAttachmentsRequest vaultAccountsTagAttachmentsRequest = new VaultAccountsTagAttachmentsRequest(); // VaultAccountsTagAttachmentsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.vaults().detachTagsFromVaultAccounts(vaultAccountsTagAttachmentsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#detachTagsFromVaultAccounts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#detachTagsFromVaultAccounts");
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
| **vaultAccountsTagAttachmentsRequest** | [**VaultAccountsTagAttachmentsRequest**](VaultAccountsTagAttachmentsRequest.md)|  | |
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
| **204** | Tags were detached successfully |  -  |


## getAssetWallets

> CompletableFuture<ApiResponse<PaginatedAssetWalletResponse>> getAssetWallets getAssetWallets(totalAmountLargerThan, assetId, orderBy, before, after, limit)

List asset wallets (Paginated)

Gets all asset wallets at all of the vault accounts in your workspace. An asset wallet is an asset at a vault account. This method allows fast traversal of all account balances. 

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        BigDecimal totalAmountLargerThan = new BigDecimal(78); // BigDecimal | When specified, only asset wallets with total balance larger than this amount are returned.
        String assetId = "assetId_example"; // String | When specified, only asset wallets cross vault accounts that have this asset ID are returned.
        String orderBy = "ASC"; // String | 
        String before = "before_example"; // String | Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page.
        String after = "after_example"; // String | Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page.
        BigDecimal limit = new BigDecimal("200"); // BigDecimal | The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000.
        try {
            CompletableFuture<ApiResponse<PaginatedAssetWalletResponse>> response = fireblocks.vaults().getAssetWallets(totalAmountLargerThan, assetId, orderBy, before, after, limit);
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


## getCreateMultipleDepositAddressesJobStatus

> CompletableFuture<ApiResponse<CreateMultipleDepositAddressesJobStatus>> getCreateMultipleDepositAddressesJobStatus getCreateMultipleDepositAddressesJobStatus(jobId)

Get job status of bulk creation of new deposit addresses

Returns the status of bulk creation of new deposit addresses job and the result or error Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer. 

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String jobId = "019681b4-107d-7243-942d-4c3c30e36fae"; // String | The ID of the job to create addresses
        try {
            CompletableFuture<ApiResponse<CreateMultipleDepositAddressesJobStatus>> response = fireblocks.vaults().getCreateMultipleDepositAddressesJobStatus(jobId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getCreateMultipleDepositAddressesJobStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getCreateMultipleDepositAddressesJobStatus");
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
| **jobId** | **String**| The ID of the job to create addresses | |

### Return type

CompletableFuture<ApiResponse<[**CreateMultipleDepositAddressesJobStatus**](CreateMultipleDepositAddressesJobStatus.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Job with status |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getCreateMultipleVaultAccountsJobStatus

> CompletableFuture<ApiResponse<CreateMultipleVaultAccountsJobStatus>> getCreateMultipleVaultAccountsJobStatus getCreateMultipleVaultAccountsJobStatus(jobId)

Get job status of bulk creation of new vault accounts

Returns the status of bulk creation of new vault accounts job and the result or error Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer. 

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String jobId = "019681b4-107d-7243-942d-4c3c30e36fae"; // String | The ID of the job to create addresses
        try {
            CompletableFuture<ApiResponse<CreateMultipleVaultAccountsJobStatus>> response = fireblocks.vaults().getCreateMultipleVaultAccountsJobStatus(jobId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling VaultsApi#getCreateMultipleVaultAccountsJobStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling VaultsApi#getCreateMultipleVaultAccountsJobStatus");
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
| **jobId** | **String**| The ID of the job to create addresses | |

### Return type

CompletableFuture<ApiResponse<[**CreateMultipleVaultAccountsJobStatus**](CreateMultipleVaultAccountsJobStatus.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Job with status |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getMaxSpendableAmount

> CompletableFuture<ApiResponse<GetMaxSpendableAmountResponse>> getMaxSpendableAmount getMaxSpendableAmount(vaultAccountId, assetId, manualSignging)

Get the maximum spendable amount in a single transaction.

Get the maximum amount of a particular asset that can be spent in a single transaction from a specified vault account (UTXO assets only, with a limitation on number of inputs embedded). Send several transactions if you want to spend more than the maximum spendable amount.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account, or 'default' for the default vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        Boolean manualSignging = true; // Boolean | False by default. The maximum number of inputs depends if the transaction will be signed by an automated co-signer server or on a mobile device.
        try {
            CompletableFuture<ApiResponse<GetMaxSpendableAmountResponse>> response = fireblocks.vaults().getMaxSpendableAmount(vaultAccountId, assetId, manualSignging);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**GetMaxSpendableAmountResponse**](GetMaxSpendableAmountResponse.md)>>


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

> CompletableFuture<ApiResponse<VaultAccountsPagedResponse>> getPagedVaultAccounts getPagedVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId, orderBy, before, after, limit, tagIds)

List vault accounts (Paginated)

Gets all vault accounts in your workspace. This endpoint returns a limited amount of results with a quick response time.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String namePrefix = "namePrefix_example"; // String | 
        String nameSuffix = "nameSuffix_example"; // String | 
        BigDecimal minAmountThreshold = new BigDecimal(78); // BigDecimal | Specifying minAmountThreshold will filter accounts with balances greater than this value, otherwise, it will return all accounts.
        String assetId = "assetId_example"; // String | 
        String orderBy = "ASC"; // String | 
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        BigDecimal limit = new BigDecimal("200"); // BigDecimal | 
        List<UUID> tagIds = Arrays.asList(); // List<UUID> | List of tag IDs to filter vault accounts.
        try {
            CompletableFuture<ApiResponse<VaultAccountsPagedResponse>> response = fireblocks.vaults().getPagedVaultAccounts(namePrefix, nameSuffix, minAmountThreshold, assetId, orderBy, before, after, limit, tagIds);
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
| **tagIds** | [**List&lt;UUID&gt;**](UUID.md)| List of tag IDs to filter vault accounts. | [optional] |

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

> CompletableFuture<ApiResponse<PublicKeyInformation>> getPublicKeyInfo getPublicKeyInfo(derivationPath, algorithm, compressed)

Get the public key information

Gets the public key information based on derivation path and signing algorithm.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String derivationPath = "derivationPath_example"; // String | 
        String algorithm = "algorithm_example"; // String | 
        Boolean compressed = true; // Boolean | 
        try {
            CompletableFuture<ApiResponse<PublicKeyInformation>> response = fireblocks.vaults().getPublicKeyInfo(derivationPath, algorithm, compressed);
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

> CompletableFuture<ApiResponse<PublicKeyInformation>> getPublicKeyInfoForAddress getPublicKeyInfoForAddress(vaultAccountId, assetId, change, addressIndex, compressed)

Get the public key for a vault account

Gets the public key information for the vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | 
        String assetId = "assetId_example"; // String | 
        BigDecimal change = new BigDecimal(78); // BigDecimal | 
        BigDecimal addressIndex = new BigDecimal(78); // BigDecimal | 
        Boolean compressed = true; // Boolean | 
        try {
            CompletableFuture<ApiResponse<PublicKeyInformation>> response = fireblocks.vaults().getPublicKeyInfoForAddress(vaultAccountId, assetId, change, addressIndex, compressed);
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

> CompletableFuture<ApiResponse<List<UnspentInputsResponse>>> getUnspentInputs getUnspentInputs(vaultAccountId, assetId)

Get UTXO unspent inputs information

Returns unspent inputs information of an asset in a vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<List<UnspentInputsResponse>>> response = fireblocks.vaults().getUnspentInputs(vaultAccountId, assetId);
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

> CompletableFuture<ApiResponse<VaultAccount>> getVaultAccount getVaultAccount(vaultAccountId)

Find a vault account by ID

Returns the requested vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return type: string
        try {
            CompletableFuture<ApiResponse<VaultAccount>> response = fireblocks.vaults().getVaultAccount(vaultAccountId);
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

> CompletableFuture<ApiResponse<VaultAsset>> getVaultAccountAsset getVaultAccountAsset(vaultAccountId, assetId)

Get the asset balance for a vault account

Returns a wallet for a specific asset of a vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<VaultAsset>> response = fireblocks.vaults().getVaultAccountAsset(vaultAccountId, assetId);
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


## getVaultAccountAssetAddressesPaginated

> CompletableFuture<ApiResponse<PaginatedAddressResponse>> getVaultAccountAssetAddressesPaginated getVaultAccountAssetAddressesPaginated(vaultAccountId, assetId, limit, before, after)

List addresses (Paginated)

Returns a paginated response of the addresses for a given vault account and asset.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        BigDecimal limit = new BigDecimal(78); // BigDecimal | 
        String before = "before_example"; // String | 
        String after = "after_example"; // String | 
        try {
            CompletableFuture<ApiResponse<PaginatedAddressResponse>> response = fireblocks.vaults().getVaultAccountAssetAddressesPaginated(vaultAccountId, assetId, limit, before, after);
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


## getVaultAssets

> CompletableFuture<ApiResponse<List<VaultAsset>>> getVaultAssets getVaultAssets(accountNamePrefix, accountNameSuffix)

Get asset balance for chosen assets

Gets the assets amount summary for all accounts or filtered accounts.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String accountNamePrefix = "accountNamePrefix_example"; // String | 
        String accountNameSuffix = "accountNameSuffix_example"; // String | 
        try {
            CompletableFuture<ApiResponse<List<VaultAsset>>> response = fireblocks.vaults().getVaultAssets(accountNamePrefix, accountNameSuffix);
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

> CompletableFuture<ApiResponse<VaultAsset>> getVaultBalanceByAsset getVaultBalanceByAsset(assetId)

Get vault balance by asset

Gets the vault balance summary for an asset.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String assetId = "assetId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<VaultAsset>> response = fireblocks.vaults().getVaultBalanceByAsset(assetId);
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

> CompletableFuture<ApiResponse<VaultActionStatus>> hideVaultAccount hideVaultAccount(vaultAccountId, idempotencyKey)

Hide a vault account in the console

Hides the requested vault account from the web console view.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The vault account to hide
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultActionStatus>> response = fireblocks.vaults().hideVaultAccount(vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**VaultActionStatus**](VaultActionStatus.md)>>


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

> CompletableFuture<ApiResponse<VaultActionStatus>> setCustomerRefIdForAddress setCustomerRefIdForAddress(setCustomerRefIdForAddressRequest, vaultAccountId, assetId, addressId, idempotencyKey)

Assign AML customer reference ID

Sets an AML/KYT customer reference ID for a specific address.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        SetCustomerRefIdForAddressRequest setCustomerRefIdForAddressRequest = new SetCustomerRefIdForAddressRequest(); // SetCustomerRefIdForAddressRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The address for which to add a description. For XRP, use <address>:<tag>, for all other assets, use only the address
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultActionStatus>> response = fireblocks.vaults().setCustomerRefIdForAddress(setCustomerRefIdForAddressRequest, vaultAccountId, assetId, addressId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**VaultActionStatus**](VaultActionStatus.md)>>


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

> CompletableFuture<ApiResponse<VaultActionStatus>> setVaultAccountAutoFuel setVaultAccountAutoFuel(setAutoFuelRequest, vaultAccountId, idempotencyKey)

Turn autofueling on or off

Sets the autofueling property of the vault account to enabled or disabled.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        SetAutoFuelRequest setAutoFuelRequest = new SetAutoFuelRequest(); // SetAutoFuelRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultActionStatus>> response = fireblocks.vaults().setVaultAccountAutoFuel(setAutoFuelRequest, vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**VaultActionStatus**](VaultActionStatus.md)>>


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

> CompletableFuture<ApiResponse<VaultActionStatus>> setVaultAccountCustomerRefId setVaultAccountCustomerRefId(setCustomerRefIdRequest, vaultAccountId, idempotencyKey)

Set an AML/KYT customer reference ID for a vault account

Assigns an AML/KYT customer reference ID for the vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        SetCustomerRefIdRequest setCustomerRefIdRequest = new SetCustomerRefIdRequest(); // SetCustomerRefIdRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The vault account ID
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultActionStatus>> response = fireblocks.vaults().setVaultAccountCustomerRefId(setCustomerRefIdRequest, vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**VaultActionStatus**](VaultActionStatus.md)>>


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

> CompletableFuture<ApiResponse<VaultActionStatus>> unhideVaultAccount unhideVaultAccount(vaultAccountId, idempotencyKey)

Unhide a vault account in the console

Makes a hidden vault account visible in web console view.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The vault account to unhide
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultActionStatus>> response = fireblocks.vaults().unhideVaultAccount(vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**VaultActionStatus**](VaultActionStatus.md)>>


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

> CompletableFuture<ApiResponse<RenameVaultAccountResponse>> updateVaultAccount updateVaultAccount(updateVaultAccountRequest, vaultAccountId, idempotencyKey)

Rename a vault account

Renames the requested vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpdateVaultAccountRequest updateVaultAccountRequest = new UpdateVaultAccountRequest(); // UpdateVaultAccountRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to edit
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<RenameVaultAccountResponse>> response = fireblocks.vaults().updateVaultAccount(updateVaultAccountRequest, vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**RenameVaultAccountResponse**](RenameVaultAccountResponse.md)>>


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

> CompletableFuture<ApiResponse<VaultActionStatus>> updateVaultAccountAssetAddress updateVaultAccountAssetAddress(vaultAccountId, assetId, addressId, updateVaultAccountAssetAddressRequest, idempotencyKey)

Update address description

Updates the description of an existing address of an asset in a vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String addressId = "addressId_example"; // String | The address for which to add a description. For XRP, use <address>:<tag>, for all other assets, use only the address
        UpdateVaultAccountAssetAddressRequest updateVaultAccountAssetAddressRequest = new UpdateVaultAccountAssetAddressRequest(); // UpdateVaultAccountAssetAddressRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultActionStatus>> response = fireblocks.vaults().updateVaultAccountAssetAddress(vaultAccountId, assetId, addressId, updateVaultAccountAssetAddressRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
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

CompletableFuture<ApiResponse<[**VaultActionStatus**](VaultActionStatus.md)>>


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

> CompletableFuture<ApiResponse<VaultAsset>> updateVaultAccountAssetBalance updateVaultAccountAssetBalance(vaultAccountId, assetId, idempotencyKey)

Refresh asset balance data

Updates the balance of a specific asset in a vault account.

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
import com.fireblocks.sdk.api.VaultsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account to return
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<VaultAsset>> response = fireblocks.vaults().updateVaultAccountAssetBalance(vaultAccountId, assetId, idempotencyKey);
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

