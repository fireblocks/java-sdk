

# SecurityFindingDetailed

A single FSPM finding, redacted to the public field set

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the finding |  |
|**type** | [**TypeEnum**](#TypeEnum) | The finding type identifier |  |
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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| API_USER_NOT_WHITELISTED | &quot;API_USER_NOT_WHITELISTED&quot; |
| CONSOLE_IP_ALLOWLIST_DEACTIVATED | &quot;CONSOLE_IP_ALLOWLIST_DEACTIVATED&quot; |
| ADMIN_TH_SET_TO_ALL_AND_MORE_THAN_2_ADMINS | &quot;ADMIN_TH_SET_TO_ALL_AND_MORE_THAN_2_ADMINS&quot; |
| API_USERS_COUNT_PASSES_TH_AND_OWNER_NOT_MANDATORY | &quot;API_USERS_COUNT_PASSES_TH_AND_OWNER_NOT_MANDATORY&quot; |
| API_COSIGNER_WITH_NO_CALLBACK | &quot;API_COSIGNER_WITH_NO_CALLBACK&quot; |
| API_USER_DIDNT_APPROVE_CCR_IN_X_DAYS | &quot;API_USER_DIDNT_APPROVE_CCR_IN_X_DAYS&quot; |
| NON_VIEWER_DIDNT_INITIATE_APPROVE_OR_SIGN_TX_OR_CCR_LAST_X_DAYS | &quot;NON_VIEWER_DIDNT_INITIATE_APPROVE_OR_SIGN_TX_OR_CCR_LAST_X_DAYS&quot; |
| TH_SET_TO_1_AND_MORE_THAN_3_APPROVERS | &quot;TH_SET_TO_1_AND_MORE_THAN_3_APPROVERS&quot; |
| ADMIN_TH_SET_TO_1_AND_MORE_THAN_3_ADMINS | &quot;ADMIN_TH_SET_TO_1_AND_MORE_THAN_3_ADMINS&quot; |
| NON_EVM_DAPP_CONNECTIONS_ENABLED_BUT_UNUSED | &quot;NON_EVM_DAPP_CONNECTIONS_ENABLED_BUT_UNUSED&quot; |
| OTA_ENABLED_BUT_UNUSED | &quot;OTA_ENABLED_BUT_UNUSED&quot; |
| POLICY_NOT_UPDATED_RECENTLY | &quot;POLICY_NOT_UPDATED_RECENTLY&quot; |
| RAW_SIGNING_ENABLED_BUT_UNUSED | &quot;RAW_SIGNING_ENABLED_BUT_UNUSED&quot; |
| API_USER_UNUSED_FOR_90_DAYS | &quot;API_USER_UNUSED_FOR_90_DAYS&quot; |
| UNUSED_UNLIMITED_TOKEN_ALLOWANCES | &quot;UNUSED_UNLIMITED_TOKEN_ALLOWANCES&quot; |
| UNUSED_WHITELISTED_ADDRESS | &quot;UNUSED_WHITELISTED_ADDRESS&quot; |
| TRANSACTION_REPETITION_ATTACK | &quot;TRANSACTION_REPETITION_ATTACK&quot; |
| USER_EMAIL_DOMAIN_NON_BUSINESS | &quot;USER_EMAIL_DOMAIN_NON_BUSINESS&quot; |
| OUTDATED_MOBILE_APP_VERSION | &quot;OUTDATED_MOBILE_APP_VERSION&quot; |
| SINGLE_HOP_DRAIN_ATTACK | &quot;SINGLE_HOP_DRAIN_ATTACK&quot; |
| LATERAL_MOVEMENT_DRAIN_ATTACK | &quot;LATERAL_MOVEMENT_DRAIN_ATTACK&quot; |
| WORKSPACE_USER_DORMANT_FOR_X_DAYS | &quot;WORKSPACE_USER_DORMANT_FOR_X_DAYS&quot; |



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



