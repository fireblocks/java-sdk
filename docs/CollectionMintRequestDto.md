

# CollectionMintRequestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The id of the vault account that initiates the mint function. |  |
|**to** | **String** | The EVM address to mint to  |  |
|**tokenId** | **String** | The token id, recommended to have numerical format and in sequential order |  |
|**amount** | **String** | For ERC721, amount is optional or should always be 1 and for ERC1155, amount should be 1 or greater |  [optional] |
|**metadataURI** | **String** | URL of metadata uploaded, skip uploading to IPFS if this field is provided with any value |  [optional] |
|**metadata** | [**CollectionTokenMetadataDto**](CollectionTokenMetadataDto.md) | Metadata to upload |  [optional] |



