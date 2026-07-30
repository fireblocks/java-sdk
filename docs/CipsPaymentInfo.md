

# CipsPaymentInfo

CIPS payment information for Cross-Border Interbank Payment System transfers (CNY)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for CIPS transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for CIPS transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  [optional] |
|**bankName** | **String** | Name of the recipient&#39;s bank |  |
|**bankCountry** | **String** | ISO 3166-1 alpha-2 country code of the bank |  |
|**swiftCode** | **String** | SWIFT/BIC code of the recipient bank |  |
|**accountNumber** | **String** | Recipient bank account number |  |
|**referenceId** | **String** | Optional payment reference |  [optional] |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| CIPS | &quot;CIPS&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| CIPS | &quot;CIPS&quot; |



