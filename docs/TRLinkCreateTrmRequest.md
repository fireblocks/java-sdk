

# TRLinkCreateTrmRequest

Request to create a Travel Rule Message with IVMS101 PII data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetId** | **String** | Asset identifier (required when txId not provided) |  [optional] |
|**amount** | **String** | Transaction amount (required when txId not provided) |  [optional] |
|**amountUSD** | **String** | Amount in USD (optional) |  [optional] |
|**source** | [**TRLinkSourceTransferPeerPath**](TRLinkSourceTransferPeerPath.md) |  |  [optional] |
|**srcAddress** | **String** | Source address (optional) |  [optional] |
|**destination** | [**TRLinkDestinationTransferPeerPath**](TRLinkDestinationTransferPeerPath.md) |  |  [optional] |
|**destAddress** | **String** | Destination address (optional) |  [optional] |
|**destTag** | **String** | Destination tag (optional) |  [optional] |
|**txId** | **UUID** | Fireblocks transaction ID (optional) - RECOMMENDED for inbound transactions |  [optional] |
|**txHash** | **String** | Transaction hash (optional) |  [optional] |
|**direction** | **TRLinkTransactionDirection** |  |  [optional] |
|**originatorVaspId** | **String** | Originator VASP identifier - required for inbound transactions |  [optional] |
|**beneficiaryVaspId** | **String** | Beneficiary VASP identifier - required for outbound transactions |  [optional] |
|**ivms101** | [**TRLinkIvms**](TRLinkIvms.md) |  |  |



