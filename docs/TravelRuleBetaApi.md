# TravelRuleBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVASPByDID**](TravelRuleBetaApi.md#getVASPByDID) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details |
| [**getVASPs**](TravelRuleBetaApi.md#getVASPs) | **GET** /screening/travel_rule/vasp | Get All VASPs |
| [**travelRuleApiControllerUpdateVasp**](TravelRuleBetaApi.md#travelRuleApiControllerUpdateVasp) | **PUT** /screeening/travel_rule/vasp/update | Add jsonDidKey to VASP details |
| [**validateFullTravelRuleTransaction**](TravelRuleBetaApi.md#validateFullTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction |
| [**validateTravelRuleTransaction**](TravelRuleBetaApi.md#validateTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate | Validate Travel Rule Transaction |



## getVASPByDID

> TravelRuleVASP getVASPByDID(did, fields)

Get VASP details

Get VASP Details.  Returns information about a VASP that has the specified DID.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TravelRuleBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        String did = "did_example"; // String | 
        String fields = "fields_example"; // String | CSV of fields to return (all, \"blank\" or see list of all field names below)
        try {
            TravelRuleVASP result = apiInstance.getVASPByDID(did, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#getVASPByDID");
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
| **did** | **String**|  | |
| **fields** | **String**| CSV of fields to return (all, \&quot;blank\&quot; or see list of all field names below) | [optional] |

### Return type

[**TravelRuleVASP**](TravelRuleVASP.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction validated successfully |  -  |
| **400** | Invalid request body |  -  |
| **500** | Internal server error |  -  |


## getVASPs

> TravelRuleGetAllVASPsResponse getVASPs(order, perPage, page, fields)

Get All VASPs

Get All VASPs.  Returns a list of VASPs. VASPs can be searched and sorted and results are paginated.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TravelRuleBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        String order = "order_example"; // String | Field to order by
        BigDecimal perPage = new BigDecimal(78); // BigDecimal | Records per page
        BigDecimal page = new BigDecimal(78); // BigDecimal | Page number
        String fields = "fields_example"; // String | CSV of fields to return (all, \"blank\" or see list of all field names below)
        try {
            TravelRuleGetAllVASPsResponse result = apiInstance.getVASPs(order, perPage, page, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#getVASPs");
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
| **order** | **String**| Field to order by | [optional] |
| **perPage** | **BigDecimal**| Records per page | [optional] |
| **page** | **BigDecimal**| Page number | [optional] |
| **fields** | **String**| CSV of fields to return (all, \&quot;blank\&quot; or see list of all field names below) | [optional] |

### Return type

[**TravelRuleGetAllVASPsResponse**](TravelRuleGetAllVASPsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all VASPs |  -  |


## travelRuleApiControllerUpdateVasp

> TravelRuleUpdateVASPDetails travelRuleApiControllerUpdateVasp(travelRuleUpdateVASPDetails)

Add jsonDidKey to VASP details

Update VASP Details.  Updates a VASP with the provided parameters. Use this endpoint to add your public jsonDIDkey generated by Notabene.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TravelRuleBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails = new TravelRuleUpdateVASPDetails(); // TravelRuleUpdateVASPDetails | 
        try {
            TravelRuleUpdateVASPDetails result = apiInstance.travelRuleApiControllerUpdateVasp(travelRuleUpdateVASPDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#travelRuleApiControllerUpdateVasp");
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
| **travelRuleUpdateVASPDetails** | [**TravelRuleUpdateVASPDetails**](TravelRuleUpdateVASPDetails.md)|  | |

### Return type

[**TravelRuleUpdateVASPDetails**](TravelRuleUpdateVASPDetails.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VASP updated successfully |  -  |
| **400** | Invalid request body |  -  |
| **500** | Internal server error |  -  |


## validateFullTravelRuleTransaction

> TravelRuleValidateTransactionResponse validateFullTravelRuleTransaction(travelRuleValidateFullTransactionRequest)

Validate Full Travel Rule Transaction

Validate Full Travel Rule transactions.  Checks for all required information on the originator and beneficiary VASPs.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TravelRuleBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleValidateFullTransactionRequest travelRuleValidateFullTransactionRequest = new TravelRuleValidateFullTransactionRequest(); // TravelRuleValidateFullTransactionRequest | 
        try {
            TravelRuleValidateTransactionResponse result = apiInstance.validateFullTravelRuleTransaction(travelRuleValidateFullTransactionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#validateFullTravelRuleTransaction");
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
| **travelRuleValidateFullTransactionRequest** | [**TravelRuleValidateFullTransactionRequest**](TravelRuleValidateFullTransactionRequest.md)|  | |

### Return type

[**TravelRuleValidateTransactionResponse**](TravelRuleValidateTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction validated successfully |  -  |
| **400** | Invalid request body |  -  |
| **500** | Internal server error |  -  |


## validateTravelRuleTransaction

> TravelRuleValidateTransactionResponse validateTravelRuleTransaction(travelRuleValidateTransactionRequest)

Validate Travel Rule Transaction

Validate Travel Rule transactions.  Checks what beneficiary VASP details are required by your jurisdiction and the beneficiary&#39;s jurisdiction.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TravelRuleBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest = new TravelRuleValidateTransactionRequest(); // TravelRuleValidateTransactionRequest | 
        try {
            TravelRuleValidateTransactionResponse result = apiInstance.validateTravelRuleTransaction(travelRuleValidateTransactionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#validateTravelRuleTransaction");
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
| **travelRuleValidateTransactionRequest** | [**TravelRuleValidateTransactionRequest**](TravelRuleValidateTransactionRequest.md)|  | |

### Return type

[**TravelRuleValidateTransactionResponse**](TravelRuleValidateTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction validated successfully |  -  |
| **400** | Invalid request body |  -  |
| **500** | Internal server error |  -  |

