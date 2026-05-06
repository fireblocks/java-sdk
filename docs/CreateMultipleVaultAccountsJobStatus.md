

# CreateMultipleVaultAccountsJobStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Status of the job. Possible values - Success, In Progress, Failed, Pending Approval, Cancelled |  |
|**vaultAccounts** | **Map&lt;String, Map&lt;String, String&gt;&gt;** | Mapping between VaultAccountId to a mapping of asset to address |  [optional] |
|**tagIds** | **List&lt;UUID&gt;** | List of tag IDs successfully attached to each of the created vault accounts |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**approvalRequestId** | **String** | Approval request ID if the job has protected tags to attach to the vault accounts |  [optional] |



