

# OrderSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**via** | [**AccessType**](AccessType.md) |  |  |
|**side** | [**SideEnum**](#SideEnum) | Side of the order |  |
|**baseAmount** | **String** |  |  |
|**quoteAmount** | **String** |  |  [optional] |
|**baseAssetId** | **String** |  |  |
|**quoteAssetId** | **String** |  |  |
|**status** | **OrderStatus** |  |  |
|**destination** | [**AccountReference**](AccountReference.md) |  |  |
|**source** | [**SettlementSourceAccount**](SettlementSourceAccount.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



