

# Contact

A contact in the workspace address book.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the contact |  |
|**name** | **String** | The contact name, unique across the workspace |  |
|**type** | [**TypeEnum**](#TypeEnum) | Whether the contact is an external party or an account the workspace owns elsewhere |  |
|**accessControl** | [**AccessControlEnum**](#AccessControlEnum) | The access control applied to the contact. Absent when none is set. |  [optional] |
|**notes** | **String** | Free-text notes on the contact. Absent when none are set. |  [optional] |
|**externalRefId** | **String** | A customer-supplied reference id for the contact. Absent when none is set. |  [optional] |
|**containerId** | **UUID** | The container holding the contact. Absent when the contact sits at the root. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The date and time the contact was last modified, in ISO-8601 |  |
|**archivedAt** | **OffsetDateTime** | The date and time the contact was archived, in ISO-8601. Absent for live contacts, so this only carries a value when the request passed archived&#x3D;true. |  [optional] |
|**tags** | [**List&lt;ContactTag&gt;**](ContactTag.md) | The tags attached to the contact |  |
|**pendingApprovalRequest** | [**ContactApprovalRequest**](ContactApprovalRequest.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COUNTERPARTY | &quot;COUNTERPARTY&quot; |
| OWN_ACCOUNT | &quot;OWN_ACCOUNT&quot; |



## Enum: AccessControlEnum

| Name | Value |
|---- | -----|
| WHITELIST | &quot;WHITELIST&quot; |
| BLACKLIST | &quot;BLACKLIST&quot; |



