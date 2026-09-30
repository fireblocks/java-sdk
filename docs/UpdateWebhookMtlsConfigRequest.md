

# UpdateWebhookMtlsConfigRequest

At least one property must be provided.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A new label for this mTLS configuration, or &#x60;null&#x60; to remove it. Letters, digits and spaces only. |  [optional] |
|**signedCert** | **String** | A replacement signed certificate PEM. Every webhook and OAuth credentials set using this configuration switches to it, and the private key it was issued for is re-derived from the certificate. |  [optional] |



