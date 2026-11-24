

# DeleteWebhookCustomHeadersResponse

The deleted custom headers set, plus the ids of any webhooks and OAuth credentials the delete detached from it. Things are only detached by `forceDelete=true`; without it a delete is refused with `409` while anything still uses the set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The id of the custom headers set. Pass this as a webhook&#39;s, or OAuth credentials&#39;, &#x60;webhookCustomHeadersId&#x60; to attach it. |  |
|**name** | **String** | The label given to this set. |  |
|**headerNames** | **List&lt;String&gt;** | Names of the headers in the set, lowercased. Header values are never returned. |  |
|**createdAt** | **Long** | The date and time the set was created, in milliseconds. |  |
|**updatedAt** | **Long** | The date and time the set was last updated, in milliseconds. |  |
|**detachedWebhookIds** | **List&lt;UUID&gt;** | Webhooks whose &#x60;webhookCustomHeadersId&#x60; was cleared. The webhooks themselves are not deleted and keep delivering, just without these headers. Empty unless &#x60;forceDelete&#x3D;true&#x60; detached something. |  |
|**detachedWebhookOauthIds** | **List&lt;UUID&gt;** | OAuth credentials whose &#x60;webhookCustomHeadersId&#x60; was cleared. The credentials themselves are not deleted; their token requests just no longer carry these headers. Empty unless &#x60;forceDelete&#x3D;true&#x60; detached something. |  |



