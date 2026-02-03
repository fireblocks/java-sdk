

# OnchainTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier for the transaction |  |
|**baseAssetId** | **String** | The blockchain base asset identifier |  |
|**blockHash** | **String** | Hash of the block containing this transaction |  |
|**blockNumber** | **Integer** | Block number containing this transaction |  |
|**blockTimestamp** | **OffsetDateTime** | Timestamp when the block was mined |  |
|**chainId** | **Integer** | Chain ID of the blockchain |  |
|**contractAddress** | **String** | Contract address if this is a contract transaction |  [optional] |
|**cumulativeGasUsed** | **String** | Cumulative gas used in the block up to this transaction |  |
|**decodedLogs** | [**DecodedLog**](DecodedLog.md) |  |  [optional] |
|**effectiveGasPrice** | **String** | Effective gas price paid for the transaction |  |
|**fromAddress** | **String** | Address that initiated the transaction |  |
|**gasUsed** | **String** | Amount of gas used by this transaction |  |
|**status** | **String** | Transaction status |  |
|**toAddress** | **String** | Address that received the transaction |  [optional] |
|**transactionHash** | **String** | Hash of the transaction |  |
|**transactionIndex** | **String** | Index of the transaction in the block |  |
|**type** | **String** | Transaction type |  |



