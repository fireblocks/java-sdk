

# MobileMoneyAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountHolder** | [**AccountHolderDetails**](AccountHolderDetails.md) |  |  |
|**mobilePhoneNumber** | **String** | Mobile phone number in E.164 format |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) | Mobile money provider |  |
|**beneficiaryDocumentId** | **String** | Beneficiary document identification (may be required) |  [optional] |
|**beneficiaryRelationship** | **String** | Relationship to beneficiary for AML purposes |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| M_PESA | &quot;m-pesa&quot; |
| AIRTEL | &quot;airtel&quot; |
| MTN | &quot;mtn&quot; |
| TIGO | &quot;tigo&quot; |
| ORANGE | &quot;orange&quot; |



