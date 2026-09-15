

# UpdateWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The url of the webhook where notifications will be sent. URL must be valid, unique and https. |  [optional] |
|**description** | **String** | description of the webhook of what it is used for.should not contain special characters. |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | The events that the webhook will be subscribed to |  [optional] |
|**enabled** | **Boolean** | The status of the webhook |  [optional] |
|**mtls** | [**WebhookMtls**](WebhookMtls.md) |  |  [optional] |
|**webhookOauthId** | **UUID** | The id of the OAuth credentials this webhook authenticates with, from &#x60;/v1/webhooks_settings/oauth&#x60;. Several webhooks may share one credential set, so rotating its client secret covers all of them at once. Send &#x60;null&#x60; to stop using OAuth for this webhook. |  [optional] |
|**customHeaders** | **Map&lt;String, Object&gt;** | A delta applied to the delivery headers. A header with a value is added or replaced, a header with &#x60;null&#x60; is deleted, and one you leave out is untouched. A value replaces what is stored under that name rather than adding to it, so an array is the complete new set of lines for that header. Send &#x60;customHeaders: null&#x60; to clear every header in one call. That does not collide with a &#x60;null&#x60; value on a name: one names the header to delete, the other names the whole field. Names are case-insensitive, so a &#x60;null&#x60; under one casing deletes a header stored under another. Same rules as on create: string or non-empty array, &#x60;Cookie&#x60; string-only, 10 lines total and under 16 KB in the resulting set, the same reserved names, and values write-only. Entries set to &#x60;null&#x60; do not count towards the limit. |  [optional] |



