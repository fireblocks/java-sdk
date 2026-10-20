

# TrustProofOfAddressRequest

Request to create a cryptographic proof of address ownership for TRUST network compliance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The ID of the vault account. |  |
|**asset** | **String** | The asset identifier for which proof of address is being created. |  |
|**prefix** | **String** | The prefix to be used for signing messages. |  |
|**trustUuid** | **UUID** | A unique identifier (UUID) obtained from TRUST (CreateAddressOwnership) |  |
|**address** | **String** | Optional non-default (derived) address of the vault account to prove. Supported for UTXO assets only (&#x60;BTC&#x60;, &#x60;BTC_TEST&#x60;). The address must belong to the vault account for the given asset. Both SegWit and Legacy address forms are accepted. When omitted, the proof is created for the default (index 0) address of the vault account.  |  [optional] |



