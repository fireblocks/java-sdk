

# UtxoSelectionFilters

Narrow the UTXO candidate pool. All specified filters are AND-ed together. This feature is currently in beta and might be subject to changes. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**includeAllLabels** | **List&lt;String&gt;** | Only include UTXOs that have ALL of these labels. |  [optional] |
|**includeAnyLabels** | **List&lt;String&gt;** | Only include UTXOs that have at least one of these labels. |  [optional] |
|**excludeAnyLabels** | **List&lt;String&gt;** | Exclude UTXOs that have any of these labels. |  [optional] |
|**address** | **String** | Only include UTXOs from this specific address. |  [optional] |
|**minAmount** | **String** | Minimum UTXO amount in the asset&#39;s base unit (e.g., BTC). |  [optional] |
|**maxAmount** | **String** | Maximum UTXO amount in the asset&#39;s base unit (e.g., BTC). |  [optional] |



