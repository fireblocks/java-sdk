

# DeleteApprovalApiKeyResponse

The result of deleting an approval API key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ccrIdPendingDeletion** | **String** | Always returned. An empty string when the key was deleted immediately. Otherwise, the ID of the approval request that must be approved before the key is removed; the key stays active until then. The request appears in &#x60;GET /v1/approvals&#x60;. |  |



