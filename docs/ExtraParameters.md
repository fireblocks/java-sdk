

# ExtraParameters

Additional protocol / operation specific key-value parameters:  For UTXO-based blockchain input selection, add the key `inputsSelection` with the value set to the [input selection structure.](https://developers.fireblocks.com/reference/transaction-objects#inputsselection) The inputs can be retrieved from the [Retrieve Unspent Inputs endpoint.](https://developers.fireblocks.com/reference/get_vault-accounts-vaultaccountid-assetid-unspent-inputs)  For `RAW` operations, add the key `rawMessageData` with the value set to the [raw message data structure.](https://developers.fireblocks.com/reference/raw-signing-objects#rawmessagedata)  For `CONTRACT_CALL` operations, add the key `contractCallData` with the value set to the Ethereum smart contract Application Binary Interface (ABI) payload. The Fireblocks [development libraries](https://developers.fireblocks.com/docs/ethereum-development#convenience-libraries) are recommended for building contract call transactions. For **exchange compliance (e.g., Binance) and Travel Rule purposes**, include the key `piiData` containing a **custom JSON structure** with Personally Identifiable Information (PII) relevant to the transaction. This data must be fully **encrypted by the sender** before being submitted to the Fireblocks API. The recommended encryption method is **hybrid encryption** using AES-256-GCM for the payload and RSA-OAEP for key exchange, with the recipient exchange's public key. [development libraries](https://developers.fireblocks.com/docs/a-developers-guide-to-constructing-encrypted-pii-messages-for-binance-via-fireblocks)  **Note:** `rawMessageData`, `contractCallData`, and `inputsSelection` cannot be used together in the same call. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodeControls** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**rawMessageData** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**contractCallData** | **String** |  |  [optional] |
|**programCallData** | **String** |  |  [optional] |
|**inputsSelection** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**allowBaseAssetAddress** | **Boolean** |  |  [optional] |
|**piiData** | **Map&lt;String, Object&gt;** |  |  [optional] |



