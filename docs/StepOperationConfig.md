

# StepOperationConfig

Configuration for one operation the step's connector handles. The operation arrives on the screening request; the connector decides how to handle it.  Two rule sets govern the step, and both are configured here rather than sent per request, so the same call behaves differently across workflows. Trigger rules decide whether the connector runs at all; outcome rules turn the provider's response into the step's verdict. With neither configured the step runs under the connector's own defaults, which for `kyt_trmlabs` are permissive: the screening completes without consulting the provider.  The four parameter lists are the contract for writing those rules: a rule naming a field outside `triggerRuleParameters` or `outcomeEvaluationParameters` is rejected. They are derived from the connector registry rather than stored, so a connector gaining a field is reflected here without a migration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | **ScreeningOperationEnum** |  |  [optional] |
|**requiredParameters** | **List&lt;String&gt;** | Resolved server-side on every &#x60;GetWorkflow&#x60; call from the step&#39;s connector definition for this operation. Read-only: ignored on write. |  [optional] |
|**optionalParameters** | **List&lt;String&gt;** | Like &#x60;requiredParameters&#x60;, but optional inputs to the operation. |  [optional] |
|**triggerRuleParameters** | **List&lt;String&gt;** | Fields a condition in &#x60;triggerRuleSetStruct&#x60; may reference. |  [optional] |
|**outcomeEvaluationParameters** | **List&lt;String&gt;** | Provider response fields a condition in &#x60;outcomeRuleSetStruct&#x60; may reference. |  [optional] |
|**outcomeMetaParameters** | **List&lt;String&gt;** | Additional provider response fields returned with the result; not usable in &#x60;outcomeRuleSetStruct&#x60; conditions. |  [optional] |
|**triggerRuleSetStruct** | [**RuleSet**](RuleSet.md) |  |  [optional] |
|**triggerRuleSetJson** | **String** | The tenant&#39;s trigger rules, as a JSON-encoded string. Set for steps whose rules are still defined as a legacy screening policy rather than natively in Compliance Orchestrator, and refreshed on every read. Mutually exclusive with &#x60;triggerRuleSetStruct&#x60;. |  [optional] |
|**outcomeRuleSetStruct** | [**RuleSet**](RuleSet.md) |  |  [optional] |
|**outcomeRuleSetJson** | **String** | The tenant&#39;s outcome rules, as a JSON-encoded string. Set for steps whose rules are still defined as a legacy screening policy rather than natively in Compliance Orchestrator, and refreshed on every read. Mutually exclusive with &#x60;outcomeRuleSetStruct&#x60;. |  [optional] |



