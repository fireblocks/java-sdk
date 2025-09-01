

# AchPaymentInfo

ACH payment information for US Automated Clearing House transfers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for ACH transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for ACH transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**accountNumber** | **String** | The bank account number |  |
|**routingNumber** | **String** | The bank routing number (ABA routing number) |  |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | The type of bank account |  |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| ACH | &quot;ACH&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| ACH | &quot;ACH&quot; |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;CHECKING&quot; |
| SAVINGS | &quot;SAVINGS&quot; |



