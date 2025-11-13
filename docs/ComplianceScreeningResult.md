

# ComplianceScreeningResult

The result of the AML/Travel Rule screening. This unified schema contains all fields that may be returned for both AML and Travel Rule screening results. Not all fields will be present in every response - the actual fields depend on the screening type and provider. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The AML/Travel Rule provider name. For AML: ELLIPTIC, CHAINALYSIS, SCORECHAIN, MERKLE_SCIENCE, etc. For Travel Rule: NOTABENE, SYGNA, or any TRLink provider name  |  [optional] |
|**payload** | **Object** | The raw payload of the screening result from the provider. The payload is a JSON object that contains the screening result. The payload structure is different for each screening provider. This field contains the complete, unmodified response from the screening service.  |  [optional] |
|**timestamp** | **BigDecimal** | Unix timestamp in milliseconds when the screening result was generated |  [optional] |
|**screeningStatus** | [**ScreeningStatusEnum**](#ScreeningStatusEnum) | Current status of the screening process |  [optional] |
|**bypassReason** | **String** | Reason for bypassing the screening, if applicable. For AML: SANCTIONS_SCREENING_BYPASS, SANCTIONS_RECIPIENT_BYPASS, etc. For Travel Rule: BELOW_THRESHOLD, NO_TRM_AVAILABLE, etc.  |  [optional] |
|**status** | **AmlStatusEnum** |  |  [optional] |
|**prevStatus** | **AmlStatusEnum** |  |  [optional] |
|**prevBypassReason** | **String** | Previous bypass reason before the current bypass reason change |  [optional] |
|**verdict** | **ScreeningVerdictEnum** |  |  [optional] |
|**risk** | **ScreeningRiskLevelEnum** |  |  [optional] |
|**extendedRisk** | **ScreeningRiskLevelEnum** |  |  [optional] |
|**externalId** | **String** | External identifier for the screening (provider-specific) |  [optional] |
|**customerRefId** | **String** | Customer-provided reference identifier for tracking |  [optional] |
|**refId** | **String** | Internal reference identifier |  [optional] |
|**category** | **String** | Risk category classification. Examples: EXCHANGE, GAMBLING, MIXER, DARKNET_SERVICE, SANCTIONED_ENTITY  |  [optional] |
|**categoryId** | **BigDecimal** | Numeric identifier for the risk category |  [optional] |
|**destAddress** | **String** | The destination blockchain address associated with the screening |  [optional] |
|**destTag** | **String** | Destination tag or memo (for chains that support it like XRP, XLM) |  [optional] |
|**destRecordId** | **String** | The destination record identifier used by the screening provider |  [optional] |
|**addressResolutionSignature** | **String** | Cryptographic signature for address resolution verification |  [optional] |
|**amlResult** | [**AmlResult**](AmlResult.md) |  |  [optional] |
|**result** | [**TravelRuleResult**](TravelRuleResult.md) |  |  [optional] |
|**detailsMessage** | **String** | Additional human-readable details or message about the screening result |  [optional] |
|**matchedAlert** | **Object** | Information about the AML alert that was matched, if any. Contains details about the specific alert that triggered during screening.  |  [optional] |
|**matchedRule** | **Object** | The matched rule information for this screening result. Contains details about which screening rule was applied and matched.  |  [optional] |
|**matchedPrescreeningRule** | [**TravelRulePrescreeningRule**](TravelRulePrescreeningRule.md) |  |  [optional] |
|**matchedNoTrmScreeningRule** | **Object** | Matched no-TRM (Travel Rule Message) screening rule details. Used when TRLink screening detects a missing TRM scenario.  |  [optional] |
|**customerIntegrationId** | **String** | Customer integration identifier used by Travel Rule providers |  [optional] |
|**customerShortName** | **String** | Customer short name registered with Travel Rule providers |  [optional] |
|**travelRuleMessageId** | **String** | Travel rule message identifier for linking and tracking across providers |  [optional] |



## Enum: ScreeningStatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| PENDING | &quot;PENDING&quot; |
| BYPASSED | &quot;BYPASSED&quot; |
| FAILED | &quot;FAILED&quot; |
| FROZEN | &quot;FROZEN&quot; |



