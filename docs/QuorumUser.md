

# QuorumUser

A user who participates in this request's approval quorum, and their approval state.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | Zero-based position of this user within the &#x60;users&#x60; array. The &#x60;members&#x60; arrays elsewhere in the document reference users by this index rather than repeating the user ID. |  |
|**userId** | **String** | The participating user&#39;s ID. |  |
|**status** | **QuorumApprovalState** |  |  |
|**isMandatoryOwner** | **Boolean** | Present and &#x60;true&#x60; only for the workspace owner, when this request additionally requires the owner&#39;s approval. Absent for every other participant. |  [optional] |



