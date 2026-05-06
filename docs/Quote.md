

# Quote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**via** | [**AccessType**](AccessType.md) |  |  |
|**id** | **String** |  |  |
|**quoteAssetId** | **String** |  |  |
|**baseAssetId** | **String** |  |  |
|**baseAmount** | **String** |  |  |
|**quoteAmount** | **String** |  |  |
|**priceImpact** | **BigDecimal** |  |  [optional] |
|**quoteMinAmount** | **String** |  |  [optional] |
|**executionSteps** | [**List&lt;QuoteExecutionStep&gt;**](QuoteExecutionStep.md) |  |  [optional] |
|**generalFees** | [**List&lt;Fee&gt;**](Fee.md) |  |  [optional] |
|**side** | **Side** |  |  |
|**expiresAt** | **String** | The expiration time of the quote in ISO format. |  |
|**orderCreationRequirements** | **String** | A JSON Schema Draft-7 document in string format describing the fields required when creating an order for this quote. The schema mirrors the structure of CreateOrderRequest.participantsIdentification json schema, so clients can validate their order payload before sending.  |  [optional] |
|**type** | **IndicativeQuoteEnum** |  |  |



