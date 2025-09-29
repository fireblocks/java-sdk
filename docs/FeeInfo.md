

# FeeInfo

Details of the transaction's fee.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkFee** | **String** | The fee paid to the network |  [optional] |
|**serviceFee** | **String** | The total fee deducted by the exchange from the actual requested amount (serviceFee &#x3D; amount - netAmount) |  [optional] |
|**gasPrice** | **String** |  |  [optional] |
|**l1networkFee** | **String** | Layer 1 network fee for Layer 2 blockchain transactions |  [optional] |
|**l2networkFee** | **String** | Layer 2 network fee (gas price component for Layer 2 transactions) |  [optional] |
|**paidByRelay** | **Boolean** | Wether the fee was paid by the relay or not |  [optional] |
|**relayType** | [**RelayTypeEnum**](#RelayTypeEnum) | Wether the relay is the same tenant (LOCAL) or another tenant (THIRD_PARTY) |  [optional] |
|**relayId** | **String** | The vault account ID of the relay |  [optional] |
|**relayName** | **String** | The name of the tenant, only for THIRD_PARTY relays |  [optional] |
|**feeUSD** | **String** | The USD value of the fee |  [optional] |



## Enum: RelayTypeEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;LOCAL&quot; |
| THIRD_PARTY | &quot;THIRD_PARTY&quot; |



