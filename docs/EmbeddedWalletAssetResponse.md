

# EmbeddedWalletAssetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**symbol** | **String** | The asset symbol |  |
|**name** | **String** | The asset name |  |
|**decimals** | **BigDecimal** | Number of decimals |  |
|**networkProtocol** | **String** | Netowrk protocol of the blockchain (BTC, ETH) |  |
|**testnet** | **Boolean** | Is in testnet |  |
|**hasFee** | **Boolean** | Has fee |  |
|**baseAsset** | **String** | Base asset symbol BTC_TEST, ETH_TEST5) |  |
|**ethNetwork** | **String** |  |  [optional] |
|**ethContractAddress** | **String** |  |  [optional] |
|**issuerAddress** | **String** | The address of the issuer of this token. Will be part of the identifier of this token on chain. |  [optional] |
|**blockchainSymbol** | **String** | Name of blockchain |  [optional] |
|**deprecated** | **Boolean** | Is blockchain deprecated |  [optional] |
|**coinType** | **BigDecimal** | Unique identifier of an asset (0 for BTC, 60 for ETH, etc.) |  |
|**blockchain** | **String** | The blockchain native asset id which the token is deployed on |  |
|**blockchainDisplayName** | **String** | Name of blockchain |  [optional] |
|**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) |  |  [optional] |



## Enum: AlgorithmEnum

| Name | Value |
|---- | -----|
| ECDSA_SECP256K1 | &quot;MPC_ECDSA_SECP256K1&quot; |
| EDDSA_ED25519 | &quot;MPC_EDDSA_ED25519&quot; |



