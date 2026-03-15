

# PixAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountHolder** | [**AccountHolderDetails**](AccountHolderDetails.md) |  |  |
|**pixKey** | **String** |  |  |
|**keyType** | [**KeyTypeEnum**](#KeyTypeEnum) |  |  |
|**bankName** | **String** |  |  [optional] |
|**bankCode** | **String** |  |  [optional] |
|**qrCode** | **String** | The QR code to be used for the transfer |  [optional] |
|**expirationDate** | **String** | The expiration date of the QR code |  [optional] |



## Enum: KeyTypeEnum

| Name | Value |
|---- | -----|
| CPF | &quot;CPF&quot; |
| CNPJ | &quot;CNPJ&quot; |
| EMAIL | &quot;EMAIL&quot; |
| PHONE | &quot;PHONE&quot; |
| RANDOM | &quot;RANDOM&quot; |



