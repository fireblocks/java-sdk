# WebhooksV2Api

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](WebhooksV2Api.md#createWebhook) | **POST** /webhooks | Create new webhook |
| [**deleteWebhook**](WebhooksV2Api.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete webhook |
| [**getNotification**](WebhooksV2Api.md#getNotification) | **GET** /webhooks/{webhookId}/notifications/{notificationId} | Get notification by id |
| [**getNotificationAttempts**](WebhooksV2Api.md#getNotificationAttempts) | **GET** /webhooks/{webhookId}/notifications/{notificationId}/attempts | Get notification attempts |
| [**getNotifications**](WebhooksV2Api.md#getNotifications) | **GET** /webhooks/{webhookId}/notifications | Get all notifications by webhook id |
| [**getResendJobStatus**](WebhooksV2Api.md#getResendJobStatus) | **GET** /webhooks/{webhookId}/notifications/resend_failed/jobs/{jobId} | Get resend job status |
| [**getWebhook**](WebhooksV2Api.md#getWebhook) | **GET** /webhooks/{webhookId} | Get webhook by id |
| [**getWebhooks**](WebhooksV2Api.md#getWebhooks) | **GET** /webhooks | Get all webhooks |
| [**resendFailedNotifications**](WebhooksV2Api.md#resendFailedNotifications) | **POST** /webhooks/{webhookId}/notifications/resend_failed | Resend failed notifications |
| [**resendNotificationById**](WebhooksV2Api.md#resendNotificationById) | **POST** /webhooks/{webhookId}/notifications/{notificationId}/resend | Resend notification by id |
| [**resendNotificationsByResourceId**](WebhooksV2Api.md#resendNotificationsByResourceId) | **POST** /webhooks/{webhookId}/notifications/resend_by_resource | Resend notifications by resource Id |
| [**updateWebhook**](WebhooksV2Api.md#updateWebhook) | **PATCH** /webhooks/{webhookId} | Update webhook |



## createWebhook

> CompletableFuture<ApiResponse<Webhook>> createWebhook createWebhook(createWebhookRequest, idempotencyKey)

Create new webhook

Creates a new webhook, which will be triggered on the specified events  Endpoint Permission: Owner, Admin, Non-Signing Admin. 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
            CompletableFuture<ApiResponse<Webhook>> response = fireblocks.webhooksV2().createWebhook(createWebhookRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#createWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#createWebhook");
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

Delete a webhook by its id  Endpoint Permission: Owner, Admin, Non-Signing Admin. 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
            CompletableFuture<ApiResponse<Webhook>> response = fireblocks.webhooksV2().deleteWebhook(webhookId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#deleteWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#deleteWebhook");
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

Get notification by id 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
            CompletableFuture<ApiResponse<NotificationWithData>> response = fireblocks.webhooksV2().getNotification(webhookId, notificationId, includeData);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getNotification");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#getNotification");
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


## getNotificationAttempts

> CompletableFuture<ApiResponse<NotificationAttemptsPaginatedResponse>> getNotificationAttempts getNotificationAttempts(webhookId, notificationId, pageCursor, pageSize)

Get notification attempts

Get notification attempts by notification id 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
        String pageCursor = "pageCursor_example"; // String | Cursor of the required page
        BigDecimal pageSize = new BigDecimal("10"); // BigDecimal | Maximum number of items in the page
        try {
            CompletableFuture<ApiResponse<NotificationAttemptsPaginatedResponse>> response = fireblocks.webhooksV2().getNotificationAttempts(webhookId, notificationId, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getNotificationAttempts");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#getNotificationAttempts");
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
| **pageCursor** | **String**| Cursor of the required page | [optional] |
| **pageSize** | **BigDecimal**| Maximum number of items in the page | [optional] [default to 10] |

### Return type

CompletableFuture<ApiResponse<[**NotificationAttemptsPaginatedResponse**](NotificationAttemptsPaginatedResponse.md)>>


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

> CompletableFuture<ApiResponse<NotificationPaginatedResponse>> getNotifications getNotifications(webhookId, order, sortBy, pageCursor, pageSize, startTime, endTime, statuses, events, resourceId)

Get all notifications by webhook id

Get all notifications by webhook id (paginated) 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
        String sortBy = "id"; // String | Sort by field
        String pageCursor = "pageCursor_example"; // String | Cursor of the required page
        BigDecimal pageSize = new BigDecimal("100"); // BigDecimal | Maximum number of items in the page
        BigDecimal startTime = new BigDecimal("1625097600000"); // BigDecimal | Start time in milliseconds since epoch to filter by notifications created after this time (default 31 days ago)
        BigDecimal endTime = new BigDecimal("1625017600000"); // BigDecimal | End time in milliseconds since epoch to filter by notifications created before this time (default current time)
        List<NotificationStatus> statuses = Arrays.asList(); // List<NotificationStatus> | List of notification statuses to filter by
        List<WebhookEvent> events = Arrays.asList(); // List<WebhookEvent> | List of webhook event types to filter by
        String resourceId = "44fcead0-7053-4831-a53a-df7fb90d440f"; // String | Resource ID to filter by
        try {
            CompletableFuture<ApiResponse<NotificationPaginatedResponse>> response = fireblocks.webhooksV2().getNotifications(webhookId, order, sortBy, pageCursor, pageSize, startTime, endTime, statuses, events, resourceId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getNotifications");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#getNotifications");
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
| **sortBy** | **String**| Sort by field | [optional] [default to updatedAt] [enum: id, createdAt, updatedAt, status, eventType, resourceId] |
| **pageCursor** | **String**| Cursor of the required page | [optional] |
| **pageSize** | **BigDecimal**| Maximum number of items in the page | [optional] [default to 100] |
| **startTime** | **BigDecimal**| Start time in milliseconds since epoch to filter by notifications created after this time (default 31 days ago) | [optional] |
| **endTime** | **BigDecimal**| End time in milliseconds since epoch to filter by notifications created before this time (default current time) | [optional] |
| **statuses** | [**List&lt;NotificationStatus&gt;**](NotificationStatus.md)| List of notification statuses to filter by | [optional] |
| **events** | [**List&lt;WebhookEvent&gt;**](WebhookEvent.md)| List of webhook event types to filter by | [optional] |
| **resourceId** | **String**| Resource ID to filter by | [optional] |

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


## getResendJobStatus

> CompletableFuture<ApiResponse<ResendFailedNotificationsJobStatusResponse>> getResendJobStatus getResendJobStatus(webhookId, jobId)

Get resend job status

Get the status of a resend job 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
        String jobId = "jobId_example"; // String | The ID of the resend job
        try {
            CompletableFuture<ApiResponse<ResendFailedNotificationsJobStatusResponse>> response = fireblocks.webhooksV2().getResendJobStatus(webhookId, jobId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getResendJobStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#getResendJobStatus");
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
| **jobId** | **String**| The ID of the resend job | |

### Return type

CompletableFuture<ApiResponse<[**ResendFailedNotificationsJobStatusResponse**](ResendFailedNotificationsJobStatusResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job status |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getWebhook

> CompletableFuture<ApiResponse<Webhook>> getWebhook getWebhook(webhookId)

Get webhook by id

Retrieve a webhook by its id 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
            CompletableFuture<ApiResponse<Webhook>> response = fireblocks.webhooksV2().getWebhook(webhookId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#getWebhook");
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

Get all webhooks (paginated) 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
            CompletableFuture<ApiResponse<WebhookPaginatedResponse>> response = fireblocks.webhooksV2().getWebhooks(order, pageCursor, pageSize);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getWebhooks");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#getWebhooks");
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


## resendFailedNotifications

> CompletableFuture<ApiResponse<ResendFailedNotificationsResponse>> resendFailedNotifications resendFailedNotifications(resendFailedNotificationsRequest, webhookId, idempotencyKey)

Resend failed notifications

Resend all failed notifications for a webhook in the last 24 hours  Endpoint Permission: Owner, Admin, Non-Signing Admin, Editor, Signer. 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ResendFailedNotificationsRequest resendFailedNotificationsRequest = new ResendFailedNotificationsRequest(); // ResendFailedNotificationsRequest | 
        String webhookId = "webhookId_example"; // String | The ID of the webhook
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ResendFailedNotificationsResponse>> response = fireblocks.webhooksV2().resendFailedNotifications(resendFailedNotificationsRequest, webhookId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#resendFailedNotifications");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#resendFailedNotifications");
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
| **resendFailedNotificationsRequest** | [**ResendFailedNotificationsRequest**](ResendFailedNotificationsRequest.md)|  | |
| **webhookId** | **String**| The ID of the webhook | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ResendFailedNotificationsResponse**](ResendFailedNotificationsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | No failed notifications to resend |  * X-Request-ID -  <br>  |
| **202** | Resend failed notifications request was accepted and is being processed |  * X-Request-ID -  <br>  * Location -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## resendNotificationById

> CompletableFuture<ApiResponse<Void>> resendNotificationById resendNotificationById(webhookId, notificationId, idempotencyKey)

Resend notification by id

Resend notification by ID  Endpoint Permission: Owner, Admin, Non-Signing Admin, Editor, Signer. 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
            CompletableFuture<ApiResponse<Void>> response = fireblocks.webhooksV2().resendNotificationById(webhookId, notificationId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#resendNotificationById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#resendNotificationById");
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


## resendNotificationsByResourceId

> CompletableFuture<ApiResponse<Void>> resendNotificationsByResourceId resendNotificationsByResourceId(resendNotificationsByResourceIdRequest, webhookId, idempotencyKey)

Resend notifications by resource Id

Resend notifications by resource Id  Endpoint Permission: Owner, Admin, Non-Signing Admin, Editor, Signer. 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ResendNotificationsByResourceIdRequest resendNotificationsByResourceIdRequest = new ResendNotificationsByResourceIdRequest(); // ResendNotificationsByResourceIdRequest | 
        String webhookId = "webhookId_example"; // String | The ID of the webhook
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.webhooksV2().resendNotificationsByResourceId(resendNotificationsByResourceIdRequest, webhookId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#resendNotificationsByResourceId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#resendNotificationsByResourceId");
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
| **resendNotificationsByResourceIdRequest** | [**ResendNotificationsByResourceIdRequest**](ResendNotificationsByResourceIdRequest.md)|  | |
| **webhookId** | **String**| The ID of the webhook | |
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
| **202** | Resend notifications by resource request was accepted and is being processed |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateWebhook

> CompletableFuture<ApiResponse<Webhook>> updateWebhook updateWebhook(updateWebhookRequest, webhookId)

Update webhook

Update a webhook by its id  Endpoint Permission: Owner, Admin, Non-Signing Admin. 

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
import com.fireblocks.sdk.api.WebhooksV2Api;
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
            CompletableFuture<ApiResponse<Webhook>> response = fireblocks.webhooksV2().updateWebhook(updateWebhookRequest, webhookId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#updateWebhook");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksV2Api#updateWebhook");
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

