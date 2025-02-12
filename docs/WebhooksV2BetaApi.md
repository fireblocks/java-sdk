# WebhooksV2BetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](WebhooksV2BetaApi.md#createWebhook) | **POST** /webhooks | Create new webhook |
| [**deleteWebhook**](WebhooksV2BetaApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete webhook |
| [**getNotification**](WebhooksV2BetaApi.md#getNotification) | **GET** /webhooks/{webhookId}/notifications/{notificationId} | Get notification by id |
| [**getNotifications**](WebhooksV2BetaApi.md#getNotifications) | **GET** /webhooks/{webhookId}/notifications | Get all notifications by webhook id |
| [**getWebhook**](WebhooksV2BetaApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get webhook by id |
| [**getWebhooks**](WebhooksV2BetaApi.md#getWebhooks) | **GET** /webhooks | Get all webhooks |
| [**resendNotificationById**](WebhooksV2BetaApi.md#resendNotificationById) | **POST** /webhooks/{webhookId}/notifications/{notificationId}/resend | Resend notification by id |
| [**updateWebhook**](WebhooksV2BetaApi.md#updateWebhook) | **PATCH** /webhooks/{webhookId} | Update webhook |



## createWebhook

> CompletableFuture<ApiResponse<Webhook>> createWebhook createWebhook(createWebhookRequest, idempotencyKey)

Create new webhook

Creates a new webhook, which will be triggered on the specified events **Note:** These endpoints are currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.WebhooksV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CreateWebhookRequest createWebhookRequest = new CreateWebhookRequest(); // CreateWebhookRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Webhook>> response = fireblocks.webhooksV2Beta().createWebhook(createWebhookRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2BetaApi#createWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2BetaApi#createWebhook");
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
| **createWebhookRequest** | [**CreateWebhookRequest**](CreateWebhookRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**Webhook**](Webhook.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created new webhook successfully |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteWebhook

> CompletableFuture<ApiResponse<Webhook>> deleteWebhook deleteWebhook(webhookId)

Delete webhook

Delete a webhook by its id **Note:** These endpoints are currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.WebhooksV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID webhookId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the webhook
        try {
            CompletableFuture<ApiResponse<Webhook>> response = fireblocks.webhooksV2Beta().deleteWebhook(webhookId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2BetaApi#deleteWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2BetaApi#deleteWebhook");
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
| **webhookId** | **UUID**| The unique identifier of the webhook | |

### Return type

CompletableFuture<ApiResponse<[**Webhook**](Webhook.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted webhook object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNotification

> CompletableFuture<ApiResponse<NotificationWithData>> getNotification getNotification(webhookId, notificationId, includeData)

Get notification by id

Get notification by id **Note:** These endpoints are currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.WebhooksV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String webhookId = "webhookId_example"; // String | The ID of the webhook to fetch
        String notificationId = "notificationId_example"; // String | The ID of the notification to fetch
        Boolean includeData = true; // Boolean | Include the data of the notification
        try {
            CompletableFuture<ApiResponse<NotificationWithData>> response = fireblocks.webhooksV2Beta().getNotification(webhookId, notificationId, includeData);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2BetaApi#getNotification");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2BetaApi#getNotification");
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
| **webhookId** | **String**| The ID of the webhook to fetch | |
| **notificationId** | **String**| The ID of the notification to fetch | |
| **includeData** | **Boolean**| Include the data of the notification | [optional] |

### Return type

CompletableFuture<ApiResponse<[**NotificationWithData**](NotificationWithData.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getNotifications

> CompletableFuture<ApiResponse<NotificationPaginatedResponse>> getNotifications getNotifications(webhookId, order, pageCursor, pageSize, createdStartDate, createdEndDate, statuses, eventTypes, resourceId)

Get all notifications by webhook id

Get all notifications by webhook id (paginated) **Note:** These endpoints are currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.WebhooksV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID webhookId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | 
        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        String pageCursor = "pageCursor_example"; // String | Cursor of the required page
        BigDecimal pageSize = new BigDecimal("100"); // BigDecimal | Maximum number of items in the page
        String createdStartDate = "2024-09-24T09:14:38.356Z"; // String | sort by start date
        String createdEndDate = "2024-09-24T09:14:38.356Z"; // String | sort by end date
        List<NotificationStatus> statuses = Arrays.asList(); // List<NotificationStatus> | Filter by Notification statues
        List<WebhookEvent> eventTypes = Arrays.asList(); // List<WebhookEvent> | Filter by Notification eventTypes
        String resourceId = "resourceId_example"; // String | Filter by resourceId
        try {
            CompletableFuture<ApiResponse<NotificationPaginatedResponse>> response = fireblocks.webhooksV2Beta().getNotifications(webhookId, order, pageCursor, pageSize, createdStartDate, createdEndDate, statuses, eventTypes, resourceId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2BetaApi#getNotifications");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2BetaApi#getNotifications");
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
| **webhookId** | **UUID**|  | |
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |
| **pageCursor** | **String**| Cursor of the required page | [optional] |
| **pageSize** | **BigDecimal**| Maximum number of items in the page | [optional] [default to 100] |
| **createdStartDate** | **String**| sort by start date | [optional] |
| **createdEndDate** | **String**| sort by end date | [optional] |
| **statuses** | [**List&lt;NotificationStatus&gt;**](NotificationStatus.md)| Filter by Notification statues | [optional] |
| **eventTypes** | [**List&lt;WebhookEvent&gt;**](WebhookEvent.md)| Filter by Notification eventTypes | [optional] |
| **resourceId** | **String**| Filter by resourceId | [optional] |

### Return type

CompletableFuture<ApiResponse<[**NotificationPaginatedResponse**](NotificationPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated response containing NotificationExternalDTO objects |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getWebhook

> CompletableFuture<ApiResponse<Webhook>> getWebhook getWebhook(webhookId)

Get webhook by id

Retrieve a webhook by its id **Note:** These endpoints are currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.WebhooksV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UUID webhookId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the webhook
        try {
            CompletableFuture<ApiResponse<Webhook>> response = fireblocks.webhooksV2Beta().getWebhook(webhookId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2BetaApi#getWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2BetaApi#getWebhook");
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
| **webhookId** | **UUID**| The unique identifier of the webhook | |

### Return type

CompletableFuture<ApiResponse<[**Webhook**](Webhook.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A webhook object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getWebhooks

> CompletableFuture<ApiResponse<WebhookPaginatedResponse>> getWebhooks getWebhooks(order, pageCursor, pageSize)

Get all webhooks

Get all webhooks (paginated) **Note:** These endpoints are currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.WebhooksV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String order = "ASC"; // String | ASC / DESC ordering (default DESC)
        String pageCursor = "pageCursor_example"; // String | Cursor of the required page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Maximum number of items in the page
        try {
            CompletableFuture<ApiResponse<WebhookPaginatedResponse>> response = fireblocks.webhooksV2Beta().getWebhooks(order, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2BetaApi#getWebhooks");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2BetaApi#getWebhooks");
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
| **order** | **String**| ASC / DESC ordering (default DESC) | [optional] [default to DESC] [enum: ASC, DESC] |
| **pageCursor** | **String**| Cursor of the required page | [optional] |
| **pageSize** | **BigDecimal**| Maximum number of items in the page | [optional] [default to 10] |

### Return type

CompletableFuture<ApiResponse<[**WebhookPaginatedResponse**](WebhookPaginatedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated response containing WebhookDto objects |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## resendNotificationById

> CompletableFuture<ApiResponse<Void>> resendNotificationById resendNotificationById(webhookId, notificationId, idempotencyKey)

Resend notification by id

Resend notification by ID **Note:** These endpoints are currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.WebhooksV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String webhookId = "webhookId_example"; // String | The ID of the webhook
        String notificationId = "notificationId_example"; // String | The ID of the notification
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.webhooksV2Beta().resendNotificationById(webhookId, notificationId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2BetaApi#resendNotificationById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2BetaApi#resendNotificationById");
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
| **webhookId** | **String**| The ID of the webhook | |
| **notificationId** | **String**| The ID of the notification | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

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
| **202** | Resend notification request was accepted and is being processed |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateWebhook

> CompletableFuture<ApiResponse<Webhook>> updateWebhook updateWebhook(updateWebhookRequest, webhookId)

Update webhook

Update a webhook by its id **Note:** These endpoints are currently in beta and might be subject to changes. 

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
import com.fireblocks.sdk.api.WebhooksV2BetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        UpdateWebhookRequest updateWebhookRequest = new UpdateWebhookRequest(); // UpdateWebhookRequest | 
        UUID webhookId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the webhook
        try {
            CompletableFuture<ApiResponse<Webhook>> response = fireblocks.webhooksV2Beta().updateWebhook(updateWebhookRequest, webhookId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2BetaApi#updateWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2BetaApi#updateWebhook");
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
| **updateWebhookRequest** | [**UpdateWebhookRequest**](UpdateWebhookRequest.md)|  | |
| **webhookId** | **UUID**| The unique identifier of the webhook | |

### Return type

CompletableFuture<ApiResponse<[**Webhook**](Webhook.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated webhook object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

