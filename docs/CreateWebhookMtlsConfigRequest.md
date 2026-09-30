

# CreateWebhookMtlsConfigRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A label for this mTLS configuration, to tell several certificates apart. Letters, digits and spaces only. |  [optional] |
|**signedCert** | **String** | Signed client certificate PEM, issued for the CSR from &#x60;GET /v1/webhooks_settings/mtls_csr&#x60;. The private key it belongs to is derived from the certificate itself. |  |



