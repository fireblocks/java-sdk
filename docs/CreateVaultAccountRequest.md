

# CreateVaultAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Account Name |  [optional] |
|**hiddenOnUI** | **Boolean** | Optional - if true, the created account and all related transactions will not be shown on Fireblocks console |  [optional] |
|**customerRefId** | **String** | Optional - Sets a customer reference ID |  [optional] |
|**autoFuel** | **Boolean** | Optional - Sets the autoFuel property of the vault account |  [optional] |
|**vaultType** | [**VaultTypeEnum**](#VaultTypeEnum) | Type of vault account. The default type will be set to MPC.&lt;br/&gt;  If the workspace does not support the selected type, it will return an error. |  [optional] |
|**autoAssign** | **Boolean** | Applicable only when the vault account type is KEY_LINK. For MPC, this parameter will be ignored.&lt;br/&gt; If set to true and there are available keys, random keys will be assigned to the newly created vault account.&lt;br/&gt; If set to true and there are no available keys to be assigned, it will return an error.&lt;br/&gt; If set to false, the vault account will be created without any keys. |  [optional] |



## Enum: VaultTypeEnum

| Name | Value |
|---- | -----|
| MPC | &quot;MPC&quot; |
| KEY_LINK | &quot;KEY_LINK&quot; |



