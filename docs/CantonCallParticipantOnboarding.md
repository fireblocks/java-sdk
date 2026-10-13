

# CantonCallParticipantOnboarding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Which call to make. Selects the shape of &#x60;payload&#x60;. |  |
|**vaultAccountId** | **String** | The vault account whose Canton wallet makes this call. |  |
|**blockchainId** | [**BlockchainIdEnum**](#BlockchainIdEnum) | The blockchain the vault account&#39;s Canton party is connected to — &#x60;CANTON&#x60; or &#x60;CANTON_TEST&#x60;. |  |
|**payload** | [**ParticipantOnboardingPayload**](ParticipantOnboardingPayload.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DTCC_PARTICIPANT_ONBOARDING | &quot;DTCC_PARTICIPANT_ONBOARDING&quot; |



## Enum: BlockchainIdEnum

| Name | Value |
|---- | -----|
| CANTON | &quot;CANTON&quot; |
| CANTON_TEST | &quot;CANTON_TEST&quot; |



