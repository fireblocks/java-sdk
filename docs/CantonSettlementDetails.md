

# CantonSettlementDetails

The credit side of a delivery-versus-payment: a venue settled an allocation. Written once, at creation — the transaction is already complete when it appears.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** | The shape of this block. Stamped at creation and never changed, so a reader always knows which version it is holding. |  [optional] |
|**domain** | **CantonDomainEnum** |  |  [optional] |
|**type** | **String** | The settlement type. |  [optional] |
|**originalTransactionId** | **String** | The allocation this receipt settles. |  [optional] |



