

# OfferResponseAllocationWithdraw

Withdraw the allocation you made by accepting this offer, unlocking the holding. Carries no arguments — the allocation is resolved from the offer. Answers `409` until the accept has settled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer — one of the offer transaction&#39;s &#x60;cantonDetails.offerResponse.availableResponses&#x60;. That list does not change after the offer arrives; check &#x60;expiresAt&#x60; and the transaction status to see whether it is still answerable. |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| ALLOCATION_WITHDRAW | &quot;ALLOCATION_WITHDRAW&quot; |



