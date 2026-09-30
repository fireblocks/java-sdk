

# UtxoLabelFailure

A requested identifier that blocked the label request, with the reason it could not be labelled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | [**UtxoIdentifier**](UtxoIdentifier.md) | The identifier exactly as it was sent in the request. |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Why the identifier could not be labelled: - &#x60;NOT_FOUND&#x60; — no UTXO for it in this vault and asset. Retrying can work once it is indexed. - &#x60;NOT_LABELLABLE&#x60; — the UTXO exists but can no longer be labelled (spent, or removed; for a transaction ID, every output). Retrying will not help. |  |
|**utxoStatus** | [**UtxoStatusEnum**](#UtxoStatusEnum) | The UTXO status behind the reason, when one explains it. With &#x60;NOT_FOUND&#x60;, &#x60;REMOVED&#x60; means the UTXO was removed within the last hour and may still reappear; if it does not, the same request returns &#x60;NOT_LABELLABLE&#x60; after about an hour. |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| NOT_FOUND | &quot;NOT_FOUND&quot; |
| NOT_LABELLABLE | &quot;NOT_LABELLABLE&quot; |
| UNUSABLE_IDENTIFIER | &quot;UNUSABLE_IDENTIFIER&quot; |



## Enum: UtxoStatusEnum

| Name | Value |
|---- | -----|
| SPENT | &quot;SPENT&quot; |
| REMOVED | &quot;REMOVED&quot; |



