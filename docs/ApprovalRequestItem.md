

# ApprovalRequestItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestPayload** | **String** | The pending approval request as a JSON string, exactly as produced by the backend — this is the precise string to sign in order to approve the request (sign it as-is; do not re-serialize). The JSON has the shape { requestId, requestType, requestTimestamp (epoch ms), expiresAt (epoch seconds), requestData }, where requestData is the request-type-specific payload. |  |
|**requestSignature** | **String** | Signature over the requestPayload. Empty until request signing is implemented. |  [optional] |
|**userStatus** | [**UserStatusEnum**](#UserStatusEnum) | The authenticated user&#39;s approval status for this request. |  |
|**quorumStatus** | [**QuorumStatus**](QuorumStatus.md) |  |  [optional] |



## Enum: UserStatusEnum

| Name | Value |
|---- | -----|
| USER_STATUS_NOT_APPLICABLE | &quot;USER_STATUS_NOT_APPLICABLE&quot; |
| USER_NOT_ELIGIBLE_TO_APPROVE | &quot;USER_NOT_ELIGIBLE_TO_APPROVE&quot; |
| USER_NOT_APPROVED | &quot;USER_NOT_APPROVED&quot; |
| USER_APPROVED | &quot;USER_APPROVED&quot; |



