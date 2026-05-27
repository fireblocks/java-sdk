

# UsdcGatewayWalletInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **String** | The USDC Gateway wallet identifier |  |
|**type** | **String** | The USDC Gateway provider identifier |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current activation status of the USDC Gateway wallet |  |
|**symbol** | **String** | The token symbol supported by this wallet (e.g. USDC) |  |
|**totalBalance** | **String** | Aggregate USDC balance across all assets |  |
|**assets** | [**List&lt;UsdcGatewayWalletAsset&gt;**](UsdcGatewayWalletAsset.md) | Per-chain USDC asset balances |  |
|**virtualAssetId** | **String** | The id of the virtual asset |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVATED | &quot;ACTIVATED&quot; |
| DEACTIVATED | &quot;DEACTIVATED&quot; |



