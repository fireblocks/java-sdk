

# AddressRegistryLegalEntityLegacy

Narrow legacy response for deprecated `GET /v1/address_registry/legal_entity?address=…`. Use `GET /v1/address_registry/legal_entities/{address}` for the full field set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyName** | **String** | Legal entity / company display name |  |
|**countryCode** | **String** | Jurisdiction country code (e.g. ISO 3166-1 alpha-2) |  |
|**companyId** | **UUID** | Company identifier for the resolved legal entity (UUID) |  |



