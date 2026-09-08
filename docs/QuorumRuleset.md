

# QuorumRuleset

One sub-request of the approval criteria, made up of one or more tiers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupMatch** | [**GroupMatchEnum**](#GroupMatchEnum) | Whether every tier in &#x60;groups&#x60; must be satisfied (&#x60;ALL&#x60;) or any single one of them (&#x60;ANY&#x60;). |  |
|**status** | **QuorumApprovalState** |  |  |
|**groups** | [**List&lt;QuorumGroup&gt;**](QuorumGroup.md) | The tiers of this sub-request, evaluated according to &#x60;groupMatch&#x60;. |  |



## Enum: GroupMatchEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| ANY | &quot;ANY&quot; |



