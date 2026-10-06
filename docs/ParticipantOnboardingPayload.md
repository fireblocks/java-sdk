

# ParticipantOnboardingPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The vault account that acts as the participant. Its Canton party is derived for you. |  |
|**blockchainId** | [**BlockchainIdEnum**](#BlockchainIdEnum) | The blockchain this party is connected to — &#x60;CANTON&#x60; or &#x60;CANTON_TEST&#x60;. |  |
|**expiresAt** | **OffsetDateTime** | When the onboarding request expires if it has not been answered. RFC 3339. |  [optional] |
|**operator** | **String** | DTCC infra operator party id. |  |
|**compliance** | **String** | DTCC compliance party id. |  |
|**registrar** | **String** | DTCC registrar party id — co-signs the accept. |  |
|**clientOnboarder** | **String** | DTCC client onboarder party id — co-signs the accept. |  |
|**upgrader** | **String** | DTCC upgrader party id — the Model Upgrade Tool authority. Supplied by DTCC during the off-chain registration, alongside the other party ids. |  |



## Enum: BlockchainIdEnum

| Name | Value |
|---- | -----|
| CANTON | &quot;CANTON&quot; |
| CANTON_TEST | &quot;CANTON_TEST&quot; |



