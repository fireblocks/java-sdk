

# CreateTagRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | The tag label |  |
|**description** | **String** | Description for the tag |  [optional] |
|**color** | **String** | The tag color in hex format |  [optional] |
|**isProtected** | **Boolean** | Indication if the tag is protected tag |  [optional] |
|**type** | **TagType** |  |  [optional] |
|**allowedEntityTypes** | **List&lt;String&gt;** | Allow-list of entity types this tag may be attached to. Soft-defaults to [&#39;vault_account&#39;] when omitted, and is immutable after creation. Known values: vault_account (default), contact. |  [optional] |



