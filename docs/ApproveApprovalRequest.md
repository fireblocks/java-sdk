

# ApproveApprovalRequest

The signed approval of a pending request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyId** | **String** | The ID of the approval API key used to sign the request. Optional — if omitted, the signature is verified against all of the user&#39;s registered approval API keys. |  [optional] |
|**signature** | **String** | Base64url-encoded signature over the request&#39;s signable data, produced with the private key of a registered approval API key. If keyId is provided the signature must match that key; otherwise it is matched against all of the user&#39;s registered keys. |  |



