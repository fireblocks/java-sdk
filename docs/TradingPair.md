

# TradingPair

A supported base/quote asset pair for a provider, optionally scoped to a specific connected account, for a given trading side (BUY/SELL, or `BOTH`), with the transfer rails and amount limits that apply to it. `baseAssetId` / `quoteAssetId` may be the wildcard `*`, meaning any asset on `baseChain` / `quoteChain`; such a row is not expanded.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerId** | **String** | The provider that supports this pair. |  |
|**accountId** | **String** | The connected account the pair is scoped to. Absent for direct-access providers, and for provider-level pairs that describe what a provider supports before any account is connected. Its absence therefore does not imply the provider is direct-access. |  [optional] |
|**baseAssetId** | **String** | Fireblocks asset ID of the base asset, or &#x60;*&#x60; for any asset on &#x60;baseChain&#x60;. A &#x60;*&#x60; value always comes with &#x60;baseChain&#x60; set. |  |
|**quoteAssetId** | **String** | Fireblocks asset ID of the quote asset, or &#x60;*&#x60; for any asset on &#x60;quoteChain&#x60;. A &#x60;*&#x60; value always comes with &#x60;quoteChain&#x60; set. |  |
|**baseChain** | **String** | Blockchain &#x60;legacyId&#x60; of the base asset (e.g. &#x60;ETH&#x60;, &#x60;BASECHAIN_ETH&#x60;, &#x60;ETH-AETH&#x60;, &#x60;SOL&#x60;). Set for leaf crypto assets; absent for fiat and virtual assets. |  [optional] |
|**quoteChain** | **String** | Blockchain &#x60;legacyId&#x60; of the quote asset (e.g. &#x60;ETH&#x60;, &#x60;BASECHAIN_ETH&#x60;, &#x60;ETH-AETH&#x60;, &#x60;SOL&#x60;). Set for leaf crypto assets; absent for fiat and virtual assets. |  [optional] |
|**side** | **TradingPairSide** |  |  |
|**tradeClass** | **TradeClass** |  |  |
|**baseAssetRail** | **TransferRail** |  |  [optional] |
|**quoteAssetRail** | **TransferRail** |  |  [optional] |
|**prefunded** | **Boolean** | Whether the provider requires the funds to be prefunded on the provider account before the order can execute. |  [optional] |
|**min** | **String** | Minimum amount of the base asset for this pair/side, as a decimal string. |  [optional] |
|**max** | **String** | Maximum amount of the base asset for this pair/side, as a decimal string. |  [optional] |



