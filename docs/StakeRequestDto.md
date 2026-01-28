

# StakeRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The source vault account to stake from |  |
|**providerId** | **String** | The ID of the provider |  |
|**stakeAmount** | **String** | Amount of tokens to stake |  |
|**txNote** | **String** | The note to associate with the stake transactions. |  [optional] |
|**fee** | **String** | Represents the fee for a transaction, which can be specified as a percentage value. Only one of fee/feeLevel is required. |  [optional] |
|**feeLevel** | **String** | Represents the fee level for a transaction, which can be set as slow, medium, or fast. Only one of fee/feeLevel is required. |  [optional] |



