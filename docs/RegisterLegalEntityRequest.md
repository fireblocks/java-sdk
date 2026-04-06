

# RegisterLegalEntityRequest

Request body to register a new legal entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lei** | **String** | Legal Entity Identifier (LEI) code to register. Must be a valid 20-character LEI present in the GLEIF registry. |  |
|**travelRuleProviders** | **List&lt;TravelRuleProvider&gt;** | Travel rule providers to associate with this registration |  [optional] |
|**travelRuleContactEmail** | **String** | Contact email for travel rule communications |  [optional] |



