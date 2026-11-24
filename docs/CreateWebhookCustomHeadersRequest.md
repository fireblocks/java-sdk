

# CreateWebhookCustomHeadersRequest

A new reusable set of custom HTTP headers. Attach it to a webhook by passing the returned id as that webhook's `webhookCustomHeadersId`, or to OAuth credentials as theirs. Several webhooks and OAuth credentials may share one set, so changing it covers all of them at once.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A label for this set, shown when listing them. |  |
|**headers** | **Map&lt;String, Object&gt;** | The headers, as a map of header name to value. At least one header is required. Values are write-only; responses return only the header names, lowercased. A value is a string, sent as one header line, or an array of strings, sent as one header line per element under the same name. &#x60;Cookie&#x60; and &#x60;Authorization&#x60; accept only a string. An empty array is rejected — leave the name out instead. Arrays are accepted whether the set is sent with a webhook&#39;s notifications or on an OAuth token request, which sends one header line per element in the same way. At most 10 headers, counted by name — an array value counts once, however many lines it sends. Names must be valid HTTP header tokens, are case-insensitive, and are at most 128 characters. A value may be empty and has no length limit of its own; the whole object must be under 16 KB when serialized as UTF-8. A value that large may still be refused by your own endpoint, since web servers commonly cap the whole request header block at around 8 KB. Reserved names: &#x60;Host&#x60;, &#x60;Content-Type&#x60;, &#x60;Content-Length&#x60;, &#x60;Transfer-Encoding&#x60;, &#x60;Connection&#x60;, &#x60;User-Agent&#x60;, &#x60;Accept&#x60;, &#x60;Accept-Encoding&#x60;, &#x60;Fireblocks-Signature&#x60; and &#x60;Fireblocks-Webhook-Signature&#x60; are set by Fireblocks and can never be used. The same list applies whether the set is sent with a webhook&#39;s notifications or on an OAuth token request. &#x60;Authorization&#x60; may be set. When Fireblocks sends its own &#x60;Authorization&#x60; header, a custom one is not sent: an OAuth bearer token on a webhook that has &#x60;webhookOauthId&#x60; set, and the client credentials on the token request of OAuth credentials that use &#x60;client_secret_basic&#x60;. With no OAuth credentials on a webhook, or with &#x60;client_secret_post&#x60;, &#x60;client_secret_jwt&#x60; or &#x60;private_key_jwt&#x60; on the token request, it is sent as configured. |  |



