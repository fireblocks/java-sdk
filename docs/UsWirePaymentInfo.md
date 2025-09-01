

# UsWirePaymentInfo

US Wire payment information for US domestic wire transfers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for US wire transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for US wire transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**accountNumber** | **String** | The bank account number |  |
|**routingNumber** | **String** | The bank routing number (ABA routing number) |  |
|**swiftCode** | **String** | The SWIFT/BIC code of the bank |  |
|**bankName** | **String** | The name of the bank |  |
|**bankAddressLine** | **String** | The street address of the bank |  |
|**bankAddressCity** | **String** | The city where the bank is located |  |
|**bankAddressState** | **String** | The state where the bank is located |  [optional] |
|**bankAddressCountry** | **String** | The country where the bank is located (ISO 3166-1 alpha-2 code) |  |
|**bankAddressPostalCode** | **String** | The postal code of the bank&#39;s address |  |
|**branchNumber** | **String** | The branch number of the bank |  [optional] |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| US_WIRE | &quot;US_WIRE&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| ABA | &quot;ABA&quot; |



