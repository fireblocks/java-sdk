

# ComplianceScreeningResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | [**ProviderEnum**](#ProviderEnum) | Screening provider |  [optional] |
|**payload** | **Object** | The payload of the screening result. The payload is a JSON object that contains the screening result. The payload is different for each screening provider.  |  [optional] |
|**bypassReason** | [**BypassReasonEnum**](#BypassReasonEnum) | Reason AML screening was bypassed |  [optional] |
|**screeningStatus** | [**ScreeningStatusEnum**](#ScreeningStatusEnum) |  |  [optional] |
|**timestamp** | **BigDecimal** |  |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| CHAINALYSIS | &quot;CHAINALYSIS&quot; |
| ELLIPTIC | &quot;ELLIPTIC&quot; |
| CHAINALYSIS_V2 | &quot;CHAINALYSIS_V2&quot; |
| ELLIPTIC_HOLISTIC | &quot;ELLIPTIC_HOLISTIC&quot; |
| NONE | &quot;NONE&quot; |



## Enum: BypassReasonEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |
| UNSUPPORTED_ASSET | &quot;UNSUPPORTED_ASSET&quot; |
| BYPASSED_FAILURE | &quot;BYPASSED_FAILURE&quot; |
| UNSUPPORTED_ROUTE | &quot;UNSUPPORTED_ROUTE&quot; |
| PASSED_BY_POLICY | &quot;PASSED_BY_POLICY&quot; |
| TIMED_OUT | &quot;TIMED_OUT&quot; |
| BAD_CREDENTIALS | &quot;BAD_CREDENTIALS&quot; |
| CONFIGURATION_ERROR | &quot;CONFIGURATION_ERROR&quot; |
| DROPPED_BY_BLOCKCHAIN | &quot;DROPPED_BY_BLOCKCHAIN&quot; |
| PROCESS_DISMISSED | &quot;PROCESS_DISMISSED&quot; |



## Enum: ScreeningStatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| PENDING | &quot;PENDING&quot; |
| BYPASSED | &quot;BYPASSED&quot; |
| FAILED | &quot;FAILED&quot; |
| FROZEN | &quot;FROZEN&quot; |



