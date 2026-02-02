

# UnstakeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | id of position to unstake |  |
|**fee** | **String** | Represents the fee for a transaction, which can be specified as a percentage value. Only one of fee/feeLevel is required. |  [optional] |
|**feeLevel** | **FeeLevel** |  |  [optional] |
|**txNote** | **String** | The note to associate with the transactions. |  [optional] |
|**amount** | **String** | Amount of tokens to unstake. Only supported for liquid staking (Lido) to enable partial unstaking. For other chains, this field is ignored and the entire position will be unstaked. If not provided, the entire position will be unstaked. |  [optional] |



