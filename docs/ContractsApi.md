# ContractsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAssetToContract**](ContractsApi.md#addAssetToContract) | **POST** /contracts/{contractId}/{assetId} | Add an asset to a contract |
| [**createContract**](ContractsApi.md#createContract) | **POST** /contracts | Create a contract |
| [**deleteContract**](ContractsApi.md#deleteContract) | **DELETE** /contracts/{contractId} | Delete a contract |
| [**getAssetInContract**](ContractsApi.md#getAssetInContract) | **GET** /contracts/{contractId}/{assetId} | Find a contract asset |
| [**getContractById**](ContractsApi.md#getContractById) | **GET** /contracts/{contractId} | Find a specific contract |
| [**getContracts**](ContractsApi.md#getContracts) | **GET** /contracts | List contracts |
| [**removeAssetFromContract**](ContractsApi.md#removeAssetFromContract) | **DELETE** /contracts/{contractId}/{assetId} | Delete a contract asset |



## addAssetToContract

> ExternalWalletAsset addAssetToContract(contractId, assetId, addAssetToContractRequest)

Add an asset to a contract

Adds an asset to an existing contract.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ContractsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ContractsApi apiInstance = new ContractsApi(configuration);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to add
        AddAssetToContractRequest addAssetToContractRequest = new AddAssetToContractRequest(); // AddAssetToContractRequest | 
        try {
            ExternalWalletAsset result = apiInstance.addAssetToContract(contractId, assetId, addAssetToContractRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#addAssetToContract");
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
| **addAssetToContractRequest** | [**AddAssetToContractRequest**](AddAssetToContractRequest.md)|  | [optional] |

### Return type

[**ExternalWalletAsset**](ExternalWalletAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createContract

> UnmanagedWallet createContract(createContractRequest)

Create a contract

Creates a new contract.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ContractsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ContractsApi apiInstance = new ContractsApi(configuration);
        CreateContractRequest createContractRequest = new CreateContractRequest(); // CreateContractRequest | 
        try {
            UnmanagedWallet result = apiInstance.createContract(createContractRequest);
            System.out.println(result);
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

### Return type

[**UnmanagedWallet**](UnmanagedWallet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteContract

> deleteContract(contractId)

Delete a contract

Deletes a contract by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ContractsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ContractsApi apiInstance = new ContractsApi(configuration);
        String contractId = "contractId_example"; // String | The ID of the contract to delete
        try {
            apiInstance.deleteContract(contractId);
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

null (empty response body)

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


## getAssetInContract

> ExternalWalletAsset getAssetInContract(contractId, assetId)

Find a contract asset

Returns a contract asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ContractsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ContractsApi apiInstance = new ContractsApi(configuration);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to return
        try {
            ExternalWalletAsset result = apiInstance.getAssetInContract(contractId, assetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getAssetInContract");
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

[**ExternalWalletAsset**](ExternalWalletAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet Asset object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContractById

> UnmanagedWallet getContractById(contractId)

Find a specific contract

Returns a contract by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ContractsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ContractsApi apiInstance = new ContractsApi(configuration);
        String contractId = "contractId_example"; // String | The ID of the contract to return
        try {
            UnmanagedWallet result = apiInstance.getContractById(contractId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#getContractById");
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

[**UnmanagedWallet**](UnmanagedWallet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Wallet object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getContracts

> List&lt;UnmanagedWallet&gt; getContracts()

List contracts

Gets a list of contracts.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ContractsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ContractsApi apiInstance = new ContractsApi(configuration);
        try {
            List<UnmanagedWallet> result = apiInstance.getContracts();
            System.out.println(result);
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

[**List&lt;UnmanagedWallet&gt;**](UnmanagedWallet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of contracts |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## removeAssetFromContract

> removeAssetFromContract(contractId, assetId)

Delete a contract asset

Deletes a contract asset by ID.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.ContractsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        ContractsApi apiInstance = new ContractsApi(configuration);
        String contractId = "contractId_example"; // String | The ID of the contract
        String assetId = "assetId_example"; // String | The ID of the asset to delete
        try {
            apiInstance.removeAssetFromContract(contractId, assetId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractsApi#removeAssetFromContract");
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

null (empty response body)

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

