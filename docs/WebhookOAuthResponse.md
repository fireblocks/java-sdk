

# WebhookOAuthResponse

OAuth 2.0 client credentials configuration for the webhook. Present only when OAuth is configured. The `clientSecret` is write-only and is never returned.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | OAuth client ID used to authenticate with the token endpoint. |  |
|**url** | **String** | Token endpoint URL. |  |
|**mtlsClientSignedCert** | **String** | Signed client certificate PEM used for mTLS when connecting to the token endpoint. |  [optional] |



