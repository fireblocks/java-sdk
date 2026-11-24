

# ConnectedSingleAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subAccountsIds** | **List&lt;String&gt;** | IDs of sub-accounts associated with this connected account. |  [optional] |
|**totalCredit** | [**ConnectedAccountCredit**](ConnectedAccountCredit.md) | Total credit line available on the account. Returned only by the single-account endpoint (Get connected account); the list endpoint does not retrieve balances and never populates it. Omitted when total credit data is unavailable or balance retrieval is skipped. Absence does not imply zero credit. |  [optional] |
|**availableCredit** | [**ConnectedAccountCredit**](ConnectedAccountCredit.md) | Remaining unused credit available on the account. Returned only by the single-account endpoint (Get connected account); the list endpoint does not retrieve balances and never populates it. Omitted when available credit data is unavailable or balance retrieval is skipped. Absence does not imply zero credit. |  [optional] |



