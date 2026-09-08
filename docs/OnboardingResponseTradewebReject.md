

# OnboardingResponseTradewebReject

Reject a Tradeweb co-signing delegation offer. Carries no arguments — the DAR has nowhere on-ledger to record a reason, so none is accepted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum) | How you are answering the offer. Must be one of the values currently listed in the transaction&#39;s &#x60;additionalInfo.cantonDetails.offerResponse.availableResponses&#x60;. |  |



## Enum: ResponseTypeEnum

| Name | Value |
|---- | -----|
| TRADEWEB_COSIGNING_DELEGATION_REJECT | &quot;TRADEWEB_COSIGNING_DELEGATION_REJECT&quot; |



