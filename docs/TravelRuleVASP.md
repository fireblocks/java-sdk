

# TravelRuleVASP


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**did** | **String** | The Decentralized Identifier (DID) of the VASP. |  |
|**name** | **String** | The name of the VASP. |  |
|**verificationStatus** | **String** | The current verification status of the VASP. |  |
|**addressLine1** | **String** | The first line of the VASP&#39;s address. |  |
|**addressLine2** | **String** | The second line of the VASP&#39;s address (if applicable). |  [optional] |
|**city** | **String** | The city where the VASP is located. |  |
|**country** | **String** | The country where the VASP is registered (ISO-3166 Alpha-2 code). |  |
|**emailDomains** | **String** | Comma-separated list of email domains associated with the VASP. |  |
|**website** | **String** | The official website of the VASP. |  |
|**logo** | **String** | URL to the logo of the VASP. |  [optional] |
|**legalStructure** | **String** | The legal structure of the VASP (e.g., Corporation, LLC). |  |
|**legalName** | **String** | The legal name of the VASP. |  |
|**yearFounded** | **String** | The year the VASP was founded. |  |
|**incorporationCountry** | **String** | The country where the VASP is incorporated (ISO-3166 Alpha-2 code). |  |
|**isRegulated** | **String** | Indicates whether the VASP is regulated. |  |
|**otherNames** | **String** | Other names the VASP is known by. |  [optional] |
|**identificationType** | **String** | The type of identification used by the VASP. |  [optional] |
|**identificationCountry** | **String** | The country of identification for the VASP (ISO-3166 Alpha-2 code). |  [optional] |
|**businessNumber** | **String** | The business registration number of the VASP. |  [optional] |
|**regulatoryAuthorities** | **String** | The regulatory authorities overseeing the VASP. |  [optional] |
|**jurisdictions** | **String** | The jurisdictions where the VASP operates. |  |
|**street** | **String** | The street name where the VASP is located. |  [optional] |
|**number** | **String** | The building number of the VASP&#39;s address. |  [optional] |
|**unit** | **String** | The unit or suite number of the VASP&#39;s address. |  [optional] |
|**postCode** | **String** | The postal code of the VASP&#39;s location. |  [optional] |
|**state** | **String** | The state or region where the VASP is located. |  [optional] |
|**certificates** | **String** | Certificates or licenses held by the VASP. |  [optional] |
|**description** | **String** | A brief description of the VASP. |  [optional] |
|**travelRuleOPENVASP** | **String** | Travel rule compliance status for OpenVASP. |  [optional] |
|**travelRuleSYGNA** | **String** | Travel rule compliance status for Sygna. |  [optional] |
|**travelRuleTRISA** | **String** | Travel rule compliance status for TRISA. |  [optional] |
|**travelRuleTRLIGHT** | **String** | Travel rule compliance status for TRLight. |  |
|**travelRuleEMAIL** | **String** | Travel rule compliance status for EMAIL. |  [optional] |
|**travelRuleTRP** | **String** | Travel rule compliance status for TRP. |  [optional] |
|**travelRuleSHYFT** | **String** | Travel rule compliance status for Shyft. |  [optional] |
|**travelRuleUSTRAVELRULEWG** | **String** | Travel rule compliance status for US Travel Rule WG. |  [optional] |
|**createdAt** | **String** | Timestamp when the VASP record was created. |  |
|**createdBy** | **String** | User or system that created the VASP record. |  [optional] |
|**updatedAt** | **String** | Timestamp of the last update to the VASP record. |  [optional] |
|**updatedBy** | **String** | User or system that last updated the VASP record. |  [optional] |
|**lastSentDate** | **String** | The last date a transaction was sent by the VASP. |  [optional] |
|**lastReceivedDate** | **String** | The last date a transaction was received by the VASP. |  [optional] |
|**documents** | **String** | Documents associated with the VASP. |  [optional] |
|**hasAdmin** | **Boolean** | Indicates if the VASP has an admin. |  |
|**isNotifiable** | **Boolean** | Indicates if the VASP is notifiable for compliance reasons. |  |
|**issuers** | [**TravelRuleIssuers**](TravelRuleIssuers.md) |  |  |



