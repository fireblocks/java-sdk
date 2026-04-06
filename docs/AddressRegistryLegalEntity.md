

# AddressRegistryLegalEntity

Legal entity details for a blockchain address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verified** | **Boolean** | Whether the entity was resolved from verified public registry data (e.g. LEI sources). |  |
|**entityName** | **String** | Legal entity display name. |  |
|**jurisdiction** | **String** | Jurisdiction (e.g. ISO 3166-1 alpha-2 country code). |  |
|**lei** | **String** | Legal Entity Identifier when available; may be empty when unverified. |  |
|**travelRuleProviders** | **List&lt;AddressRegistryTravelRuleProvider&gt;** |  |  |
|**email** | **String** | Travel Rule contact email when available. |  |



