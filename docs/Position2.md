

# Position2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Position UUID. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Lifecycle status of the position. |  [optional] |
|**inFlight** | **Boolean** | True while an action is in progress for this position. |  [optional] |
|**positionType** | [**PositionTypeEnum**](#PositionTypeEnum) | Whether the position is lend- or borrow-side. |  [optional] |
|**vaultAccountId** | **String** | Fireblocks vault account holding the position. |  [optional] |
|**opportunityId** | **String** | Opportunity / vault or market identifier. |  [optional] |
|**chainId** | **String** | Chain identifier as a string (e.g. \&quot;1\&quot;). |  [optional] |
|**providerId** | [**ProviderIdEnum**](#ProviderIdEnum) | Lending protocol. |  [optional] |
|**origin** | [**OriginEnum**](#OriginEnum) | Whether the position was opened natively in Fireblocks or imported externally. |  [optional] |
|**principalAssetId** | **String** | Fireblocks asset id for the principal (underlying) asset. |  [optional] |
|**positionAssetId** | **String** | Fireblocks asset id for the position / share token. |  [optional] |
|**principalBalance** | **String** | Human-readable principal balance. |  [optional] |
|**positionBalance** | **String** | Human-readable position token balance. |  [optional] |
|**createdAt** | **String** | Creation time (ISO-8601). |  [optional] |
|**updatedAt** | **String** | Last update time (ISO-8601). |  [optional] |
|**lastSyncedAt** | **String** | Last successful on-chain sync time (ISO-8601). |  [optional] |
|**availableActions** | [**List&lt;AvailableActionsEnum&gt;**](#List&lt;AvailableActionsEnum&gt;) | Actions the API allows next for this position. |  [optional] |



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



