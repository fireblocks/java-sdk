

# AllowlistMetadata

Allowlist-specific metadata

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastSyncedAt** | **OffsetDateTime** | ISO 8601 timestamp of last sync with provider |  [optional] |
|**syncStatus** | [**SyncStatusEnum**](#SyncStatusEnum) | Status of last sync operation |  [optional] |



## Enum: SyncStatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| NEVER_SYNCED | &quot;NEVER_SYNCED&quot; |



