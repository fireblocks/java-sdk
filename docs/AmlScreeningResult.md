

# AmlScreeningResult

The result of the AML screening. Mirrors the output of the developer-api transaction formatter (IFormattedAmlResult). Not all fields are present in every response — the set depends on the AML provider and screening flow. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The AML provider name. Known values: CHAINALYSIS, ELLIPTIC, CHAINALYSIS_V2, ELLIPTIC_HOLISTIC, BYORK_SLITE, BYORK_LITE, NONE.  |  [optional] |
|**payload** | **Map&lt;String, Object&gt;** | The raw, unmodified screening response from the provider. Structure varies per provider.  |  [optional] |
|**verdict** | **ScreeningVerdictEnum** |  |  [optional] |
|**screeningStatus** | **ScreeningStatusEnum** |  |  [optional] |
|**bypassReason** | **AmlBypassReasonEnum** |  |  [optional] |
|**timestamp** | **BigDecimal** | Unix timestamp in milliseconds when the screening result was generated. |  [optional] |
|**customerRefId** | **String** | Customer-provided reference identifier for tracking. |  [optional] |
|**externalId** | **String** | External identifier for the screening (provider-specific). |  [optional] |
|**category** | **String** | Risk category classification. The available categories are subject to change depending on the provider.  |  [optional] |
|**categoryId** | **BigDecimal** | Numeric identifier for the risk category. |  [optional] |
|**risk** | **String** | Provider-specific risk level. Values vary by provider. |  [optional] |
|**destAddress** | **String** | The destination blockchain address associated with the screening. |  [optional] |
|**matchedRule** | [**AmlMatchedRule**](AmlMatchedRule.md) |  |  [optional] |
|**matchedPrescreeningRule** | [**AmlMatchedRule**](AmlMatchedRule.md) |  |  [optional] |
|**matchedAlert** | [**AmlAlert**](AmlAlert.md) |  |  [optional] |



