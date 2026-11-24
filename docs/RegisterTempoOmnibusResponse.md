

# RegisterTempoOmnibusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**txId** | **String** | The ID of the wallet activation transaction. Absent when no activation transaction was submitted. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the Tempo omnibus wallet. &#x60;READY&#x60; is returned with 200; &#x60;PROCESSING&#x60; and &#x60;PENDING_ACTIVATION&#x60; are returned with 202. A failed activation is returned as an error. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;PROCESSING&quot; |
| PENDING_ACTIVATION | &quot;PENDING_ACTIVATION&quot; |
| READY | &quot;READY&quot; |



