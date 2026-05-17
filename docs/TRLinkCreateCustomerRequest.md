

# TRLinkCreateCustomerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**discoverable** | **TRLinkDiscoverableStatus** |  |  [optional] |
|**shortName** | **String** | Short display name (required) |  |
|**fullLegalName** | **String** | Full legal entity name |  [optional] |
|**geographicAddress** | [**TRLinkGeographicAddressRequest**](TRLinkGeographicAddressRequest.md) |  |  [optional] |
|**countryOfRegistration** | **String** | ISO 3166-1 alpha-2 country code where the entity is registered |  [optional] |
|**nationalIdentification** | **String** | National identification, sent as a JSON-encoded string. The server normalizes input into a compact JSON with these optional keys: &#x60;nationalIdentifier&#x60;, &#x60;nationalIdentifierType&#x60; (e.g. &#x60;LEIX&#x60; for an LEI), &#x60;countryOfIssue&#x60; (ISO 3166-1 alpha-2), &#x60;registrationAuthority&#x60;. If the input is not a JSON object, it is wrapped as &#x60;{\&quot;nationalIdentifier\&quot;:\&quot;&lt;value&gt;\&quot;}&#x60;; if the value matches the LEI format, &#x60;nationalIdentifierType&#x60; is set to &#x60;LEIX&#x60; automatically and &#x60;countryOfIssue&#x60; defaults to this request&#39;s &#x60;countryOfRegistration&#x60; if not provided. The compacted JSON must be 240 characters or fewer. On read, the value is returned exactly as stored. |  [optional] |
|**dateOfIncorporation** | **LocalDate** | Date of entity incorporation (ISO 8601 format: YYYY-MM-DD) |  [optional] |
|**vaults** | **List&lt;Integer&gt;** | Associated Fireblocks vault account IDs |  [optional] |
|**trPrimaryPurpose** | **String** | Primary Travel Rule role for this customer; determines how the customer&#39;s Travel Rule messages are routed. Valid values: &#x60;notabene&#x60;, &#x60;trlink&#x60;. |  [optional] |



