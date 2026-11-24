

# RevokeWebhookOauthKeyResponse

The key that was revoked. It is no longer published at the `jwksUri` of the credentials. Fetch the JWKS from there for the current public keys.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kid** | **String** | The &#x60;kid&#x60; of the key revoked. When the request carried no &#x60;kid&#x60;, this is the key Fireblocks was signing with. It is the SHA-256 fingerprint of the public key&#39;s DER (SPKI) encoding, in lowercase hex. |  |



