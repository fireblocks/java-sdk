

# Webhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The id of the webhook |  [optional] |
|**url** | **String** | The url of the webhook where notifications will be sent. Must be a valid URL and https. |  [optional] |
|**description** | **String** | description of the webhook of what it is used for |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | The events that the webhook will be subscribed to |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the webhook |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time the webhook was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | The date and time the webhook was last updated |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| ENABLED | &quot;ENABLED&quot; |



