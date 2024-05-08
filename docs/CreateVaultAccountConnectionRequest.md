

# CreateVaultAccountConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **BigDecimal** | The ID of the vault to connect to the dApp. |  |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | The default fee level. Valid values are &#x60;MEDIUM&#x60; and &#x60;HIGH&#x60;. |  |
|**uri** | **String** | The WalletConnect uri provided by the dapp. |  |
|**chainIds** | **List&lt;String&gt;** | The IDs of the blockchain networks used in the Web3 connection (Currently required in V1 connections only). |  [optional] |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



