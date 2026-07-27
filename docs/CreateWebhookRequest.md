

# CreateWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The url of the webhook where notifications will be sent. URL must be valid, unique and https. |  |
|**description** | **String** | description of the webhook. should not contain special characters. |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | event types the webhook will subscribe to |  |
|**enabled** | **Boolean** | The status of the webhook. If false, the webhook will not receive notifications. |  [optional] |
|**mtls** | [**WebhookMtls**](WebhookMtls.md) |  |  [optional] |
|**oauth** | [**WebhookOAuth**](WebhookOAuth.md) |  |  [optional] |
|**customHeaders** | **Map&lt;String, String&gt;** | Custom HTTP headers attached to every notification delivered by this webhook (max 10). Header names must be valid RFC 7230 tokens (printable ASCII, no separators), are treated case-insensitively (duplicate names differing only in case are rejected), and may not exceed 128 characters. The following names are reserved and cannot be used: Host, Content-Type, Content-Length, Transfer-Encoding, Connection, User-Agent, Accept, Accept-Encoding, Fireblocks-Signature, Fireblocks-Webhook-Signature. Header values are write-only — never returned in responses. |  [optional] |



