

# VaultAsset


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**total** | **String** | The total wallet balance. In EOS this value includes the network balance, self staking and pending refund. For all other coins it is the balance as it appears on the blockchain. |  [optional] |
|**balance** | **String** | Deprecated - replaced by \&quot;total\&quot; |  [optional] |
|**available** | **String** | Funds available for transfer. Equals the blockchain balance minus any locked amounts |  [optional] |
|**pending** | **String** | The cumulative balance of all transactions pending to be cleared |  [optional] |
|**frozen** | **String** | The cumulative frozen balance |  [optional] |
|**lockedAmount** | **String** | Funds in outgoing transactions that are not yet published to the network |  [optional] |
|**staked** | **String** | Staked balance |  [optional] |
|**maxBip44AddressIndexUsed** | **BigDecimal** | The maximum BIP44 index used in deriving addresses for this wallet |  [optional] |
|**maxBip44ChangeAddressIndexUsed** | **BigDecimal** | The maximum BIP44 index used in deriving change addresses for this wallet |  [optional] |
|**totalStakedCPU** | **BigDecimal** | Deprecated |  [optional] |
|**totalStakedNetwork** | **String** | Deprecated |  [optional] |
|**selfStakedCPU** | **String** | Deprecated |  [optional] |
|**selfStakedNetwork** | **String** | Deprecated |  [optional] |
|**pendingRefundCPU** | **String** | Deprecated |  [optional] |
|**pendingRefundNetwork** | **String** | Deprecated |  [optional] |
|**blockHeight** | **String** |  |  [optional] |
|**blockHash** | **String** |  |  [optional] |
|**rewardsInfo** | [**RewardsInfo**](RewardsInfo.md) |  |  [optional] |



