

# Fee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | The type of fee, such as ORDER, NETWORK, or SPREAD. ORDER - Fee for executing the order. NETWORK - Fee for network transactions. SPREAD - Fee for the difference between buy and sell prices.  |  |
|**assetId** | **String** | The asset identifier for the fee. |  |
|**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) |  |  |
|**amount** | **BigDecimal** | Fee in basis points (1 &#x3D; 0.01%, 10000 &#x3D; 100%) |  |



## Enum: FeeTypeEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;ORDER&quot; |
| NETWORK | &quot;NETWORK&quot; |
| SPREAD | &quot;SPREAD&quot; |



## Enum: AmountTypeEnum

| Name | Value |
|---- | -----|
| BPS | &quot;BPS&quot; |



