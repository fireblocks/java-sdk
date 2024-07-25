

# AssetPriceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**legacyId** | **String** | The ID of the asset |  |
|**lastUpdateAt** | **BigDecimal** | Time of last price update |  |
|**currency** | **String** | Currency (according to ISO 4217 currency codes) |  |
|**price** | **BigDecimal** | Price in currency |  |
|**source** | [**SourceEnum**](#SourceEnum) | Source of the price data |  |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| PRIVATE | &quot;PRIVATE&quot; |



