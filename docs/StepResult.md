

# StepResult

The result of one workflow step's execution during a screening.  Carries the step's outcome next to the two rule evaluations that produced it — which trigger rule decided the connector should run, and which outcome rule read the response — plus the provider's own verdict and risk level.  A step that did not screen carries a `bypassReason` instead of a risk level. Only `PASSED_BY_POLICY` means the policy deliberately let it through; every other reason means the check could not be performed, and the step is rejected rather than passed. A bypass is not an approval.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stepId** | **String** | Identifier of this step within the workflow. |  |
|**connectorId** | **String** | Identifier of the connector that executed this step. |  |
|**operation** | **ScreeningOperationEnum** |  |  |
|**triggerRuleOutcome** | **TriggerRuleOutcomeEnum** |  |  |
|**matchedTriggerRule** | [**Rule**](Rule.md) |  |  [optional] |
|**outcomeRuleOutcome** | **ScreeningOutcomeEnum** |  |  |
|**matchedOutcomeRule** | [**Rule**](Rule.md) |  |  [optional] |
|**outcome** | **ScreeningOutcomeEnum** |  |  |
|**metadata** | **Map&lt;String, Object&gt;** | Connector-specific data, keyed by the connector&#39;s configured outcomeMetaParameters for this operation. |  [optional] |
|**ticketId** | **String** | The connector-side screening ticket identifier. |  [optional] |
|**verdict** | **ConnectorVerdictEnum** |  |  [optional] |
|**connectorStatus** | **ConnectorStatusEnum** |  |  [optional] |
|**bypassReason** | **BypassReasonEnum** |  |  [optional] |
|**risk** | **RiskLevelEnum** |  |  [optional] |



