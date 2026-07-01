

# AddConnectedAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerId** | **String** | Integration key identifying the provider (e.g. BINANCE, KINGDOM_BANK, GEMINI_NLV2). |  |
|**displayName** | **String** | Human-readable account name. Required for non-NLV2 providers. |  [optional] |
|**creds** | **byte[]** | Base64-encoded RSA-encrypted credential blob. Encrypt using the public key from GET /exchange_accounts/credentials_public_key. |  |
|**apiKey** | **String** | Account-level API key. |  |
|**mainAccountId** | **String** | Parent main account ID for sub-account creation. Not allowed for NLV2 providers. |  [optional] |
|**accountId** | **String** | Optional provider-side account ID to associate with the created account. |  [optional] |
|**onPremiseServerId** | **String** | On-premise server ID for self-hosted integrations. |  [optional] |



