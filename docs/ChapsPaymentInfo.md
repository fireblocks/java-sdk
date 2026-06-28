

# ChapsPaymentInfo

CHAPS payment information for UK pound sterling same-day transfers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for CHAPS transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for CHAPS transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**accountHolderCity** | **String** | The city where the account holder resides |  [optional] |
|**accountHolderCountry** | **String** | The country where the account holder resides (ISO 3166-1 alpha-2 code) |  [optional] |
|**accountHolderPostalCode** | **String** | The postal code of the account holder&#39;s address |  [optional] |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**sortCode** | **String** | UK bank sort code (format XX-XX-XX) |  |
|**accountNumber** | **String** | UK bank account number |  |
|**bankName** | **String** | The name of the bank |  [optional] |
|**bankAccountCountry** | **String** | CHAPS bank account holder name |  |
|**bankAccountHolderName** | **String** | CHAPS bank account holder name |  |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| CHAPS | &quot;CHAPS&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| CHAPS | &quot;CHAPS&quot; |



