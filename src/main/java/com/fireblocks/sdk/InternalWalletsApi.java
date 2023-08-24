package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.fireblocks.sdk.model.CreateInternalWalletAssetRequest;
import com.fireblocks.sdk.model.CreateInternalWalletRequest;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.SetCustomerRefIdForVaultAccountRequest;
import com.fireblocks.sdk.model.UnmanagedWallet;
import com.fireblocks.sdk.model.WalletAsset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InternalWalletsApi {
  private ApiClient apiClient;

  public InternalWalletsApi() {
    this.apiClient = new ApiClient();
  }

  public InternalWalletsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Create an internal wallet
   * Creates a new internal wallet with the requested name.
   * @param createInternalWalletRequest  (optional)
   * @return UnmanagedWallet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A new wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public UnmanagedWallet createInternalWallet(CreateInternalWalletRequest createInternalWalletRequest) throws ApiException {
    return createInternalWalletWithHttpInfo(createInternalWalletRequest).getData();
  }

  /**
   * Create an internal wallet
   * Creates a new internal wallet with the requested name.
   * @param createInternalWalletRequest  (optional)
   * @return ApiResponse&lt;UnmanagedWallet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A new wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<UnmanagedWallet> createInternalWalletWithHttpInfo(CreateInternalWalletRequest createInternalWalletRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<UnmanagedWallet> localVarReturnType = new GenericType<UnmanagedWallet>() {};
    return apiClient.invokeAPI("InternalWalletsApi.createInternalWallet", "/internal_wallets", "POST", new ArrayList<>(), createInternalWalletRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Add an asset to an internal wallet
   * Adds an asset to an existing internal wallet.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to add (required)
   * @param createInternalWalletAssetRequest  (optional)
   * @return WalletAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public WalletAsset createInternalWalletAsset(String walletId, String assetId, CreateInternalWalletAssetRequest createInternalWalletAssetRequest) throws ApiException {
    return createInternalWalletAssetWithHttpInfo(walletId, assetId, createInternalWalletAssetRequest).getData();
  }

  /**
   * Add an asset to an internal wallet
   * Adds an asset to an existing internal wallet.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to add (required)
   * @param createInternalWalletAssetRequest  (optional)
   * @return ApiResponse&lt;WalletAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<WalletAsset> createInternalWalletAssetWithHttpInfo(String walletId, String assetId, CreateInternalWalletAssetRequest createInternalWalletAssetRequest) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling createInternalWalletAsset");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling createInternalWalletAsset");
    }

    // Path parameters
    String localVarPath = "/internal_wallets/{walletId}/{assetId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<WalletAsset> localVarReturnType = new GenericType<WalletAsset>() {};
    return apiClient.invokeAPI("InternalWalletsApi.createInternalWalletAsset", localVarPath, "POST", new ArrayList<>(), createInternalWalletAssetRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete an internal wallet
   * Deletes an internal wallet by ID.
   * @param walletId The ID of the wallet to delete (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void deleteInternalWallet(String walletId) throws ApiException {
    deleteInternalWalletWithHttpInfo(walletId);
  }

  /**
   * Delete an internal wallet
   * Deletes an internal wallet by ID.
   * @param walletId The ID of the wallet to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteInternalWalletWithHttpInfo(String walletId) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling deleteInternalWallet");
    }

    // Path parameters
    String localVarPath = "/internal_wallets/{walletId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("InternalWalletsApi.deleteInternalWallet", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Delete a whitelisted address from an internal wallet
   * Deletes a whitelisted address (for an asset) from an internal wallet.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to delete (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void deleteInternalWalletAsset(String walletId, String assetId) throws ApiException {
    deleteInternalWalletAssetWithHttpInfo(walletId, assetId);
  }

  /**
   * Delete a whitelisted address from an internal wallet
   * Deletes a whitelisted address (for an asset) from an internal wallet.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteInternalWalletAssetWithHttpInfo(String walletId, String assetId) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling deleteInternalWalletAsset");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling deleteInternalWalletAsset");
    }

    // Path parameters
    String localVarPath = "/internal_wallets/{walletId}/{assetId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("InternalWalletsApi.deleteInternalWalletAsset", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Get an asset from an internal wallet
   * Returns information for an asset in an internal wallet.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to return (required)
   * @return WalletAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public WalletAsset getInternalWalletAsset(String walletId, String assetId) throws ApiException {
    return getInternalWalletAssetWithHttpInfo(walletId, assetId).getData();
  }

  /**
   * Get an asset from an internal wallet
   * Returns information for an asset in an internal wallet.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to return (required)
   * @return ApiResponse&lt;WalletAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<WalletAsset> getInternalWalletAssetWithHttpInfo(String walletId, String assetId) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling getInternalWalletAsset");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getInternalWalletAsset");
    }

    // Path parameters
    String localVarPath = "/internal_wallets/{walletId}/{assetId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<WalletAsset> localVarReturnType = new GenericType<WalletAsset>() {};
    return apiClient.invokeAPI("InternalWalletsApi.getInternalWalletAsset", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get assets for internal wallet
   * Returns all assets in an internal wallet by ID.
   * @param walletId The ID of the wallet to return (required)
   * @return UnmanagedWallet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public UnmanagedWallet getInternalWalletById(String walletId) throws ApiException {
    return getInternalWalletByIdWithHttpInfo(walletId).getData();
  }

  /**
   * Get assets for internal wallet
   * Returns all assets in an internal wallet by ID.
   * @param walletId The ID of the wallet to return (required)
   * @return ApiResponse&lt;UnmanagedWallet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<UnmanagedWallet> getInternalWalletByIdWithHttpInfo(String walletId) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling getInternalWalletById");
    }

    // Path parameters
    String localVarPath = "/internal_wallets/{walletId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<UnmanagedWallet> localVarReturnType = new GenericType<UnmanagedWallet>() {};
    return apiClient.invokeAPI("InternalWalletsApi.getInternalWalletById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List internal wallets
   * Gets a list of internal wallets.  **Note**: BTC-based assets belonging to whitelisted addresses cannot be retrieved between 00:00 UTC and 00:01 UTC daily due to third-party provider, Blockchair, being unavailable for this 60 second period. Please wait until the next minute to retrieve BTC-based assets. 
   * @return List&lt;UnmanagedWallet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of internal wallets </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<UnmanagedWallet> getInternalWallets() throws ApiException {
    return getInternalWalletsWithHttpInfo().getData();
  }

  /**
   * List internal wallets
   * Gets a list of internal wallets.  **Note**: BTC-based assets belonging to whitelisted addresses cannot be retrieved between 00:00 UTC and 00:01 UTC daily due to third-party provider, Blockchair, being unavailable for this 60 second period. Please wait until the next minute to retrieve BTC-based assets. 
   * @return ApiResponse&lt;List&lt;UnmanagedWallet&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of internal wallets </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<UnmanagedWallet>> getInternalWalletsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<UnmanagedWallet>> localVarReturnType = new GenericType<List<UnmanagedWallet>>() {};
    return apiClient.invokeAPI("InternalWalletsApi.getInternalWallets", "/internal_wallets", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Set an AML/KYT customer reference ID for an internal wallet
   * Sets an AML/KYT customer reference ID for the specific internal wallet.
   * @param walletId The wallet ID (required)
   * @param setCustomerRefIdForVaultAccountRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void setCustomerRefIdForInternalWallet(String walletId, SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest) throws ApiException {
    setCustomerRefIdForInternalWalletWithHttpInfo(walletId, setCustomerRefIdForVaultAccountRequest);
  }

  /**
   * Set an AML/KYT customer reference ID for an internal wallet
   * Sets an AML/KYT customer reference ID for the specific internal wallet.
   * @param walletId The wallet ID (required)
   * @param setCustomerRefIdForVaultAccountRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> setCustomerRefIdForInternalWalletWithHttpInfo(String walletId, SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling setCustomerRefIdForInternalWallet");
    }
    if (setCustomerRefIdForVaultAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setCustomerRefIdForVaultAccountRequest' when calling setCustomerRefIdForInternalWallet");
    }

    // Path parameters
    String localVarPath = "/internal_wallets/{walletId}/set_customer_ref_id"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("InternalWalletsApi.setCustomerRefIdForInternalWallet", localVarPath, "POST", new ArrayList<>(), setCustomerRefIdForVaultAccountRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
