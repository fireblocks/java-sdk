# ContractTemplatesApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteContractTemplateById**](ContractTemplatesApi.md#deleteContractTemplateById) | **DELETE** /tokenization/templates/{contractTemplateId} | Delete a contract template by id |
| [**deployContract**](ContractTemplatesApi.md#deployContract) | **POST** /tokenization/templates/{contractTemplateId}/deploy | Deploy contract |
| [**getConstructorByContractTemplateId**](ContractTemplatesApi.md#getConstructorByContractTemplateId) | **GET** /tokenization/templates/{contractTemplateId}/constructor | Return contract template&#39;s constructor |
| [**getContractTemplateById**](ContractTemplatesApi.md#getContractTemplateById) | **GET** /tokenization/templates/{contractTemplateId} | Return contract template by id |
| [**getContractTemplates**](ContractTemplatesApi.md#getContractTemplates) | **GET** /tokenization/templates | List all contract templates |
| [**getFunctionAbiByContractTemplateId**](ContractTemplatesApi.md#getFunctionAbiByContractTemplateId) | **GET** /tokenization/templates/{contractTemplateId}/function | Return contract template&#39;s function |
| [**uploadContractTemplate**](ContractTemplatesApi.md#uploadContractTemplate) | **POST** /tokenization/templates | Upload contract template |



## deleteContractTemplateById

> CompletableFuture<ApiResponse<Void>> deleteContractTemplateById deleteContractTemplateById(contractTemplateId)

Delete a contract template by id

Delete a contract by id. allowed only for private contract templates. Notice: it is irreversible!

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
import com.fireblocks.sdk.api.ContractTemplatesApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String contractTemplateId = "b70701f4-d7b1-4795-a8ee-b09cdb5b850d"; // String | The Contract Template identifier
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.contractTemplates().deleteContractTemplateById(contractTemplateId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractTemplatesApi#deleteContractTemplateById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractTemplatesApi#deleteContractTemplateById");
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
| **contractTemplateId** | **String**| The Contract Template identifier | |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Contract was deleted successfully |  -  |
| **404** | Could not find contract. |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deployContract

> CompletableFuture<ApiResponse<ContractDeployResponse>> deployContract deployContract(contractDeployRequest, contractTemplateId, idempotencyKey)

Deploy contract

Deploy a new contract by contract template id. If you wish to deploy a token (ERC20, ERC721 etc), and create asset please use POST /tokenization

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
import com.fireblocks.sdk.api.ContractTemplatesApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ContractDeployRequest contractDeployRequest = new ContractDeployRequest(); // ContractDeployRequest | 
        String contractTemplateId = "b70701f4-d7b1-4795-a8ee-b09cdb5b850d"; // String | The Contract Template identifier
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ContractDeployResponse>> response = fireblocks.contractTemplates().deployContract(contractDeployRequest, contractTemplateId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractTemplatesApi#deployContract");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractTemplatesApi#deployContract");
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
| **contractDeployRequest** | [**ContractDeployRequest**](ContractDeployRequest.md)|  | |
| **contractTemplateId** | **String**| The Contract Template identifier | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ContractDeployResponse**](ContractDeployResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Contract was deployed successfully |  -  |
| **404** | Could not find contract. |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getConstructorByContractTemplateId

> CompletableFuture<ApiResponse<AbiFunction>> getConstructorByContractTemplateId getConstructorByContractTemplateId(contractTemplateId, withDocs)

Return contract template&#39;s constructor

Return contract template&#39;s constructor ABI

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
import com.fireblocks.sdk.api.ContractTemplatesApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String contractTemplateId = "b70701f4-d7b1-4795-a8ee-b09cdb5b850d"; // String | The Contract Template identifier
        Boolean withDocs = false; // Boolean | true if you want to get the abi with its docs
        try {
            CompletableFuture<ApiResponse<AbiFunction>> response = fireblocks.contractTemplates().getConstructorByContractTemplateId(contractTemplateId, withDocs);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractTemplatesApi#getConstructorByContractTemplateId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractTemplatesApi#getConstructorByContractTemplateId");
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
| **contractTemplateId** | **String**| The Contract Template identifier | |
| **withDocs** | **Boolean**| true if you want to get the abi with its docs | [optional] [default to false] |

### Return type

CompletableFuture<ApiResponse<[**AbiFunction**](AbiFunction.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract template&#39;s constructor ABI was returned successfully |  -  |
| **404** | Could not find contract. |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContractTemplateById

> CompletableFuture<ApiResponse<ContractTemplateDto>> getContractTemplateById getContractTemplateById(contractTemplateId)

Return contract template by id

Return detailed information about the contract template

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
import com.fireblocks.sdk.api.ContractTemplatesApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String contractTemplateId = "b70701f4-d7b1-4795-a8ee-b09cdb5b850d"; // String | The Contract Template identifier
        try {
            CompletableFuture<ApiResponse<ContractTemplateDto>> response = fireblocks.contractTemplates().getContractTemplateById(contractTemplateId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractTemplatesApi#getContractTemplateById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractTemplatesApi#getContractTemplateById");
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
| **contractTemplateId** | **String**| The Contract Template identifier | |

### Return type

CompletableFuture<ApiResponse<[**ContractTemplateDto**](ContractTemplateDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract template was returned successfully |  -  |
| **404** | Could not find contract. |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContractTemplates

> CompletableFuture<ApiResponse<TemplatesPaginatedResponse>> getContractTemplates getContractTemplates(limit, offset, pageCursor, pageSize, type, initializationPhase)

List all contract templates

Return minimal representation of all the contract templates available for the workspace

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
import com.fireblocks.sdk.api.ContractTemplatesApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        BigDecimal limit = new BigDecimal("100"); // BigDecimal | Items per page (max 100)
        BigDecimal offset = new BigDecimal("0"); // BigDecimal | Paging offset
        String pageCursor = "MjAyMy0xMi0xMyAyMDozNjowOC4zMDI=:MTEwMA=="; // String | Page cursor to get the next page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Number of items per page, requesting more then max will return max items
        String type = "FUNGIBLE_TOKEN"; // String | The type of the contract templates you wish to retrieve. Can accept one type, more or none
        String initializationPhase = "ON_DEPLOYMENT"; // String | 
        try {
            CompletableFuture<ApiResponse<TemplatesPaginatedResponse>> response = fireblocks.contractTemplates().getContractTemplates(limit, offset, pageCursor, pageSize, type, initializationPhase);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractTemplatesApi#getContractTemplates");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractTemplatesApi#getContractTemplates");
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
| **limit** | **BigDecimal**| Items per page (max 100) | [optional] [default to 100] |
| **offset** | **BigDecimal**| Paging offset | [optional] [default to 0] |
| **pageCursor** | **String**| Page cursor to get the next page | [optional] |
| **pageSize** | **BigDecimal**| Number of items per page, requesting more then max will return max items | [optional] |
| **type** | **String**| The type of the contract templates you wish to retrieve. Can accept one type, more or none | [optional] [enum: FUNGIBLE_TOKEN, NON_FUNGIBLE_TOKEN, TOKEN_UTILITY] |
| **initializationPhase** | **String**|  | [optional] [enum: ON_DEPLOYMENT, POST_DEPLOYMENT] |

### Return type

CompletableFuture<ApiResponse<[**TemplatesPaginatedResponse**](TemplatesPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of contract templates was returned successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getFunctionAbiByContractTemplateId

> CompletableFuture<ApiResponse<AbiFunction>> getFunctionAbiByContractTemplateId getFunctionAbiByContractTemplateId(contractTemplateId, functionSignature)

Return contract template&#39;s function

Return contract template&#x60;s function ABI by signature

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
import com.fireblocks.sdk.api.ContractTemplatesApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String contractTemplateId = "b70701f4-d7b1-4795-a8ee-b09cdb5b850d"; // String | The Contract Template identifier
        String functionSignature = "functionSignature_example"; // String | 
        try {
            CompletableFuture<ApiResponse<AbiFunction>> response = fireblocks.contractTemplates().getFunctionAbiByContractTemplateId(contractTemplateId, functionSignature);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractTemplatesApi#getFunctionAbiByContractTemplateId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractTemplatesApi#getFunctionAbiByContractTemplateId");
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
| **contractTemplateId** | **String**| The Contract Template identifier | |
| **functionSignature** | **String**|  | |

### Return type

CompletableFuture<ApiResponse<[**AbiFunction**](AbiFunction.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract template&#x60;s function ABI was returned successfully |  -  |
| **404** | Could not find contract. |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## uploadContractTemplate

> CompletableFuture<ApiResponse<ContractTemplateDto>> uploadContractTemplate uploadContractTemplate(contractUploadRequest, idempotencyKey)

Upload contract template

Upload a new contract template. This contract template will be available for the workspace

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
import com.fireblocks.sdk.api.ContractTemplatesApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ContractUploadRequest contractUploadRequest = new ContractUploadRequest(); // ContractUploadRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ContractTemplateDto>> response = fireblocks.contractTemplates().uploadContractTemplate(contractUploadRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractTemplatesApi#uploadContractTemplate");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractTemplatesApi#uploadContractTemplate");
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
| **contractUploadRequest** | [**ContractUploadRequest**](ContractUploadRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ContractTemplateDto**](ContractTemplateDto.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Contract was uploaded successfully |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

