

# BlockchainRpcAuth

Discriminated RPC auth payload. Sent on create/update so backend can distinguish \"no auth\" from \"field unchanged\" on PUT updates. Credential values are stored inside declaredProperties and fetched at activation time; they are deliberately not carried through workflow context.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Authentication scheme used when calling the RPC endpoint. |  |
|**username** | **String** | Username for RPC_AUTH_BASIC authentication. |  [optional] |
|**password** | **String** | Password for RPC_AUTH_BASIC authentication. |  [optional] |
|**token** | **String** | Bearer token for RPC_AUTH_BEARER authentication. |  [optional] |
|**headerName** | **String** | Header name for RPC_AUTH_CUSTOM_HEADER authentication. |  [optional] |
|**headerValue** | **String** | Header value for RPC_AUTH_CUSTOM_HEADER authentication. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RPC_AUTH_BASIC | &quot;RPC_AUTH_BASIC&quot; |
| RPC_AUTH_BEARER | &quot;RPC_AUTH_BEARER&quot; |
| RPC_AUTH_CUSTOM_HEADER | &quot;RPC_AUTH_CUSTOM_HEADER&quot; |



