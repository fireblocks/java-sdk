package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.fireblocks.sdk.model.ConvertAssetsRequest;
import com.fireblocks.sdk.model.CreateInternalTransferRequest;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.ExchangeAccount;
import com.fireblocks.sdk.model.ExchangeAsset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExchangeAccountsApi {
  private ApiClient apiClient;

  public ExchangeAccountsApi() {
    this.apiClient = new ApiClient();
  }

  public ExchangeAccountsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Convert exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC, USDC to USD) and Bitso (MXN to USD) are supported conversions.
   * 
   * @param exchangeAccountId The ID of the exchange account. Please make sure the exchange supports conversions. To find the ID of your exchange account, use GET/exchange_accounts. (required)
   * @param convertAssetsRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Conversion successful </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void convertAssets(String exchangeAccountId, ConvertAssetsRequest convertAssetsRequest) throws ApiException {
    convertAssetsWithHttpInfo(exchangeAccountId, convertAssetsRequest);
  }

  /**
   * Convert exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC, USDC to USD) and Bitso (MXN to USD) are supported conversions.
   * 
   * @param exchangeAccountId The ID of the exchange account. Please make sure the exchange supports conversions. To find the ID of your exchange account, use GET/exchange_accounts. (required)
   * @param convertAssetsRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Conversion successful </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> convertAssetsWithHttpInfo(String exchangeAccountId, ConvertAssetsRequest convertAssetsRequest) throws ApiException {
    // Check required parameters
    if (exchangeAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'exchangeAccountId' when calling convertAssets");
    }

    // Path parameters
    String localVarPath = "/exchange_accounts/{exchangeAccountId}/convert"
            .replaceAll("\\{exchangeAccountId}", apiClient.escapeString(exchangeAccountId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ExchangeAccountsApi.convertAssets", localVarPath, "POST", new ArrayList<>(), convertAssetsRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Find an asset for an exchange account
   * Returns an asset for an exchange account.
   * @param exchangeAccountId The ID of the exchange account to return (required)
   * @param assetId The ID of the asset to return (required)
   * @return ExchangeAsset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An ExchangeAccountAsset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ExchangeAsset getExchangeAccountAsset(String exchangeAccountId, String assetId) throws ApiException {
    return getExchangeAccountAssetWithHttpInfo(exchangeAccountId, assetId).getData();
  }

  /**
   * Find an asset for an exchange account
   * Returns an asset for an exchange account.
   * @param exchangeAccountId The ID of the exchange account to return (required)
   * @param assetId The ID of the asset to return (required)
   * @return ApiResponse&lt;ExchangeAsset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An ExchangeAccountAsset object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ExchangeAsset> getExchangeAccountAssetWithHttpInfo(String exchangeAccountId, String assetId) throws ApiException {
    // Check required parameters
    if (exchangeAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'exchangeAccountId' when calling getExchangeAccountAsset");
    }
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getExchangeAccountAsset");
    }

    // Path parameters
    String localVarPath = "/exchange_accounts/{exchangeAccountId}/{assetId}"
            .replaceAll("\\{exchangeAccountId}", apiClient.escapeString(exchangeAccountId))
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExchangeAsset> localVarReturnType = new GenericType<ExchangeAsset>() {};
    return apiClient.invokeAPI("ExchangeAccountsApi.getExchangeAccountAsset", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Find a specific exchange account
   * Returns an exchange account by ID.
   * @param exchangeAccountId The ID of the exchange account to return (required)
   * @return ExchangeAccount
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An ExchangeAccount object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ExchangeAccount getExchangeAccountById(String exchangeAccountId) throws ApiException {
    return getExchangeAccountByIdWithHttpInfo(exchangeAccountId).getData();
  }

  /**
   * Find a specific exchange account
   * Returns an exchange account by ID.
   * @param exchangeAccountId The ID of the exchange account to return (required)
   * @return ApiResponse&lt;ExchangeAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An ExchangeAccount object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ExchangeAccount> getExchangeAccountByIdWithHttpInfo(String exchangeAccountId) throws ApiException {
    // Check required parameters
    if (exchangeAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'exchangeAccountId' when calling getExchangeAccountById");
    }

    // Path parameters
    String localVarPath = "/exchange_accounts/{exchangeAccountId}"
            .replaceAll("\\{exchangeAccountId}", apiClient.escapeString(exchangeAccountId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ExchangeAccount> localVarReturnType = new GenericType<ExchangeAccount>() {};
    return apiClient.invokeAPI("ExchangeAccountsApi.getExchangeAccountById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List exchange accounts
   * Returns all exchange accounts.
   * @return List&lt;ExchangeAccount&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An ExchangeAccount object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<ExchangeAccount> getExchangeAccounts() throws ApiException {
    return getExchangeAccountsWithHttpInfo().getData();
  }

  /**
   * List exchange accounts
   * Returns all exchange accounts.
   * @return ApiResponse&lt;List&lt;ExchangeAccount&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An ExchangeAccount object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<ExchangeAccount>> getExchangeAccountsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<ExchangeAccount>> localVarReturnType = new GenericType<List<ExchangeAccount>>() {};
    return apiClient.invokeAPI("ExchangeAccountsApi.getExchangeAccounts", "/exchange_accounts", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Internal tranfer for exchange accounts
   * Transfers funds between trading accounts under the same exchange account.
   * @param exchangeAccountId The ID of the exchange account to return (required)
   * @param createInternalTransferRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Transfer succeeded </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void internalTransfer(String exchangeAccountId, CreateInternalTransferRequest createInternalTransferRequest) throws ApiException {
    internalTransferWithHttpInfo(exchangeAccountId, createInternalTransferRequest);
  }

  /**
   * Internal tranfer for exchange accounts
   * Transfers funds between trading accounts under the same exchange account.
   * @param exchangeAccountId The ID of the exchange account to return (required)
   * @param createInternalTransferRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Transfer succeeded </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> internalTransferWithHttpInfo(String exchangeAccountId, CreateInternalTransferRequest createInternalTransferRequest) throws ApiException {
    // Check required parameters
    if (exchangeAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'exchangeAccountId' when calling internalTransfer");
    }

    // Path parameters
    String localVarPath = "/exchange_accounts/{exchangeAccountId}/internal_transfer"
            .replaceAll("\\{exchangeAccountId}", apiClient.escapeString(exchangeAccountId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("ExchangeAccountsApi.internalTransfer", localVarPath, "POST", new ArrayList<>(), createInternalTransferRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
