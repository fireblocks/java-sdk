

# TrustProofOfAddressResponse

Response containing the TRUST-compatible encoded signature

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **UUID** | Transaction ID from Fireblocks (UUID format) |  |
|**status** | **TypedMessageTransactionStatusEnum** |  |  |
|**signature** | **String** | TRUST-compatible encoded signature for proof of address verification.  |  |
|**publicKey** | **String** | Hex public key of the Fireblocks vault key that produced the signature. Present only when &#x60;status&#x60; is &#x60;SIGNED&#x60; or &#x60;COMPLETED&#x60;, and only if Fireblocks returned it. TRUST requires this key for SUI, TON and XTZ (as &#x60;auxProofData.encryptedPublicKey&#x60;).  |  [optional] |



