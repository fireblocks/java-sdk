

# CreateTokenRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockchainId** | **String** | The id of the blockchain the request was initiated on |  [optional] |
|**assetId** | **String** | The base asset identifier of the blockchain you want to deploy to |  [optional] |
|**vaultAccountId** | **String** | The id of the vault account that initiated the request to issue the token |  |
|**createParams** | [**CreateTokenRequestDtoCreateParams**](CreateTokenRequestDtoCreateParams.md) |  |  |
|**displayName** | **String** |  |  [optional] |
|**useGasless** | **Boolean** | Indicates whether the token should be created in a gasless manner, utilizing the ERC-2771 standard. When set to true, the transaction will be relayed by a designated relayer. The workspace must be configured to use Fireblocks gasless relay. |  [optional] |
|**fee** | **String** | Max fee amount for the write function transaction. interchangeable with the &#39;feeLevel&#39; field |  [optional] |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | Fee level for the write function transaction. interchangeable with the &#39;fee&#39; field |  [optional] |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



