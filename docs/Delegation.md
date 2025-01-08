

# Delegation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of the staking position |  |
|**vaultAccountId** | **String** | The source vault account to stake from |  |
|**validatorName** | **String** | The destination validator address name |  |
|**providerName** | **String** | The destination validator provider name |  |
|**chainDescriptor** | **String** | The protocol identifier (e.g. \&quot;ETH\&quot;/ \&quot;SOL\&quot;) to use |  |
|**amount** | **String** | Amount of tokens to stake, measured in the staked asset unit. |  |
|**rewardsAmount** | **String** | The amount staked in the position, measured in the staked asset unit. |  |
|**dateCreated** | **OffsetDateTime** | When was the request made (ISO Date). |  |
|**dateUpdated** | **OffsetDateTime** | When has the position last changed (ISO Date). |  |
|**status** | **String** | The current status. |  |
|**relatedTransactions** | [**List&lt;RelatedTransaction&gt;**](RelatedTransaction.md) | An array of transaction objects related to this position. Each object includes a &#39;txId&#39; representing the transaction ID and a &#39;completed&#39; boolean indicating if the transaction was completed. |  |
|**validatorAddress** | **String** | The destination address of the staking transaction. |  |
|**providerId** | **StakingProvider** |  |  |
|**availableActions** | **List&lt;String&gt;** | An array of available actions that can be performed. for example, actions like \&quot;unstake\&quot; or \&quot;withdraw\&quot;. |  |
|**inProgress** | **Boolean** | Indicates whether there is an ongoing action for this position (true if ongoing, false if not). |  |
|**inProgressTxId** | **String** | The transaction ID of the ongoing request |  [optional] |
|**blockchainPositionInfo** | [**SolanaBlockchainData**](SolanaBlockchainData.md) |  |  |
|**relatedRequests** | [**List&lt;RelatedRequest&gt;**](RelatedRequest.md) | An array of partial unstake requests for this position, relevant only for the Lido provider. Each object includes the status of the unstake request, a boolean indicating whether the action is in progress, the amount of tokens to unstake, and the transaction ID of the request. With Lido, a position may have multiple partial unstake requests in different states. This field is optional and not applicable for other providers. |  [optional] |



