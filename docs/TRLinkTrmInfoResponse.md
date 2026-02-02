

# TRLinkTrmInfoResponse

Travel Rule Message information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | TRM message ID |  |
|**version** | **String** | TRM version |  [optional] |
|**status** | **TRLinkTrmStatus** |  |  [optional] |
|**reason** | **String** | Human readable reason for the current status |  [optional] |
|**externalId** | **String** | External ID (e.g., Fireblocks ID) |  |
|**asset** | [**TRLinkAsset**](TRLinkAsset.md) |  |  |
|**amount** | **String** | Transaction amount in asset units |  |
|**fiatValue** | [**TRLinkFiatValue**](TRLinkFiatValue.md) |  |  [optional] |
|**direction** | **TRLinkTrmDirection** |  |  |
|**originatorVaspId** | **String** | ID of the originator VASP |  [optional] |
|**beneficiaryVaspId** | **String** | ID of the beneficiary VASP |  [optional] |
|**txnInfo** | [**TRLinkTxnInfo**](TRLinkTxnInfo.md) |  |  |
|**ivms101** | [**TRLinkIvmsResponse**](TRLinkIvmsResponse.md) |  |  |
|**providerData** | [**TRLinkProviderData**](TRLinkProviderData.md) |  |  [optional] |



