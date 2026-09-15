

# UpdateConnectedAccountCredentialsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creds** | **byte[]** | Base64-encoded RSA-encrypted credential blob (the new secret). Encrypt using the public key from GET /connected_accounts/credentials/public_key. |  |
|**apiKey** | **String** | The new account-level API key. Mandatory for credential update. |  |



