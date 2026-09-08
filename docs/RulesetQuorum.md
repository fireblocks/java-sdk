

# RulesetQuorum

The general shape, used when the request has more than one sub-request or a sub-request with more than one tier. Each entry in `rulesets` is a sub-request; each of its `groups` is a tier.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Discriminator identifying the multi-tier shape. |  |
|**rulesetMatch** | [**RulesetMatchEnum**](#RulesetMatchEnum) | Whether every sub-request in &#x60;rulesets&#x60; must be satisfied (&#x60;ALL&#x60;) or any single one of them (&#x60;ANY&#x60;). |  |
|**status** | **QuorumApprovalState** |  |  |
|**isMandatoryOwnerApproved** | **Boolean** | Present only when this request additionally requires the workspace owner&#39;s approval. &#x60;false&#x60; means the owner has not approved yet. Absent when no owner approval is required. |  [optional] |
|**rulesets** | [**List&lt;QuorumRuleset&gt;**](QuorumRuleset.md) | The sub-requests of the approval criteria, evaluated according to &#x60;rulesetMatch&#x60;. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RULESET | &quot;RULESET&quot; |



## Enum: RulesetMatchEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| ANY | &quot;ANY&quot; |



