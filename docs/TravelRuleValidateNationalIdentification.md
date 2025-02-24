

# TravelRuleValidateNationalIdentification

Represents a national identifier for a person or entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryOfIssue** | **String** | Country that issued the national identifier (ISO-3166 Alpha-2 country code) |  [optional] |
|**nationalIdentifier** | **String** | National identifier (max 35 characters) |  [optional] |
|**nationalIdentifierType** | [**NationalIdentifierTypeEnum**](#NationalIdentifierTypeEnum) | Type of national identifier. Acceptable values include: - &#39;PASSPORT&#39;: Passport number - &#39;NATIONAL_ID&#39;: National identification number - &#39;TAX_ID&#39;: Tax identification number - &#39;SOCIAL_SECURITY&#39;: Social security number |  [optional] |
|**registrationAuthority** | **String** | Registration authority (format -&gt; RA followed by 6 digits) |  [optional] |



## Enum: NationalIdentifierTypeEnum

| Name | Value |
|---- | -----|
| PASSPORT | &quot;PASSPORT&quot; |
| NATIONAL_ID | &quot;NATIONAL_ID&quot; |
| TAX_ID | &quot;TAX_ID&quot; |
| SOCIAL_SECURITY | &quot;SOCIAL_SECURITY&quot; |



