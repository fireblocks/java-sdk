

# Quote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**via** | [**AccessType**](AccessType.md) |  |  |
|**id** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates this is an indicative quote |  |
|**quoteAssetId** | **String** |  |  |
|**baseAssetId** | **String** |  |  |
|**baseAmount** | **String** |  |  |
|**quoteAmount** | **String** |  |  |
|**priceImpact** | **BigDecimal** |  |  [optional] |
|**quoteMinAmount** | **String** |  |  [optional] |
|**executionSteps** | [**List&lt;ExecutionStepDetails&gt;**](ExecutionStepDetails.md) |  |  [optional] |
|**generalFees** | [**List&lt;Fee&gt;**](Fee.md) |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) | Side of the order |  |
|**expiresAt** | **OffsetDateTime** | ISO 8601 timestamp of the expiration time of the quote. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDICATIVE | &quot;INDICATIVE&quot; |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



