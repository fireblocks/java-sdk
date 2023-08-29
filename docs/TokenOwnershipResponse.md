

# TokenOwnershipResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Fireblocks NFT asset id |  |
|**tokenId** | **String** | Token id within the contract/collection |  |
|**standard** | **String** | ERC721 / ERC1155 |  |
|**metadataURI** | **String** | URL of the original token JSON metadata |  [optional] |
|**cachedMetadataURI** | **String** | URL of the cached token JSON metadata |  [optional] |
|**media** | [**List&lt;MediaEntityResponse&gt;**](MediaEntityResponse.md) | Media items extracted from metadata JSON |  |
|**collection** | [**TokenResponseCollection**](TokenResponseCollection.md) |  |  [optional] |
|**balance** | **String** |  |  |
|**vaultAccountId** | **String** |  |  |
|**ownershipStartTime** | **BigDecimal** |  |  |
|**ownershipLastUpdateTime** | **BigDecimal** |  |  |
|**blockchainDescriptor** | [**BlockchainDescriptorEnum**](#BlockchainDescriptorEnum) |  |  |
|**description** | **String** |  |  |
|**name** | **String** |  |  |



## Enum: BlockchainDescriptorEnum

| Name | Value |
|---- | -----|
| ETH | &quot;ETH&quot; |
| ETH_TEST3 | &quot;ETH_TEST3&quot; |
| POLYGON | &quot;POLYGON&quot; |
| POLYGON_TEST_MUMBAI | &quot;POLYGON_TEST_MUMBAI&quot; |



