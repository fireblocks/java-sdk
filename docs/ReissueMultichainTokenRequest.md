

# ReissueMultichainTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The id of the vault account that initiated the request to issue the token |  |
|**chains** | **List&lt;String&gt;** | The base asset identifiers of the blockchains you want to deploy to |  |
|**useGasless** | **Boolean** | Whether to use gasless deployment or not |  [optional] |
|**fee** | **String** | Max fee amount for the deploy request. Interchangeable with the &#39;feeLevel&#39; field |  [optional] |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | Fee level for the deploy request. Interchangeable with the &#39;fee&#39; field |  [optional] |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



