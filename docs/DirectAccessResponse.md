

# DirectAccessResponse

Response-only counterpart of DirectAccess. Adds the server-populated `subProviders` field. Never use this schema in a request body — requests must keep using DirectAccess (via AccessType).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Indicates this uses direct provider access |  |
|**providerId** | **String** | The ID of the provider |  |
|**subProviders** | **List&lt;String&gt;** | The underlying providers or tools that this direct-access route is composed of, in execution order. Response-only: this field is populated by the server and is never accepted from client requests. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROVIDER | &quot;PROVIDER&quot; |



