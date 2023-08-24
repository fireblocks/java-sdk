package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.fireblocks.sdk.model.GetNFTs200Response;
import com.fireblocks.sdk.model.GetOwnershipTokens200Response;
import com.fireblocks.sdk.model.ListOwnedCollections200Response;
import com.fireblocks.sdk.model.TokenResponse;
import com.fireblocks.sdk.model.UpdateTokenOwnershipStatusDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NftsApi {
  private ApiClient apiClient;

  public NftsApi() {
    this.apiClient = new ApiClient();
  }

  public NftsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * List token data by ID
   * Returns the requested token data. 
   * @param id NFT ID (required)
   * @return TokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public TokenResponse getNFT(String id) throws ApiException {
    return getNFTWithHttpInfo(id).getData();
  }

  /**
   * List token data by ID
   * Returns the requested token data. 
   * @param id NFT ID (required)
   * @return ApiResponse&lt;TokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<TokenResponse> getNFTWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNFT");
    }

    // Path parameters
    String localVarPath = "/nfts/tokens/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TokenResponse> localVarReturnType = new GenericType<TokenResponse>() {};
    return apiClient.invokeAPI("NftsApi.getNFT", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List tokens by IDs
   * Returns the requested tokens data. 
   * @param ids A comma separated list of NFT IDs. Up to 100 are allowed in a single request. (required)
   * @param pageCursor Page cursor to fetch (optional)
   * @param pageSize Items per page (max 100) (optional)
   * @param sort Sort by param, it can be one param or a list of params separated by comma (optional)
   * @param order Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending (optional, default to ASC)
   * @return GetNFTs200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public GetNFTs200Response getNFTs(String ids, String pageCursor, BigDecimal pageSize, List<String> sort, String order) throws ApiException {
    return getNFTsWithHttpInfo(ids, pageCursor, pageSize, sort, order).getData();
  }

  /**
   * List tokens by IDs
   * Returns the requested tokens data. 
   * @param ids A comma separated list of NFT IDs. Up to 100 are allowed in a single request. (required)
   * @param pageCursor Page cursor to fetch (optional)
   * @param pageSize Items per page (max 100) (optional)
   * @param sort Sort by param, it can be one param or a list of params separated by comma (optional)
   * @param order Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending (optional, default to ASC)
   * @return ApiResponse&lt;GetNFTs200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetNFTs200Response> getNFTsWithHttpInfo(String ids, String pageCursor, BigDecimal pageSize, List<String> sort, String order) throws ApiException {
    // Check required parameters
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getNFTs");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "ids", ids)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageCursor", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GetNFTs200Response> localVarReturnType = new GenericType<GetNFTs200Response>() {};
    return apiClient.invokeAPI("NftsApi.getNFTs", "/nfts/tokens", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List all owned tokens (paginated)
   * Returns all tokens and their data in your workspace. 
   * @param blockchainDescriptor Blockchain descriptor filter (optional)
   * @param vaultAccountIds A comma separated list of Vault Account IDs. Up to 100 are allowed in a single request (optional)
   * @param ids A comma separated list of NFT IDs. Up to 100 are allowed in a single request. (optional)
   * @param collectionIds A comma separated list of collection IDs. Up to 100 are allowed in a single request. (optional)
   * @param pageCursor Page cursor to fetch (optional)
   * @param pageSize Items per page (max 100) (optional)
   * @param sort Sort by param, it can be one param or a list of params separated by comma (optional)
   * @param order Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending (optional, default to ASC)
   * @param status Token ownership status (optional, default to LISTED)
   * @param search Search owned tokens and their collections. Possible criteria for search:  token name and id within the contract/collection, collection name, blockchain descriptor and name. (optional)
   * @return GetOwnershipTokens200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public GetOwnershipTokens200Response getOwnershipTokens(String blockchainDescriptor, String vaultAccountIds, String ids, String collectionIds, String pageCursor, BigDecimal pageSize, List<String> sort, String order, String status, String search) throws ApiException {
    return getOwnershipTokensWithHttpInfo(blockchainDescriptor, vaultAccountIds, ids, collectionIds, pageCursor, pageSize, sort, order, status, search).getData();
  }

  /**
   * List all owned tokens (paginated)
   * Returns all tokens and their data in your workspace. 
   * @param blockchainDescriptor Blockchain descriptor filter (optional)
   * @param vaultAccountIds A comma separated list of Vault Account IDs. Up to 100 are allowed in a single request (optional)
   * @param ids A comma separated list of NFT IDs. Up to 100 are allowed in a single request. (optional)
   * @param collectionIds A comma separated list of collection IDs. Up to 100 are allowed in a single request. (optional)
   * @param pageCursor Page cursor to fetch (optional)
   * @param pageSize Items per page (max 100) (optional)
   * @param sort Sort by param, it can be one param or a list of params separated by comma (optional)
   * @param order Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending (optional, default to ASC)
   * @param status Token ownership status (optional, default to LISTED)
   * @param search Search owned tokens and their collections. Possible criteria for search:  token name and id within the contract/collection, collection name, blockchain descriptor and name. (optional)
   * @return ApiResponse&lt;GetOwnershipTokens200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetOwnershipTokens200Response> getOwnershipTokensWithHttpInfo(String blockchainDescriptor, String vaultAccountIds, String ids, String collectionIds, String pageCursor, BigDecimal pageSize, List<String> sort, String order, String status, String search) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "blockchainDescriptor", blockchainDescriptor)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vaultAccountIds", vaultAccountIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collectionIds", collectionIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageCursor", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GetOwnershipTokens200Response> localVarReturnType = new GenericType<GetOwnershipTokens200Response>() {};
    return apiClient.invokeAPI("NftsApi.getOwnershipTokens", "/nfts/ownership/tokens", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List owned collections (paginated)
   * Returns all collections in your workspace 
   * @param search Search owned collections. Possible criteria for search: collection name, collection contract address. (optional)
   * @param pageCursor Page cursor to fetch (optional)
   * @param pageSize Items per page (max 100) (optional)
   * @param sort Sort by param, it can be one param or a list of params separated by comma (optional)
   * @param order Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending (optional, default to ASC)
   * @return ListOwnedCollections200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ListOwnedCollections200Response listOwnedCollections(String search, String pageCursor, BigDecimal pageSize, List<String> sort, String order) throws ApiException {
    return listOwnedCollectionsWithHttpInfo(search, pageCursor, pageSize, sort, order).getData();
  }

  /**
   * List owned collections (paginated)
   * Returns all collections in your workspace 
   * @param search Search owned collections. Possible criteria for search: collection name, collection contract address. (optional)
   * @param pageCursor Page cursor to fetch (optional)
   * @param pageSize Items per page (max 100) (optional)
   * @param sort Sort by param, it can be one param or a list of params separated by comma (optional)
   * @param order Order direction, it can be &#x60;ASC&#x60; for ascending or &#x60;DESC&#x60; for descending (optional, default to ASC)
   * @return ApiResponse&lt;ListOwnedCollections200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ListOwnedCollections200Response> listOwnedCollectionsWithHttpInfo(String search, String pageCursor, BigDecimal pageSize, List<String> sort, String order) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "search", search)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageCursor", pageCursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ListOwnedCollections200Response> localVarReturnType = new GenericType<ListOwnedCollections200Response>() {};
    return apiClient.invokeAPI("NftsApi.listOwnedCollections", "/nfts/ownership/collections", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Refresh token metadata
   * Updates the latest token metadata. 
   * @param id NFT ID (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void refreshNFTMetadata(String id) throws ApiException {
    refreshNFTMetadataWithHttpInfo(id);
  }

  /**
   * Refresh token metadata
   * Updates the latest token metadata. 
   * @param id NFT ID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> refreshNFTMetadataWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling refreshNFTMetadata");
    }

    // Path parameters
    String localVarPath = "/nfts/tokens/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("NftsApi.refreshNFTMetadata", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Refresh vault account tokens
   * Updates all tokens and balances per blockchain and vault account. 
   * @param blockchainDescriptor Blockchain descriptor filter (required)
   * @param vaultAccountId Vault account filter (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void updateOwnershipTokens(String blockchainDescriptor, String vaultAccountId) throws ApiException {
    updateOwnershipTokensWithHttpInfo(blockchainDescriptor, vaultAccountId);
  }

  /**
   * Refresh vault account tokens
   * Updates all tokens and balances per blockchain and vault account. 
   * @param blockchainDescriptor Blockchain descriptor filter (required)
   * @param vaultAccountId Vault account filter (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateOwnershipTokensWithHttpInfo(String blockchainDescriptor, String vaultAccountId) throws ApiException {
    // Check required parameters
    if (blockchainDescriptor == null) {
      throw new ApiException(400, "Missing the required parameter 'blockchainDescriptor' when calling updateOwnershipTokens");
    }
    if (vaultAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'vaultAccountId' when calling updateOwnershipTokens");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "blockchainDescriptor", blockchainDescriptor)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vaultAccountId", vaultAccountId));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("NftsApi.updateOwnershipTokens", "/nfts/ownership/tokens", "PUT", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Update token ownership status
   * Updates token ownership status for a tenant, in all tenant vaults. 
   * @param id NFT ID (required)
   * @param updateTokenOwnershipStatusDto  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void updateTokenOwnershipStatus(String id, UpdateTokenOwnershipStatusDto updateTokenOwnershipStatusDto) throws ApiException {
    updateTokenOwnershipStatusWithHttpInfo(id, updateTokenOwnershipStatusDto);
  }

  /**
   * Update token ownership status
   * Updates token ownership status for a tenant, in all tenant vaults. 
   * @param id NFT ID (required)
   * @param updateTokenOwnershipStatusDto  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateTokenOwnershipStatusWithHttpInfo(String id, UpdateTokenOwnershipStatusDto updateTokenOwnershipStatusDto) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateTokenOwnershipStatus");
    }
    if (updateTokenOwnershipStatusDto == null) {
      throw new ApiException(400, "Missing the required parameter 'updateTokenOwnershipStatusDto' when calling updateTokenOwnershipStatus");
    }

    // Path parameters
    String localVarPath = "/nfts/ownership/tokens/{id}/status"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("NftsApi.updateTokenOwnershipStatus", localVarPath, "PUT", new ArrayList<>(), updateTokenOwnershipStatusDto,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
