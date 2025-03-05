

# Notification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The id of the Notification |  |
|**createdAt** | **OffsetDateTime** | The creation date of the notification |  |
|**updatedAt** | **OffsetDateTime** | The date when the notification was updated |  |
|**status** | **NotificationStatus** |  |  |
|**eventType** | **WebhookEvent** |  |  |
|**eventVersion** | **BigDecimal** | The event version of the Notification |  |
|**resourceId** | **UUID** | The resource id of the event which the Notification is listen to |  [optional] |
|**attempts** | **List&lt;String&gt;** | The attempts related to Notification |  [optional] |



