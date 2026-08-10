

# TravelRuleVASPExternalEntityConfig

An entity record for the VASP as resolved from an external registry, together with the registration state reported by that registry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The external registry the record was resolved from. Returned in lower case, for example &#x60;gleif&#x60;. |  [optional] |
|**externalId** | **String** | The VASP&#39;s identifier within the external registry. For the &#x60;gleif&#x60; provider this is the Legal Entity Identifier (LEI). |  [optional] |
|**updatedAt** | **String** | Timestamp of the last change to the record at the external registry. |  [optional] |
|**resolvedAt** | **String** | Timestamp when the record was last resolved from the external registry. |  [optional] |
|**entity** | [**TravelRuleVASPExternalEntity**](TravelRuleVASPExternalEntity.md) |  |  [optional] |
|**registration** | [**TravelRuleVASPExternalEntityRegistration**](TravelRuleVASPExternalEntityRegistration.md) |  |  [optional] |



