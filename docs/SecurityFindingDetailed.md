

# SecurityFindingDetailed

A single FSPM finding, redacted to the public field set

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the finding |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the finding |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) | Severity level of the finding |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | Category of the finding |  |
|**createdAt** | **OffsetDateTime** | When the finding was first detected |  |
|**title** | **String** | Human-readable title of the finding |  |
|**statusUpdatedAt** | **OffsetDateTime** | When the finding status was last updated, omitted if the status was never updated |  [optional] |
|**statusUpdatedByUserId** | **UUID** | The user who last updated the finding status, omitted if the status was never updated |  [optional] |
|**statusUpdatedReason** | **String** | The reason provided for the last status update, omitted if none was provided |  [optional] |
|**info** | **Map&lt;String, Object&gt;** | Additional structured context about the finding. Shape varies by finding type. |  |
|**complianceReqs** | [**List&lt;ComplianceRequirement&gt;**](ComplianceRequirement.md) | Compliance requirements this finding relates to |  |
|**riskExplanation** | **String** | Explanation of the risk this finding represents |  |
|**mitigationGuidance** | **String** | Guidance on how to mitigate this finding |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |
| RESOLVED | &quot;RESOLVED&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| INFO | &quot;INFO&quot; |
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| USER_MANAGEMENT | &quot;USER_MANAGEMENT&quot; |
| APPROVAL_GROUP_MANAGEMENT | &quot;APPROVAL_GROUP_MANAGEMENT&quot; |
| POLICY_ENGINE_UTILIZATION | &quot;POLICY_ENGINE_UTILIZATION&quot; |
| WORKSPACE_CONFIGURATION | &quot;WORKSPACE_CONFIGURATION&quot; |
| DEFI_ACCESS | &quot;DEFI_ACCESS&quot; |
| FLEET_MANAGEMENT | &quot;FLEET_MANAGEMENT&quot; |



