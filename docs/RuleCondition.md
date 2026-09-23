

# RuleCondition

A single condition within a rule. Conditions within a rule are AND-ed together.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** | The input context field this condition tests. Allowed values depend on the rule set type (trigger vs. outcome) and the step&#39;s connector/operation. |  |
|**operator** | **RuleConditionOperatorEnum** |  |  |
|**value** | **String** | The value &#x60;field&#x60; is compared against, using &#x60;operator&#x60;. |  |



