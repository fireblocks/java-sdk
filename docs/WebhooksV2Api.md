# WebhooksV2Api

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](WebhooksV2Api.md#createWebhook) | **POST** /webhooks | Create a new webhook |
| [**createWebhookOauth**](WebhooksV2Api.md#createWebhookOauth) | **POST** /webhooks_settings/oauth | Create OAuth credentials |
| [**deleteWebhook**](WebhooksV2Api.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete webhook |
| [**deleteWebhookOauth**](WebhooksV2Api.md#deleteWebhookOauth) | **DELETE** /webhooks_settings/oauth/{webhookOauthId} | Delete OAuth credentials |
| [**getMetrics**](WebhooksV2Api.md#getMetrics) | **GET** /webhooks/{webhookId}/metrics/{metricName} | Get webhook metrics |
| [**getMtlsCsr**](WebhooksV2Api.md#getMtlsCsr) | **GET** /webhooks_settings/mtls_csr | Get mTLS CSR |
| [**getNotification**](WebhooksV2Api.md#getNotification) | **GET** /webhooks/{webhookId}/notifications/{notificationId} | Get notification by id |
| [**getNotificationAttempts**](WebhooksV2Api.md#getNotificationAttempts) | **GET** /webhooks/{webhookId}/notifications/{notificationId}/attempts | Get notification attempts |
| [**getNotifications**](WebhooksV2Api.md#getNotifications) | **GET** /webhooks/{webhookId}/notifications | Get all notifications by webhook id |
| [**getResendByQueryJobStatus**](WebhooksV2Api.md#getResendByQueryJobStatus) | **GET** /webhooks/{webhookId}/notifications/resend_by_query/jobs/{jobId} | Get resend by query job status |
| [**getResendJobStatus**](WebhooksV2Api.md#getResendJobStatus) | **GET** /webhooks/{webhookId}/notifications/resend_failed/jobs/{jobId} | Get resend job status |
| [**getWebhook**](WebhooksV2Api.md#getWebhook) | **GET** /webhooks/{webhookId} | Get webhook by id |
| [**getWebhookOauth**](WebhooksV2Api.md#getWebhookOauth) | **GET** /webhooks_settings/oauth/{webhookOauthId} | Get OAuth credentials by id |
| [**getWebhookOauths**](WebhooksV2Api.md#getWebhookOauths) | **GET** /webhooks_settings/oauth | Get all OAuth credentials |
| [**getWebhooks**](WebhooksV2Api.md#getWebhooks) | **GET** /webhooks | Get all webhooks |
| [**resendFailedNotifications**](WebhooksV2Api.md#resendFailedNotifications) | **POST** /webhooks/{webhookId}/notifications/resend_failed | Resend failed notifications |
| [**resendNotificationById**](WebhooksV2Api.md#resendNotificationById) | **POST** /webhooks/{webhookId}/notifications/{notificationId}/resend | Resend notification by id |
| [**resendNotificationsByQuery**](WebhooksV2Api.md#resendNotificationsByQuery) | **POST** /webhooks/{webhookId}/notifications/resend_by_query | Resend notifications by query |
| [**resendNotificationsByResourceId**](WebhooksV2Api.md#resendNotificationsByResourceId) | **POST** /webhooks/{webhookId}/notifications/resend_by_resource | Resend notifications by resource Id |
| [**updateWebhook**](WebhooksV2Api.md#updateWebhook) | **PATCH** /webhooks/{webhookId} | Update webhook |
| [**updateWebhookOauth**](WebhooksV2Api.md#updateWebhookOauth) | **PATCH** /webhooks_settings/oauth/{webhookOauthId} | Update OAuth credentials |



## createWebhook

> CompletableFuture<ApiResponse<Webhook>> createWebhook createWebhook(createWebhookRequest, idempotencyKey)

Create a new webhook

Creates a new webhook, which will be triggered on the specified events  **Endpoint Permissions:** Owner, Admin, Non-Signing Admin. 

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


## createWebhookOauth

> CompletableFuture<ApiResponse<WebhookOauthCredentials>> createWebhookOauth createWebhookOauth(createWebhookOauthRequest, idempotencyKey)

Create OAuth credentials

Creates a reusable OAuth client credential set. Attach it to a webhook by passing the returned id as that webhook&#39;s &#x60;webhookOauthId&#x60;. Several webhooks may share one credential set, so rotating its client secret covers all of them at once. The client secret is write-only and is never returned.  **Endpoint Permissions:** Owner, Admin, Non-Signing Admin. 

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

        CreateWebhookOauthRequest createWebhookOauthRequest = new CreateWebhookOauthRequest(); // CreateWebhookOauthRequest | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<WebhookOauthCredentials>> response = fireblocks.webhooksV2().createWebhookOauth(createWebhookOauthRequest, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#createWebhookOauth");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createWebhookOauthRequest** | [**CreateWebhookOauthRequest**](CreateWebhookOauthRequest.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**WebhookOauthCredentials**](WebhookOauthCredentials.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | created the OAuth credentials successfully |  * X-Request-ID -  <br>  |
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


## deleteWebhookOauth

> CompletableFuture<ApiResponse<DeleteWebhookOauthResponse>> deleteWebhookOauth deleteWebhookOauth(webhookOauthId, forceDelete)

Delete OAuth credentials

Deletes an OAuth credential set. By default the delete is refused while the credentials are still in use: if any webhook references them, nothing is deleted and the request fails with &#x60;409 Conflict&#x60;, naming the reason and listing the ids of the referencing webhooks. This protects a shared credential set from being removed out from under the webhooks that depend on it, since several webhooks may reference the same one.  Pass &#x60;forceDelete&#x3D;true&#x60; to delete anyway. That detaches every referencing webhook — it clears each webhook&#39;s &#x60;webhookOauthId&#x60;, it does **not** delete the webhook — then deletes the credential set and returns the deleted resource together with &#x60;detachedWebhookIds&#x60;. The detached webhooks keep delivering notifications, but without an &#x60;Authorization&#x60; header, so their endpoints will see unauthenticated deliveries from that point on.  When nothing references the credentials the delete succeeds either way, and &#x60;detachedWebhookIds&#x60; comes back empty.  **Endpoint Permissions:** Owner, Admin, Non-Signing Admin. 

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

        UUID webhookOauthId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the OAuth credentials
        Boolean forceDelete = false; // Boolean | Delete the credentials even while webhooks still reference them, detaching those webhooks instead of refusing. Leave it unset, or `false`, to get a `409 Conflict` whenever anything still references the credentials.
        try {
            CompletableFuture<ApiResponse<DeleteWebhookOauthResponse>> response = fireblocks.webhooksV2().deleteWebhookOauth(webhookOauthId, forceDelete);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#deleteWebhookOauth");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOauthId** | **UUID**| The unique identifier of the OAuth credentials | |
| **forceDelete** | **Boolean**| Delete the credentials even while webhooks still reference them, detaching those webhooks instead of refusing. Leave it unset, or &#x60;false&#x60;, to get a &#x60;409 Conflict&#x60; whenever anything still references the credentials. | [optional] [default to false] |

### Return type

CompletableFuture<ApiResponse<[**DeleteWebhookOauthResponse**](DeleteWebhookOauthResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted OAuth credentials, plus the ids of any webhooks that were detached from them |  * X-Request-ID -  <br>  |
| **409** | Webhooks still reference these credentials and &#x60;forceDelete&#x60; was not set. Nothing was deleted. The error message names the reason and the ids of the referencing webhooks — detach or delete those webhooks, or retry with &#x60;forceDelete&#x3D;true&#x60;. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getMetrics

> CompletableFuture<ApiResponse<WebhookMetric>> getMetrics getMetrics(webhookId, metricName)

Get webhook metrics

Get webhook metrics by webhook id and metric name 

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
        String metricName = "LAST_ACTIVE_HOUR_ERROR_RATE"; // String | Name of the metric to retrieve
        try {
            CompletableFuture<ApiResponse<WebhookMetric>> response = fireblocks.webhooksV2().getMetrics(webhookId, metricName);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getMetrics");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookId** | **UUID**|  | |
| **metricName** | **String**| Name of the metric to retrieve | [enum: LAST_ACTIVE_HOUR_ERROR_RATE] |

### Return type

CompletableFuture<ApiResponse<[**WebhookMetric**](WebhookMetric.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook metrics |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getMtlsCsr

> CompletableFuture<ApiResponse<WebhookMtlsCsrResponse>> getMtlsCsr getMtlsCsr(keyAlgorithm)

Get mTLS CSR

Returns the Certificate Signing Request (CSR) PEM that customers use to generate their signed client certificate.  The private key the CSR is built from is held by Fireblocks and is specific to this workspace. It is created on the first request for a given key type, and the same CSR is returned on subsequent requests for that type.  Pass &#x60;keyAlgorithm&#x60; to choose RSA or ECDSA. A workspace may hold one key of each: the CSR returned is always the one for the type requested, so a certificate signed against it matches the key used at delivery time. 

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

        String keyAlgorithm = "RSA"; // String | Algorithm of the private key the CSR is generated for. ECDSA keys are smaller and quicker to issue, but the certificate authority signing the request has to accept an EC subject key, which some do not by default.
        try {
            CompletableFuture<ApiResponse<WebhookMtlsCsrResponse>> response = fireblocks.webhooksV2().getMtlsCsr(keyAlgorithm);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getMtlsCsr");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyAlgorithm** | **String**| Algorithm of the private key the CSR is generated for. ECDSA keys are smaller and quicker to issue, but the certificate authority signing the request has to accept an EC subject key, which some do not by default. | [optional] [default to RSA] [enum: RSA, ECDSA] |

### Return type

CompletableFuture<ApiResponse<[**WebhookMtlsCsrResponse**](WebhookMtlsCsrResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The mTLS CSR PEM |  * X-Request-ID -  <br>  |
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


## getResendByQueryJobStatus

> CompletableFuture<ApiResponse<ResendFailedNotificationsJobStatusResponse>> getResendByQueryJobStatus getResendByQueryJobStatus(webhookId, jobId)

Get resend by query job status

Get the status of a resend by query job 

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
            CompletableFuture<ApiResponse<ResendFailedNotificationsJobStatusResponse>> response = fireblocks.webhooksV2().getResendByQueryJobStatus(webhookId, jobId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getResendByQueryJobStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
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


## getWebhookOauth

> CompletableFuture<ApiResponse<WebhookOauthCredentials>> getWebhookOauth getWebhookOauth(webhookOauthId)

Get OAuth credentials by id

Retrieve an OAuth credential set by its id. The client secret is never returned. 

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

        UUID webhookOauthId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the OAuth credentials
        try {
            CompletableFuture<ApiResponse<WebhookOauthCredentials>> response = fireblocks.webhooksV2().getWebhookOauth(webhookOauthId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getWebhookOauth");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOauthId** | **UUID**| The unique identifier of the OAuth credentials | |

### Return type

CompletableFuture<ApiResponse<[**WebhookOauthCredentials**](WebhookOauthCredentials.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An OAuth credentials object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getWebhookOauths

> CompletableFuture<ApiResponse<List<WebhookOauthCredentials>>> getWebhookOauths getWebhookOauths()

Get all OAuth credentials

Lists every OAuth credential set for the workspace. Client secrets are never returned. 

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

        try {
            CompletableFuture<ApiResponse<List<WebhookOauthCredentials>>> response = fireblocks.webhooksV2().getWebhookOauths();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#getWebhookOauths");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**List&lt;WebhookOauthCredentials&gt;**](WebhookOauthCredentials.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The workspace&#39;s OAuth credentials |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getWebhooks

> CompletableFuture<ApiResponse<WebhookPaginatedResponse>> getWebhooks getWebhooks(order, pageCursor, pageSize)

Get all webhooks

Get all webhooks (paginated). 

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


## resendNotificationsByQuery

> CompletableFuture<ApiResponse<ResendByQueryResponse>> resendNotificationsByQuery resendNotificationsByQuery(resendByQueryRequest, webhookId, idempotencyKey)

Resend notifications by query

Resend notifications matching the given query filters (statuses, events, time range, resource ID)  Endpoint Permission: Owner, Admin, Non-Signing Admin, Editor, Signer. 

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

        ResendByQueryRequest resendByQueryRequest = new ResendByQueryRequest(); // ResendByQueryRequest | 
        String webhookId = "webhookId_example"; // String | The ID of the webhook
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<ResendByQueryResponse>> response = fireblocks.webhooksV2().resendNotificationsByQuery(resendByQueryRequest, webhookId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#resendNotificationsByQuery");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resendByQueryRequest** | [**ResendByQueryRequest**](ResendByQueryRequest.md)|  | |
| **webhookId** | **String**| The ID of the webhook | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ResendByQueryResponse**](ResendByQueryResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | No matching notifications to resend |  * X-Request-ID -  <br>  |
| **202** | Resend notifications request was accepted and is being processed |  * X-Request-ID -  <br>  * Location -  <br>  |
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


## updateWebhookOauth

> CompletableFuture<ApiResponse<WebhookOauthCredentials>> updateWebhookOauth updateWebhookOauth(updateWebhookOauthRequest, webhookOauthId)

Update OAuth credentials

Updates only the fields present in the request; anything omitted is left as it is. Sending &#x60;clientSecret&#x60; on its own rotates the secret for every webhook using these credentials.  &#x60;customJwtClaims&#x60;, &#x60;customBodyParams&#x60; and &#x60;customHeaders&#x60; are all merged key by key rather than replaced, the same way a webhook&#39;s own &#x60;customHeaders&#x60; behaves: a key sent with a value is added or overwritten, a key sent with a &#x60;null&#x60; value is deleted, and a key you omit is left alone. Setting one of the three to &#x60;null&#x60; as a whole clears that map, which is the quick way to empty it without naming every key. There is no ambiguity between the two uses of &#x60;null&#x60; — one names an entry to delete, the other names the field. A claim cannot be set to JSON &#x60;null&#x60;, though, on this endpoint or on create, because &#x60;null&#x60; is spent on deletion. &#x60;mtlsClientSignedCert&#x60; is a scalar rather than a map, so &#x60;null&#x60; there does remove it.  **Endpoint Permissions:** Owner, Admin, Non-Signing Admin. 

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

        UpdateWebhookOauthRequest updateWebhookOauthRequest = new UpdateWebhookOauthRequest(); // UpdateWebhookOauthRequest | 
        UUID webhookOauthId = UUID.fromString("44fcead0-7053-4831-a53a-df7fb90d440f"); // UUID | The unique identifier of the OAuth credentials
        try {
            CompletableFuture<ApiResponse<WebhookOauthCredentials>> response = fireblocks.webhooksV2().updateWebhookOauth(updateWebhookOauthRequest, webhookOauthId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling WebhooksV2Api#updateWebhookOauth");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateWebhookOauthRequest** | [**UpdateWebhookOauthRequest**](UpdateWebhookOauthRequest.md)|  | |
| **webhookOauthId** | **UUID**| The unique identifier of the OAuth credentials | |

### Return type

CompletableFuture<ApiResponse<[**WebhookOauthCredentials**](WebhookOauthCredentials.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated OAuth credentials object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

