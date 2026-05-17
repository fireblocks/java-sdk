

# AddressReverseLookupResponse

Reverse-lookup result mapping a blockchain address to its owning vault account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The queried blockchain address. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Source type of the resolved address. |  |
|**vaultAccountId** | **String** | Vault account ID that owns the address. |  |
|**blockchains** | **List&lt;String&gt;** | Blockchain assets associated with this address in the vault account. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VAULT_ACCOUNT | &quot;VAULT_ACCOUNT&quot; |



