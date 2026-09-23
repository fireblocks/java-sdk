

# GetScreeningResultResponse

The current status, outcome, per-step results, and audit log for a screening.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**screeningId** | **String** | Identifier of the screening being queried. |  |
|**workflowId** | **String** | Identifier of the workflow that produced this screening. |  |
|**screeningStatus** | **ComplianceScreeningStatusEnum** |  |  |
|**outcome** | **ScreeningOutcomeEnum** |  |  [optional] |
|**steps** | [**List&lt;StepResult&gt;**](StepResult.md) | Flat step list. |  |
|**auditLog** | [**List&lt;AuditLogEntry&gt;**](AuditLogEntry.md) | Append-only audit trail for this screening. |  |



