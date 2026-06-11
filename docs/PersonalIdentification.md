

# PersonalIdentification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalReferenceId** | **String** |  |  |
|**entityType** | **PersonalEntityTypeEnum** |  |  |
|**participantRelationshipType** | **ParticipantRelationshipType** |  |  |
|**fullName** | [**PersonalIdentificationFullName**](PersonalIdentificationFullName.md) |  |  |
|**dateOfBirth** | **LocalDate** |  |  |
|**postalAddress** | [**PostalAddress**](PostalAddress.md) |  |  |
|**email** | **String** |  |  [optional] |
|**phone** | **String** | Mobile phone number in E.164 format |  [optional] |
|**idNumber** | **String** | Deprecated. Use identificationDocuments instead. |  [optional] |
|**idType** | **PersonalIdentificationType** | Deprecated. Use identificationDocuments instead. |  [optional] |
|**additionalIdNumber** | **String** | Deprecated. Use identificationDocuments instead. |  [optional] |
|**additionalIdType** | **PersonalIdentificationType** | Deprecated. Use identificationDocuments instead. |  [optional] |
|**nationality** | **String** | The ISO-3166 Alpha-2 country code representing the individual&#39;s nationality. |  [optional] |
|**identificationDocuments** | [**List&lt;PersonalIdentificationDocument&gt;**](PersonalIdentificationDocument.md) | List of identification documents for the individual. |  [optional] |



