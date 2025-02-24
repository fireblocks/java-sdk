

# TravelRuleNationalIdentification

Represents a national identifier for a person or entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryOfIssue** | **String** | Country that issued the national identifier (ISO-3166 Alpha-2 country code). The value must be encrypted. |  [optional] |
|**nationalIdentifier** | **String** | National identifier (max 35 characters). The value must be encrypted. |  [optional] |
|**nationalIdentifierType** | **String** | Type of national identifier. Acceptable values include: - &#39;PASSPORT&#39;: Passport number - &#39;NATIONAL_ID&#39;: National identification number - &#39;TAX_ID&#39;: Tax identification number - &#39;SOCIAL_SECURITY&#39;: Social security number The value must be encrypted. |  [optional] |
|**registrationAuthority** | **String** | Registration authority (format -&gt; RA followed by 6 digits). The value must be encrypted. |  [optional] |



