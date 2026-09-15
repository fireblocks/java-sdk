

# Webhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The id of the webhook |  |
|**url** | **String** | The url of the webhook where notifications will be sent. Must be a valid URL and https. |  |
|**description** | **String** | description of the webhook of what it is used for |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | The events that the webhook will be subscribed to |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the webhook |  |
|**createdAt** | **Long** | The date and time the webhook was created in milliseconds |  |
|**updatedAt** | **Long** | The date and time the webhook was last updated in milliseconds |  |
|**mtls** | [**WebhookMtls**](WebhookMtls.md) |  |  [optional] |
|**webhookOauthId** | **UUID** | The id of the OAuth credentials this webhook authenticates with. Absent when the webhook does not use OAuth. Read the credentials themselves from &#x60;/v1/webhooks_settings/oauth/{webhookOauthId}&#x60;. |  [optional] |
|**customHeaders** | **List&lt;String&gt;** | Names of the custom headers configured for this webhook. Header values are never returned. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| ENABLED | &quot;ENABLED&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |



