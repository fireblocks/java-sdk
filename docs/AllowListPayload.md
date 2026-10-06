

# AllowListPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The vault account whose Canton wallet acts here. |  |
|**blockchainId** | [**BlockchainIdEnum**](#BlockchainIdEnum) | The blockchain this party is connected to — &#x60;CANTON&#x60; or &#x60;CANTON_TEST&#x60;. |  |
|**wallets** | **List&lt;String&gt;** | Canton party ids to add or remove. |  |



## Enum: BlockchainIdEnum

| Name | Value |
|---- | -----|
| CANTON | &quot;CANTON&quot; |
| CANTON_TEST | &quot;CANTON_TEST&quot; |



