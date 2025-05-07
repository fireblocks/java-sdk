

# ResendNotificationsByResourceIdRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceId** | **UUID** | The resource id to resend notifications for |  |
|**excludeStatuses** | **List&lt;NotificationStatus&gt;** | (optional) List of notification statuses to exclude from the resend operation     - Empty array means all statuses will be included     - If you want to exclude some statuses, you can use the following example: [ IN_PROGRESS, FAILED ]     - Default if missing, means all statuses other than \&quot;COMPLETED\&quot; will be included  |  [optional] |



