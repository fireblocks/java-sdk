

# UtxoOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**input** | [**UtxoInput2**](UtxoInput2.md) |  |  |
|**utxoId** | **String** | The unique UTXO identifier |  |
|**address** | **String** | The address holding this UTXO |  |
|**amount** | **String** | The UTXO amount in the asset&#39;s native unit |  |
|**confirmations** | **Integer** | Number of confirmations |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The UTXO status |  |
|**isChange** | **Boolean** | Whether this is a change output |  [optional] |
|**isCoinbase** | **Boolean** | Whether this is a coinbase output |  [optional] |
|**fbTxId** | **String** | The Fireblocks transaction ID that created this UTXO |  [optional] |
|**createdByHash** | **String** | The on-chain block hash where this UTXO was created |  [optional] |
|**spentByFbTxId** | **List&lt;String&gt;** | Fireblocks transaction IDs that selected/spent this UTXO |  [optional] |
|**createdByHeight** | **Integer** | The block height at which this UTXO was created |  [optional] |
|**createdAt** | **OffsetDateTime** | The timestamp when this UTXO was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | The timestamp when this UTXO was last updated |  [optional] |
|**labels** | **List&lt;String&gt;** | Labels attached to this UTXO |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |
| FROZEN | &quot;FROZEN&quot; |
| SELECTED | &quot;SELECTED&quot; |



