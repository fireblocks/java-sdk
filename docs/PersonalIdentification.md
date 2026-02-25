

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
|**idNumber** | **String** | The identification number corresponding to the primary identification document type specified in idType |  [optional] |
|**idType** | **PersonalIdentificationType** |  |  [optional] |
|**additionalIdNumber** | **String** | The identification number corresponding to the additional identification document type specified in additionalIdType |  [optional] |
|**additionalIdType** | **PersonalIdentificationType** |  |  [optional] |



