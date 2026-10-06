

# RegisterApprovalApiKeyResponse

The result of registering an approval API key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyId** | **String** | The server-generated ID of the registered key, used for deletion. |  |
|**ccrIdPendingRegistration** | **String** | Always returned. An empty string when the key is active immediately. Otherwise, the ID of the approval request that must be approved before the key becomes active. The request appears in &#x60;GET /v1/approvals&#x60;. |  |



