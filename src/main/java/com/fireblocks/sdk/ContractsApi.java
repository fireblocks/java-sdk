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
import com.fireblocks.sdk.model.AddAssetToContractRequest;
import com.fireblocks.sdk.model.CreateContractRequest;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.ExternalWalletAsset;
import com.fireblocks.sdk.model.UnmanagedWallet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContractsApi {
  private ApiClient apiClient;

  public ContractsApi() {
    this.apiClient = new ApiClient();
  }

  public ContractsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Add an asset to a contract
   * Adds an asset to an existing contract.
   * @param contractId The ID of the contract (required)
   * @param assetId The ID of the asset to add (required)
   * @param addAssetToContractRequest  (optional)
   * @return ExternalWalletAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ExternalWalletAsset addAssetToContract(String contractId, String assetId, AddAssetToContractRequest addAssetToContractRequest,  RequestOptions requestOptions) throws ApiException {
     return addAssetToContractWithHttpInfo(contractId,assetId,addAssetToContractRequest, requestOptions).getData();
  }

  public ExternalWalletAsset addAssetToContract(String contractId, String assetId, AddAssetToContractRequest addAssetToContractRequest) throws ApiException {
   return addAssetToContractWithHttpInfo(contractId,assetId,addAssetToContractRequest, null).getData();
  }

  /**
   * Add an asset to a contract
   * Adds an asset to an existing contract.
   * @param contractId The ID of the contract (required)
   * @param assetId The ID of the asset to add (required)
   * @param addAssetToContractRequest  (optional)
   * @return ApiResponse&lt;ExternalWalletAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet Asset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ExternalWalletAsset> addAssetToContractWithHttpInfo(String contractId,String assetId,AddAssetToContractRequest addAssetToContractRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling addAssetToContract");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling addAssetToContract");
    }

    // Path parameters
    String localVarPath = "/contracts/{contractId}/{assetId}"
            .replaceAll("\\{contractId}", apiClient.escapeString(contractId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = addAssetToContractRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<ExternalWalletAsset> localVarReturnType = new GenericType<ExternalWalletAsset>() {};
    return apiClient.invokeAPI("ContractsApi.addAssetToContract", localVarPath, "POST", new ArrayList<>(), addAssetToContractRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Create a contract
   * Creates a new contract.
   * @param createContractRequest  (optional)
   * @return UnmanagedWallet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public UnmanagedWallet createContract(CreateContractRequest createContractRequest,  RequestOptions requestOptions) throws ApiException {
     return createContractWithHttpInfo(createContractRequest, requestOptions).getData();
  }

  public UnmanagedWallet createContract(CreateContractRequest createContractRequest) throws ApiException {
   return createContractWithHttpInfo(createContractRequest, null).getData();
  }

  /**
   * Create a contract
   * Creates a new contract.
   * @param createContractRequest  (optional)
   * @return ApiResponse&lt;UnmanagedWallet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<UnmanagedWallet> createContractWithHttpInfo(CreateContractRequest createContractRequest, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = createContractRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<UnmanagedWallet> localVarReturnType = new GenericType<UnmanagedWallet>() {};
    return apiClient.invokeAPI("ContractsApi.createContract", "/contracts", "POST", new ArrayList<>(), createContractRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete a contract
   * Deletes a contract by ID.
   * @param contractId The ID of the contract to delete (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void deleteContract(String contractId,  RequestOptions requestOptions) throws ApiException {
    deleteContractWithHttpInfo(contractId, requestOptions);
  }

  public void deleteContract(String contractId) throws ApiException {
  deleteContractWithHttpInfo(contractId, null);
  }

  /**
   * Delete a contract
   * Deletes a contract by ID.
   * @param contractId The ID of the contract to delete (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteContractWithHttpInfo(String contractId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling deleteContract");
    }

    // Path parameters
    String localVarPath = "/contracts/{contractId}"
            .replaceAll("\\{contractId}", apiClient.escapeString(contractId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ContractsApi.deleteContract", localVarPath, "DELETE", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Find a contract asset
   * Returns a contract asset by ID.
   * @param contractId The ID of the contract (required)
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
  public ExternalWalletAsset getAssetInContract(String contractId, String assetId,  RequestOptions requestOptions) throws ApiException {
     return getAssetInContractWithHttpInfo(contractId,assetId, requestOptions).getData();
  }

  public ExternalWalletAsset getAssetInContract(String contractId, String assetId) throws ApiException {
   return getAssetInContractWithHttpInfo(contractId,assetId, null).getData();
  }

  /**
   * Find a contract asset
   * Returns a contract asset by ID.
   * @param contractId The ID of the contract (required)
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
  public ApiResponse<ExternalWalletAsset> getAssetInContractWithHttpInfo(String contractId,String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling getAssetInContract");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getAssetInContract");
    }

    // Path parameters
    String localVarPath = "/contracts/{contractId}/{assetId}"
            .replaceAll("\\{contractId}", apiClient.escapeString(contractId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExternalWalletAsset> localVarReturnType = new GenericType<ExternalWalletAsset>() {};
    return apiClient.invokeAPI("ContractsApi.getAssetInContract", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Find a specific contract
   * Returns a contract by ID.
   * @param contractId The ID of the contract to return (required)
   * @return UnmanagedWallet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public UnmanagedWallet getContractById(String contractId,  RequestOptions requestOptions) throws ApiException {
     return getContractByIdWithHttpInfo(contractId, requestOptions).getData();
  }

  public UnmanagedWallet getContractById(String contractId) throws ApiException {
   return getContractByIdWithHttpInfo(contractId, null).getData();
  }

  /**
   * Find a specific contract
   * Returns a contract by ID.
   * @param contractId The ID of the contract to return (required)
   * @return ApiResponse&lt;UnmanagedWallet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Wallet object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<UnmanagedWallet> getContractByIdWithHttpInfo(String contractId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling getContractById");
    }

    // Path parameters
    String localVarPath = "/contracts/{contractId}"
            .replaceAll("\\{contractId}", apiClient.escapeString(contractId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<UnmanagedWallet> localVarReturnType = new GenericType<UnmanagedWallet>() {};
    return apiClient.invokeAPI("ContractsApi.getContractById", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List contracts
   * Gets a list of contracts.
   * @return List&lt;UnmanagedWallet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of contracts </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<UnmanagedWallet> getContracts( RequestOptions requestOptions) throws ApiException {
     return getContractsWithHttpInfo( requestOptions).getData();
  }

  public List<UnmanagedWallet> getContracts() throws ApiException {
   return getContractsWithHttpInfo( null).getData();
  }

  /**
   * List contracts
   * Gets a list of contracts.
   * @return ApiResponse&lt;List&lt;UnmanagedWallet&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of contracts </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<UnmanagedWallet>> getContractsWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<UnmanagedWallet>> localVarReturnType = new GenericType<List<UnmanagedWallet>>() {};
    return apiClient.invokeAPI("ContractsApi.getContracts", "/contracts", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete a contract asset
   * Deletes a contract asset by ID.
   * @param contractId The ID of the contract (required)
   * @param assetId The ID of the asset to delete (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void removeAssetFromContract(String contractId, String assetId,  RequestOptions requestOptions) throws ApiException {
    removeAssetFromContractWithHttpInfo(contractId,assetId, requestOptions);
  }

  public void removeAssetFromContract(String contractId, String assetId) throws ApiException {
  removeAssetFromContractWithHttpInfo(contractId,assetId, null);
  }

  /**
   * Delete a contract asset
   * Deletes a contract asset by ID.
   * @param contractId The ID of the contract (required)
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
  public ApiResponse<Void> removeAssetFromContractWithHttpInfo(String contractId,String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (contractId == null) {
      throw new ApiException(400, "Missing the required parameter 'contractId' when calling removeAssetFromContract");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling removeAssetFromContract");
    }

    // Path parameters
    String localVarPath = "/contracts/{contractId}/{assetId}"
            .replaceAll("\\{contractId}", apiClient.escapeString(contractId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("ContractsApi.removeAssetFromContract", localVarPath, "DELETE", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
