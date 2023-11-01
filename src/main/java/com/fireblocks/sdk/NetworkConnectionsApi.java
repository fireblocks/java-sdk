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
import com.fireblocks.sdk.model.CheckThirdPartyRoutingForNetworkConnection200Response;
import com.fireblocks.sdk.model.CreateNetworkIdRequest;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.GetNetworkIds200ResponseInner;
import com.fireblocks.sdk.model.NetworkConnection;
import com.fireblocks.sdk.model.NetworkConnectionResponse;
import com.fireblocks.sdk.model.NetworkIdResponse;
import com.fireblocks.sdk.model.SetDiscoverabilityForNetworkIdRequest;
import com.fireblocks.sdk.model.SetNetworkIdNameRequest;
import com.fireblocks.sdk.model.SetRoutingPolicyForNetworkConnection200Response;
import com.fireblocks.sdk.model.SetRoutingPolicyForNetworkConnectionRequest;
import com.fireblocks.sdk.model.SetRoutingPolicyForNetworkIdRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkConnectionsApi {
  private ApiClient apiClient;

  public NetworkConnectionsApi() {
    this.apiClient = new ApiClient();
  }

  public NetworkConnectionsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Retrieve third-party network routing validation by asset type.
   * The Fireblocks Network allows for flexibility around incoming deposits. A receiver can receive network deposits to locations other than Fireblocks. This endpoint validates whether future transactions are routed to the displayed recipient or to a 3rd party.
   * @param connectionId The ID of the network connection (required)
   * @param assetType The destination asset type (required)
   * @return CheckThirdPartyRoutingForNetworkConnection200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> result for the validation </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public CheckThirdPartyRoutingForNetworkConnection200Response checkThirdPartyRoutingForNetworkConnection(String connectionId, String assetType,  RequestOptions requestOptions) throws ApiException {
     return checkThirdPartyRoutingForNetworkConnectionWithHttpInfo(connectionId,assetType, requestOptions).getData();
  }

  public CheckThirdPartyRoutingForNetworkConnection200Response checkThirdPartyRoutingForNetworkConnection(String connectionId, String assetType) throws ApiException {
   return checkThirdPartyRoutingForNetworkConnectionWithHttpInfo(connectionId,assetType, null).getData();
  }

  /**
   * Retrieve third-party network routing validation by asset type.
   * The Fireblocks Network allows for flexibility around incoming deposits. A receiver can receive network deposits to locations other than Fireblocks. This endpoint validates whether future transactions are routed to the displayed recipient or to a 3rd party.
   * @param connectionId The ID of the network connection (required)
   * @param assetType The destination asset type (required)
   * @return ApiResponse&lt;CheckThirdPartyRoutingForNetworkConnection200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> result for the validation </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<CheckThirdPartyRoutingForNetworkConnection200Response> checkThirdPartyRoutingForNetworkConnectionWithHttpInfo(String connectionId,String assetType, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling checkThirdPartyRoutingForNetworkConnection");
    }
    if (assetType == null) {
      throw new ApiException(400, "Missing the required parameter 'assetType' when calling checkThirdPartyRoutingForNetworkConnection");
    }

    // Path parameters
    String localVarPath = "/network_connections/{connectionId}/is_third_party_routing/{assetType}"
            .replaceAll("\\{connectionId}", apiClient.escapeString(connectionId))
            .replaceAll("\\{assetType}", apiClient.escapeString(assetType));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<CheckThirdPartyRoutingForNetworkConnection200Response> localVarReturnType = new GenericType<CheckThirdPartyRoutingForNetworkConnection200Response>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.checkThirdPartyRoutingForNetworkConnection", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Creates a new network connection
   * Initiates a new network connection.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkConnection  (optional)
   * @return NetworkConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A Network Connection object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public NetworkConnectionResponse createNetworkConnection(NetworkConnection networkConnection,  RequestOptions requestOptions) throws ApiException {
     return createNetworkConnectionWithHttpInfo(networkConnection, requestOptions).getData();
  }

  public NetworkConnectionResponse createNetworkConnection(NetworkConnection networkConnection) throws ApiException {
   return createNetworkConnectionWithHttpInfo(networkConnection, null).getData();
  }

  /**
   * Creates a new network connection
   * Initiates a new network connection.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkConnection  (optional)
   * @return ApiResponse&lt;NetworkConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> A Network Connection object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<NetworkConnectionResponse> createNetworkConnectionWithHttpInfo(NetworkConnection networkConnection, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = networkConnection;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<NetworkConnectionResponse> localVarReturnType = new GenericType<NetworkConnectionResponse>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.createNetworkConnection", "/network_connections", "POST", new ArrayList<>(), networkConnection,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Creates a new Network ID
   * Creates a new Network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param createNetworkIdRequest  (optional)
   * @return NetworkIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Returns the new network ID in your workspace </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public NetworkIdResponse createNetworkId(CreateNetworkIdRequest createNetworkIdRequest,  RequestOptions requestOptions) throws ApiException {
     return createNetworkIdWithHttpInfo(createNetworkIdRequest, requestOptions).getData();
  }

  public NetworkIdResponse createNetworkId(CreateNetworkIdRequest createNetworkIdRequest) throws ApiException {
   return createNetworkIdWithHttpInfo(createNetworkIdRequest, null).getData();
  }

  /**
   * Creates a new Network ID
   * Creates a new Network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param createNetworkIdRequest  (optional)
   * @return ApiResponse&lt;NetworkIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Returns the new network ID in your workspace </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<NetworkIdResponse> createNetworkIdWithHttpInfo(CreateNetworkIdRequest createNetworkIdRequest, RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = createNetworkIdRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<NetworkIdResponse> localVarReturnType = new GenericType<NetworkIdResponse>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.createNetworkId", "/network_ids", "POST", new ArrayList<>(), createNetworkIdRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Deletes a network connection by ID
   * Deletes an existing network connection specified by its connection ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param connectionId The ID of the network connection to delete (required)
   * @return SetRoutingPolicyForNetworkConnection200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SetRoutingPolicyForNetworkConnection200Response deleteNetworkConnection(String connectionId,  RequestOptions requestOptions) throws ApiException {
     return deleteNetworkConnectionWithHttpInfo(connectionId, requestOptions).getData();
  }

  public SetRoutingPolicyForNetworkConnection200Response deleteNetworkConnection(String connectionId) throws ApiException {
   return deleteNetworkConnectionWithHttpInfo(connectionId, null).getData();
  }

  /**
   * Deletes a network connection by ID
   * Deletes an existing network connection specified by its connection ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param connectionId The ID of the network connection to delete (required)
   * @return ApiResponse&lt;SetRoutingPolicyForNetworkConnection200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetRoutingPolicyForNetworkConnection200Response> deleteNetworkConnectionWithHttpInfo(String connectionId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling deleteNetworkConnection");
    }

    // Path parameters
    String localVarPath = "/network_connections/{connectionId}"
            .replaceAll("\\{connectionId}", apiClient.escapeString(connectionId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SetRoutingPolicyForNetworkConnection200Response> localVarReturnType = new GenericType<SetRoutingPolicyForNetworkConnection200Response>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.deleteNetworkConnection", localVarPath, "DELETE", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Deletes specific network ID.
   * Deletes a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @return SetRoutingPolicyForNetworkConnection200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SetRoutingPolicyForNetworkConnection200Response deleteNetworkId(String networkId,  RequestOptions requestOptions) throws ApiException {
     return deleteNetworkIdWithHttpInfo(networkId, requestOptions).getData();
  }

  public SetRoutingPolicyForNetworkConnection200Response deleteNetworkId(String networkId) throws ApiException {
   return deleteNetworkIdWithHttpInfo(networkId, null).getData();
  }

  /**
   * Deletes specific network ID.
   * Deletes a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @return ApiResponse&lt;SetRoutingPolicyForNetworkConnection200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetRoutingPolicyForNetworkConnection200Response> deleteNetworkIdWithHttpInfo(String networkId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (networkId == null) {
      throw new ApiException(400, "Missing the required parameter 'networkId' when calling deleteNetworkId");
    }

    // Path parameters
    String localVarPath = "/network_ids/{networkId}"
            .replaceAll("\\{networkId}", apiClient.escapeString(networkId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<SetRoutingPolicyForNetworkConnection200Response> localVarReturnType = new GenericType<SetRoutingPolicyForNetworkConnection200Response>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.deleteNetworkId", localVarPath, "DELETE", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get a network connection
   * Gets a network connection by ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param connectionId The ID of the connection (required)
   * @return NetworkConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A network connection </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public NetworkConnectionResponse getNetworkConnectionById(String connectionId,  RequestOptions requestOptions) throws ApiException {
     return getNetworkConnectionByIdWithHttpInfo(connectionId, requestOptions).getData();
  }

  public NetworkConnectionResponse getNetworkConnectionById(String connectionId) throws ApiException {
   return getNetworkConnectionByIdWithHttpInfo(connectionId, null).getData();
  }

  /**
   * Get a network connection
   * Gets a network connection by ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param connectionId The ID of the connection (required)
   * @return ApiResponse&lt;NetworkConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A network connection </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<NetworkConnectionResponse> getNetworkConnectionByIdWithHttpInfo(String connectionId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling getNetworkConnectionById");
    }

    // Path parameters
    String localVarPath = "/network_connections/{connectionId}"
            .replaceAll("\\{connectionId}", apiClient.escapeString(connectionId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<NetworkConnectionResponse> localVarReturnType = new GenericType<NetworkConnectionResponse>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.getNetworkConnectionById", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * List network connections
   * Returns all network connections.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @return List&lt;NetworkConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of network connections </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<NetworkConnectionResponse> getNetworkConnections( RequestOptions requestOptions) throws ApiException {
     return getNetworkConnectionsWithHttpInfo( requestOptions).getData();
  }

  public List<NetworkConnectionResponse> getNetworkConnections() throws ApiException {
   return getNetworkConnectionsWithHttpInfo( null).getData();
  }

  /**
   * List network connections
   * Returns all network connections.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @return ApiResponse&lt;List&lt;NetworkConnectionResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of network connections </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<NetworkConnectionResponse>> getNetworkConnectionsWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<NetworkConnectionResponse>> localVarReturnType = new GenericType<List<NetworkConnectionResponse>>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.getNetworkConnections", "/network_connections", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns specific network ID.
   * Retrieves a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @return NetworkIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public NetworkIdResponse getNetworkIdById(String networkId,  RequestOptions requestOptions) throws ApiException {
     return getNetworkIdByIdWithHttpInfo(networkId, requestOptions).getData();
  }

  public NetworkIdResponse getNetworkIdById(String networkId) throws ApiException {
   return getNetworkIdByIdWithHttpInfo(networkId, null).getData();
  }

  /**
   * Returns specific network ID.
   * Retrieves a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @return ApiResponse&lt;NetworkIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<NetworkIdResponse> getNetworkIdByIdWithHttpInfo(String networkId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (networkId == null) {
      throw new ApiException(400, "Missing the required parameter 'networkId' when calling getNetworkIdById");
    }

    // Path parameters
    String localVarPath = "/network_ids/{networkId}"
            .replaceAll("\\{networkId}", apiClient.escapeString(networkId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<NetworkIdResponse> localVarReturnType = new GenericType<NetworkIdResponse>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.getNetworkIdById", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns all network IDs, both local IDs and discoverable remote IDs
   * Retrieves a list of all local and discoverable remote network IDs.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @return List&lt;GetNetworkIds200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of network IDs </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<GetNetworkIds200ResponseInner> getNetworkIds( RequestOptions requestOptions) throws ApiException {
     return getNetworkIdsWithHttpInfo( requestOptions).getData();
  }

  public List<GetNetworkIds200ResponseInner> getNetworkIds() throws ApiException {
   return getNetworkIdsWithHttpInfo( null).getData();
  }

  /**
   * Returns all network IDs, both local IDs and discoverable remote IDs
   * Retrieves a list of all local and discoverable remote network IDs.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @return ApiResponse&lt;List&lt;GetNetworkIds200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of network IDs </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<GetNetworkIds200ResponseInner>> getNetworkIdsWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<GetNetworkIds200ResponseInner>> localVarReturnType = new GenericType<List<GetNetworkIds200ResponseInner>>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.getNetworkIds", "/network_ids", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update network ID&#39;s discoverability.
   * Update whether or not the network ID is discoverable by others.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @param setDiscoverabilityForNetworkIdRequest  (required)
   * @return SetRoutingPolicyForNetworkConnection200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SetRoutingPolicyForNetworkConnection200Response setDiscoverabilityForNetworkId(String networkId, SetDiscoverabilityForNetworkIdRequest setDiscoverabilityForNetworkIdRequest,  RequestOptions requestOptions) throws ApiException {
     return setDiscoverabilityForNetworkIdWithHttpInfo(networkId,setDiscoverabilityForNetworkIdRequest, requestOptions).getData();
  }

  public SetRoutingPolicyForNetworkConnection200Response setDiscoverabilityForNetworkId(String networkId, SetDiscoverabilityForNetworkIdRequest setDiscoverabilityForNetworkIdRequest) throws ApiException {
   return setDiscoverabilityForNetworkIdWithHttpInfo(networkId,setDiscoverabilityForNetworkIdRequest, null).getData();
  }

  /**
   * Update network ID&#39;s discoverability.
   * Update whether or not the network ID is discoverable by others.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @param setDiscoverabilityForNetworkIdRequest  (required)
   * @return ApiResponse&lt;SetRoutingPolicyForNetworkConnection200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetRoutingPolicyForNetworkConnection200Response> setDiscoverabilityForNetworkIdWithHttpInfo(String networkId,SetDiscoverabilityForNetworkIdRequest setDiscoverabilityForNetworkIdRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (networkId == null) {
      throw new ApiException(400, "Missing the required parameter 'networkId' when calling setDiscoverabilityForNetworkId");
    }
    if (setDiscoverabilityForNetworkIdRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setDiscoverabilityForNetworkIdRequest' when calling setDiscoverabilityForNetworkId");
    }

    // Path parameters
    String localVarPath = "/network_ids/{networkId}/set_discoverability"
            .replaceAll("\\{networkId}", apiClient.escapeString(networkId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setDiscoverabilityForNetworkIdRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SetRoutingPolicyForNetworkConnection200Response> localVarReturnType = new GenericType<SetRoutingPolicyForNetworkConnection200Response>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.setDiscoverabilityForNetworkId", localVarPath, "PATCH", new ArrayList<>(), setDiscoverabilityForNetworkIdRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update network ID&#39;s name.
   * Updates name of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @param setNetworkIdNameRequest  (required)
   * @return SetRoutingPolicyForNetworkConnection200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SetRoutingPolicyForNetworkConnection200Response setNetworkIdName(String networkId, SetNetworkIdNameRequest setNetworkIdNameRequest,  RequestOptions requestOptions) throws ApiException {
     return setNetworkIdNameWithHttpInfo(networkId,setNetworkIdNameRequest, requestOptions).getData();
  }

  public SetRoutingPolicyForNetworkConnection200Response setNetworkIdName(String networkId, SetNetworkIdNameRequest setNetworkIdNameRequest) throws ApiException {
   return setNetworkIdNameWithHttpInfo(networkId,setNetworkIdNameRequest, null).getData();
  }

  /**
   * Update network ID&#39;s name.
   * Updates name of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @param setNetworkIdNameRequest  (required)
   * @return ApiResponse&lt;SetRoutingPolicyForNetworkConnection200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetRoutingPolicyForNetworkConnection200Response> setNetworkIdNameWithHttpInfo(String networkId,SetNetworkIdNameRequest setNetworkIdNameRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (networkId == null) {
      throw new ApiException(400, "Missing the required parameter 'networkId' when calling setNetworkIdName");
    }
    if (setNetworkIdNameRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setNetworkIdNameRequest' when calling setNetworkIdName");
    }

    // Path parameters
    String localVarPath = "/network_ids/{networkId}/set_name"
            .replaceAll("\\{networkId}", apiClient.escapeString(networkId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setNetworkIdNameRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SetRoutingPolicyForNetworkConnection200Response> localVarReturnType = new GenericType<SetRoutingPolicyForNetworkConnection200Response>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.setNetworkIdName", localVarPath, "PATCH", new ArrayList<>(), setNetworkIdNameRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update network connection routing policy.
   * Updates an existing network connection&#39;s routing policy.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param connectionId The ID of the network connection (required)
   * @param setRoutingPolicyForNetworkConnectionRequest  (optional)
   * @return SetRoutingPolicyForNetworkConnection200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SetRoutingPolicyForNetworkConnection200Response setRoutingPolicyForNetworkConnection(String connectionId, SetRoutingPolicyForNetworkConnectionRequest setRoutingPolicyForNetworkConnectionRequest,  RequestOptions requestOptions) throws ApiException {
     return setRoutingPolicyForNetworkConnectionWithHttpInfo(connectionId,setRoutingPolicyForNetworkConnectionRequest, requestOptions).getData();
  }

  public SetRoutingPolicyForNetworkConnection200Response setRoutingPolicyForNetworkConnection(String connectionId, SetRoutingPolicyForNetworkConnectionRequest setRoutingPolicyForNetworkConnectionRequest) throws ApiException {
   return setRoutingPolicyForNetworkConnectionWithHttpInfo(connectionId,setRoutingPolicyForNetworkConnectionRequest, null).getData();
  }

  /**
   * Update network connection routing policy.
   * Updates an existing network connection&#39;s routing policy.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param connectionId The ID of the network connection (required)
   * @param setRoutingPolicyForNetworkConnectionRequest  (optional)
   * @return ApiResponse&lt;SetRoutingPolicyForNetworkConnection200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetRoutingPolicyForNetworkConnection200Response> setRoutingPolicyForNetworkConnectionWithHttpInfo(String connectionId,SetRoutingPolicyForNetworkConnectionRequest setRoutingPolicyForNetworkConnectionRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling setRoutingPolicyForNetworkConnection");
    }

    // Path parameters
    String localVarPath = "/network_connections/{connectionId}/set_routing_policy"
            .replaceAll("\\{connectionId}", apiClient.escapeString(connectionId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setRoutingPolicyForNetworkConnectionRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SetRoutingPolicyForNetworkConnection200Response> localVarReturnType = new GenericType<SetRoutingPolicyForNetworkConnection200Response>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.setRoutingPolicyForNetworkConnection", localVarPath, "PATCH", new ArrayList<>(), setRoutingPolicyForNetworkConnectionRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Update network id routing policy.
   * Updates the routing policy of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @param setRoutingPolicyForNetworkIdRequest  (optional)
   * @return SetRoutingPolicyForNetworkConnection200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public SetRoutingPolicyForNetworkConnection200Response setRoutingPolicyForNetworkId(String networkId, SetRoutingPolicyForNetworkIdRequest setRoutingPolicyForNetworkIdRequest,  RequestOptions requestOptions) throws ApiException {
     return setRoutingPolicyForNetworkIdWithHttpInfo(networkId,setRoutingPolicyForNetworkIdRequest, requestOptions).getData();
  }

  public SetRoutingPolicyForNetworkConnection200Response setRoutingPolicyForNetworkId(String networkId, SetRoutingPolicyForNetworkIdRequest setRoutingPolicyForNetworkIdRequest) throws ApiException {
   return setRoutingPolicyForNetworkIdWithHttpInfo(networkId,setRoutingPolicyForNetworkIdRequest, null).getData();
  }

  /**
   * Update network id routing policy.
   * Updates the routing policy of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 
   * @param networkId The ID of the network (required)
   * @param setRoutingPolicyForNetworkIdRequest  (optional)
   * @return ApiResponse&lt;SetRoutingPolicyForNetworkConnection200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Network ID </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<SetRoutingPolicyForNetworkConnection200Response> setRoutingPolicyForNetworkIdWithHttpInfo(String networkId,SetRoutingPolicyForNetworkIdRequest setRoutingPolicyForNetworkIdRequest, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (networkId == null) {
      throw new ApiException(400, "Missing the required parameter 'networkId' when calling setRoutingPolicyForNetworkId");
    }

    // Path parameters
    String localVarPath = "/network_ids/{networkId}/set_routing_policy"
            .replaceAll("\\{networkId}", apiClient.escapeString(networkId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = setRoutingPolicyForNetworkIdRequest;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SetRoutingPolicyForNetworkConnection200Response> localVarReturnType = new GenericType<SetRoutingPolicyForNetworkConnection200Response>() {};
    return apiClient.invokeAPI("NetworkConnectionsApi.setRoutingPolicyForNetworkId", localVarPath, "PATCH", new ArrayList<>(), setRoutingPolicyForNetworkIdRequest,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
