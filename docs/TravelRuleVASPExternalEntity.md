

# TravelRuleVASPExternalEntity

The VASP's entity data as held by an external registry. These fields mirror a subset of the top-level VASP fields, but carry the registry's values rather than the VASP's own, so the two may differ.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legalName** | **String** | The legal name of the entity as recorded by the external registry. |  [optional] |
|**otherLegalName** | **String** | Alternative legal names of the entity, as a comma-separated list. |  [optional] |
|**legalForm** | **String** | The Entity Legal Form (ELF) code of the entity. |  [optional] |
|**legalStructure** | **String** | The legal structure of the entity. The external registry may return the Entity Legal Form code in this field, so its value can duplicate &#x60;legalForm&#x60;. |  [optional] |
|**entityCategory** | **String** | The category assigned to the entity by the external registry. |  [optional] |
|**entityStatus** | **String** | The status of the entity at the external registry. |  [optional] |
|**businessNumber** | **String** | The business registration number of the entity. |  [optional] |
|**yearFounded** | **String** | The year the entity was founded. Returned as a string, not an integer. |  [optional] |
|**jurisdictions** | **String** | The jurisdictions the entity is registered in. |  [optional] |
|**addressLine1** | **String** | The first line of the entity&#39;s registered address. |  [optional] |
|**number** | **String** | The building number of the entity&#39;s registered address. May be returned as an empty string as well as &#x60;null&#x60; when not supplied. |  [optional] |
|**postCode** | **String** | The postal code of the entity&#39;s registered address. |  [optional] |
|**city** | **String** | The city of the entity&#39;s registered address. |  [optional] |
|**state** | **String** | The state or region of the entity&#39;s registered address, as an ISO-3166-2 subdivision code. |  [optional] |
|**country** | **String** | The country of the entity&#39;s registered address (ISO-3166 Alpha-2 code). |  [optional] |
|**hqStreet** | **String** | The street of the entity&#39;s headquarters address. |  [optional] |
|**hqNumber** | **String** | The building number of the entity&#39;s headquarters address. May be returned as an empty string as well as &#x60;null&#x60; when not supplied. |  [optional] |
|**hqPostcode** | **String** | The postal code of the entity&#39;s headquarters address. |  [optional] |
|**hqCity** | **String** | The city of the entity&#39;s headquarters address. |  [optional] |
|**hqRegion** | **String** | The region of the entity&#39;s headquarters address, as an ISO-3166-2 subdivision code. |  [optional] |
|**hqCountry** | **String** | The country of the entity&#39;s headquarters address (ISO-3166 Alpha-2 code). |  [optional] |



