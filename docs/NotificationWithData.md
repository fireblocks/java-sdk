

# NotificationWithData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**createdAt** | **OffsetDateTime** | The creation date of the notification |  |
|**updatedAt** | **OffsetDateTime** | The date when the notification was updated |  |
|**status** | **NotificationStatus** |  |  |
|**eventType** | **WebhookEvent** |  |  |
|**eventVersion** | **BigDecimal** | The event version which the Notification is listen to |  |
|**resourceId** | **UUID** | The resource id of the event which the Notification is listen to |  [optional] |
|**attempts** | **List&lt;String&gt;** | The attempts related to Notification |  |
|**data** | **Object** | notification data |  [optional] |



