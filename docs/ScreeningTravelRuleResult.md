

# ScreeningTravelRuleResult

Detailed Travel Rule screening result containing provider-specific data. Contains Travel Rule specific information like verified status, rule type, and actions. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | **TravelRuleDirectionEnum** |  |  [optional] |
|**isVerified** | **Boolean** | Whether the travel rule information was verified |  [optional] |
|**action** | **TravelRuleVerdictEnum** |  |  [optional] |
|**providerResponse** | **Map&lt;String, Object&gt;** | Complete response from the travel rule provider. This is a dynamic object that varies significantly between different travel rule providers (NOTABENE etc.). Each provider has their own proprietary response format and schema.  Examples of provider-specific structures: - NOTABENE: Contains VASP information, PII data, protocol-specific fields  The structure is provider-dependent and cannot be standardized as each vendor implements their own proprietary data models and response formats.  |  [optional] |
|**matchedRule** | [**ScreeningTravelRuleMatchedRule**](ScreeningTravelRuleMatchedRule.md) |  |  [optional] |



