

# TRLinkMissingTrmRule2

Rule for handling transactions when TRM screening data is missing or unavailable

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Customer identifier |  [optional] |
|**direction** | **TRLinkTransactionDirection** |  |  [optional] |
|**sourceType** | **String** | Source entity type |  [optional] |
|**sourceSubType** | **String** | Source entity subtype |  [optional] |
|**sourceAddress** | **String** | Source blockchain address |  [optional] |
|**destType** | **String** | Destination entity type |  [optional] |
|**destSubType** | **String** | Destination entity subtype |  [optional] |
|**destAddress** | **String** | Destination blockchain address |  [optional] |
|**sourceId** | **String** | Source identifier |  [optional] |
|**destId** | **String** | Destination identifier |  [optional] |
|**asset** | **String** | Asset or cryptocurrency type |  [optional] |
|**baseAsset** | **String** | Base asset for derivatives |  [optional] |
|**amount** | [**TRLinkAmount2**](TRLinkAmount2.md) |  |  [optional] |
|**networkProtocol** | **String** | Network protocol identifier |  [optional] |
|**operation** | **String** | Operation type |  [optional] |
|**description** | **String** | Rule description |  [optional] |
|**isDefault** | **Boolean** | Whether this is a default rule |  [optional] |
|**validBefore** | **Long** | Rule is valid before this timestamp (milliseconds) |  [optional] |
|**validAfter** | **Long** | Rule is valid after this timestamp (milliseconds) |  [optional] |
|**action** | **TRLinkMissingTrmAction2** |  |  |



