

# WriteCallFunctionDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The vault account id this contract was deploy from |  |
|**abiFunction** | [**WriteCallFunctionDtoAbiFunction**](WriteCallFunctionDtoAbiFunction.md) |  |  |
|**amount** | **String** | Amount in base asset. Being used in payable functions |  [optional] |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | Fee level for the write function transaction. interchangeable with the &#39;fee&#39; field |  [optional] |
|**fee** | **String** | Max fee amount for the write function transaction. interchangeable with the &#39;feeLevel&#39; field |  [optional] |
|**note** | **String** | Custom note, not sent to the blockchain, that describes the transaction at your Fireblocks workspace |  [optional] |
|**useGasless** | **Boolean** | Indicates whether the token should be created in a gasless manner, utilizing the ERC-2771 standard. When set to true, the transaction will be relayed by a designated relayer. The workspace must be configured to use Fireblocks gasless relay. |  [optional] |
|**externalId** | **String** | External id that can be used to identify the transaction in your system. The unique identifier of the transaction outside of Fireblocks with max length of 255 characters |  [optional] |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



