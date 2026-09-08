

# QuorumGroup

A single tier of a ruleset: a threshold and the approvals collected toward it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**threshold** | **Integer** | Number of approvals this tier requires. |  |
|**currentApprovalCount** | **Integer** | Approvals collected so far toward &#x60;threshold&#x60;. |  |
|**status** | **QuorumApprovalState** |  |  |
|**members** | **List&lt;Integer&gt;** | Indexes into the top-level &#x60;users&#x60; array identifying the users who belong to this tier. Returned only for &#x60;quorumStatusMode&#x3D;FULL&#x60;; omitted otherwise. |  [optional] |



