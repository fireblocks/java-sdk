

# ApproversConfig

Approvers configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canInitiatorApprove** | **Boolean** | Whether initiator can approve |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator for approval groups |  [optional] |
|**allowOperatorAsAuthorizer** | **Boolean** | Whether operator can be authorizer |  [optional] |
|**approvalGroups** | [**List&lt;ApproversConfigApprovalGroupsInner&gt;**](ApproversConfigApprovalGroupsInner.md) | List of approval groups |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



