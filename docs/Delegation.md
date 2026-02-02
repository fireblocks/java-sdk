

# Delegation


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
|**status** | **String** | The current status. |  |
|**relatedTransactions** | [**List&lt;RelatedTransaction&gt;**](RelatedTransaction.md) | An array of transaction objects related to this position. Each object includes a &#39;txId&#39; representing the transaction ID and a &#39;completed&#39; boolean indicating if the transaction was completed. |  |
|**validatorAddress** | **String** | The destination address of the staking transaction. |  |
|**providerId** | **StakingProvider** |  |  |
|**availableActions** | **List&lt;String&gt;** | An array of available actions that can be performed. for example, actions like \&quot;unstake\&quot; or \&quot;withdraw\&quot;. |  |
|**inProgress** | **Boolean** | Indicates whether there is an ongoing action for this position related to this request |  |
|**inProgressTxId** | **String** | The transaction ID of the initial stake position request only. Only present when there is an active initial stake transaction. |  [optional] |
|**blockchainPositionInfo** | [**DelegationBlockchainPositionInfo**](DelegationBlockchainPositionInfo.md) |  |  |
|**relatedRequests** | [**List&lt;RelatedRequest&gt;**](RelatedRequest.md) |  |  [optional] |



