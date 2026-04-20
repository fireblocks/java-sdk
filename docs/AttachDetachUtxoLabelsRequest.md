

# AttachDetachUtxoLabelsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**utxoIdentifiers** | [**List&lt;UtxoIdentifier&gt;**](UtxoIdentifier.md) | List of UTXO identifiers to apply label changes to |  |
|**labelsToAttach** | **List&lt;String&gt;** | Labels to attach to the specified UTXOs. At least one of labelsToAttach or labelsToDetach must be provided. |  [optional] |
|**labelsToDetach** | **List&lt;String&gt;** | Labels to detach from the specified UTXOs. At least one of labelsToAttach or labelsToDetach must be provided. |  [optional] |



