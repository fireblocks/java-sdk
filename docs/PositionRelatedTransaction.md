

# PositionRelatedTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**txId** | **String** | The transaction ID. |  |
|**txHash** | **String** | On-chain transaction hash. Absent while the transaction is pending. |  [optional] |
|**stakingOperation** | [**StakingOperationEnum**](#StakingOperationEnum) | Staking operation type. One of APPROVE, STAKE, UNSTAKE, WITHDRAW, CLAIM_REWARDS, SPLIT, CONSOLIDATE, MERGE, TRANSFER, AUTHORIZE, ADD_TO_STAKE. Absent on legacy persisted rows. |  [optional] |
|**timestamp** | **OffsetDateTime** | ISO timestamp when the transaction was initiated (send time). |  |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction outcome. |  |
|**amount** | **String** | Portion of position amount this transaction moved (native units). Absent on legacy rows. |  [optional] |
|**txNote** | **String** | User-provided note from the transfer request. Omitted when not set. |  [optional] |



## Enum: StakingOperationEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;APPROVE&quot; |
| STAKE | &quot;STAKE&quot; |
| UNSTAKE | &quot;UNSTAKE&quot; |
| WITHDRAW | &quot;WITHDRAW&quot; |
| CLAIM_REWARDS | &quot;CLAIM_REWARDS&quot; |
| SPLIT | &quot;SPLIT&quot; |
| CONSOLIDATE | &quot;CONSOLIDATE&quot; |
| MERGE | &quot;MERGE&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| AUTHORIZE | &quot;AUTHORIZE&quot; |
| ADD_TO_STAKE | &quot;ADD_TO_STAKE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



