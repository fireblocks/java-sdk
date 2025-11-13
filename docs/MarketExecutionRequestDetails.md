

# MarketExecutionRequestDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Order type for market orders |  |
|**side** | [**SideEnum**](#SideEnum) | Side of the order |  |
|**baseAmount** | **String** | Amount to convert |  |
|**baseAssetId** | **String** | Source asset identifier |  |
|**baseAssetRail** | **TransferRail** |  |  [optional] |
|**quoteAssetId** | **String** | Target asset identifier |  |
|**quoteAssetRail** | **TransferRail** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MARKET | &quot;MARKET&quot; |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



