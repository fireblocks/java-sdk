

# EmbeddedWalletAddressDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | accountName |  |
|**accountId** | **String** | accountId |  |
|**asset** | **String** | asset |  |
|**address** | **String** | address |  |
|**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) | addressType |  |
|**addressDescription** | **String** | addressDescription |  |
|**tag** | **String** | tag |  |
|**addressIndex** | **BigDecimal** | addressIndex |  [optional] |
|**change** | **BigDecimal** | change |  [optional] |
|**coinType** | **BigDecimal** | Unique identifier of an asset (0 for BTC, 60 for ETH, etc.) |  [optional] |
|**customerRefId** | **String** | customerRefId |  [optional] |
|**addressFormat** | **String** | addressFormat |  [optional] |
|**legacyAddress** | **String** | legacyAddress |  [optional] |
|**paymentAddress** | **String** | paymentAddress |  [optional] |
|**userDefined** | **Boolean** | userDefined |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | state |  [optional] |



## Enum: AddressTypeEnum

| Name | Value |
|---- | -----|
| PERMANENT | &quot;PERMANENT&quot; |
| CHANGE | &quot;CHANGE&quot; |
| DEFAULT | &quot;DEFAULT&quot; |
| ADDRESS | &quot;ADDRESS&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING_ACTIVATION | &quot;PENDING_ACTIVATION&quot; |
| ACTIVATION_FAILED | &quot;ACTIVATION_FAILED&quot; |
| READY | &quot;READY&quot; |



