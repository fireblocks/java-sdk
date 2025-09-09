

# LimitExecutionRequestDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**side** | [**SideEnum**](#SideEnum) | Side of the order |  |
|**baseAmount** | **String** | Amount to convert |  |
|**baseAssetId** | **String** | Source asset identifier |  |
|**baseAssetRail** | **TransferRail** |  |  [optional] |
|**quoteAssetId** | **String** | Target asset identifier |  |
|**quoteAssetRail** | **TransferRail** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Order type for limit orders |  |
|**timeInForce** | **TimeInForce** |  |  |
|**limitPrice** | **String** | Price for limit orders |  |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIMIT | &quot;LIMIT&quot; |



