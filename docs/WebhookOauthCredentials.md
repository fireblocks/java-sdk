

# WebhookOauthCredentials

A stored OAuth 2.0 client credential set, referenced by webhooks through their `webhookOauthId`. When a webhook references one, the dispatcher fetches a bearer token from `url` before each delivery and attaches it as `Authorization: Bearer {token}`. Secret material is never returned: `clientSecret` is absent from this schema entirely, and the `customJwtClaims`, `customBodyParams` and `customHeaders` fields are reduced to their names, without the configured values.

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



