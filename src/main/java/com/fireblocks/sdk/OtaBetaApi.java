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
import com.fireblocks.sdk.model.GetOtaStatus200Response;
import com.fireblocks.sdk.model.SetOtaStatusRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OtaBetaApi {
  private ApiClient apiClient;

  public OtaBetaApi() {
    this.apiClient = new ApiClient();
  }

  public OtaBetaApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Returns current OTA status
   * Returns current OTA status
   * @return GetOtaStatus200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Current OTA status </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Configuration not found for tenant </td><td>  -  </td></tr>
     </table>
   */
  public GetOtaStatus200Response getOtaStatus( RequestOptions requestOptions) throws ApiException {
     return getOtaStatusWithHttpInfo( requestOptions).getData();
  }

  public GetOtaStatus200Response getOtaStatus() throws ApiException {
   return getOtaStatusWithHttpInfo( null).getData();
  }

  /**
   * Returns current OTA status
   * Returns current OTA status
   * @return ApiResponse&lt;GetOtaStatus200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Current OTA status </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Configuration not found for tenant </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetOtaStatus200Response> getOtaStatusWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GetOtaStatus200Response> localVarReturnType = new GenericType<GetOtaStatus200Response>() {};
    return apiClient.invokeAPI("OtaBetaApi.getOtaStatus", "/management/ota", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Enable or disable transactions to OTA
   * Enable or disable transactions to OTA
   * @param setOtaStatusRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successfully updated OTA status </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Similar request already pending </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public void setOtaStatus(SetOtaStatusRequest setOtaStatusRequest,  RequestOptions requestOptions) throws ApiException {
    setOtaStatusWithHttpInfo(setOtaStatusRequest, requestOptions);
  }

  public void setOtaStatus(SetOtaStatusRequest setOtaStatusRequest) throws ApiException {
  setOtaStatusWithHttpInfo(setOtaStatusRequest, null);
  }

  /**
   * Enable or disable transactions to OTA
   * Enable or disable transactions to OTA
   * @param setOtaStatusRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successfully updated OTA status </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Similar request already pending </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> setOtaStatusWithHttpInfo(SetOtaStatusRequest setOtaStatusRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (setOtaStatusRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setOtaStatusRequest' when calling setOtaStatus");
    }

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setOtaStatusRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("OtaBetaApi.setOtaStatus", "/management/ota", "POST", new ArrayList<>(), setOtaStatusRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
