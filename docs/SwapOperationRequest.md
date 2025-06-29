

# SwapOperationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerQuoteId** | **UUID** | An identifier that uniquely identifies the received quote |  |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | The fee level of the transaction |  [optional] |
|**txNote** | **String** | user note on the transaction |  [optional] |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



