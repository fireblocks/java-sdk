

# WebhookOAuth

OAuth 2.0 client credentials configuration for the webhook. When set, the webhook dispatcher fetches a bearer token from the configured token endpoint before each delivery and attaches it as `Authorization: Bearer {token}`. Send `null` to remove OAuth configuration entirely.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | OAuth client ID used to authenticate with the token endpoint. |  |
|**clientSecret** | **String** | OAuth client secret. Write-only — never returned in responses. |  |
|**url** | **String** | Token endpoint URL. Must be HTTPS. |  |
|**mtlsClientSignedCert** | **String** | Signed client certificate PEM used for mTLS when connecting to the token endpoint. Same format as the webhook mTLS certificate. Send &#x60;null&#x60; to remove. |  [optional] |



