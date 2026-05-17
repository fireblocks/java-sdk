

# UtxoSelectionParams

For UTXO-based blockchains only. Controls which UTXOs are used for automatic selection. Cannot be used together with extraParameters.inputsSelection. This feature is currently in beta and might be subject to changes. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selectionStrategy** | [**SelectionStrategyEnum**](#SelectionStrategyEnum) | Optional override for the UTXO selection strategy configured at the vault/tenant level.  |  [optional] |
|**filters** | [**UtxoSelectionFilters**](UtxoSelectionFilters.md) |  |  [optional] |
|**inputSelection** | [**UtxoInputSelection**](UtxoInputSelection.md) |  |  [optional] |



## Enum: SelectionStrategyEnum

| Name | Value |
|---- | -----|
| AMOUNT_ASC | &quot;AMOUNT_ASC&quot; |
| AMOUNT_DESC | &quot;AMOUNT_DESC&quot; |



