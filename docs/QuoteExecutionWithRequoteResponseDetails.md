

# QuoteExecutionWithRequoteResponseDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Order type for quote orders |  |
|**quoteId** | **String** | Quote ID for quote orders |  |
|**quoteAmount** | **String** | Quote amount for quote orders |  |
|**side** | [**SideEnum**](#SideEnum) | Side of the order |  |
|**baseAmount** | **String** | Amount to convert |  |
|**baseAssetId** | **String** | Source asset identifier |  |
|**baseAssetRail** | **TransferRail** |  |  [optional] |
|**quoteAssetId** | **String** | Target asset identifier |  |
|**quoteAssetRail** | **TransferRail** |  |  [optional] |
|**reQuote** | [**QuoteExecutionWithRequoteResponseDetailsAllOfReQuote**](QuoteExecutionWithRequoteResponseDetailsAllOfReQuote.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| QUOTE | &quot;QUOTE&quot; |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



