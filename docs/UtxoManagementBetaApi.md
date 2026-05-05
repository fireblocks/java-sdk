# UtxoManagementBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUtxos**](UtxoManagementBetaApi.md#getUtxos) | **GET** /utxo_management/{vaultAccountId}/{assetId}/unspent_outputs | List unspent outputs (UTXOs) |
| [**updateUtxoLabels**](UtxoManagementBetaApi.md#updateUtxoLabels) | **PATCH** /utxo_management/{vaultAccountId}/{assetId}/labels | Attach or detach labels to/from UTXOs |



## getUtxos

> CompletableFuture<ApiResponse<ListUtxosResponse>> getUtxos getUtxos(vaultAccountId, assetId, pageCursor, pageSize, sort, order, includeAllLabels, includeAnyLabels, excludeAnyLabels, includeStatuses, address, minAmount, maxAmount, useChange, useCoinbase)

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
        String minAmount = "0.001"; // String | Minimum amount filter
        String maxAmount = "1.0"; // String | Maximum amount filter
        Boolean useChange = true; // Boolean | Include change outputs
        Boolean useCoinbase = true; // Boolean | Include coinbase outputs
        try {
            CompletableFuture<ApiResponse<ListUtxosResponse>> response = fireblocks.utxoManagementBeta().getUtxos(vaultAccountId, assetId, pageCursor, pageSize, sort, order, includeAllLabels, includeAnyLabels, excludeAnyLabels, includeStatuses, address, minAmount, maxAmount, useChange, useCoinbase);
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
        } catch (ApiException e) {
            System.err.println("Exception when calling UtxoManagementBetaApi#getUtxos");
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
| **pageCursor** | **String**| Cursor for the next page of results | [optional] |
| **pageSize** | **Integer**| Number of results per page (max 250, default 50) | [optional] [default to 50] |
| **sort** | **String**| Field to sort by | [optional] [enum: AMOUNT, CONFIRMATIONS] |
| **order** | **String**| Sort order | [optional] [enum: ASC, DESC] |
| **includeAllLabels** | [**List&lt;String&gt;**](String.md)| Only return UTXOs that have ALL of these labels (AND logic). | [optional] |
| **includeAnyLabels** | [**List&lt;String&gt;**](String.md)| Return UTXOs that have ANY of these labels (OR logic). | [optional] |
| **excludeAnyLabels** | [**List&lt;String&gt;**](String.md)| Exclude UTXOs that have ANY of these labels. | [optional] |
| **includeStatuses** | [**List&lt;String&gt;**](String.md)| Filter by UTXO statuses to include. | [optional] |
| **address** | **String**| Filter by address | [optional] |
| **minAmount** | **String**| Minimum amount filter | [optional] |
| **maxAmount** | **String**| Maximum amount filter | [optional] |
| **useChange** | **Boolean**| Include change outputs | [optional] |
| **useCoinbase** | **Boolean**| Include coinbase outputs | [optional] |

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


## updateUtxoLabels

> CompletableFuture<ApiResponse<AttachDetachUtxoLabelsResponse>> updateUtxoLabels updateUtxoLabels(attachDetachUtxoLabelsRequest, vaultAccountId, assetId, idempotencyKey)

Attach or detach labels to/from UTXOs

Attach or detach labels to/from UTXOs in a vault account. Labels can be used for organizing and filtering UTXOs. Labels are applied additively — &#x60;labelsToAttach&#x60; adds to the existing label set and &#x60;labelsToDetach&#x60; removes from it. Neither operation replaces the full set. **Note:** These endpoints are currently in beta and might be subject to changes. Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor.

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
        } catch (ApiException e) {
            System.err.println("Exception when calling UtxoManagementBetaApi#updateUtxoLabels");
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
| **0** | Error Response |  * X-Request-ID -  <br>  |

