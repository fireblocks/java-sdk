

# CreateTempoTransferRequest

Request body for creating a Tempo transfer transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**note** | **String** | A custom note that can be associated with the transaction. |  [optional] |
|**externalTxId** | **String** | Unique ID provided by the customer, used to identify the transaction. |  [optional] |
|**feeCurrency** | **String** | The asset ID used to pay the transaction fee, if different from assetId. Maps to FeeParams.feeCurrency. Must be a valid fee token for &#x60;assetId&#x60; (e.g. a TIP-20 gas token for the base asset); an invalid pairing surfaces as 400 INVALID_FEE_CURRENCY_PARAM. |  [optional] |
|**assetId** | **String** | The ID of the asset to transfer. Must be a non-deprecated asset supported on a Tempo-eligible blockchain; an unknown, deprecated, or unsupported asset surfaces as 400 UNSUPPORTED_ASSET. |  |
|**source** | [**TempoTransferSource**](TempoTransferSource.md) |  |  |
|**destination** | [**TempoTransferDestination**](TempoTransferDestination.md) |  |  [optional] |
|**amount** | **String** | The amount to transfer, as a numeric string. Required when &#x60;destination&#x60; is set; must be omitted when &#x60;destinations&#x60; is set (each entry carries its own amount instead). |  [optional] |
|**treatAsGrossAmount** | **Boolean** | If true, the specified amount includes the fee (fee is deducted from amount). |  [optional] |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | The fee level to use, mutually exclusive with an explicit custom fee. |  [optional] |
|**travelRuleMessage** | **String** | Beta. An opaque travel-rule payload. |  [optional] |
|**travelRuleMessageId** | **String** | Beta. An identifier of a TravelRule message, already sent to the TravelRule provider. |  [optional] |
|**useGasless** | **Boolean** | Opt in to fee-payer-sponsored (gasless) transfer. |  [optional] |
|**configurations** | [**TransactionConfigurations**](TransactionConfigurations.md) |  |  [optional] |
|**maxFeePerGas** | **String** | The maximum total fee per gas the sender is willing to pay, in wei. |  [optional] |
|**maxPriorityFeePerGas** | **String** | The maximum priority fee (tip) per gas the sender is willing to pay, in wei. |  [optional] |
|**destinations** | [**List&lt;TempoTransferDestinationItem&gt;**](TempoTransferDestinationItem.md) | Multiple destinations for a single transfer. Mutually exclusive with &#x60;destination&#x60;. |  [optional] |
|**failOnLowFee** | **Boolean** | Beta. If true, fail the transaction rather than sending it with a low fee. |  [optional] |
|**gasLimit** | **String** | The gas limit for the transaction. |  [optional] |
|**replaceTxByHash** | **String** | Beta. The hash of the EVM transaction to replace (RBF). |  [optional] |
|**feePayerAccountId** | **String** | Vault account ID of the fee payer sponsoring this transfer. |  [optional] |
|**nonceStrategy** | [**NonceStrategyEnum**](#NonceStrategyEnum) | Tempo&#39;s 2-dimensional nonce strategy: &#x60;SEQUENTIAL&#x60; runs under a single nonce lane (lane 0); &#x60;USER_DEFINED_LANE&#x60; runs in parallel under a specified lane (1–16), and requires &#x60;nonceLane&#x60;; &#x60;EXPIRING&#x60; marks the transaction with an expiry of up to 5 minutes (Tempo-defined) and does not use &#x60;nonceLane&#x60;. |  [optional] |
|**nonceLane** | **Integer** | The nonce lane to use, 1–16. Required and only meaningful when nonceStrategy is USER_DEFINED_LANE; not used for SEQUENTIAL or EXPIRING. |  [optional] |
|**memo** | **String** | Beta. Tempo TIP-20 memo (max 32 bytes). |  [optional] |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



## Enum: NonceStrategyEnum

| Name | Value |
|---- | -----|
| SEQUENTIAL | &quot;SEQUENTIAL&quot; |
| USER_DEFINED_LANE | &quot;USER_DEFINED_LANE&quot; |
| EXPIRING | &quot;EXPIRING&quot; |



