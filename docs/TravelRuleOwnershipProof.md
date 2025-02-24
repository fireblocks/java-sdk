

# TravelRuleOwnershipProof

Ownership proof related to the originator of the transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of ownership proof. Example values: - &#x60;eip-191&#x60;: Ethereum signature proof - &#x60;eip-712&#x60;: Ethereum typed data signature proof - &#x60;bip-137&#x60;: Bitcoin signature proof - &#x60;microtransfer&#x60;: Microtransaction (Satoshi test) - &#x60;screenshot&#x60;: Uploaded screenshot of the wallet - &#x60;self-declaration&#x60;: Checkbox attestation of ownership |  [optional] |
|**proof** | **String** | The cryptographic signature, transaction hash, or other proof depending on the type. Examples: - For &#x60;eip-191&#x60;: &#x60;0x3dd4a17a...ce4a2bcd1b&#x60; - For &#x60;microtransfer&#x60;: The transaction hash &#x60;H3V8GXBy39Dz...tr3TSTkY&#x3D;&#x60; |  [optional] |
|**attestation** | **String** | A human-readable statement of wallet ownership. Required for signature proofs and self-declarations. Examples: - &#x60;I certify that ETH account 0x896B...0b9b belongs to me.&#x60; - &#x60;I hereby declare that the blockchain address 0xa437bEed902AF9338B7DEB23848e195d85019510 is under my control.&#x60; |  [optional] |
|**address** | **String** | The wallet address being verified. Examples: - For Ethereum: &#x60;0x896B...0b9b&#x60; - For Bitcoin: &#x60;1442...dxhsQ&#x60; |  [optional] |
|**walletProvider** | **String** | The wallet provider or method used for verification. Examples: - For Metamask: &#x60;Metamask&#x60; - For manual signature: &#x60;manual&#x60; |  [optional] |
|**url** | **String** | The URL for the uploaded screenshot (for &#x60;screenshot&#x60; proof types only). Example: &#x60;https://example.com/uploaded_image.png&#x60; |  [optional] |
|**confirmed** | **Boolean** | Whether the user confirmed ownership of the wallet (for &#x60;self-declaration&#x60; proofs). Example: &#x60;true&#x60; |  [optional] |



