

# TRLinkCustomerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Customer unique identifier |  |
|**discoverable** | **TRLinkDiscoverableStatus** |  |  |
|**shortName** | **String** | Short display name |  |
|**fullLegalName** | **String** | Full legal entity name |  |
|**geographicAddress** | [**TRLinkGeographicAddressRequest**](TRLinkGeographicAddressRequest.md) |  |  [optional] |
|**countryOfRegistration** | **String** | ISO 3166-1 alpha-2 country code where the entity is registered |  |
|**nationalIdentification** | **String** | National identification, returned exactly as stored: a compact, whitespace-free JSON-encoded string with these optional keys (in this order): &#x60;nationalIdentifier&#x60;, &#x60;nationalIdentifierType&#x60; (e.g. &#x60;LEIX&#x60; for an LEI), &#x60;countryOfIssue&#x60; (ISO 3166-1 alpha-2), &#x60;registrationAuthority&#x60;. Maximum length is 240 characters. |  [optional] |
|**dateOfIncorporation** | **LocalDate** | Date of entity incorporation (ISO 8601 format) |  [optional] |
|**vaults** | **List&lt;Integer&gt;** | Associated Fireblocks vault account IDs |  [optional] |
|**trPrimaryPurpose** | **String** | Primary Travel Rule role for this customer; determines how the customer&#39;s Travel Rule messages are routed. Valid values: &#x60;notabene&#x60;, &#x60;trlink&#x60;. |  |
|**createDate** | **OffsetDateTime** | Timestamp when the customer was created (ISO 8601 format) |  |
|**lastUpdate** | **OffsetDateTime** | Timestamp when the customer was last updated (ISO 8601 format) |  |



