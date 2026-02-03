

# TRLinkAssessTravelRuleRequest

Request to assess whether Travel Rule compliance is required for a transaction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**txId** | **UUID** | Fireblocks transaction ID (optional) - RECOMMENDED for inbound transactions |  [optional] |
|**amount** | **String** | Transaction amount (required when txId not provided) |  [optional] |
|**amountUSD** | **String** | Transaction amount in USD (optional) |  [optional] |
|**destination** | [**TRLinkDestinationTransferPeerPath**](TRLinkDestinationTransferPeerPath.md) |  |  [optional] |
|**destAddress** | **String** | Destination address (optional) |  [optional] |
|**destTag** | **String** | Destination tag (optional) |  [optional] |
|**source** | [**TRLinkSourceTransferPeerPath**](TRLinkSourceTransferPeerPath.md) |  |  [optional] |
|**srcAddress** | **String** | Source address (optional) |  [optional] |
|**assetId** | **String** | Asset identifier (e.g., ETH, BTC, USDC) |  [optional] |
|**direction** | **TRLinkTransactionDirection** |  |  [optional] |
|**txHash** | **String** | Transaction hash (optional) |  [optional] |
|**originatorVaspId** | **String** | Originator VASP identifier - required for inbound transactions |  [optional] |
|**beneficiaryVaspId** | **String** | Beneficiary VASP identifier - required for outbound transactions |  [optional] |



