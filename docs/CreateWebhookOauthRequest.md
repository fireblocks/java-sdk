

# CreateWebhookOauthRequest

A new reusable OAuth 2.0 client credential set. Attach it to a webhook by passing the returned id as that webhook's `webhookOauthId`. Several webhooks may share one credential set, so rotating its client secret covers all of them at once.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A label for this credential set, shown when listing them. |  |
|**clientId** | **String** | OAuth client ID used to authenticate with the token endpoint. |  |
|**clientSecret** | **String** | OAuth client secret. Write-only — never returned. Limited to 480 bytes UTF-8 encoded. With &#x60;client_secret_jwt&#x60; it signs the assertion rather than being sent. |  |
|**url** | **String** | Token endpoint URL. HTTPS on port 443 only, and the host must resolve publicly — localhost and private, link-local or loopback addresses are rejected. |  |
|**authMethod** | **String** | How the client credentials reach the token endpoint. &#x60;client_secret_basic&#x60; uses an HTTP Basic header, &#x60;client_secret_post&#x60; uses form fields in the body, and &#x60;client_secret_jwt&#x60; sends a JWT assertion signed with the secret, so the secret itself is never transmitted. Defaults to &#x60;client_secret_basic&#x60;. |  [optional] |
|**customJwtClaims** | **Map&lt;String, Object&gt;** | Extra claims for the JWT assertion. Used only when &#x60;authMethod&#x60; is &#x60;client_secret_jwt&#x60;. The usual one to set is &#x60;aud&#x60;, which defaults to the token endpoint URL; some authorization servers expect their own identifier instead. A value may be any JSON type except &#x60;null&#x60; — &#x60;null&#x60; is reserved for deleting a claim on update. &#x60;iss&#x60;, &#x60;sub&#x60;, &#x60;jti&#x60;, &#x60;iat&#x60; and &#x60;exp&#x60; are set by Fireblocks and cannot be overridden. Names are case-sensitive. The whole object must be under 16 KB. Values are write-only; responses return only the claim names. On update this merges claim by claim rather than replacing — see &#x60;WebhookOauthCustomJwtClaimsUpdate&#x60;. |  [optional] |
|**customBodyParams** | **Map&lt;String, String&gt;** | Extra parameters for the token request body — &#x60;scope&#x60; most commonly, sometimes &#x60;audience&#x60; or &#x60;resource&#x60;. Applies to every authentication method. Values must be strings, because the token request body is form-encoded rather than JSON. An empty string is allowed. &#x60;grant_type&#x60;, &#x60;client_id&#x60;, &#x60;client_secret&#x60;, &#x60;client_assertion&#x60; and &#x60;client_assertion_type&#x60; are set by Fireblocks and cannot be overridden. Names are case-sensitive. The whole object must be under 16 KB. Values are write-only; responses return only the parameter names. On update this merges key by key rather than replacing — see &#x60;WebhookOauthCustomBodyParamsUpdate&#x60;. |  [optional] |
|**customHeaders** | **Map&lt;String, String&gt;** | Extra HTTP headers for **the token request to your authorization server** — not for the webhook delivery, which has its own separate &#x60;customHeaders&#x60;. A gateway API key is the usual case. Values must be strings; an empty string is allowed. Names are matched case-insensitively, so two names differing only in case are a duplicate. Names are stored and returned lowercased, so &#x60;X-Api-Key&#x60; comes back as &#x60;x-api-key&#x60;. &#x60;Content-Type&#x60;, &#x60;Content-Length&#x60; and &#x60;Host&#x60; are set by Fireblocks and cannot be overridden. &#x60;Authorization&#x60; can be set with &#x60;client_secret_post&#x60; or &#x60;client_secret_jwt&#x60;, which send the credentials in the body — useful when your token endpoint sits behind a gateway. It is rejected with &#x60;client_secret_basic&#x60;, which sends the credentials in that header. Values have no length limit of their own; the whole object must be under 16 KB when serialized as UTF-8. Values are write-only; responses return only the header names. On update this merges name by name rather than replacing — see &#x60;WebhookOauthCustomHeadersUpdate&#x60;. |  [optional] |
|**mtlsClientSignedCert** | **String** | PEM-encoded client certificate for mTLS when fetching tokens. Must be a valid X.509 certificate inside its validity window. |  [optional] |



