

# PolicyRuleQuotaResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | The calculated Amount Over Time (AOT) quota for the rule |  [optional] |
|**quotaConfig** | [**AmountOverTimeConfig**](AmountOverTimeConfig.md) |  |  [optional] |
|**currency** | **String** | The currency of the AOT amount |  [optional] |
|**windowStart** | **BigDecimal** | Unix timestamp (seconds) of the start of the current AOT time window |  [optional] |
|**windowEnd** | **BigDecimal** | Unix timestamp (seconds) of the end of the current AOT time window (when the AOT was calculated) |  [optional] |
|**transactionCount** | **BigDecimal** | Number of transactions in the current AOT time window |  [optional] |



