

# ContactTag

A tag attached to the contact, with the display details resolved from the tagging service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the tag |  |
|**label** | **String** | The tag label |  |
|**color** | **String** | The tag color in hex format. Absent when the tag has none. |  [optional] |
|**description** | **String** | Description for the tag. Absent when the tag has none. |  [optional] |
|**isProtected** | **Boolean** | Whether the tag is protected, meaning changes to it and to its attachments are approval-gated. |  |
|**pendingApprovalRequest** | [**ContactApprovalRequest**](ContactApprovalRequest.md) |  |  |
|**pendingAttachment** | [**ContactTagAttachmentPending**](ContactTagAttachmentPending.md) |  |  |



