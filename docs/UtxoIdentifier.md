

# UtxoIdentifier

Identifies a UTXO by either a Fireblocks transaction ID (targets all outputs of that transaction) or a specific on-chain UTXO (txHash + vout). Exactly one of these two forms must be provided.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**txId** | **String** | Fireblocks transaction ID |  [optional] |
|**txHash** | **String** | On-chain transaction hash |  [optional] |
|**vout** | **Integer** | Output index |  [optional] |



