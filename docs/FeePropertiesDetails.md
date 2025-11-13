

# FeePropertiesDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | The type of fee, such as ORDER, NETWORK, or SPREAD. ORDER - Fee for executing the order. NETWORK - Fee for network transactions. SPREAD - Fee for the difference between buy and sell prices.  |  |
|**assetId** | **String** | The asset identifier for the fee. |  |
|**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) | The type of amount for the fee, either FIXED or BPS (basis points). |  |



## Enum: FeeTypeEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;ORDER&quot; |
| NETWORK | &quot;NETWORK&quot; |
| SPREAD | &quot;SPREAD&quot; |



## Enum: AmountTypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| BPS | &quot;BPS&quot; |



