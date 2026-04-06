

# LegalEntityRegistration

Legal entity registration record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique registration identifier |  |
|**lei** | **String** | Legal Entity Identifier (LEI) code |  |
|**status** | **LeiStatus** |  |  |
|**isDefault** | **Boolean** | Whether this is the default legal entity for the workspace |  |
|**travelRuleProviders** | **List&lt;TravelRuleProvider&gt;** | Travel rule providers configured for this registration |  |
|**travelRuleContactEmail** | **String** | Contact email for travel rule communications |  [optional] |
|**gleifData** | [**GleifData**](GleifData.md) |  |  [optional] |
|**createdAt** | **String** | Creation timestamp in milliseconds since epoch |  |
|**updatedAt** | **String** | Last update timestamp in milliseconds since epoch |  |



