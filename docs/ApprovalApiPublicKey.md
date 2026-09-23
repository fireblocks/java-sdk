

# ApprovalApiPublicKey

The public key material and its signing algorithm.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | The signature algorithm of the public key. |  |
|**publicKeyPem** | **String** | The PEM-encoded public key. |  |



## Enum: AlgorithmEnum

| Name | Value |
|---- | -----|
| RSA_PS256 | &quot;RSA_PS256&quot; |
| ECDSA_SECP256_R1 | &quot;ECDSA_SECP256R1&quot; |
| ECDSA_SECP384_R1 | &quot;ECDSA_SECP384R1&quot; |
| EDDSA_ED25519 | &quot;EDDSA_ED25519&quot; |



