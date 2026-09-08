

# QuorumStatus

The approval quorum's structure and progress for this request.  `null` when `quorumStatusMode` is omitted or `NONE`. Also `null` on an otherwise successful response when the quorum cannot be reported faithfully — a multi-tier request in a workspace that does not maintain per-tier approval counts — so absence here does not imply the request has no quorum.  The object may carry additional backend-defined fields beyond those documented.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestStatus** | **QuorumRequestState** |  |  |
|**users** | [**List&lt;QuorumUser&gt;**](QuorumUser.md) | Every user participating in this request&#39;s quorum. Returned only for &#x60;quorumStatusMode&#x3D;FULL&#x60;; omitted otherwise. |  [optional] |
|**quorum** | [**QuorumStatusQuorum**](QuorumStatusQuorum.md) |  |  |



