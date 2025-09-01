

# SepaPaymentInfo

SEPA payment information for European Single Euro Payments Area transfers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for SEPA transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for SEPA transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**accountHolderCountry** | **String** | The country where the account holder resides (ISO 3166-1 alpha-2 code) |  [optional] |
|**accountHolderAddress** | **String** | The address of the account holder |  [optional] |
|**iban** | **String** | The International Bank Account Number (IBAN) |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**bic** | **String** | The Bank Identifier Code (BIC/SWIFT code) |  [optional] |
|**bankName** | **String** | The name of the bank |  [optional] |
|**bankBranch** | **String** | The bank branch information |  [optional] |
|**bankAddress** | **String** | The address of the bank |  [optional] |
|**purposeCode** | **String** | The purpose code for the transfer |  [optional] |
|**taxId** | **String** | The tax identification number |  [optional] |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| SEPA | &quot;SEPA&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| IBAN | &quot;IBAN&quot; |



