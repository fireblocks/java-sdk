

# CounterpartyGroup

A counterparty group used to classify counterparties for compliance and routing purposes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupId** | **UUID** | Unique identifier of the counterparty group |  |
|**name** | **String** | Human-readable name of the group |  |
|**description** | **String** | Optional description of the group |  [optional] |
|**jurisdictionCodes** | **List&lt;String&gt;** | List of jurisdiction codes associated with the group |  [optional] |
|**isActive** | **Boolean** | Whether the counterparty group is currently active |  |
|**createdAt** | **OffsetDateTime** | ISO 8601 timestamp when the group was created |  |
|**updatedAt** | **OffsetDateTime** | ISO 8601 timestamp when the group was last updated |  |



