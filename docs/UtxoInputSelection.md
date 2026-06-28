

# UtxoInputSelection

Explicitly control which UTXOs to include or exclude. This feature is currently in beta and might be subject to changes. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inputsToSpend** | [**List&lt;UtxoInput&gt;**](UtxoInput.md) | Force-include specific UTXOs by txHash and index. |  [optional] |
|**inputsToExclude** | [**List&lt;UtxoInput&gt;**](UtxoInput.md) | Exclude specific UTXOs from selection. |  [optional] |
|**fillFeeForSelectedInputs** | **Boolean** | When true and inputsToSpend is provided, automatically add more UTXOs to cover the transaction fee. Requires inputsToSpend.  |  [optional] |



