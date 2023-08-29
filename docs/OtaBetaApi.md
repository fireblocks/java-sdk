# OtaBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOtaStatus**](OtaBetaApi.md#getOtaStatus) | **GET** /management/ota | Returns current OTA status |
| [**setOtaStatus**](OtaBetaApi.md#setOtaStatus) | **POST** /management/ota | Enable or disable transactions to OTA |



## getOtaStatus

> GetOtaStatus200Response getOtaStatus()

Returns current OTA status

Returns current OTA status

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.OtaBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        OtaBetaApi apiInstance = new OtaBetaApi(configuration);
        try {
            GetOtaStatus200Response result = apiInstance.getOtaStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OtaBetaApi#getOtaStatus");
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

[**GetOtaStatus200Response**](GetOtaStatus200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current OTA status |  -  |
| **404** | Configuration not found for tenant |  -  |


## setOtaStatus

> setOtaStatus(setOtaStatusRequest)

Enable or disable transactions to OTA

Enable or disable transactions to OTA

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.OtaBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        OtaBetaApi apiInstance = new OtaBetaApi(configuration);
        SetOtaStatusRequest setOtaStatusRequest = new SetOtaStatusRequest(); // SetOtaStatusRequest | 
        try {
            apiInstance.setOtaStatus(setOtaStatusRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OtaBetaApi#setOtaStatus");
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
| **setOtaStatusRequest** | [**SetOtaStatusRequest**](SetOtaStatusRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successfully updated OTA status |  -  |
| **400** | Bad request |  -  |
| **409** | Similar request already pending |  -  |
| **500** | Internal server error |  -  |

