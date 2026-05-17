

# CreateOffersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseAssetId** | **String** | The source asset identifier. |  |
|**baseAssetRail** | **TransferRail** |  |  [optional] |
|**quoteAssetId** | **String** | The target asset identifier. |  |
|**quoteAssetRail** | **TransferRail** |  |  [optional] |
|**baseAmount** | **String** | The amount to get offers for |  |
|**slippageBps** | **Integer** | Slippage tolerance in basis points (bps) for defi quotes - 1 is 0.01% and 10000 is 100%. If not set, defaults to 50 bps (0.5%). |  [optional] |
|**settlement** | [**DVPSettlement**](DVPSettlement.md) |  |  [optional] |
|**side** | **Side** |  |  |



