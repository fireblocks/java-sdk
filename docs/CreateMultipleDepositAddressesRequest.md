

# CreateMultipleDepositAddressesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **Integer** | Existing Vault account ID to add deposit addresses to |  |
|**assetId** | **String** | asset ID |  |
|**count** | **Integer** | Count of deposit addresses to issue |  |
|**descriptions** | **List&lt;String&gt;** | Desctiptions of the newly created addresses |  [optional] |
|**vaultAccountToCopyDescFrom** | **Integer** | Existing Vault Account ID to copy deposit addresses descriptions from in case no descriptions were provided |  [optional] |
|**vaultAccountToCopyDescFromIndex** | **Integer** | Existing length within the vault account to copy deposit addresses descriptions from |  [optional] |



