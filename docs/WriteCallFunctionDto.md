

# WriteCallFunctionDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The vault account id this contract was deploy from |  |
|**abiFunction** | [**WriteAbiFunction**](WriteAbiFunction.md) |  |  |
|**amount** | **String** | Amount in base asset. Being used in payable functions |  [optional] |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | Fee level for the write function transaction. interchangeable with the &#39;fee&#39; field |  [optional] |
|**fee** | **String** | Max fee amount for the write function transaction. interchangeable with the &#39;feeLevel&#39; field |  [optional] |
|**note** | **String** | Custom note, not sent to the blockchain, that describes the transaction at your Fireblocks workspace |  [optional] |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



