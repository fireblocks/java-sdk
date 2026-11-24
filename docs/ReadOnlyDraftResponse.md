

# ReadOnlyDraftResponse

Response object for the read-only draft operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Operation status |  |
|**rules** | [**List&lt;PolicyRule&gt;**](PolicyRule.md) | Draft rules |  |
|**draftId** | **String** | Draft unique id. null when no draft is stored; the active policy is returned |  |
|**metadata** | [**Map&lt;String, PolicyMetadataEntry&gt;**](PolicyMetadataEntry.md) | Policy metadata keyed by policy type |  |



