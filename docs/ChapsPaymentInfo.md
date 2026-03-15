

# ChapsPaymentInfo

CHAPS payment information for UK pound sterling same-day transfers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for CHAPS transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for CHAPS transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
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



