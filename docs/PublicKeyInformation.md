

# PublicKeyInformation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | Elliptic Curve |  [optional] |
|**derivationPath** | **List&lt;Integer&gt;** | BIP44 derivation path |  [optional] |
|**publicKey** | **String** | Compressed/Uncompressed public key value in hex representation |  [optional] |



## Enum: AlgorithmEnum

| Name | Value |
|---- | -----|
| ECDSA_SECP256K1 | &quot;MPC_ECDSA_SECP256K1&quot; |
| ECDSA_SECP256R1 | &quot;MPC_ECDSA_SECP256R1&quot; |
| EDDSA_ED25519 | &quot;MPC_EDDSA_ED25519&quot; |



