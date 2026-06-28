

# IdentificationPolicyOverride

Override scoped by one or more dimensions. More dimensions = higher priority. Equal priority ties are broken by array order.  **Validation:** At least one of `asset`, `rail`, or `flowDirection` will be present.  Priority (highest to lowest): 1. asset + rail + flowDirection 2. asset + rail 2. asset + flowDirection 2. rail + flowDirection 3. asset only 3. rail only 3. flowDirection only 4. defaultSchema (no override matched) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asset** | **String** | Fireblocks asset ID (fiat or crypto). |  [optional] |
|**rail** | **TransferRail** |  |  [optional] |
|**flowDirection** | **FlowDirection** |  |  [optional] |
|**schema** | **String** | A JSON Schema (draft-07) in string format that validates the ParticipantsIdentification object on requests where the provider manifest declares a &#x60;participantsIdentificationPolicy&#x60; for that endpoint (e.g. POST /orders). Defines which fields from originator and/or beneficiary are required.  The schema uses oneOf to discriminate between INDIVIDUAL (PersonalIdentification)  and BUSINESS (BusinessIdentification) entity types for each participant.  For INDIVIDUAL: fullName, dateOfBirth, postalAddress, email, phone, idNumber, idType, etc. For BUSINESS: businessName, registrationNumber, postalAddress, email, phone, etc.  If you constrain &#x60;idType&#x60; or &#x60;additionalIdType&#x60; with a JSON Schema &#x60;enum&#x60;, use the same values as &#x60;PersonalIdentificationType&#x60; (authoritative list in that schema). The example below mirrors that enum.  The string content is expected to be valid JSON (application/json).  |  |



