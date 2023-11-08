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
import com.fireblocks.sdk.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditLogsApi {
  private ApiClient apiClient;

  public AuditLogsApi() {
    this.apiClient = new ApiClient();
  }

  public AuditLogsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Get audit logs
   * Get all audits
   * @param timePeriod The last time period to fetch audit logs (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Audit logs from requested time period </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void getAudits(String timePeriod,  RequestOptions requestOptions) throws ApiException {
    getAuditsWithHttpInfo(timePeriod, requestOptions);
  }

  public void getAudits(String timePeriod) throws ApiException {
  getAuditsWithHttpInfo(timePeriod, null);
  }

  /**
   * Get audit logs
   * Get all audits
   * @param timePeriod The last time period to fetch audit logs (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Audit logs from requested time period </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> getAuditsWithHttpInfo(String timePeriod, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (timePeriod == null) {
      throw new ApiException(400, "Missing the required parameter 'timePeriod' when calling getAudits");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "timePeriod", timePeriod)
    );

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("AuditLogsApi.getAudits", "/audits", "GET", localVarQueryParams, null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
