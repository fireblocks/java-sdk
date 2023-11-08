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
  public ResendWebhooksResponse resendWebhooks( RequestOptions requestOptions) throws ApiException {
     return resendWebhooksWithHttpInfo( requestOptions).getData();
  }

  public ResendWebhooksResponse resendWebhooks() throws ApiException {
   return resendWebhooksWithHttpInfo( null).getData();
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
  public ApiResponse<ResendWebhooksResponse> resendWebhooksWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<ResendWebhooksResponse> localVarReturnType = new GenericType<ResendWebhooksResponse>() {};
    return apiClient.invokeAPI("WebhooksApi.resendWebhooks", "/webhooks/resend", "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public void resendWebhooksForTransaction(String txId, ResendWebhooksForTransactionRequest resendWebhooksForTransactionRequest,  RequestOptions requestOptions) throws ApiException {
    resendWebhooksForTransactionWithHttpInfo(txId,resendWebhooksForTransactionRequest, requestOptions);
  }

  public void resendWebhooksForTransaction(String txId, ResendWebhooksForTransactionRequest resendWebhooksForTransactionRequest) throws ApiException {
  resendWebhooksForTransactionWithHttpInfo(txId,resendWebhooksForTransactionRequest, null);
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
  public ApiResponse<Void> resendWebhooksForTransactionWithHttpInfo(String txId,ResendWebhooksForTransactionRequest resendWebhooksForTransactionRequest, RequestOptions requestOptions) throws ApiException {
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

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = resendWebhooksForTransactionRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("WebhooksApi.resendWebhooksForTransaction", localVarPath, "POST", new ArrayList<>(), resendWebhooksForTransactionRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
