

# QuoteOffer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**via** | [**AccessType**](AccessType.md) |  |  |
|**id** | **String** | The unique identifier of the quote. |  |
|**quoteAssetId** | **String** | The target asset identifier. |  |
|**quoteAssetRail** | **TransferRail** |  |  [optional] |
|**baseAssetId** | **String** | The source asset identifier. |  |
|**baseAssetRail** | **TransferRail** |  |  [optional] |
|**baseAmount** | **String** | The amount of the base asset. |  |
|**quoteAmount** | **String** | The amount of the quote asset. |  |
|**priceImpact** | **BigDecimal** | The estimated price impact as a decimal fraction. |  [optional] |
|**quoteMinAmount** | **String** | The minimum guaranteed amount of the quote asset. |  [optional] |
|**isSlippageApplied** | **Boolean** | Indicates if slippage was applied to the quote. |  [optional] |
|**executionSteps** | [**List&lt;QuoteExecutionStep&gt;**](QuoteExecutionStep.md) | Ordered list of execution steps for the quote. |  [optional] |
|**generalFees** | [**List&lt;Fee&gt;**](Fee.md) | General fees associated with the quote. |  [optional] |
|**side** | **Side** |  |  |
|**expiresAt** | **String** | The expiration time of the quote in ISO 8601 format. |  |
|**orderCreationRequirements** | **String** | A JSON Schema Draft-7 document in string format describing the fields required when creating an order so clients can validate their order payload before sending.  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the quote. |  |
|**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) | The type of offer — QUOTE for executable committed quotes. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMITTED | &quot;COMMITTED&quot; |
| INDICATIVE | &quot;INDICATIVE&quot; |



## Enum: OfferTypeEnum

| Name | Value |
|---- | -----|
| QUOTE | &quot;QUOTE&quot; |



