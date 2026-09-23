

# AuditLogEntry

One entry in a screening's append-only audit trail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **String** | Unix timestamp in seconds when the event occurred, encoded as a string. |  |
|**eventType** | **AuditEventTypeEnum** |  |  |
|**data** | **byte[]** | The event payload, JSON serialised and then base64 encoded. Its shape depends on &#x60;eventType&#x60; — decode it to read the event. |  |



