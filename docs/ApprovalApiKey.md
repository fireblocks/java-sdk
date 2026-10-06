

# ApprovalApiKey

A registered approval API key for an API user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique key ID, used to delete the key. |  |
|**name** | **String** | A human-readable label for the key. |  |
|**createdAt** | **String** | Creation time as epoch time in seconds. |  |
|**lastUsedAt** | **String** | Last time the key was used to sign, as epoch time in seconds (0 if never used). |  |
|**approvalApiPublicKey** | [**ApprovalApiPublicKey**](ApprovalApiPublicKey.md) |  |  |
|**userId** | **String** | The ID of the API user who owns this key. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The state of the key. &#x60;APPROVAL_API_KEY_STATUS_PENDING_REGISTRATION&#x60; - registered but waiting for approval, cannot sign yet. &#x60;APPROVAL_API_KEY_STATUS_ENABLED&#x60; - active. &#x60;APPROVAL_API_KEY_STATUS_PENDING_DELETION&#x60; - removal is waiting for approval, the key stays active until then. &#x60;APPROVAL_API_KEY_STATUS_UNSPECIFIED&#x60; - unknown. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVAL_API_KEY_STATUS_UNSPECIFIED | &quot;APPROVAL_API_KEY_STATUS_UNSPECIFIED&quot; |
| APPROVAL_API_KEY_STATUS_PENDING_REGISTRATION | &quot;APPROVAL_API_KEY_STATUS_PENDING_REGISTRATION&quot; |
| APPROVAL_API_KEY_STATUS_ENABLED | &quot;APPROVAL_API_KEY_STATUS_ENABLED&quot; |
| APPROVAL_API_KEY_STATUS_PENDING_DELETION | &quot;APPROVAL_API_KEY_STATUS_PENDING_DELETION&quot; |



