

# BulkSigningKeyJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | Id of the registration job. |  |
|**status** | [**StatusEnum**](#StatusEnum) | QUEUED means the job is waiting for another bulk registration to finish, since only a limited number run at once. IN_PROGRESS means it is running. COMPLETED means every submitted key is present in the workspace. FAILED means the request was refused before any key was registered, so &#x60;reason&#x60; has to be acted on before resubmitting is worth anything. INCOMPLETE means some keys are not registered; resubmitting the same request retries exactly those, and &#x60;reason&#x60; says whether that is likely to help -- keys not registered because of a transient failure will succeed, a key whose certificate or proof was rejected will be rejected again. |  |
|**total** | **BigDecimal** | Keys in the submitted request. |  |
|**created** | **BigDecimal** | Keys registered by this job. |  |
|**alreadyRegistered** | **BigDecimal** | Keys already present in the workspace, recognized and skipped. |  |
|**failed** | **BigDecimal** | Keys rejected. See &#x60;reason&#x60;. |  |
|**reason** | **String** | Free text describing what went wrong. Null while the job is healthy. |  [optional] |
|**fileHash** | **String** | Hex digest over the submitted keys. Two jobs sharing a digest were the same set of keys, which makes a sequence of resubmissions recognizable. |  [optional] |
|**createdAt** | **BigDecimal** | Creation date (timestamp) in milliseconds. |  |
|**updatedAt** | **BigDecimal** | Last progress update (timestamp) in milliseconds. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;QUEUED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| INCOMPLETE | &quot;INCOMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |



