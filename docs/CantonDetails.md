

# CantonDetails

Canton transaction context. Present on transactions that belong to a Canton flow, and the authoritative signal that a transaction IS one — do not branch on `operation`, which is `CANTON_CALL` for customer-initiated calls but `TRANSFER` for an incoming Canton transfer offer. **No `cantonDetails` at all means the transaction is not a Canton item.**  The service sets exactly one of `offerResponse`, `call` or `settlement`. That is a guarantee about what is sent, NOT a constraint this schema enforces: the three are declared as independent optional properties on purpose, so that a response carrying a block a client does not yet know about — or a row written before a block type existed — still validates. Response schemas here stay additive. Read the block you recognise; do not reject a payload for the shape of the others.  Every block carries `version`, stamped when the transaction is created and never changed — a transaction written today keeps its shape, so `version` is how you know which shape you are reading.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offerResponse** | [**CantonOfferResponseDetails**](CantonOfferResponseDetails.md) |  |  [optional] |
|**call** | [**CantonCallDetails**](CantonCallDetails.md) |  |  [optional] |
|**settlement** | [**CantonSettlementDetails**](CantonSettlementDetails.md) |  |  [optional] |



