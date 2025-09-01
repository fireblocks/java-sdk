

# LegacyPolicyRuleCheckResult

The rule validation result

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **BigDecimal** | Rule index number in the policy |  |
|**status** | [**StatusEnum**](#StatusEnum) | Validation status |  |
|**errors** | [**List&lt;LegacyPolicyRuleError&gt;**](LegacyPolicyRuleError.md) | A set of rule validation error objects |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;ok&quot; |
| FAILURE | &quot;failure&quot; |



