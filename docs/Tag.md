

# Tag


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the tag |  |
|**label** | **String** | The tag label |  |
|**description** | **String** | Description for the tag |  [optional] |
|**color** | **String** | The tag color in hex format |  [optional] |
|**isProtected** | **Boolean** | Indication if the tag is a protected tag |  |
|**updatedAt** | **BigDecimal** | The date and time the tag was last updated |  |
|**type** | **TagType** |  |  [optional] |
|**allowedEntityTypes** | **List&lt;String&gt;** | The entity types this tag may be attached to. Tags created before this field was introduced read back as [&#39;vault_account&#39;]. Known values: vault_account (default), contact. |  [optional] |
|**pendingApprovalRequest** | [**ApprovalRequest**](ApprovalRequest.md) |  |  [optional] |



