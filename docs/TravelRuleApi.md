# TravelRuleApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVASPByDID**](TravelRuleApi.md#getVASPByDID) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details |
| [**getVASPs**](TravelRuleApi.md#getVASPs) | **GET** /screening/travel_rule/vasp | Get All VASPs |
| [**getVaspForVault**](TravelRuleApi.md#getVaspForVault) | **GET** /screening/travel_rule/vault/{vaultAccountId}/vasp | Get assigned VASP to vault |
| [**setVaspForVault**](TravelRuleApi.md#setVaspForVault) | **POST** /screening/travel_rule/vault/{vaultAccountId}/vasp | Assign VASP to vault |
| [**updateVasp**](TravelRuleApi.md#updateVasp) | **PUT** /screening/travel_rule/vasp/update | Add jsonDidKey to VASP details |
| [**validateFullTravelRuleTransaction**](TravelRuleApi.md#validateFullTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction |



## getVASPByDID

> CompletableFuture<ApiResponse<TravelRuleVASP>> getVASPByDID getVASPByDID(did, fields)

Get VASP details

Get VASP Details.  Returns information about a VASP that has the specified DID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.TravelRuleApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String did = "did_example"; // String | 
        List<String> fields = Arrays.asList(); // List<String> | A CSV of fields to return. Choose from the following options:
        try {
            CompletableFuture<ApiResponse<TravelRuleVASP>> response = fireblocks.travelRule().getVASPByDID(did, fields);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleApi#getVASPByDID");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleApi#getVASPByDID");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A CSV of fields to return. Choose from the following options: | [optional] [enum: did, name, verificationStatus, addressLine1, addressLine2, city, country, emailDomains, website, logo, legalStructure, legalName, yearFounded, incorporationCountry, isRegulated, otherNames, identificationType, identificationCountry, businessNumber, regulatoryAuthorities, jurisdictions, street, number, unit, postCode, state, certificates, description, travelRule_OPENVASP, travelRule_SYGNA, travelRule_TRISA, travelRule_TRLIGHT, travelRule_EMAIL, travelRule_TRP, travelRule_SHYFT, travelRule_USTRAVELRULEWG, createdAt, createdBy, updatedAt, updatedBy, lastSentDate, lastReceivedDate, documents, hasAdmin, isNotifiable, issuers] |

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

> CompletableFuture<ApiResponse<TravelRuleGetAllVASPsResponse>> getVASPs getVASPs(order, pageSize, fields, search, reviewValue, pageCursor)

Get All VASPs

Get All VASPs.  Returns a list of VASPs. VASPs can be searched and sorted.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.TravelRuleApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String order = "ASC"; // String | Field to order by
        BigDecimal pageSize = new BigDecimal("500"); // BigDecimal | Records per page
        List<String> fields = Arrays.asList(); // List<String> | CSV of fields to return (all, \"blank\" or see list of all field names below)
        String search = "Fireblocks"; // String | Search query
        String reviewValue = "TRUSTED"; // String | Filter by the VASP's review status. Possible values include: \"TRUSTED\", \"BLOCKED\", \"MANUAL\", or \"NULL\". When provided, only VASPs that match the specified reviewValue will be returned (i.e., VASPs that have already been reviewed to this status).
        String pageCursor = "100"; // String | Cursor for pagination. When provided, the response will include the next page of results.
        try {
            CompletableFuture<ApiResponse<TravelRuleGetAllVASPsResponse>> response = fireblocks.travelRule().getVASPs(order, pageSize, fields, search, reviewValue, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleApi#getVASPs");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleApi#getVASPs");
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
| **order** | **String**| Field to order by | [optional] [enum: ASC, DESC] |
| **pageSize** | **BigDecimal**| Records per page | [optional] [default to 500] |
| **fields** | [**List&lt;String&gt;**](String.md)| CSV of fields to return (all, \&quot;blank\&quot; or see list of all field names below) | [optional] [enum: did, name, verificationStatus, addressLine1, addressLine2, city, country, emailDomains, website, logo, legalStructure, legalName, yearFounded, incorporationCountry, isRegulated, otherNames, identificationType, identificationCountry, businessNumber, regulatoryAuthorities, jurisdictions, street, number, unit, postCode, state, certificates, description, travelRule_OPENVASP, travelRule_SYGNA, travelRule_TRISA, travelRule_TRLIGHT, travelRule_EMAIL, travelRule_TRP, travelRule_SHYFT, travelRule_USTRAVELRULEWG, createdAt, createdBy, updatedAt, updatedBy, lastSentDate, lastReceivedDate, documents, hasAdmin, isNotifiable, issuers] |
| **search** | **String**| Search query | [optional] |
| **reviewValue** | **String**| Filter by the VASP&#39;s review status. Possible values include: \&quot;TRUSTED\&quot;, \&quot;BLOCKED\&quot;, \&quot;MANUAL\&quot;, or \&quot;NULL\&quot;. When provided, only VASPs that match the specified reviewValue will be returned (i.e., VASPs that have already been reviewed to this status). | [optional] [enum: TRUSTED, BLOCKED, MANUAL, ] |
| **pageCursor** | **String**| Cursor for pagination. When provided, the response will include the next page of results. | [optional] |

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
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getVaspForVault

> CompletableFuture<ApiResponse<TravelRuleVaspForVault>> getVaspForVault getVaspForVault(vaultAccountId)

Get assigned VASP to vault

Get assigned VASP Did for a specific vault. Returns empty string vaspDid value in response if none assigned.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.TravelRuleApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "1"; // String | The ID of the vault account
        try {
            CompletableFuture<ApiResponse<TravelRuleVaspForVault>> response = fireblocks.travelRule().getVaspForVault(vaultAccountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleApi#getVaspForVault");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleApi#getVaspForVault");
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
| **vaultAccountId** | **String**| The ID of the vault account | |

### Return type

CompletableFuture<ApiResponse<[**TravelRuleVaspForVault**](TravelRuleVaspForVault.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setVaspForVault

> CompletableFuture<ApiResponse<TravelRuleVaspForVault>> setVaspForVault setVaspForVault(travelRuleVaspForVault, vaultAccountId, idempotencyKey)

Assign VASP to vault

Sets the VASP Did for a specific vault. Pass empty string to remove existing one.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.TravelRuleApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TravelRuleVaspForVault travelRuleVaspForVault = new TravelRuleVaspForVault(); // TravelRuleVaspForVault | 
        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TravelRuleVaspForVault>> response = fireblocks.travelRule().setVaspForVault(travelRuleVaspForVault, vaultAccountId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleApi#setVaspForVault");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleApi#setVaspForVault");
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
| **travelRuleVaspForVault** | [**TravelRuleVaspForVault**](TravelRuleVaspForVault.md)|  | |
| **vaultAccountId** | **String**| The ID of the vault account | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**TravelRuleVaspForVault**](TravelRuleVaspForVault.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateVasp

> CompletableFuture<ApiResponse<TravelRuleUpdateVASPDetails>> updateVasp updateVasp(travelRuleUpdateVASPDetails, idempotencyKey)

Add jsonDidKey to VASP details

Update VASP Details.  Updates a VASP with the provided parameters. Use this endpoint to add your public jsonDIDkey generated by Notabene.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.TravelRuleApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails = new TravelRuleUpdateVASPDetails(); // TravelRuleUpdateVASPDetails | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TravelRuleUpdateVASPDetails>> response = fireblocks.travelRule().updateVasp(travelRuleUpdateVASPDetails, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleApi#updateVasp");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleApi#updateVasp");
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

> CompletableFuture<ApiResponse<TravelRuleValidateTransactionResponse>> validateFullTravelRuleTransaction validateFullTravelRuleTransaction(travelRuleValidateFullTransactionRequest, notation, idempotencyKey)

Validate Full Travel Rule Transaction

Validate Full Travel Rule transactions.  Checks for all required information on the originator and beneficiary VASPs.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.TravelRuleApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        TravelRuleValidateFullTransactionRequest travelRuleValidateFullTransactionRequest = new TravelRuleValidateFullTransactionRequest(); // TravelRuleValidateFullTransactionRequest | 
        List<String> notation = Arrays.asList(); // List<String> | Specifies the notation of the transaction. Possible values are: - `notabene`: Uses Notabene notation (default behavior). - `fireblocks`: Uses Fireblocks notation, with automatic translation of asset tickers and amounts. - `<none>`: Defaults to `notabene` for backward compatibility. **Note:** The default value for the `notation` parameter will change from `notabene` to `fireblocks` Update your integrations accordingly.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<TravelRuleValidateTransactionResponse>> response = fireblocks.travelRule().validateFullTravelRuleTransaction(travelRuleValidateFullTransactionRequest, notation, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling TravelRuleApi#validateFullTravelRuleTransaction");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelRuleApi#validateFullTravelRuleTransaction");
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
| **notation** | [**List&lt;String&gt;**](String.md)| Specifies the notation of the transaction. Possible values are: - &#x60;notabene&#x60;: Uses Notabene notation (default behavior). - &#x60;fireblocks&#x60;: Uses Fireblocks notation, with automatic translation of asset tickers and amounts. - &#x60;&lt;none&gt;&#x60;: Defaults to &#x60;notabene&#x60; for backward compatibility. **Note:** The default value for the &#x60;notation&#x60; parameter will change from &#x60;notabene&#x60; to &#x60;fireblocks&#x60; Update your integrations accordingly. | [optional] [enum: fireblocks, notabene] |
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
| **0** | Error Response |  * X-Request-ID -  <br>  |

