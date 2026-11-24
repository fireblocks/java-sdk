

# RotateWebhookOauthKeyResponse

The key that was rotated out. It stays published at the `jwksUri` of the credentials for 30 days. Fetch the JWKS from there for the current public keys.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kid** | **String** | The &#x60;kid&#x60; of the key rotated out, the one Fireblocks was signing with until now. It is the SHA-256 fingerprint of the public key&#39;s DER (SPKI) encoding, in lowercase hex. |  |



