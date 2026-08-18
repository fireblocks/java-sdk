

# EthereumBlockchainData

Additional fields per blockchain for Ethereum (ETH) - can be empty or missing if not initialized or no specific data is available.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isCompoundingValidator** | **Boolean** | Is the validator compounding (i.e it was created with compounding validator type). |  |
|**estimatedActivationTime** | **String** | Estimated time the staked ETH will activate, derived from the beacon-chain deposit queue. Present only while the position is pending/activating; omitted once active. |  [optional] |
|**estimatedSourceExitTime** | **OffsetDateTime** | Estimated time the source validator will exit the active set and stop earning rewards, derived from the beacon-chain consolidation queue. Present only while a consolidation is in progress. |  [optional] |
|**estimatedConsolidationTime** | **OffsetDateTime** | Estimated time the consolidation will complete, i.e. when the source balance is swept to the destination validator, derived from the beacon-chain consolidation queue. Present only while a consolidation is in progress. |  [optional] |
|**estimatedWithdrawalTime** | **OffsetDateTime** | Estimated time the in-flight withdrawal will complete, derived from the beacon-chain exit queue for a full exit or the manual withdrawal queue for a partial one. Present only while a withdrawal is in progress. |  [optional] |



