

# GetActionResponse

Single lending action (intent plus per-step execution rows).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Action sequence id (UUID). |  |
|**status** | **String** | Intent status (e.g. CREATED, IN_PROGRESS, COMPLETED). |  |
|**providerId** | [**ProviderIdEnum**](#ProviderIdEnum) | Lending protocol identifier. |  |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | Whether this action is a deposit or withdraw flow. |  |
|**opportunityId** | **String** | Target lending opportunity identifier. |  |
|**positionId** | **String** | Position id in the system when applicable. |  [optional] |
|**amount** | **String** | Human-readable amount for the action. |  |
|**createdAt** | **String** | Creation time (ISO-8601). |  |
|**updatedAt** | **String** | Last update time (ISO-8601). |  |
|**records** | [**List&lt;ActionRecord&gt;**](ActionRecord.md) | Ordered execution steps for this action. |  |



## Enum: ProviderIdEnum

| Name | Value |
|---- | -----|
| MORPHO | &quot;MORPHO&quot; |
| AAVE | &quot;AAVE&quot; |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;DEPOSIT&quot; |
| WITHDRAW | &quot;WITHDRAW&quot; |



