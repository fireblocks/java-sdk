

# DeleteWebhookOauthResponse

The deleted OAuth credential set, plus the ids of any webhooks the delete detached from it. Webhooks are only detached by `forceDelete=true`; without it a delete is refused with `409` while anything still references the credentials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The id of the OAuth credentials. Pass this as a webhook&#39;s &#x60;webhookOauthId&#x60; to attach them. |  |
|**name** | **String** | The label given to this credential set. |  |
|**clientId** | **String** | OAuth client ID used to authenticate with the token endpoint. |  |
|**url** | **String** | Token endpoint URL. |  |
|**authMethod** | **String** | How the client credentials are presented to the token endpoint: &#x60;client_secret_basic&#x60;, &#x60;client_secret_post&#x60;, &#x60;client_secret_jwt&#x60; or &#x60;private_key_jwt&#x60;. Credentials created without this field report &#x60;client_secret_basic&#x60;, which is what they use. |  |
|**signingAlg** | **WebhookOauthSigningAlg** | Algorithm of the key pairs, and of the assertions signed with them. Present only when &#x60;authMethod&#x60; is &#x60;private_key_jwt&#x60;. Which key is signing is never returned; each assertion names it in its &#x60;kid&#x60; header. Defaults to &#x60;RS256&#x60; on create only. |  [optional] |
|**customJwtClaims** | **List&lt;String&gt;** | Names of the additional claims placed in the JWT assertion. Claim values are write-only and are never returned. Absent when no custom claims are configured. |  [optional] |
|**customBodyParams** | **List&lt;String&gt;** | Names of the additional parameters added to the token request body. Parameter values are write-only and are never returned. Absent when no custom parameters are configured. |  [optional] |
|**webhookCustomHeadersId** | **UUID** | The id of the set of custom headers added to **the token request sent to the authorization server** — not to the webhook delivery. Absent when the token request adds none. Header values are write-only and are never returned; read the header names from &#x60;/v1/webhooks_settings/custom_headers/{webhookCustomHeadersId}&#x60;. |  [optional] |
|**webhookMtlsId** | **UUID** | The id of the mTLS configuration presented to the token endpoint. Absent when the token request does not use mTLS. Read the certificate from &#x60;/v1/webhooks_settings/mtls/{id}&#x60;. |  [optional] |
|**createdAt** | **Long** | The date and time the OAuth credentials were created, in milliseconds. |  |
|**updatedAt** | **Long** | The date and time the OAuth credentials were last updated, in milliseconds. |  |
|**jwksUri** | **URI** | The public URL of these credentials&#39; JWKS. Register it as the client&#39;s jwks_uri on your authorization server. Present for private_key_jwt only. |  [optional] [readonly] |
|**detachedWebhookIds** | **List&lt;UUID&gt;** | Webhooks whose &#x60;webhookOauthId&#x60; was cleared. The webhooks themselves are not deleted and keep delivering, just without an &#x60;Authorization&#x60; header. Empty unless &#x60;forceDelete&#x3D;true&#x60; detached something. |  |



