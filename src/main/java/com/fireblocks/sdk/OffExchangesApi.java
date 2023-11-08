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
import com.fireblocks.sdk.model.AddCollateralRequestBody;
import com.fireblocks.sdk.model.CreateTransactionResponse;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.ExchangeAccount;
import com.fireblocks.sdk.model.RemoveCollateralRequestBody;
import com.fireblocks.sdk.model.SettlementRequestBody;
import com.fireblocks.sdk.model.SettlementResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OffExchangesApi {
  private ApiClient apiClient;

  public OffExchangesApi() {
    this.apiClient = new ApiClient();
  }

  public OffExchangesApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * add collateral
   * add collateral, create deposit request
   * @param addCollateralRequestBody  (optional)
   * @return CreateTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A transaction object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateTransactionResponse addOffExchange(AddCollateralRequestBody addCollateralRequestBody,  RequestOptions requestOptions) throws ApiException {
     return addOffExchangeWithHttpInfo(addCollateralRequestBody, requestOptions).getData();
  }

  public CreateTransactionResponse addOffExchange(AddCollateralRequestBody addCollateralRequestBody) throws ApiException {
   return addOffExchangeWithHttpInfo(addCollateralRequestBody, null).getData();
  }

  /**
   * add collateral
   * add collateral, create deposit request
   * @param addCollateralRequestBody  (optional)
   * @return ApiResponse&lt;CreateTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A transaction object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateTransactionResponse> addOffExchangeWithHttpInfo(AddCollateralRequestBody addCollateralRequestBody, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = addCollateralRequestBody;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateTransactionResponse> localVarReturnType = new GenericType<CreateTransactionResponse>() {};
    return apiClient.invokeAPI("OffExchangesApi.addOffExchange", "/off_exchange/add", "POST", new ArrayList<>(), addCollateralRequestBody,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Find a specific collateral exchange account
   * Returns a collateral account by mainExchangeAccountId.
   * @param mainExchangeAccountId The id of the main exchange account for which the requested collateral account is associated with (required)
   * @return ExchangeAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An ExchangeAccount object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ExchangeAccount getOffExchangeCollateralAccounts(String mainExchangeAccountId,  RequestOptions requestOptions) throws ApiException {
     return getOffExchangeCollateralAccountsWithHttpInfo(mainExchangeAccountId, requestOptions).getData();
  }

  public ExchangeAccount getOffExchangeCollateralAccounts(String mainExchangeAccountId) throws ApiException {
   return getOffExchangeCollateralAccountsWithHttpInfo(mainExchangeAccountId, null).getData();
  }

  /**
   * Find a specific collateral exchange account
   * Returns a collateral account by mainExchangeAccountId.
   * @param mainExchangeAccountId The id of the main exchange account for which the requested collateral account is associated with (required)
   * @return ApiResponse&lt;ExchangeAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An ExchangeAccount object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ExchangeAccount> getOffExchangeCollateralAccountsWithHttpInfo(String mainExchangeAccountId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (mainExchangeAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'mainExchangeAccountId' when calling getOffExchangeCollateralAccounts");
    }

    // Path parameters
    String localVarPath = "/off_exchange/collateral_accounts/{mainExchangeAccountId}"
            .replaceAll("\\{mainExchangeAccountId}", apiClient.escapeString(mainExchangeAccountId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExchangeAccount> localVarReturnType = new GenericType<ExchangeAccount>() {};
    return apiClient.invokeAPI("OffExchangesApi.getOffExchangeCollateralAccounts", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * get settlements transactions from exchange
   * get settlements transactions from exchange
   * @param mainExchangeAccountId  (required)
   * @return SettlementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A settlement transactions </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SettlementResponse getOffExchangeSettlementTransactions(String mainExchangeAccountId,  RequestOptions requestOptions) throws ApiException {
     return getOffExchangeSettlementTransactionsWithHttpInfo(mainExchangeAccountId, requestOptions).getData();
  }

  public SettlementResponse getOffExchangeSettlementTransactions(String mainExchangeAccountId) throws ApiException {
   return getOffExchangeSettlementTransactionsWithHttpInfo(mainExchangeAccountId, null).getData();
  }

  /**
   * get settlements transactions from exchange
   * get settlements transactions from exchange
   * @param mainExchangeAccountId  (required)
   * @return ApiResponse&lt;SettlementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A settlement transactions </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SettlementResponse> getOffExchangeSettlementTransactionsWithHttpInfo(String mainExchangeAccountId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (mainExchangeAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'mainExchangeAccountId' when calling getOffExchangeSettlementTransactions");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "mainExchangeAccountId", mainExchangeAccountId)
    );

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SettlementResponse> localVarReturnType = new GenericType<SettlementResponse>() {};
    return apiClient.invokeAPI("OffExchangesApi.getOffExchangeSettlementTransactions", "/off_exchange/settlements/transactions", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * remove collateral
   * remove collateral, create withdraw request
   * @param removeCollateralRequestBody  (optional)
   * @return CreateTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A transaction object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateTransactionResponse removeOffExchange(RemoveCollateralRequestBody removeCollateralRequestBody,  RequestOptions requestOptions) throws ApiException {
     return removeOffExchangeWithHttpInfo(removeCollateralRequestBody, requestOptions).getData();
  }

  public CreateTransactionResponse removeOffExchange(RemoveCollateralRequestBody removeCollateralRequestBody) throws ApiException {
   return removeOffExchangeWithHttpInfo(removeCollateralRequestBody, null).getData();
  }

  /**
   * remove collateral
   * remove collateral, create withdraw request
   * @param removeCollateralRequestBody  (optional)
   * @return ApiResponse&lt;CreateTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A transaction object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateTransactionResponse> removeOffExchangeWithHttpInfo(RemoveCollateralRequestBody removeCollateralRequestBody, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = removeCollateralRequestBody;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateTransactionResponse> localVarReturnType = new GenericType<CreateTransactionResponse>() {};
    return apiClient.invokeAPI("OffExchangesApi.removeOffExchange", "/off_exchange/remove", "POST", new ArrayList<>(), removeCollateralRequestBody,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * create settlement for a trader
   * create settlement for a trader
   * @param settlementRequestBody  (optional)
   * @return SettlementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A settlement object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SettlementResponse settleOffExchangeTrades(SettlementRequestBody settlementRequestBody,  RequestOptions requestOptions) throws ApiException {
     return settleOffExchangeTradesWithHttpInfo(settlementRequestBody, requestOptions).getData();
  }

  public SettlementResponse settleOffExchangeTrades(SettlementRequestBody settlementRequestBody) throws ApiException {
   return settleOffExchangeTradesWithHttpInfo(settlementRequestBody, null).getData();
  }

  /**
   * create settlement for a trader
   * create settlement for a trader
   * @param settlementRequestBody  (optional)
   * @return ApiResponse&lt;SettlementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A settlement object </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SettlementResponse> settleOffExchangeTradesWithHttpInfo(SettlementRequestBody settlementRequestBody, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = settlementRequestBody;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SettlementResponse> localVarReturnType = new GenericType<SettlementResponse>() {};
    return apiClient.invokeAPI("OffExchangesApi.settleOffExchangeTrades", "/off_exchange/settlements/trader", "POST", new ArrayList<>(), settlementRequestBody,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
