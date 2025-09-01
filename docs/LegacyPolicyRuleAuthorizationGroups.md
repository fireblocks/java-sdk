

# LegacyPolicyRuleAuthorizationGroups

Defines the transaction approval terms

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logic** | [**LogicEnum**](#LogicEnum) | * AND - requires approval of all authorization groups * OR - requires approval of at least one of the authorization groups  |  [optional] |
|**allowOperatorAsAuthorizer** | **Boolean** | Defines whether the user who initiates a transaction can approve their own transaction and count toward the approval threshold for their transaction |  [optional] |
|**groups** | [**List&lt;LegacyPolicyRuleAuthorizationGroupsGroupsInner&gt;**](LegacyPolicyRuleAuthorizationGroupsGroupsInner.md) | Groups of entities which can approve the transaction |  [optional] |



## Enum: LogicEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



