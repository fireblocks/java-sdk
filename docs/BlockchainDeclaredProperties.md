

# BlockchainDeclaredProperties

Declared properties for blockchain configuration (create/update API and response) Only the fields sent by the API and returned in list/create/update responses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainName** | **String** | Human-readable name of the blockchain. |  |
|**chainId** | **BigDecimal** | EVM chain ID of the blockchain. |  |
|**symbolName** | **String** | Native asset symbol of the blockchain. |  |
|**decimals** | **BigDecimal** | Number of decimals for the native asset. |  [optional] |
|**rpcUrls** | **List&lt;String&gt;** | RPC endpoint URLs for the blockchain. |  |
|**environmentType** | [**EnvironmentTypeEnum**](#EnvironmentTypeEnum) | Network environment (mainnet or testnet). |  |
|**blockExplorerUrl** | **String** | Base URL of the block explorer. |  [optional] |
|**blockExplorerTransactionPath** | **String** | Path template for a transaction on the block explorer. |  [optional] |
|**blockExplorerAddressPath** | **String** | Path template for an address on the block explorer. |  [optional] |
|**networkId** | **BigDecimal** | EVM network ID of the blockchain. |  [optional] |
|**hasFee** | **Boolean** | Whether the blockchain charges transaction fees. |  [optional] |
|**isPoa** | **Boolean** | Whether the blockchain uses proof-of-authority consensus. |  [optional] |
|**hasLayeredFee** | **Boolean** | Whether the blockchain uses a layered fee model. |  [optional] |
|**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) | Node client type for the blockchain. |  [optional] |
|**transactionFormat** | **BigDecimal** | Transaction format identifier. |  [optional] |
|**baseAssetTenantIds** | **List&lt;String&gt;** | Tenant IDs that share this base asset. |  [optional] |
|**explorerApiUrl** | **String** | Block explorer API base URL. |  [optional] |
|**explorerApiKey** | **String** | API key for the block explorer API. |  [optional] |
|**isTraceEnabled** | **Boolean** | Whether trace/debug RPC methods are enabled. |  [optional] |
|**rpcAuth** | [**BlockchainRpcAuth**](BlockchainRpcAuth.md) |  |  [optional] |



## Enum: EnvironmentTypeEnum

| Name | Value |
|---- | -----|
| ENVIRONMENT_TYPE_MAINNET | &quot;ENVIRONMENT_TYPE_MAINNET&quot; |
| ENVIRONMENT_TYPE_TESTNET | &quot;ENVIRONMENT_TYPE_TESTNET&quot; |



## Enum: NodeTypeEnum

| Name | Value |
|---- | -----|
| NODE_TYPE_CORE_GETH | &quot;NODE_TYPE_CORE_GETH&quot; |
| NODE_TYPE_FANTOM | &quot;NODE_TYPE_FANTOM&quot; |
| NODE_TYPE_ERIGON | &quot;NODE_TYPE_ERIGON&quot; |
| NODE_TYPE_PARITY | &quot;NODE_TYPE_PARITY&quot; |
| NODE_TYPE_BESU | &quot;NODE_TYPE_BESU&quot; |



