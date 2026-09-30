# UtxoManagementBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUtxoSelectionConfig**](UtxoManagementBetaApi.md#getUtxoSelectionConfig) | **GET** /utxo_management/selection_config | Get UTXO selection config |
| [**getUtxos**](UtxoManagementBetaApi.md#getUtxos) | **GET** /utxo_management/{vaultAccountId}/{assetId}/unspent_outputs | List unspent outputs (UTXOs) |
| [**getVaultAssetUtxoSelectionConfig**](UtxoManagementBetaApi.md#getVaultAssetUtxoSelectionConfig) | **GET** /utxo_management/{vaultAccountId}/{assetId}/selection_config | Get vault and asset UTXO selection config |
| [**updateUtxoLabels**](UtxoManagementBetaApi.md#updateUtxoLabels) | **PATCH** /utxo_management/{vaultAccountId}/{assetId}/labels | Attach or detach labels to/from UTXOs |
| [**upsertUtxoSelectionConfig**](UtxoManagementBetaApi.md#upsertUtxoSelectionConfig) | **PUT** /utxo_management/selection_config | Upsert UTXO selection config |
| [**upsertVaultAssetUtxoSelectionConfig**](UtxoManagementBetaApi.md#upsertVaultAssetUtxoSelectionConfig) | **PUT** /utxo_management/{vaultAccountId}/{assetId}/selection_config | Upsert vault and asset UTXO selection config |



## getUtxoSelectionConfig

> CompletableFuture<ApiResponse<UtxoSelectionConfigResponse>> getUtxoSelectionConfig getUtxoSelectionConfig()

Get UTXO selection config

Returns the workspace-level configured selection strategy and the effective strategy after runtime resolution. &#x60;ADAPTIVE&#x60; is the recommended strategy. When no row is stored (source &#x60;DEFAULT&#x60;), &#x60;effective&#x60; is &#x60;ADAPTIVE&#x60; if adaptive selection is serving for this workspace, otherwise &#x60;ASC&#x60;. **Note:** These endpoints are currently in beta and might be subject to changes. Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.UtxoManagementBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<UtxoSelectionConfigResponse>> response = fireblocks.utxoManagementBeta().getUtxoSelectionConfig();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UtxoManagementBetaApi#getUtxoSelectionConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**UtxoSelectionConfigResponse**](UtxoSelectionConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current UTXO selection config |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getUtxos

> CompletableFuture<ApiResponse<ListUtxosResponse>> getUtxos getUtxos(vaultAccountId, assetId, pageCursor, pageSize, sort, order, includeAllLabels, includeAnyLabels, excludeAnyLabels, includeStatuses, address, txHash, txId, minAmount, maxAmount)

List unspent outputs (UTXOs)

Returns a paginated list of unspent transaction outputs (UTXOs) for a UTXO-based asset in a vault account, with optional filters for labels, statuses, amounts, and more. **Note:** These endpoints are currently in beta and might be subject to changes. Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.UtxoManagementBetaApi;
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
        String pageCursor = "MjAyNS0wNy0wOSAxMDo1MzoxMy40NTI=:NA=="; // String | Cursor for the next page of results
        Integer pageSize = 50; // Integer | Number of results per page (max 250, default 50)
        String sort = "AMOUNT"; // String | Field to sort by
        String order = "ASC"; // String | Sort order
        List<String> includeAllLabels = Arrays.asList(); // List<String> | Only return UTXOs that have ALL of these labels (AND logic).
        List<String> includeAnyLabels = Arrays.asList(); // List<String> | Return UTXOs that have ANY of these labels (OR logic).
        List<String> excludeAnyLabels = Arrays.asList(); // List<String> | Exclude UTXOs that have ANY of these labels.
        List<String> includeStatuses = Arrays.asList(); // List<String> | Filter by UTXO statuses to include.
        String address = "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"; // String | Filter by address
        String txHash = "0000000000000000000a1b2c3d4e5f60718293a4b5c6d7e8f900112233445566"; // String | Filter by the on-chain hash of the transaction that created the UTXOs. Returns all UTXOs originating from that transaction.
        UUID txId = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"); // UUID | Filter by the Fireblocks transaction ID that created the UTXOs.
        String minAmount = "0.001"; // String | Minimum amount filter
        String maxAmount = "1.0"; // String | Maximum amount filter
        try {
            CompletableFuture<ApiResponse<ListUtxosResponse>> response = fireblocks.utxoManagementBeta().getUtxos(vaultAccountId, assetId, pageCursor, pageSize, sort, order, includeAllLabels, includeAnyLabels, excludeAnyLabels, includeStatuses, address, txHash, txId, minAmount, maxAmount);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UtxoManagementBetaApi#getUtxos");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
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
| **pageCursor** | **String**| Cursor for the next page of results | [optional] |
| **pageSize** | **Integer**| Number of results per page (max 250, default 50) | [optional] [default to 50] |
| **sort** | **String**| Field to sort by | [optional] [enum: AMOUNT, CONFIRMATIONS] |
| **order** | **String**| Sort order | [optional] [enum: ASC, DESC] |
| **includeAllLabels** | [**List&lt;String&gt;**](String.md)| Only return UTXOs that have ALL of these labels (AND logic). | [optional] |
| **includeAnyLabels** | [**List&lt;String&gt;**](String.md)| Return UTXOs that have ANY of these labels (OR logic). | [optional] |
| **excludeAnyLabels** | [**List&lt;String&gt;**](String.md)| Exclude UTXOs that have ANY of these labels. | [optional] |
| **includeStatuses** | [**List&lt;String&gt;**](String.md)| Filter by UTXO statuses to include. | [optional] |
| **address** | **String**| Filter by address | [optional] |
| **txHash** | **String**| Filter by the on-chain hash of the transaction that created the UTXOs. Returns all UTXOs originating from that transaction. | [optional] |
| **txId** | **UUID**| Filter by the Fireblocks transaction ID that created the UTXOs. | [optional] |
| **minAmount** | **String**| Minimum amount filter | [optional] |
| **maxAmount** | **String**| Maximum amount filter | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ListUtxosResponse**](ListUtxosResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of UTXOs |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaultAssetUtxoSelectionConfig

> CompletableFuture<ApiResponse<UtxoSelectionConfigResponse>> getVaultAssetUtxoSelectionConfig getVaultAssetUtxoSelectionConfig(vaultAccountId, assetId)

Get vault and asset UTXO selection config

Returns the config stored at this vault-and-asset scope, if any, and the effective strategy after workspace fallback and runtime resolution. &#x60;ADAPTIVE&#x60; is the recommended strategy. When no row is stored at this scope and none is inherited from the workspace (source &#x60;DEFAULT&#x60;), &#x60;effective&#x60; is &#x60;ADAPTIVE&#x60; if adaptive selection is serving for this scope, otherwise &#x60;ASC&#x60;. **Note:** These endpoints are currently in beta and might be subject to changes. Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.UtxoManagementBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account.
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<UtxoSelectionConfigResponse>> response = fireblocks.utxoManagementBeta().getVaultAssetUtxoSelectionConfig(vaultAccountId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UtxoManagementBetaApi#getVaultAssetUtxoSelectionConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vaultAccountId** | **String**| The ID of the vault account. | |
| **assetId** | **String**| The ID of the asset | |

### Return type

CompletableFuture<ApiResponse<[**UtxoSelectionConfigResponse**](UtxoSelectionConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current UTXO selection config |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateUtxoLabels

> CompletableFuture<ApiResponse<AttachDetachUtxoLabelsResponse>> updateUtxoLabels updateUtxoLabels(attachDetachUtxoLabelsRequest, vaultAccountId, assetId, idempotencyKey)

Attach or detach labels to/from UTXOs

Attach or detach labels to/from UTXOs in a vault account. Labels can be used for organizing and filtering UTXOs.  Labels are applied additively — &#x60;labelsToAttach&#x60; adds to the existing label set and &#x60;labelsToDetach&#x60; removes from it. Neither operation replaces the full set.  The request is all-or-nothing: if any identifier cannot be labelled, no UTXO is labelled and the request fails with &#x60;400&#x60;. The response lists every failed identifier in &#x60;failures&#x60;, each with its own &#x60;reason&#x60; — use it, not the status, to decide what to do: - &#x60;NOT_FOUND&#x60; — not found in this vault and asset. - &#x60;NOT_LABELLABLE&#x60; — spent, or removed, and can no longer be labelled.  A UTXO removed within the last hour is reported as &#x60;NOT_FOUND&#x60; with &#x60;utxoStatus: REMOVED&#x60;; if it does not reappear, it becomes &#x60;NOT_LABELLABLE&#x60; after about an hour. A &#x60;400&#x60; without &#x60;failures&#x60; means the request itself is malformed.  **Note:** These endpoints are currently in beta and might be subject to changes.  Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
import com.fireblocks.sdk.api.UtxoManagementBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        AttachDetachUtxoLabelsRequest attachDetachUtxoLabelsRequest = new AttachDetachUtxoLabelsRequest(); // AttachDetachUtxoLabelsRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AttachDetachUtxoLabelsResponse>> response = fireblocks.utxoManagementBeta().updateUtxoLabels(attachDetachUtxoLabelsRequest, vaultAccountId, assetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UtxoManagementBetaApi#updateUtxoLabels");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **attachDetachUtxoLabelsRequest** | [**AttachDetachUtxoLabelsRequest**](AttachDetachUtxoLabelsRequest.md)|  | |
| **vaultAccountId** | **String**| The ID of the vault account | |
| **assetId** | **String**| The ID of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AttachDetachUtxoLabelsResponse**](AttachDetachUtxoLabelsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UTXOs with updated labels |  * X-Request-ID -  <br>  |
| **400** | Some identifiers could not be labelled (listed in &#x60;failures&#x60;), or the request is malformed. No UTXO was labelled. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## upsertUtxoSelectionConfig

> CompletableFuture<ApiResponse<UtxoSelectionConfigResponse>> upsertUtxoSelectionConfig upsertUtxoSelectionConfig(upsertUtxoSelectionConfigRequest, idempotencyKey)

Upsert UTXO selection config

Creates or updates the workspace-level UTXO selection strategy. &#x60;ADAPTIVE&#x60; is recommended. **Note:** These endpoints are currently in beta and might be subject to changes. Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.UtxoManagementBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpsertUtxoSelectionConfigRequest upsertUtxoSelectionConfigRequest = new UpsertUtxoSelectionConfigRequest(); // UpsertUtxoSelectionConfigRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UtxoSelectionConfigResponse>> response = fireblocks.utxoManagementBeta().upsertUtxoSelectionConfig(upsertUtxoSelectionConfigRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UtxoManagementBetaApi#upsertUtxoSelectionConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **upsertUtxoSelectionConfigRequest** | [**UpsertUtxoSelectionConfigRequest**](UpsertUtxoSelectionConfigRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**UtxoSelectionConfigResponse**](UtxoSelectionConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated UTXO selection config |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## upsertVaultAssetUtxoSelectionConfig

> CompletableFuture<ApiResponse<UtxoSelectionConfigResponse>> upsertVaultAssetUtxoSelectionConfig upsertVaultAssetUtxoSelectionConfig(upsertUtxoSelectionConfigRequest, vaultAccountId, assetId, idempotencyKey)

Upsert vault and asset UTXO selection config

Creates or updates the UTXO selection strategy for this vault account and asset. &#x60;ADAPTIVE&#x60; is recommended. **Note:** These endpoints are currently in beta and might be subject to changes. Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.UtxoManagementBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpsertUtxoSelectionConfigRequest upsertUtxoSelectionConfigRequest = new UpsertUtxoSelectionConfigRequest(); // UpsertUtxoSelectionConfigRequest | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account.
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UtxoSelectionConfigResponse>> response = fireblocks.utxoManagementBeta().upsertVaultAssetUtxoSelectionConfig(upsertUtxoSelectionConfigRequest, vaultAccountId, assetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling UtxoManagementBetaApi#upsertVaultAssetUtxoSelectionConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **upsertUtxoSelectionConfigRequest** | [**UpsertUtxoSelectionConfigRequest**](UpsertUtxoSelectionConfigRequest.md)|  | |
| **vaultAccountId** | **String**| The ID of the vault account. | |
| **assetId** | **String**| The ID of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**UtxoSelectionConfigResponse**](UtxoSelectionConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated UTXO selection config |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

