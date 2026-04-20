

# Opportunity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique opportunity identifier. |  [optional] |
|**providerId** | [**ProviderIdEnum**](#ProviderIdEnum) | Lending protocol (&#x60;MORPHO&#x60; or &#x60;AAVE&#x60;). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Opportunity kind — vault or market. |  [optional] |
|**chainId** | **String** | Chain identifier as a string (e.g. \&quot;1\&quot; for Ethereum mainnet). |  [optional] |
|**address** | **String** | Primary contract address for the vault or market. |  [optional] |
|**name** | **String** | Display name of the opportunity. |  [optional] |
|**symbol** | **String** | Symbol or share token ticker for the position asset. |  [optional] |
|**principalAsset** | [**EarnAsset**](EarnAsset.md) | Underlying token the user deposits (principal). |  [optional] |
|**positionAsset** | [**EarnAsset**](EarnAsset.md) | Token representing the user’s position in the protocol (e.g. vault share). |  [optional] |
|**totalAssets** | **String** | Human-readable total value locked / assets in the opportunity. |  [optional] |
|**liquidity** | **String** | Human-readable available liquidity. |  [optional] |
|**apy** | [**Apy**](Apy.md) | APY breakdown; values are percentages (e.g. 4.25 means 4.25%). |  [optional] |
|**performanceFee** | **String** | Performance fee as a human-readable decimal string. |  [optional] |
|**managementFee** | **String** | Management fee as a human-readable decimal string. |  [optional] |
|**exposure** | [**List&lt;Exposure&gt;**](Exposure.md) | Optional per-asset exposure breakdown. |  [optional] |



## Enum: ProviderIdEnum

| Name | Value |
|---- | -----|
| MORPHO | &quot;MORPHO&quot; |
| AAVE | &quot;AAVE&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VAULT | &quot;VAULT&quot; |
| MARKET | &quot;MARKET&quot; |



