package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

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
  public GasStationPropertiesResponse getGasStation() throws ApiException {
    return getGasStationWithHttpInfo().getData();
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
  public ApiResponse<GasStationPropertiesResponse> getGasStationWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GasStationPropertiesResponse> localVarReturnType = new GenericType<GasStationPropertiesResponse>() {};
    return apiClient.invokeAPI("GasStationsApi.getGasStation", "/gas_station", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public GasStationPropertiesResponse getGasStationByAssetId(String assetId) throws ApiException {
    return getGasStationByAssetIdWithHttpInfo(assetId).getData();
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
  public ApiResponse<GasStationPropertiesResponse> getGasStationByAssetIdWithHttpInfo(String assetId) throws ApiException {
    // Check required parameters
    if (assetId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetId' when calling getGasStationByAssetId");
    }

    // Path parameters
    String localVarPath = "/gas_station/{assetId}"
            .replaceAll("\\{assetId}", apiClient.escapeString(assetId));

    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<GasStationPropertiesResponse> localVarReturnType = new GenericType<GasStationPropertiesResponse>() {};
    return apiClient.invokeAPI("GasStationsApi.getGasStationByAssetId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public void updateGasStationConfiguration(GasStationConfiguration gasStationConfiguration) throws ApiException {
    updateGasStationConfigurationWithHttpInfo(gasStationConfiguration);
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
  public ApiResponse<Void> updateGasStationConfigurationWithHttpInfo(GasStationConfiguration gasStationConfiguration) throws ApiException {
    // Check required parameters
    if (gasStationConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'gasStationConfiguration' when calling updateGasStationConfiguration");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("GasStationsApi.updateGasStationConfiguration", "/gas_station/configuration", "PUT", new ArrayList<>(), gasStationConfiguration,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public void updateGasStationConfigurationByAssetId(String assetId, GasStationConfiguration gasStationConfiguration) throws ApiException {
    updateGasStationConfigurationByAssetIdWithHttpInfo(assetId, gasStationConfiguration);
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
  public ApiResponse<Void> updateGasStationConfigurationByAssetIdWithHttpInfo(String assetId, GasStationConfiguration gasStationConfiguration) throws ApiException {
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

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    return apiClient.invokeAPI("GasStationsApi.updateGasStationConfigurationByAssetId", localVarPath, "PUT", new ArrayList<>(), gasStationConfiguration,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, null, false);
  }
}
