

# ResendFailedNotificationsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **BigDecimal** | (optional) Start time for the resend window in milliseconds since epoch up to 24 hours before the current time - Default if missing means 24 hours before the current time in milliseconds since epoch - Maximum value is current time in milliseconds since epoch - Minimum value is 24 hours before the current time in milliseconds since epoch  |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | (optional) Event types to resend, default is all event types     - Default if missing means all events will be included     - Empty array means all events will be included  |  [optional] |



