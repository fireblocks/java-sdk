

# ResendByQueryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statuses** | **List&lt;NotificationStatus&gt;** | (optional) List of notification statuses to resend     - Default if missing: &#x60;[\&quot;FAILED\&quot;, \&quot;ON_HOLD\&quot;]&#x60;  |  [optional] |
|**startTime** | **BigDecimal** | (optional) Start time for the resend window in milliseconds since epoch, within the last 72 hours - Default if missing means 24 hours before the current time in milliseconds since epoch - Maximum value is current time in milliseconds since epoch - Minimum value is 72 hours before the current time in milliseconds since epoch  |  [optional] |
|**endTime** | **BigDecimal** | (optional) End time for the resend window in milliseconds since epoch, within the last 72 hours - Default if missing means current time in milliseconds since epoch - Requires startTime to be provided - Must be after startTime - Time window between startTime and endTime must not exceed 24 hours  |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | (optional) Event types to resend, default is all event types     - Default if missing means all events will be included     - Empty array means all events will be included  |  [optional] |
|**resourceId** | **String** | (optional) Resource ID to filter notifications by  |  [optional] |



