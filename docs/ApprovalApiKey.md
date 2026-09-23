

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



