

# TempoTransferDestination

The transfer's destination. Mutually exclusive with `destinations`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The kind of destination. |  |
|**id** | **String** | Required when type is VAULT_ACCOUNT or UNMANAGED_WALLET. |  [optional] |
|**oneTimeAddress** | [**OneTimeAddress**](OneTimeAddress.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VAULT_ACCOUNT | &quot;VAULT_ACCOUNT&quot; |
| ONE_TIME_ADDRESS | &quot;ONE_TIME_ADDRESS&quot; |
| UNMANAGED_WALLET | &quot;UNMANAGED_WALLET&quot; |



