

# SwapOperation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the swap operation |  |
|**accountId** | **String** | The id of the vault account or account id |  |
|**providerId** | **UUID** | The uuid that identifies the provider |  |
|**category** | **ProviderCategoryEnum** |  |  |
|**protocol** | **SwapProviderProtocolsEnum** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | **CREATED** – The swap request has been created but not yet started. **PENDING_USER_ACTION** – Awaiting a user action (e.g. signature or approval). **PENDING_PROVIDER_ACTION** – Awaiting the provider to process the request. **PROCESSING** – The swap is actively being executed on‐chain. **COMPLETED** – The swap has finished successfully. **CANCELED** – The swap was cancelled by user or provider before completion. **FAILED** – The swap attempted but encountered an error. |  |
|**inputAmount** | **String** | The amount of tokens the swapper will provide |  |
|**inputAsset** | **String** | The id of the asset the swapper will provide |  |
|**slippageTolerance** | **BigDecimal** | The slippage tolerance is a percentage. The slippage tolerance is the maximum amount the price can change between the time the transaction is submitted and the time it is executed |  |
|**outputMinAmount** | **String** | The minimum amount of tokens the swapper will receive |  |
|**outputMaxAmount** | **String** | Maximum amount of tokens that the swapper will receive |  |
|**outputAsset** | **String** | The id of the asset the swapper will receive |  |
|**outputFinalAmount** | **String** | Final amount of tokens that the swapper will receive |  [optional] |
|**requiredActions** | [**List&lt;SwapRequiredAction&gt;**](SwapRequiredAction.md) | The required actions for the swap, including the type of action, the status of the action, and the transaction id |  |
|**error** | [**SwapFlowError**](SwapFlowError.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation time of the swap operation (ISO Date time). |  |
|**updatedAt** | **OffsetDateTime** | The last update time of the swap operation (ISO Date time). |  |
|**createdBy** | **UUID** | Fireblocks user id that issued the swap |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| TRANSACTION_IN_PROGRESS | &quot;TRANSACTION_IN_PROGRESS&quot; |
| PENDING_PROVIDER_ACTION | &quot;PENDING_PROVIDER_ACTION&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FAILED | &quot;FAILED&quot; |



