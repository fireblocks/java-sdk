

# ConnectedSingleAccountResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the connected account. |  |
|**name** | **String** | Human-readable name of the connected account. |  |
|**providerId** | **String** | The ID of the venue the account belongs to. |  |
|**status** | **ConnectedAccountApprovalStatus** |  |  |
|**totalBalance** | [**ConnectedAccountTotalBalance**](ConnectedAccountTotalBalance.md) |  |  |
|**manifest** | [**ConnectedAccountManifest**](ConnectedAccountManifest.md) |  |  |
|**parentId** | **String** | The ID of the parent main account, if this is a sub account. |  [optional] |
|**apiKey** | **String** | The API key identifier used to connect this account. |  [optional] |
|**providerAccountName** | **String** | The account name provided by the provider. |  [optional] |
|**accountType** | **ConnectedAccountType** |  |  |
|**subAccountsIds** | **List&lt;String&gt;** | IDs of sub-accounts associated with this connected account. |  [optional] |
|**totalCredit** | [**ConnectedAccountCredit**](ConnectedAccountCredit.md) | Total credit line available on the account. Returned only by the single-account endpoint (Get connected account); the list endpoint does not retrieve balances and never populates it. Omitted when total credit data is unavailable or balance retrieval is skipped. Absence does not imply zero credit. |  [optional] |
|**availableCredit** | [**ConnectedAccountCredit**](ConnectedAccountCredit.md) | Remaining unused credit available on the account. Returned only by the single-account endpoint (Get connected account); the list endpoint does not retrieve balances and never populates it. Omitted when available credit data is unavailable or balance retrieval is skipped. Absence does not imply zero credit. |  [optional] |



