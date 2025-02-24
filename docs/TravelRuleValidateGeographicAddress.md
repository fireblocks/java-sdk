

# TravelRuleValidateGeographicAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**streetName** | **String** | Name of a street or thoroughfare |  [optional] |
|**townName** | **String** | Name of a built-up area, with defined boundaries, and a local government |  [optional] |
|**country** | **String** | Nation with its own government (ISO-3166 Alpha-2 country code) |  [optional] |
|**buildingNumber** | **String** | Number that identifies the position of a building on a street |  [optional] |
|**postCode** | **String** | Identifier consisting of a group of letters and/or numbers added to a postal address to assist the sorting of mail |  [optional] |
|**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) | Specifies the type of address. Acceptable values are: - &#39;HOME&#39;: Residential, the home address - &#39;BIZZ&#39;: Business, the business address - &#39;GEOG&#39;: Geographic, an unspecified physical (geographical) address |  [optional] |
|**department** | **String** | Identification of a division of a large organisation or building |  [optional] |
|**subDepartment** | **String** | Identification of a sub-division of a large organisation or building |  [optional] |
|**buildingName** | **String** | Name of the building or house |  [optional] |
|**floor** | **String** | Floor or storey within a building |  [optional] |
|**postBox** | **String** | Numbered box in a post office |  [optional] |
|**room** | **String** | Building room number |  [optional] |
|**townLocationName** | **String** | Specific location name within the town |  [optional] |
|**districtName** | **String** | Identifies a subdivision within a country subdivision |  [optional] |
|**countrySubDivision** | **String** | Identifies a subdivision of a country such as state, region, or province |  [optional] |
|**addressLine** | **List&lt;String&gt;** | Information that locates and identifies a specific address, presented in free format text |  [optional] |



## Enum: AddressTypeEnum

| Name | Value |
|---- | -----|
| HOME | &quot;HOME&quot; |
| BIZZ | &quot;BIZZ&quot; |
| GEOG | &quot;GEOG&quot; |



