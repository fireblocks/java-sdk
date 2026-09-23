

# Rule

A single rule within a rule set. The first rule whose conditions match wins, and its `ruleAction` is applied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleId** | **String** | UUID, unique within the rule set. |  [optional] |
|**conditions** | [**List&lt;RuleCondition&gt;**](RuleCondition.md) | Conditions AND-ed together within this rule. |  [optional] |
|**ruleAction** | **RuleActionEnum** |  |  [optional] |
|**order** | **Integer** | Zero-based evaluation order among the rule set&#39;s rules, lowest first. |  [optional] |
|**title** | **String** | User-facing label for the rule. Cosmetic only — not read by rule evaluation. |  [optional] |



