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
import com.fireblocks.sdk.model.GasStationConfiguration;
import com.fireblocks.sdk.model.GasStationPropertiesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GasStationsApi {
  private ApiClient apiClient;

  public GasStationsApi() {
    this.apiClient = new ApiClient();
  }

  public GasStationsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Get gas station settings
   * Returns gas station settings and ETH balance.
   * @return GasStationPropertiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gas Station properties </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public GasStationPropertiesResponse getGasStation( RequestOptions requestOptions) throws ApiException {
     return getGasStationWithHttpInfo( requestOptions).getData();
  }

  public GasStationPropertiesResponse getGasStation() throws ApiException {
   return getGasStationWithHttpInfo( null).getData();
  }

  /**
   * Get gas station settings
   * Returns gas station settings and ETH balance.
   * @return ApiResponse&lt;GasStationPropertiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gas Station properties </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GasStationPropertiesResponse> getGasStationWithHttpInfo( RequestOptions requestOptions) throws ApiException {
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GasStationPropertiesResponse> localVarReturnType = new GenericType<GasStationPropertiesResponse>() {};
    return apiClient.invokeAPI("GasStationsApi.getGasStation", "/gas_station", "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get gas station settings by asset
   * Returns gas station settings and balances for a requested asset.
   * @param assetId The ID of the asset (required)
   * @return GasStationPropertiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gas Station properties </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public GasStationPropertiesResponse getGasStationByAssetId(String assetId,  RequestOptions requestOptions) throws ApiException {
     return getGasStationByAssetIdWithHttpInfo(assetId, requestOptions).getData();
  }

  public GasStationPropertiesResponse getGasStationByAssetId(String assetId) throws ApiException {
   return getGasStationByAssetIdWithHttpInfo(assetId, null).getData();
  }

  /**
   * Get gas station settings by asset
   * Returns gas station settings and balances for a requested asset.
   * @param assetId The ID of the asset (required)
   * @return ApiResponse&lt;GasStationPropertiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Gas Station properties </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<GasStationPropertiesResponse> getGasStationByAssetIdWithHttpInfo(String assetId, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getGasStationByAssetId");
    }

    // Path parameters
    String localVarPath = "/gas_station/{assetId}"
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GasStationPropertiesResponse> localVarReturnType = new GenericType<GasStationPropertiesResponse>() {};
    return apiClient.invokeAPI("GasStationsApi.getGasStationByAssetId", localVarPath, "GET", new ArrayList<>(), null,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Edit gas station settings
   * Configures gas station settings for ETH.
   * @param gasStationConfiguration  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void updateGasStationConfiguration(GasStationConfiguration gasStationConfiguration,  RequestOptions requestOptions) throws ApiException {
    updateGasStationConfigurationWithHttpInfo(gasStationConfiguration, requestOptions);
  }

  public void updateGasStationConfiguration(GasStationConfiguration gasStationConfiguration) throws ApiException {
  updateGasStationConfigurationWithHttpInfo(gasStationConfiguration, null);
  }

  /**
   * Edit gas station settings
   * Configures gas station settings for ETH.
   * @param gasStationConfiguration  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateGasStationConfigurationWithHttpInfo(GasStationConfiguration gasStationConfiguration, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (gasStationConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'gasStationConfiguration' when calling updateGasStationConfiguration");
    }

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = gasStationConfiguration;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("GasStationsApi.updateGasStationConfiguration", "/gas_station/configuration", "PUT", new ArrayList<>(), gasStationConfiguration,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
  /**
   * Edit gas station settings for an asset
   * Configures gas station settings for a requested asset.
   * @param assetId The ID of the asset (required)
   * @param gasStationConfiguration  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public void updateGasStationConfigurationByAssetId(String assetId, GasStationConfiguration gasStationConfiguration,  RequestOptions requestOptions) throws ApiException {
    updateGasStationConfigurationByAssetIdWithHttpInfo(assetId,gasStationConfiguration, requestOptions);
  }

  public void updateGasStationConfigurationByAssetId(String assetId, GasStationConfiguration gasStationConfiguration) throws ApiException {
  updateGasStationConfigurationByAssetIdWithHttpInfo(assetId,gasStationConfiguration, null);
  }

  /**
   * Edit gas station settings for an asset
   * Configures gas station settings for a requested asset.
   * @param assetId The ID of the asset (required)
   * @param gasStationConfiguration  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateGasStationConfigurationByAssetIdWithHttpInfo(String assetId,GasStationConfiguration gasStationConfiguration, RequestOptions requestOptions) throws ApiException {
    // Check required parameters
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling updateGasStationConfigurationByAssetId");
    }
    if (gasStationConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'gasStationConfiguration' when calling updateGasStationConfigurationByAssetId");
    }

    // Path parameters
    String localVarPath = "/gas_station/configuration/{assetId}"
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    Object _body = gasStationConfiguration;
    // Extract and set Idempotency-Key header
    Optional.ofNullable(requestOptions.getIdempotencyKey()).map(Object::toString).ifPresent(idempotencyKey -> localVarHeaderParams.put("Idempotency-Key", idempotencyKey));

    // Extract and set X-End-User-Wallet-Id header
    Optional.ofNullable(requestOptions.getNcw()).map(ncw -> ncw.getWalletId()).map(Object::toString).ifPresent(ncwWalletId -> localVarHeaderParams.put("X-End-User-Wallet-Id", ncwWalletId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("GasStationsApi.updateGasStationConfigurationByAssetId", localVarPath, "PUT", new ArrayList<>(), gasStationConfiguration,
                                localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
