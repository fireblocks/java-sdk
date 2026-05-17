

# UsdcGatewayWalletInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **String** | The USDC Gateway wallet identifier |  |
|**type** | **String** | The USDC Gateway provider identifier |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current activation status of the USDC Gateway wallet |  |
|**symbol** | **String** | The token symbol supported by this wallet (e.g. USDC) |  |
|**assetIds** | **List&lt;String&gt;** | Fireblocks asset IDs available for this wallet |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVATED | &quot;ACTIVATED&quot; |
| DEACTIVATED | &quot;DEACTIVATED&quot; |



