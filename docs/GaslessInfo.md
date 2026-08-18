

# GaslessInfo

Relay (meta-transaction) details. Returned only for meta-transactions (`isMetaTx` is `true`). For meta-transactions the deprecated top-level `fee` field is omitted; use `feeInfo` instead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isMetaTx** | **Boolean** | Indicates the transaction is a meta-transaction (gas paid by a relay tenant). |  [optional] |
|**relayTenantId** | **String** | The tenant ID of the relay that sponsors the gas for the meta-transaction. |  [optional] |
|**relayTenantName** | **String** | The tenant name of the relay that sponsors the gas for the meta-transaction. |  [optional] |
|**relayVaultAccountId** | **String** | The vault account ID of the relay that sponsors the gas for the meta-transaction. |  [optional] |



