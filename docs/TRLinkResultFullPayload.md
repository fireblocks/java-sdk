

# TRLinkResultFullPayload

TRLink screening result

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The TRLink provider name |  |
|**timestamp** | **BigDecimal** | Unix timestamp of the screening result |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the TRLink screening |  |
|**verdict** | **TRLinkVerdictEnum** |  |  [optional] |
|**destAddress** | **String** | The destination address associated with the TRLink screening |  [optional] |
|**destTag** | **String** | Destination tag for the screening |  [optional] |
|**bypassReason** | **String** | Reason for bypassing the TRLink screening |  [optional] |
|**detailsMessage** | **String** | Additional details message about the screening result |  [optional] |
|**customerIntegrationId** | **String** | Customer integration identifier |  [optional] |
|**customerShortName** | **String** | Customer short name |  [optional] |
|**travelRuleMessageId** | **String** | Travel rule message identifier for linking |  [optional] |
|**result** | [**TRLinkProviderResultWithRule2**](TRLinkProviderResultWithRule2.md) |  |  [optional] |
|**matchedPrescreeningRule** | [**ScreeningTRLinkPrescreeningRule**](ScreeningTRLinkPrescreeningRule.md) |  |  [optional] |
|**matchedNoTrmScreeningRule** | [**ScreeningTRLinkMissingTrmDecision**](ScreeningTRLinkMissingTrmDecision.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| PENDING | &quot;PENDING&quot; |
| BYPASSED | &quot;BYPASSED&quot; |
| FAILED | &quot;FAILED&quot; |
| FROZEN | &quot;FROZEN&quot; |



