

# OfferResponseTransferReject

Reject an inbound 2-step transfer offer. Carries no arguments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer — one of the offer transaction&#39;s &#x60;cantonDetails.offerResponse.availableResponses&#x60;. That list does not change after the offer arrives; check &#x60;expiresAt&#x60; and the transaction status to see whether it is still answerable. |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| TRANSFER_REJECT | &quot;TRANSFER_REJECT&quot; |



