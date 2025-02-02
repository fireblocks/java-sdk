

# ComplianceScreeningResultFullPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** |  |  [optional] |
|**payload** | **Object** | The payload of the screening result. The payload is a JSON object that contains the screening result. The payload is different for each screening provider.  |  [optional] |
|**bypassReason** | **String** |  |  [optional] |
|**screeningStatus** | [**ScreeningStatusEnum**](#ScreeningStatusEnum) |  |  [optional] |
|**timestamp** | **BigDecimal** |  |  [optional] |



## Enum: ScreeningStatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| PENDING | &quot;PENDING&quot; |
| BYPASSED | &quot;BYPASSED&quot; |
| FAILED | &quot;FAILED&quot; |
| FROZEN | &quot;FROZEN&quot; |



