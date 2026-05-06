

# CircleGatewayWalletInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **String** | The Circle Gateway wallet identifier |  |
|**type** | **String** | The Circle Gateway provider identifier |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current activation status of the Circle Gateway wallet |  |
|**symbol** | **String** | The token symbol supported by this wallet (e.g. USDC) |  |
|**assetIds** | **List&lt;String&gt;** | Fireblocks asset IDs available for this wallet |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVATED | &quot;ACTIVATED&quot; |
| DEACTIVATED | &quot;DEACTIVATED&quot; |



