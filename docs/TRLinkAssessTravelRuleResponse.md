

# TRLinkAssessTravelRuleResponse

Response indicating whether Travel Rule compliance is required

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**decision** | **TRLinkAssessmentDecision** |  |  |
|**reason** | **String** | Explanation of the decision |  |
|**requiredFields** | **List&lt;String&gt;** | List of required fields if Travel Rule is required |  [optional] |
|**missingInfo** | **List&lt;String&gt;** | List of missing fields if more information is needed |  [optional] |
|**thresholds** | [**TRLinkThresholds**](TRLinkThresholds.md) |  |  [optional] |



