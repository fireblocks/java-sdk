# NetworkConnectionsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkThirdPartyRouting**](NetworkConnectionsApi.md#checkThirdPartyRouting) | **GET** /network_connections/{connectionId}/is_third_party_routing/{assetType} | Retrieve third-party network routing validation by asset type. |
| [**checkThirdPartyRoutingWithHttpInfo**](NetworkConnectionsApi.md#checkThirdPartyRoutingWithHttpInfo) | **GET** /network_connections/{connectionId}/is_third_party_routing/{assetType} | Retrieve third-party network routing validation by asset type. |
| [**createNetworkConnection**](NetworkConnectionsApi.md#createNetworkConnection) | **POST** /network_connections | Creates a new network connection |
| [**createNetworkConnectionWithHttpInfo**](NetworkConnectionsApi.md#createNetworkConnectionWithHttpInfo) | **POST** /network_connections | Creates a new network connection |
| [**createNetworkId**](NetworkConnectionsApi.md#createNetworkId) | **POST** /network_ids | Creates a new Network ID |
| [**createNetworkIdWithHttpInfo**](NetworkConnectionsApi.md#createNetworkIdWithHttpInfo) | **POST** /network_ids | Creates a new Network ID |
| [**deleteNetworkConnection**](NetworkConnectionsApi.md#deleteNetworkConnection) | **DELETE** /network_connections/{connectionId} | Deletes a network connection by ID |
| [**deleteNetworkConnectionWithHttpInfo**](NetworkConnectionsApi.md#deleteNetworkConnectionWithHttpInfo) | **DELETE** /network_connections/{connectionId} | Deletes a network connection by ID |
| [**deleteNetworkId**](NetworkConnectionsApi.md#deleteNetworkId) | **DELETE** /network_ids/{networkId} | Deletes specific network ID. |
| [**deleteNetworkIdWithHttpInfo**](NetworkConnectionsApi.md#deleteNetworkIdWithHttpInfo) | **DELETE** /network_ids/{networkId} | Deletes specific network ID. |
| [**getNetwork**](NetworkConnectionsApi.md#getNetwork) | **GET** /network_connections/{connectionId} | Get a network connection |
| [**getNetworkWithHttpInfo**](NetworkConnectionsApi.md#getNetworkWithHttpInfo) | **GET** /network_connections/{connectionId} | Get a network connection |
| [**getNetworkConnections**](NetworkConnectionsApi.md#getNetworkConnections) | **GET** /network_connections | List network connections |
| [**getNetworkConnectionsWithHttpInfo**](NetworkConnectionsApi.md#getNetworkConnectionsWithHttpInfo) | **GET** /network_connections | List network connections |
| [**getNetworkId**](NetworkConnectionsApi.md#getNetworkId) | **GET** /network_ids/{networkId} | Returns specific network ID. |
| [**getNetworkIdWithHttpInfo**](NetworkConnectionsApi.md#getNetworkIdWithHttpInfo) | **GET** /network_ids/{networkId} | Returns specific network ID. |
| [**getNetworkIds**](NetworkConnectionsApi.md#getNetworkIds) | **GET** /network_ids | Returns all network IDs, both local IDs and discoverable remote IDs |
| [**getNetworkIdsWithHttpInfo**](NetworkConnectionsApi.md#getNetworkIdsWithHttpInfo) | **GET** /network_ids | Returns all network IDs, both local IDs and discoverable remote IDs |
| [**setNetworkIdDiscoverability**](NetworkConnectionsApi.md#setNetworkIdDiscoverability) | **PATCH** /network_ids/{networkId}/set_discoverability | Update network ID&#39;s discoverability. |
| [**setNetworkIdDiscoverabilityWithHttpInfo**](NetworkConnectionsApi.md#setNetworkIdDiscoverabilityWithHttpInfo) | **PATCH** /network_ids/{networkId}/set_discoverability | Update network ID&#39;s discoverability. |
| [**setNetworkIdName**](NetworkConnectionsApi.md#setNetworkIdName) | **PATCH** /network_ids/{networkId}/set_name | Update network ID&#39;s name. |
| [**setNetworkIdNameWithHttpInfo**](NetworkConnectionsApi.md#setNetworkIdNameWithHttpInfo) | **PATCH** /network_ids/{networkId}/set_name | Update network ID&#39;s name. |
| [**setNetworkIdRoutingPolicy**](NetworkConnectionsApi.md#setNetworkIdRoutingPolicy) | **PATCH** /network_ids/{networkId}/set_routing_policy | Update network id routing policy. |
| [**setNetworkIdRoutingPolicyWithHttpInfo**](NetworkConnectionsApi.md#setNetworkIdRoutingPolicyWithHttpInfo) | **PATCH** /network_ids/{networkId}/set_routing_policy | Update network id routing policy. |
| [**setRoutingPolicy**](NetworkConnectionsApi.md#setRoutingPolicy) | **PATCH** /network_connections/{connectionId}/set_routing_policy | Update network connection routing policy. |
| [**setRoutingPolicyWithHttpInfo**](NetworkConnectionsApi.md#setRoutingPolicyWithHttpInfo) | **PATCH** /network_connections/{connectionId}/set_routing_policy | Update network connection routing policy. |



## checkThirdPartyRouting

> CompletableFuture<ThirdPartyRouting> checkThirdPartyRouting(connectionId, assetType)

Retrieve third-party network routing validation by asset type.

The Fireblocks Network allows for flexibility around incoming deposits. A receiver can receive network deposits to locations other than Fireblocks. This endpoint validates whether future transactions are routed to the displayed recipient or to a 3rd party.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection
        String assetType = "CRYPTO"; // String | The destination asset type
        try {
            CompletableFuture<ThirdPartyRouting> result = apiInstance.checkThirdPartyRouting(connectionId, assetType);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#checkThirdPartyRouting");
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
| **connectionId** | **String**| The ID of the network connection | |
| **assetType** | **String**| The destination asset type | [enum: CRYPTO, SIGNET, SEN, SIGNET_TEST, SEN_TEST] |

### Return type

CompletableFuture<[**ThirdPartyRouting**](ThirdPartyRouting.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | result for the validation |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## checkThirdPartyRoutingWithHttpInfo

> CompletableFuture<ApiResponse<ThirdPartyRouting>> checkThirdPartyRouting checkThirdPartyRoutingWithHttpInfo(connectionId, assetType)

Retrieve third-party network routing validation by asset type.

The Fireblocks Network allows for flexibility around incoming deposits. A receiver can receive network deposits to locations other than Fireblocks. This endpoint validates whether future transactions are routed to the displayed recipient or to a 3rd party.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection
        String assetType = "CRYPTO"; // String | The destination asset type
        try {
            CompletableFuture<ApiResponse<ThirdPartyRouting>> response = apiInstance.checkThirdPartyRoutingWithHttpInfo(connectionId, assetType);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#checkThirdPartyRouting");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#checkThirdPartyRouting");
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
| **connectionId** | **String**| The ID of the network connection | |
| **assetType** | **String**| The destination asset type | [enum: CRYPTO, SIGNET, SEN, SIGNET_TEST, SEN_TEST] |

### Return type

CompletableFuture<ApiResponse<[**ThirdPartyRouting**](ThirdPartyRouting.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | result for the validation |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createNetworkConnection

> CompletableFuture<NetworkConnectionResponse> createNetworkConnection(networkConnection, idempotencyKey)

Creates a new network connection

Initiates a new network connection.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        NetworkConnection networkConnection = new NetworkConnection(); // NetworkConnection | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<NetworkConnectionResponse> result = apiInstance.createNetworkConnection(networkConnection, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#createNetworkConnection");
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
| **networkConnection** | [**NetworkConnection**](NetworkConnection.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**NetworkConnectionResponse**](NetworkConnectionResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A Network Connection object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createNetworkConnectionWithHttpInfo

> CompletableFuture<ApiResponse<NetworkConnectionResponse>> createNetworkConnection createNetworkConnectionWithHttpInfo(networkConnection, idempotencyKey)

Creates a new network connection

Initiates a new network connection.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        NetworkConnection networkConnection = new NetworkConnection(); // NetworkConnection | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<NetworkConnectionResponse>> response = apiInstance.createNetworkConnectionWithHttpInfo(networkConnection, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#createNetworkConnection");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#createNetworkConnection");
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
| **networkConnection** | [**NetworkConnection**](NetworkConnection.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**NetworkConnectionResponse**](NetworkConnectionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A Network Connection object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createNetworkId

> CompletableFuture<NetworkIdResponse> createNetworkId(createNetworkIdRequest, idempotencyKey)

Creates a new Network ID

Creates a new Network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        CreateNetworkIdRequest createNetworkIdRequest = new CreateNetworkIdRequest(); // CreateNetworkIdRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<NetworkIdResponse> result = apiInstance.createNetworkId(createNetworkIdRequest, idempotencyKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#createNetworkId");
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
| **createNetworkIdRequest** | [**CreateNetworkIdRequest**](CreateNetworkIdRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<[**NetworkIdResponse**](NetworkIdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the new network ID in your workspace |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## createNetworkIdWithHttpInfo

> CompletableFuture<ApiResponse<NetworkIdResponse>> createNetworkId createNetworkIdWithHttpInfo(createNetworkIdRequest, idempotencyKey)

Creates a new Network ID

Creates a new Network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        CreateNetworkIdRequest createNetworkIdRequest = new CreateNetworkIdRequest(); // CreateNetworkIdRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<NetworkIdResponse>> response = apiInstance.createNetworkIdWithHttpInfo(createNetworkIdRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#createNetworkId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#createNetworkId");
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
| **createNetworkIdRequest** | [**CreateNetworkIdRequest**](CreateNetworkIdRequest.md)|  | [optional] |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**NetworkIdResponse**](NetworkIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the new network ID in your workspace |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteNetworkConnection

> CompletableFuture<SetRoutingPolicy200Response> deleteNetworkConnection(connectionId)

Deletes a network connection by ID

Deletes an existing network connection specified by its connection ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection to delete
        try {
            CompletableFuture<SetRoutingPolicy200Response> result = apiInstance.deleteNetworkConnection(connectionId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#deleteNetworkConnection");
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
| **connectionId** | **String**| The ID of the network connection to delete | |

### Return type

CompletableFuture<[**SetRoutingPolicy200Response**](SetRoutingPolicy200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## deleteNetworkConnectionWithHttpInfo

> CompletableFuture<ApiResponse<SetRoutingPolicy200Response>> deleteNetworkConnection deleteNetworkConnectionWithHttpInfo(connectionId)

Deletes a network connection by ID

Deletes an existing network connection specified by its connection ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection to delete
        try {
            CompletableFuture<ApiResponse<SetRoutingPolicy200Response>> response = apiInstance.deleteNetworkConnectionWithHttpInfo(connectionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#deleteNetworkConnection");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#deleteNetworkConnection");
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
| **connectionId** | **String**| The ID of the network connection to delete | |

### Return type

CompletableFuture<ApiResponse<[**SetRoutingPolicy200Response**](SetRoutingPolicy200Response.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteNetworkId

> CompletableFuture<SetRoutingPolicy200Response> deleteNetworkId(networkId)

Deletes specific network ID.

Deletes a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            CompletableFuture<SetRoutingPolicy200Response> result = apiInstance.deleteNetworkId(networkId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#deleteNetworkId");
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
| **networkId** | **String**| The ID of the network | |

### Return type

CompletableFuture<[**SetRoutingPolicy200Response**](SetRoutingPolicy200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## deleteNetworkIdWithHttpInfo

> CompletableFuture<ApiResponse<SetRoutingPolicy200Response>> deleteNetworkId deleteNetworkIdWithHttpInfo(networkId)

Deletes specific network ID.

Deletes a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            CompletableFuture<ApiResponse<SetRoutingPolicy200Response>> response = apiInstance.deleteNetworkIdWithHttpInfo(networkId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#deleteNetworkId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#deleteNetworkId");
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
| **networkId** | **String**| The ID of the network | |

### Return type

CompletableFuture<ApiResponse<[**SetRoutingPolicy200Response**](SetRoutingPolicy200Response.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNetwork

> CompletableFuture<NetworkConnectionResponse> getNetwork(connectionId)

Get a network connection

Gets a network connection by ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the connection
        try {
            CompletableFuture<NetworkConnectionResponse> result = apiInstance.getNetwork(connectionId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetwork");
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
| **connectionId** | **String**| The ID of the connection | |

### Return type

CompletableFuture<[**NetworkConnectionResponse**](NetworkConnectionResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A network connection |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getNetworkWithHttpInfo

> CompletableFuture<ApiResponse<NetworkConnectionResponse>> getNetwork getNetworkWithHttpInfo(connectionId)

Get a network connection

Gets a network connection by ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the connection
        try {
            CompletableFuture<ApiResponse<NetworkConnectionResponse>> response = apiInstance.getNetworkWithHttpInfo(connectionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#getNetwork");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetwork");
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
| **connectionId** | **String**| The ID of the connection | |

### Return type

CompletableFuture<ApiResponse<[**NetworkConnectionResponse**](NetworkConnectionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A network connection |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNetworkConnections

> CompletableFuture<List<NetworkConnectionResponse>> getNetworkConnections()

List network connections

Returns all network connections.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        try {
            CompletableFuture<List<NetworkConnectionResponse>> result = apiInstance.getNetworkConnections();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkConnections");
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

CompletableFuture<[**List&lt;NetworkConnectionResponse&gt;**](NetworkConnectionResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of network connections |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getNetworkConnectionsWithHttpInfo

> CompletableFuture<ApiResponse<List<NetworkConnectionResponse>>> getNetworkConnections getNetworkConnectionsWithHttpInfo()

List network connections

Returns all network connections.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<NetworkConnectionResponse>>> response = apiInstance.getNetworkConnectionsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkConnections");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkConnections");
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

CompletableFuture<ApiResponse<[**List&lt;NetworkConnectionResponse&gt;**](NetworkConnectionResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of network connections |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNetworkId

> CompletableFuture<NetworkIdResponse> getNetworkId(networkId)

Returns specific network ID.

Retrieves a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            CompletableFuture<NetworkIdResponse> result = apiInstance.getNetworkId(networkId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkId");
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
| **networkId** | **String**| The ID of the network | |

### Return type

CompletableFuture<[**NetworkIdResponse**](NetworkIdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getNetworkIdWithHttpInfo

> CompletableFuture<ApiResponse<NetworkIdResponse>> getNetworkId getNetworkIdWithHttpInfo(networkId)

Returns specific network ID.

Retrieves a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            CompletableFuture<ApiResponse<NetworkIdResponse>> response = apiInstance.getNetworkIdWithHttpInfo(networkId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkId");
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
| **networkId** | **String**| The ID of the network | |

### Return type

CompletableFuture<ApiResponse<[**NetworkIdResponse**](NetworkIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNetworkIds

> CompletableFuture<List<NetworkIdResponse>> getNetworkIds()

Returns all network IDs, both local IDs and discoverable remote IDs

Retrieves a list of all local and discoverable remote network IDs.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        try {
            CompletableFuture<List<NetworkIdResponse>> result = apiInstance.getNetworkIds();
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkIds");
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

CompletableFuture<[**List&lt;NetworkIdResponse&gt;**](NetworkIdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of network IDs |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## getNetworkIdsWithHttpInfo

> CompletableFuture<ApiResponse<List<NetworkIdResponse>>> getNetworkIds getNetworkIdsWithHttpInfo()

Returns all network IDs, both local IDs and discoverable remote IDs

Retrieves a list of all local and discoverable remote network IDs.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<List<NetworkIdResponse>>> response = apiInstance.getNetworkIdsWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkIds");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkIds");
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

CompletableFuture<ApiResponse<[**List&lt;NetworkIdResponse&gt;**](NetworkIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of network IDs |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setNetworkIdDiscoverability

> CompletableFuture<SetNetworkIdResponse> setNetworkIdDiscoverability(setNetworkIdDiscoverabilityRequest, networkId)

Update network ID&#39;s discoverability.

Update whether or not the network ID is discoverable by others.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        SetNetworkIdDiscoverabilityRequest setNetworkIdDiscoverabilityRequest = new SetNetworkIdDiscoverabilityRequest(); // SetNetworkIdDiscoverabilityRequest | 
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            CompletableFuture<SetNetworkIdResponse> result = apiInstance.setNetworkIdDiscoverability(setNetworkIdDiscoverabilityRequest, networkId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdDiscoverability");
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
| **setNetworkIdDiscoverabilityRequest** | [**SetNetworkIdDiscoverabilityRequest**](SetNetworkIdDiscoverabilityRequest.md)|  | |
| **networkId** | **String**| The ID of the network | |

### Return type

CompletableFuture<[**SetNetworkIdResponse**](SetNetworkIdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## setNetworkIdDiscoverabilityWithHttpInfo

> CompletableFuture<ApiResponse<SetNetworkIdResponse>> setNetworkIdDiscoverability setNetworkIdDiscoverabilityWithHttpInfo(setNetworkIdDiscoverabilityRequest, networkId)

Update network ID&#39;s discoverability.

Update whether or not the network ID is discoverable by others.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        SetNetworkIdDiscoverabilityRequest setNetworkIdDiscoverabilityRequest = new SetNetworkIdDiscoverabilityRequest(); // SetNetworkIdDiscoverabilityRequest | 
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            CompletableFuture<ApiResponse<SetNetworkIdResponse>> response = apiInstance.setNetworkIdDiscoverabilityWithHttpInfo(setNetworkIdDiscoverabilityRequest, networkId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdDiscoverability");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdDiscoverability");
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
| **setNetworkIdDiscoverabilityRequest** | [**SetNetworkIdDiscoverabilityRequest**](SetNetworkIdDiscoverabilityRequest.md)|  | |
| **networkId** | **String**| The ID of the network | |

### Return type

CompletableFuture<ApiResponse<[**SetNetworkIdResponse**](SetNetworkIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setNetworkIdName

> CompletableFuture<SetNetworkIdResponse> setNetworkIdName(setNetworkIdNameRequest, networkId)

Update network ID&#39;s name.

Updates name of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        SetNetworkIdNameRequest setNetworkIdNameRequest = new SetNetworkIdNameRequest(); // SetNetworkIdNameRequest | 
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            CompletableFuture<SetNetworkIdResponse> result = apiInstance.setNetworkIdName(setNetworkIdNameRequest, networkId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdName");
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
| **setNetworkIdNameRequest** | [**SetNetworkIdNameRequest**](SetNetworkIdNameRequest.md)|  | |
| **networkId** | **String**| The ID of the network | |

### Return type

CompletableFuture<[**SetNetworkIdResponse**](SetNetworkIdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## setNetworkIdNameWithHttpInfo

> CompletableFuture<ApiResponse<SetNetworkIdResponse>> setNetworkIdName setNetworkIdNameWithHttpInfo(setNetworkIdNameRequest, networkId)

Update network ID&#39;s name.

Updates name of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        SetNetworkIdNameRequest setNetworkIdNameRequest = new SetNetworkIdNameRequest(); // SetNetworkIdNameRequest | 
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            CompletableFuture<ApiResponse<SetNetworkIdResponse>> response = apiInstance.setNetworkIdNameWithHttpInfo(setNetworkIdNameRequest, networkId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdName");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdName");
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
| **setNetworkIdNameRequest** | [**SetNetworkIdNameRequest**](SetNetworkIdNameRequest.md)|  | |
| **networkId** | **String**| The ID of the network | |

### Return type

CompletableFuture<ApiResponse<[**SetNetworkIdResponse**](SetNetworkIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setNetworkIdRoutingPolicy

> CompletableFuture<SetNetworkIdResponse> setNetworkIdRoutingPolicy(networkId, setNetworkIdRoutingPolicyRequest)

Update network id routing policy.

Updates the routing policy of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        SetNetworkIdRoutingPolicyRequest setNetworkIdRoutingPolicyRequest = new SetNetworkIdRoutingPolicyRequest(); // SetNetworkIdRoutingPolicyRequest | 
        try {
            CompletableFuture<SetNetworkIdResponse> result = apiInstance.setNetworkIdRoutingPolicy(networkId, setNetworkIdRoutingPolicyRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdRoutingPolicy");
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
| **networkId** | **String**| The ID of the network | |
| **setNetworkIdRoutingPolicyRequest** | [**SetNetworkIdRoutingPolicyRequest**](SetNetworkIdRoutingPolicyRequest.md)|  | [optional] |

### Return type

CompletableFuture<[**SetNetworkIdResponse**](SetNetworkIdResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## setNetworkIdRoutingPolicyWithHttpInfo

> CompletableFuture<ApiResponse<SetNetworkIdResponse>> setNetworkIdRoutingPolicy setNetworkIdRoutingPolicyWithHttpInfo(networkId, setNetworkIdRoutingPolicyRequest)

Update network id routing policy.

Updates the routing policy of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        SetNetworkIdRoutingPolicyRequest setNetworkIdRoutingPolicyRequest = new SetNetworkIdRoutingPolicyRequest(); // SetNetworkIdRoutingPolicyRequest | 
        try {
            CompletableFuture<ApiResponse<SetNetworkIdResponse>> response = apiInstance.setNetworkIdRoutingPolicyWithHttpInfo(networkId, setNetworkIdRoutingPolicyRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdRoutingPolicy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setNetworkIdRoutingPolicy");
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
| **networkId** | **String**| The ID of the network | |
| **setNetworkIdRoutingPolicyRequest** | [**SetNetworkIdRoutingPolicyRequest**](SetNetworkIdRoutingPolicyRequest.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SetNetworkIdResponse**](SetNetworkIdResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setRoutingPolicy

> CompletableFuture<SetRoutingPolicy200Response> setRoutingPolicy(connectionId, setRoutingPolicyRequest)

Update network connection routing policy.

Updates an existing network connection&#39;s routing policy.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection
        SetRoutingPolicyRequest setRoutingPolicyRequest = new SetRoutingPolicyRequest(); // SetRoutingPolicyRequest | 
        try {
            CompletableFuture<SetRoutingPolicy200Response> result = apiInstance.setRoutingPolicy(connectionId, setRoutingPolicyRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setRoutingPolicy");
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
| **connectionId** | **String**| The ID of the network connection | |
| **setRoutingPolicyRequest** | [**SetRoutingPolicyRequest**](SetRoutingPolicyRequest.md)|  | [optional] |

### Return type

CompletableFuture<[**SetRoutingPolicy200Response**](SetRoutingPolicy200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

## setRoutingPolicyWithHttpInfo

> CompletableFuture<ApiResponse<SetRoutingPolicy200Response>> setRoutingPolicy setRoutingPolicyWithHttpInfo(connectionId, setRoutingPolicyRequest)

Update network connection routing policy.

Updates an existing network connection&#39;s routing policy.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.models.*;
import com.fireblocks.sdk.api.NetworkConnectionsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection
        SetRoutingPolicyRequest setRoutingPolicyRequest = new SetRoutingPolicyRequest(); // SetRoutingPolicyRequest | 
        try {
            CompletableFuture<ApiResponse<SetRoutingPolicy200Response>> response = apiInstance.setRoutingPolicyWithHttpInfo(connectionId, setRoutingPolicyRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling NetworkConnectionsApi#setRoutingPolicy");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setRoutingPolicy");
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
| **connectionId** | **String**| The ID of the network connection | |
| **setRoutingPolicyRequest** | [**SetRoutingPolicyRequest**](SetRoutingPolicyRequest.md)|  | [optional] |

### Return type

CompletableFuture<ApiResponse<[**SetRoutingPolicy200Response**](SetRoutingPolicy200Response.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

