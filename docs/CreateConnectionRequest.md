

# CreateConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **BigDecimal** | The ID of the vault to connect to the Web3 connection. |  |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | The default fee level. Valid values are &#x60;MEDIUM&#x60; and &#x60;HIGH&#x60;. |  |
|**uri** | **String** | The WalletConnect uri provided by the dapp. |  |
|**chainIds** | **List&lt;String&gt;** | The ID of the blockchain network used in the Web3 connection. |  |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



