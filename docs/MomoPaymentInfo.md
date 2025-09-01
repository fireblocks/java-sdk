

# MomoPaymentInfo

Mobile Money (MOMO) payment information for African mobile payment services

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for mobile money transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for mobile money transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**mobilePhoneNumber** | **String** | The mobile phone number associated with the mobile money account |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) | The mobile money service provider |  |
|**beneficiaryDocumentId** | **String** | The document ID of the beneficiary |  [optional] |
|**beneficiaryRelationship** | **String** | The relationship between sender and beneficiary |  [optional] |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| MOMO | &quot;MOMO&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| MOMO | &quot;MOMO&quot; |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| M_PESA | &quot;M_PESA&quot; |
| AIRTEL | &quot;AIRTEL&quot; |
| MTN | &quot;MTN&quot; |
| TIGO | &quot;TIGO&quot; |



