# ContractsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addContractAsset**](ContractsApi.md#addContractAsset) | **POST** /contracts/{contractId}/{assetId} | Add an asset to a contract |
| [**addContractAssetWithHttpInfo**](ContractsApi.md#addContractAssetWithHttpInfo) | **POST** /contracts/{contractId}/{assetId} | Add an asset to a contract |
| [**createContract**](ContractsApi.md#createContract) | **POST** /contracts | Create a contract |
| [**createContractWithHttpInfo**](ContractsApi.md#createContractWithHttpInfo) | **POST** /contracts | Create a contract |
| [**deleteContract**](ContractsApi.md#deleteContract) | **DELETE** /contracts/{contractId} | Delete a contract |
| [**deleteContractWithHttpInfo**](ContractsApi.md#deleteContractWithHttpInfo) | **DELETE** /contracts/{contractId} | Delete a contract |
| [**deleteContractAsset**](ContractsApi.md#deleteContractAsset) | **DELETE** /contracts/{contractId}/{assetId} | Delete a contract asset |
| [**deleteContractAssetWithHttpInfo**](ContractsApi.md#deleteContractAssetWithHttpInfo) | **DELETE** /contracts/{contractId}/{assetId} | Delete a contract asset |
| [**getContract**](ContractsApi.md#getContract) | **GET** /contracts/{contractId} | Find a specific contract |
| [**getContractWithHttpInfo**](ContractsApi.md#getContractWithHttpInfo) | **GET** /contracts/{contractId} | Find a specific contract |
| [**getContractAsset**](ContractsApi.md#getContractAsset) | **GET** /contracts/{contractId}/{assetId} | Find a contract asset |
| [**getContractAssetWithHttpInfo**](ContractsApi.md#getContractAssetWithHttpInfo) | **GET** /contracts/{contractId}/{assetId} | Find a contract asset |
| [**getContracts**](ContractsApi.md#getContracts) | **GET** /contracts | List contracts |
| [**getContractsWithHttpInfo**](ContractsApi.md#getContractsWithHttpInfo) | **GET** /contracts | List contracts |



## addContractAsset

> CompletableFuture<ExternalWalletAsset> addContractAsset(contractId, assetId, addContractAssetRequest, idempotencyKey)

Add an asset to a contract

Adds an asset to an existing contract.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to add
        AddContractAssetRequest addContractAssetRequest = new AddContractAssetRequest(); // AddContractAssetRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ExternalWalletAsset> result = apiInstance.addContractAsset(contractId, assetId, addContractAssetRequest, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#addContractAsset");
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
| **contractId** | **String**| The ID of the contract | |
| **assetId** | **String**| The ID of the asset to add | |
| **addContractAssetRequest** | [**AddContractAssetRequest**](AddContractAssetRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**ExternalWalletAsset**](ExternalWalletAsset.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## addContractAssetWithHttpInfo

> CompletableFuture<ApiResponse<ExternalWalletAsset>> addContractAsset addContractAssetWithHttpInfo(contractId, assetId, addContractAssetRequest, idempotencyKey)

Add an asset to a contract

Adds an asset to an existing contract.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to add
        AddContractAssetRequest addContractAssetRequest = new AddContractAssetRequest(); // AddContractAssetRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ExternalWalletAsset>> response = apiInstance.addContractAssetWithHttpInfo(contractId, assetId, addContractAssetRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractsApi#addContractAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#addContractAsset");
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
| **contractId** | **String**| The ID of the contract | |
| **assetId** | **String**| The ID of the asset to add | |
| **addContractAssetRequest** | [**AddContractAssetRequest**](AddContractAssetRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ExternalWalletAsset**](ExternalWalletAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createContract

> CompletableFuture<UnmanagedWallet> createContract(createContractRequest, idempotencyKey)

Create a contract

Creates a new contract.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        CreateContractRequest createContractRequest = new CreateContractRequest(); // CreateContractRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<UnmanagedWallet> result = apiInstance.createContract(createContractRequest, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#createContract");
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
| **createContractRequest** | [**CreateContractRequest**](CreateContractRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**UnmanagedWallet**](UnmanagedWallet.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createContractWithHttpInfo

> CompletableFuture<ApiResponse<UnmanagedWallet>> createContract createContractWithHttpInfo(createContractRequest, idempotencyKey)

Create a contract

Creates a new contract.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        CreateContractRequest createContractRequest = new CreateContractRequest(); // CreateContractRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<UnmanagedWallet>> response = apiInstance.createContractWithHttpInfo(createContractRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractsApi#createContract");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#createContract");
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
| **createContractRequest** | [**CreateContractRequest**](CreateContractRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**UnmanagedWallet**](UnmanagedWallet.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteContract

> CompletableFuture<Void> deleteContract(contractId)

Delete a contract

Deletes a contract by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract to delete
        try {
            CompletableFuture<Void> result = apiInstance.deleteContract(contractId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#deleteContract");
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
| **contractId** | **String**| The ID of the contract to delete | |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## deleteContractWithHttpInfo

> CompletableFuture<ApiResponse<Void>> deleteContract deleteContractWithHttpInfo(contractId)

Delete a contract

Deletes a contract by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract to delete
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.deleteContractWithHttpInfo(contractId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractsApi#deleteContract");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#deleteContract");
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
| **contractId** | **String**| The ID of the contract to delete | |

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
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteContractAsset

> CompletableFuture<Void> deleteContractAsset(contractId, assetId)

Delete a contract asset

Deletes a contract asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            CompletableFuture<Void> result = apiInstance.deleteContractAsset(contractId, assetId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#deleteContractAsset");
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
| **contractId** | **String**| The ID of the contract | |
| **assetId** | **String**| The ID of the asset to delete | |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## deleteContractAssetWithHttpInfo

> CompletableFuture<ApiResponse<Void>> deleteContractAsset deleteContractAssetWithHttpInfo(contractId, assetId)

Delete a contract asset

Deletes a contract asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.deleteContractAssetWithHttpInfo(contractId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractsApi#deleteContractAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#deleteContractAsset");
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
| **contractId** | **String**| The ID of the contract | |
| **assetId** | **String**| The ID of the asset to delete | |

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
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContract

> CompletableFuture<UnmanagedWallet> getContract(contractId)

Find a specific contract

Returns a contract by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract to return
        try {
            CompletableFuture<UnmanagedWallet> result = apiInstance.getContract(contractId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContract");
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
| **contractId** | **String**| The ID of the contract to return | |

### Return type

CompletableFuture<[**UnmanagedWallet**](UnmanagedWallet.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getContractWithHttpInfo

> CompletableFuture<ApiResponse<UnmanagedWallet>> getContract getContractWithHttpInfo(contractId)

Find a specific contract

Returns a contract by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract to return
        try {
            CompletableFuture<ApiResponse<UnmanagedWallet>> response = apiInstance.getContractWithHttpInfo(contractId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractsApi#getContract");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContract");
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
| **contractId** | **String**| The ID of the contract to return | |

### Return type

CompletableFuture<ApiResponse<[**UnmanagedWallet**](UnmanagedWallet.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContractAsset

> CompletableFuture<ExternalWalletAsset> getContractAsset(contractId, assetId)

Find a contract asset

Returns a contract asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ExternalWalletAsset> result = apiInstance.getContractAsset(contractId, assetId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContractAsset");
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
| **contractId** | **String**| The ID of the contract | |
| **assetId** | **String**| The ID of the asset to return | |

### Return type

CompletableFuture<[**ExternalWalletAsset**](ExternalWalletAsset.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getContractAssetWithHttpInfo

> CompletableFuture<ApiResponse<ExternalWalletAsset>> getContractAsset getContractAssetWithHttpInfo(contractId, assetId)

Find a contract asset

Returns a contract asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            CompletableFuture<ApiResponse<ExternalWalletAsset>> response = apiInstance.getContractAssetWithHttpInfo(contractId, assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractsApi#getContractAsset");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContractAsset");
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
| **contractId** | **String**| The ID of the contract | |
| **assetId** | **String**| The ID of the asset to return | |

### Return type

CompletableFuture<ApiResponse<[**ExternalWalletAsset**](ExternalWalletAsset.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContracts

> CompletableFuture<List<UnmanagedWallet>> getContracts()

List contracts

Gets a list of contracts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        try {
            CompletableFuture<List<UnmanagedWallet>> result = apiInstance.getContracts();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContracts");
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

CompletableFuture<[**List&lt;UnmanagedWallet&gt;**](UnmanagedWallet.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of contracts |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getContractsWithHttpInfo

> CompletableFuture<ApiResponse<List<UnmanagedWallet>>> getContracts getContractsWithHttpInfo()

List contracts

Gets a list of contracts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.ContractsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        ContractsApi apiInstance = new ContractsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<UnmanagedWallet>>> response = apiInstance.getContractsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContractsApi#getContracts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContracts");
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

CompletableFuture<ApiResponse<[**List&lt;UnmanagedWallet&gt;**](UnmanagedWallet.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of contracts |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

