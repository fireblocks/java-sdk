

# EmbeddedWalletAssetBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the asset balance entry |  |
|**total** | **String** | Total balance amount for the asset in the account (including pending, locked, and available) |  |
|**available** | **String** | The balance available for use or withdrawal |  |
|**pending** | **String** | Amount pending confirmation from blockchain (e.g., unconfirmed deposits) |  |
|**frozen** | **String** | Balance that is frozen due to policy or regulatory lock |  |
|**lockedAmount** | **String** | Funds locked for operations such as staking or delegation |  |
|**blockHeight** | **String** | Latest known blockchain height when balance was fetched |  [optional] |
|**blockHash** | **String** | Hash of the blockchain block associated with the current balance state |  [optional] |
|**rewardInfo** | [**EmbeddedWalletAssetRewardInfo**](EmbeddedWalletAssetRewardInfo.md) |  |  [optional] |



