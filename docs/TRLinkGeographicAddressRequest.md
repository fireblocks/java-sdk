

# TRLinkGeographicAddressRequest

Geographic address following IVMS101 standard

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressLine** | **List&lt;String&gt;** | Address lines (max 3, each up to 70 characters) |  [optional] |
|**streetName** | **String** | Street name (required if buildingNumber is provided) |  [optional] |
|**buildingNumber** | **String** | Building number |  [optional] |
|**floor** | **String** | Floor number |  [optional] |
|**postBox** | **String** | Post box number |  [optional] |
|**postCode** | **String** | Postal code (required if townName is provided) |  [optional] |
|**townName** | **String** | City or town name (required if postCode is provided) |  [optional] |
|**districtName** | **String** | District name |  [optional] |
|**countrySubDivision** | **String** | State or province (validated against country) |  [optional] |
|**country** | **String** | ISO 3166-1 alpha-2 country code (required if town, district, or sub-division provided) |  [optional] |



