

# SolanaBlockchainData

Additional fields per blockchain - can be empty or missing if not initialized or no additional info exists. The type depends on the chainDescriptor value. For Solana (SOL), stake account address. For Ethereum (ETH), an empty object is returned as no specific data is available.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stakeAccountAddress** | **String** | The stake account address matching the stakeAccountId. |  |
|**stakeAccountDerivationChangeValue** | **BigDecimal** | The value of the change level in the BIP32 path which was used to derive the stake account address. |  |



