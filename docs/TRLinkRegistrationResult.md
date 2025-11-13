

# TRLinkRegistrationResult

TRLink registration result containing status and metadata

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **TRLinkRegistrationStatus** |  |  |
|**provider** | **String** | The TRLink provider name |  [optional] |
|**success** | **Boolean** | Whether the registration was successful |  [optional] |
|**timestamp** | **BigDecimal** | Unix timestamp of the registration |  |
|**destRecordId** | **String** | Destination record identifier |  [optional] |
|**travelRuleMessageId** | **String** | Travel rule message identifier for linking |  [optional] |
|**customerIntegrationId** | **String** | Customer integration identifier |  [optional] |
|**customerShortName** | **String** | Customer short name |  [optional] |
|**result** | [**TRLinkProviderResult**](TRLinkProviderResult.md) |  |  [optional] |
|**matchedPrescreeningRule** | [**TRLinkPreScreeningRule**](TRLinkPreScreeningRule.md) |  |  [optional] |



