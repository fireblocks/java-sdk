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
import com.fireblocks.sdk.model.DraftReviewAndValidationResponse;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.PolicyAndValidationResponse;
import com.fireblocks.sdk.model.PublishDraftRequest;
import com.fireblocks.sdk.model.PublishPolicyRulesRequest;
import com.fireblocks.sdk.model.PublishResult;
import com.fireblocks.sdk.model.UpdateDraftRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyEditorBetaApi {
  private ApiClient apiClient;

  public PolicyEditorBetaApi() {
    this.apiClient = new ApiClient();
  }

  public PolicyEditorBetaApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Get the active policy and its validation
   * Returns the active policy and its validation. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @return PolicyAndValidationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A policy object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public PolicyAndValidationResponse getActivePolicy( RequestOptions requestOptions) throws ApiException {
     return getActivePolicyWithHttpInfo( requestOptions).getData();
  }

  public PolicyAndValidationResponse getActivePolicy() throws ApiException {
   return getActivePolicyWithHttpInfo( null).getData();
  }

  /**
   * Get the active policy and its validation
   * Returns the active policy and its validation. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @return ApiResponse&lt;PolicyAndValidationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A policy object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<PolicyAndValidationResponse> getActivePolicyWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<PolicyAndValidationResponse> localVarReturnType = new GenericType<PolicyAndValidationResponse>() {};
    return apiClient.invokeAPI("PolicyEditorBetaApi.getActivePolicy", "/tap/active_policy", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get the active draft
   * Returns the active draft and its validation. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @return DraftReviewAndValidationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A draft validation response object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public DraftReviewAndValidationResponse getDraft( RequestOptions requestOptions) throws ApiException {
     return getDraftWithHttpInfo( requestOptions).getData();
  }

  public DraftReviewAndValidationResponse getDraft() throws ApiException {
   return getDraftWithHttpInfo( null).getData();
  }

  /**
   * Get the active draft
   * Returns the active draft and its validation. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @return ApiResponse&lt;DraftReviewAndValidationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A draft validation response object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<DraftReviewAndValidationResponse> getDraftWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<DraftReviewAndValidationResponse> localVarReturnType = new GenericType<DraftReviewAndValidationResponse>() {};
    return apiClient.invokeAPI("PolicyEditorBetaApi.getDraft", "/tap/draft", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Send publish request for a certain draft id
   * Send publish request of certain draft id and returns the response. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param publishDraftRequest  (required)
   * @return PublishResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A policy publish result object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public PublishResult publishDraft(PublishDraftRequest publishDraftRequest,  RequestOptions requestOptions) throws ApiException {
     return publishDraftWithHttpInfo(publishDraftRequest, requestOptions).getData();
  }

  public PublishResult publishDraft(PublishDraftRequest publishDraftRequest) throws ApiException {
   return publishDraftWithHttpInfo(publishDraftRequest, null).getData();
  }

  /**
   * Send publish request for a certain draft id
   * Send publish request of certain draft id and returns the response. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param publishDraftRequest  (required)
   * @return ApiResponse&lt;PublishResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A policy publish result object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<PublishResult> publishDraftWithHttpInfo(PublishDraftRequest publishDraftRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (publishDraftRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'publishDraftRequest' when calling publishDraft");
    }

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = publishDraftRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<PublishResult> localVarReturnType = new GenericType<PublishResult>() {};
    return apiClient.invokeAPI("PolicyEditorBetaApi.publishDraft", "/tap/draft", "POST", new ArrayList<>(), publishDraftRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Send publish request for a set of policy rules
   * Send publish request of set of policy rules and returns the response. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param publishPolicyRulesRequest  (required)
   * @return PublishResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A policy publish result object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public PublishResult publishPolicyRules(PublishPolicyRulesRequest publishPolicyRulesRequest,  RequestOptions requestOptions) throws ApiException {
     return publishPolicyRulesWithHttpInfo(publishPolicyRulesRequest, requestOptions).getData();
  }

  public PublishResult publishPolicyRules(PublishPolicyRulesRequest publishPolicyRulesRequest) throws ApiException {
   return publishPolicyRulesWithHttpInfo(publishPolicyRulesRequest, null).getData();
  }

  /**
   * Send publish request for a set of policy rules
   * Send publish request of set of policy rules and returns the response. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param publishPolicyRulesRequest  (required)
   * @return ApiResponse&lt;PublishResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A policy publish result object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<PublishResult> publishPolicyRulesWithHttpInfo(PublishPolicyRulesRequest publishPolicyRulesRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (publishPolicyRulesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'publishPolicyRulesRequest' when calling publishPolicyRules");
    }

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = publishPolicyRulesRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<PublishResult> localVarReturnType = new GenericType<PublishResult>() {};
    return apiClient.invokeAPI("PolicyEditorBetaApi.publishPolicyRules", "/tap/publish", "POST", new ArrayList<>(), publishPolicyRulesRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update the draft with a new set of rules
   * Update the draft and return its validation. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param updateDraftRequest  (required)
   * @return DraftReviewAndValidationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A draft validation response object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public DraftReviewAndValidationResponse updateDraft(UpdateDraftRequest updateDraftRequest,  RequestOptions requestOptions) throws ApiException {
     return updateDraftWithHttpInfo(updateDraftRequest, requestOptions).getData();
  }

  public DraftReviewAndValidationResponse updateDraft(UpdateDraftRequest updateDraftRequest) throws ApiException {
   return updateDraftWithHttpInfo(updateDraftRequest, null).getData();
  }

  /**
   * Update the draft with a new set of rules
   * Update the draft and return its validation. &lt;/br&gt; **Note:** These endpoints are currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param updateDraftRequest  (required)
   * @return ApiResponse&lt;DraftReviewAndValidationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A draft validation response object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<DraftReviewAndValidationResponse> updateDraftWithHttpInfo(UpdateDraftRequest updateDraftRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (updateDraftRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateDraftRequest' when calling updateDraft");
    }

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = updateDraftRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<DraftReviewAndValidationResponse> localVarReturnType = new GenericType<DraftReviewAndValidationResponse>() {};
    return apiClient.invokeAPI("PolicyEditorBetaApi.updateDraft", "/tap/draft", "PUT", new ArrayList<>(), updateDraftRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
