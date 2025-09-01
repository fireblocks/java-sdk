

# PixPaymentInfo

PIX payment information for Brazilian instant payments

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for PIX transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for PIX transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**pixKey** | **String** | The PIX key used for the transfer |  |
|**bankName** | **String** | The name of the bank |  [optional] |
|**bankCode** | **String** | The bank code (ISPB - Identificador do Sistema de Pagamentos Brasileiros) |  [optional] |
|**keyType** | [**KeyTypeEnum**](#KeyTypeEnum) | The type of PIX key being used |  |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| PIX | &quot;PIX&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| PIX | &quot;PIX&quot; |



## Enum: KeyTypeEnum

| Name | Value |
|---- | -----|
| CPF | &quot;CPF&quot; |
| CNPJ | &quot;CNPJ&quot; |
| EMAIL | &quot;EMAIL&quot; |
| PHONE | &quot;PHONE&quot; |
| RANDOM | &quot;RANDOM&quot; |



