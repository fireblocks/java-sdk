

# PolicyRuleCheckResult

The rule validation result

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **BigDecimal** | Rule index number in the policy |  |
|**status** | [**StatusEnum**](#StatusEnum) | Validation status |  |
|**errors** | [**List&lt;PolicyRuleError&gt;**](PolicyRuleError.md) | A set of rule validation error objects |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;ok&quot; |
| FAILURE | &quot;failure&quot; |



