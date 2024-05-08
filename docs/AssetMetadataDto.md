

# AssetMetadataDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetId** | **String** | The Fireblocks&#x60; asset id |  |
|**name** | **String** | The name of the token |  [optional] |
|**symbol** | **String** | The symbol of the token |  [optional] |
|**networkProtocol** | **String** | The network protocol of the token |  [optional] |
|**totalSupply** | **String** | The total supply of the token |  [optional] |
|**holdersCount** | **BigDecimal** | The number of holders of the token |  [optional] |
|**type** | **String** | The type of the token |  [optional] |
|**contractAddress** | **String** | The address of the token contract |  [optional] |
|**issuerAddress** | **String** | In case of Stellar or Ripple, the address of the issuer of the token |  [optional] |
|**testnet** | **Boolean** | Is it deployed on testnet or to mainnet |  [optional] |
|**blockchain** | **String** | The blockchain native asset id which the token is deployed on |  [optional] |
|**decimals** | **BigDecimal** | The number of decimals of the token |  [optional] |
|**vaultAccountId** | **String** | The id of the vault account that initiated the request to issue the token. Will be empty if token was issued outside of Fireblocks. |  [optional] |



