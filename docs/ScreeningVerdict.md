

# ScreeningVerdict


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verdict** | [**VerdictEnum**](#VerdictEnum) |  |  |
|**executionOperationId** | **String** |  |  |
|**account** | [**Destination**](Destination.md) |  |  |
|**assetId** | **String** |  |  |
|**amount** | **String** |  |  |
|**matchedRule** | [**ScreeningVerdictMatchedRule**](ScreeningVerdictMatchedRule.md) |  |  [optional] |



## Enum: VerdictEnum

| Name | Value |
|---- | -----|
| PASSED | &quot;PASSED&quot; |
| PASSED_WITH_ALERT | &quot;PASSED_WITH_ALERT&quot; |
| REJECTED | &quot;REJECTED&quot; |
| FAILED | &quot;FAILED&quot; |
| BYPASSED | &quot;BYPASSED&quot; |



