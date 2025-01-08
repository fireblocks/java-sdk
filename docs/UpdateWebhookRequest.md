

# UpdateWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The url of the webhook where notifications will be sent. URL must be valid, unique and https. |  [optional] |
|**description** | **String** | description of the webhook of what it is used for.should not contain special characters. |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | The events that the webhook will be subscribed to |  [optional] |
|**enabled** | **Boolean** | The status of the webhook |  [optional] |



