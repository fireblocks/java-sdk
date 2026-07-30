

# FpsHkPaymentInfo

FPS HK payment information for Hong Kong Faster Payment System transfers (HKD)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rail** | [**RailEnum**](#RailEnum) | The payment rail type for Hong Kong FPS transfers |  |
|**addressingSystem** | [**AddressingSystemEnum**](#AddressingSystemEnum) | The addressing system used for Hong Kong FPS transfers |  |
|**recipientLegalName** | **String** | Full legal name of the recipient |  [optional] |
|**accountNumber** | **String** | Recipient bank account number |  [optional] |
|**bankCode** | **String** | Hong Kong bank code |  [optional] |
|**phone** | **String** | Recipient phone number in E.164 format |  [optional] |
|**email** | **String** | Recipient email address |  [optional] |
|**fpsId** | **String** | Hong Kong FPS identifier |  [optional] |



## Enum: RailEnum

| Name | Value |
|---- | -----|
| FPS_HK | &quot;FPS_HK&quot; |



## Enum: AddressingSystemEnum

| Name | Value |
|---- | -----|
| FPS_HK | &quot;FPS_HK&quot; |



