

# RetryRequoteRequestDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Indicates that the order should be re-quoted if the original quote is expired, trying to match the original quote. |  |
|**count** | **BigDecimal** | If quote is expired, how many times to re-generate new quotes to try having the order executed as in the original quote. |  |
|**slippageBps** | **BigDecimal** | Slippage tolerance in basis points (bps) for quote orders - 1 is 0.01% and 10000 is 100% |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RETRY | &quot;RETRY&quot; |



