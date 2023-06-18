# SupportedAssetsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSupportedAssets**](SupportedAssetsApi.md#getSupportedAssets) | **GET** /supported_assets | List all asset types supported by Fireblocks |



## getSupportedAssets

> List&lt;AssetTypeResponse&gt; getSupportedAssets()

List all asset types supported by Fireblocks

Returns all asset types supported by Fireblocks.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportedAssetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        SupportedAssetsApi apiInstance = new SupportedAssetsApi(defaultClient);
        try {
            List<AssetTypeResponse> result = apiInstance.getSupportedAssets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupportedAssetsApi#getSupportedAssets");
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

[**List&lt;AssetTypeResponse&gt;**](AssetTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Transaction object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

