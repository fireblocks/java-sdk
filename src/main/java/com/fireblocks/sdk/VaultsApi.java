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
import java.math.BigDecimal;
import com.fireblocks.sdk.model.CreateAddressResponse;
import com.fireblocks.sdk.model.CreateVaultAccountAssetAddressRequest;
import com.fireblocks.sdk.model.CreateVaultAccountAssetRequest;
import com.fireblocks.sdk.model.CreateVaultAccountRequest;
import com.fireblocks.sdk.model.CreateVaultAssetResponse;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.PaginatedAssetWalletResponse;
import com.fireblocks.sdk.model.PublicKeyInformation;
import com.fireblocks.sdk.model.SetAutoFuelForVaultAccountRequest;
import com.fireblocks.sdk.model.SetCustomerRefIdForVaultAccountRequest;
import com.fireblocks.sdk.model.UnspentInputsResponse;
import com.fireblocks.sdk.model.UpdateVaultAccountAssetAddressRequest;
import com.fireblocks.sdk.model.UpdateVaultAccountRequest;
import com.fireblocks.sdk.model.VaultAccount;
import com.fireblocks.sdk.model.VaultAccountsPagedResponse;
import com.fireblocks.sdk.model.VaultAsset;
import com.fireblocks.sdk.model.VaultWalletAddress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VaultsApi {
  private ApiClient apiClient;

  public VaultsApi() {
    this.apiClient = new ApiClient();
  }

  public VaultsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Activate a wallet in a vault account
   * Initiates activation for a wallet in a vault account.
   * @param vaultAccountId The ID of the vault account to return, or &#39;default&#39; for the default vault account (required)
   * @param assetId The ID of the asset (required)
   * @return CreateVaultAssetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateVaultAssetResponse activateAssetForVaultAccount(String vaultAccountId, String assetId,  RequestOptions requestOptions) throws ApiException {
     return activateAssetForVaultAccountWithHttpInfo(vaultAccountId,assetId, requestOptions).getData();
  }

  public CreateVaultAssetResponse activateAssetForVaultAccount(String vaultAccountId, String assetId) throws ApiException {
   return activateAssetForVaultAccountWithHttpInfo(vaultAccountId,assetId, null).getData();
  }

  /**
   * Activate a wallet in a vault account
   * Initiates activation for a wallet in a vault account.
   * @param vaultAccountId The ID of the vault account to return, or &#39;default&#39; for the default vault account (required)
   * @param assetId The ID of the asset (required)
   * @return ApiResponse&lt;CreateVaultAssetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateVaultAssetResponse> activateAssetForVaultAccountWithHttpInfo(String vaultAccountId,String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling activateAssetForVaultAccount");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling activateAssetForVaultAccount");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/activate"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CreateVaultAssetResponse> localVarReturnType = new GenericType<CreateVaultAssetResponse>() {};
    return apiClient.invokeAPI("VaultsApi.activateAssetForVaultAccount", localVarPath, "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Convert a segwit address to legacy format
   * Converts an existing segwit address to the legacy format.
   * @param vaultAccountId The ID of the vault account (required)
   * @param assetId The ID of the asset (required)
   * @param addressId The segwit address to translate (required)
   * @return CreateAddressResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The created address </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateAddressResponse createLegacyAddressForVaultAccountAsset(String vaultAccountId, String assetId, String addressId,  RequestOptions requestOptions) throws ApiException {
     return createLegacyAddressForVaultAccountAssetWithHttpInfo(vaultAccountId,assetId,addressId, requestOptions).getData();
  }

  public CreateAddressResponse createLegacyAddressForVaultAccountAsset(String vaultAccountId, String assetId, String addressId) throws ApiException {
   return createLegacyAddressForVaultAccountAssetWithHttpInfo(vaultAccountId,assetId,addressId, null).getData();
  }

  /**
   * Convert a segwit address to legacy format
   * Converts an existing segwit address to the legacy format.
   * @param vaultAccountId The ID of the vault account (required)
   * @param assetId The ID of the asset (required)
   * @param addressId The segwit address to translate (required)
   * @return ApiResponse&lt;CreateAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The created address </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateAddressResponse> createLegacyAddressForVaultAccountAssetWithHttpInfo(String vaultAccountId,String assetId,String addressId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling createLegacyAddressForVaultAccountAsset");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling createLegacyAddressForVaultAccountAsset");
    }
    if (addressId == null) {
      throw new ApiException(400, "Missing the required parameter 'addressId' when calling createLegacyAddressForVaultAccountAsset");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId))
            .replaceAll("\\{addressId}", apiClient.escapeString(addressId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CreateAddressResponse> localVarReturnType = new GenericType<CreateAddressResponse>() {};
    return apiClient.invokeAPI("VaultsApi.createLegacyAddressForVaultAccountAsset", localVarPath, "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Create a new vault account
   * Creates a new vault account with the requested name.
   * @param createVaultAccountRequest  (required)
   * @return VaultAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Vault Account object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public VaultAccount createVaultAccount(CreateVaultAccountRequest createVaultAccountRequest,  RequestOptions requestOptions) throws ApiException {
     return createVaultAccountWithHttpInfo(createVaultAccountRequest, requestOptions).getData();
  }

  public VaultAccount createVaultAccount(CreateVaultAccountRequest createVaultAccountRequest) throws ApiException {
   return createVaultAccountWithHttpInfo(createVaultAccountRequest, null).getData();
  }

  /**
   * Create a new vault account
   * Creates a new vault account with the requested name.
   * @param createVaultAccountRequest  (required)
   * @return ApiResponse&lt;VaultAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Vault Account object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<VaultAccount> createVaultAccountWithHttpInfo(CreateVaultAccountRequest createVaultAccountRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (createVaultAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createVaultAccountRequest' when calling createVaultAccount");
    }

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = createVaultAccountRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<VaultAccount> localVarReturnType = new GenericType<VaultAccount>() {};
    return apiClient.invokeAPI("VaultsApi.createVaultAccount", "/vault/accounts", "POST", new ArrayList<>(), createVaultAccountRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Create a new wallet
   * Creates a wallet for a specific asset in a vault account.
   * @param vaultAccountId The ID of the vault account to return, or &#39;default&#39; for the default vault account (required)
   * @param assetId The ID of the asset (required)
   * @param createVaultAccountAssetRequest  (optional)
   * @return CreateVaultAssetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateVaultAssetResponse createVaultAccountAsset(String vaultAccountId, String assetId, CreateVaultAccountAssetRequest createVaultAccountAssetRequest,  RequestOptions requestOptions) throws ApiException {
     return createVaultAccountAssetWithHttpInfo(vaultAccountId,assetId,createVaultAccountAssetRequest, requestOptions).getData();
  }

  public CreateVaultAssetResponse createVaultAccountAsset(String vaultAccountId, String assetId, CreateVaultAccountAssetRequest createVaultAccountAssetRequest) throws ApiException {
   return createVaultAccountAssetWithHttpInfo(vaultAccountId,assetId,createVaultAccountAssetRequest, null).getData();
  }

  /**
   * Create a new wallet
   * Creates a wallet for a specific asset in a vault account.
   * @param vaultAccountId The ID of the vault account to return, or &#39;default&#39; for the default vault account (required)
   * @param assetId The ID of the asset (required)
   * @param createVaultAccountAssetRequest  (optional)
   * @return ApiResponse&lt;CreateVaultAssetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateVaultAssetResponse> createVaultAccountAssetWithHttpInfo(String vaultAccountId,String assetId,CreateVaultAccountAssetRequest createVaultAccountAssetRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling createVaultAccountAsset");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling createVaultAccountAsset");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = createVaultAccountAssetRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateVaultAssetResponse> localVarReturnType = new GenericType<CreateVaultAssetResponse>() {};
    return apiClient.invokeAPI("VaultsApi.createVaultAccountAsset", localVarPath, "POST", new ArrayList<>(), createVaultAccountAssetRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Create new asset deposit address
   * Creates a new deposit address for an asset of a vault account.
   * @param vaultAccountId The ID of the vault account to return (required)
   * @param assetId The ID of the asset (required)
   * @param createVaultAccountAssetAddressRequest  (optional)
   * @return CreateAddressResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The created address </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateAddressResponse createVaultAccountAssetAddress(String vaultAccountId, String assetId, CreateVaultAccountAssetAddressRequest createVaultAccountAssetAddressRequest,  RequestOptions requestOptions) throws ApiException {
     return createVaultAccountAssetAddressWithHttpInfo(vaultAccountId,assetId,createVaultAccountAssetAddressRequest, requestOptions).getData();
  }

  public CreateAddressResponse createVaultAccountAssetAddress(String vaultAccountId, String assetId, CreateVaultAccountAssetAddressRequest createVaultAccountAssetAddressRequest) throws ApiException {
   return createVaultAccountAssetAddressWithHttpInfo(vaultAccountId,assetId,createVaultAccountAssetAddressRequest, null).getData();
  }

  /**
   * Create new asset deposit address
   * Creates a new deposit address for an asset of a vault account.
   * @param vaultAccountId The ID of the vault account to return (required)
   * @param assetId The ID of the asset (required)
   * @param createVaultAccountAssetAddressRequest  (optional)
   * @return ApiResponse&lt;CreateAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The created address </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateAddressResponse> createVaultAccountAssetAddressWithHttpInfo(String vaultAccountId,String assetId,CreateVaultAccountAssetAddressRequest createVaultAccountAssetAddressRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling createVaultAccountAssetAddress");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling createVaultAccountAssetAddress");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/addresses"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = createVaultAccountAssetAddressRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateAddressResponse> localVarReturnType = new GenericType<CreateAddressResponse>() {};
    return apiClient.invokeAPI("VaultsApi.createVaultAccountAssetAddress", localVarPath, "POST", new ArrayList<>(), createVaultAccountAssetAddressRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List asset wallets (Paginated)
   * Gets all asset wallets at all of the vault accounts in your workspace. An asset wallet is an asset at a vault account. This method allows fast traversal of all account balances. **Note:**   - This API endpoint is in limited availability and available for selected customers. If you would like to get early access to this endpoint, please reach out to [Fireblocks Support](https://support.fireblocks.io/hc/en-us/requests/new?ticket_form_id&#x3D;36000337220)   - This API call is subject to [rate limits](https://developers.fireblocks.com/reference/rate-limiting). 
   * @param totalAmountLargerThan When specified, only asset wallets with total balance larger than this amount are returned. (optional)
   * @param assetId When specified, only asset wallets cross vault accounts that have this asset ID are returned. (optional)
   * @param before Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page. (optional)
   * @param after Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page. (optional)
   * @param limit The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000. (optional, default to 200)
   * @return PaginatedAssetWalletResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A PaginatedAssetWalletResponse object </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public PaginatedAssetWalletResponse getAssetWallets(BigDecimal totalAmountLargerThan, String assetId, String before, String after, BigDecimal limit,  RequestOptions requestOptions) throws ApiException {
     return getAssetWalletsWithHttpInfo(totalAmountLargerThan,assetId,before,after,limit, requestOptions).getData();
  }

  public PaginatedAssetWalletResponse getAssetWallets(BigDecimal totalAmountLargerThan, String assetId, String before, String after, BigDecimal limit) throws ApiException {
   return getAssetWalletsWithHttpInfo(totalAmountLargerThan,assetId,before,after,limit, null).getData();
  }

  /**
   * List asset wallets (Paginated)
   * Gets all asset wallets at all of the vault accounts in your workspace. An asset wallet is an asset at a vault account. This method allows fast traversal of all account balances. **Note:**   - This API endpoint is in limited availability and available for selected customers. If you would like to get early access to this endpoint, please reach out to [Fireblocks Support](https://support.fireblocks.io/hc/en-us/requests/new?ticket_form_id&#x3D;36000337220)   - This API call is subject to [rate limits](https://developers.fireblocks.com/reference/rate-limiting). 
   * @param totalAmountLargerThan When specified, only asset wallets with total balance larger than this amount are returned. (optional)
   * @param assetId When specified, only asset wallets cross vault accounts that have this asset ID are returned. (optional)
   * @param before Fetches the next paginated response before this element. This element is a cursor and is returned at the response of the previous page. (optional)
   * @param after Fetches the next paginated response after this element. This element is a cursor and is returned at the response of the previous page. (optional)
   * @param limit The maximum number of asset wallets in a single response. The default is 200 and the maximum is 1000. (optional, default to 200)
   * @return ApiResponse&lt;PaginatedAssetWalletResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A PaginatedAssetWalletResponse object </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<PaginatedAssetWalletResponse> getAssetWalletsWithHttpInfo(BigDecimal totalAmountLargerThan,String assetId,String before,String after,BigDecimal limit, RequestOptions requestOptions) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "totalAmountLargerThan", totalAmountLargerThan)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetId", assetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PaginatedAssetWalletResponse> localVarReturnType = new GenericType<PaginatedAssetWalletResponse>() {};
    return apiClient.invokeAPI("VaultsApi.getAssetWallets", "/vault/asset_wallets", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get the maximum spendable amount in a single transaction.
   * Get the maximum amount of a particular asset that can be spent in a single transaction from a specified vault account (UTXO assets only, with a limitation on number of inputs embedded). Send several transactions if you want to spend more than the maximum spendable amount.
   * @param vaultAccountId The ID of the vault account, or &#39;default&#39; for the default vault account (required)
   * @param assetId The ID of the asset (required)
   * @param manualSignging False by default. The maximum number of inputs depends if the transaction will be signed by an automated co-signer server or on a mobile device. (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void getMaxSpendableAmount(String vaultAccountId, String assetId, Boolean manualSignging,  RequestOptions requestOptions) throws ApiException {
    getMaxSpendableAmountWithHttpInfo(vaultAccountId,assetId,manualSignging, requestOptions);
  }

  public void getMaxSpendableAmount(String vaultAccountId, String assetId, Boolean manualSignging) throws ApiException {
  getMaxSpendableAmountWithHttpInfo(vaultAccountId,assetId,manualSignging, null);
  }

  /**
   * Get the maximum spendable amount in a single transaction.
   * Get the maximum amount of a particular asset that can be spent in a single transaction from a specified vault account (UTXO assets only, with a limitation on number of inputs embedded). Send several transactions if you want to spend more than the maximum spendable amount.
   * @param vaultAccountId The ID of the vault account, or &#39;default&#39; for the default vault account (required)
   * @param assetId The ID of the asset (required)
   * @param manualSignging False by default. The maximum number of inputs depends if the transaction will be signed by an automated co-signer server or on a mobile device. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> getMaxSpendableAmountWithHttpInfo(String vaultAccountId,String assetId,Boolean manualSignging, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling getMaxSpendableAmount");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getMaxSpendableAmount");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "manualSignging", manualSignging)
    );

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("VaultsApi.getMaxSpendableAmount", localVarPath, "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * List vault acounts (Paginated)
   * Gets all vault accounts in your workspace. This endpoint returns a limited amount of results with a quick response time.
   * @param namePrefix  (optional)
   * @param nameSuffix  (optional)
   * @param minAmountThreshold  (optional)
   * @param assetId  (optional)
   * @param orderBy  (optional, default to DESC)
   * @param before  (optional)
   * @param after  (optional)
   * @param limit  (optional, default to 200)
   * @return VaultAccountsPagedResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A VaultAccountsPagedResponse object </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public VaultAccountsPagedResponse getPagedVaultAccounts(String namePrefix, String nameSuffix, BigDecimal minAmountThreshold, String assetId, String orderBy, String before, String after, BigDecimal limit,  RequestOptions requestOptions) throws ApiException {
     return getPagedVaultAccountsWithHttpInfo(namePrefix,nameSuffix,minAmountThreshold,assetId,orderBy,before,after,limit, requestOptions).getData();
  }

  public VaultAccountsPagedResponse getPagedVaultAccounts(String namePrefix, String nameSuffix, BigDecimal minAmountThreshold, String assetId, String orderBy, String before, String after, BigDecimal limit) throws ApiException {
   return getPagedVaultAccountsWithHttpInfo(namePrefix,nameSuffix,minAmountThreshold,assetId,orderBy,before,after,limit, null).getData();
  }

  /**
   * List vault acounts (Paginated)
   * Gets all vault accounts in your workspace. This endpoint returns a limited amount of results with a quick response time.
   * @param namePrefix  (optional)
   * @param nameSuffix  (optional)
   * @param minAmountThreshold  (optional)
   * @param assetId  (optional)
   * @param orderBy  (optional, default to DESC)
   * @param before  (optional)
   * @param after  (optional)
   * @param limit  (optional, default to 200)
   * @return ApiResponse&lt;VaultAccountsPagedResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A VaultAccountsPagedResponse object </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<VaultAccountsPagedResponse> getPagedVaultAccountsWithHttpInfo(String namePrefix,String nameSuffix,BigDecimal minAmountThreshold,String assetId,String orderBy,String before,String after,BigDecimal limit, RequestOptions requestOptions) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "namePrefix", namePrefix)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nameSuffix", nameSuffix));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minAmountThreshold", minAmountThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetId", assetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<VaultAccountsPagedResponse> localVarReturnType = new GenericType<VaultAccountsPagedResponse>() {};
    return apiClient.invokeAPI("VaultsApi.getPagedVaultAccounts", "/vault/accounts_paged", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get the public key information
   * Gets the public key information based on derivation path and signing algorithm.
   * @param derivationPath  (required)
   * @param algorithm  (required)
   * @param compressed  (optional)
   * @return PublicKeyInformation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Public key information </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public PublicKeyInformation getPublicKeyInfo(String derivationPath, String algorithm, Boolean compressed,  RequestOptions requestOptions) throws ApiException {
     return getPublicKeyInfoWithHttpInfo(derivationPath,algorithm,compressed, requestOptions).getData();
  }

  public PublicKeyInformation getPublicKeyInfo(String derivationPath, String algorithm, Boolean compressed) throws ApiException {
   return getPublicKeyInfoWithHttpInfo(derivationPath,algorithm,compressed, null).getData();
  }

  /**
   * Get the public key information
   * Gets the public key information based on derivation path and signing algorithm.
   * @param derivationPath  (required)
   * @param algorithm  (required)
   * @param compressed  (optional)
   * @return ApiResponse&lt;PublicKeyInformation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Public key information </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<PublicKeyInformation> getPublicKeyInfoWithHttpInfo(String derivationPath,String algorithm,Boolean compressed, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (derivationPath == null) {
      throw new ApiException(400, "Missing the required parameter 'derivationPath' when calling getPublicKeyInfo");
    }
    if (algorithm == null) {
      throw new ApiException(400, "Missing the required parameter 'algorithm' when calling getPublicKeyInfo");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "derivationPath", derivationPath)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algorithm", algorithm));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "compressed", compressed));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PublicKeyInformation> localVarReturnType = new GenericType<PublicKeyInformation>() {};
    return apiClient.invokeAPI("VaultsApi.getPublicKeyInfo", "/vault/public_key_info/", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get the public key for a vault account
   * Gets the public key information for the vault account.
   * @param vaultAccountId  (required)
   * @param assetId  (required)
   * @param change  (required)
   * @param addressIndex  (required)
   * @param compressed  (optional)
   * @return PublicKeyInformation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Public Key Information </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public PublicKeyInformation getPublicKeyInfoForAddress(String vaultAccountId, String assetId, BigDecimal change, BigDecimal addressIndex, Boolean compressed,  RequestOptions requestOptions) throws ApiException {
     return getPublicKeyInfoForAddressWithHttpInfo(vaultAccountId,assetId,change,addressIndex,compressed, requestOptions).getData();
  }

  public PublicKeyInformation getPublicKeyInfoForAddress(String vaultAccountId, String assetId, BigDecimal change, BigDecimal addressIndex, Boolean compressed) throws ApiException {
   return getPublicKeyInfoForAddressWithHttpInfo(vaultAccountId,assetId,change,addressIndex,compressed, null).getData();
  }

  /**
   * Get the public key for a vault account
   * Gets the public key information for the vault account.
   * @param vaultAccountId  (required)
   * @param assetId  (required)
   * @param change  (required)
   * @param addressIndex  (required)
   * @param compressed  (optional)
   * @return ApiResponse&lt;PublicKeyInformation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Public Key Information </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<PublicKeyInformation> getPublicKeyInfoForAddressWithHttpInfo(String vaultAccountId,String assetId,BigDecimal change,BigDecimal addressIndex,Boolean compressed, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling getPublicKeyInfoForAddress");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getPublicKeyInfoForAddress");
    }
    if (change == null) {
      throw new ApiException(400, "Missing the required parameter 'change' when calling getPublicKeyInfoForAddress");
    }
    if (addressIndex == null) {
      throw new ApiException(400, "Missing the required parameter 'addressIndex' when calling getPublicKeyInfoForAddress");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId))
            .replaceAll("\\{change}", apiClient.escapeString(change.toString()))
            .replaceAll("\\{addressIndex}", apiClient.escapeString(addressIndex.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "compressed", compressed)
    );

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PublicKeyInformation> localVarReturnType = new GenericType<PublicKeyInformation>() {};
    return apiClient.invokeAPI("VaultsApi.getPublicKeyInfoForAddress", localVarPath, "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get the asset balance for a vault account
   * Returns a wallet for a specific asset of a vault account.
   * @param vaultAccountId The ID of the vault account to return (required)
   * @param assetId The ID of the asset (required)
   * @return VaultAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A VaultAsset object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public VaultAsset getVaultAccountAsset(String vaultAccountId, String assetId,  RequestOptions requestOptions) throws ApiException {
     return getVaultAccountAssetWithHttpInfo(vaultAccountId,assetId, requestOptions).getData();
  }

  public VaultAsset getVaultAccountAsset(String vaultAccountId, String assetId) throws ApiException {
   return getVaultAccountAssetWithHttpInfo(vaultAccountId,assetId, null).getData();
  }

  /**
   * Get the asset balance for a vault account
   * Returns a wallet for a specific asset of a vault account.
   * @param vaultAccountId The ID of the vault account to return (required)
   * @param assetId The ID of the asset (required)
   * @return ApiResponse&lt;VaultAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A VaultAsset object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<VaultAsset> getVaultAccountAssetWithHttpInfo(String vaultAccountId,String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling getVaultAccountAsset");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getVaultAccountAsset");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<VaultAsset> localVarReturnType = new GenericType<VaultAsset>() {};
    return apiClient.invokeAPI("VaultsApi.getVaultAccountAsset", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get asset addresses
   * Lists all addresses for specific asset of vault account.
   * @param vaultAccountId The ID of the vault account to return (required)
   * @param assetId The ID of the asset (required)
   * @return List&lt;VaultWalletAddress&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of deposit addresses </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<VaultWalletAddress> getVaultAccountAssetAddresses(String vaultAccountId, String assetId,  RequestOptions requestOptions) throws ApiException {
     return getVaultAccountAssetAddressesWithHttpInfo(vaultAccountId,assetId, requestOptions).getData();
  }

  public List<VaultWalletAddress> getVaultAccountAssetAddresses(String vaultAccountId, String assetId) throws ApiException {
   return getVaultAccountAssetAddressesWithHttpInfo(vaultAccountId,assetId, null).getData();
  }

  /**
   * Get asset addresses
   * Lists all addresses for specific asset of vault account.
   * @param vaultAccountId The ID of the vault account to return (required)
   * @param assetId The ID of the asset (required)
   * @return ApiResponse&lt;List&lt;VaultWalletAddress&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of deposit addresses </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<VaultWalletAddress>> getVaultAccountAssetAddressesWithHttpInfo(String vaultAccountId,String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling getVaultAccountAssetAddresses");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getVaultAccountAssetAddresses");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/addresses"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<VaultWalletAddress>> localVarReturnType = new GenericType<List<VaultWalletAddress>>() {};
    return apiClient.invokeAPI("VaultsApi.getVaultAccountAssetAddresses", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get UTXO unspent inputs information
   * Returns unspent inputs information of an asset in a vault account.
   * @param vaultAccountId The ID of the vault account (required)
   * @param assetId The ID of the asset (required)
   * @return List&lt;UnspentInputsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of Unspent information per input </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<UnspentInputsResponse> getVaultAccountAssetUnspentInputs(String vaultAccountId, String assetId,  RequestOptions requestOptions) throws ApiException {
     return getVaultAccountAssetUnspentInputsWithHttpInfo(vaultAccountId,assetId, requestOptions).getData();
  }

  public List<UnspentInputsResponse> getVaultAccountAssetUnspentInputs(String vaultAccountId, String assetId) throws ApiException {
   return getVaultAccountAssetUnspentInputsWithHttpInfo(vaultAccountId,assetId, null).getData();
  }

  /**
   * Get UTXO unspent inputs information
   * Returns unspent inputs information of an asset in a vault account.
   * @param vaultAccountId The ID of the vault account (required)
   * @param assetId The ID of the asset (required)
   * @return ApiResponse&lt;List&lt;UnspentInputsResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of Unspent information per input </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<UnspentInputsResponse>> getVaultAccountAssetUnspentInputsWithHttpInfo(String vaultAccountId,String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling getVaultAccountAssetUnspentInputs");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getVaultAccountAssetUnspentInputs");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<UnspentInputsResponse>> localVarReturnType = new GenericType<List<UnspentInputsResponse>>() {};
    return apiClient.invokeAPI("VaultsApi.getVaultAccountAssetUnspentInputs", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Find a vault account by ID
   * Returns the requested vault account.
   * @param vaultAccountId The ID of the vault account to return type: string (required)
   * @return VaultAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Vault Account object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public VaultAccount getVaultAccountById(String vaultAccountId,  RequestOptions requestOptions) throws ApiException {
     return getVaultAccountByIdWithHttpInfo(vaultAccountId, requestOptions).getData();
  }

  public VaultAccount getVaultAccountById(String vaultAccountId) throws ApiException {
   return getVaultAccountByIdWithHttpInfo(vaultAccountId, null).getData();
  }

  /**
   * Find a vault account by ID
   * Returns the requested vault account.
   * @param vaultAccountId The ID of the vault account to return type: string (required)
   * @return ApiResponse&lt;VaultAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Vault Account object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<VaultAccount> getVaultAccountByIdWithHttpInfo(String vaultAccountId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling getVaultAccountById");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<VaultAccount> localVarReturnType = new GenericType<VaultAccount>() {};
    return apiClient.invokeAPI("VaultsApi.getVaultAccountById", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List vault accounts
   * Gets all vault accounts in your workspace.
   * @param namePrefix  (optional)
   * @param nameSuffix  (optional)
   * @param minAmountThreshold  (optional)
   * @param assetId  (optional)
   * @return List&lt;VaultAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of vault accounts </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<VaultAccount> getVaultAccounts(String namePrefix, String nameSuffix, BigDecimal minAmountThreshold, String assetId,  RequestOptions requestOptions) throws ApiException {
     return getVaultAccountsWithHttpInfo(namePrefix,nameSuffix,minAmountThreshold,assetId, requestOptions).getData();
  }

  public List<VaultAccount> getVaultAccounts(String namePrefix, String nameSuffix, BigDecimal minAmountThreshold, String assetId) throws ApiException {
   return getVaultAccountsWithHttpInfo(namePrefix,nameSuffix,minAmountThreshold,assetId, null).getData();
  }

  /**
   * List vault accounts
   * Gets all vault accounts in your workspace.
   * @param namePrefix  (optional)
   * @param nameSuffix  (optional)
   * @param minAmountThreshold  (optional)
   * @param assetId  (optional)
   * @return ApiResponse&lt;List&lt;VaultAccount&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of vault accounts </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<VaultAccount>> getVaultAccountsWithHttpInfo(String namePrefix,String nameSuffix,BigDecimal minAmountThreshold,String assetId, RequestOptions requestOptions) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "namePrefix", namePrefix)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nameSuffix", nameSuffix));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minAmountThreshold", minAmountThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assetId", assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<VaultAccount>> localVarReturnType = new GenericType<List<VaultAccount>>() {};
    return apiClient.invokeAPI("VaultsApi.getVaultAccounts", "/vault/accounts", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get vault balance by asset
   * Gets the vault balance summary for an asset.
   * @param assetId  (required)
   * @return VaultAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Vault amount by asset </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public VaultAsset getVaultAssetById(String assetId,  RequestOptions requestOptions) throws ApiException {
     return getVaultAssetByIdWithHttpInfo(assetId, requestOptions).getData();
  }

  public VaultAsset getVaultAssetById(String assetId) throws ApiException {
   return getVaultAssetByIdWithHttpInfo(assetId, null).getData();
  }

  /**
   * Get vault balance by asset
   * Gets the vault balance summary for an asset.
   * @param assetId  (required)
   * @return ApiResponse&lt;VaultAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Vault amount by asset </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<VaultAsset> getVaultAssetByIdWithHttpInfo(String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getVaultAssetById");
    }

    // Path parameters
    String localVarPath = "/vault/assets/{assetId}"
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<VaultAsset> localVarReturnType = new GenericType<VaultAsset>() {};
    return apiClient.invokeAPI("VaultsApi.getVaultAssetById", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get asset balance for chosen assets
   * Gets the assets amount summary for all accounts or filtered accounts.
   * @param accountNamePrefix  (optional)
   * @param accountNameSuffix  (optional)
   * @return List&lt;VaultAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Amount by asset </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<VaultAsset> getVaultAssets(String accountNamePrefix, String accountNameSuffix,  RequestOptions requestOptions) throws ApiException {
     return getVaultAssetsWithHttpInfo(accountNamePrefix,accountNameSuffix, requestOptions).getData();
  }

  public List<VaultAsset> getVaultAssets(String accountNamePrefix, String accountNameSuffix) throws ApiException {
   return getVaultAssetsWithHttpInfo(accountNamePrefix,accountNameSuffix, null).getData();
  }

  /**
   * Get asset balance for chosen assets
   * Gets the assets amount summary for all accounts or filtered accounts.
   * @param accountNamePrefix  (optional)
   * @param accountNameSuffix  (optional)
   * @return ApiResponse&lt;List&lt;VaultAsset&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Amount by asset </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<VaultAsset>> getVaultAssetsWithHttpInfo(String accountNamePrefix,String accountNameSuffix, RequestOptions requestOptions) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "accountNamePrefix", accountNamePrefix)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountNameSuffix", accountNameSuffix));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<VaultAsset>> localVarReturnType = new GenericType<List<VaultAsset>>() {};
    return apiClient.invokeAPI("VaultsApi.getVaultAssets", "/vault/assets", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Hide a vault account in the console
   * Hides the requested vault account from the web console view.
   * @param vaultAccountId The vault account to hide (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void hideVaultAccount(String vaultAccountId,  RequestOptions requestOptions) throws ApiException {
    hideVaultAccountWithHttpInfo(vaultAccountId, requestOptions);
  }

  public void hideVaultAccount(String vaultAccountId) throws ApiException {
  hideVaultAccountWithHttpInfo(vaultAccountId, null);
  }

  /**
   * Hide a vault account in the console
   * Hides the requested vault account from the web console view.
   * @param vaultAccountId The vault account to hide (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> hideVaultAccountWithHttpInfo(String vaultAccountId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling hideVaultAccount");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/hide"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("VaultsApi.hideVaultAccount", localVarPath, "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Turn autofueling on or off
   * Sets the autofueling property of the vault account to enabled or disabled.
   * @param vaultAccountId The vault account ID (required)
   * @param setAutoFuelForVaultAccountRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void setAutoFuelForVaultAccount(String vaultAccountId, SetAutoFuelForVaultAccountRequest setAutoFuelForVaultAccountRequest,  RequestOptions requestOptions) throws ApiException {
    setAutoFuelForVaultAccountWithHttpInfo(vaultAccountId,setAutoFuelForVaultAccountRequest, requestOptions);
  }

  public void setAutoFuelForVaultAccount(String vaultAccountId, SetAutoFuelForVaultAccountRequest setAutoFuelForVaultAccountRequest) throws ApiException {
  setAutoFuelForVaultAccountWithHttpInfo(vaultAccountId,setAutoFuelForVaultAccountRequest, null);
  }

  /**
   * Turn autofueling on or off
   * Sets the autofueling property of the vault account to enabled or disabled.
   * @param vaultAccountId The vault account ID (required)
   * @param setAutoFuelForVaultAccountRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> setAutoFuelForVaultAccountWithHttpInfo(String vaultAccountId,SetAutoFuelForVaultAccountRequest setAutoFuelForVaultAccountRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling setAutoFuelForVaultAccount");
    }
    if (setAutoFuelForVaultAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setAutoFuelForVaultAccountRequest' when calling setAutoFuelForVaultAccount");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/set_auto_fuel"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setAutoFuelForVaultAccountRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("VaultsApi.setAutoFuelForVaultAccount", localVarPath, "POST", new ArrayList<>(), setAutoFuelForVaultAccountRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Set an AML/KYT customer reference ID for a vault account
   * Assigns an AML/KYT customer reference ID for the vault account.
   * @param vaultAccountId The vault account ID (required)
   * @param setCustomerRefIdForVaultAccountRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void setCustomerRefIdForVaultAccount(String vaultAccountId, SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest,  RequestOptions requestOptions) throws ApiException {
    setCustomerRefIdForVaultAccountWithHttpInfo(vaultAccountId,setCustomerRefIdForVaultAccountRequest, requestOptions);
  }

  public void setCustomerRefIdForVaultAccount(String vaultAccountId, SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest) throws ApiException {
  setCustomerRefIdForVaultAccountWithHttpInfo(vaultAccountId,setCustomerRefIdForVaultAccountRequest, null);
  }

  /**
   * Set an AML/KYT customer reference ID for a vault account
   * Assigns an AML/KYT customer reference ID for the vault account.
   * @param vaultAccountId The vault account ID (required)
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
  public ApiResponse<Void> setCustomerRefIdForVaultAccountWithHttpInfo(String vaultAccountId,SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling setCustomerRefIdForVaultAccount");
    }
    if (setCustomerRefIdForVaultAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setCustomerRefIdForVaultAccountRequest' when calling setCustomerRefIdForVaultAccount");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/set_customer_ref_id"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setCustomerRefIdForVaultAccountRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("VaultsApi.setCustomerRefIdForVaultAccount", localVarPath, "POST", new ArrayList<>(), setCustomerRefIdForVaultAccountRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Assign AML customer reference ID
   * Sets an AML/KYT customer reference ID for a specific address.
   * @param vaultAccountId The ID of the vault account (required)
   * @param assetId The ID of the asset (required)
   * @param addressId The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address (required)
   * @param setCustomerRefIdForVaultAccountRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void setCustomerRefIdForVaultAccountAssetAddress(String vaultAccountId, String assetId, String addressId, SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest,  RequestOptions requestOptions) throws ApiException {
    setCustomerRefIdForVaultAccountAssetAddressWithHttpInfo(vaultAccountId,assetId,addressId,setCustomerRefIdForVaultAccountRequest, requestOptions);
  }

  public void setCustomerRefIdForVaultAccountAssetAddress(String vaultAccountId, String assetId, String addressId, SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest) throws ApiException {
  setCustomerRefIdForVaultAccountAssetAddressWithHttpInfo(vaultAccountId,assetId,addressId,setCustomerRefIdForVaultAccountRequest, null);
  }

  /**
   * Assign AML customer reference ID
   * Sets an AML/KYT customer reference ID for a specific address.
   * @param vaultAccountId The ID of the vault account (required)
   * @param assetId The ID of the asset (required)
   * @param addressId The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address (required)
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
  public ApiResponse<Void> setCustomerRefIdForVaultAccountAssetAddressWithHttpInfo(String vaultAccountId,String assetId,String addressId,SetCustomerRefIdForVaultAccountRequest setCustomerRefIdForVaultAccountRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling setCustomerRefIdForVaultAccountAssetAddress");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling setCustomerRefIdForVaultAccountAssetAddress");
    }
    if (addressId == null) {
      throw new ApiException(400, "Missing the required parameter 'addressId' when calling setCustomerRefIdForVaultAccountAssetAddress");
    }
    if (setCustomerRefIdForVaultAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setCustomerRefIdForVaultAccountRequest' when calling setCustomerRefIdForVaultAccountAssetAddress");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId))
            .replaceAll("\\{addressId}", apiClient.escapeString(addressId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setCustomerRefIdForVaultAccountRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("VaultsApi.setCustomerRefIdForVaultAccountAssetAddress", localVarPath, "POST", new ArrayList<>(), setCustomerRefIdForVaultAccountRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Unhide a vault account in the console
   * Makes a hidden vault account visible in web console view.
   * @param vaultAccountId The vault account to unhide (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void unhideVaultAccount(String vaultAccountId,  RequestOptions requestOptions) throws ApiException {
    unhideVaultAccountWithHttpInfo(vaultAccountId, requestOptions);
  }

  public void unhideVaultAccount(String vaultAccountId) throws ApiException {
  unhideVaultAccountWithHttpInfo(vaultAccountId, null);
  }

  /**
   * Unhide a vault account in the console
   * Makes a hidden vault account visible in web console view.
   * @param vaultAccountId The vault account to unhide (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> unhideVaultAccountWithHttpInfo(String vaultAccountId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling unhideVaultAccount");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/unhide"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("VaultsApi.unhideVaultAccount", localVarPath, "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Rename a vault account
   * Renames the requested vault account.
   * @param vaultAccountId The ID of the vault account to edit (required)
   * @param updateVaultAccountRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void updateVaultAccount(String vaultAccountId, UpdateVaultAccountRequest updateVaultAccountRequest,  RequestOptions requestOptions) throws ApiException {
    updateVaultAccountWithHttpInfo(vaultAccountId,updateVaultAccountRequest, requestOptions);
  }

  public void updateVaultAccount(String vaultAccountId, UpdateVaultAccountRequest updateVaultAccountRequest) throws ApiException {
  updateVaultAccountWithHttpInfo(vaultAccountId,updateVaultAccountRequest, null);
  }

  /**
   * Rename a vault account
   * Renames the requested vault account.
   * @param vaultAccountId The ID of the vault account to edit (required)
   * @param updateVaultAccountRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateVaultAccountWithHttpInfo(String vaultAccountId,UpdateVaultAccountRequest updateVaultAccountRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling updateVaultAccount");
    }
    if (updateVaultAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateVaultAccountRequest' when calling updateVaultAccount");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = updateVaultAccountRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("VaultsApi.updateVaultAccount", localVarPath, "PUT", new ArrayList<>(), updateVaultAccountRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Update address description
   * Updates the description of an existing address of an asset in a vault account.
   * @param vaultAccountId The ID of the vault account (required)
   * @param assetId The ID of the asset (required)
   * @param addressId The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address (required)
   * @param updateVaultAccountAssetAddressRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void updateVaultAccountAssetAddress(String vaultAccountId, String assetId, String addressId, UpdateVaultAccountAssetAddressRequest updateVaultAccountAssetAddressRequest,  RequestOptions requestOptions) throws ApiException {
    updateVaultAccountAssetAddressWithHttpInfo(vaultAccountId,assetId,addressId,updateVaultAccountAssetAddressRequest, requestOptions);
  }

  public void updateVaultAccountAssetAddress(String vaultAccountId, String assetId, String addressId, UpdateVaultAccountAssetAddressRequest updateVaultAccountAssetAddressRequest) throws ApiException {
  updateVaultAccountAssetAddressWithHttpInfo(vaultAccountId,assetId,addressId,updateVaultAccountAssetAddressRequest, null);
  }

  /**
   * Update address description
   * Updates the description of an existing address of an asset in a vault account.
   * @param vaultAccountId The ID of the vault account (required)
   * @param assetId The ID of the asset (required)
   * @param addressId The address for which to add a description. For XRP, use &lt;address&gt;:&lt;tag&gt;, for all other assets, use only the address (required)
   * @param updateVaultAccountAssetAddressRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateVaultAccountAssetAddressWithHttpInfo(String vaultAccountId,String assetId,String addressId,UpdateVaultAccountAssetAddressRequest updateVaultAccountAssetAddressRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling updateVaultAccountAssetAddress");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling updateVaultAccountAssetAddress");
    }
    if (addressId == null) {
      throw new ApiException(400, "Missing the required parameter 'addressId' when calling updateVaultAccountAssetAddress");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId))
            .replaceAll("\\{addressId}", apiClient.escapeString(addressId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = updateVaultAccountAssetAddressRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("VaultsApi.updateVaultAccountAssetAddress", localVarPath, "PUT", new ArrayList<>(), updateVaultAccountAssetAddressRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Refresh asset balance data
   * Updates the balance of a specific asset in a vault account.
   * @param vaultAccountId The ID of the vault account to return (required)
   * @param assetId The ID of the asset (required)
   * @param body  (optional)
   * @return VaultAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A VaultAsset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public VaultAsset updateVaultAccountAssetBalance(String vaultAccountId, String assetId, Object body,  RequestOptions requestOptions) throws ApiException {
     return updateVaultAccountAssetBalanceWithHttpInfo(vaultAccountId,assetId,body, requestOptions).getData();
  }

  public VaultAsset updateVaultAccountAssetBalance(String vaultAccountId, String assetId, Object body) throws ApiException {
   return updateVaultAccountAssetBalanceWithHttpInfo(vaultAccountId,assetId,body, null).getData();
  }

  /**
   * Refresh asset balance data
   * Updates the balance of a specific asset in a vault account.
   * @param vaultAccountId The ID of the vault account to return (required)
   * @param assetId The ID of the asset (required)
   * @param body  (optional)
   * @return ApiResponse&lt;VaultAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A VaultAsset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<VaultAsset> updateVaultAccountAssetBalanceWithHttpInfo(String vaultAccountId,String assetId,Object body, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling updateVaultAccountAssetBalance");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling updateVaultAccountAssetBalance");
    }

    // Path parameters
    String localVarPath = "/vault/accounts/{vaultAccountId}/{assetId}/balance"
            .replaceAll("\\{vaultAccountId}", apiClient.escapeString(vaultAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = body;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<VaultAsset> localVarReturnType = new GenericType<VaultAsset>() {};
    return apiClient.invokeAPI("VaultsApi.updateVaultAccountAssetBalance", localVarPath, "POST", new ArrayList<>(), body,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
