

# ContactTagAttachmentPending

An attach or detach of this tag to this contact awaiting a quorum decision. Null when the attachment is settled. Distinct from the tag's own `pendingApprovalRequest`, which covers a change to the tag itself rather than to this pairing. When both are open, this is the one to act on from a contact: cancelling a change to the tag's own definition belongs to the tag surface, and `pendingApprovalRequest.id` must not be used to cancel an attachment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The operation awaiting approval. ATTACH means the tag is not yet attached; DETACH means it is still attached, pending removal. |  |
|**approvalRequestId** | **String** | The identifier of the approval request gating the operation |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ATTACH | &quot;ATTACH&quot; |
| DETACH | &quot;DETACH&quot; |



