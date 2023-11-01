package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.Ncw;
import com.fireblocks.sdk.model.RequestOptions;
import com.fireblocks.sdk.Pair;
import java.util.Optional;
import javax.ws.rs.core.GenericType;
import java.util.UUID;
import com.fireblocks.sdk.model.AddAssetToExternalWalletRequest;
import com.fireblocks.sdk.model.CreateInternalWalletRequest;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.ExternalWalletAsset;
import com.fireblocks.sdk.model.SetCustomerRefIdForVaultAccountRequest;
import com.fireblocks.sdk.model.UnmanagedWallet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalWalletsApi {
  private ApiClient apiClient;

  public ExternalWalletsApi() {
    this.apiClient = new ApiClient();
  }

  public ExternalWalletsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Add an asset to an external wallet.
   * Adds an asset to an existing external wallet.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to add (required)
   * @param addAssetToExternalWalletRequest  (optional)
   * @return ExternalWalletAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ExternalWalletAsset addAssetToExternalWallet(String walletId, String assetId, AddAssetToExternalWalletRequest addAssetToExternalWalletRequest,  RequestOptions requestOptions) throws ApiException {
     return addAssetToExternalWalletWithHttpInfo(walletId,assetId,addAssetToExternalWalletRequest, requestOptions).getData();
  }

  public ExternalWalletAsset addAssetToExternalWallet(String walletId, String assetId, AddAssetToExternalWalletRequest addAssetToExternalWalletRequest) throws ApiException {
   return addAssetToExternalWalletWithHttpInfo(walletId,assetId,addAssetToExternalWalletRequest, null).getData();
  }

  /**
   * Add an asset to an external wallet.
   * Adds an asset to an existing external wallet.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to add (required)
   * @param addAssetToExternalWalletRequest  (optional)
   * @return ApiResponse&lt;ExternalWalletAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ExternalWalletAsset> addAssetToExternalWalletWithHttpInfo(String walletId,String assetId,AddAssetToExternalWalletRequest addAssetToExternalWalletRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling addAssetToExternalWallet");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling addAssetToExternalWallet");
    }

    // Path parameters
    String localVarPath = "/external_wallets/{walletId}/{assetId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = addAssetToExternalWalletRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExternalWalletAsset> localVarReturnType = new GenericType<ExternalWalletAsset>() {};
    return apiClient.invokeAPI("ExternalWalletsApi.addAssetToExternalWallet", localVarPath, "POST", new ArrayList<>(), addAssetToExternalWalletRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Create an external wallet
   * Creates a new external wallet with the requested name.
   * @param createInternalWalletRequest  (optional)
   * @return UnmanagedWallet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public UnmanagedWallet createExternalWallet(CreateInternalWalletRequest createInternalWalletRequest,  RequestOptions requestOptions) throws ApiException {
     return createExternalWalletWithHttpInfo(createInternalWalletRequest, requestOptions).getData();
  }

  public UnmanagedWallet createExternalWallet(CreateInternalWalletRequest createInternalWalletRequest) throws ApiException {
   return createExternalWalletWithHttpInfo(createInternalWalletRequest, null).getData();
  }

  /**
   * Create an external wallet
   * Creates a new external wallet with the requested name.
   * @param createInternalWalletRequest  (optional)
   * @return ApiResponse&lt;UnmanagedWallet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<UnmanagedWallet> createExternalWalletWithHttpInfo(CreateInternalWalletRequest createInternalWalletRequest, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = createInternalWalletRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<UnmanagedWallet> localVarReturnType = new GenericType<UnmanagedWallet>() {};
    return apiClient.invokeAPI("ExternalWalletsApi.createExternalWallet", "/external_wallets", "POST", new ArrayList<>(), createInternalWalletRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete an external wallet
   * Deletes an external wallet by ID.
   * @param walletId The ID of the wallet to delete (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void deleteExternalWallet(String walletId,  RequestOptions requestOptions) throws ApiException {
    deleteExternalWalletWithHttpInfo(walletId, requestOptions);
  }

  public void deleteExternalWallet(String walletId) throws ApiException {
  deleteExternalWalletWithHttpInfo(walletId, null);
  }

  /**
   * Delete an external wallet
   * Deletes an external wallet by ID.
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
  public ApiResponse<Void> deleteExternalWalletWithHttpInfo(String walletId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling deleteExternalWallet");
    }

    // Path parameters
    String localVarPath = "/external_wallets/{walletId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExternalWalletsApi.deleteExternalWallet", localVarPath, "DELETE", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Get an asset from an external wallet
   * Returns an external wallet by wallet ID and asset ID.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to return (required)
   * @return ExternalWalletAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ExternalWalletAsset getAssetInExternalWallet(String walletId, String assetId,  RequestOptions requestOptions) throws ApiException {
     return getAssetInExternalWalletWithHttpInfo(walletId,assetId, requestOptions).getData();
  }

  public ExternalWalletAsset getAssetInExternalWallet(String walletId, String assetId) throws ApiException {
   return getAssetInExternalWalletWithHttpInfo(walletId,assetId, null).getData();
  }

  /**
   * Get an asset from an external wallet
   * Returns an external wallet by wallet ID and asset ID.
   * @param walletId The ID of the wallet (required)
   * @param assetId The ID of the asset to return (required)
   * @return ApiResponse&lt;ExternalWalletAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ExternalWalletAsset> getAssetInExternalWalletWithHttpInfo(String walletId,String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling getAssetInExternalWallet");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getAssetInExternalWallet");
    }

    // Path parameters
    String localVarPath = "/external_wallets/{walletId}/{assetId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExternalWalletAsset> localVarReturnType = new GenericType<ExternalWalletAsset>() {};
    return apiClient.invokeAPI("ExternalWalletsApi.getAssetInExternalWallet", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Find an external wallet
   * Returns an external wallet by ID.
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
  public UnmanagedWallet getExternalWalletById(String walletId,  RequestOptions requestOptions) throws ApiException {
     return getExternalWalletByIdWithHttpInfo(walletId, requestOptions).getData();
  }

  public UnmanagedWallet getExternalWalletById(String walletId) throws ApiException {
   return getExternalWalletByIdWithHttpInfo(walletId, null).getData();
  }

  /**
   * Find an external wallet
   * Returns an external wallet by ID.
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
  public ApiResponse<UnmanagedWallet> getExternalWalletByIdWithHttpInfo(String walletId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling getExternalWalletById");
    }

    // Path parameters
    String localVarPath = "/external_wallets/{walletId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<UnmanagedWallet> localVarReturnType = new GenericType<UnmanagedWallet>() {};
    return apiClient.invokeAPI("ExternalWalletsApi.getExternalWalletById", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List external wallets
   * Gets a list of external wallets under the workspace.
   * @return List&lt;UnmanagedWallet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of external wallets </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<UnmanagedWallet> getExternalWallets( RequestOptions requestOptions) throws ApiException {
     return getExternalWalletsWithHttpInfo( requestOptions).getData();
  }

  public List<UnmanagedWallet> getExternalWallets() throws ApiException {
   return getExternalWalletsWithHttpInfo( null).getData();
  }

  /**
   * List external wallets
   * Gets a list of external wallets under the workspace.
   * @return ApiResponse&lt;List&lt;UnmanagedWallet&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of external wallets </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<UnmanagedWallet>> getExternalWalletsWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<UnmanagedWallet>> localVarReturnType = new GenericType<List<UnmanagedWallet>>() {};
    return apiClient.invokeAPI("ExternalWalletsApi.getExternalWallets", "/external_wallets", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete an asset from an external wallet
   * Deletes an external wallet asset by ID.
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
  public void removeAssetFromExternalWallet(String walletId, String assetId,  RequestOptions requestOptions) throws ApiException {
    removeAssetFromExternalWalletWithHttpInfo(walletId,assetId, requestOptions);
  }

  public void removeAssetFromExternalWallet(String walletId, String assetId) throws ApiException {
  removeAssetFromExternalWalletWithHttpInfo(walletId,assetId, null);
  }

  /**
   * Delete an asset from an external wallet
   * Deletes an external wallet asset by ID.
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
  public ApiResponse<Void> removeAssetFromExternalWalletWithHttpInfo(String walletId,String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling removeAssetFromExternalWallet");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling removeAssetFromExternalWallet");
    }

    // Path parameters
    String localVarPath = "/external_wallets/{walletId}/{assetId}"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ExternalWalletsApi.removeAssetFromExternalWallet", localVarPath, "DELETE", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Set an AML customer reference ID for an external wallet
   * Sets an AML/KYT customer reference ID for the specific external wallet.
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
  public void setCustomerRefIdForExternalWallet(String walletId, SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest,  RequestOptions requestOptions) throws ApiException {
    setCustomerRefIdForExternalWalletWithHttpInfo(walletId,setCustomerRefIdForVaultAccountRequest, requestOptions);
  }

  public void setCustomerRefIdForExternalWallet(String walletId, SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest) throws ApiException {
  setCustomerRefIdForExternalWalletWithHttpInfo(walletId,setCustomerRefIdForVaultAccountRequest, null);
  }

  /**
   * Set an AML customer reference ID for an external wallet
   * Sets an AML/KYT customer reference ID for the specific external wallet.
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
  public ApiResponse<Void> setCustomerRefIdForExternalWalletWithHttpInfo(String walletId,SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (walletId == null) {
      throw new ApiException(400, "Missing the required parameter 'walletId' when calling setCustomerRefIdForExternalWallet");
    }
    if (setCustomerRefIdForVaultAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setCustomerRefIdForVaultAccountRequest' when calling setCustomerRefIdForExternalWallet");
    }

    // Path parameters
    String localVarPath = "/external_wallets/{walletId}/set_customer_ref_id"
            .replaceAll("\\{walletId}", apiClient.escapeString(walletId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setCustomerRefIdForVaultAccountRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ExternalWalletsApi.setCustomerRefIdForExternalWallet", localVarPath, "POST", new ArrayList<>(), setCustomerRefIdForVaultAccountRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
