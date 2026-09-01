

# ContactApprovalRequest

An approval request awaiting a quorum decision. Null when none is open. Carried both by a contact, for a quorum-gated write on the contact itself, and by an individual tag, for a change to the tag's own definition. An attach or detach of that tag to this contact is carried by the tag's `pendingAttachment` instead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The approval request identifier |  |
|**type** | **String** | The operation awaiting approval. Deliberately not an enumeration: the set is open across the surfaces that carry one, and includes contact operations such as CREATE_CONTACT and DELETE_CONTACT as well as changes to a tag itself. |  |



