

# QuotePropertiesDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**via** | [**AccessType**](AccessType.md) |  |  |
|**id** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**quoteAssetId** | **String** |  |  |
|**baseAssetId** | **String** |  |  |
|**baseAmount** | **String** |  |  |
|**quoteAmount** | **String** |  |  |
|**priceImpact** | **BigDecimal** |  |  [optional] |
|**quoteMinAmount** | **String** |  |  [optional] |
|**executionSteps** | [**List&lt;ExecutionStepDetails&gt;**](ExecutionStepDetails.md) |  |  [optional] |
|**generalFees** | [**List&lt;Fee&gt;**](Fee.md) |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) | Side of the order |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMITTED | &quot;COMMITTED&quot; |
| INDICATIVE | &quot;INDICATIVE&quot; |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



