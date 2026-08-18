

# SecurityFinding

A single FSPM finding

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the finding |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The finding type identifier |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the finding |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | Severity level of the finding |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | Category of the finding |  [optional] |
|**createdAt** | **OffsetDateTime** | When the finding was first detected |  [optional] |
|**title** | **String** | Human-readable title of the finding |  [optional] |



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
| ACCESS_CONTROL | &quot;ACCESS_CONTROL&quot; |
| ADMIN_MANAGEMENT | &quot;ADMIN_MANAGEMENT&quot; |
| SECURITY | &quot;SECURITY&quot; |
| CONFIGURATION | &quot;CONFIGURATION&quot; |
| APPROVAL_GROUP_MANAGEMENT | &quot;APPROVAL_GROUP_MANAGEMENT&quot; |
| POLICY_ENGINE_UTILIZATION | &quot;POLICY_ENGINE_UTILIZATION&quot; |
| WORKSPACE_CONFIGURATION | &quot;WORKSPACE_CONFIGURATION&quot; |
| DEFI_ACCESS | &quot;DEFI_ACCESS&quot; |
| FLEET_MANAGEMENT | &quot;FLEET_MANAGEMENT&quot; |



