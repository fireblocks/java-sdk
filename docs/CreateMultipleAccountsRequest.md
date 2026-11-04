

# CreateMultipleAccountsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**count** | **Integer** | Count |  |
|**baseAssetIds** | **List&lt;String&gt;** | Array of base asset IDs |  |
|**names** | **List&lt;String&gt;** | Names to assign to vault accounts. if vaultAccountNamesStartingIndex or prefix is used it&#39;ll fail |  [optional] |
|**vaultAccountNamesStartingIndex** | **Integer** | Copy vault accounts names starting from this index. If names array is used it&#39;ll fail |  [optional] |
|**prefix** | **String** | When copying from existing vault accounts (vaultAccountNamesStartingIndex) then adding a prefix to the names. If names array is used it&#39;ll fail |  [optional] |
|**tagIds** | **List&lt;UUID&gt;** | Optional list of tag IDs to attach to all created vault accounts |  [optional] |
|**vaultType** | [**VaultTypeEnum**](#VaultTypeEnum) | Type of vault accounts to create. The default type is MPC. KEY_LINK creates Key Link vault accounts. It requires a Key Link workspace. With autoAssign set to true, the vault accounts are bound to the workspace&#39;s Key Link signing keys, assigned automatically from the available keys, and only one KEY_LINK bulk creation with autoAssign set to true can run per workspace at a time. With autoAssign set to false (the default), the vault accounts are created without keys. With KEY_LINK, names, vaultAccountNamesStartingIndex, prefix and tagIds work as they do for MPC, and baseAssetIds may be empty to create vault accounts without wallets.  |  [optional] |
|**autoAssign** | **Boolean** | Applicable only when vaultType is KEY_LINK. For MPC, this parameter is ignored. If set to true, keys are assigned to every created vault account. If there are not enough available keys to assign, the request returns an error and no vault accounts are created. If set to false, the vault accounts are created without any keys, and baseAssetIds must be empty because wallets can only be created for vault accounts that have keys.  |  [optional] |



## Enum: VaultTypeEnum

| Name | Value |
|---- | -----|
| MPC | &quot;MPC&quot; |
| KEY_LINK | &quot;KEY_LINK&quot; |



