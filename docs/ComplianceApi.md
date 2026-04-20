# ComplianceApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateByorkConfig**](ComplianceApi.md#activateByorkConfig) | **POST** /screening/byork/config/activate | Activate BYORK Light |
| [**addAddressRegistryVaultOptOuts**](ComplianceApi.md#addAddressRegistryVaultOptOuts) | **POST** /address_registry/vaults | Add vault accounts to the address registry opt-out list |
| [**assignVaultsToLegalEntity**](ComplianceApi.md#assignVaultsToLegalEntity) | **POST** /legal_entities/{legalEntityId}/vaults | Assign vault accounts to a legal entity |
| [**deactivateByorkConfig**](ComplianceApi.md#deactivateByorkConfig) | **POST** /screening/byork/config/deactivate | Deactivate BYORK Light |
| [**getAddressRegistryTenantParticipationStatus**](ComplianceApi.md#getAddressRegistryTenantParticipationStatus) | **GET** /address_registry/tenant | Get address registry participation status for the authenticated workspace |
| [**getAddressRegistryVaultOptOut**](ComplianceApi.md#getAddressRegistryVaultOptOut) | **GET** /address_registry/vaults/{vaultAccountId} | Get whether a vault account is opted out of the address registry |
| [**getAmlPostScreeningPolicy**](ComplianceApi.md#getAmlPostScreeningPolicy) | **GET** /screening/aml/post_screening_policy | AML - View Post-Screening Policy |
| [**getAmlScreeningPolicy**](ComplianceApi.md#getAmlScreeningPolicy) | **GET** /screening/aml/screening_policy | AML - View Screening Policy |
| [**getByorkConfig**](ComplianceApi.md#getByorkConfig) | **GET** /screening/byork/config | Get BYORK Light configuration |
| [**getByorkVerdict**](ComplianceApi.md#getByorkVerdict) | **GET** /screening/byork/verdict | Get BYORK Light verdict |
| [**getLegalEntity**](ComplianceApi.md#getLegalEntity) | **GET** /legal_entities/{legalEntityId} | Get a legal entity |
| [**getLegalEntityForAddress**](ComplianceApi.md#getLegalEntityForAddress) | **GET** /address_registry/legal_entities/{address} | Look up legal entity by blockchain address |
| [**getPostScreeningPolicy**](ComplianceApi.md#getPostScreeningPolicy) | **GET** /screening/travel_rule/post_screening_policy | Travel Rule - View Post-Screening Policy |
| [**getScreeningFullDetails**](ComplianceApi.md#getScreeningFullDetails) | **GET** /screening/transaction/{txId} | Provides all the compliance details for the given screened transaction. |
| [**getScreeningPolicy**](ComplianceApi.md#getScreeningPolicy) | **GET** /screening/travel_rule/screening_policy | Travel Rule - View Screening Policy |
| [**listAddressRegistryVaultOptOuts**](ComplianceApi.md#listAddressRegistryVaultOptOuts) | **GET** /address_registry/vaults | List vault-level address registry opt-outs (paginated) |
| [**listLegalEntities**](ComplianceApi.md#listLegalEntities) | **GET** /legal_entities | List legal entities (Paginated) |
| [**listVaultsForLegalEntity**](ComplianceApi.md#listVaultsForLegalEntity) | **GET** /legal_entities/{legalEntityId}/vaults | List vault accounts for a legal entity (Paginated) |
| [**optInAddressRegistryTenant**](ComplianceApi.md#optInAddressRegistryTenant) | **POST** /address_registry/tenant | Opt the workspace in to the address registry |
| [**optOutAddressRegistryTenant**](ComplianceApi.md#optOutAddressRegistryTenant) | **DELETE** /address_registry/tenant | Opt the workspace out of the address registry |
| [**registerLegalEntity**](ComplianceApi.md#registerLegalEntity) | **POST** /legal_entities | Register a new legal entity |
| [**removeAddressRegistryVaultOptOut**](ComplianceApi.md#removeAddressRegistryVaultOptOut) | **DELETE** /address_registry/vaults/{vaultAccountId} | Remove a single vault account from the address registry opt-out list |
| [**removeAllAddressRegistryVaultOptOuts**](ComplianceApi.md#removeAllAddressRegistryVaultOptOuts) | **DELETE** /address_registry/vaults | Remove all vault-level address registry opt-outs for the workspace |
| [**retryRejectedTransactionBypassScreeningChecks**](ComplianceApi.md#retryRejectedTransactionBypassScreeningChecks) | **POST** /screening/transaction/{txId}/bypass_screening_policy | Calling the \&quot;Bypass Screening Policy\&quot; API endpoint triggers a new transaction, with the API user as the initiator, bypassing the screening policy check |
| [**setAmlVerdict**](ComplianceApi.md#setAmlVerdict) | **POST** /screening/aml/verdict/manual | Set AML Verdict (BYORK Super Light) |
| [**setByorkTimeouts**](ComplianceApi.md#setByorkTimeouts) | **PUT** /screening/byork/config/timeouts | Set BYORK Light timeouts |
| [**setByorkVerdict**](ComplianceApi.md#setByorkVerdict) | **POST** /screening/byork/verdict | Set BYORK Light verdict |
| [**updateAmlScreeningConfiguration**](ComplianceApi.md#updateAmlScreeningConfiguration) | **PUT** /screening/aml/policy_configuration | Update AML Configuration |
| [**updateLegalEntity**](ComplianceApi.md#updateLegalEntity) | **PUT** /legal_entities/{legalEntityId} | Update legal entity |
| [**updateScreeningConfiguration**](ComplianceApi.md#updateScreeningConfiguration) | **PUT** /screening/configurations | Tenant - Screening Configuration |
| [**updateTravelRuleConfig**](ComplianceApi.md#updateTravelRuleConfig) | **PUT** /screening/travel_rule/policy_configuration | Update Travel Rule Configuration |



## activateByorkConfig

> CompletableFuture<ApiResponse<ByorkConfigResponse>> activateByorkConfig activateByorkConfig(idempotencyKey)

Activate BYORK Light

Activates BYORK Light for the authenticated tenant (sets config.active to true). Once activated, BYORK screening applies to matching transactions. Requires BYORK Light to be enabled for the tenant (contact your CSM to enable).

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ByorkConfigResponse>> response = fireblocks.compliance().activateByorkConfig(idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#activateByorkConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#activateByorkConfig");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ByorkConfigResponse**](ByorkConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BYORK configuration activated. |  * X-Request-ID -  <br>  |
| **400** | BYORK Light not enabled for tenant. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## addAddressRegistryVaultOptOuts

> CompletableFuture<ApiResponse<AddressRegistryAddVaultOptOutsResponse>> addAddressRegistryVaultOptOuts addAddressRegistryVaultOptOuts(addressRegistryAddVaultOptOutsRequest, idempotencyKey)

Add vault accounts to the address registry opt-out list

Adds one or more vault account ids to the workspace opt-out list for the address registry.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        AddressRegistryAddVaultOptOutsRequest addressRegistryAddVaultOptOutsRequest = new AddressRegistryAddVaultOptOutsRequest(); // AddressRegistryAddVaultOptOutsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AddressRegistryAddVaultOptOutsResponse>> response = fireblocks.compliance().addAddressRegistryVaultOptOuts(addressRegistryAddVaultOptOutsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#addAddressRegistryVaultOptOuts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#addAddressRegistryVaultOptOuts");
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
| **addressRegistryAddVaultOptOutsRequest** | [**AddressRegistryAddVaultOptOutsRequest**](AddressRegistryAddVaultOptOutsRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryAddVaultOptOutsResponse**](AddressRegistryAddVaultOptOutsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Opt-outs recorded; response body includes &#x60;acceptedCount&#x60;. |  * X-Request-ID -  <br>  |
| **400** | Validation error (e.g. empty list or invalid vault ids) |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## assignVaultsToLegalEntity

> CompletableFuture<ApiResponse<AssignVaultsToLegalEntityResponse>> assignVaultsToLegalEntity assignVaultsToLegalEntity(assignVaultsToLegalEntityRequest, legalEntityId, idempotencyKey)

Assign vault accounts to a legal entity

Assigns one or more vault accounts to a specific legal entity registration. Explicitly mapped vault accounts take precedence over the workspace default legal entity. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        AssignVaultsToLegalEntityRequest assignVaultsToLegalEntityRequest = new AssignVaultsToLegalEntityRequest(); // AssignVaultsToLegalEntityRequest | 
        UUID legalEntityId = UUID.randomUUID(); // UUID | The unique ID of the legal entity registration
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AssignVaultsToLegalEntityResponse>> response = fireblocks.compliance().assignVaultsToLegalEntity(assignVaultsToLegalEntityRequest, legalEntityId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#assignVaultsToLegalEntity");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#assignVaultsToLegalEntity");
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
| **assignVaultsToLegalEntityRequest** | [**AssignVaultsToLegalEntityRequest**](AssignVaultsToLegalEntityRequest.md)|  | |
| **legalEntityId** | **UUID**| The unique ID of the legal entity registration | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AssignVaultsToLegalEntityResponse**](AssignVaultsToLegalEntityResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Vault accounts assigned successfully |  * X-Request-ID -  <br>  |
| **404** | Legal entity registration not found |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deactivateByorkConfig

> CompletableFuture<ApiResponse<ByorkConfigResponse>> deactivateByorkConfig deactivateByorkConfig(idempotencyKey)

Deactivate BYORK Light

Deactivates BYORK Light for the authenticated tenant (sets config.active to false). Once deactivated, BYORK screening no longer applies until activated again. Requires BYORK Light to be enabled for the tenant (contact your CSM to enable).

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ByorkConfigResponse>> response = fireblocks.compliance().deactivateByorkConfig(idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#deactivateByorkConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#deactivateByorkConfig");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ByorkConfigResponse**](ByorkConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BYORK configuration deactivated. |  * X-Request-ID -  <br>  |
| **400** | BYORK Light not enabled for tenant. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getAddressRegistryTenantParticipationStatus

> CompletableFuture<ApiResponse<AddressRegistryTenantRegistryResponse>> getAddressRegistryTenantParticipationStatus getAddressRegistryTenantParticipationStatus()

Get address registry participation status for the authenticated workspace

Returns whether the workspace is &#x60;OPTED_IN&#x60; or &#x60;OPTED_OUT&#x60; of the address registry.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<AddressRegistryTenantRegistryResponse>> response = fireblocks.compliance().getAddressRegistryTenantParticipationStatus();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getAddressRegistryTenantParticipationStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getAddressRegistryTenantParticipationStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryTenantRegistryResponse**](AddressRegistryTenantRegistryResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Participation status in the response body |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getAddressRegistryVaultOptOut

> CompletableFuture<ApiResponse<AddressRegistryGetVaultOptOutResponse>> getAddressRegistryVaultOptOut getAddressRegistryVaultOptOut(vaultAccountId)

Get whether a vault account is opted out of the address registry

Returns whether this vault account is on the workspace opt-out list (&#x60;optedOut&#x60; true or false). List, add, and clear-all are available on &#x60;/v1/address_registry/vaults&#x60;; this path reads or removes one vault.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        Integer vaultAccountId = 10001; // Integer | Vault account id (non-negative integer).
        try {
            CompletableFuture<ApiResponse<AddressRegistryGetVaultOptOutResponse>> response = fireblocks.compliance().getAddressRegistryVaultOptOut(vaultAccountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getAddressRegistryVaultOptOut");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getAddressRegistryVaultOptOut");
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
| **vaultAccountId** | **Integer**| Vault account id (non-negative integer). | |

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryGetVaultOptOutResponse**](AddressRegistryGetVaultOptOutResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current opt-out flag for the vault |  * X-Request-ID -  <br>  |
| **400** | Invalid path parameter (e.g. negative or out-of-range vault account id) |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getAmlPostScreeningPolicy

> CompletableFuture<ApiResponse<ScreeningPolicyResponse>> getAmlPostScreeningPolicy getAmlPostScreeningPolicy()

AML - View Post-Screening Policy

Get the post-screening policy for AML.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<ScreeningPolicyResponse>> response = fireblocks.compliance().getAmlPostScreeningPolicy();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getAmlPostScreeningPolicy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getAmlPostScreeningPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**ScreeningPolicyResponse**](ScreeningPolicyResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post-screening policy retrieved successfully. |  -  |


## getAmlScreeningPolicy

> CompletableFuture<ApiResponse<ScreeningProviderRulesConfigurationResponse>> getAmlScreeningPolicy getAmlScreeningPolicy()

AML - View Screening Policy

Get the screening policy for AML.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<ScreeningProviderRulesConfigurationResponse>> response = fireblocks.compliance().getAmlScreeningPolicy();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getAmlScreeningPolicy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getAmlScreeningPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**ScreeningProviderRulesConfigurationResponse**](ScreeningProviderRulesConfigurationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Screening policy retrieved successfully. |  -  |


## getByorkConfig

> CompletableFuture<ApiResponse<ByorkConfigResponse>> getByorkConfig getByorkConfig()

Get BYORK Light configuration

Retrieves BYORK Light configuration for the authenticated tenant (timeouts, active flag, allowed timeout ranges). Returns default config when none exists. Requires BYORK Light to be enabled for the tenant.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<ByorkConfigResponse>> response = fireblocks.compliance().getByorkConfig();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getByorkConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getByorkConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**ByorkConfigResponse**](ByorkConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BYORK configuration (or default). |  * X-Request-ID -  <br>  |
| **400** | BYORK Light not enabled for tenant. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getByorkVerdict

> CompletableFuture<ApiResponse<GetByorkVerdictResponse>> getByorkVerdict getByorkVerdict(txId)

Get BYORK Light verdict

Returns the current BYORK verdict and status for a transaction. Status can be PRE_ACCEPTED, PENDING, RECEIVED (verdict is final but processing not yet complete), or COMPLETED. Requires BYORK Light to be enabled for the tenant. Returns 404 if no BYORK verdict is found for the transaction.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "550e8400-e29b-41d4-a716-446655440000"; // String | Transaction ID
        try {
            CompletableFuture<ApiResponse<GetByorkVerdictResponse>> response = fireblocks.compliance().getByorkVerdict(txId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getByorkVerdict");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getByorkVerdict");
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
| **txId** | **String**| Transaction ID | |

### Return type

CompletableFuture<ApiResponse<[**GetByorkVerdictResponse**](GetByorkVerdictResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current verdict and status. |  * X-Request-ID -  <br>  |
| **400** | BYORK Light not enabled for tenant or txId missing. |  * X-Request-ID -  <br>  |
| **404** | No BYORK verdict found for this transaction. |  * X-Request-ID -  <br>  |
| **500** | Internal server error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getLegalEntity

> CompletableFuture<ApiResponse<LegalEntityRegistration>> getLegalEntity getLegalEntity(legalEntityId)

Get a legal entity

Returns details of a specific legal entity registration, including GLEIF data when available. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID legalEntityId = UUID.randomUUID(); // UUID | The unique ID of the legal entity registration
        try {
            CompletableFuture<ApiResponse<LegalEntityRegistration>> response = fireblocks.compliance().getLegalEntity(legalEntityId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getLegalEntity");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getLegalEntity");
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
| **legalEntityId** | **UUID**| The unique ID of the legal entity registration | |

### Return type

CompletableFuture<ApiResponse<[**LegalEntityRegistration**](LegalEntityRegistration.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Legal entity registration details |  * X-Request-ID -  <br>  |
| **404** | Legal entity registration not found |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getLegalEntityForAddress

> CompletableFuture<ApiResponse<AddressRegistryLegalEntity>> getLegalEntityForAddress getLegalEntityForAddress(address)

Look up legal entity by blockchain address

Returns legal entity information for the given blockchain address (verification status, LEI, Travel Rule providers, contact email, and related fields — see response schema). URL-encode &#x60;{address}&#x60; when required.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String address = "0x742d35cc6634c0532925a3b844bc9e7595f0beb0"; // String | Blockchain address to look up
        try {
            CompletableFuture<ApiResponse<AddressRegistryLegalEntity>> response = fireblocks.compliance().getLegalEntityForAddress(address);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getLegalEntityForAddress");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getLegalEntityForAddress");
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
| **address** | **String**| Blockchain address to look up | |

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryLegalEntity**](AddressRegistryLegalEntity.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Legal entity found |  * X-Request-ID -  <br>  |
| **400** | Bad request — either request validation (path &#x60;{address}&#x60; empty or whitespace-only after trim, e.g. encoded spaces only; numeric code 4100), or the authenticated workspace is not opted in to the address registry (numeric code 2140). The &#x60;message&#x60; field describes the failure; use &#x60;code&#x60; to distinguish. |  * X-Request-ID -  <br>  |
| **404** | Not found (error code 2142) — unresolved address, no legal entity for a resolved address, or the same not-found outcome in other cases. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getPostScreeningPolicy

> CompletableFuture<ApiResponse<ScreeningPolicyResponse>> getPostScreeningPolicy getPostScreeningPolicy()

Travel Rule - View Post-Screening Policy

Get the post-screening policy for Travel Rule.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<ScreeningPolicyResponse>> response = fireblocks.compliance().getPostScreeningPolicy();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getPostScreeningPolicy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getPostScreeningPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**ScreeningPolicyResponse**](ScreeningPolicyResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post-screening policy retrieved successfully. |  -  |


## getScreeningFullDetails

> CompletableFuture<ApiResponse<ComplianceResultFullPayload>> getScreeningFullDetails getScreeningFullDetails(txId)

Provides all the compliance details for the given screened transaction.

Provides all the compliance details for the given screened transaction.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "550e8400-e29b-41d4-a716-446655440000"; // String | Fireblocks transaction ID of the screened transaction
        try {
            CompletableFuture<ApiResponse<ComplianceResultFullPayload>> response = fireblocks.compliance().getScreeningFullDetails(txId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getScreeningFullDetails");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getScreeningFullDetails");
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
| **txId** | **String**| Fireblocks transaction ID of the screened transaction | |

### Return type

CompletableFuture<ApiResponse<[**ComplianceResultFullPayload**](ComplianceResultFullPayload.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A compliance object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getScreeningPolicy

> CompletableFuture<ApiResponse<ScreeningProviderRulesConfigurationResponse>> getScreeningPolicy getScreeningPolicy()

Travel Rule - View Screening Policy

Get the screening policy for Travel Rule.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<ScreeningProviderRulesConfigurationResponse>> response = fireblocks.compliance().getScreeningPolicy();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#getScreeningPolicy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getScreeningPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**ScreeningProviderRulesConfigurationResponse**](ScreeningProviderRulesConfigurationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Screening policy retrieved successfully. |  -  |


## listAddressRegistryVaultOptOuts

> CompletableFuture<ApiResponse<AddressRegistryListVaultOptOutsResponse>> listAddressRegistryVaultOptOuts listAddressRegistryVaultOptOuts(pageCursor, pageSize, order)

List vault-level address registry opt-outs (paginated)

Lists vault accounts that are opted out of the address registry for this workspace. Pagination uses &#x60;next&#x60; and &#x60;prev&#x60; cursors from the response. If &#x60;pageSize&#x60; is omitted, **50** items are returned per page; allowed range is **1–100** per request.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "eyJvZmZzZXQiOjAsInBhZ2VTaXplIjoxMH0"; // String | Opaque cursor from a previous response (`next` or `prev`). Omit for the first page.
        Integer pageSize = 50; // Integer | Page size. Default **50** if omitted; must be between **1** and **100**.
        AddressRegistryVaultListOrder order = AddressRegistryVaultListOrder.fromValue("VAULT_OPT_OUT_LIST_ORDER_ASC"); // AddressRegistryVaultListOrder | Sort direction by vault account id. Omit for ascending; use the enum value for descending.
        try {
            CompletableFuture<ApiResponse<AddressRegistryListVaultOptOutsResponse>> response = fireblocks.compliance().listAddressRegistryVaultOptOuts(pageCursor, pageSize, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#listAddressRegistryVaultOptOuts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#listAddressRegistryVaultOptOuts");
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
| **pageCursor** | **String**| Opaque cursor from a previous response (&#x60;next&#x60; or &#x60;prev&#x60;). Omit for the first page. | [optional] |
| **pageSize** | **Integer**| Page size. Default **50** if omitted; must be between **1** and **100**. | [optional] [default to 50] |
| **order** | [**AddressRegistryVaultListOrder**](.md)| Sort direction by vault account id. Omit for ascending; use the enum value for descending. | [optional] [default to VAULT_OPT_OUT_LIST_ORDER_ASC] [enum: VAULT_OPT_OUT_LIST_ORDER_ASC, VAULT_OPT_OUT_LIST_ORDER_DESC] |

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryListVaultOptOutsResponse**](AddressRegistryListVaultOptOutsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page of vault opt-out rows |  * X-Request-ID -  <br>  |
| **400** | Validation error (e.g. invalid or malformed pageCursor) |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listLegalEntities

> CompletableFuture<ApiResponse<ListLegalEntitiesResponse>> listLegalEntities listLegalEntities(vaultAccountId, pageCursor, pageSize)

List legal entities (Paginated)

Returns legal entity registrations for the workspace with cursor-based pagination. If query parameter vaultAccountId is used it returns the legal entity registration associated with a specific vault account. If no explicit mapping exists for the vault, the workspace default legal entity is returned. Returns an empty response if neither a vault mapping nor a default legal entity is configured. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String vaultAccountId = "vaultAccountId_example"; // String | The ID of the vault account. When provided, returns the legal entity associated with that vault account and pagination parameters are ignored.
        String pageCursor = "pageCursor_example"; // String | Cursor string returned in `next` or `prev` of a previous response. Ignored when `vaultAccountId` is provided.
        Integer pageSize = 50; // Integer | Maximum number of registrations to return. Ignored when `vaultAccountId` is provided.
        try {
            CompletableFuture<ApiResponse<ListLegalEntitiesResponse>> response = fireblocks.compliance().listLegalEntities(vaultAccountId, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#listLegalEntities");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#listLegalEntities");
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
| **vaultAccountId** | **String**| The ID of the vault account. When provided, returns the legal entity associated with that vault account and pagination parameters are ignored. | [optional] |
| **pageCursor** | **String**| Cursor string returned in &#x60;next&#x60; or &#x60;prev&#x60; of a previous response. Ignored when &#x60;vaultAccountId&#x60; is provided. | [optional] |
| **pageSize** | **Integer**| Maximum number of registrations to return. Ignored when &#x60;vaultAccountId&#x60; is provided. | [optional] [default to 50] |

### Return type

CompletableFuture<ApiResponse<[**ListLegalEntitiesResponse**](ListLegalEntitiesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of legal entity registrations. When &#x60;vaultAccountId&#x60; is provided, &#x60;data&#x60; contains at most one item. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## listVaultsForLegalEntity

> CompletableFuture<ApiResponse<ListVaultsForRegistrationResponse>> listVaultsForLegalEntity listVaultsForLegalEntity(legalEntityId, pageCursor, pageSize)

List vault accounts for a legal entity (Paginated)

Returns vault account IDs explicitly assigned to a specific legal entity registration, with cursor-based pagination. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin, Signer, Approver, Editor, Viewer.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID legalEntityId = UUID.randomUUID(); // UUID | The unique ID of the legal entity registration
        String pageCursor = "pageCursor_example"; // String | Cursor string returned in `next` or `prev` of a previous response
        Integer pageSize = 50; // Integer | Maximum number of registrations to return
        try {
            CompletableFuture<ApiResponse<ListVaultsForRegistrationResponse>> response = fireblocks.compliance().listVaultsForLegalEntity(legalEntityId, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#listVaultsForLegalEntity");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#listVaultsForLegalEntity");
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
| **legalEntityId** | **UUID**| The unique ID of the legal entity registration | |
| **pageCursor** | **String**| Cursor string returned in &#x60;next&#x60; or &#x60;prev&#x60; of a previous response | [optional] |
| **pageSize** | **Integer**| Maximum number of registrations to return | [optional] [default to 50] |

### Return type

CompletableFuture<ApiResponse<[**ListVaultsForRegistrationResponse**](ListVaultsForRegistrationResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of vault account IDs assigned to the legal entity |  * X-Request-ID -  <br>  |
| **404** | Legal entity registration not found |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## optInAddressRegistryTenant

> CompletableFuture<ApiResponse<AddressRegistryTenantRegistryResponse>> optInAddressRegistryTenant optInAddressRegistryTenant(idempotencyKey)

Opt the workspace in to the address registry

Opts the workspace in. No request body. Response uses the same JSON shape as GET; status is OPTED_IN.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AddressRegistryTenantRegistryResponse>> response = fireblocks.compliance().optInAddressRegistryTenant(idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#optInAddressRegistryTenant");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#optInAddressRegistryTenant");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryTenantRegistryResponse**](AddressRegistryTenantRegistryResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success; response body includes status OPTED_IN |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## optOutAddressRegistryTenant

> CompletableFuture<ApiResponse<AddressRegistryTenantRegistryResponse>> optOutAddressRegistryTenant optOutAddressRegistryTenant()

Opt the workspace out of the address registry

Opts the workspace out. No request body. Response uses the same JSON shape as GET; status is OPTED_OUT.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<AddressRegistryTenantRegistryResponse>> response = fireblocks.compliance().optOutAddressRegistryTenant();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#optOutAddressRegistryTenant");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#optOutAddressRegistryTenant");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryTenantRegistryResponse**](AddressRegistryTenantRegistryResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success; response body includes status OPTED_OUT |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## registerLegalEntity

> CompletableFuture<ApiResponse<LegalEntityRegistration>> registerLegalEntity registerLegalEntity(registerLegalEntityRequest, idempotencyKey)

Register a new legal entity

Registers a new legal entity for the workspace using its LEI (Legal Entity Identifier) code. The LEI is validated against the GLEIF registry. Each workspace can register multiple legal entities. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        RegisterLegalEntityRequest registerLegalEntityRequest = new RegisterLegalEntityRequest(); // RegisterLegalEntityRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<LegalEntityRegistration>> response = fireblocks.compliance().registerLegalEntity(registerLegalEntityRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#registerLegalEntity");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#registerLegalEntity");
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
| **registerLegalEntityRequest** | [**RegisterLegalEntityRequest**](RegisterLegalEntityRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**LegalEntityRegistration**](LegalEntityRegistration.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Legal entity registered successfully |  * X-Request-ID -  <br>  |
| **400** | Invalid LEI or request parameters |  * X-Request-ID -  <br>  |
| **404** | LEI not found in the GLEIF registry |  * X-Request-ID -  <br>  |
| **409** | A legal entity with this LEI is already registered for the workspace |  * X-Request-ID -  <br>  |
| **500** | Internal Server Error |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## removeAddressRegistryVaultOptOut

> CompletableFuture<ApiResponse<AddressRegistryRemoveVaultOptOutResponse>> removeAddressRegistryVaultOptOut removeAddressRegistryVaultOptOut(vaultAccountId)

Remove a single vault account from the address registry opt-out list

Removes this vault account id from the workspace opt-out list if it is present; otherwise the call still succeeds. Response body matches GET (&#x60;optedOut&#x60; is &#x60;false&#x60; after success). To clear the whole list, use &#x60;DELETE /v1/address_registry/vaults&#x60;.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        Integer vaultAccountId = 10001; // Integer | Vault account id (non-negative integer).
        try {
            CompletableFuture<ApiResponse<AddressRegistryRemoveVaultOptOutResponse>> response = fireblocks.compliance().removeAddressRegistryVaultOptOut(vaultAccountId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#removeAddressRegistryVaultOptOut");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#removeAddressRegistryVaultOptOut");
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
| **vaultAccountId** | **Integer**| Vault account id (non-negative integer). | |

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryRemoveVaultOptOutResponse**](AddressRegistryRemoveVaultOptOutResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success; &#x60;optedOut&#x60; is false (list entry removed if it existed) |  * X-Request-ID -  <br>  |
| **400** | Invalid path parameter (e.g. negative or out-of-range vault account id) |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## removeAllAddressRegistryVaultOptOuts

> CompletableFuture<ApiResponse<AddressRegistryRemoveAllVaultOptOutsResponse>> removeAllAddressRegistryVaultOptOuts removeAllAddressRegistryVaultOptOuts()

Remove all vault-level address registry opt-outs for the workspace

Removes all vault accounts from the workspace opt-out list.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        try {
            CompletableFuture<ApiResponse<AddressRegistryRemoveAllVaultOptOutsResponse>> response = fireblocks.compliance().removeAllAddressRegistryVaultOptOuts();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#removeAllAddressRegistryVaultOptOuts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#removeAllAddressRegistryVaultOptOuts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**AddressRegistryRemoveAllVaultOptOutsResponse**](AddressRegistryRemoveAllVaultOptOutsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All opt-outs cleared; response body includes &#x60;removedCount&#x60;. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## retryRejectedTransactionBypassScreeningChecks

> CompletableFuture<ApiResponse<CreateTransactionResponse>> retryRejectedTransactionBypassScreeningChecks retryRejectedTransactionBypassScreeningChecks(txId, idempotencyKey)

Calling the \&quot;Bypass Screening Policy\&quot; API endpoint triggers a new transaction, with the API user as the initiator, bypassing the screening policy check

This endpoint is restricted to Admin API users and is only applicable to outgoing transactions.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String txId = "550e8400-e29b-41d4-a716-446655440000"; // String | The transaction id that was rejected by screening checks
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateTransactionResponse>> response = fireblocks.compliance().retryRejectedTransactionBypassScreeningChecks(txId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#retryRejectedTransactionBypassScreeningChecks");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#retryRejectedTransactionBypassScreeningChecks");
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
| **txId** | **String**| The transaction id that was rejected by screening checks | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateTransactionResponse**](CreateTransactionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setAmlVerdict

> CompletableFuture<ApiResponse<AmlVerdictManualResponse>> setAmlVerdict setAmlVerdict(amlVerdictManualRequest, idempotencyKey)

Set AML Verdict (BYORK Super Light)

Set AML verdict for incoming transactions when **BYORK Super Light** (Manual Screening Verdict) is enabled. This endpoint is for Super Light only. For **BYORK Light**, use POST /screening/byork/verdict instead. When Super Light is retired, this endpoint will be deprecated; use the BYORK Light verdict API for new integrations.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        AmlVerdictManualRequest amlVerdictManualRequest = new AmlVerdictManualRequest(); // AmlVerdictManualRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<AmlVerdictManualResponse>> response = fireblocks.compliance().setAmlVerdict(amlVerdictManualRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#setAmlVerdict");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#setAmlVerdict");
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
| **amlVerdictManualRequest** | [**AmlVerdictManualRequest**](AmlVerdictManualRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**AmlVerdictManualResponse**](AmlVerdictManualResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | AML verdict set successfully. |  -  |
| **400** | Feature not enabled for tenant. |  * X-Request-ID -  <br>  |
| **425** | Too Early - transaction not yet in pending screening. |  * X-Request-ID -  <br>  |
| **500** | Internal server error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setByorkTimeouts

> CompletableFuture<ApiResponse<ByorkConfigResponse>> setByorkTimeouts setByorkTimeouts(byorkSetTimeoutsRequest, idempotencyKey)

Set BYORK Light timeouts

Updates timeout values for BYORK wait-for-response (incoming and/or outgoing). At least one of incomingTimeoutSeconds or outgoingTimeoutSeconds is required. Values must be within the ranges returned in GET config (timeoutRangeIncoming for incomingTimeoutSeconds, timeoutRangeOutgoing for outgoingTimeoutSeconds). Requires BYORK Light to be enabled for the tenant (contact your CSM to enable).

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ByorkSetTimeoutsRequest byorkSetTimeoutsRequest = new ByorkSetTimeoutsRequest(); // ByorkSetTimeoutsRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ByorkConfigResponse>> response = fireblocks.compliance().setByorkTimeouts(byorkSetTimeoutsRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#setByorkTimeouts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#setByorkTimeouts");
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
| **byorkSetTimeoutsRequest** | [**ByorkSetTimeoutsRequest**](ByorkSetTimeoutsRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ByorkConfigResponse**](ByorkConfigResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Timeouts updated. |  * X-Request-ID -  <br>  |
| **400** | BYORK Light not enabled, or timeout value out of range, or missing both timeouts. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setByorkVerdict

> CompletableFuture<ApiResponse<ByorkVerdictResponse>> setByorkVerdict setByorkVerdict(byorkVerdictRequest, idempotencyKey)

Set BYORK Light verdict

Submit verdict (ACCEPT or REJECT) for a transaction in the BYORK Light flow. If the transaction is awaiting your decision, the verdict is applied immediately (response status COMPLETED). If processing has not yet reached that point, the verdict is stored and applied when it does (response status PRE_ACCEPTED). Requires BYORK Light to be enabled for the tenant.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ByorkVerdictRequest byorkVerdictRequest = new ByorkVerdictRequest(); // ByorkVerdictRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ByorkVerdictResponse>> response = fireblocks.compliance().setByorkVerdict(byorkVerdictRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#setByorkVerdict");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#setByorkVerdict");
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
| **byorkVerdictRequest** | [**ByorkVerdictRequest**](ByorkVerdictRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ByorkVerdictResponse**](ByorkVerdictResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Verdict applied (COMPLETED) or pre-accepted (PRE_ACCEPTED). |  * X-Request-ID -  <br>  |
| **400** | BYORK Light not enabled for tenant or invalid verdict. |  * X-Request-ID -  <br>  |
| **409** | BYORK decision already final, screening already completed, or state inconsistent. |  * X-Request-ID -  <br>  |
| **425** | Too Early - transaction not found (screening not started yet). |  * X-Request-ID -  <br>  |
| **500** | Internal server error. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateAmlScreeningConfiguration

> CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> updateAmlScreeningConfiguration updateAmlScreeningConfiguration(idempotencyKey)

Update AML Configuration

Updates bypass screening, inbound delay, or outbound delay configurations for AML.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> response = fireblocks.compliance().updateAmlScreeningConfiguration(idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#updateAmlScreeningConfiguration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#updateAmlScreeningConfiguration");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ScreeningConfigurationsRequest**](ScreeningConfigurationsRequest.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Configuration updated successfully. |  -  |


## updateLegalEntity

> CompletableFuture<ApiResponse<LegalEntityRegistration>> updateLegalEntity updateLegalEntity(updateLegalEntityRequest, legalEntityId, idempotencyKey)

Update legal entity

Updates the status of a legal entity registration. Setting isDefault to true marks the registration as the workspace default, which is applied to vault accounts that have no explicit legal entity mapping. &lt;/br&gt;Endpoint Permission: Admin, Non-Signing Admin.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpdateLegalEntityRequest updateLegalEntityRequest = new UpdateLegalEntityRequest(); // UpdateLegalEntityRequest | 
        UUID legalEntityId = UUID.randomUUID(); // UUID | The unique ID of the legal entity registration
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<LegalEntityRegistration>> response = fireblocks.compliance().updateLegalEntity(updateLegalEntityRequest, legalEntityId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#updateLegalEntity");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#updateLegalEntity");
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
| **updateLegalEntityRequest** | [**UpdateLegalEntityRequest**](UpdateLegalEntityRequest.md)|  | |
| **legalEntityId** | **UUID**| The unique ID of the legal entity registration | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**LegalEntityRegistration**](LegalEntityRegistration.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated legal entity registration |  * X-Request-ID -  <br>  |
| **400** | Registration is not in APPROVED status |  * X-Request-ID -  <br>  |
| **404** | Legal entity registration not found |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateScreeningConfiguration

> CompletableFuture<ApiResponse<ScreeningUpdateConfigurations>> updateScreeningConfiguration updateScreeningConfiguration(screeningUpdateConfigurations, idempotencyKey)

Tenant - Screening Configuration

Update tenant screening configuration.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ScreeningUpdateConfigurations screeningUpdateConfigurations = new ScreeningUpdateConfigurations(); // ScreeningUpdateConfigurations | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ScreeningUpdateConfigurations>> response = fireblocks.compliance().updateScreeningConfiguration(screeningUpdateConfigurations, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#updateScreeningConfiguration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#updateScreeningConfiguration");
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
| **screeningUpdateConfigurations** | [**ScreeningUpdateConfigurations**](ScreeningUpdateConfigurations.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ScreeningUpdateConfigurations**](ScreeningUpdateConfigurations.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tenant Screening configuration updated successfully. |  -  |


## updateTravelRuleConfig

> CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> updateTravelRuleConfig updateTravelRuleConfig(idempotencyKey)

Update Travel Rule Configuration

Updates bypass screening, inbound delay, or outbound delay configurations for Travel Rule.

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
import com.fireblocks.sdk.api.ComplianceApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ScreeningConfigurationsRequest>> response = fireblocks.compliance().updateTravelRuleConfig(idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ComplianceApi#updateTravelRuleConfig");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#updateTravelRuleConfig");
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
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ScreeningConfigurationsRequest**](ScreeningConfigurationsRequest.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Configuration updated successfully. |  -  |

