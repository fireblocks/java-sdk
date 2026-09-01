

# ScreeningTRLinkMissingTrmRule

TRLink missing TRM rule definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Reference to TRLinkCustomer.id |  [optional] |
|**direction** | **TravelRuleDirectionEnum** |  |  [optional] |
|**sourceType** | **TransferPeerTypeEnum2** |  |  [optional] |
|**sourceSubType** | **TransferPeerSubTypeEnum** |  |  [optional] |
|**sourceAddress** | **String** | Source address |  [optional] |
|**destType** | **TransferPeerTypeEnum2** |  |  [optional] |
|**destSubType** | **TransferPeerSubTypeEnum** |  |  [optional] |
|**destAddress** | **String** | Destination address |  [optional] |
|**sourceId** | **String** | Source ID |  [optional] |
|**destId** | **String** | Destination ID |  [optional] |
|**asset** | **String** | Asset symbol |  [optional] |
|**baseAsset** | **String** | Base asset symbol |  [optional] |
|**amount** | [**ScreeningTRLinkAmount**](ScreeningTRLinkAmount.md) |  |  [optional] |
|**networkProtocol** | **String** | Network protocol |  [optional] |
|**operation** | **TransactionOperationEnum** |  |  [optional] |
|**description** | **String** | Rule description |  [optional] |
|**isDefault** | **Boolean** | Whether this is a default rule |  [optional] |
|**validBefore** | **BigDecimal** | Rule expires once this many seconds have elapsed since the wait/screening step started |  [optional] |
|**validAfter** | **BigDecimal** | Rule applies only after this many seconds have elapsed since the wait/screening step started |  [optional] |
|**action** | **TRLinkMissingTrmActionEnum** |  |  |



