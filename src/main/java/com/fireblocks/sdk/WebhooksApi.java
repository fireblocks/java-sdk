package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.ResendWebhooksForTransactionRequest;
import com.fireblocks.sdk.model.ResendWebhooksResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this.apiClient = new ApiClient();
  }

  public WebhooksApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Resend failed webhooks
   * Resends all failed webhook notifications.
   * @return ResendWebhooksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ResendWebhooksResponse resendWebhooks() throws ApiException {
    return resendWebhooksWithHttpInfo().getData();
  }

  /**
   * Resend failed webhooks
   * Resends all failed webhook notifications.
   * @return ApiResponse&lt;ResendWebhooksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<ResendWebhooksResponse> resendWebhooksWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ResendWebhooksResponse> localVarReturnType = new GenericType<ResendWebhooksResponse>() {};
    return apiClient.invokeAPI("WebhooksApi.resendWebhooks", "/webhooks/resend", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Resend failed webhooks for a transaction by ID
   * Resends failed webhook notifications for a transaction by ID.
   * @param txId The ID of the transaction for webhooks (required)
   * @param resendWebhooksForTransactionRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void resendWebhooksForTransaction(String txId, ResendWebhooksForTransactionRequest resendWebhooksForTransactionRequest) throws ApiException {
    resendWebhooksForTransactionWithHttpInfo(txId, resendWebhooksForTransactionRequest);
  }

  /**
   * Resend failed webhooks for a transaction by ID
   * Resends failed webhook notifications for a transaction by ID.
   * @param txId The ID of the transaction for webhooks (required)
   * @param resendWebhooksForTransactionRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> resendWebhooksForTransactionWithHttpInfo(String txId, ResendWebhooksForTransactionRequest resendWebhooksForTransactionRequest) throws ApiException {
    // Check required parameters
    if (txId == null) {
      throw new ApiException(400, "Missing the required parameter 'txId' when calling resendWebhooksForTransaction");
    }
    if (resendWebhooksForTransactionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'resendWebhooksForTransactionRequest' when calling resendWebhooksForTransaction");
    }

    // Path parameters
    String localVarPath = "/webhooks/resend/{txId}"
            .replaceAll("\\{txId}", apiClient.escapeString(txId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("WebhooksApi.resendWebhooksForTransaction", localVarPath, "POST", new ArrayList<>(), resendWebhooksForTransactionRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
