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
import com.fireblocks.sdk.model.CreateUsersGroupResponse;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.UserGroupCreateRequest;
import com.fireblocks.sdk.model.UserGroupCreateResponse;
import com.fireblocks.sdk.model.UserGroupUpdateRequest;
import com.fireblocks.sdk.model.UsersGroupResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsersGroupsBetaApi {
  private ApiClient apiClient;

  public UsersGroupsBetaApi() {
    this.apiClient = new ApiClient();
  }

  public UsersGroupsBetaApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Create users group
   * Create a new users group.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @param userGroupCreateRequest  (required)
   * @return CreateUsersGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Users group created and pending approval </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateUsersGroupResponse createUserGroup(UserGroupCreateRequest userGroupCreateRequest,  RequestOptions requestOptions) throws ApiException {
     return createUserGroupWithHttpInfo(userGroupCreateRequest, requestOptions).getData();
  }

  public CreateUsersGroupResponse createUserGroup(UserGroupCreateRequest userGroupCreateRequest) throws ApiException {
   return createUserGroupWithHttpInfo(userGroupCreateRequest, null).getData();
  }

  /**
   * Create users group
   * Create a new users group.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @param userGroupCreateRequest  (required)
   * @return ApiResponse&lt;CreateUsersGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Users group created and pending approval </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateUsersGroupResponse> createUserGroupWithHttpInfo(UserGroupCreateRequest userGroupCreateRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (userGroupCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroupCreateRequest' when calling createUserGroup");
    }

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = userGroupCreateRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateUsersGroupResponse> localVarReturnType = new GenericType<CreateUsersGroupResponse>() {};
    return apiClient.invokeAPI("UsersGroupsBetaApi.createUserGroup", "/users_groups", "POST", new ArrayList<>(), userGroupCreateRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete users group
   * Delete a users group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @param groupId The ID of the users group (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Request to delete users group submitted for approval </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void deleteUserGroup(String groupId,  RequestOptions requestOptions) throws ApiException {
    deleteUserGroupWithHttpInfo(groupId, requestOptions);
  }

  public void deleteUserGroup(String groupId) throws ApiException {
  deleteUserGroupWithHttpInfo(groupId, null);
  }

  /**
   * Delete users group
   * Delete a users group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @param groupId The ID of the users group (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Request to delete users group submitted for approval </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteUserGroupWithHttpInfo(String groupId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteUserGroup");
    }

    // Path parameters
    String localVarPath = "/users_groups/{groupId}"
            .replaceAll("\\{groupId}", apiClient.escapeString(groupId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("UsersGroupsBetaApi.deleteUserGroup", localVarPath, "DELETE", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Get users group
   * Get a users group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @param groupId The ID of the users group (required)
   * @return UsersGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Users group </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public UsersGroupResponse getUserGroup(String groupId,  RequestOptions requestOptions) throws ApiException {
     return getUserGroupWithHttpInfo(groupId, requestOptions).getData();
  }

  public UsersGroupResponse getUserGroup(String groupId) throws ApiException {
   return getUserGroupWithHttpInfo(groupId, null).getData();
  }

  /**
   * Get users group
   * Get a users group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @param groupId The ID of the users group (required)
   * @return ApiResponse&lt;UsersGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Users group </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<UsersGroupResponse> getUserGroupWithHttpInfo(String groupId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getUserGroup");
    }

    // Path parameters
    String localVarPath = "/users_groups/{groupId}"
            .replaceAll("\\{groupId}", apiClient.escapeString(groupId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<UsersGroupResponse> localVarReturnType = new GenericType<UsersGroupResponse>() {};
    return apiClient.invokeAPI("UsersGroupsBetaApi.getUserGroup", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List users groups
   * Get all user groups in your workspace. &lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @return List&lt;UsersGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of the users groups in your workspace </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<UsersGroupResponse> getUserGroups( RequestOptions requestOptions) throws ApiException {
     return getUserGroupsWithHttpInfo( requestOptions).getData();
  }

  public List<UsersGroupResponse> getUserGroups() throws ApiException {
   return getUserGroupsWithHttpInfo( null).getData();
  }

  /**
   * List users groups
   * Get all user groups in your workspace. &lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @return ApiResponse&lt;List&lt;UsersGroupResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of the users groups in your workspace </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<UsersGroupResponse>> getUserGroupsWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<UsersGroupResponse>> localVarReturnType = new GenericType<List<UsersGroupResponse>>() {};
    return apiClient.invokeAPI("UsersGroupsBetaApi.getUserGroups", "/users_groups", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update users group
   * Update a users group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @param groupId The ID of the users group (required)
   * @param userGroupUpdateRequest  (required)
   * @return UserGroupCreateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Users group updated and the changes are pending approval </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public UserGroupCreateResponse updateUserGroup(String groupId, UserGroupUpdateRequest userGroupUpdateRequest,  RequestOptions requestOptions) throws ApiException {
     return updateUserGroupWithHttpInfo(groupId,userGroupUpdateRequest, requestOptions).getData();
  }

  public UserGroupCreateResponse updateUserGroup(String groupId, UserGroupUpdateRequest userGroupUpdateRequest) throws ApiException {
   return updateUserGroupWithHttpInfo(groupId,userGroupUpdateRequest, null).getData();
  }

  /**
   * Update users group
   * Update a users group by ID.&lt;/br&gt;  **Note**: - This endpoint is now in Beta, disabled for general availability at this time. - Please note that this endpoint is available only for API keys with Admin permissions. 
   * @param groupId The ID of the users group (required)
   * @param userGroupUpdateRequest  (required)
   * @return ApiResponse&lt;UserGroupCreateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Users group updated and the changes are pending approval </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<UserGroupCreateResponse> updateUserGroupWithHttpInfo(String groupId,UserGroupUpdateRequest userGroupUpdateRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateUserGroup");
    }
    if (userGroupUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroupUpdateRequest' when calling updateUserGroup");
    }

    // Path parameters
    String localVarPath = "/users_groups/{groupId}"
            .replaceAll("\\{groupId}", apiClient.escapeString(groupId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = userGroupUpdateRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<UserGroupCreateResponse> localVarReturnType = new GenericType<UserGroupCreateResponse>() {};
    return apiClient.invokeAPI("UsersGroupsBetaApi.updateUserGroup", localVarPath, "PUT", new ArrayList<>(), userGroupUpdateRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
