

# TRLinkManualDecisionResponse

Response containing the result of a manual missing-TRM decision (POST write or GET read).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **TRLinkManualDecisionResponseStatusEnum** |  |  |
|**action** | **TRLinkManualDecisionAction** |  |  |
|**source** | **TRLinkManualDecisionSource** |  |  |
|**txId** | **String** | Transaction ID |  |
|**destinationsAffected** | **Integer** | Number of destinations where the decision was applied |  |
|**destinationsSkipped** | **Integer** | Number of destinations that were skipped |  |
|**details** | [**List&lt;TRLinkManualDecisionDestinationDetail&gt;**](TRLinkManualDecisionDestinationDetail.md) | Per-destination details |  |



