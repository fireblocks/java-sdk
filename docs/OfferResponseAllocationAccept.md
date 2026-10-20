

# OfferResponseAllocationAccept

Accept a CIP-56 allocation request. Carries no arguments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer — one of the offer transaction&#39;s &#x60;cantonDetails.offerResponse.availableResponses&#x60;. That list does not change after the offer arrives; check &#x60;expiresAt&#x60; and the transaction status to see whether it is still answerable. |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| ALLOCATION_ACCEPT | &quot;ALLOCATION_ACCEPT&quot; |



