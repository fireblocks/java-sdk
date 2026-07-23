

# AutomationSettingsRequest

Request body for setting up a USDC Gateway deposit automation for a vault account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**automationType** | [**AutomationTypeEnum**](#AutomationTypeEnum) | The type of automation to configure. |  |
|**assetId** | **String** | The Fireblocks asset ID this automation applies to. Omit to cover all supported USDC Gateway assets. |  [optional] |
|**timeBased** | [**TimeBasedTrigger**](TimeBasedTrigger.md) |  |  |



## Enum: AutomationTypeEnum

| Name | Value |
|---- | -----|
| USDC_GATEWAY_DEPOSIT | &quot;USDC_GATEWAY_DEPOSIT&quot; |



