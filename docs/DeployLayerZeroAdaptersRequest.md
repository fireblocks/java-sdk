

# DeployLayerZeroAdaptersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The id of the vault account that initiated the request to deploy adapter for the token |  |
|**createParams** | [**List&lt;LayerZeroAdapterCreateParams&gt;**](LayerZeroAdapterCreateParams.md) | Array of creation parameters for LayerZero adapters, one per tokenLink. |  |
|**displayName** | **String** | The display name of the contract |  [optional] |
|**useGasless** | **Boolean** | Whether to use gasless deployment or not |  [optional] |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | Fee level for the write function transaction. interchangeable with the &#39;fee&#39; field |  [optional] |
|**fee** | **String** | Max fee amount for the write function transaction. interchangeable with the &#39;feeLevel&#39; field |  [optional] |
|**salt** | **String** | The salt to calculate the deterministic address. Must be a number between 0 and 2^256 -1, for it to fit in the bytes32 parameter |  [optional] |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



