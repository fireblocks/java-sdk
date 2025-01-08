

# UnstakeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | id of position to unstake |  |
|**fee** | **String** | Represents the fee for a transaction, which can be specified as a percentage value. Only one of fee/feeLevel is required. |  [optional] |
|**feeLevel** | **FeeLevel** |  |  [optional] |
|**txNote** | **String** | The note to associate with the transactions. |  [optional] |
|**amount** | **String** | The number of tokens to unstake.  This optional field is applicable only for liquid staking and allows for a partial unstake of the position.  If not provided, the entire position will be unstaked by default. |  [optional] |



