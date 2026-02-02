

# WithdrawRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | id of position to withdraw |  |
|**fee** | **String** | Represents the fee for a transaction, which can be specified as a percentage value. Only one of fee/feeLevel is required. |  [optional] |
|**feeLevel** | **FeeLevel** |  |  [optional] |
|**txNote** | **String** | The note to associate with the transactions. |  [optional] |
|**amount** | **String** | Amount of tokens to withdraw. Only supported for Cosmos chains to enable partial withdrawals. For other chains, this field is ignored and the entire available amount will be withdrawn. If not provided, the entire available amount will be withdrawn. |  [optional] |



