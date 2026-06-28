

# Position2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Position UUID. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Lifecycle status of the position. |  |
|**inFlight** | **Boolean** | True while an action is in progress for this position. |  |
|**positionType** | [**PositionTypeEnum**](#PositionTypeEnum) | Whether the position is lend- or borrow-side. |  |
|**vaultAccountId** | **String** | Fireblocks vault account holding the position. |  |
|**opportunityId** | **String** | Opportunity / vault or market identifier. |  |
|**chainId** | **String** | Chain identifier as a string (e.g. \&quot;1\&quot;). |  |
|**providerId** | [**ProviderIdEnum**](#ProviderIdEnum) | Lending protocol. |  |
|**origin** | [**OriginEnum**](#OriginEnum) | Whether the position was opened natively in Fireblocks or imported externally. |  |
|**principalAssetId** | **String** | Fireblocks asset id for the principal (underlying) asset. |  |
|**positionAssetId** | **String** | Fireblocks asset id for the position / share token. |  |
|**principalBalance** | **String** | Human-readable principal balance. |  |
|**positionBalance** | **String** | Human-readable position token balance. |  |
|**createdAt** | **String** | Creation time (ISO-8601). |  |
|**updatedAt** | **String** | Last update time (ISO-8601). |  |
|**lastSyncedAt** | **String** | Last successful on-chain sync time (ISO-8601). |  [optional] |
|**availableActions** | [**List&lt;AvailableActionsEnum&gt;**](#List&lt;AvailableActionsEnum&gt;) | Actions the API allows next for this position. |  |
|**yield** | **String** | Accrued yield in principal token units (decimal string). Only present for Morpho positions. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: PositionTypeEnum

| Name | Value |
|---- | -----|
| LEND | &quot;LEND&quot; |
| BORROW | &quot;BORROW&quot; |



## Enum: ProviderIdEnum

| Name | Value |
|---- | -----|
| MORPHO | &quot;MORPHO&quot; |
| AAVE | &quot;AAVE&quot; |



## Enum: OriginEnum

| Name | Value |
|---- | -----|
| NATIVE | &quot;NATIVE&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |



## Enum: List&lt;AvailableActionsEnum&gt;

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;DEPOSIT&quot; |
| WITHDRAW | &quot;WITHDRAW&quot; |



