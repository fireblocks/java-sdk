

# CreateQuote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**List&lt;CreateQuoteScopeInner&gt;**](CreateQuoteScopeInner.md) |  |  |
|**baseAssetId** | **String** |  |  |
|**baseAssetRail** | **TransferRail** |  |  [optional] |
|**quoteAssetId** | **String** |  |  |
|**quoteAssetRail** | **TransferRail** |  |  [optional] |
|**baseAmount** | **String** | The amount to convert from |  |
|**slippageBps** | **BigDecimal** | Slippage tolerance in basis points (bps) for defi quotes - 1 is 0.01% and 10000 is 100% |  [optional] |
|**settlement** | [**DVPSettlement**](DVPSettlement.md) |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) | Side of the order |  |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



