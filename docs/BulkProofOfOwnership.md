

# BulkProofOfOwnership

Proof that the customer holds the private key. Required for every key, unlike the single key endpoint: bulk registration has no interactive step in which a proof can arrive later.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | The message to be signed by the key as proof of ownership. 64 to 1024 bytes in hexadecimal format. |  |
|**signature** | **String** | The signature of the message. 64 bytes in hexadecimal format. |  |



