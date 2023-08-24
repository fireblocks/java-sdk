

# Transaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**timestamp** | **BigDecimal** |  |  [optional] |
|**instructionId** | **String** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| SUBMITTED | &quot;SUBMITTED&quot; |
| QUEUED | &quot;QUEUED&quot; |
| PENDING_AUTHORIZATION | &quot;PENDING_AUTHORIZATION&quot; |
| PENDING_SIGNATURE | &quot;PENDING_SIGNATURE&quot; |
| BROADCASTING | &quot;BROADCASTING&quot; |
| PENDING_3RD_PARTY_MANUAL_APPROVAL | &quot;PENDING_3RD_PARTY_MANUAL_APPROVAL&quot; |
| PENDING_3RD_PARTY | &quot;PENDING_3RD_PARTY&quot; |
| PENDING | &quot;PENDING&quot; |
| CONFIRMING | &quot;CONFIRMING&quot; |
| CONFIRMED | &quot;CONFIRMED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| PARTIALLY_COMPLETED | &quot;PARTIALLY_COMPLETED&quot; |
| PENDING_AML_SCREENING | &quot;PENDING_AML_SCREENING&quot; |
| CANCELLING | &quot;CANCELLING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| FAILED | &quot;FAILED&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |



