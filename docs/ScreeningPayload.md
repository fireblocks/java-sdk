

# ScreeningPayload

The subject of the screening. Which fields are required depends on the operation and on the connectors configured on the workflow's step.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockchain** | **String** | The blockchain network of the asset being screened. |  [optional] |
|**asset** | **String** | The asset identifier being screened. |  [optional] |
|**assetAmount** | **String** | The amount of the asset involved in the transaction, as a string. |  [optional] |
|**usdValue** | **String** | The USD value of the transaction amount, as a string. |  [optional] |
|**customerRefId** | **String** | Customer-provided reference identifier for tracking. |  [optional] |
|**externalId** | **String** | External identifier for the screening (provider-specific). |  [optional] |
|**address** | **String** | The blockchain address to screen. Used for the &#x60;ADDRESS_SCREENING&#x60; operation. |  [optional] |
|**direction** | **TransferDirectionEnum** |  |  [optional] |
|**sourceAddress** | **List&lt;String&gt;** | The source blockchain address(es) of the transaction. |  [optional] |
|**destinationAddress** | **List&lt;String&gt;** | The destination blockchain address(es) of the transaction. |  [optional] |
|**txHash** | **String** | The transaction hash on the blockchain. |  [optional] |



