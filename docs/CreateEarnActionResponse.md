

# CreateEarnActionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ActionIntent UUID for tracking the lending action workflow. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Lifecycle status (e.g. CREATED, IN_PROGRESS, COMPLETED). |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FAILED | &quot;FAILED&quot; |



