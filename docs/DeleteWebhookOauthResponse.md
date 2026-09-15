

# DeleteWebhookOauthResponse

The deleted OAuth credential set, plus the ids of any webhooks the delete detached from it. Webhooks are only detached by `forceDelete=true`; without it a delete is refused with `409` while anything still references the credentials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The id of the OAuth credentials. Pass this as a webhook&#39;s &#x60;webhookOauthId&#x60; to attach them. |  |
|**name** | **String** | The label given to this credential set. |  |
|**clientId** | **String** | OAuth client ID used to authenticate with the token endpoint. |  |
|**url** | **String** | Token endpoint URL. |  |
|**authMethod** | **String** | How the client credentials are presented to the token endpoint: &#x60;client_secret_basic&#x60;, &#x60;client_secret_post&#x60; or &#x60;client_secret_jwt&#x60;. Credentials created without this field report &#x60;client_secret_basic&#x60;, which is what they use. |  |
|**customJwtClaims** | **List&lt;String&gt;** | Names of the additional claims placed in the JWT assertion. Claim values are write-only and are never returned. Absent when no custom claims are configured. |  [optional] |
|**customBodyParams** | **List&lt;String&gt;** | Names of the additional parameters added to the token request body. Parameter values are write-only and are never returned. Absent when no custom parameters are configured. |  [optional] |
|**customHeaders** | **List&lt;String&gt;** | Names of the additional HTTP headers added to **the token request sent to the authorization server** — not to the webhook delivery, which has its own separate &#x60;customHeaders&#x60;. Header values are write-only and are never returned. Absent when no custom headers are configured. |  [optional] |
|**mtlsClientSignedCert** | **String** | PEM-encoded client certificate used for mTLS when fetching OAuth tokens. |  [optional] |
|**createdAt** | **Long** | The date and time the OAuth credentials were created, in milliseconds. |  |
|**updatedAt** | **Long** | The date and time the OAuth credentials were last updated, in milliseconds. |  |
|**detachedWebhookIds** | **List&lt;UUID&gt;** | Webhooks whose &#x60;webhookOauthId&#x60; was cleared. The webhooks themselves are not deleted and keep delivering, just without an &#x60;Authorization&#x60; header. Empty unless &#x60;forceDelete&#x3D;true&#x60; detached something. |  |



