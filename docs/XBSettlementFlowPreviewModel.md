

# XBSettlementFlowPreviewModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**flowId** | **String** | The unique id for the cross-border flow. |  |
|**configId** | **UUID** | Cross Bodrder configuraion unique id |  |
|**conversionRate** | **String** | The conversion rate received from the on-ramp or off-ramp. |  |
|**inputAmount** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  |
|**estimatedOutputAmount** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  |
|**totalEstimatedFee** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  |
|**totalEstimatedTime** | **BigDecimal** | The total *estimated* time for executing the cross-border flow. |  |
|**steps** | **XBSettlementFlowStepsRecord** |  |  |



