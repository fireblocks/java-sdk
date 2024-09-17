

# TokenLinkRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of token being linked |  |
|**refId** | **String** | The Fireblocks&#39; token link reference id. For example, &#39;BQ5R_BDESC_ABC&#39; if it&#39;s a fungible       asset |  [optional] |
|**displayName** | **String** | The token display name |  [optional] |
|**baseAssetId** | **String** | The blockchain base assetId |  [optional] |
|**contractAddress** | **String** | The contract&#39;s onchain address |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNGIBLE_TOKEN | &quot;FUNGIBLE_TOKEN&quot; |
| NON_FUNGIBLE_TOKEN | &quot;NON_FUNGIBLE_TOKEN&quot; |
| TOKEN_UTILITY | &quot;TOKEN_UTILITY&quot; |
| TOKEN_EXTENSION | &quot;TOKEN_EXTENSION&quot; |



