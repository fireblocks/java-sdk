

# TRLinkManualDecisionResponse

Response containing the result of the manual decision

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **TRLinkManualDecisionAction** |  |  |
|**source** | **TRLinkManualDecisionSource** |  |  |
|**txId** | **String** | Transaction ID |  |
|**destinationsAffected** | **Integer** | Number of destinations where the decision was applied |  |
|**destinationsSkipped** | **Integer** | Number of destinations that were skipped |  |
|**details** | [**List&lt;TRLinkManualDecisionDestinationDetail&gt;**](TRLinkManualDecisionDestinationDetail.md) | Per-destination details |  |



