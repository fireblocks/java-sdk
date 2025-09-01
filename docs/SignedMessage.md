

# SignedMessage

A list of signed messages returned for raw signing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** |  |  [optional] |
|**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) |  |  [optional] |
|**derivationPath** | **List&lt;BigDecimal&gt;** |  |  [optional] |
|**signature** | [**SignedMessageSignature**](SignedMessageSignature.md) |  |  [optional] |
|**publicKey** | **String** |  |  [optional] |



## Enum: AlgorithmEnum

| Name | Value |
|---- | -----|
| MPC_ECDSA_SECP256_K1 | &quot;MPC_ECDSA_SECP256K1&quot; |
| MPC_EDDSA_ED25519 | &quot;MPC_EDDSA_ED25519&quot; |



