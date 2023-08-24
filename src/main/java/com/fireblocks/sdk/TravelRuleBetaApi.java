package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.fireblocks.sdk.model.TravelRuleGetAllVASPsResponse;
import com.fireblocks.sdk.model.TravelRuleUpdateVASPDetails;
import com.fireblocks.sdk.model.TravelRuleVASP;
import com.fireblocks.sdk.model.TravelRuleValidateFullTransactionRequest;
import com.fireblocks.sdk.model.TravelRuleValidateTransactionRequest;
import com.fireblocks.sdk.model.TravelRuleValidateTransactionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleBetaApi {
  private ApiClient apiClient;

  public TravelRuleBetaApi() {
    this.apiClient = new ApiClient();
  }

  public TravelRuleBetaApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Get VASP details
   * Get VASP Details.  Returns information about a VASP that has the specified DID.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param did  (required)
   * @param fields CSV of fields to return (all, \&quot;blank\&quot; or see list of all field names below) (optional)
   * @return TravelRuleVASP
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Transaction validated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public TravelRuleVASP getVASPByDID(String did, String fields) throws ApiException {
    return getVASPByDIDWithHttpInfo(did, fields).getData();
  }

  /**
   * Get VASP details
   * Get VASP Details.  Returns information about a VASP that has the specified DID.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param did  (required)
   * @param fields CSV of fields to return (all, \&quot;blank\&quot; or see list of all field names below) (optional)
   * @return ApiResponse&lt;TravelRuleVASP&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Transaction validated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TravelRuleVASP> getVASPByDIDWithHttpInfo(String did, String fields) throws ApiException {
    // Check required parameters
    if (did == null) {
      throw new ApiException(400, "Missing the required parameter 'did' when calling getVASPByDID");
    }

    // Path parameters
    String localVarPath = "/screening/travel_rule/vasp/{did}"
            .replaceAll("\\{did}", apiClient.escapeString(did));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "fields", fields)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TravelRuleVASP> localVarReturnType = new GenericType<TravelRuleVASP>() {};
    return apiClient.invokeAPI("TravelRuleBetaApi.getVASPByDID", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get All VASPs
   * Get All VASPs.  Returns a list of VASPs. VASPs can be searched and sorted and results are paginated.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param order Field to order by (optional)
   * @param perPage Records per page (optional)
   * @param page Page number (optional)
   * @param fields CSV of fields to return (all, \&quot;blank\&quot; or see list of all field names below) (optional)
   * @return TravelRuleGetAllVASPsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get all VASPs </td><td>  -  </td></tr>
     </table>
   */
  public TravelRuleGetAllVASPsResponse getVASPs(String order, BigDecimal perPage, BigDecimal page, String fields) throws ApiException {
    return getVASPsWithHttpInfo(order, perPage, page, fields).getData();
  }

  /**
   * Get All VASPs
   * Get All VASPs.  Returns a list of VASPs. VASPs can be searched and sorted and results are paginated.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param order Field to order by (optional)
   * @param perPage Records per page (optional)
   * @param page Page number (optional)
   * @param fields CSV of fields to return (all, \&quot;blank\&quot; or see list of all field names below) (optional)
   * @return ApiResponse&lt;TravelRuleGetAllVASPsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get all VASPs </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TravelRuleGetAllVASPsResponse> getVASPsWithHttpInfo(String order, BigDecimal perPage, BigDecimal page, String fields) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "order", order)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<TravelRuleGetAllVASPsResponse> localVarReturnType = new GenericType<TravelRuleGetAllVASPsResponse>() {};
    return apiClient.invokeAPI("TravelRuleBetaApi.getVASPs", "/screening/travel_rule/vasp", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Add jsonDidKey to VASP details
   * Update VASP Details.  Updates a VASP with the provided parameters. Use this endpoint to add your public jsonDIDkey generated by Notabene.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param travelRuleUpdateVASPDetails  (required)
   * @return TravelRuleUpdateVASPDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> VASP updated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public TravelRuleUpdateVASPDetails travelRuleApiControllerUpdateVasp(TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails) throws ApiException {
    return travelRuleApiControllerUpdateVaspWithHttpInfo(travelRuleUpdateVASPDetails).getData();
  }

  /**
   * Add jsonDidKey to VASP details
   * Update VASP Details.  Updates a VASP with the provided parameters. Use this endpoint to add your public jsonDIDkey generated by Notabene.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param travelRuleUpdateVASPDetails  (required)
   * @return ApiResponse&lt;TravelRuleUpdateVASPDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> VASP updated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TravelRuleUpdateVASPDetails> travelRuleApiControllerUpdateVaspWithHttpInfo(TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails) throws ApiException {
    // Check required parameters
    if (travelRuleUpdateVASPDetails == null) {
      throw new ApiException(400, "Missing the required parameter 'travelRuleUpdateVASPDetails' when calling travelRuleApiControllerUpdateVasp");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TravelRuleUpdateVASPDetails> localVarReturnType = new GenericType<TravelRuleUpdateVASPDetails>() {};
    return apiClient.invokeAPI("TravelRuleBetaApi.travelRuleApiControllerUpdateVasp", "/screeening/travel_rule/vasp/update", "PUT", new ArrayList<>(), travelRuleUpdateVASPDetails,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Validate Full Travel Rule Transaction
   * Validate Full Travel Rule transactions.  Checks for all required information on the originator and beneficiary VASPs.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param travelRuleValidateFullTransactionRequest  (required)
   * @return TravelRuleValidateTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Transaction validated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public TravelRuleValidateTransactionResponse validateFullTravelRuleTransaction(TravelRuleValidateFullTransactionRequest travelRuleValidateFullTransactionRequest) throws ApiException {
    return validateFullTravelRuleTransactionWithHttpInfo(travelRuleValidateFullTransactionRequest).getData();
  }

  /**
   * Validate Full Travel Rule Transaction
   * Validate Full Travel Rule transactions.  Checks for all required information on the originator and beneficiary VASPs.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param travelRuleValidateFullTransactionRequest  (required)
   * @return ApiResponse&lt;TravelRuleValidateTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Transaction validated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TravelRuleValidateTransactionResponse> validateFullTravelRuleTransactionWithHttpInfo(TravelRuleValidateFullTransactionRequest travelRuleValidateFullTransactionRequest) throws ApiException {
    // Check required parameters
    if (travelRuleValidateFullTransactionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'travelRuleValidateFullTransactionRequest' when calling validateFullTravelRuleTransaction");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TravelRuleValidateTransactionResponse> localVarReturnType = new GenericType<TravelRuleValidateTransactionResponse>() {};
    return apiClient.invokeAPI("TravelRuleBetaApi.validateFullTravelRuleTransaction", "/screening/travel_rule/transaction/validate/full", "POST", new ArrayList<>(), travelRuleValidateFullTransactionRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Validate Travel Rule Transaction
   * Validate Travel Rule transactions.  Checks what beneficiary VASP details are required by your jurisdiction and the beneficiary&#39;s jurisdiction.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param travelRuleValidateTransactionRequest  (required)
   * @return TravelRuleValidateTransactionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Transaction validated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public TravelRuleValidateTransactionResponse validateTravelRuleTransaction(TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest) throws ApiException {
    return validateTravelRuleTransactionWithHttpInfo(travelRuleValidateTransactionRequest).getData();
  }

  /**
   * Validate Travel Rule Transaction
   * Validate Travel Rule transactions.  Checks what beneficiary VASP details are required by your jurisdiction and the beneficiary&#39;s jurisdiction.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
   * @param travelRuleValidateTransactionRequest  (required)
   * @return ApiResponse&lt;TravelRuleValidateTransactionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Transaction validated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid request body </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TravelRuleValidateTransactionResponse> validateTravelRuleTransactionWithHttpInfo(TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest) throws ApiException {
    // Check required parameters
    if (travelRuleValidateTransactionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'travelRuleValidateTransactionRequest' when calling validateTravelRuleTransaction");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<TravelRuleValidateTransactionResponse> localVarReturnType = new GenericType<TravelRuleValidateTransactionResponse>() {};
    return apiClient.invokeAPI("TravelRuleBetaApi.validateTravelRuleTransaction", "/screening/travel_rule/transaction/validate", "POST", new ArrayList<>(), travelRuleValidateTransactionRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
