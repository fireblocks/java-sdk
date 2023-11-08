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
import com.fireblocks.sdk.model.CreatePayoutRequest;
import com.fireblocks.sdk.model.DispatchPayoutResponse;
import com.fireblocks.sdk.model.ErrorResponse;
import com.fireblocks.sdk.model.PayoutResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentsPayoutApi {
  private ApiClient apiClient;

  public PaymentsPayoutApi() {
    this.apiClient = new ApiClient();
  }

  public PaymentsPayoutApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Create a payout instruction set
   * **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; &lt;/br&gt; &lt;b u&gt;Create a payout instruction set.&lt;/b&gt; &lt;/u&gt;&lt;/br&gt; A payout instruction set is a set of instructions for distributing payments from a single payment account to a list of payee accounts. &lt;/br&gt; The instruction set defines: &lt;/br&gt; &lt;ul&gt; &lt;li&gt;the payment account and its account type (vault, exchange, or fiat). &lt;/li&gt; &lt;li&gt;the account type (vault account, exchange account, whitelisted address, network connection, fiat account, or merchant account), the amount, and the asset of payment for each payee account.&lt;/li&gt; &lt;/ul&gt; 
   * @param createPayoutRequest  (optional)
   * @return PayoutResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The payout instruction set creation succeeded and returns the generated instruction set with a unique payout IDThe payout ID will be used for executing the payout and checking the payout status. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public PayoutResponse createPayout(CreatePayoutRequest createPayoutRequest,  RequestOptions requestOptions) throws ApiException {
     return createPayoutWithHttpInfo(createPayoutRequest, requestOptions).getData();
  }

  public PayoutResponse createPayout(CreatePayoutRequest createPayoutRequest) throws ApiException {
   return createPayoutWithHttpInfo(createPayoutRequest, null).getData();
  }

  /**
   * Create a payout instruction set
   * **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; &lt;/br&gt; &lt;b u&gt;Create a payout instruction set.&lt;/b&gt; &lt;/u&gt;&lt;/br&gt; A payout instruction set is a set of instructions for distributing payments from a single payment account to a list of payee accounts. &lt;/br&gt; The instruction set defines: &lt;/br&gt; &lt;ul&gt; &lt;li&gt;the payment account and its account type (vault, exchange, or fiat). &lt;/li&gt; &lt;li&gt;the account type (vault account, exchange account, whitelisted address, network connection, fiat account, or merchant account), the amount, and the asset of payment for each payee account.&lt;/li&gt; &lt;/ul&gt; 
   * @param createPayoutRequest  (optional)
   * @return ApiResponse&lt;PayoutResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The payout instruction set creation succeeded and returns the generated instruction set with a unique payout IDThe payout ID will be used for executing the payout and checking the payout status. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayoutResponse> createPayoutWithHttpInfo(CreatePayoutRequest createPayoutRequest, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = createPayoutRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<PayoutResponse> localVarReturnType = new GenericType<PayoutResponse>() {};
    return apiClient.invokeAPI("PaymentsPayoutApi.createPayout", "/payments/payout", "POST", new ArrayList<>(), createPayoutRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Execute a payout instruction set
   * **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; &lt;/br&gt;&lt;b u&gt;Execute a payout instruction set.&lt;/b&gt; &lt;/u&gt; &lt;/br&gt; &lt;/br&gt;The instruction set will be verified and executed.&lt;/br&gt; &lt;b&gt;&lt;u&gt;Source locking&lt;/br&gt;&lt;/b&gt; &lt;/u&gt; If you are executing a payout instruction set from a payment account with an already active payout the active payout will complete before the new payout instruction set can be executed. &lt;/br&gt; You cannot execute the same payout instruction set more than once. 
   * @param payoutId the payout id received from the creation of the payout instruction set (required)
   * @return DispatchPayoutResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Executed the payout instruction set </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public DispatchPayoutResponse executePayoutAction(String payoutId,  RequestOptions requestOptions) throws ApiException {
     return executePayoutActionWithHttpInfo(payoutId, requestOptions).getData();
  }

  public DispatchPayoutResponse executePayoutAction(String payoutId) throws ApiException {
   return executePayoutActionWithHttpInfo(payoutId, null).getData();
  }

  /**
   * Execute a payout instruction set
   * **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; &lt;/br&gt;&lt;b u&gt;Execute a payout instruction set.&lt;/b&gt; &lt;/u&gt; &lt;/br&gt; &lt;/br&gt;The instruction set will be verified and executed.&lt;/br&gt; &lt;b&gt;&lt;u&gt;Source locking&lt;/br&gt;&lt;/b&gt; &lt;/u&gt; If you are executing a payout instruction set from a payment account with an already active payout the active payout will complete before the new payout instruction set can be executed. &lt;/br&gt; You cannot execute the same payout instruction set more than once. 
   * @param payoutId the payout id received from the creation of the payout instruction set (required)
   * @return ApiResponse&lt;DispatchPayoutResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Executed the payout instruction set </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DispatchPayoutResponse> executePayoutActionWithHttpInfo(String payoutId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (payoutId == null) {
      throw new ApiException(400, "Missing the required parameter 'payoutId' when calling executePayoutAction");
    }

    // Path parameters
    String localVarPath = "/payments/payout/{payoutId}/actions/execute"
            .replaceAll("\\{payoutId}", apiClient.escapeString(payoutId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<DispatchPayoutResponse> localVarReturnType = new GenericType<DispatchPayoutResponse>() {};
    return apiClient.invokeAPI("PaymentsPayoutApi.executePayoutAction", localVarPath, "POST", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get the status of a payout instruction set
   * **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; 
   * @param payoutId the payout id received from the creation of the payout instruction set (required)
   * @return PayoutResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the current status of the payout instruction set, including the status of each payout instruction and the transactions created in the process. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No payout with the given payout ID exists. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public PayoutResponse getPayoutById(String payoutId,  RequestOptions requestOptions) throws ApiException {
     return getPayoutByIdWithHttpInfo(payoutId, requestOptions).getData();
  }

  public PayoutResponse getPayoutById(String payoutId) throws ApiException {
   return getPayoutByIdWithHttpInfo(payoutId, null).getData();
  }

  /**
   * Get the status of a payout instruction set
   * **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoints include APIs available only for customers with Payments Engine enabled on their accounts. &lt;/br&gt; &lt;/br&gt;These endpoints are currently in beta and might be subject to changes.&lt;/br&gt; &lt;/br&gt;If you want to learn more about Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or email CSM@fireblocks.com. &lt;/br&gt; 
   * @param payoutId the payout id received from the creation of the payout instruction set (required)
   * @return ApiResponse&lt;PayoutResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the current status of the payout instruction set, including the status of each payout instruction and the transactions created in the process. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No payout with the given payout ID exists. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayoutResponse> getPayoutByIdWithHttpInfo(String payoutId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (payoutId == null) {
      throw new ApiException(400, "Missing the required parameter 'payoutId' when calling getPayoutById");
    }

    // Path parameters
    String localVarPath = "/payments/payout/{payoutId}"
            .replaceAll("\\{payoutId}", apiClient.escapeString(payoutId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PayoutResponse> localVarReturnType = new GenericType<PayoutResponse>() {};
    return apiClient.invokeAPI("PaymentsPayoutApi.getPayoutById", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
