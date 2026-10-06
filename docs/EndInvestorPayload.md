

# EndInvestorPayload

Shared by invite / invite-cancel / offboard — identical wire shape, different verb.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The vault account whose Canton wallet acts here. |  |
|**blockchainId** | [**BlockchainIdEnum**](#BlockchainIdEnum) | The blockchain this party is connected to — &#x60;CANTON&#x60; or &#x60;CANTON_TEST&#x60;. |  |
|**endInvestor** | **String** | The end investor&#39;s Canton party id. |  |



## Enum: BlockchainIdEnum

| Name | Value |
|---- | -----|
| CANTON | &quot;CANTON&quot; |
| CANTON_TEST | &quot;CANTON_TEST&quot; |



