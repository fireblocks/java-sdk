

# GleifData

GLEIF (Global Legal Entity Identifier Foundation) data for a legal entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lei** | **String** | Legal Entity Identifier (LEI) code |  |
|**legalName** | **String** | Official legal name of the entity |  |
|**legalNameLanguage** | **String** | Two-letter ISO 639-1 language code |  [optional] |
|**otherNames** | [**List&lt;GleifOtherLegalEntityName&gt;**](GleifOtherLegalEntityName.md) | Alternative names for the entity |  [optional] |
|**legalAddressRegion** | **String** | Region or state of the legal address |  [optional] |
|**legalAddressCountry** | **String** | Country code of the legal address (ISO 3166-1 alpha-2) |  |
|**nextRenewalDate** | **OffsetDateTime** | Date when the LEI registration must be renewed |  [optional] |



