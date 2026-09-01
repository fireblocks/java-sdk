

# TRLinkMissingTrmDecision

Interface for reporting missing TRM screening decisions in ITRLinkResult

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Reference to TrlinkCustomer.id |  [optional] |
|**direction** | **TransactionDirection** |  |  [optional] |
|**sourceType** | **TransferPeerTypeEnum** |  |  [optional] |
|**sourceSubType** | **TransferPeerSubTypeEnum** |  |  [optional] |
|**sourceAddress** | **String** | Source address |  [optional] |
|**destType** | **TransferPeerTypeEnum** |  |  [optional] |
|**destSubType** | **TransferPeerSubTypeEnum** |  |  [optional] |
|**destAddress** | **String** | Destination address |  [optional] |
|**sourceId** | **String** | Source ID |  [optional] |
|**destId** | **String** | Destination ID |  [optional] |
|**asset** | **String** | Asset symbol |  [optional] |
|**baseAsset** | **String** | Base asset symbol |  [optional] |
|**amount** | [**TRLinkAmount**](TRLinkAmount.md) |  |  [optional] |
|**networkProtocol** | **String** | Network protocol |  [optional] |
|**operation** | **TransactionOperationEnum** |  |  [optional] |
|**description** | **String** | Rule description |  [optional] |
|**isDefault** | **Boolean** | Whether this is a default rule |  [optional] |
|**validBefore** | **BigDecimal** | Rule expires once this many seconds have elapsed since the wait/screening step started |  [optional] |
|**validAfter** | **BigDecimal** | Rule applies only after this many seconds have elapsed since the wait/screening step started |  [optional] |
|**action** | **TRLinkMissingTrmAction** |  |  |
|**source** | **String** | TRLink missing TRM source |  |
|**timestamp** | **OffsetDateTime** | Timestamp of the decision |  [optional] |
|**reason** | **String** | Reason for the decision |  [optional] |



