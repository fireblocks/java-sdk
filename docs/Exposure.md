

# Exposure

Vault allocation exposure item (Morpho MetaMorpho allocation slice).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Contract address of the exposure token on-chain. |  |
|**amount** | **String** | Human-readable token amount (raw on-chain value scaled by 10^decimals). |  |
|**symbol** | **String** | Human-readable ticker (e.g. USDC). |  [optional] |
|**decimals** | **Integer** | Token decimals used when interpreting on-chain amounts. |  [optional] |
|**assetId** | **String** | Fireblocks legacy asset identifier (e.g. USDC_ETH, PYUSD); only present when resolved via asset-service. |  [optional] |
|**amountUsd** | **String** | USD notional value of the exposure amount. |  [optional] |



