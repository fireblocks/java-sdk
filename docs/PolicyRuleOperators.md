

# PolicyRuleOperators

Defines users/groups who can initiate the type of transaction to which the rule applies.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**wildcard** | [**WildcardEnum**](#WildcardEnum) | If used then this property should appear as the only child property * \&quot;*\&quot; - All users are allowed  |  [optional] |
|**users** | **List&lt;String&gt;** | Set of users ids |  [optional] |
|**usersGroups** | **List&lt;String&gt;** | Set of group ids |  [optional] |
|**services** | **List&lt;String&gt;** | set of services to initiate transactions |  [optional] |



## Enum: WildcardEnum

| Name | Value |
|---- | -----|
| STAR | &quot;*&quot; |



