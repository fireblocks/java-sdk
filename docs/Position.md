

# Position


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of the staking position |  |
|**vaultAccountId** | **String** | The source vault account to stake from |  |
|**validatorName** | **String** | The destination validator address name |  |
|**providerName** | **String** | The destination validator provider name |  |
|**chainDescriptor** | **String** | The protocol identifier (e.g. \&quot;ETH\&quot;/ \&quot;SOL\&quot;) to use |  |
|**amount** | **String** | Total value of the staking position. For Solana, Lido and Ethereum (compounding validator): includes the original stake plus accumulated rewards. For MATIC, Cosmos and Ethereum (legacy validator): refers to the amount currently staked. |  |
|**rewardsAmount** | **String** | The amount staked in the position, measured in the staked asset unit. |  |
|**dateCreated** | **OffsetDateTime** | When was the request made (ISO Date). |  |
|**dateUpdated** | **OffsetDateTime** | When has the position last changed (ISO Date). |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status. |  |
|**validatorAddress** | **String** | The destination address of the staking transaction. |  |
|**providerId** | **StakingProvider** |  |  |
|**availableActions** | [**List&lt;AvailableActionsEnum&gt;**](#List&lt;AvailableActionsEnum&gt;) | An array of available actions that can be performed. for example, actions like \&quot;UNSTAKE\&quot; or \&quot;WITHDRAW\&quot;. |  |
|**inProgress** | **Boolean** | Indicates whether there is an ongoing action for this position related to this request |  |
|**inProgressTxId** | **String** | The transaction ID of the initial stake position request only. Only present when there is an active initial stake transaction. |  [optional] |
|**blockchainPositionInfo** | [**DelegationBlockchainPositionInfo**](DelegationBlockchainPositionInfo.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATING | &quot;CREATING&quot; |
| PENDING | &quot;PENDING&quot; |
| ACTIVATING | &quot;ACTIVATING&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| DEACTIVATING | &quot;DEACTIVATING&quot; |
| DEACTIVATED | &quot;DEACTIVATED&quot; |
| WITHDRAWING | &quot;WITHDRAWING&quot; |
| WITHDRAWN | &quot;WITHDRAWN&quot; |
| MERGED | &quot;MERGED&quot; |
| CONSOLIDATED | &quot;CONSOLIDATED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: List&lt;AvailableActionsEnum&gt;

| Name | Value |
|---- | -----|
| UNSTAKE | &quot;UNSTAKE&quot; |
| WITHDRAW | &quot;WITHDRAW&quot; |
| ADD_TO_STAKE | &quot;ADD_TO_STAKE&quot; |
| SPLIT | &quot;SPLIT&quot; |
| MERGE | &quot;MERGE&quot; |
| CLAIM_REWARDS | &quot;CLAIM_REWARDS&quot; |
| CONSOLIDATE | &quot;CONSOLIDATE&quot; |



