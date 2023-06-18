

# AssetWallet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultId** | **String** | ID of the vault account. You can [get the vault account by this ID](https://developers.fireblocks.com/reference/get_vault-accounts-vaultaccountid) to retrieve vault properties such as its name, auto fueling, hidden on UI or customer reference ID. |  [optional] |
|**assetId** | **String** | ID of the asset. You can get more information about this asset by using the [supported assets API](https://developers.fireblocks.com/reference/get_supported-assets) |  [optional] |
|**available** | **String** | Available balance, available to use in a transaction. |  [optional] |
|**total** | **String** | Total balance at the asset wallet, as seen at the blockchain explorers. This includes balance available, and any kind of unavailable balance such as locked, frozen, or others. |  [optional] |
|**pending** | **String** | Pending balance. |  [optional] |
|**staked** | **String** | Staked balance. |  [optional] |
|**frozen** | **String** | Funds frozen due to the anti-money laundering policy at this workspace. |  [optional] |
|**lockedAmount** | **String** | Locked balance. |  [optional] |
|**blockHeight** | **String** | The height (number) of the block of the balance. Can by empty. |  [optional] |
|**blockHash** | **String** | The hash of the block of the balance. Can by empty. |  [optional] |
|**creationTimestamp** | **String** | Unix timestamp of the time the asset wallet was created. |  [optional] |



