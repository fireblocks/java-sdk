

# CreateMultipleAccountsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**count** | **Integer** | Count |  |
|**baseAssetIds** | **List&lt;String&gt;** | Array of base asset IDs |  |
|**names** | **List&lt;String&gt;** | Names to assign to vault accounts. if vaultAccountNamesStartingIndex or prefix is used it&#39;ll fail |  [optional] |
|**vaultAccountNamesStartingIndex** | **Integer** | Copy vault accounts names starting from this index. If names array is used it&#39;ll fail |  [optional] |
|**prefix** | **String** | When copying from existing vault accounts (vaultAccountNamesStartingIndex) then adding a prefix to the names. If names array is used it&#39;ll fail |  [optional] |



