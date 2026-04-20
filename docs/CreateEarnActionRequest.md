

# CreateEarnActionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Whether to deposit into or withdraw from the lending opportunity. |  |
|**opportunityId** | **String** | Identifier of the vault or market (lending opportunity). |  |
|**vaultAccountId** | **String** | Fireblocks vault account that will execute the action. |  |
|**amount** | **String** | Human-readable token amount (e.g. \&quot;1.6\&quot;) or the keyword \&quot;max\&quot; for the full position or available balance. |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;DEPOSIT&quot; |
| WITHDRAW | &quot;WITHDRAW&quot; |



