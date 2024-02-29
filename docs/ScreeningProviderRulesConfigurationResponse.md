

# ScreeningProviderRulesConfigurationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**amountUSD** | **BigDecimal** |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**asset** | **String** |  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) |  |  |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| PENDING | &quot;PENDING&quot; |
| REJECTED | &quot;REJECTED&quot; |
| FAILED | &quot;FAILED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| BLOCKING_TIME_EXPIRED | &quot;BLOCKING_TIME_EXPIRED&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ACCEPT | &quot;ACCEPT&quot; |
| REJECT | &quot;REJECT&quot; |
| ALERT | &quot;ALERT&quot; |
| WAIT | &quot;WAIT&quot; |
| FREEZE | &quot;FREEZE&quot; |
| CANCEL | &quot;CANCEL&quot; |



