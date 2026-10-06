

# TempoTransferDestinationItem

One destination in a multi-destination transfer. `destination.type` is narrowed the same way as the top-level `destination` field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | The amount to transfer to this destination, as a numeric string. |  [optional] |
|**destination** | [**TempoTransferDestination**](TempoTransferDestination.md) |  |  [optional] |
|**travelRuleMessageId** | **String** | Beta. An identifier of a TravelRule message, already sent to the TravelRule provider. |  [optional] |
|**customerRefId** | **String** | The ID for AML providers to associate the owner of funds with transactions. |  [optional] |



