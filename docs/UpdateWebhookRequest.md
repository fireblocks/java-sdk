

# UpdateWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The url of the webhook where notifications will be sent. URL must be valid, unique and https. |  [optional] |
|**description** | **String** | description of the webhook of what it is used for.should not contain special characters. |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | The events that the webhook will be subscribed to |  [optional] |
|**enabled** | **Boolean** | The status of the webhook |  [optional] |
|**mtls** | [**WebhookMtls**](WebhookMtls.md) |  |  [optional] |
|**oauth** | [**WebhookOAuth**](WebhookOAuth.md) |  |  [optional] |
|**customHeaders** | **Map&lt;String, String&gt;** | Custom headers delta: entries with a string value are added or updated, entries with a &#x60;null&#x60; value delete that header (no-op if absent), and header names omitted from the payload are left untouched. The resulting set is limited to 10 headers. Header names are case-insensitive, up to 128 characters, and limited to valid HTTP header name characters. Some system header names are reserved and cannot be used. Values are write-only — never returned in responses. |  [optional] |



