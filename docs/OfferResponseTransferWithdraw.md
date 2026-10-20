

# OfferResponseTransferWithdraw

Withdraw your own outgoing transfer offer. Carries no arguments — `offerId` in the path identifies the offer, and the vault account and blockchain are resolved from it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer — one of the offer transaction&#39;s &#x60;cantonDetails.offerResponse.availableResponses&#x60;. That list does not change after the offer arrives; check &#x60;expiresAt&#x60; and the transaction status to see whether it is still answerable. |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| TRANSFER_WITHDRAW | &quot;TRANSFER_WITHDRAW&quot; |



