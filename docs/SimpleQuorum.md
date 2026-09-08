

# SimpleQuorum

The flattened shape used when the request has a single sub-request with a single tier, which is the common case. The threshold and approval count sit directly on the quorum object instead of inside `rulesets`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Discriminator identifying the flattened single-tier shape. |  |
|**threshold** | **Integer** | Number of approvals this request requires. |  |
|**currentApprovalCount** | **Integer** | Approvals collected so far toward &#x60;threshold&#x60;. |  |
|**status** | **QuorumApprovalState** |  |  |
|**isMandatoryOwnerApproved** | **Boolean** | Present only when this request additionally requires the workspace owner&#39;s approval. &#x60;false&#x60; means the owner has not approved yet, which is why &#x60;status&#x60; can remain &#x60;PENDING&#x60; even once &#x60;currentApprovalCount&#x60; reaches &#x60;threshold&#x60;. Absent when no owner approval is required. |  [optional] |
|**members** | **List&lt;Integer&gt;** | Indexes into the top-level &#x60;users&#x60; array identifying the users who may approve. Returned only for &#x60;quorumStatusMode&#x3D;FULL&#x60;; omitted otherwise. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIMPLE | &quot;SIMPLE&quot; |



