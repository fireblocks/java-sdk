

# AddressRegistryLegalEntity

Legal entity details for a blockchain address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**leiData** | **Boolean** | Indicates whether LEI (Legal Entity Identifier) data is available for this address from a verified public registry. A value of &#x60;false&#x60; means no LEI record was found. |  |
|**entityName** | **String** | Legal entity display name. |  |
|**jurisdiction** | **String** | Jurisdiction (e.g. ISO 3166-1 alpha-2 country code). |  |
|**lei** | **String** | Legal Entity Identifier when available. Empty when &#x60;leiData&#x60; is &#x60;false&#x60;. |  |
|**travelRuleProviders** | **List&lt;AddressRegistryTravelRuleProvider&gt;** |  |  |
|**email** | **String** | Travel Rule contact email when available. |  |



