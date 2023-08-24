# GasStationsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGasStation**](GasStationsApi.md#getGasStation) | **GET** /gas_station | Get gas station settings |
| [**getGasStationByAssetId**](GasStationsApi.md#getGasStationByAssetId) | **GET** /gas_station/{assetId} | Get gas station settings by asset |
| [**updateGasStationConfiguration**](GasStationsApi.md#updateGasStationConfiguration) | **PUT** /gas_station/configuration | Edit gas station settings |
| [**updateGasStationConfigurationByAssetId**](GasStationsApi.md#updateGasStationConfigurationByAssetId) | **PUT** /gas_station/configuration/{assetId} | Edit gas station settings for an asset |



## getGasStation

> GasStationPropertiesResponse getGasStation()

Get gas station settings

Returns gas station settings and ETH balance.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.GasStationsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        GasStationsApi apiInstance = new GasStationsApi(configuration);
        try {
            GasStationPropertiesResponse result = apiInstance.getGasStation();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GasStationsApi#getGasStation");
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

[**GasStationPropertiesResponse**](GasStationPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gas Station properties |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getGasStationByAssetId

> GasStationPropertiesResponse getGasStationByAssetId(assetId)

Get gas station settings by asset

Returns gas station settings and balances for a requested asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.GasStationsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        GasStationsApi apiInstance = new GasStationsApi(configuration);
        String assetId = "assetId_example"; // String | The ID of the asset
        try {
            GasStationPropertiesResponse result = apiInstance.getGasStationByAssetId(assetId);
            System.out.println(result);
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

[**GasStationPropertiesResponse**](GasStationPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gas Station properties |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateGasStationConfiguration

> updateGasStationConfiguration(gasStationConfiguration)

Edit gas station settings

Configures gas station settings for ETH.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.GasStationsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        GasStationsApi apiInstance = new GasStationsApi(configuration);
        GasStationConfiguration gasStationConfiguration = new GasStationConfiguration(); // GasStationConfiguration | 
        try {
            apiInstance.updateGasStationConfiguration(gasStationConfiguration);
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

### Return type

null (empty response body)

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

> updateGasStationConfigurationByAssetId(assetId, gasStationConfiguration)

Edit gas station settings for an asset

Configures gas station settings for a requested asset.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.GasStationsApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        GasStationsApi apiInstance = new GasStationsApi(configuration);
        String assetId = "assetId_example"; // String | The ID of the asset
        GasStationConfiguration gasStationConfiguration = new GasStationConfiguration(); // GasStationConfiguration | 
        try {
            apiInstance.updateGasStationConfigurationByAssetId(assetId, gasStationConfiguration);
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
| **assetId** | **String**| The ID of the asset | |
| **gasStationConfiguration** | [**GasStationConfiguration**](GasStationConfiguration.md)|  | |

### Return type

null (empty response body)

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

