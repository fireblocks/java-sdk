

# ParticipantOnboardingPayload

Optional, and so is every field in it: omit `payload` entirely to onboard with DTCC's published parties for the blockchain and the default expiry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expiresAt** | **OffsetDateTime** | When the onboarding request expires if it has not been answered. RFC 3339. |  [optional] |
|**operator** | **String** | DTCC infra operator party id. Optional — overrides the service&#39;s default for the blockchain. |  [optional] |
|**compliance** | **String** | DTCC compliance party id. Optional — overrides the service&#39;s default for the blockchain. |  [optional] |
|**registrar** | **String** | DTCC registrar party id — co-signs the accept. Optional — overrides the service&#39;s default for the blockchain. |  [optional] |
|**clientOnboarder** | **String** | DTCC client onboarder party id — co-signs the accept. Optional — overrides the service&#39;s default for the blockchain. |  [optional] |
|**upgrader** | **String** | DTCC upgrader party id — the Model Upgrade Tool authority. Optional — overrides the service&#39;s default for the blockchain. |  [optional] |



