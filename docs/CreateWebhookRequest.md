

# CreateWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The url of the webhook where notifications will be sent. URL must be valid, unique and https. |  |
|**description** | **String** | description of the webhook. should not contain special characters. |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | event types the webhook will subscribe to |  |
|**enabled** | **Boolean** | The status of the webhook. If false, the webhook will not receive notifications. |  [optional] |



