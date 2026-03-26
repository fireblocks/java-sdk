

# ManifestOrderInfo

Defines requirements for the POST /orders endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settlementTypes** | **List&lt;SettlementTypeEnum&gt;** | Supported settlement types when creating an order. If present - settlement is required. If absent - no need to provide settlement.  |  [optional] |
|**executionTypes** | **List&lt;ExecutionRequestDetailsType&gt;** | Supported execution types when creating an order. |  |



