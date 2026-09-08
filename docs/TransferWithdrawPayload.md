

# TransferWithdrawPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The vault account whose Canton wallet acts here. |  |
|**asset** | [**AssetEnum**](#AssetEnum) | Chain asset — &#x60;CANTON&#x60; or &#x60;CANTON_TEST&#x60;. |  |
|**offerTransactionId** | **String** | The Fireblocks transaction id of the OUTGOING transfer offer being withdrawn. |  |



## Enum: AssetEnum

| Name | Value |
|---- | -----|
| CANTON | &quot;CANTON&quot; |
| CANTON_TEST | &quot;CANTON_TEST&quot; |



