

# InstaPayPaymentInfo

InstaPay payment information for Philippine instant payment transfers (PHP)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for InstaPay transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for InstaPay transfers |  |
|**accountHolderGivenName** | **String** | The given name (first name) of the account holder |  |
|**accountHolderSurname** | **String** | The surname (last name) of the account holder |  |
|**accountNumber** | **String** | Recipient bank account or wallet number |  |
|**bankName** | **String** | Name of the recipient&#39;s bank or wallet (e.g. BDO, BPI, GCash, Maya) |  |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| INSTA_PAY | &quot;INSTA_PAY&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| INSTA_PAY | &quot;INSTA_PAY&quot; |



