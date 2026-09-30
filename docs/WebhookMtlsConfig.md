

# WebhookMtlsConfig

A signed client certificate stored for the workspace, and the id a webhook or OAuth credentials set references to use it. Several of them may share one configuration, so replacing the certificate here switches all of them at once.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the mTLS configuration, to be set as &#x60;webhookMtlsId&#x60; on a webhook or on OAuth credentials. |  |
|**name** | **String** | The label given to this mTLS configuration. |  [optional] |
|**signedCert** | **String** | The signed client certificate PEM. |  |
|**expiresAt** | **Long** | When the certificate itself expires, in milliseconds since the epoch. |  |
|**createdAt** | **Long** | When the certificate was uploaded, in milliseconds since the epoch. |  |
|**updatedAt** | **Long** | When this configuration was last changed, in milliseconds since the epoch. Differs from createdAt once the certificate has been replaced or the configuration renamed. |  |



