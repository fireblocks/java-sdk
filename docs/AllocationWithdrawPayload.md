

# AllocationWithdrawPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The vault account whose Canton wallet acts here. |  |
|**asset** | [**AssetEnum**](#AssetEnum) | Chain asset — &#x60;CANTON&#x60; or &#x60;CANTON_TEST&#x60;. |  |
|**allocationTransactionId** | **String** | The Fireblocks transaction id of the outgoing response that created the allocation. The allocation is resolved from it — Canton contract ids are never accepted here. |  |



## Enum: AssetEnum

| Name | Value |
|---- | -----|
| CANTON | &quot;CANTON&quot; |
| CANTON_TEST | &quot;CANTON_TEST&quot; |



