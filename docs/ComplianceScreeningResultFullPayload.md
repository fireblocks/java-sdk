

# ComplianceScreeningResultFullPayload

The result of the AML/Travel Rule screening. This unified schema contains all fields that may be returned for both AML and Travel Rule screening results. Not all fields will be present in every response - the actual fields depend on the screening type and provider. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The AML/Travel Rule provider name. For AML: ELLIPTIC, CHAINALYSIS, etc. For Travel Rule: NOTABENE, SUMSUB, GTR, or any TRLink provider name  |  [optional] |
|**payload** | **Object** | The raw payload of the screening result from the provider. The payload is a JSON object that contains the screening result. The payload structure is different for each screening provider. This field contains the complete, unmodified response from the screening service.  |  [optional] |
|**timestamp** | **BigDecimal** | Unix timestamp in milliseconds when the screening result was generated |  [optional] |
|**screeningStatus** | [**ScreeningStatusEnum**](#ScreeningStatusEnum) | Current status of the screening process |  [optional] |
|**bypassReason** | **String** | Reason for bypassing the screening, if applicable. For AML: UNSUPPORTED_ASSET, PASSED_BY_POLICY. For Travel Rule: UNSUPPORTED_ASSET, NO_TRAVEL_RULE_MESSAGE, TRANSACTION_ZERO_AMOUNT.  |  [optional] |
|**status** | **AmlStatusEnum** |  |  [optional] |
|**prevStatus** | **AmlStatusEnum** |  |  [optional] |
|**prevBypassReason** | **String** | Deprecated: This field is not currently returned in the API response. Previous bypass reason before the current bypass reason change.  |  [optional] |
|**verdict** | **ScreeningVerdictEnum** |  |  [optional] |
|**risk** | **String** | Risk level assessment for screening results. Values vary by provider and are not managed by this service.  Known values by provider: - Chainalysis: severeRisk, highRisk, mediumRisk, lowRisk, noRiskInfo - Elliptic: noRiskDetected  Legacy values (SCREAMING_SNAKE_CASE, may appear in old transactions): VERY_HIGH, SEVERE, HIGH, MEDIUM, LOW, NO_RISK_INFO, UNKNOWN  |  [optional] |
|**extendedRisk** | **String** | Deprecated: This field is not currently returned in the API response. Use risk instead.  |  [optional] |
|**externalId** | **String** | External identifier for the screening (provider-specific) |  [optional] |
|**customerRefId** | **String** | Customer-provided reference identifier for tracking |  [optional] |
|**refId** | **String** | Deprecated: This field is not currently returned in the API response. Internal reference identifier.  |  [optional] |
|**category** | **String** | Risk category classification. Examples: EXCHANGE, GAMBLING, MIXER, DARKNET_SERVICE, SANCTIONED_ENTITY  |  [optional] |
|**categoryId** | **BigDecimal** | Numeric identifier for the risk category |  [optional] |
|**destAddress** | **String** | The destination blockchain address associated with the screening |  [optional] |
|**destTag** | **String** | Destination tag or memo (for chains that support it like XRP, XLM) |  [optional] |
|**destRecordId** | **String** | Deprecated: This field is not currently returned in the API response. The destination record identifier used by the screening provider.  |  [optional] |
|**addressResolutionSignature** | **String** | Deprecated: This field is not currently returned in the API response. Cryptographic signature for address resolution verification.  |  [optional] |
|**amlResult** | [**ScreeningAmlResult**](ScreeningAmlResult.md) |  |  [optional] |
|**result** | [**ScreeningTravelRuleResult**](ScreeningTravelRuleResult.md) |  |  [optional] |
|**detailsMessage** | **String** | Additional human-readable details or message about the screening result |  [optional] |
|**matchedAlert** | **Object** | Information about the AML alert that was matched, if any. Contains details about the specific alert that triggered during screening.  |  [optional] |
|**matchedRule** | **Object** | The matched rule information for this screening result. Contains details about which screening rule was applied and matched.  |  [optional] |
|**matchedPrescreeningRule** | [**ScreeningTravelRulePrescreeningRule**](ScreeningTravelRulePrescreeningRule.md) |  |  [optional] |
|**matchedNoTrmScreeningRule** | **Object** | Matched no-TRM (Travel Rule Message) screening rule details. Used when TRLink screening detects a missing TRM scenario.  |  [optional] |
|**customerIntegrationId** | **String** | Customer integration identifier used by Travel Rule providers |  [optional] |
|**customerShortName** | **String** | Customer short name registered with Travel Rule providers |  [optional] |
|**travelRuleMessageId** | **String** | Travel rule message identifier for linking and tracking across providers |  [optional] |
|**providerResponse** | **Map&lt;String, Object&gt;** | Complete response from the screening provider. This is a dynamic object that varies significantly between different providers (Chainalysis, Elliptic, NOTABENE, etc.). Each provider has their own proprietary response format and schema.  For AML providers: Contains risk scores, alerts, entity information For Travel Rule providers: Contains VASP information, PII data, protocol-specific fields  The structure is provider-dependent and cannot be standardized as each vendor implements their own proprietary data models and response formats.  |  [optional] |



## Enum: ScreeningStatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| PENDING | &quot;PENDING&quot; |
| BYPASSED | &quot;BYPASSED&quot; |
| FAILED | &quot;FAILED&quot; |
| FROZEN | &quot;FROZEN&quot; |



