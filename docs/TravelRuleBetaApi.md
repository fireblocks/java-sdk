# TravelRuleBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVASPByDID**](TravelRuleBetaApi.md#getVASPByDID) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details |
| [**getVASPByDIDWithHttpInfo**](TravelRuleBetaApi.md#getVASPByDIDWithHttpInfo) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details |
| [**getVASPs**](TravelRuleBetaApi.md#getVASPs) | **GET** /screening/travel_rule/vasp | Get All VASPs |
| [**getVASPsWithHttpInfo**](TravelRuleBetaApi.md#getVASPsWithHttpInfo) | **GET** /screening/travel_rule/vasp | Get All VASPs |
| [**updateVasp**](TravelRuleBetaApi.md#updateVasp) | **PUT** /screening/travel_rule/vasp/update | Add jsonDidKey to VASP details |
| [**updateVaspWithHttpInfo**](TravelRuleBetaApi.md#updateVaspWithHttpInfo) | **PUT** /screening/travel_rule/vasp/update | Add jsonDidKey to VASP details |
| [**validateFullTravelRuleTransaction**](TravelRuleBetaApi.md#validateFullTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction |
| [**validateFullTravelRuleTransactionWithHttpInfo**](TravelRuleBetaApi.md#validateFullTravelRuleTransactionWithHttpInfo) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction |
| [**validateTravelRuleTransaction**](TravelRuleBetaApi.md#validateTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate | Validate Travel Rule Transaction |
| [**validateTravelRuleTransactionWithHttpInfo**](TravelRuleBetaApi.md#validateTravelRuleTransactionWithHttpInfo) | **POST** /screening/travel_rule/transaction/validate | Validate Travel Rule Transaction |



## getVASPByDID

> CompletableFuture<TravelRuleVASP> getVASPByDID(did, fields)

Get VASP details

Get VASP Details.  Returns information about a VASP that has the specified DID.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        String did = "did_example"; // String | 
        String fields = "fields_example"; // String | CSV of fields to return (all, \"blank\" or see list of all field names below)
        try {
            CompletableFuture<TravelRuleVASP> result = apiInstance.getVASPByDID(did, fields);
            System.out.println(result.get());
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

CompletableFuture<[**TravelRuleVASP**](TravelRuleVASP.md)>


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

## getVASPByDIDWithHttpInfo

> CompletableFuture<ApiResponse<TravelRuleVASP>> getVASPByDID getVASPByDIDWithHttpInfo(did, fields)

Get VASP details

Get VASP Details.  Returns information about a VASP that has the specified DID.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        String did = "did_example"; // String | 
        String fields = "fields_example"; // String | CSV of fields to return (all, \"blank\" or see list of all field names below)
        try {
            CompletableFuture<ApiResponse<TravelRuleVASP>> response = apiInstance.getVASPByDIDWithHttpInfo(did, fields);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleBetaApi#getVASPByDID");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#getVASPByDID");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

CompletableFuture<ApiResponse<[**TravelRuleVASP**](TravelRuleVASP.md)>>


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

> CompletableFuture<TravelRuleGetAllVASPsResponse> getVASPs(order, perPage, page, fields)

Get All VASPs

Get All VASPs.  Returns a list of VASPs. VASPs can be searched and sorted and results are paginated.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

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
            CompletableFuture<TravelRuleGetAllVASPsResponse> result = apiInstance.getVASPs(order, perPage, page, fields);
            System.out.println(result.get());
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

CompletableFuture<[**TravelRuleGetAllVASPsResponse**](TravelRuleGetAllVASPsResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all VASPs |  -  |

## getVASPsWithHttpInfo

> CompletableFuture<ApiResponse<TravelRuleGetAllVASPsResponse>> getVASPs getVASPsWithHttpInfo(order, perPage, page, fields)

Get All VASPs

Get All VASPs.  Returns a list of VASPs. VASPs can be searched and sorted and results are paginated.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

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
            CompletableFuture<ApiResponse<TravelRuleGetAllVASPsResponse>> response = apiInstance.getVASPsWithHttpInfo(order, perPage, page, fields);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleBetaApi#getVASPs");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#getVASPs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

CompletableFuture<ApiResponse<[**TravelRuleGetAllVASPsResponse**](TravelRuleGetAllVASPsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all VASPs |  -  |


## updateVasp

> CompletableFuture<TravelRuleUpdateVASPDetails> updateVasp(travelRuleUpdateVASPDetails, idempotencyKey)

Add jsonDidKey to VASP details

Update VASP Details.  Updates a VASP with the provided parameters. Use this endpoint to add your public jsonDIDkey generated by Notabene.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails = new TravelRuleUpdateVASPDetails(); // TravelRuleUpdateVASPDetails | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<TravelRuleUpdateVASPDetails> result = apiInstance.updateVasp(travelRuleUpdateVASPDetails, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#updateVasp");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**TravelRuleUpdateVASPDetails**](TravelRuleUpdateVASPDetails.md)>


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

## updateVaspWithHttpInfo

> CompletableFuture<ApiResponse<TravelRuleUpdateVASPDetails>> updateVasp updateVaspWithHttpInfo(travelRuleUpdateVASPDetails, idempotencyKey)

Add jsonDidKey to VASP details

Update VASP Details.  Updates a VASP with the provided parameters. Use this endpoint to add your public jsonDIDkey generated by Notabene.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails = new TravelRuleUpdateVASPDetails(); // TravelRuleUpdateVASPDetails | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TravelRuleUpdateVASPDetails>> response = apiInstance.updateVaspWithHttpInfo(travelRuleUpdateVASPDetails, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleBetaApi#updateVasp");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#updateVasp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **travelRuleUpdateVASPDetails** | [**TravelRuleUpdateVASPDetails**](TravelRuleUpdateVASPDetails.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TravelRuleUpdateVASPDetails**](TravelRuleUpdateVASPDetails.md)>>


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

> CompletableFuture<TravelRuleValidateTransactionResponse> validateFullTravelRuleTransaction(travelRuleValidateFullTransactionRequest, idempotencyKey)

Validate Full Travel Rule Transaction

Validate Full Travel Rule transactions.  Checks for all required information on the originator and beneficiary VASPs.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleValidateFullTransactionRequest travelRuleValidateFullTransactionRequest = new TravelRuleValidateFullTransactionRequest(); // TravelRuleValidateFullTransactionRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<TravelRuleValidateTransactionResponse> result = apiInstance.validateFullTravelRuleTransaction(travelRuleValidateFullTransactionRequest, idempotencyKey);
            System.out.println(result.get());
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**TravelRuleValidateTransactionResponse**](TravelRuleValidateTransactionResponse.md)>


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

## validateFullTravelRuleTransactionWithHttpInfo

> CompletableFuture<ApiResponse<TravelRuleValidateTransactionResponse>> validateFullTravelRuleTransaction validateFullTravelRuleTransactionWithHttpInfo(travelRuleValidateFullTransactionRequest, idempotencyKey)

Validate Full Travel Rule Transaction

Validate Full Travel Rule transactions.  Checks for all required information on the originator and beneficiary VASPs.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleValidateFullTransactionRequest travelRuleValidateFullTransactionRequest = new TravelRuleValidateFullTransactionRequest(); // TravelRuleValidateFullTransactionRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TravelRuleValidateTransactionResponse>> response = apiInstance.validateFullTravelRuleTransactionWithHttpInfo(travelRuleValidateFullTransactionRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleBetaApi#validateFullTravelRuleTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#validateFullTravelRuleTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **travelRuleValidateFullTransactionRequest** | [**TravelRuleValidateFullTransactionRequest**](TravelRuleValidateFullTransactionRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TravelRuleValidateTransactionResponse**](TravelRuleValidateTransactionResponse.md)>>


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

> CompletableFuture<TravelRuleValidateTransactionResponse> validateTravelRuleTransaction(travelRuleValidateTransactionRequest, idempotencyKey)

Validate Travel Rule Transaction

Validate Travel Rule transactions.  Checks what beneficiary VASP details are required by your jurisdiction and the beneficiary&#39;s jurisdiction.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest = new TravelRuleValidateTransactionRequest(); // TravelRuleValidateTransactionRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<TravelRuleValidateTransactionResponse> result = apiInstance.validateTravelRuleTransaction(travelRuleValidateTransactionRequest, idempotencyKey);
            System.out.println(result.get());
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**TravelRuleValidateTransactionResponse**](TravelRuleValidateTransactionResponse.md)>


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

## validateTravelRuleTransactionWithHttpInfo

> CompletableFuture<ApiResponse<TravelRuleValidateTransactionResponse>> validateTravelRuleTransaction validateTravelRuleTransactionWithHttpInfo(travelRuleValidateTransactionRequest, idempotencyKey)

Validate Travel Rule Transaction

Validate Travel Rule transactions.  Checks what beneficiary VASP details are required by your jurisdiction and the beneficiary&#39;s jurisdiction.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.TravelRuleBetaApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        TravelRuleBetaApi apiInstance = new TravelRuleBetaApi(defaultClient);
        TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest = new TravelRuleValidateTransactionRequest(); // TravelRuleValidateTransactionRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TravelRuleValidateTransactionResponse>> response = apiInstance.validateTravelRuleTransactionWithHttpInfo(travelRuleValidateTransactionRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleBetaApi#validateTravelRuleTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleBetaApi#validateTravelRuleTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **travelRuleValidateTransactionRequest** | [**TravelRuleValidateTransactionRequest**](TravelRuleValidateTransactionRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TravelRuleValidateTransactionResponse**](TravelRuleValidateTransactionResponse.md)>>


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

