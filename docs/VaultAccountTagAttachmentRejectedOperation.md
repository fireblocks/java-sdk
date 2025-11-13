

# VaultAccountTagAttachmentRejectedOperation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The ID of the vault account |  |
|**tagId** | **UUID** | Tag ID |  |
|**action** | **TagAttachmentOperationAction** |  |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Reason for rejection |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| CAPACITY_EXCEEDED | &quot;CAPACITY_EXCEEDED&quot; |
| ATTACHMENT_ALREADY_EXISTS | &quot;ATTACHMENT_ALREADY_EXISTS&quot; |
| ATTACHMENT_DOES_NOT_EXIST | &quot;ATTACHMENT_DOES_NOT_EXIST&quot; |
| PENDING_REQUEST_EXISTS | &quot;PENDING_REQUEST_EXISTS&quot; |



