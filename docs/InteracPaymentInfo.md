

# InteracPaymentInfo

Interac e-Transfer payment information for Canadian dollar transfers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for Interac transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for Interac transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**country** | **String** | The country for the transfer (ISO 3166-1 alpha-2 code) |  |
|**recipientHandleType** | [**RecipientHandleTypeEnum**](#RecipientHandleTypeEnum) | The type of recipient handler being used |  |
|**recipientHandleValue** | **String** | Email address registered for Interac e-Transfer |  |
|**message** | **String** | The message to be sent to the recipient |  |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| INTERAC | &quot;INTERAC&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| INTERAC | &quot;INTERAC&quot; |



## Enum: RecipientHandleTypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;EMAIL&quot; |



