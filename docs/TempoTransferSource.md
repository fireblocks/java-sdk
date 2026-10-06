

# TempoTransferSource

The transfer's source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The kind of source. |  |
|**id** | **String** | Required when type is VAULT_ACCOUNT — the vault account ID. |  [optional] |
|**walletId** | **String** | Required when type is EMBEDDED_WALLET. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VAULT_ACCOUNT | &quot;VAULT_ACCOUNT&quot; |
| EMBEDDED_WALLET | &quot;EMBEDDED_WALLET&quot; |



