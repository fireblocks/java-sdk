

# CreateQuote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**List&lt;CreateQuoteScopeInner&gt;**](CreateQuoteScopeInner.md) |  |  |
|**baseAssetId** | **String** | The asset you receive on BUY / give on SELL. |  |
|**quoteAssetId** | **String** | The counter asset used to pay/receive. |  |
|**baseAmount** | **String** | The amount to convert from |  |
|**slippageBps** | **BigDecimal** | Slippage tolerance in basis points (bps) for defi quotes - 1 is 0.01% and 10000 is 100% |  [optional] |
|**settlement** | [**DVPSettlement**](DVPSettlement.md) |  |  [optional] |
|**side** | **Side** |  |  |



