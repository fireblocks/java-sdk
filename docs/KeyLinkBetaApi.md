# KeyLinkBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSigningKey**](KeyLinkBetaApi.md#createSigningKey) | **POST** /key_link/signing_keys | Add a new signing key |
| [**createValidationKey**](KeyLinkBetaApi.md#createValidationKey) | **POST** /key_link/validation_keys | Add a new validation key |
| [**disableValidationKey**](KeyLinkBetaApi.md#disableValidationKey) | **PATCH** /key_link/validation_keys/{keyId} | Disables a validation key |
| [**getSigningKey**](KeyLinkBetaApi.md#getSigningKey) | **GET** /key_link/signing_keys/{keyId} | Get a signing key by &#x60;keyId&#x60; |
| [**getSigningKeysList**](KeyLinkBetaApi.md#getSigningKeysList) | **GET** /key_link/signing_keys | Get list of signing keys |
| [**getValidationKey**](KeyLinkBetaApi.md#getValidationKey) | **GET** /key_link/validation_keys/{keyId} | Get a validation key by &#x60;keyId&#x60; |
| [**getValidationKeysList**](KeyLinkBetaApi.md#getValidationKeysList) | **GET** /key_link/validation_keys | Get list of registered validation keys |
| [**setAgentId**](KeyLinkBetaApi.md#setAgentId) | **PATCH** /key_link/signing_keys/{keyId}/agent_user_id | Set agent user id that can sign with the signing key identified by the Fireblocks provided &#x60;keyId&#x60; |
| [**updateSigningKey**](KeyLinkBetaApi.md#updateSigningKey) | **PATCH** /key_link/signing_keys/{keyId} | Modify the signing by Fireblocks provided &#x60;keyId&#x60; |



## createSigningKey

> CompletableFuture<ApiResponse<SigningKeyDto>> createSigningKey createSigningKey(createSigningKeyDto, idempotencyKey)

Add a new signing key

Adds a new signing key to the workspace. The added key will be linked to the specific Fireblocks agent user ID. The same user will receive the proof of ownership message to be signed, and upon successful proof, the key will become enabled. Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateSigningKeyDto createSigningKeyDto = new CreateSigningKeyDto(); // CreateSigningKeyDto | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<SigningKeyDto>> response = fireblocks.keyLinkBeta().createSigningKey(createSigningKeyDto, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#createSigningKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#createSigningKey");
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
| **createSigningKeyDto** | [**CreateSigningKeyDto**](CreateSigningKeyDto.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SigningKeyDto**](SigningKeyDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Newly created signing key |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createValidationKey

> CompletableFuture<ApiResponse<CreateValidationKeyResponseDto>> createValidationKey createValidationKey(createValidationKeyDto, idempotencyKey)

Add a new validation key

Adds a new validation key used to validate signing keys. The new validation key will undergo an approval process by the workspace quorum. Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateValidationKeyDto createValidationKeyDto = new CreateValidationKeyDto(); // CreateValidationKeyDto | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CreateValidationKeyResponseDto>> response = fireblocks.keyLinkBeta().createValidationKey(createValidationKeyDto, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#createValidationKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#createValidationKey");
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
| **createValidationKeyDto** | [**CreateValidationKeyDto**](CreateValidationKeyDto.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CreateValidationKeyResponseDto**](CreateValidationKeyResponseDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The validation key that was added and is pending approval. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## disableValidationKey

> CompletableFuture<ApiResponse<ValidationKeyDto>> disableValidationKey disableValidationKey(modifyValidationKeyDto, keyId)

Disables a validation key

Allows disabling validation key even if it has not expired yet. It is not allowed to enable the validation key back. Another key has to be used for future validations. Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ModifyValidationKeyDto modifyValidationKeyDto = new ModifyValidationKeyDto(); // ModifyValidationKeyDto | 
        String keyId = "46a92767-5f93-4a46-9eed-f012196bb4fc"; // String | The unique identifier for the validation key provided by Fireblocks
        try {
            CompletableFuture<ApiResponse<ValidationKeyDto>> response = fireblocks.keyLinkBeta().disableValidationKey(modifyValidationKeyDto, keyId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#disableValidationKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#disableValidationKey");
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
| **modifyValidationKeyDto** | [**ModifyValidationKeyDto**](ModifyValidationKeyDto.md)|  | |
| **keyId** | **String**| The unique identifier for the validation key provided by Fireblocks | |

### Return type

CompletableFuture<ApiResponse<[**ValidationKeyDto**](ValidationKeyDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modified validation key data |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getSigningKey

> CompletableFuture<ApiResponse<SigningKeyDto>> getSigningKey getSigningKey(keyId)

Get a signing key by &#x60;keyId&#x60;

Returns a signing key if it exists, identified by the specified Fireblocks provided &#x60;keyId&#x60;. Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String keyId = "46a92767-5f93-4a46-9eed-f012196bb4fc"; // String | The unique identifier for the signing key provided by Fireblocks
        try {
            CompletableFuture<ApiResponse<SigningKeyDto>> response = fireblocks.keyLinkBeta().getSigningKey(keyId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#getSigningKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#getSigningKey");
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
| **keyId** | **String**| The unique identifier for the signing key provided by Fireblocks | |

### Return type

CompletableFuture<ApiResponse<[**SigningKeyDto**](SigningKeyDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested signing key data |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getSigningKeysList

> CompletableFuture<ApiResponse<GetSigningKeyResponseDto>> getSigningKeysList getSigningKeysList(pageCursor, pageSize, sortBy, order, vaultAccountId, agentUserId, algorithm, enabled, available, isAssigned, keyPrefix)

Get list of signing keys

Returns the list of signing keys in the workspace Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Cursor to the next page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Amount of results to return in the next page
        String sortBy = "createdAt"; // String | Field(s) to use for sorting
        String order = "ASC"; // String | Is the order ascending or descending
        BigDecimal vaultAccountId = new BigDecimal("4"); // BigDecimal | Return keys assigned to a specific vault
        String agentUserId = "12fed207-5bdf-4a0c-ab12-fcd2627f75d1"; // String | Return keys associated with a specific agent user
        String algorithm = "ECDSA_SECP256K1"; // String | Return only keys with a specific algorithm
        Boolean enabled = true; // Boolean | Return keys that have been proof of ownership
        Boolean available = true; // Boolean | Return keys that are proof of ownership but not assigned. Available filter can be used only when vaultAccountId and enabled filters are not set
        Boolean isAssigned = true; // Boolean | Return keys that are assigned to a vault account
        String keyPrefix = "keyPrefix_example"; // String | A case-insensitive prefix filter that matches records where either keyId or signingDeviceKeyID starts with the specified value.
        try {
            CompletableFuture<ApiResponse<GetSigningKeyResponseDto>> response = fireblocks.keyLinkBeta().getSigningKeysList(pageCursor, pageSize, sortBy, order, vaultAccountId, agentUserId, algorithm, enabled, available, isAssigned, keyPrefix);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#getSigningKeysList");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#getSigningKeysList");
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
| **pageCursor** | **String**| Cursor to the next page | [optional] |
| **pageSize** | **BigDecimal**| Amount of results to return in the next page | [optional] [default to 10] |
| **sortBy** | **String**| Field(s) to use for sorting | [optional] [default to createdAt] [enum: createdAt] |
| **order** | **String**| Is the order ascending or descending | [optional] [default to ASC] [enum: ASC, DESC] |
| **vaultAccountId** | **BigDecimal**| Return keys assigned to a specific vault | [optional] |
| **agentUserId** | **String**| Return keys associated with a specific agent user | [optional] |
| **algorithm** | **String**| Return only keys with a specific algorithm | [optional] [enum: ECDSA_SECP256K1, EDDSA_ED25519] |
| **enabled** | **Boolean**| Return keys that have been proof of ownership | [optional] |
| **available** | **Boolean**| Return keys that are proof of ownership but not assigned. Available filter can be used only when vaultAccountId and enabled filters are not set | [optional] |
| **isAssigned** | **Boolean**| Return keys that are assigned to a vault account | [optional] |
| **keyPrefix** | **String**| A case-insensitive prefix filter that matches records where either keyId or signingDeviceKeyID starts with the specified value. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**GetSigningKeyResponseDto**](GetSigningKeyResponseDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of signing keys and a data that allows requesting the next page if applicable |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getValidationKey

> CompletableFuture<ApiResponse<ValidationKeyDto>> getValidationKey getValidationKey(keyId)

Get a validation key by &#x60;keyId&#x60;

Returns a validation key if it exists, identified by the specified &#x60;keyId&#x60;. Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String keyId = "keyId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<ValidationKeyDto>> response = fireblocks.keyLinkBeta().getValidationKey(keyId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#getValidationKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#getValidationKey");
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
| **keyId** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**ValidationKeyDto**](ValidationKeyDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested validation key data |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getValidationKeysList

> CompletableFuture<ApiResponse<GetValidationKeyResponseDto>> getValidationKeysList getValidationKeysList(pageCursor, pageSize, sortBy, order)

Get list of registered validation keys

Returns the list of validation keys in the workspace Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Cursor to the next page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Amount of results to return in the next page
        String sortBy = "createdAt"; // String | Field(s) to use for sorting
        String order = "ASC"; // String | Is the order ascending or descending
        try {
            CompletableFuture<ApiResponse<GetValidationKeyResponseDto>> response = fireblocks.keyLinkBeta().getValidationKeysList(pageCursor, pageSize, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#getValidationKeysList");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#getValidationKeysList");
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
| **pageCursor** | **String**| Cursor to the next page | [optional] |
| **pageSize** | **BigDecimal**| Amount of results to return in the next page | [optional] [default to 10] |
| **sortBy** | **String**| Field(s) to use for sorting | [optional] [default to createdAt] [enum: createdAt] |
| **order** | **String**| Is the order ascending or descending | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**GetValidationKeyResponseDto**](GetValidationKeyResponseDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validation keys list along with data required to request the next page if applicable |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setAgentId

> CompletableFuture<ApiResponse<Void>> setAgentId setAgentId(modifySigningKeyAgentIdDto, keyId)

Set agent user id that can sign with the signing key identified by the Fireblocks provided &#x60;keyId&#x60;

Can modify existing signing key id if the key is not enabled. The change done in background and will be visible once applied. If key is already enabled (after proof of ownership) the user cannot be changed. Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ModifySigningKeyAgentIdDto modifySigningKeyAgentIdDto = new ModifySigningKeyAgentIdDto(); // ModifySigningKeyAgentIdDto | 
        String keyId = "46a92767-5f93-4a46-9eed-f012196bb4fc"; // String | The unique identifier for the signing key provided by Fireblocks
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.keyLinkBeta().setAgentId(modifySigningKeyAgentIdDto, keyId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#setAgentId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#setAgentId");
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
| **modifySigningKeyAgentIdDto** | [**ModifySigningKeyAgentIdDto**](ModifySigningKeyAgentIdDto.md)|  | |
| **keyId** | **String**| The unique identifier for the signing key provided by Fireblocks | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Agent user id modification process has started in background. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateSigningKey

> CompletableFuture<ApiResponse<SigningKeyDto>> updateSigningKey updateSigningKey(modifySigningKeyDto, keyId)

Modify the signing by Fireblocks provided &#x60;keyId&#x60;

Allows assigning the signing key to a vault account, if it hasn&#39;t been assigned to any other vault accounts yet. Please note that this endpoint is available only for Key Link enabled workspaces. **Note:**  This endpoint is currently in beta and might be subject to changes. If you want to participate and learn more about the Fireblocks Key Link, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.

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
import com.fireblocks.sdk.api.KeyLinkBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ModifySigningKeyDto modifySigningKeyDto = new ModifySigningKeyDto(); // ModifySigningKeyDto | 
        String keyId = "46a92767-5f93-4a46-9eed-f012196bb4fc"; // String | The unique identifier for the signing key provided by Fireblocks
        try {
            CompletableFuture<ApiResponse<SigningKeyDto>> response = fireblocks.keyLinkBeta().updateSigningKey(modifySigningKeyDto, keyId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling KeyLinkBetaApi#updateSigningKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyLinkBetaApi#updateSigningKey");
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
| **modifySigningKeyDto** | [**ModifySigningKeyDto**](ModifySigningKeyDto.md)|  | |
| **keyId** | **String**| The unique identifier for the signing key provided by Fireblocks | |

### Return type

CompletableFuture<ApiResponse<[**SigningKeyDto**](SigningKeyDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modified signing key data |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

