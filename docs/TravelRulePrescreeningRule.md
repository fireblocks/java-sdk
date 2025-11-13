

# TravelRulePrescreeningRule

Matched prescreening rule details. Prescreening rules are evaluated before the main screening to determine if screening is necessary or should be bypassed. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bypassReason** | **String** | Reason for bypass if prescreening rule triggered a bypass |  [optional] |
|**sourceType** | **TransferPeerTypeEnum** |  |  [optional] |
|**sourceSubType** | **TransferPeerSubTypeEnum** |  |  [optional] |
|**destType** | **TransferPeerTypeEnum** |  |  [optional] |
|**destSubType** | **TransferPeerSubTypeEnum** |  |  [optional] |
|**transferPeerType** | **TransferPeerTypeEnum** |  |  [optional] |
|**transferPeerSubType** | **TransferPeerSubTypeEnum** |  |  [optional] |
|**destAddress** | **String** | Destination address |  [optional] |
|**sourceId** | **String** | Source ID |  [optional] |
|**destId** | **String** | Destination ID |  [optional] |
|**asset** | **String** | Asset identifier |  [optional] |
|**baseAsset** | **String** | Base asset |  [optional] |
|**amount** | **BigDecimal** | Amount |  [optional] |
|**amountUSD** | **BigDecimal** | Amount in USD |  [optional] |
|**networkProtocol** | **String** | Network protocol |  [optional] |
|**operation** | **TransactionOperationEnum** |  |  [optional] |
|**action** | **TravelRuleActionEnum** |  |  [optional] |



