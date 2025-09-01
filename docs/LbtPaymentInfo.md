

# LbtPaymentInfo

LBT (Lebanese Bank Transfer) payment information for Lebanese bank transfers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for Lebanese bank transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for Lebanese bank transfers (Bank Account Number) |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**accountNumber** | **String** | The bank account number |  |
|**bankName** | **String** | The name of the bank |  |
|**bankCode** | **String** | The bank code or identifier |  |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| LBT | &quot;LBT&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| BAN | &quot;BAN&quot; |



