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
import com.fireblocks.sdk.model.CancelTransactionResponse;
import com.fireblocks.sdk.model.CreateTransactionResponse;
import com.fireblocks.sdk.model.DropTransactionRequest;
import com.fireblocks.sdk.model.DropTransactionResponse;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.EstimatedNetworkFeeResponse;
import com.fireblocks.sdk.model.EstimatedTransactionFeeResponse;
import com.fireblocks.sdk.model.FreezeTransactionResponse;
import com.fireblocks.sdk.model.SetConfirmationsThresholdRequest;
import com.fireblocks.sdk.model.SetConfirmationsThresholdResponse;
import com.fireblocks.sdk.model.TransactionRequest;
import com.fireblocks.sdk.model.TransactionResponse;
import com.fireblocks.sdk.model.UnfreezeTransactionResponse;
import com.fireblocks.sdk.model.ValidateAddressResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionsApi {
  private ApiClient apiClient;

  public TransactionsApi() {
    this.apiClient = new ApiClient();
  }

  public TransactionsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Cancel a transaction
   * Cancels a transaction by ID.
   * @param txId The ID of the transaction to cancel (required)
   * @return CancelTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CancelTransactionResponse cancelTransaction(String txId,  RequestOptions requestOptions) throws ApiException {
     return cancelTransactionWithHttpInfo(txId, requestOptions).getData();
  }

  public CancelTransactionResponse cancelTransaction(String txId) throws ApiException {
   return cancelTransactionWithHttpInfo(txId, null).getData();
  }

  /**
   * Cancel a transaction
   * Cancels a transaction by ID.
   * @param txId The ID of the transaction to cancel (required)
   * @return ApiResponse&lt;CancelTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CancelTransactionResponse> cancelTransactionWithHttpInfo(String txId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (txId == null) {
      throw new ApiException(400, "Missing the required parameter 'txId' when calling cancelTransaction");
    }

    // Path parameters
    String localVarPath = "/transactions/{txId}/cancel"
            .replaceAll("\\{txId}", apiClient.escapeString(txId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CancelTransactionResponse> localVarReturnType = new GenericType<CancelTransactionResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.cancelTransaction", localVarPath, "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Create a new transaction
   * Creates a new transaction.
   * @param transactionRequest  (optional)
   * @return CreateTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateTransactionResponse createTransaction(TransactionRequest transactionRequest,  RequestOptions requestOptions) throws ApiException {
     return createTransactionWithHttpInfo(transactionRequest, requestOptions).getData();
  }

  public CreateTransactionResponse createTransaction(TransactionRequest transactionRequest) throws ApiException {
   return createTransactionWithHttpInfo(transactionRequest, null).getData();
  }

  /**
   * Create a new transaction
   * Creates a new transaction.
   * @param transactionRequest  (optional)
   * @return ApiResponse&lt;CreateTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateTransactionResponse> createTransactionWithHttpInfo(TransactionRequest transactionRequest, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = transactionRequest;
    if ("END_USER_WALLET".equals(
                Optional.ofNullable(_body)
                        .map(b -> (TransactionRequest) b)
                        .map(b -> b.getSource())
                        .map(source -> source.getType())
                        .orElse(null)) &&
            !Optional.ofNullable(requestOptions.getNcw())
                .map(ncw -> (Ncw) ncw) // Assuming requestOptions contains an "ncw" key with an Ncw object
                .map(ncw -> ncw.getWalletId())
                .isPresent()) {

                    // Extract walletId and update requestOptions
                    Optional.ofNullable(_body)
                        .map(b -> (TransactionRequest) b)
                        .map(b -> b.getSource())
                        .map(source -> source.getWalletId())
                        .ifPresent(walletId -> {
                            Ncw ncw = Optional.ofNullable(requestOptions.getNcw())
                                    .map(ncwObject -> (Ncw) ncwObject)
                                    .orElse(new Ncw());
                            ncw.setWalletId(walletId.toString());
                            requestOptions.setNcw(ncw);
                        });
        }
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateTransactionResponse> localVarReturnType = new GenericType<CreateTransactionResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.createTransaction", "/transactions", "POST", new ArrayList<>(), transactionRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Drop ETH transaction by ID
   * Drops a stuck ETH transaction and creates a replacement transaction.
   * @param txId The ID of the transaction (required)
   * @param dropTransactionRequest  (optional)
   * @return DropTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Created successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public DropTransactionResponse dropTransaction(String txId, DropTransactionRequest dropTransactionRequest,  RequestOptions requestOptions) throws ApiException {
     return dropTransactionWithHttpInfo(txId,dropTransactionRequest, requestOptions).getData();
  }

  public DropTransactionResponse dropTransaction(String txId, DropTransactionRequest dropTransactionRequest) throws ApiException {
   return dropTransactionWithHttpInfo(txId,dropTransactionRequest, null).getData();
  }

  /**
   * Drop ETH transaction by ID
   * Drops a stuck ETH transaction and creates a replacement transaction.
   * @param txId The ID of the transaction (required)
   * @param dropTransactionRequest  (optional)
   * @return ApiResponse&lt;DropTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Created successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<DropTransactionResponse> dropTransactionWithHttpInfo(String txId,DropTransactionRequest dropTransactionRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (txId == null) {
      throw new ApiException(400, "Missing the required parameter 'txId' when calling dropTransaction");
    }

    // Path parameters
    String localVarPath = "/transactions/{txId}/drop"
            .replaceAll("\\{txId}", apiClient.escapeString(txId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = dropTransactionRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<DropTransactionResponse> localVarReturnType = new GenericType<DropTransactionResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.dropTransaction", localVarPath, "POST", new ArrayList<>(), dropTransactionRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Estimate the required fee for an asset
   * Gets the estimated required fee for an asset. For UTXO based assets, the response will contain the suggested fee per byte, for ETH/ETC based assets, the suggested gas price, and for XRP/XLM, the transaction fee.
   * @param assetId The asset for which to estimate the fee (required)
   * @return EstimatedNetworkFeeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimated fees response </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public EstimatedNetworkFeeResponse estimateNetworkFee(String assetId,  RequestOptions requestOptions) throws ApiException {
     return estimateNetworkFeeWithHttpInfo(assetId, requestOptions).getData();
  }

  public EstimatedNetworkFeeResponse estimateNetworkFee(String assetId) throws ApiException {
   return estimateNetworkFeeWithHttpInfo(assetId, null).getData();
  }

  /**
   * Estimate the required fee for an asset
   * Gets the estimated required fee for an asset. For UTXO based assets, the response will contain the suggested fee per byte, for ETH/ETC based assets, the suggested gas price, and for XRP/XLM, the transaction fee.
   * @param assetId The asset for which to estimate the fee (required)
   * @return ApiResponse&lt;EstimatedNetworkFeeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimated fees response </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<EstimatedNetworkFeeResponse> estimateNetworkFeeWithHttpInfo(String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling estimateNetworkFee");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "assetId", assetId)
    );

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<EstimatedNetworkFeeResponse> localVarReturnType = new GenericType<EstimatedNetworkFeeResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.estimateNetworkFee", "/estimate_network_fee", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Estimate transaction fee
   * Estimates the transaction fee for a transaction request. * Note: Supports all Fireblocks assets except ZCash (ZEC).
   * @param transactionRequest  (optional)
   * @return EstimatedTransactionFeeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimated fees response </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public EstimatedTransactionFeeResponse estimateTransactionFee(TransactionRequest transactionRequest,  RequestOptions requestOptions) throws ApiException {
     return estimateTransactionFeeWithHttpInfo(transactionRequest, requestOptions).getData();
  }

  public EstimatedTransactionFeeResponse estimateTransactionFee(TransactionRequest transactionRequest) throws ApiException {
   return estimateTransactionFeeWithHttpInfo(transactionRequest, null).getData();
  }

  /**
   * Estimate transaction fee
   * Estimates the transaction fee for a transaction request. * Note: Supports all Fireblocks assets except ZCash (ZEC).
   * @param transactionRequest  (optional)
   * @return ApiResponse&lt;EstimatedTransactionFeeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Estimated fees response </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<EstimatedTransactionFeeResponse> estimateTransactionFeeWithHttpInfo(TransactionRequest transactionRequest, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = transactionRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<EstimatedTransactionFeeResponse> localVarReturnType = new GenericType<EstimatedTransactionFeeResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.estimateTransactionFee", "/transactions/estimate_fee", "POST", new ArrayList<>(), transactionRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Freeze a transaction
   * Freezes a transaction by ID.
   * @param txId The ID of the transaction to freeze (required)
   * @return FreezeTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> freeze response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public FreezeTransactionResponse freezeTransaction(String txId,  RequestOptions requestOptions) throws ApiException {
     return freezeTransactionWithHttpInfo(txId, requestOptions).getData();
  }

  public FreezeTransactionResponse freezeTransaction(String txId) throws ApiException {
   return freezeTransactionWithHttpInfo(txId, null).getData();
  }

  /**
   * Freeze a transaction
   * Freezes a transaction by ID.
   * @param txId The ID of the transaction to freeze (required)
   * @return ApiResponse&lt;FreezeTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> freeze response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<FreezeTransactionResponse> freezeTransactionWithHttpInfo(String txId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (txId == null) {
      throw new ApiException(400, "Missing the required parameter 'txId' when calling freezeTransaction");
    }

    // Path parameters
    String localVarPath = "/transactions/{txId}/freeze"
            .replaceAll("\\{txId}", apiClient.escapeString(txId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<FreezeTransactionResponse> localVarReturnType = new GenericType<FreezeTransactionResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.freezeTransaction", localVarPath, "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Find a specific transaction by external transaction ID
   * Returns transaction by external transaction ID.
   * @param externalTxId The external ID of the transaction to return (required)
   * @return TransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public TransactionResponse getTransactionByExternalId(String externalTxId,  RequestOptions requestOptions) throws ApiException {
     return getTransactionByExternalIdWithHttpInfo(externalTxId, requestOptions).getData();
  }

  public TransactionResponse getTransactionByExternalId(String externalTxId) throws ApiException {
   return getTransactionByExternalIdWithHttpInfo(externalTxId, null).getData();
  }

  /**
   * Find a specific transaction by external transaction ID
   * Returns transaction by external transaction ID.
   * @param externalTxId The external ID of the transaction to return (required)
   * @return ApiResponse&lt;TransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<TransactionResponse> getTransactionByExternalIdWithHttpInfo(String externalTxId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (externalTxId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalTxId' when calling getTransactionByExternalId");
    }

    // Path parameters
    String localVarPath = "/transactions/external_tx_id/{externalTxId}/"
            .replaceAll("\\{externalTxId}", apiClient.escapeString(externalTxId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TransactionResponse> localVarReturnType = new GenericType<TransactionResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.getTransactionByExternalId", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Find a specific transaction by Fireblocks transaction ID
   * Returns a transaction by ID.
   * @param txId The ID of the transaction to return (required)
   * @return TransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 400 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public TransactionResponse getTransactionById(String txId,  RequestOptions requestOptions) throws ApiException {
     return getTransactionByIdWithHttpInfo(txId, requestOptions).getData();
  }

  public TransactionResponse getTransactionById(String txId) throws ApiException {
   return getTransactionByIdWithHttpInfo(txId, null).getData();
  }

  /**
   * Find a specific transaction by Fireblocks transaction ID
   * Returns a transaction by ID.
   * @param txId The ID of the transaction to return (required)
   * @return ApiResponse&lt;TransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 400 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<TransactionResponse> getTransactionByIdWithHttpInfo(String txId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (txId == null) {
      throw new ApiException(400, "Missing the required parameter 'txId' when calling getTransactionById");
    }

    // Path parameters
    String localVarPath = "/transactions/{txId}"
            .replaceAll("\\{txId}", apiClient.escapeString(txId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TransactionResponse> localVarReturnType = new GenericType<TransactionResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.getTransactionById", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List transaction history
   * Lists the transaction history for your workspace.
   * @param before Unix timestamp in milliseconds. Returns only transactions created before the specified date (optional)
   * @param after Unix timestamp in milliseconds. Returns only transactions created after the specified date (optional)
   * @param status You can filter by one of the statuses. (optional)
   * @param orderBy The field to order the results by  **Note**: Ordering by a field that is not createdAt may result with transactions that receive updates as you request the next or previous pages of results, resulting with missing those transactions. (optional)
   * @param sort The direction to order the results by (optional)
   * @param limit Limits the number of results. If not provided, a limit of 200 will be used. The maximum allowed limit is 500 (optional, default to 200)
   * @param sourceType The source type of the transaction (optional)
   * @param sourceId The source ID of the transaction (optional)
   * @param destType The destination type of the transaction (optional)
   * @param destId The destination ID of the transaction (optional)
   * @param assets A list of assets to filter by, seperated by commas (optional)
   * @param txHash Returns only results with a specified txHash (optional)
   * @param sourceWalletId Returns only results where the source is a specific end user wallet (optional)
   * @param destWalletId Returns only results where the destination is a specific end user wallet (optional)
   * @return List&lt;TransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of transactions </td><td>  * X-Request-ID -  <br>  * next-page -  <br>  * prev-page -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<TransactionResponse> getTransactions(String before, String after, String status, String orderBy, String sort, Integer limit, String sourceType, String sourceId, String destType, String destId, String assets, String txHash, String sourceWalletId, String destWalletId,  RequestOptions requestOptions) throws ApiException {
     return getTransactionsWithHttpInfo(before,after,status,orderBy,sort,limit,sourceType,sourceId,destType,destId,assets,txHash,sourceWalletId,destWalletId, requestOptions).getData();
  }

  public List<TransactionResponse> getTransactions(String before, String after, String status, String orderBy, String sort, Integer limit, String sourceType, String sourceId, String destType, String destId, String assets, String txHash, String sourceWalletId, String destWalletId) throws ApiException {
   return getTransactionsWithHttpInfo(before,after,status,orderBy,sort,limit,sourceType,sourceId,destType,destId,assets,txHash,sourceWalletId,destWalletId, null).getData();
  }

  /**
   * List transaction history
   * Lists the transaction history for your workspace.
   * @param before Unix timestamp in milliseconds. Returns only transactions created before the specified date (optional)
   * @param after Unix timestamp in milliseconds. Returns only transactions created after the specified date (optional)
   * @param status You can filter by one of the statuses. (optional)
   * @param orderBy The field to order the results by  **Note**: Ordering by a field that is not createdAt may result with transactions that receive updates as you request the next or previous pages of results, resulting with missing those transactions. (optional)
   * @param sort The direction to order the results by (optional)
   * @param limit Limits the number of results. If not provided, a limit of 200 will be used. The maximum allowed limit is 500 (optional, default to 200)
   * @param sourceType The source type of the transaction (optional)
   * @param sourceId The source ID of the transaction (optional)
   * @param destType The destination type of the transaction (optional)
   * @param destId The destination ID of the transaction (optional)
   * @param assets A list of assets to filter by, seperated by commas (optional)
   * @param txHash Returns only results with a specified txHash (optional)
   * @param sourceWalletId Returns only results where the source is a specific end user wallet (optional)
   * @param destWalletId Returns only results where the destination is a specific end user wallet (optional)
   * @return ApiResponse&lt;List&lt;TransactionResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of transactions </td><td>  * X-Request-ID -  <br>  * next-page -  <br>  * prev-page -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<TransactionResponse>> getTransactionsWithHttpInfo(String before,String after,String status,String orderBy,String sort,Integer limit,String sourceType,String sourceId,String destType,String destId,String assets,String txHash,String sourceWalletId,String destWalletId, RequestOptions requestOptions) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "before", before)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceType", sourceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destType", destType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destId", destId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assets", assets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "txHash", txHash));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceWalletId", sourceWalletId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destWalletId", destWalletId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<TransactionResponse>> localVarReturnType = new GenericType<List<TransactionResponse>>() {};
    return apiClient.invokeAPI("TransactionsApi.getTransactions", "/transactions", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Set confirmation threshold by transaction ID
   * Overrides the required number of confirmations for transaction completion by transaction ID.
   * @param txId The ID of the transaction (required)
   * @param setConfirmationsThresholdRequest  (optional)
   * @return SetConfirmationsThresholdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Set successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SetConfirmationsThresholdResponse setConfirmationThresholdForTransaction(String txId, SetConfirmationsThresholdRequest setConfirmationsThresholdRequest,  RequestOptions requestOptions) throws ApiException {
     return setConfirmationThresholdForTransactionWithHttpInfo(txId,setConfirmationsThresholdRequest, requestOptions).getData();
  }

  public SetConfirmationsThresholdResponse setConfirmationThresholdForTransaction(String txId, SetConfirmationsThresholdRequest setConfirmationsThresholdRequest) throws ApiException {
   return setConfirmationThresholdForTransactionWithHttpInfo(txId,setConfirmationsThresholdRequest, null).getData();
  }

  /**
   * Set confirmation threshold by transaction ID
   * Overrides the required number of confirmations for transaction completion by transaction ID.
   * @param txId The ID of the transaction (required)
   * @param setConfirmationsThresholdRequest  (optional)
   * @return ApiResponse&lt;SetConfirmationsThresholdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Set successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetConfirmationsThresholdResponse> setConfirmationThresholdForTransactionWithHttpInfo(String txId,SetConfirmationsThresholdRequest setConfirmationsThresholdRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (txId == null) {
      throw new ApiException(400, "Missing the required parameter 'txId' when calling setConfirmationThresholdForTransaction");
    }

    // Path parameters
    String localVarPath = "/transactions/{txId}/set_confirmation_threshold"
            .replaceAll("\\{txId}", apiClient.escapeString(txId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setConfirmationsThresholdRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SetConfirmationsThresholdResponse> localVarReturnType = new GenericType<SetConfirmationsThresholdResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.setConfirmationThresholdForTransaction", localVarPath, "POST", new ArrayList<>(), setConfirmationsThresholdRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Set confirmation threshold by transaction hash
   * Overrides the required number of confirmations for transaction completion by transaction hash.
   * @param txHash The TxHash (required)
   * @param setConfirmationsThresholdRequest  (optional)
   * @return SetConfirmationsThresholdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of transactions affected by the change </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SetConfirmationsThresholdResponse setConfirmationThresholdForTransactionByHash(String txHash, SetConfirmationsThresholdRequest setConfirmationsThresholdRequest,  RequestOptions requestOptions) throws ApiException {
     return setConfirmationThresholdForTransactionByHashWithHttpInfo(txHash,setConfirmationsThresholdRequest, requestOptions).getData();
  }

  public SetConfirmationsThresholdResponse setConfirmationThresholdForTransactionByHash(String txHash, SetConfirmationsThresholdRequest setConfirmationsThresholdRequest) throws ApiException {
   return setConfirmationThresholdForTransactionByHashWithHttpInfo(txHash,setConfirmationsThresholdRequest, null).getData();
  }

  /**
   * Set confirmation threshold by transaction hash
   * Overrides the required number of confirmations for transaction completion by transaction hash.
   * @param txHash The TxHash (required)
   * @param setConfirmationsThresholdRequest  (optional)
   * @return ApiResponse&lt;SetConfirmationsThresholdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of transactions affected by the change </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetConfirmationsThresholdResponse> setConfirmationThresholdForTransactionByHashWithHttpInfo(String txHash,SetConfirmationsThresholdRequest setConfirmationsThresholdRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (txHash == null) {
      throw new ApiException(400, "Missing the required parameter 'txHash' when calling setConfirmationThresholdForTransactionByHash");
    }

    // Path parameters
    String localVarPath = "/txHash/{txHash}/set_confirmation_threshold"
            .replaceAll("\\{txHash}", apiClient.escapeString(txHash));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setConfirmationsThresholdRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SetConfirmationsThresholdResponse> localVarReturnType = new GenericType<SetConfirmationsThresholdResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.setConfirmationThresholdForTransactionByHash", localVarPath, "POST", new ArrayList<>(), setConfirmationsThresholdRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Unfreeze a transaction
   * Unfreezes a transaction by ID and makes the transaction available again.
   * @param txId The ID of the transaction to unfreeze (required)
   * @return UnfreezeTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Unfreeze response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public UnfreezeTransactionResponse unfreezeTransaction(String txId,  RequestOptions requestOptions) throws ApiException {
     return unfreezeTransactionWithHttpInfo(txId, requestOptions).getData();
  }

  public UnfreezeTransactionResponse unfreezeTransaction(String txId) throws ApiException {
   return unfreezeTransactionWithHttpInfo(txId, null).getData();
  }

  /**
   * Unfreeze a transaction
   * Unfreezes a transaction by ID and makes the transaction available again.
   * @param txId The ID of the transaction to unfreeze (required)
   * @return ApiResponse&lt;UnfreezeTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Unfreeze response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<UnfreezeTransactionResponse> unfreezeTransactionWithHttpInfo(String txId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (txId == null) {
      throw new ApiException(400, "Missing the required parameter 'txId' when calling unfreezeTransaction");
    }

    // Path parameters
    String localVarPath = "/transactions/{txId}/unfreeze"
            .replaceAll("\\{txId}", apiClient.escapeString(txId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<UnfreezeTransactionResponse> localVarReturnType = new GenericType<UnfreezeTransactionResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.unfreezeTransaction", localVarPath, "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Validate destination address
   * Checks if an address is valid (for XRP, DOT, XLM, and EOS).
   * @param assetId The asset of the address (required)
   * @param address The address to validate (required)
   * @return ValidateAddressResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ValidateAddressResponse validateAddress(String assetId, String address,  RequestOptions requestOptions) throws ApiException {
     return validateAddressWithHttpInfo(assetId,address, requestOptions).getData();
  }

  public ValidateAddressResponse validateAddress(String assetId, String address) throws ApiException {
   return validateAddressWithHttpInfo(assetId,address, null).getData();
  }

  /**
   * Validate destination address
   * Checks if an address is valid (for XRP, DOT, XLM, and EOS).
   * @param assetId The asset of the address (required)
   * @param address The address to validate (required)
   * @return ApiResponse&lt;ValidateAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ValidateAddressResponse> validateAddressWithHttpInfo(String assetId,String address, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling validateAddress");
    }
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling validateAddress");
    }

    // Path parameters
    String localVarPath = "/transactions/validate_address/{assetId}/{address}"
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId))
            .replaceAll("\\{address}", apiClient.escapeString(address));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ValidateAddressResponse> localVarReturnType = new GenericType<ValidateAddressResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.validateAddress", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
