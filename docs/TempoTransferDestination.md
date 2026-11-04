

# TempoTransferDestination

The transfer's destination. Mutually exclusive with `destinations`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The kind of destination. |  |
|**id** | **String** | Required when type is VAULT_ACCOUNT or UNMANAGED_WALLET. |  [optional] |
|**oneTimeAddress** | [**OneTimeAddress**](OneTimeAddress.md) |  |  [optional] |
|**memo** | **String** | Tempo TIP-20 memo, sent on-chain with the transfer to this destination. Exactly 32 bytes once UTF-8 encoded.  NOTES:     - The memo is public and permanent on-chain, so do not put sensitive data in it.     - A memo is currently supported only for a transfer with a single destination |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VAULT_ACCOUNT | &quot;VAULT_ACCOUNT&quot; |
| ONE_TIME_ADDRESS | &quot;ONE_TIME_ADDRESS&quot; |
| UNMANAGED_WALLET | &quot;UNMANAGED_WALLET&quot; |



