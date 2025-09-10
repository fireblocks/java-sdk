

# RegisterNewAssetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockchainId** | **String** | Native asset ID of the blockchain |  |
|**address** | **String** | Asset address.  - For EVM based chains this should be the token contract address. - For Stellar (XLM) this should be the issuer address. - For Algorand (ALGO) this should be the asset ID. - For TRON (TRX) this should be the token contract address. - For NEAR this will be the token address.  |  |
|**symbol** | **String** | Required for Stellar only, asset code is expected. |  [optional] |



