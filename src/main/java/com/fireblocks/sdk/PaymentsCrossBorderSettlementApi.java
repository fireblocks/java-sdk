package com.fireblocks.sdk;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.fireblocks.sdk.model.ErrorResponse;
import com.fireblocks.sdk.model.XBSettlementConfigCreationRequestBody;
import com.fireblocks.sdk.model.XBSettlementConfigEditRequestBody;
import com.fireblocks.sdk.model.XBSettlementConfigModel;
import com.fireblocks.sdk.model.XBSettlementCreateFlowRequestBody;
import com.fireblocks.sdk.model.XBSettlementFlowExecutionModel;
import com.fireblocks.sdk.model.XBSettlementFlowExecutionRequestBody;
import com.fireblocks.sdk.model.XBSettlementFlowPreviewModel;
import com.fireblocks.sdk.model.XBSettlementGetAllConfigsResponse;
import com.fireblocks.sdk.model.XBSettlementGetFlowResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentsCrossBorderSettlementApi {
  private ApiClient apiClient;

  public PaymentsCrossBorderSettlementApi() {
    this.apiClient = new ApiClient();
  }

  public PaymentsCrossBorderSettlementApi(Configuration config) {
    this.apiClient = new ApiClient(config);
  }

  /**
   * Create a new cross-border settlement configuration
   * &lt;u&gt;&lt;b&gt;Create a new cross-border settlement configuration. &lt;/u&gt;&lt;/b&gt;&lt;/br&gt;Configurations define the default assets, on-ramps, and off-ramps to use for the cross-border settlement. &lt;/br&gt;  A configuration must contain at least two steps - &#x60;ON_RAMP&#x60; and &#x60;VAULT_ACCOUNT&#x60;. &lt;/br&gt; All other steps (e.g., &#x60;OFF_RAMP&#x60;, &#x60;FIAT_DESTINATION&#x60;, etc.) are optional. &lt;/br&gt; Every step must include the &#x60;accountId&#x60; to be used, while &#x60;inputAssetId&#x60; and &#x60;outputAssetId&#x60; are optional.  If those are not provided, a default value will be used from the Corridor Settings.&lt;/br&gt; If the inputAssetId or the outputAssetId is provided for one of the objects, all assets in the objects must be consistent. For example, if the output asset of ON_RAMP is XLM_USDC_5F3T, then the input asset of the VAULT_ACCOUNT must also be XLM_USDC_5F3T..&lt;/br&gt; You can set a slippage amount for your configuration. Slippage is defined by basis points (bps). This value can be overloaded on execution. If you do not configure a slippage amount, the default slippage of 10000 bps (10%) is used. &lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param xbSettlementConfigCreationRequestBody  (optional)
   * @return XBSettlementConfigModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement configuration created successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Error creating cross-border request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public XBSettlementConfigModel createXBSettlementConfig(XBSettlementConfigCreationRequestBody xbSettlementConfigCreationRequestBody) throws ApiException {
    return createXBSettlementConfigWithHttpInfo(xbSettlementConfigCreationRequestBody).getData();
  }

  /**
   * Create a new cross-border settlement configuration
   * &lt;u&gt;&lt;b&gt;Create a new cross-border settlement configuration. &lt;/u&gt;&lt;/b&gt;&lt;/br&gt;Configurations define the default assets, on-ramps, and off-ramps to use for the cross-border settlement. &lt;/br&gt;  A configuration must contain at least two steps - &#x60;ON_RAMP&#x60; and &#x60;VAULT_ACCOUNT&#x60;. &lt;/br&gt; All other steps (e.g., &#x60;OFF_RAMP&#x60;, &#x60;FIAT_DESTINATION&#x60;, etc.) are optional. &lt;/br&gt; Every step must include the &#x60;accountId&#x60; to be used, while &#x60;inputAssetId&#x60; and &#x60;outputAssetId&#x60; are optional.  If those are not provided, a default value will be used from the Corridor Settings.&lt;/br&gt; If the inputAssetId or the outputAssetId is provided for one of the objects, all assets in the objects must be consistent. For example, if the output asset of ON_RAMP is XLM_USDC_5F3T, then the input asset of the VAULT_ACCOUNT must also be XLM_USDC_5F3T..&lt;/br&gt; You can set a slippage amount for your configuration. Slippage is defined by basis points (bps). This value can be overloaded on execution. If you do not configure a slippage amount, the default slippage of 10000 bps (10%) is used. &lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param xbSettlementConfigCreationRequestBody  (optional)
   * @return ApiResponse&lt;XBSettlementConfigModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement configuration created successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Error creating cross-border request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XBSettlementConfigModel> createXBSettlementConfigWithHttpInfo(XBSettlementConfigCreationRequestBody xbSettlementConfigCreationRequestBody) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<XBSettlementConfigModel> localVarReturnType = new GenericType<XBSettlementConfigModel>() {};
    return apiClient.invokeAPI("PaymentsCrossBorderSettlementApi.createXBSettlementConfig", "/payments/xb-settlements/configs", "POST", new ArrayList<>(), xbSettlementConfigCreationRequestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Create a new cross-border settlement flow
   * Create a cross-border flow (based on a cross-border configuration) with an amount to transfer.  The assetId is defined by the cross-border configuration. Creating a flow triggers a calculation of the flow estimations, including FX rates, times, and fees based on the amount provided. Creating a cross-border flow will not execute the flow.  **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param xbSettlementCreateFlowRequestBody  (optional)
   * @return XBSettlementFlowPreviewModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement flow created successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unable to create cross-border flow, invalid configuration ID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public XBSettlementFlowPreviewModel createXBSettlementFlow(XBSettlementCreateFlowRequestBody xbSettlementCreateFlowRequestBody) throws ApiException {
    return createXBSettlementFlowWithHttpInfo(xbSettlementCreateFlowRequestBody).getData();
  }

  /**
   * Create a new cross-border settlement flow
   * Create a cross-border flow (based on a cross-border configuration) with an amount to transfer.  The assetId is defined by the cross-border configuration. Creating a flow triggers a calculation of the flow estimations, including FX rates, times, and fees based on the amount provided. Creating a cross-border flow will not execute the flow.  **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param xbSettlementCreateFlowRequestBody  (optional)
   * @return ApiResponse&lt;XBSettlementFlowPreviewModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement flow created successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unable to create cross-border flow, invalid configuration ID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XBSettlementFlowPreviewModel> createXBSettlementFlowWithHttpInfo(XBSettlementCreateFlowRequestBody xbSettlementCreateFlowRequestBody) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<XBSettlementFlowPreviewModel> localVarReturnType = new GenericType<XBSettlementFlowPreviewModel>() {};
    return apiClient.invokeAPI("PaymentsCrossBorderSettlementApi.createXBSettlementFlow", "/payments/xb-settlements/flows", "POST", new ArrayList<>(), xbSettlementCreateFlowRequestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Delete a cross-border settlement configuration
   * Delete a cross-border settlement configuration. This does not delete or remove previously executed flows that used this configuration. **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param configId The cross-border settlement configuration ID. (required)
   * @return XBSettlementConfigModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement configuration deleted successfully. Returns the deleted configuration. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No cross-border settlement configuration exists with the provided ID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public XBSettlementConfigModel deleteXBSettlementConfig(String configId) throws ApiException {
    return deleteXBSettlementConfigWithHttpInfo(configId).getData();
  }

  /**
   * Delete a cross-border settlement configuration
   * Delete a cross-border settlement configuration. This does not delete or remove previously executed flows that used this configuration. **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param configId The cross-border settlement configuration ID. (required)
   * @return ApiResponse&lt;XBSettlementConfigModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement configuration deleted successfully. Returns the deleted configuration. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No cross-border settlement configuration exists with the provided ID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XBSettlementConfigModel> deleteXBSettlementConfigWithHttpInfo(String configId) throws ApiException {
    // Check required parameters
    if (configId == null) {
      throw new ApiException(400, "Missing the required parameter 'configId' when calling deleteXBSettlementConfig");
    }

    // Path parameters
    String localVarPath = "/payments/xb-settlements/configs/{configId}"
            .replaceAll("\\{configId}", apiClient.escapeString(configId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<XBSettlementConfigModel> localVarReturnType = new GenericType<XBSettlementConfigModel>() {};
    return apiClient.invokeAPI("PaymentsCrossBorderSettlementApi.deleteXBSettlementConfig", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Execute cross-border settlement flow
   * Send a payment flow with &#39;flowId&#39; for execution. If a differet slippage configuraion is needed for this execution than configured in the flow configuration, the request body must define the desired slippage configuration for this execution.  **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param flowId The cross-border settlement flow ID. (required)
   * @param xbSettlementFlowExecutionRequestBody  (optional)
   * @return XBSettlementFlowExecutionModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement flow started to execute successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Error while trying to execute the cross-border flow </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Invalid flowId. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public XBSettlementFlowExecutionModel executeXBSettlementFlowAction(String flowId, XBSettlementFlowExecutionRequestBody xbSettlementFlowExecutionRequestBody) throws ApiException {
    return executeXBSettlementFlowActionWithHttpInfo(flowId, xbSettlementFlowExecutionRequestBody).getData();
  }

  /**
   * Execute cross-border settlement flow
   * Send a payment flow with &#39;flowId&#39; for execution. If a differet slippage configuraion is needed for this execution than configured in the flow configuration, the request body must define the desired slippage configuration for this execution.  **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param flowId The cross-border settlement flow ID. (required)
   * @param xbSettlementFlowExecutionRequestBody  (optional)
   * @return ApiResponse&lt;XBSettlementFlowExecutionModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement flow started to execute successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Error while trying to execute the cross-border flow </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Invalid flowId. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XBSettlementFlowExecutionModel> executeXBSettlementFlowActionWithHttpInfo(String flowId, XBSettlementFlowExecutionRequestBody xbSettlementFlowExecutionRequestBody) throws ApiException {
    // Check required parameters
    if (flowId == null) {
      throw new ApiException(400, "Missing the required parameter 'flowId' when calling executeXBSettlementFlowAction");
    }

    // Path parameters
    String localVarPath = "/payments/xb-settlements/flows/{flowId}/actions/execute"
            .replaceAll("\\{flowId}", apiClient.escapeString(flowId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<XBSettlementFlowExecutionModel> localVarReturnType = new GenericType<XBSettlementFlowExecutionModel>() {};
    return apiClient.invokeAPI("PaymentsCrossBorderSettlementApi.executeXBSettlementFlowAction", localVarPath, "POST", new ArrayList<>(), xbSettlementFlowExecutionRequestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get a specific cross-border settlement configuration
   * Get a specific cross-border settlement configuration.&lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param configId The cross-border settlement configuration ID. (required)
   * @return XBSettlementConfigModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the requested cross-border settlement configuration </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No cross-border settlement configuration exists with the provided ID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public XBSettlementConfigModel getXBSettlementConfigById(String configId) throws ApiException {
    return getXBSettlementConfigByIdWithHttpInfo(configId).getData();
  }

  /**
   * Get a specific cross-border settlement configuration
   * Get a specific cross-border settlement configuration.&lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param configId The cross-border settlement configuration ID. (required)
   * @return ApiResponse&lt;XBSettlementConfigModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns the requested cross-border settlement configuration </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No cross-border settlement configuration exists with the provided ID. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XBSettlementConfigModel> getXBSettlementConfigByIdWithHttpInfo(String configId) throws ApiException {
    // Check required parameters
    if (configId == null) {
      throw new ApiException(400, "Missing the required parameter 'configId' when calling getXBSettlementConfigById");
    }

    // Path parameters
    String localVarPath = "/payments/xb-settlements/configs/{configId}"
            .replaceAll("\\{configId}", apiClient.escapeString(configId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<XBSettlementConfigModel> localVarReturnType = new GenericType<XBSettlementConfigModel>() {};
    return apiClient.invokeAPI("PaymentsCrossBorderSettlementApi.getXBSettlementConfigById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get all the cross-border settlement configurations
   * Get all the cross-border settlement configurations. &lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @return XBSettlementGetAllConfigsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns all the cross-border settlement configurations </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public XBSettlementGetAllConfigsResponse getXBSettlementConfigs() throws ApiException {
    return getXBSettlementConfigsWithHttpInfo().getData();
  }

  /**
   * Get all the cross-border settlement configurations
   * Get all the cross-border settlement configurations. &lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @return ApiResponse&lt;XBSettlementGetAllConfigsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns all the cross-border settlement configurations </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XBSettlementGetAllConfigsResponse> getXBSettlementConfigsWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<XBSettlementGetAllConfigsResponse> localVarReturnType = new GenericType<XBSettlementGetAllConfigsResponse>() {};
    return apiClient.invokeAPI("PaymentsCrossBorderSettlementApi.getXBSettlementConfigs", "/payments/xb-settlements/configs", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Get specific cross-border settlement flow details
   * Gets details for a specific cross-border settlement flow **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param flowId The cross-border settlement flow ID. (required)
   * @return XBSettlementGetFlowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns cross-border settlement flow details. For unexecuted flows, a preview object will return, showing the estimated time, amounts, and fees. Note that this data structure updates as the flow progresses, including the total fees (accumulated), state, and steps.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Invalid flowId. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public XBSettlementGetFlowResponse getXBSettlementFlowById(String flowId) throws ApiException {
    return getXBSettlementFlowByIdWithHttpInfo(flowId).getData();
  }

  /**
   * Get specific cross-border settlement flow details
   * Gets details for a specific cross-border settlement flow **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param flowId The cross-border settlement flow ID. (required)
   * @return ApiResponse&lt;XBSettlementGetFlowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns cross-border settlement flow details. For unexecuted flows, a preview object will return, showing the estimated time, amounts, and fees. Note that this data structure updates as the flow progresses, including the total fees (accumulated), state, and steps.  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Invalid flowId. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XBSettlementGetFlowResponse> getXBSettlementFlowByIdWithHttpInfo(String flowId) throws ApiException {
    // Check required parameters
    if (flowId == null) {
      throw new ApiException(400, "Missing the required parameter 'flowId' when calling getXBSettlementFlowById");
    }

    // Path parameters
    String localVarPath = "/payments/xb-settlements/flows/{flowId}"
            .replaceAll("\\{flowId}", apiClient.escapeString(flowId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<XBSettlementGetFlowResponse> localVarReturnType = new GenericType<XBSettlementGetFlowResponse>() {};
    return apiClient.invokeAPI("PaymentsCrossBorderSettlementApi.getXBSettlementFlowById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Edit a cross-border settlement configuration
   * Edit a cross-border settlement configuration. Editing a configuration does not affect previously executed flows that used the configuration. **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param configId The cross-border settlement configuration ID. (required)
   * @param xbSettlementConfigEditRequestBody  (optional)
   * @return XBSettlementConfigModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement configuration edited successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No cross-border settlement configuration exists with the provided ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Error creating the cross-border request. Configuration not modified. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public XBSettlementConfigModel updateXBSettlementConfig(String configId, XBSettlementConfigEditRequestBody xbSettlementConfigEditRequestBody) throws ApiException {
    return updateXBSettlementConfigWithHttpInfo(configId, xbSettlementConfigEditRequestBody).getData();
  }

  /**
   * Edit a cross-border settlement configuration
   * Edit a cross-border settlement configuration. Editing a configuration does not affect previously executed flows that used the configuration. **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 
   * @param configId The cross-border settlement configuration ID. (required)
   * @param xbSettlementConfigEditRequestBody  (optional)
   * @return ApiResponse&lt;XBSettlementConfigModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Cross-border settlement configuration edited successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> No cross-border settlement configuration exists with the provided ID. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Error creating the cross-border request. Configuration not modified. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. Missing / invalid JWT token in Authorization header. </td><td>  -  </td></tr>
       <tr><td> 5XX </td><td> Internal error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XBSettlementConfigModel> updateXBSettlementConfigWithHttpInfo(String configId, XBSettlementConfigEditRequestBody xbSettlementConfigEditRequestBody) throws ApiException {
    // Check required parameters
    if (configId == null) {
      throw new ApiException(400, "Missing the required parameter 'configId' when calling updateXBSettlementConfig");
    }

    // Path parameters
    String localVarPath = "/payments/xb-settlements/configs/{configId}"
            .replaceAll("\\{configId}", apiClient.escapeString(configId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<XBSettlementConfigModel> localVarReturnType = new GenericType<XBSettlementConfigModel>() {};
    return apiClient.invokeAPI("PaymentsCrossBorderSettlementApi.updateXBSettlementConfig", localVarPath, "PUT", new ArrayList<>(), xbSettlementConfigEditRequestBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
