

# UpdateWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The url of the webhook where notifications will be sent. URL must be valid, unique and https. |  [optional] |
|**description** | **String** | description of the webhook of what it is used for.should not contain special characters. |  [optional] |
|**events** | **List&lt;WebhookEvent&gt;** | The events that the webhook will be subscribed to |  [optional] |
|**enabled** | **Boolean** | The status of the webhook |  [optional] |
|**webhookMtlsId** | **UUID** | The id of the mTLS configuration this webhook presents when delivering, from &#x60;/v1/webhooks_settings/mtls&#x60;. Several webhooks may share one configuration, so replacing its certificate covers all of them at once. Send &#x60;null&#x60; to stop using mTLS for this webhook. Requires advanced webhook controls to be enabled for the workspace (&#x60;403&#x60; otherwise), except to detach. |  [optional] |
|**webhookOauthId** | **UUID** | The id of the OAuth credentials this webhook authenticates with, from &#x60;/v1/webhooks_settings/oauth&#x60;. Several webhooks may share one credential set, so rotating its client secret covers all of them at once. Send &#x60;null&#x60; to stop using OAuth for this webhook. When the webhook has OAuth credentials, Fireblocks sends its own &#x60;Authorization&#x60; header (the bearer token), and a custom &#x60;Authorization&#x60; header from the attached set is not sent. Requires advanced webhook controls to be enabled for the workspace (&#x60;403&#x60; otherwise), except to detach. |  [optional] |
|**webhookCustomHeadersId** | **UUID** | The id of the set of custom HTTP headers sent with this webhook&#39;s notifications, from &#x60;/v1/webhooks_settings/custom_headers&#x60;. Several webhooks, and OAuth credentials, may share one set, so changing it covers all of them at once. Validated when the set is created or changed; attaching checks only that it exists in your workspace. Send &#x60;null&#x60; to stop sending custom headers with this webhook. Replaces the inline &#x60;customHeaders&#x60; field, which is now refused with a &#x60;400&#x60;, so use &#x60;webhookCustomHeadersId&#x60;. Requires advanced webhook controls to be enabled for the workspace (&#x60;403&#x60; otherwise), except to detach. An unknown id, or one belonging to another workspace, is a &#x60;404&#x60;. |  [optional] |



