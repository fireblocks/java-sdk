

# ResendFailedNotificationsJobStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | Bulk resend job ID |  |
|**status** | [**StatusEnum**](#StatusEnum) | Bulk resend job status |  |
|**processed** | **BigDecimal** | Number of notifications processed |  |
|**total** | **BigDecimal** | Total number of notifications to process |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;QUEUED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



