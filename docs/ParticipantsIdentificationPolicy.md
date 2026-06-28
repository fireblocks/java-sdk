

# ParticipantsIdentificationPolicy

When present on a provider manifest, specifies KYC/AML identification requirements as JSON Schemas.  `defaultSchema` is the baseline; `overrides` refine it by `asset`, `rail`, and/or `flowDirection` (see priority below). The most specific matching override applies its `schema` for that request context: it may fully replace `defaultSchema`, or partially override it—when the override `schema` is not provided as a complete standalone definition, fields and rules omitted there continue to follow `defaultSchema`. If this object is omitted from the manifest, the provider imposes no PII requirements through this policy. FirstParty participants are always exempt.  Resolution: from overrides that match the request context, choose the most specific (most dimensions matched); break ties by earlier position in the `overrides` array; if none match, use `defaultSchema`.  Priority (highest precedence first): 1. asset + rail + flowDirection 2. Any two dimensions: asset+rail, asset+flowDirection, rail+flowDirection 3. Any single dimension: asset, rail, or flowDirection 4. defaultSchema (no override matches) 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultSchema** | **String** | A JSON Schema (draft-07) in string format that validates the ParticipantsIdentification object on requests where the provider manifest declares a &#x60;participantsIdentificationPolicy&#x60; for that endpoint (e.g. POST /orders). Defines which fields from originator and/or beneficiary are required.  The schema uses oneOf to discriminate between INDIVIDUAL (PersonalIdentification)  and BUSINESS (BusinessIdentification) entity types for each participant.  For INDIVIDUAL: fullName, dateOfBirth, postalAddress, email, phone, idNumber, idType, etc. For BUSINESS: businessName, registrationNumber, postalAddress, email, phone, etc.  If you constrain &#x60;idType&#x60; or &#x60;additionalIdType&#x60; with a JSON Schema &#x60;enum&#x60;, use the same values as &#x60;PersonalIdentificationType&#x60; (authoritative list in that schema). The example below mirrors that enum.  The string content is expected to be valid JSON (application/json).  |  |
|**overrides** | [**List&lt;IdentificationPolicyOverride&gt;**](IdentificationPolicyOverride.md) | Contextual overrides scoped by asset, rail, and/or flowDirection. Most specific match wins; ties broken by array order. Replaces the default partially. Each override MUST include at least one of &#x60;asset&#x60;, &#x60;rail&#x60;, or &#x60;flowDirection&#x60; (not &#x60;schema&#x60; alone); see IdentificationPolicyOverride.  |  [optional] |



