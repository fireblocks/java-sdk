

# WebhookMtls

mTLS configuration for the webhook. On responses, present only when a signed client certificate is set. On requests, provide a signed client certificate to enable mTLS, or null to remove it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientSignedCert** | **String** | Signed client certificate PEM used for mTLS when delivering notifications. |  |



