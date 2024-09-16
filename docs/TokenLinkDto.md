

# TokenLinkDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The token link id |  |
|**status** | [**StatusEnum**](#StatusEnum) | The token status |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of token |  [optional] |
|**refId** | **String** | The Fireblocks&#39; reference id |  [optional] |
|**displayName** | **String** | The token display name. If was not provided, would be taken from the contract template |  [optional] |
|**tokenMetadata** | [**TokenLinkDtoTokenMetadata**](TokenLinkDtoTokenMetadata.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNGIBLE_TOKEN | &quot;FUNGIBLE_TOKEN&quot; |
| NON_FUNGIBLE_TOKEN | &quot;NON_FUNGIBLE_TOKEN&quot; |
| TOKEN_UTILITY | &quot;TOKEN_UTILITY&quot; |
| TOKEN_EXTENSION | &quot;TOKEN_EXTENSION&quot; |



