

# OnchainTransferEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier for the transfer event |  |
|**transactionHash** | **String** | Hash of the transaction containing this transfer |  |
|**logIndex** | **String** | Index of the log within the transaction |  |
|**contractAddress** | **String** | Address of the token contract |  |
|**fromAddress** | **String** | Address that sent the tokens |  |
|**toAddress** | **String** | Address that received the tokens |  |
|**value** | **String** | Amount of tokens transferred (in smallest unit) |  |
|**chainId** | **Integer** | Chain ID of the blockchain |  |
|**baseAssetId** | **String** | The blockchain base asset identifier |  |
|**blockNumber** | **Integer** | Block number containing this transfer |  |
|**blockHash** | **String** | Hash of the block containing this transfer |  |
|**blockTimestamp** | **OffsetDateTime** | Timestamp when the block was mined |  |
|**eventName** | **String** | Name of the event (typically \&quot;Transfer\&quot;) |  |



