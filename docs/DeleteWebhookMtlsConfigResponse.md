

# DeleteWebhookMtlsConfigResponse

The deleted mTLS configuration, plus the ids of any webhooks and OAuth credentials the delete detached from it. They are only detached by `forceDelete=true`; without it a delete is refused with `409` while anything still references the configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the mTLS configuration, to be set as &#x60;webhookMtlsId&#x60; on a webhook or on OAuth credentials. |  |
|**name** | **String** | The label given to this mTLS configuration. |  [optional] |
|**signedCert** | **String** | The signed client certificate PEM. |  |
|**expiresAt** | **Long** | When the certificate itself expires, in milliseconds since the epoch. |  |
|**createdAt** | **Long** | When the certificate was uploaded, in milliseconds since the epoch. |  |
|**updatedAt** | **Long** | When this configuration was last changed, in milliseconds since the epoch. Differs from createdAt once the certificate has been replaced or the configuration renamed. |  |
|**detachedWebhookIds** | **List&lt;UUID&gt;** | Webhooks whose &#x60;webhookMtlsId&#x60; was cleared. The webhooks themselves are not deleted and keep delivering, just without a client certificate. Empty unless &#x60;forceDelete&#x3D;true&#x60; detached something. |  |
|**detachedWebhookOauthIds** | **List&lt;UUID&gt;** | OAuth credentials whose &#x60;webhookMtlsId&#x60; was cleared. Their token requests continue without a client certificate. Empty unless &#x60;forceDelete&#x3D;true&#x60; detached something. |  |



