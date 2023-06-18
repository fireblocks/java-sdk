

# SourceTransferPeerPathResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**id** | **String** |  |  [optional] |
|**walletId** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**subType** | **String** | The specific exchange, fiat account or unmanaged wallet (either INTERNAL / EXTERNAL) |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VAULT_ACCOUNT | &quot;VAULT_ACCOUNT&quot; |
| EXCHANGE_ACCOUNT | &quot;EXCHANGE_ACCOUNT&quot; |
| INTERNAL_WALLET | &quot;INTERNAL_WALLET&quot; |
| EXTERNAL_WALLET | &quot;EXTERNAL_WALLET&quot; |
| NETWORK_CONNECTION | &quot;NETWORK_CONNECTION&quot; |
| FIAT_ACCOUNT | &quot;FIAT_ACCOUNT&quot; |
| COMPOUND | &quot;COMPOUND&quot; |
| GAS_STATION | &quot;GAS_STATION&quot; |
| ONE_TIME_ADDRESS | &quot;ONE_TIME_ADDRESS&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| END_USER_WALLET | &quot;END_USER_WALLET&quot; |



