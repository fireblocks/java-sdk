

# SpeiAdvancedPaymentInfo

Advanced SPEI payment information for Mexican bank transfers with full details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for SPEI transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for SPEI transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**bankName** | **String** | The name of the bank |  [optional] |
|**beneficiaryRfc** | **String** | The RFC (Registro Federal de Contribuyentes) of the beneficiary |  [optional] |
|**senderDocumentId** | **String** | The document ID of the sender |  [optional] |
|**clabe** | **String** | The CLABE (Clave Bancaria Estandarizada) number |  |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| SPEI | &quot;SPEI&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| CLABE | &quot;CLABE&quot; |



