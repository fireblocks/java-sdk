

# UpdateWebhookCustomHeadersRequest

A partial update. Every field is optional and an omitted field is left as it is. A change to `headers` applies to every webhook and OAuth credential set using the set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A label for this set. Omit to leave it unchanged. |  [optional] |
|**headers** | **Map&lt;String, Object&gt;** | A delta applied to the headers. A header with a value is added or replaced, a header with &#x60;null&#x60; is deleted, and one you leave out is untouched. A value replaces what is stored under that name rather than adding to it, so an array is the complete new set of lines for that header. Names are case-insensitive, so a &#x60;null&#x60; under one casing deletes a header stored under another, and names are stored and returned lowercased. The set cannot be emptied: a change that would leave no headers is refused with a &#x60;400&#x60;. To remove the set, delete it. The whole field cannot be &#x60;null&#x60;. Same rules as on create: a string or a non-empty array, &#x60;Cookie&#x60; and &#x60;Authorization&#x60; string-only, 10 headers and under 16 KB in the resulting set, the same reserved names (see the create request) never allowed, and values write-only. Entries set to &#x60;null&#x60; do not count towards the limit. The change applies to everything already using the set. Where Fireblocks sends its own &#x60;Authorization&#x60; header, a custom &#x60;Authorization&#x60; header is not sent: on a webhook that has &#x60;webhookOauthId&#x60; set (an OAuth bearer token), and on the token request of OAuth credentials that use &#x60;client_secret_basic&#x60;. |  [optional] |



