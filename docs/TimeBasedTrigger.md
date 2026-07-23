

# TimeBasedTrigger

The schedule for this deposit automation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intervalValue** | **Integer** | How often the deposit runs, in units of intervalUnit. |  |
|**intervalUnit** | [**IntervalUnitEnum**](#IntervalUnitEnum) | The unit for intervalValue. |  |
|**balanceThreshold** | **String** | Minimum USDC balance required before a deposit runs. Set to \&quot;0\&quot; to sweep the full available balance every time, with no minimum. |  |



## Enum: IntervalUnitEnum

| Name | Value |
|---- | -----|
| MINUTES | &quot;MINUTES&quot; |
| HOURS | &quot;HOURS&quot; |
| DAYS | &quot;DAYS&quot; |



