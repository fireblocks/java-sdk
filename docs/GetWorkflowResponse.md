

# GetWorkflowResponse

A workflow's current definition, including its steps and each step's rule sets.  A workflow is the configuration a screening runs against: an ordered list of steps, each backed by one connector. It must be `ACTIVE` before a screening will accept it — `DRAFT` is the editing state, so a screening never runs against a half-finished configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workflowId** | **String** | Unique identifier of the workflow. |  |
|**templateId** | **String** | The template this workflow was provisioned from, if any. |  [optional] |
|**status** | **WorkflowStatusEnum** |  |  |
|**title** | **String** | User-facing display name for the workflow. |  |
|**description** | **String** | User-facing free-text description of the workflow&#39;s purpose. |  [optional] |
|**createdAt** | **String** | Unix timestamp in seconds when the workflow was provisioned, encoded as a string. |  |
|**steps** | [**List&lt;StepConfig&gt;**](StepConfig.md) | Flat list — one step per connector. |  |



