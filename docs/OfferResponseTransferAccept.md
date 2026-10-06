

# OfferResponseTransferAccept

Accept an inbound 2-step transfer offer. Carries no arguments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer. Must be one of the values listed in the transaction&#39;s &#x60;cantonDetails.offerResponse.availableResponses&#x60; — TOP-LEVEL on the transaction, not nested under an &#x60;additionalInfo&#x60; envelope, which does not exist on &#x60;TransactionResponse&#x60;. &#x60;availableResponses&#x60; states what this offer TYPE accepts. It is set when the offer arrives and does not change, so it does NOT tell you whether the offer is still answerable — check &#x60;expiresAt&#x60; and the transaction&#39;s status for that, and expect this endpoint to be the authority: it re-checks state and expiry on every call and answers 409 when either has moved. |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| TRANSFER_ACCEPT | &quot;TRANSFER_ACCEPT&quot; |



