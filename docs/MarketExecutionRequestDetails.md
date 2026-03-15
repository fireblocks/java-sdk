

# MarketExecutionRequestDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **MarketTypeEnum** |  |  |
|**side** | **Side** |  |  |
|**baseAmount** | **String** | Amount in baseAssetId. BUY &#x3D; base amount to receive; SELL &#x3D; base amount to sell. |  |
|**baseAssetId** | **String** | The asset you receive on BUY / give on SELL. |  |
|**baseAssetRail** | **TransferRail** |  |  [optional] |
|**quoteAssetId** | **String** | Counter asset used to pay/receive |  |
|**quoteAssetRail** | **TransferRail** |  |  [optional] |



