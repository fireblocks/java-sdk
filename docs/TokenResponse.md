

# TokenResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Fireblocks NFT asset id |  |
|**tokenId** | **String** | Token id within the contract/collection |  |
|**standard** | **String** | ERC721 / ERC1155 |  |
|**metadataURI** | **String** | URL of the original token JSON metadata |  [optional] |
|**cachedMetadataURI** | **String** | URL of the cached token JSON metadata |  [optional] |
|**media** | [**List&lt;MediaEntityResponse&gt;**](MediaEntityResponse.md) | Media items extracted from metadata JSON |  [optional] |
|**spam** | [**SpamTokenResponse**](SpamTokenResponse.md) |  |  [optional] |
|**collection** | [**TokenCollectionResponse**](TokenCollectionResponse.md) |  |  [optional] |
|**blockchainDescriptor** | [**BlockchainDescriptorEnum**](#BlockchainDescriptorEnum) |  |  |
|**description** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |



## Enum: BlockchainDescriptorEnum

| Name | Value |
|---- | -----|
| ETH | &quot;ETH&quot; |
| ETH_TEST3 | &quot;ETH_TEST3&quot; |
| ETH_TEST5 | &quot;ETH_TEST5&quot; |
| POLYGON | &quot;POLYGON&quot; |
| POLYGON_TEST_MUMBAI | &quot;POLYGON_TEST_MUMBAI&quot; |
| XTZ | &quot;XTZ&quot; |
| XTZ_TEST | &quot;XTZ_TEST&quot; |
| BASECHAIN_ETH | &quot;BASECHAIN_ETH&quot; |



