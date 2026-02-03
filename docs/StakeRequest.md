

# StakeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The Fireblocks vault account ID that will source the funds for staking. |  |
|**providerId** | **StakingProvider** |  |  |
|**stakeAmount** | **String** | The amount of tokens to stake. The amount may be truncated to match the chain&#39;s decimal precision requirements. |  |
|**txNote** | **String** | Optional note or comment to associate with the stake transaction. This note will be included in transaction records and can be used for tracking or audit purposes. |  [optional] |
|**fee** | **String** | Optional transaction fee. Controls the priority and cost of the blockchain transaction. Only one of &#39;fee&#39; or &#39;feeLevel&#39; should be provided; if both are specified, &#39;feeLevel&#39; takes precedence. |  [optional] |
|**feeLevel** | **FeeLevel** |  |  [optional] |
|**chainDescriptor** | **String** | Protocol identifier for the staking operation |  [optional] |
|**id** | **String** | Applies only to Ethereum compounding validator staking (Pectra/EIP-7251). The ID of an existing staking position to add additional stake to. When provided, adds stake to the specified position instead of creating a new one. Requires &#39;isCompoundingValidator&#39; to be true. |  [optional] |
|**isCompoundingValidator** | **Boolean** | Applies only to Ethereum staking. Indicates whether to use a compounding validator (see Pectra/EIP-7251). When true, creates a position that supports adding additional stake via the &#39;id&#39; parameter. If not provided, defaults to false and a legacy (non-compounding) validator will be used. |  [optional] |



