

# TravelRuleVASP

A VASP record from the Travel Rule trust framework directory.  The set of keys returned depends on the `fields` query parameter. When `fields` is omitted, or supplied with an empty value, this endpoint returns the complete record.  Additional fields may be present in the response beyond those documented here. Clients must ignore unrecognised fields rather than failing to deserialize.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**did** | **String** | The Decentralized Identifier (DID) of the VASP. |  |
|**name** | **String** | The name of the VASP. |  |
|**verificationStatus** | **String** | The current verification status of the VASP. |  |
|**addressLine1** | **String** | The first line of the VASP&#39;s address. |  |
|**addressLine2** | **String** | The second line of the VASP&#39;s address (if applicable). May be null. |  [optional] |
|**city** | **String** | The city where the VASP is located. |  |
|**country** | **String** | The country where the VASP is registered (ISO-3166 Alpha-2 code). |  |
|**emailDomains** | **String** | The email domains associated with the VASP. The field&#39;s type is string; its content is a JSON-encoded array of domains. Clients must parse this value to obtain the array. |  |
|**website** | **String** | The official website of the VASP. |  |
|**logo** | **String** | URL to the logo of the VASP. May be null. |  [optional] |
|**legalStructure** | **String** | The legal structure of the VASP (e.g., Corporation, LLC). |  |
|**legalName** | **String** | The legal name of the VASP. |  |
|**yearFounded** | **String** | The year the VASP was founded. Returned as a string, not an integer. |  |
|**incorporationCountry** | **String** | The country where the VASP is incorporated (ISO-3166 Alpha-2 code). |  |
|**isRegulated** | **String** | Indicates whether the VASP is regulated. |  |
|**otherNames** | **String** | Other names the VASP is known by. May be null. |  [optional] |
|**identificationType** | **String** | The type of identification used by the VASP. |  [optional] |
|**identificationCountry** | **String** | The country of identification for the VASP (ISO-3166 Alpha-2 code). May be null. |  [optional] |
|**businessNumber** | **String** | The business registration number of the VASP. |  [optional] |
|**regulatoryAuthorities** | **String** | The regulatory authorities overseeing the VASP. May be null. |  [optional] |
|**jurisdictions** | **String** | The jurisdictions where the VASP operates. |  |
|**division** | **String** | The division of the VASP&#39;s registered address, where applicable. |  [optional] |
|**street** | **String** | The street name where the VASP is located. May be null. |  [optional] |
|**number** | **String** | The building number of the VASP&#39;s address. May be returned as an empty string when not supplied. |  [optional] |
|**unit** | **String** | The unit or suite number of the VASP&#39;s address. May be null. |  [optional] |
|**postCode** | **String** | The postal code of the VASP&#39;s location. |  [optional] |
|**state** | **String** | The state or region where the VASP is located. |  [optional] |
|**otherLegalName** | **String** | Alternative legal names of the VASP, as a comma-separated list. Resolved from an external registry, so it is only populated for VASPs with a resolved entity record. |  [optional] |
|**gleifUpdatedAt** | **String** | Timestamp of the last synchronization with the GLEIF registry. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**leiNumber** | **String** | The VASP&#39;s Legal Entity Identifier (LEI), a 20-character alphanumeric code. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**legalForm** | **String** | The GLEIF Entity Legal Form (ELF) code of the VASP. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**entityCategory** | **String** | The GLEIF entity category of the VASP. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**entityStatus** | **String** | The GLEIF entity status of the VASP. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**externalEntityConfig** | [**List&lt;TravelRuleVASPExternalEntityConfig&gt;**](TravelRuleVASPExternalEntityConfig.md) | Entity records resolved from external registries, such as GLEIF. Only populated for VASPs that have been resolved against at least one external registry. |  [optional] |
|**hqStreet** | **String** | The street of the VASP&#39;s headquarters address. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**hqNumber** | **String** | The building number of the VASP&#39;s headquarters address. May be returned as an empty string as well as &#x60;null&#x60; when not supplied. |  [optional] |
|**hqPostcode** | **String** | The postal code of the VASP&#39;s headquarters address. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**hqRegion** | **String** | The region of the VASP&#39;s headquarters address, as an ISO-3166-2 subdivision code. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**hqCity** | **String** | The city of the VASP&#39;s headquarters address. Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**hqCountry** | **String** | The country of the VASP&#39;s headquarters address (ISO-3166 Alpha-2 code). Only populated for VASPs with a GLEIF-resolved LEI. |  [optional] |
|**certificates** | **String** | Certificates or licenses held by the VASP. May be null. |  [optional] |
|**description** | **String** | A brief description of the VASP. May be null. |  [optional] |
|**travelRuleOPENVASP** | **String** | Travel rule compliance status for OpenVASP. Null when the VASP does not support this protocol. |  [optional] |
|**travelRuleSYGNA** | **String** | Travel rule compliance status for Sygna. Null when the VASP does not support this protocol. |  [optional] |
|**travelRuleTRISA** | **String** | Travel rule compliance status for TRISA. Null when the VASP does not support this protocol. |  [optional] |
|**travelRuleTRLIGHT** | **String** | Travel rule compliance status for TRLight. |  |
|**travelRuleEMAIL** | **String** | Travel rule compliance status for EMAIL. Null when the VASP does not support this protocol. |  [optional] |
|**travelRuleTRP** | **String** | Travel rule compliance status for TRP. Null when the VASP does not support this protocol. |  [optional] |
|**travelRuleSHYFT** | **String** | Travel rule compliance status for Shyft. Null when the VASP does not support this protocol. |  [optional] |
|**travelRuleUSTRAVELRULEWG** | **String** | Travel rule compliance status for US Travel Rule WG. Null when the VASP does not support this protocol. |  [optional] |
|**createdAt** | **String** | Timestamp when the VASP record was created. |  |
|**createdBy** | **String** | The DID of the party that created the VASP record. May be null. |  [optional] |
|**updatedAt** | **String** | Timestamp of the last update to the VASP record. |  [optional] |
|**updatedBy** | **String** | The DID of the party that last updated the VASP record. |  [optional] |
|**lastSentDate** | **String** | The last date a transaction was sent by the VASP. |  [optional] |
|**lastReceivedDate** | **String** | The last date a transaction was received by the VASP. |  [optional] |
|**documents** | **String** | Documents associated with the VASP. May be null. |  [optional] |
|**hasAdmin** | **Boolean** | Indicates if the VASP has an admin. |  |
|**isNotifiable** | **Boolean** | Indicates if the VASP is notifiable for compliance reasons. |  |
|**issuers** | [**TravelRuleIssuers**](TravelRuleIssuers.md) |  |  |
|**regulatoryStatus** | **String** | The regulatory status of the VASP, as free text. |  [optional] |
|**supervisoryAuthority** | **String** | The supervisory authority responsible for the VASP. |  [optional] |
|**registrationLicenseId** | **String** | The identifier of the VASP&#39;s registration or operating license. |  [optional] |
|**statusStartDate** | **String** | The date the VASP&#39;s current regulatory status took effect. |  [optional] |
|**statusExpirationDate** | **String** | The date the VASP&#39;s current regulatory status expires. |  [optional] |
|**lastChecked** | **String** | Timestamp of the last verification of the VASP&#39;s regulatory status. |  [optional] |
|**additionalInformation** | **String** | Additional free-text information about the VASP. |  [optional] |
|**subsidiaryOf** | **String** | The DID of the parent VASP, when this VASP is a subsidiary of another. |  [optional] |
|**piiDidkey** | **String** | The VASP&#39;s public PII encryption key, published in the trust framework directory. Use it to encrypt IVMS101 personally identifiable information addressed to this VASP. |  [optional] |
|**compliancePhase** | **Integer** | The VASP&#39;s current compliance onboarding phase. |  [optional] |
|**compliancePhaseData** | **Map&lt;String, Boolean&gt;** | The VASP&#39;s progress through the Travel Rule compliance onboarding milestones, as a map keyed by milestone code.  Each value indicates whether that milestone has been completed. The set of milestone codes is defined by the Travel Rule provider and may change over time, so clients must not assume any particular key is present. Examples of milestone codes include &#x60;TX_SENT&#x60;, &#x60;TX_NOTIFY_API&#x60;, &#x60;TF_VASP_VERIFIED&#x60;, &#x60;RULES_CUSTOM_INCOMING&#x60; and &#x60;INTEGRATIONS_WIDGET&#x60;. |  [optional] |
|**vaspnetId** | **String** | The VASP&#39;s VASPnet identifier. |  [optional] |
|**vaspnetUpdatedAt** | **String** | Timestamp of the last synchronization with VASPnet. |  [optional] |
|**vaspnetImmutableFields** | **List&lt;String&gt;** | Names of the fields that are managed by VASPnet and cannot be modified locally. Empty when no fields are locked. |  [optional] |
|**nodeDidkey** | **String** | The public key of the Travel Rule node serving this VASP record. The format has not been confirmed against a live response; every observed value has been null. |  [optional] |
|**ddq** | **String** | The VASP&#39;s Due Diligence Questionnaire, as a JSON-encoded string containing a &#x60;data&#x60; object and an &#x60;updatedAt&#x60; timestamp. Clients must parse this value. |  [optional] |
|**targetProtocol** | **String** | The Travel Rule protocol used to reach this VASP, when a specific one is configured. |  [optional] |
|**parentGateway** | **String** | The DID of the gateway VASP that routes messages on this VASP&#39;s behalf. |  [optional] |
|**isActiveSender** | **Boolean** | Indicates if the VASP actively sends Travel Rule transfers. |  [optional] |
|**isActiveReceiver** | **Boolean** | Indicates if the VASP actively receives Travel Rule transfers. |  [optional] |
|**subsidiaries** | **List&lt;Object&gt;** | The VASP&#39;s subsidiary entities. The element schema is not yet documented, as no response containing a populated value has been observed; do not assume a particular element type. |  [optional] |



