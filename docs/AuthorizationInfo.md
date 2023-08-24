

# AuthorizationInfo

The information about your [Transaction Authorization Policy (TAP).](https://developers.fireblocks.com/docs/capabilities#transaction-authorization-policy-tap)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowOperatorAsAuthorizer** | **Boolean** |  |  [optional] |
|**logic** | [**LogicEnum**](#LogicEnum) |  |  [optional] |
|**groups** | [**List&lt;AuthorizationGroups&gt;**](AuthorizationGroups.md) |  |  [optional] |



## Enum: LogicEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



