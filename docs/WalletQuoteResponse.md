

# WalletQuoteResponse

Return a quote with id that can be used for swap operation.

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
|**providerQuoteId** | **UUID** | An identifier that uniquely identifies the received quote |  |
|**expiredAt** | **OffsetDateTime** | When was the received &#x60;providerQuoteId&#x60; is expired (ISO Date time). |  |
|**requiredActions** | **List&lt;SwapRequiredActionsEnum&gt;** | The required actions for completing a swap operation |  |
|**estimatedFees** | [**QuoteFee**](QuoteFee.md) |  |  |



