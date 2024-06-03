

# SigningKeyDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyId** | **String** | External signing key id set by Fireblocks. |  |
|**signingDeviceKeyId** | **String** | The ID, name or label of the key specified on the customer&#39;s signing device. |  |
|**publicKeyPem** | **String** | PEM encoded public key |  |
|**algorithm** | **String** | Algorithm and curve used for the signature. Can be: ECDSA_SECP256K1 or EDDSA_ED25519 |  |
|**enabled** | **Boolean** | True if the signing key is enabled |  |
|**vaultAccountId** | **BigDecimal** | Id of the vault account which this key is linked to |  |
|**agentUserId** | **String** | Id of user that represent agent servers that can sign with the key |  |
|**createdAt** | **BigDecimal** | Creation date (timestamp) in milliseconds. |  |



