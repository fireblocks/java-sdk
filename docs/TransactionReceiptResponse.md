

# TransactionReceiptResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockHash** | **String** | The block hash |  |
|**blockNumber** | **Integer** | The block number |  |
|**contractAddress** | **String** | The address of deployed contract |  [optional] |
|**cumulativeGasUsed** | **Integer** | The cumulative gas used in the transaction |  |
|**effectiveGasPrice** | **Integer** | The effective gas price |  |
|**from** | **String** | Sender address |  |
|**gasUsed** | **Integer** | Gas used by the transaction |  |
|**logs** | [**List&lt;TxLog&gt;**](TxLog.md) | Array of transaction logs |  |
|**logsBloom** | **String** | Logs bloom filter |  |
|**status** | **Integer** | Transaction status (1 for success, 0 for failure) |  |
|**to** | **String** | Recipient address |  [optional] |
|**transactionHash** | **String** | The transaction hash |  |
|**transactionIndex** | **Integer** | Transaction index in the block |  |
|**type** | **String** | Type of transaction |  |



