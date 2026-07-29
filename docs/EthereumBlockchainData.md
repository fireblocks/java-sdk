

# EthereumBlockchainData

Additional fields per blockchain for Ethereum (ETH) - can be empty or missing if not initialized or no specific data is available.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isCompoundingValidator** | **Boolean** | Is the validator compounding (i.e it was created with compounding validator type). |  |
|**estimatedActivationTime** | **String** | Estimated time the staked ETH will activate, derived from the beacon-chain deposit queue. Present only while the position is pending/activating; omitted once active. |  [optional] |



