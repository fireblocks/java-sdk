package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.fireblocks.sdk.model.CreateConnectionRequest;
import com.fireblocks.sdk.model.CreateConnectionResponse;
import com.fireblocks.sdk.model.GetConnectionsResponse;
import com.fireblocks.sdk.model.GetFilterParameter;
import com.fireblocks.sdk.model.RespondToConnectionRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Web3ConnectionsApi {
  private ApiClient apiClient;

  public Web3ConnectionsApi() {
    this.apiClient = new ApiClient();
  }

  public Web3ConnectionsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Create a new Web3 connection.
   * Initiate a new Web3 connection.  * Note: After this succeeds, make a request to &#x60;PUT /v1/connections/wc/{id}&#x60; (below) to approve or reject the new Web3 connection.
   * @param createConnectionRequest  (required)
   * @return CreateConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Web3 connection initiated successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid data sent </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CreateConnectionResponse create(CreateConnectionRequest createConnectionRequest) throws ApiException {
    return createWithHttpInfo(createConnectionRequest).getData();
  }

  /**
   * Create a new Web3 connection.
   * Initiate a new Web3 connection.  * Note: After this succeeds, make a request to &#x60;PUT /v1/connections/wc/{id}&#x60; (below) to approve or reject the new Web3 connection.
   * @param createConnectionRequest  (required)
   * @return ApiResponse&lt;CreateConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Web3 connection initiated successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid data sent </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CreateConnectionResponse> createWithHttpInfo(CreateConnectionRequest createConnectionRequest) throws ApiException {
    // Check required parameters
    if (createConnectionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createConnectionRequest' when calling create");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<CreateConnectionResponse> localVarReturnType = new GenericType<CreateConnectionResponse>() {};
    return apiClient.invokeAPI("Web3ConnectionsApi.create", "/connections/wc", "POST", new ArrayList<>(), createConnectionRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List all open Web3 connections.
   * Get open Web3 connections.
   * @param order List order; ascending or descending. (optional, default to ASC)
   * @param filter Parsed filter object (optional)
   * @param sort Property to sort Web3 connections by. (optional, default to createdAt)
   * @param pageSize Amount of results to return in the next page. (optional, default to 10)
   * @param next Cursor to the next page (optional)
   * @return GetConnectionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 400 </td><td> Query parameters were invalid </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public GetConnectionsResponse get(String order, GetFilterParameter filter, String sort, BigDecimal pageSize, String next) throws ApiException {
    return getWithHttpInfo(order, filter, sort, pageSize, next).getData();
  }

  /**
   * List all open Web3 connections.
   * Get open Web3 connections.
   * @param order List order; ascending or descending. (optional, default to ASC)
   * @param filter Parsed filter object (optional)
   * @param sort Property to sort Web3 connections by. (optional, default to createdAt)
   * @param pageSize Amount of results to return in the next page. (optional, default to 10)
   * @param next Cursor to the next page (optional)
   * @return ApiResponse&lt;GetConnectionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 400 </td><td> Query parameters were invalid </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GetConnectionsResponse> getWithHttpInfo(String order, GetFilterParameter filter, String sort, BigDecimal pageSize, String next) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "order", order)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next", next));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GetConnectionsResponse> localVarReturnType = new GenericType<GetConnectionsResponse>() {};
    return apiClient.invokeAPI("Web3ConnectionsApi.get", "/connections", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Remove an existing Web3 connection.
   * Remove a Web3 connection
   * @param id The ID of the existing Web3 connection to remove. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Connection removed successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 404 </td><td> Connection not found </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void remove(String id) throws ApiException {
    removeWithHttpInfo(id);
  }

  /**
   * Remove an existing Web3 connection.
   * Remove a Web3 connection
   * @param id The ID of the existing Web3 connection to remove. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Connection removed successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 404 </td><td> Connection not found </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling remove");
    }

    // Path parameters
    String localVarPath = "/connections/wc/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    return apiClient.invokeAPI("Web3ConnectionsApi.remove", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Respond to a pending Web3 connection request.
   * Submit a response to *approve* or *reject* an initiated Web3 connection. * Note: This call is used to complete your &#x60;POST /v1/connections/wc/&#x60; request.  After this succeeds, your new Web3 connection is created and functioning.
   * @param id The ID of the initiated Web3 connection to approve. (required)
   * @param respondToConnectionRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Connection submitted successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid data sent </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 404 </td><td> Connection not found </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void submit(String id, RespondToConnectionRequest respondToConnectionRequest) throws ApiException {
    submitWithHttpInfo(id, respondToConnectionRequest);
  }

  /**
   * Respond to a pending Web3 connection request.
   * Submit a response to *approve* or *reject* an initiated Web3 connection. * Note: This call is used to complete your &#x60;POST /v1/connections/wc/&#x60; request.  After this succeeds, your new Web3 connection is created and functioning.
   * @param id The ID of the initiated Web3 connection to approve. (required)
   * @param respondToConnectionRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Connection submitted successfully </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid data sent </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 404 </td><td> Connection not found </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 500 </td><td> Something went wrong </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> submitWithHttpInfo(String id, RespondToConnectionRequest respondToConnectionRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling submit");
    }
    if (respondToConnectionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'respondToConnectionRequest' when calling submit");
    }

    // Path parameters
    String localVarPath = "/connections/wc/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("Web3ConnectionsApi.submit", localVarPath, "PUT", new ArrayList<>(), respondToConnectionRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
