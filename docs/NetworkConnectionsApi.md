# NetworkConnectionsApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkThirdPartyRoutingForNetworkConnection**](NetworkConnectionsApi.md#checkThirdPartyRoutingForNetworkConnection) | **GET** /network_connections/{connectionId}/is_third_party_routing/{assetType} | Retrieve third-party network routing validation by asset type. |
| [**createNetworkConnection**](NetworkConnectionsApi.md#createNetworkConnection) | **POST** /network_connections | Creates a new network connection |
| [**createNetworkId**](NetworkConnectionsApi.md#createNetworkId) | **POST** /network_ids | Creates a new Network ID |
| [**deleteNetworkConnection**](NetworkConnectionsApi.md#deleteNetworkConnection) | **DELETE** /network_connections/{connectionId} | Deletes a network connection by ID |
| [**deleteNetworkId**](NetworkConnectionsApi.md#deleteNetworkId) | **DELETE** /network_ids/{networkId} | Deletes specific network ID. |
| [**getNetworkConnectionById**](NetworkConnectionsApi.md#getNetworkConnectionById) | **GET** /network_connections/{connectionId} | Get a network connection |
| [**getNetworkConnections**](NetworkConnectionsApi.md#getNetworkConnections) | **GET** /network_connections | List network connections |
| [**getNetworkIdById**](NetworkConnectionsApi.md#getNetworkIdById) | **GET** /network_ids/{networkId} | Returns specific network ID. |
| [**getNetworkIds**](NetworkConnectionsApi.md#getNetworkIds) | **GET** /network_ids | Returns all network IDs, both local IDs and discoverable remote IDs |
| [**setDiscoverabilityForNetworkId**](NetworkConnectionsApi.md#setDiscoverabilityForNetworkId) | **PATCH** /network_ids/{networkId}/set_discoverability | Update network ID&#39;s discoverability. |
| [**setNetworkIdName**](NetworkConnectionsApi.md#setNetworkIdName) | **PATCH** /network_ids/{networkId}/set_name | Update network ID&#39;s name. |
| [**setRoutingPolicyForNetworkConnection**](NetworkConnectionsApi.md#setRoutingPolicyForNetworkConnection) | **PATCH** /network_connections/{connectionId}/set_routing_policy | Update network connection routing policy. |
| [**setRoutingPolicyForNetworkId**](NetworkConnectionsApi.md#setRoutingPolicyForNetworkId) | **PATCH** /network_ids/{networkId}/set_routing_policy | Update network id routing policy. |



## checkThirdPartyRoutingForNetworkConnection

> CheckThirdPartyRoutingForNetworkConnection200Response checkThirdPartyRoutingForNetworkConnection(connectionId, assetType)

Retrieve third-party network routing validation by asset type.

The Fireblocks Network allows for flexibility around incoming deposits. A receiver can receive network deposits to locations other than Fireblocks. This endpoint validates whether future transactions are routed to the displayed recipient or to a 3rd party.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection
        String assetType = "CRYPTO"; // String | The destination asset type
        try {
            CheckThirdPartyRoutingForNetworkConnection200Response result = apiInstance.checkThirdPartyRoutingForNetworkConnection(connectionId, assetType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#checkThirdPartyRoutingForNetworkConnection");
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

[**CheckThirdPartyRoutingForNetworkConnection200Response**](CheckThirdPartyRoutingForNetworkConnection200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | result for the validation |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createNetworkConnection

> NetworkConnectionResponse createNetworkConnection(networkConnection)

Creates a new network connection

Initiates a new network connection.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        NetworkConnection networkConnection = new NetworkConnection(); // NetworkConnection | 
        try {
            NetworkConnectionResponse result = apiInstance.createNetworkConnection(networkConnection);
            System.out.println(result);
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

### Return type

[**NetworkConnectionResponse**](NetworkConnectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A Network Connection object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createNetworkId

> NetworkIdResponse createNetworkId(createNetworkIdRequest)

Creates a new Network ID

Creates a new Network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        CreateNetworkIdRequest createNetworkIdRequest = new CreateNetworkIdRequest(); // CreateNetworkIdRequest | 
        try {
            NetworkIdResponse result = apiInstance.createNetworkId(createNetworkIdRequest);
            System.out.println(result);
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

### Return type

[**NetworkIdResponse**](NetworkIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returns the new network ID in your workspace |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteNetworkConnection

> SetRoutingPolicyForNetworkConnection200Response deleteNetworkConnection(connectionId)

Deletes a network connection by ID

Deletes an existing network connection specified by its connection ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection to delete
        try {
            SetRoutingPolicyForNetworkConnection200Response result = apiInstance.deleteNetworkConnection(connectionId);
            System.out.println(result);
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

[**SetRoutingPolicyForNetworkConnection200Response**](SetRoutingPolicyForNetworkConnection200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteNetworkId

> SetRoutingPolicyForNetworkConnection200Response deleteNetworkId(networkId)

Deletes specific network ID.

Deletes a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            SetRoutingPolicyForNetworkConnection200Response result = apiInstance.deleteNetworkId(networkId);
            System.out.println(result);
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

[**SetRoutingPolicyForNetworkConnection200Response**](SetRoutingPolicyForNetworkConnection200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  -  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNetworkConnectionById

> NetworkConnectionResponse getNetworkConnectionById(connectionId)

Get a network connection

Gets a network connection by ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the connection
        try {
            NetworkConnectionResponse result = apiInstance.getNetworkConnectionById(connectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkConnectionById");
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

[**NetworkConnectionResponse**](NetworkConnectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A network connection |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNetworkConnections

> List&lt;NetworkConnectionResponse&gt; getNetworkConnections()

List network connections

Returns all network connections.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        try {
            List<NetworkConnectionResponse> result = apiInstance.getNetworkConnections();
            System.out.println(result);
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

[**List&lt;NetworkConnectionResponse&gt;**](NetworkConnectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of network connections |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNetworkIdById

> NetworkIdResponse getNetworkIdById(networkId)

Returns specific network ID.

Retrieves a network by its ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        try {
            NetworkIdResponse result = apiInstance.getNetworkIdById(networkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#getNetworkIdById");
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

[**NetworkIdResponse**](NetworkIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNetworkIds

> List&lt;GetNetworkIds200ResponseInner&gt; getNetworkIds()

Returns all network IDs, both local IDs and discoverable remote IDs

Retrieves a list of all local and discoverable remote network IDs.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        try {
            List<GetNetworkIds200ResponseInner> result = apiInstance.getNetworkIds();
            System.out.println(result);
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

[**List&lt;GetNetworkIds200ResponseInner&gt;**](GetNetworkIds200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of network IDs |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setDiscoverabilityForNetworkId

> SetRoutingPolicyForNetworkConnection200Response setDiscoverabilityForNetworkId(networkId, setDiscoverabilityForNetworkIdRequest)

Update network ID&#39;s discoverability.

Update whether or not the network ID is discoverable by others.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        SetDiscoverabilityForNetworkIdRequest setDiscoverabilityForNetworkIdRequest = new SetDiscoverabilityForNetworkIdRequest(); // SetDiscoverabilityForNetworkIdRequest | 
        try {
            SetRoutingPolicyForNetworkConnection200Response result = apiInstance.setDiscoverabilityForNetworkId(networkId, setDiscoverabilityForNetworkIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setDiscoverabilityForNetworkId");
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
| **setDiscoverabilityForNetworkIdRequest** | [**SetDiscoverabilityForNetworkIdRequest**](SetDiscoverabilityForNetworkIdRequest.md)|  | |

### Return type

[**SetRoutingPolicyForNetworkConnection200Response**](SetRoutingPolicyForNetworkConnection200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setNetworkIdName

> SetRoutingPolicyForNetworkConnection200Response setNetworkIdName(networkId, setNetworkIdNameRequest)

Update network ID&#39;s name.

Updates name of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        SetNetworkIdNameRequest setNetworkIdNameRequest = new SetNetworkIdNameRequest(); // SetNetworkIdNameRequest | 
        try {
            SetRoutingPolicyForNetworkConnection200Response result = apiInstance.setNetworkIdName(networkId, setNetworkIdNameRequest);
            System.out.println(result);
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
| **networkId** | **String**| The ID of the network | |
| **setNetworkIdNameRequest** | [**SetNetworkIdNameRequest**](SetNetworkIdNameRequest.md)|  | |

### Return type

[**SetRoutingPolicyForNetworkConnection200Response**](SetRoutingPolicyForNetworkConnection200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setRoutingPolicyForNetworkConnection

> SetRoutingPolicyForNetworkConnection200Response setRoutingPolicyForNetworkConnection(connectionId, setRoutingPolicyForNetworkConnectionRequest)

Update network connection routing policy.

Updates an existing network connection&#39;s routing policy.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | The ID of the network connection
        SetRoutingPolicyForNetworkConnectionRequest setRoutingPolicyForNetworkConnectionRequest = new SetRoutingPolicyForNetworkConnectionRequest(); // SetRoutingPolicyForNetworkConnectionRequest | 
        try {
            SetRoutingPolicyForNetworkConnection200Response result = apiInstance.setRoutingPolicyForNetworkConnection(connectionId, setRoutingPolicyForNetworkConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setRoutingPolicyForNetworkConnection");
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
| **setRoutingPolicyForNetworkConnectionRequest** | [**SetRoutingPolicyForNetworkConnectionRequest**](SetRoutingPolicyForNetworkConnectionRequest.md)|  | [optional] |

### Return type

[**SetRoutingPolicyForNetworkConnection200Response**](SetRoutingPolicyForNetworkConnection200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## setRoutingPolicyForNetworkId

> SetRoutingPolicyForNetworkConnection200Response setRoutingPolicyForNetworkId(networkId, setRoutingPolicyForNetworkIdRequest)

Update network id routing policy.

Updates the routing policy of a specified network ID.  **Note:** This API call is subject to Flexible Routing Schemes.  Your routing policy defines how your transactions are routed. You can choose 1 of the 3 different schemes mentioned below for each asset type:   - **None**; Defines the profile routing to no destination for that asset type. Incoming transactions to asset types routed to &#x60;None&#x60; will fail.   - **Custom**; Route to an account that you choose. If you remove the account, incoming transactions will fail until you choose another one.   - **Default**; Use the routing specified by the network profile the connection is connected to. This scheme is also referred to as \&quot;Profile Routing\&quot;  Default Workspace Presets:   - Network Profile Crypto → **Custom**   - Network Profile FIAT → **None**   - Network Connection Crypto → **Default**   - Network Connection FIAT → **Default**      - **Note**: By default, Custom routing scheme uses (&#x60;dstId&#x60; &#x3D; &#x60;0&#x60;, &#x60;dstType&#x60; &#x3D; &#x60;VAULT&#x60;). 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.fireblocks.io/v1");

        NetworkConnectionsApi apiInstance = new NetworkConnectionsApi(defaultClient);
        String networkId = "networkId_example"; // String | The ID of the network
        SetRoutingPolicyForNetworkIdRequest setRoutingPolicyForNetworkIdRequest = new SetRoutingPolicyForNetworkIdRequest(); // SetRoutingPolicyForNetworkIdRequest | 
        try {
            SetRoutingPolicyForNetworkConnection200Response result = apiInstance.setRoutingPolicyForNetworkId(networkId, setRoutingPolicyForNetworkIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkConnectionsApi#setRoutingPolicyForNetworkId");
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
| **setRoutingPolicyForNetworkIdRequest** | [**SetRoutingPolicyForNetworkIdRequest**](SetRoutingPolicyForNetworkIdRequest.md)|  | [optional] |

### Return type

[**SetRoutingPolicyForNetworkConnection200Response**](SetRoutingPolicyForNetworkConnection200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network ID |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

