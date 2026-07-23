

# AutomationSettingsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**automationId** | **UUID** | The ID of this deposit automation. |  |
|**vaultAccountId** | **String** | The vault account this deposit automation applies to. |  |
|**assetId** | **String** | The Fireblocks asset ID this automation applies to, if scoped to one. |  [optional] |
|**automationType** | [**AutomationTypeEnum**](#AutomationTypeEnum) | The type of this automation. |  |
|**timeBased** | [**TimeBasedTrigger**](TimeBasedTrigger.md) |  |  |



## Enum: AutomationTypeEnum

| Name | Value |
|---- | -----|
| USDC_GATEWAY_DEPOSIT | &quot;USDC_GATEWAY_DEPOSIT&quot; |



