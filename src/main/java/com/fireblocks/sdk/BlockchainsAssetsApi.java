package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.fireblocks.sdk.model.AssetTypeResponse;
import com.fireblocks.sdk.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BlockchainsAssetsApi {
  private ApiClient apiClient;

  public BlockchainsAssetsApi() {
    this.apiClient = new ApiClient();
  }

  public BlockchainsAssetsApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * List all asset types supported by Fireblocks
   * Returns all asset types supported by Fireblocks.
   * @return List&lt;AssetTypeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public List<AssetTypeResponse> getSupportedAssets() throws ApiException {
    return getSupportedAssetsWithHttpInfo().getData();
  }

  /**
   * List all asset types supported by Fireblocks
   * Returns all asset types supported by Fireblocks.
   * @return ApiResponse&lt;List&lt;AssetTypeResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Transaction object </td><td>  * X-Request-ID -  <br>  </td></tr>
       <tr><td> 0 </td><td> Error Response </td><td>  * X-Request-ID -  <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<AssetTypeResponse>> getSupportedAssetsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("*/*", "application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<List<AssetTypeResponse>> localVarReturnType = new GenericType<List<AssetTypeResponse>>() {};
    return apiClient.invokeAPI("BlockchainsAssetsApi.getSupportedAssets", "/supported_assets", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
