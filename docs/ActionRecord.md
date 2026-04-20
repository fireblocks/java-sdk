

# ActionRecord

One row in the lending action execution sequence.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | Kind of step in the lending sequence. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Step lifecycle status. |  |
|**txId** | **String** | Fireblocks transaction id when applicable (unset when NOT_STARTED). |  [optional] |
|**txHash** | **String** | On-chain transaction hash when applicable (unset when NOT_STARTED). |  [optional] |
|**errorMessage** | **String** | Error detail when the step failed. |  [optional] |
|**updatedAt** | **String** | Last update time (ISO-8601); may be empty when status is NOT_STARTED. |  |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;APPROVE&quot; |
| DEPOSIT | &quot;DEPOSIT&quot; |
| WITHDRAW | &quot;WITHDRAW&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;NOT_STARTED&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| PENDING_SIGNATURE | &quot;PENDING_SIGNATURE&quot; |
| BROADCASTING | &quot;BROADCASTING&quot; |
| CONFIRMING | &quot;CONFIRMING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| CANCELED | &quot;CANCELED&quot; |



