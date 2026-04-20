

# ByorkSetTimeoutsRequest

Request body for setting BYORK timeout values. At least one of incomingTimeoutSeconds or outgoingTimeoutSeconds is required. Allowed range per direction is returned in GET config (timeoutRangeIncoming, timeoutRangeOutgoing).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**incomingTimeoutSeconds** | **Integer** | Timeout in seconds for incoming BYORK wait-for-response. Allowed range in GET config (timeoutRangeIncoming). |  [optional] |
|**outgoingTimeoutSeconds** | **Integer** | Timeout in seconds for outgoing BYORK wait-for-response. Allowed range in GET config (timeoutRangeOutgoing). |  [optional] |



