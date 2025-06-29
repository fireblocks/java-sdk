

# NonWalletQuoteResponse

Return a quote that cannot be used for a swap operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**protocol** | **SwapProviderProtocolsEnum** |  |  |
|**inputAmount** | **String** | The amount of tokens the swapper will provide |  |
|**inputAsset** | **String** | The id of the asset the swapper will provide |  |
|**slippageTolerance** | **BigDecimal** | The slippage tolerance is a percentage. The slippage tolerance is the maximum amount the price can change between the time the transaction is submitted and the time it is executed |  |
|**outputMinAmount** | **String** | The minimum amount of tokens the swapper will receive |  |
|**outputMaxAmount** | **String** | Maximum amount of tokens that the swapper will receive |  |
|**outputAsset** | **String** | The id of the asset the swapper will receive |  |
|**additionalData** | [**ProviderAdditionalData**](ProviderAdditionalData.md) |  |  |
|**estimatedFees** | [**NonWalletQuoteFee**](NonWalletQuoteFee.md) |  |  |



