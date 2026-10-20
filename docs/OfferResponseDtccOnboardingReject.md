

# OfferResponseDtccOnboardingReject

Reject a DTCC end-investor onboarding offer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer — one of the offer transaction&#39;s &#x60;cantonDetails.offerResponse.availableResponses&#x60;. That list does not change after the offer arrives; check &#x60;expiresAt&#x60; and the transaction status to see whether it is still answerable. |  |
|**payload** | [**DtccOnboardingRejectPayload**](DtccOnboardingRejectPayload.md) |  |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| DTCC_END_INVESTOR_ONBOARDING_REJECT | &quot;DTCC_END_INVESTOR_ONBOARDING_REJECT&quot; |



