

# TRLinkCustomerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Customer unique identifier |  |
|**tenantId** | **UUID** | Fireblocks tenant ID |  |
|**discoverable** | **TRLinkDiscoverableStatus** |  |  |
|**shortName** | **String** | Short display name |  |
|**fullLegalName** | **String** | Full legal entity name |  |
|**geographicAddress** | [**TRLinkGeographicAddressRequest**](TRLinkGeographicAddressRequest.md) |  |  [optional] |
|**countryOfRegistration** | **String** | ISO 3166-1 alpha-2 country code where the entity is registered |  |
|**nationalIdentification** | **String** | National identification (serialized as string) |  [optional] |
|**dateOfIncorporation** | **LocalDate** | Date of entity incorporation (ISO 8601 format) |  [optional] |
|**vaults** | **List&lt;Integer&gt;** | Associated Fireblocks vault account IDs |  [optional] |
|**trPrimaryPurpose** | **String** | Primary purpose for Travel Rule compliance |  [optional] |
|**createDate** | **OffsetDateTime** | Timestamp when the customer was created (ISO 8601 format) |  |
|**lastUpdate** | **OffsetDateTime** | Timestamp when the customer was last updated (ISO 8601 format) |  |



