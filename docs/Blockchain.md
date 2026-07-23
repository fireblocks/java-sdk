

# Blockchain

Blockchain entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique blockchain identifier. |  |
|**blockchainState** | [**BlockchainStateEnum**](#BlockchainStateEnum) | Current lifecycle state of the blockchain. |  |
|**declaredProperties** | [**BlockchainDeclaredProperties**](BlockchainDeclaredProperties.md) |  |  |
|**createdAtUtc** | **BigDecimal** | Creation timestamp (epoch milliseconds, UTC). |  |
|**updatedAtUtc** | **BigDecimal** | Last update timestamp (epoch milliseconds, UTC). |  |
|**validationSessionId** | **String** | Validation session data (optional - only present if validation session exists) |  [optional] |
|**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Status of the latest validation session. |  [optional] |
|**validationCreatedAtUtc** | **BigDecimal** | Validation session creation timestamp (epoch milliseconds, UTC). |  [optional] |
|**validationUpdatedAtUtc** | **BigDecimal** | Validation session last update timestamp (epoch milliseconds, UTC). |  [optional] |
|**validationCompletedAtUtc** | **BigDecimal** | Validation session completion timestamp (epoch milliseconds, UTC). |  [optional] |
|**validationFailureReasons** | **List&lt;String&gt;** | Reasons the latest validation failed, if any. |  |
|**failedStep** | [**FailedStepEnum**](#FailedStepEnum) | Business step at which the activation flow failed. Absent when no failure has been recorded. |  [optional] |



## Enum: BlockchainStateEnum

| Name | Value |
|---- | -----|
| BLOCKCHAIN_STATE_CREATED | &quot;BLOCKCHAIN_STATE_CREATED&quot; |
| BLOCKCHAIN_STATE_ACTIVATING | &quot;BLOCKCHAIN_STATE_ACTIVATING&quot; |
| BLOCKCHAIN_STATE_ACTIVATED | &quot;BLOCKCHAIN_STATE_ACTIVATED&quot; |
| BLOCKCHAIN_STATE_DEACTIVATING | &quot;BLOCKCHAIN_STATE_DEACTIVATING&quot; |
| BLOCKCHAIN_STATE_DEACTIVATED | &quot;BLOCKCHAIN_STATE_DEACTIVATED&quot; |
| BLOCKCHAIN_STATE_TECHNICAL_FAILURE | &quot;BLOCKCHAIN_STATE_TECHNICAL_FAILURE&quot; |



## Enum: ValidationStatusEnum

| Name | Value |
|---- | -----|
| VALIDATION_STATUS_PENDING | &quot;VALIDATION_STATUS_PENDING&quot; |
| VALIDATION_STATUS_IN_PROGRESS | &quot;VALIDATION_STATUS_IN_PROGRESS&quot; |
| VALIDATION_STATUS_SUCCEEDED | &quot;VALIDATION_STATUS_SUCCEEDED&quot; |
| VALIDATION_STATUS_FAILED | &quot;VALIDATION_STATUS_FAILED&quot; |
| VALIDATION_STATUS_TECHNICAL_FAILURE | &quot;VALIDATION_STATUS_TECHNICAL_FAILURE&quot; |



## Enum: FailedStepEnum

| Name | Value |
|---- | -----|
| FAILED_STEP_CONFIGURATION | &quot;FAILED_STEP_CONFIGURATION&quot; |
| FAILED_STEP_RESOURCES_ALLOCATION | &quot;FAILED_STEP_RESOURCES_ALLOCATION&quot; |
| FAILED_STEP_TEST_TX_EXTERNAL_TO_FIREBLOCKS | &quot;FAILED_STEP_TEST_TX_EXTERNAL_TO_FIREBLOCKS&quot; |
| FAILED_STEP_TEST_TX_FIREBLOCKS_TO_FIREBLOCKS | &quot;FAILED_STEP_TEST_TX_FIREBLOCKS_TO_FIREBLOCKS&quot; |



