

# OfferResponseTradewebReject

Reject a Tradeweb co-signing delegation offer. Carries no arguments — Tradeweb does not record a reject reason on the ledger, so none is accepted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer — one of the offer transaction&#39;s &#x60;cantonDetails.offerResponse.availableResponses&#x60;. That list does not change after the offer arrives; check &#x60;expiresAt&#x60; and the transaction status to see whether it is still answerable. |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| TRADEWEB_COSIGNING_DELEGATION_REJECT | &quot;TRADEWEB_COSIGNING_DELEGATION_REJECT&quot; |



