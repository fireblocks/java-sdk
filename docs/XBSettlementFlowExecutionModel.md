

# XBSettlementFlowExecutionModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**flowId** | **String** | The unique id for the cross-border flow. |  |
|**configId** | **UUID** | Cross Bodrder configuraion unique id |  |
|**inputAmount** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  |
|**outputAmount** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  |
|**totalFee** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  |
|**initiatedAt** | **BigDecimal** | The time the cross-border flow executed in epoch format. |  |
|**initiatedBy** | **String** | The id of the user which launched the flow |  |
|**state** | **XBSettlementFlowExecutionStatus** |  |  |
|**steps** | **XBSettlementFlowStepsExecutionRecord** |  |  |
|**selectedConversionSlippage** | [**XBSettlementFlowExecutionModelSelectedConversionSlippage**](XBSettlementFlowExecutionModelSelectedConversionSlippage.md) |  |  |



