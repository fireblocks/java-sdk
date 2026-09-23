

# StepConfig

One step in a workflow, backed by a single connector.  A connector is the compliance provider integration that does the work — `kyt_trmlabs` is TRM Labs. The step declares which operations that connector handles; a screening naming an operation no step is configured for is refused, and the error reports the supported set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stepId** | **String** | Unique within the workflow. |  |
|**connectorId** | **String** | Identifies which connector this step invokes. |  |
|**operations** | [**List&lt;StepOperationConfig&gt;**](StepOperationConfig.md) | One entry per operation the step&#39;s connector handles. |  |
|**order** | **Integer** | Execution order among the workflow&#39;s steps, lowest first. |  |



