# PaymentsCrossBorderSettlementApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createXBSettlementConfig**](PaymentsCrossBorderSettlementApi.md#createXBSettlementConfig) | **POST** /payments/xb-settlements/configs | Create a new cross-border settlement configuration |
| [**createXBSettlementFlow**](PaymentsCrossBorderSettlementApi.md#createXBSettlementFlow) | **POST** /payments/xb-settlements/flows | Create a new cross-border settlement flow |
| [**deleteXBSettlementConfig**](PaymentsCrossBorderSettlementApi.md#deleteXBSettlementConfig) | **DELETE** /payments/xb-settlements/configs/{configId} | Delete a cross-border settlement configuration |
| [**executeXBSettlementFlowAction**](PaymentsCrossBorderSettlementApi.md#executeXBSettlementFlowAction) | **POST** /payments/xb-settlements/flows/{flowId}/actions/execute | Execute cross-border settlement flow |
| [**getXBSettlementConfigById**](PaymentsCrossBorderSettlementApi.md#getXBSettlementConfigById) | **GET** /payments/xb-settlements/configs/{configId} | Get a specific cross-border settlement configuration |
| [**getXBSettlementConfigs**](PaymentsCrossBorderSettlementApi.md#getXBSettlementConfigs) | **GET** /payments/xb-settlements/configs | Get all the cross-border settlement configurations |
| [**getXBSettlementFlowById**](PaymentsCrossBorderSettlementApi.md#getXBSettlementFlowById) | **GET** /payments/xb-settlements/flows/{flowId} | Get specific cross-border settlement flow details |
| [**updateXBSettlementConfig**](PaymentsCrossBorderSettlementApi.md#updateXBSettlementConfig) | **PUT** /payments/xb-settlements/configs/{configId} | Edit a cross-border settlement configuration |



## createXBSettlementConfig

> XBSettlementConfigModel createXBSettlementConfig(xbSettlementConfigCreationRequestBody)

Create a new cross-border settlement configuration

&lt;u&gt;&lt;b&gt;Create a new cross-border settlement configuration. &lt;/u&gt;&lt;/b&gt;&lt;/br&gt;Configurations define the default assets, on-ramps, and off-ramps to use for the cross-border settlement. &lt;/br&gt;  A configuration must contain at least two steps - &#x60;ON_RAMP&#x60; and &#x60;VAULT_ACCOUNT&#x60;. &lt;/br&gt; All other steps (e.g., &#x60;OFF_RAMP&#x60;, &#x60;FIAT_DESTINATION&#x60;, etc.) are optional. &lt;/br&gt; Every step must include the &#x60;accountId&#x60; to be used, while &#x60;inputAssetId&#x60; and &#x60;outputAssetId&#x60; are optional.  If those are not provided, a default value will be used from the Corridor Settings.&lt;/br&gt; If the inputAssetId or the outputAssetId is provided for one of the objects, all assets in the objects must be consistent. For example, if the output asset of ON_RAMP is XLM_USDC_5F3T, then the input asset of the VAULT_ACCOUNT must also be XLM_USDC_5F3T..&lt;/br&gt; You can set a slippage amount for your configuration. Slippage is defined by basis points (bps). This value can be overloaded on execution. If you do not configure a slippage amount, the default slippage of 10000 bps (10%) is used. &lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsCrossBorderSettlementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        PaymentsCrossBorderSettlementApi apiInstance = new PaymentsCrossBorderSettlementApi(defaultClient);
        XBSettlementConfigCreationRequestBody xbSettlementConfigCreationRequestBody = new XBSettlementConfigCreationRequestBody(); // XBSettlementConfigCreationRequestBody | 
        try {
            XBSettlementConfigModel result = apiInstance.createXBSettlementConfig(xbSettlementConfigCreationRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsCrossBorderSettlementApi#createXBSettlementConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xbSettlementConfigCreationRequestBody** | [**XBSettlementConfigCreationRequestBody**](XBSettlementConfigCreationRequestBody.md)|  | [optional] |

### Return type

[**XBSettlementConfigModel**](XBSettlementConfigModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross-border settlement configuration created successfully |  -  |
| **400** | Error creating cross-border request |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **5XX** | Internal error. |  -  |


## createXBSettlementFlow

> XBSettlementFlowPreviewModel createXBSettlementFlow(xbSettlementCreateFlowRequestBody)

Create a new cross-border settlement flow

Create a cross-border flow (based on a cross-border configuration) with an amount to transfer.  The assetId is defined by the cross-border configuration. Creating a flow triggers a calculation of the flow estimations, including FX rates, times, and fees based on the amount provided. Creating a cross-border flow will not execute the flow.  **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsCrossBorderSettlementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        PaymentsCrossBorderSettlementApi apiInstance = new PaymentsCrossBorderSettlementApi(defaultClient);
        XBSettlementCreateFlowRequestBody xbSettlementCreateFlowRequestBody = new XBSettlementCreateFlowRequestBody(); // XBSettlementCreateFlowRequestBody | 
        try {
            XBSettlementFlowPreviewModel result = apiInstance.createXBSettlementFlow(xbSettlementCreateFlowRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsCrossBorderSettlementApi#createXBSettlementFlow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xbSettlementCreateFlowRequestBody** | [**XBSettlementCreateFlowRequestBody**](XBSettlementCreateFlowRequestBody.md)|  | [optional] |

### Return type

[**XBSettlementFlowPreviewModel**](XBSettlementFlowPreviewModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross-border settlement flow created successfully |  -  |
| **400** | Unable to create cross-border flow, invalid configuration ID. |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **5XX** | Internal error. |  -  |


## deleteXBSettlementConfig

> XBSettlementConfigModel deleteXBSettlementConfig(configId)

Delete a cross-border settlement configuration

Delete a cross-border settlement configuration. This does not delete or remove previously executed flows that used this configuration. **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsCrossBorderSettlementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        PaymentsCrossBorderSettlementApi apiInstance = new PaymentsCrossBorderSettlementApi(defaultClient);
        String configId = "074791cc-ef32-4920-8373-95efbeea66c5"; // String | The cross-border settlement configuration ID.
        try {
            XBSettlementConfigModel result = apiInstance.deleteXBSettlementConfig(configId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsCrossBorderSettlementApi#deleteXBSettlementConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **String**| The cross-border settlement configuration ID. | |

### Return type

[**XBSettlementConfigModel**](XBSettlementConfigModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross-border settlement configuration deleted successfully. Returns the deleted configuration. |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | No cross-border settlement configuration exists with the provided ID. |  -  |
| **5XX** | Internal error. |  -  |


## executeXBSettlementFlowAction

> XBSettlementFlowExecutionModel executeXBSettlementFlowAction(flowId, xbSettlementFlowExecutionRequestBody)

Execute cross-border settlement flow

Send a payment flow with &#39;flowId&#39; for execution. If a differet slippage configuraion is needed for this execution than configured in the flow configuration, the request body must define the desired slippage configuration for this execution.  **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsCrossBorderSettlementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        PaymentsCrossBorderSettlementApi apiInstance = new PaymentsCrossBorderSettlementApi(defaultClient);
        String flowId = "98fb5a8b-65ff-4f15-b89c-80910aedbfb3"; // String | The cross-border settlement flow ID.
        XBSettlementFlowExecutionRequestBody xbSettlementFlowExecutionRequestBody = new XBSettlementFlowExecutionRequestBody(); // XBSettlementFlowExecutionRequestBody | 
        try {
            XBSettlementFlowExecutionModel result = apiInstance.executeXBSettlementFlowAction(flowId, xbSettlementFlowExecutionRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsCrossBorderSettlementApi#executeXBSettlementFlowAction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **flowId** | **String**| The cross-border settlement flow ID. | |
| **xbSettlementFlowExecutionRequestBody** | [**XBSettlementFlowExecutionRequestBody**](XBSettlementFlowExecutionRequestBody.md)|  | [optional] |

### Return type

[**XBSettlementFlowExecutionModel**](XBSettlementFlowExecutionModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross-border settlement flow started to execute successfully |  -  |
| **400** | Error while trying to execute the cross-border flow |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | Invalid flowId. |  -  |
| **5XX** | Internal error. |  -  |


## getXBSettlementConfigById

> XBSettlementConfigModel getXBSettlementConfigById(configId)

Get a specific cross-border settlement configuration

Get a specific cross-border settlement configuration.&lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsCrossBorderSettlementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        PaymentsCrossBorderSettlementApi apiInstance = new PaymentsCrossBorderSettlementApi(defaultClient);
        String configId = "074791cc-ef32-4920-8373-95efbeea66c5"; // String | The cross-border settlement configuration ID.
        try {
            XBSettlementConfigModel result = apiInstance.getXBSettlementConfigById(configId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsCrossBorderSettlementApi#getXBSettlementConfigById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **String**| The cross-border settlement configuration ID. | |

### Return type

[**XBSettlementConfigModel**](XBSettlementConfigModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested cross-border settlement configuration |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | No cross-border settlement configuration exists with the provided ID. |  -  |
| **5XX** | Internal error. |  -  |


## getXBSettlementConfigs

> XBSettlementGetAllConfigsResponse getXBSettlementConfigs()

Get all the cross-border settlement configurations

Get all the cross-border settlement configurations. &lt;/br&gt; **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsCrossBorderSettlementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        PaymentsCrossBorderSettlementApi apiInstance = new PaymentsCrossBorderSettlementApi(defaultClient);
        try {
            XBSettlementGetAllConfigsResponse result = apiInstance.getXBSettlementConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsCrossBorderSettlementApi#getXBSettlementConfigs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**XBSettlementGetAllConfigsResponse**](XBSettlementGetAllConfigsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all the cross-border settlement configurations |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **5XX** | Internal error. |  -  |


## getXBSettlementFlowById

> XBSettlementGetFlowResponse getXBSettlementFlowById(flowId)

Get specific cross-border settlement flow details

Gets details for a specific cross-border settlement flow **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsCrossBorderSettlementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        PaymentsCrossBorderSettlementApi apiInstance = new PaymentsCrossBorderSettlementApi(defaultClient);
        String flowId = "98fb5a8b-65ff-4f15-b89c-80910aedbfb3"; // String | The cross-border settlement flow ID.
        try {
            XBSettlementGetFlowResponse result = apiInstance.getXBSettlementFlowById(flowId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsCrossBorderSettlementApi#getXBSettlementFlowById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **flowId** | **String**| The cross-border settlement flow ID. | |

### Return type

[**XBSettlementGetFlowResponse**](XBSettlementGetFlowResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns cross-border settlement flow details. For unexecuted flows, a preview object will return, showing the estimated time, amounts, and fees. Note that this data structure updates as the flow progresses, including the total fees (accumulated), state, and steps.  |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | Invalid flowId. |  -  |
| **5XX** | Internal error. |  -  |


## updateXBSettlementConfig

> XBSettlementConfigModel updateXBSettlementConfig(configId, xbSettlementConfigEditRequestBody)

Edit a cross-border settlement configuration

Edit a cross-border settlement configuration. Editing a configuration does not affect previously executed flows that used the configuration. **Note:** The reference content in this section documents the Payments Engine endpoint. The Payments Engine endpoint includes APIs available only for customers with the Payments Engine enabled on their accounts. These endpoints are currently in beta and might be subject to changes. If you want to learn more about the Fireblocks Payments Engine, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsCrossBorderSettlementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        PaymentsCrossBorderSettlementApi apiInstance = new PaymentsCrossBorderSettlementApi(defaultClient);
        String configId = "074791cc-ef32-4920-8373-95efbeea66c5"; // String | The cross-border settlement configuration ID.
        XBSettlementConfigEditRequestBody xbSettlementConfigEditRequestBody = new XBSettlementConfigEditRequestBody(); // XBSettlementConfigEditRequestBody | 
        try {
            XBSettlementConfigModel result = apiInstance.updateXBSettlementConfig(configId, xbSettlementConfigEditRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsCrossBorderSettlementApi#updateXBSettlementConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configId** | **String**| The cross-border settlement configuration ID. | |
| **xbSettlementConfigEditRequestBody** | [**XBSettlementConfigEditRequestBody**](XBSettlementConfigEditRequestBody.md)|  | [optional] |

### Return type

[**XBSettlementConfigModel**](XBSettlementConfigModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cross-border settlement configuration edited successfully |  -  |
| **400** | Error creating the cross-border request. Configuration not modified. |  -  |
| **401** | Unauthorized. Missing / invalid JWT token in Authorization header. |  -  |
| **404** | No cross-border settlement configuration exists with the provided ID. |  -  |
| **5XX** | Internal error. |  -  |

