

# TRLinkJwkPublicKey

JSON Web Key (JWK) format public key

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kty** | [**KtyEnum**](#KtyEnum) | Key type |  |
|**e** | **String** | RSA public exponent |  |
|**use** | [**UseEnum**](#UseEnum) | Public key use (encryption) |  |
|**kid** | **String** | Key ID |  |
|**n** | **String** | RSA modulus |  |



## Enum: KtyEnum

| Name | Value |
|---- | -----|
| RSA | &quot;RSA&quot; |



## Enum: UseEnum

| Name | Value |
|---- | -----|
| ENC | &quot;enc&quot; |



