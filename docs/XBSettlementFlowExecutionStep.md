

# XBSettlementFlowExecutionStep


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique id for the step execution |  |
|**accountId** | **String** |  |  |
|**status** | **XBSettlementFlowExecutionStepStatus** |  |  |
|**inputAmount** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  |
|**outputAmount** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  [optional] |
|**fee** | [**XBSettlementAsset**](XBSettlementAsset.md) |  |  [optional] |
|**startedAt** | **BigDecimal** | The step execution start time in epoch format. |  [optional] |
|**completedAt** | **BigDecimal** | The step execution end time in epoch format. |  [optional] |
|**isSignRequired** | **Boolean** | Whether or not signing is required for executing the step. |  |



