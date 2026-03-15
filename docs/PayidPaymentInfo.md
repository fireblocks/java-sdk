

# PayidPaymentInfo

PayID payment information for Australian dollar transfers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for PayID transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for PayID transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**value** | **String** | The PayID identifier (email, phone, ABN, or organization ID) |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of PayID being used |  |
|**bsb** | **String** | Bank State Branch (BSB) number (6 digits, format XXX-XXX) |  [optional] |
|**accountNumber** | **String** | Australian bank account number |  |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| PAYID | &quot;PAYID&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| PAYID | &quot;PAYID&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;EMAIL&quot; |



