

# ByorkConfigResponse

BYORK Light configuration for the tenant: wait-for-response timeouts, active flag, provider, last update time, and allowed timeout ranges for validation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**incomingTimeoutSeconds** | **Integer** | Timeout in seconds for incoming BYORK wait-for-response |  [optional] |
|**outgoingTimeoutSeconds** | **Integer** | Timeout in seconds for outgoing BYORK wait-for-response |  [optional] |
|**active** | **Boolean** | Whether BYORK Light is active for the tenant |  [optional] |
|**provider** | **String** | Provider identifier |  [optional] |
|**lastUpdate** | **OffsetDateTime** | Last update timestamp of the configuration |  [optional] |
|**timeoutRangeIncoming** | [**ByorkTimeoutRange**](ByorkTimeoutRange.md) |  |  [optional] |
|**timeoutRangeOutgoing** | [**ByorkTimeoutRange**](ByorkTimeoutRange.md) |  |  [optional] |



