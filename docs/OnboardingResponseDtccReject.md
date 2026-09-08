

# OnboardingResponseDtccReject

Reject a DTCC end-investor onboarding offer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer. Must be one of the values currently listed in the transaction&#39;s &#x60;additionalInfo.cantonDetails.offerResponse.availableResponses&#x60;. |  |
|**reason** | **String** | Why the offer is being rejected. Recorded on-chain, where the counterparty can read it. |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| DTCC_END_INVESTOR_ONBOARDING_REJECT | &quot;DTCC_END_INVESTOR_ONBOARDING_REJECT&quot; |



