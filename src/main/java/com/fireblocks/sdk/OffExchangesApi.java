package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

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
  public CreateTransactionResponse addOffExchange(AddCollateralRequestBody addCollateralRequestBody) throws ApiException {
    return addOffExchangeWithHttpInfo(addCollateralRequestBody).getData();
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
  public ApiResponse<CreateTransactionResponse> addOffExchangeWithHttpInfo(AddCollateralRequestBody addCollateralRequestBody) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateTransactionResponse> localVarReturnType = new GenericType<CreateTransactionResponse>() {};
    return apiClient.invokeAPI("OffExchangesApi.addOffExchange", "/off_exchange/add", "POST", new ArrayList<>(), addCollateralRequestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public ExchangeAccount getOffExchangeCollateralAccounts(String mainExchangeAccountId) throws ApiException {
    return getOffExchangeCollateralAccountsWithHttpInfo(mainExchangeAccountId).getData();
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
  public ApiResponse<ExchangeAccount> getOffExchangeCollateralAccountsWithHttpInfo(String mainExchangeAccountId) throws ApiException {
    // Check required parameters
    if (mainExchangeAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'mainExchangeAccountId' when calling getOffExchangeCollateralAccounts");
    }

    // Path parameters
    String localVarPath = "/off_exchange/collateral_accounts/{mainExchangeAccountId}"
            .replaceAll("\\{mainExchangeAccountId}", apiClient.escapeString(mainExchangeAccountId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExchangeAccount> localVarReturnType = new GenericType<ExchangeAccount>() {};
    return apiClient.invokeAPI("OffExchangesApi.getOffExchangeCollateralAccounts", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public SettlementResponse getOffExchangeSettlementTransactions(String mainExchangeAccountId) throws ApiException {
    return getOffExchangeSettlementTransactionsWithHttpInfo(mainExchangeAccountId).getData();
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
  public ApiResponse<SettlementResponse> getOffExchangeSettlementTransactionsWithHttpInfo(String mainExchangeAccountId) throws ApiException {
    // Check required parameters
    if (mainExchangeAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'mainExchangeAccountId' when calling getOffExchangeSettlementTransactions");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "mainExchangeAccountId", mainExchangeAccountId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SettlementResponse> localVarReturnType = new GenericType<SettlementResponse>() {};
    return apiClient.invokeAPI("OffExchangesApi.getOffExchangeSettlementTransactions", "/off_exchange/settlements/transactions", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public CreateTransactionResponse removeOffExchange(RemoveCollateralRequestBody removeCollateralRequestBody) throws ApiException {
    return removeOffExchangeWithHttpInfo(removeCollateralRequestBody).getData();
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
  public ApiResponse<CreateTransactionResponse> removeOffExchangeWithHttpInfo(RemoveCollateralRequestBody removeCollateralRequestBody) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateTransactionResponse> localVarReturnType = new GenericType<CreateTransactionResponse>() {};
    return apiClient.invokeAPI("OffExchangesApi.removeOffExchange", "/off_exchange/remove", "POST", new ArrayList<>(), removeCollateralRequestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public SettlementResponse settleOffExchangeTrades(SettlementRequestBody settlementRequestBody) throws ApiException {
    return settleOffExchangeTradesWithHttpInfo(settlementRequestBody).getData();
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
  public ApiResponse<SettlementResponse> settleOffExchangeTradesWithHttpInfo(SettlementRequestBody settlementRequestBody) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SettlementResponse> localVarReturnType = new GenericType<SettlementResponse>() {};
    return apiClient.invokeAPI("OffExchangesApi.settleOffExchangeTrades", "/off_exchange/settlements/trader", "POST", new ArrayList<>(), settlementRequestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
