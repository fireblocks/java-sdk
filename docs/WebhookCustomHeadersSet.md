

# WebhookCustomHeadersSet

A stored set of custom HTTP headers, referenced by webhooks and by OAuth credentials through their `webhookCustomHeadersId`. On a webhook the headers go out with every notification; on OAuth credentials they go out on the token request to your authorization server. Header values are write-only: only the names are returned.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The id of the custom headers set. Pass this as a webhook&#39;s, or OAuth credentials&#39;, &#x60;webhookCustomHeadersId&#x60; to attach it. |  |
|**name** | **String** | The label given to this set. |  |
|**headerNames** | **List&lt;String&gt;** | Names of the headers in the set, lowercased. Header values are never returned. |  |
|**createdAt** | **Long** | The date and time the set was created, in milliseconds. |  |
|**updatedAt** | **Long** | The date and time the set was last updated, in milliseconds. |  |



