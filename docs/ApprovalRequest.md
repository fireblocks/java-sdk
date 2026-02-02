

# ApprovalRequest

Approval request details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The approval request identifier |  |
|**type** | [**TypeEnum**](#TypeEnum) | The approval request type |  |
|**state** | [**StateEnum**](#StateEnum) | The approval request state |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TAG_UPDATE | &quot;TAG_UPDATE&quot; |
| TAG_DELETE | &quot;TAG_DELETE&quot; |
| TAG_ATTACH_DETACH | &quot;TAG_ATTACH_DETACH&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| FAILED | &quot;FAILED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



