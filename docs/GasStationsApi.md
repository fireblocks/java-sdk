# GasStationsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGasStationByAssetId**](GasStationsApi.md#getGasStationByAssetId) | **GET** /gas_station/{assetId} | Get gas station settings by asset |
| [**getGasStationByAssetIdWithHttpInfo**](GasStationsApi.md#getGasStationByAssetIdWithHttpInfo) | **GET** /gas_station/{assetId} | Get gas station settings by asset |
| [**getGasStationInfo**](GasStationsApi.md#getGasStationInfo) | **GET** /gas_station | Get gas station settings |
| [**getGasStationInfoWithHttpInfo**](GasStationsApi.md#getGasStationInfoWithHttpInfo) | **GET** /gas_station | Get gas station settings |
| [**updateGasStationConfiguration**](GasStationsApi.md#updateGasStationConfiguration) | **PUT** /gas_station/configuration | Edit gas station settings |
| [**updateGasStationConfigurationWithHttpInfo**](GasStationsApi.md#updateGasStationConfigurationWithHttpInfo) | **PUT** /gas_station/configuration | Edit gas station settings |
| [**updateGasStationConfigurationByAssetId**](GasStationsApi.md#updateGasStationConfigurationByAssetId) | **PUT** /gas_station/configuration/{assetId} | Edit gas station settings for an asset |
| [**updateGasStationConfigurationByAssetIdWithHttpInfo**](GasStationsApi.md#updateGasStationConfigurationByAssetIdWithHttpInfo) | **PUT** /gas_station/configuration/{assetId} | Edit gas station settings for an asset |



## getGasStationByAssetId

> CompletableFuture<GasStationPropertiesResponse> getGasStationByAssetId(assetId)

Get gas station settings by asset

Returns gas station settings and balances for a requested asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.GasStationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        GasStationsApi apiInstance = new GasStationsApi(defaultClient);
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<GasStationPropertiesResponse> result = apiInstance.getGasStationByAssetId(assetId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#getGasStationByAssetId");
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
| **assetId** | **String**| The ID of the asset | |

### Return type

CompletableFuture<[**GasStationPropertiesResponse**](GasStationPropertiesResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gas Station properties |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getGasStationByAssetIdWithHttpInfo

> CompletableFuture<ApiResponse<GasStationPropertiesResponse>> getGasStationByAssetId getGasStationByAssetIdWithHttpInfo(assetId)

Get gas station settings by asset

Returns gas station settings and balances for a requested asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.GasStationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        GasStationsApi apiInstance = new GasStationsApi(defaultClient);
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            CompletableFuture<ApiResponse<GasStationPropertiesResponse>> response = apiInstance.getGasStationByAssetIdWithHttpInfo(assetId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GasStationsApi#getGasStationByAssetId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#getGasStationByAssetId");
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
| **assetId** | **String**| The ID of the asset | |

### Return type

CompletableFuture<ApiResponse<[**GasStationPropertiesResponse**](GasStationPropertiesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gas Station properties |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getGasStationInfo

> CompletableFuture<GasStationPropertiesResponse> getGasStationInfo()

Get gas station settings

Returns gas station settings and ETH balance.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.GasStationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        GasStationsApi apiInstance = new GasStationsApi(defaultClient);
        try {
            CompletableFuture<GasStationPropertiesResponse> result = apiInstance.getGasStationInfo();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#getGasStationInfo");
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

CompletableFuture<[**GasStationPropertiesResponse**](GasStationPropertiesResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gas Station properties |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getGasStationInfoWithHttpInfo

> CompletableFuture<ApiResponse<GasStationPropertiesResponse>> getGasStationInfo getGasStationInfoWithHttpInfo()

Get gas station settings

Returns gas station settings and ETH balance.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.GasStationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        GasStationsApi apiInstance = new GasStationsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<GasStationPropertiesResponse>> response = apiInstance.getGasStationInfoWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GasStationsApi#getGasStationInfo");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#getGasStationInfo");
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

CompletableFuture<ApiResponse<[**GasStationPropertiesResponse**](GasStationPropertiesResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gas Station properties |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateGasStationConfiguration

> CompletableFuture<Void> updateGasStationConfiguration(gasStationConfiguration, idempotencyKey)

Edit gas station settings

Configures gas station settings for ETH.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.GasStationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        GasStationsApi apiInstance = new GasStationsApi(defaultClient);
        GasStationConfiguration gasStationConfiguration = new GasStationConfiguration(); // GasStationConfiguration | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.updateGasStationConfiguration(gasStationConfiguration, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#updateGasStationConfiguration");
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
| **gasStationConfiguration** | [**GasStationConfiguration**](GasStationConfiguration.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## updateGasStationConfigurationWithHttpInfo

> CompletableFuture<ApiResponse<Void>> updateGasStationConfiguration updateGasStationConfigurationWithHttpInfo(gasStationConfiguration, idempotencyKey)

Edit gas station settings

Configures gas station settings for ETH.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.GasStationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        GasStationsApi apiInstance = new GasStationsApi(defaultClient);
        GasStationConfiguration gasStationConfiguration = new GasStationConfiguration(); // GasStationConfiguration | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.updateGasStationConfigurationWithHttpInfo(gasStationConfiguration, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GasStationsApi#updateGasStationConfiguration");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#updateGasStationConfiguration");
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
| **gasStationConfiguration** | [**GasStationConfiguration**](GasStationConfiguration.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

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
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateGasStationConfigurationByAssetId

> CompletableFuture<Void> updateGasStationConfigurationByAssetId(gasStationConfiguration, assetId, idempotencyKey)

Edit gas station settings for an asset

Configures gas station settings for a requested asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.GasStationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        GasStationsApi apiInstance = new GasStationsApi(defaultClient);
        GasStationConfiguration gasStationConfiguration = new GasStationConfiguration(); // GasStationConfiguration | 
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<Void> result = apiInstance.updateGasStationConfigurationByAssetId(gasStationConfiguration, assetId, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#updateGasStationConfigurationByAssetId");
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
| **gasStationConfiguration** | [**GasStationConfiguration**](GasStationConfiguration.md)|  | |
| **assetId** | **String**| The ID of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<void> (empty response body)

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

## updateGasStationConfigurationByAssetIdWithHttpInfo

> CompletableFuture<ApiResponse<Void>> updateGasStationConfigurationByAssetId updateGasStationConfigurationByAssetIdWithHttpInfo(gasStationConfiguration, assetId, idempotencyKey)

Edit gas station settings for an asset

Configures gas station settings for a requested asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.GasStationsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        GasStationsApi apiInstance = new GasStationsApi(defaultClient);
        GasStationConfiguration gasStationConfiguration = new GasStationConfiguration(); // GasStationConfiguration | 
        String assetId = "assetId_example"; // String | The ID of the asset
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.updateGasStationConfigurationByAssetIdWithHttpInfo(gasStationConfiguration, assetId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling GasStationsApi#updateGasStationConfigurationByAssetId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#updateGasStationConfigurationByAssetId");
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
| **gasStationConfiguration** | [**GasStationConfiguration**](GasStationConfiguration.md)|  | |
| **assetId** | **String**| The ID of the asset | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

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
| **201** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

