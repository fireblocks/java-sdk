

# SecurityFinding

A single FSPM finding

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the finding |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the finding |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | Severity level of the finding |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | Category of the finding |  [optional] |
|**createdAt** | **OffsetDateTime** | When the finding was first detected |  [optional] |
|**title** | **String** | Human-readable title of the finding |  [optional] |



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



