

# NotificationWithData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**createdAt** | **Long** | The creation date of the notification in milliseconds |  |
|**updatedAt** | **Long** | The date when the notification was updated in milliseconds |  |
|**status** | **NotificationStatus** |  |  |
|**eventType** | **WebhookEvent** |  |  |
|**resourceId** | **UUID** | The resource id of the event which the Notification is listen to |  [optional] |
|**data** | **Object** | notification data |  [optional] |



