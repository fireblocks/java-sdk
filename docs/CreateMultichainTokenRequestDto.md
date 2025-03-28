

# CreateMultichainTokenRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The id of the vault account that initiated the request to issue the token |  |
|**createParams** | [**CreateMultichainTokenRequestDtoCreateParams**](CreateMultichainTokenRequestDtoCreateParams.md) |  |  |
|**salt** | **String** | The salt to calculate the deterministic address. Must be a number between 0 and 2^256 -1, for it to fit in the bytes32 parameter. |  [optional] |
|**chains** | **List&lt;String&gt;** | The base asset identifiers of the blockchains (legacyId) to calculate deterministic addresses |  |
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



