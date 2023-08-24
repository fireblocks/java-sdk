package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.FiatAccount;
import com.fireblocks.sdk.model.RedeemFundsToLinkedDDARequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiatAccountsApi {
  private ApiClient apiClient;

  public FiatAccountsApi() {
    this.apiClient = new ApiClient();
  }

  public FiatAccountsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Deposit funds from DDA
   * Deposits funds from the linked DDA.
   * @param accountId The ID of the fiat account to use (required)
   * @param redeemFundsToLinkedDDARequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Transfer succeeded </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void depositFundsFromLinkedDDA(String accountId, RedeemFundsToLinkedDDARequest redeemFundsToLinkedDDARequest) throws ApiException {
    depositFundsFromLinkedDDAWithHttpInfo(accountId, redeemFundsToLinkedDDARequest);
  }

  /**
   * Deposit funds from DDA
   * Deposits funds from the linked DDA.
   * @param accountId The ID of the fiat account to use (required)
   * @param redeemFundsToLinkedDDARequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Transfer succeeded </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> depositFundsFromLinkedDDAWithHttpInfo(String accountId, RedeemFundsToLinkedDDARequest redeemFundsToLinkedDDARequest) throws ApiException {
    // Check required parameters
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling depositFundsFromLinkedDDA");
    }

    // Path parameters
    String localVarPath = "/fiat_accounts/{accountId}/deposit_from_linked_dda"
            .replaceAll("\\{accountId}", apiClient.escapeString(accountId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FiatAccountsApi.depositFundsFromLinkedDDA", localVarPath, "POST", new ArrayList<>(), redeemFundsToLinkedDDARequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Find a specific fiat account
   * Returns a fiat account by ID.
   * @param accountId The ID of the fiat account to return (required)
   * @return FiatAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A fiat account object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public FiatAccount getFiatAccountById(String accountId) throws ApiException {
    return getFiatAccountByIdWithHttpInfo(accountId).getData();
  }

  /**
   * Find a specific fiat account
   * Returns a fiat account by ID.
   * @param accountId The ID of the fiat account to return (required)
   * @return ApiResponse&lt;FiatAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A fiat account object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<FiatAccount> getFiatAccountByIdWithHttpInfo(String accountId) throws ApiException {
    // Check required parameters
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFiatAccountById");
    }

    // Path parameters
    String localVarPath = "/fiat_accounts/{accountId}"
            .replaceAll("\\{accountId}", apiClient.escapeString(accountId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<FiatAccount> localVarReturnType = new GenericType<FiatAccount>() {};
    return apiClient.invokeAPI("FiatAccountsApi.getFiatAccountById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List fiat accounts
   * Returns all fiat accounts.
   * @return List&lt;FiatAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A fiat account object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<FiatAccount> getFiatAccounts() throws ApiException {
    return getFiatAccountsWithHttpInfo().getData();
  }

  /**
   * List fiat accounts
   * Returns all fiat accounts.
   * @return ApiResponse&lt;List&lt;FiatAccount&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A fiat account object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<FiatAccount>> getFiatAccountsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<FiatAccount>> localVarReturnType = new GenericType<List<FiatAccount>>() {};
    return apiClient.invokeAPI("FiatAccountsApi.getFiatAccounts", "/fiat_accounts", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Redeem funds to DDA
   * Redeems funds to the linked DDA.
   * @param accountId The ID of the fiat account to use (required)
   * @param redeemFundsToLinkedDDARequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Transfer succeeded </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void redeemFundsToLinkedDDA(String accountId, RedeemFundsToLinkedDDARequest redeemFundsToLinkedDDARequest) throws ApiException {
    redeemFundsToLinkedDDAWithHttpInfo(accountId, redeemFundsToLinkedDDARequest);
  }

  /**
   * Redeem funds to DDA
   * Redeems funds to the linked DDA.
   * @param accountId The ID of the fiat account to use (required)
   * @param redeemFundsToLinkedDDARequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Transfer succeeded </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> redeemFundsToLinkedDDAWithHttpInfo(String accountId, RedeemFundsToLinkedDDARequest redeemFundsToLinkedDDARequest) throws ApiException {
    // Check required parameters
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling redeemFundsToLinkedDDA");
    }

    // Path parameters
    String localVarPath = "/fiat_accounts/{accountId}/redeem_to_linked_dda"
            .replaceAll("\\{accountId}", apiClient.escapeString(accountId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("FiatAccountsApi.redeemFundsToLinkedDDA", localVarPath, "POST", new ArrayList<>(), redeemFundsToLinkedDDARequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
