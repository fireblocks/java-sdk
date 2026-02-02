

# TRLinkCreateCustomerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**discoverable** | **TRLinkDiscoverableStatus** |  |  [optional] |
|**shortName** | **String** | Short display name (required) |  |
|**fullLegalName** | **String** | Full legal entity name |  [optional] |
|**geographicAddress** | [**TRLinkGeographicAddressRequest**](TRLinkGeographicAddressRequest.md) |  |  [optional] |
|**countryOfRegistration** | **String** | ISO 3166-1 alpha-2 country code where the entity is registered |  [optional] |
|**nationalIdentification** | **String** | National identification as JSON string |  [optional] |
|**dateOfIncorporation** | **LocalDate** | Date of entity incorporation (ISO 8601 format: YYYY-MM-DD) |  [optional] |
|**vaults** | **List&lt;Integer&gt;** | Associated Fireblocks vault account IDs |  [optional] |
|**trPrimaryPurpose** | **String** | Primary purpose for Travel Rule compliance (enum value) |  [optional] |



