

# TokenOwnershipResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Fireblocks NFT asset id |  |
|**tokenId** | **String** | Token id within the contract/collection |  |
|**standard** | **String** | ERC721 / ERC1155 |  |
|**metadataURI** | **String** | URL of the original token JSON metadata |  [optional] |
|**cachedMetadataURI** | **String** | URL of the cached token JSON metadata |  [optional] |
|**media** | [**List&lt;MediaEntityResponse&gt;**](MediaEntityResponse.md) | Media items extracted from metadata JSON |  [optional] |
|**spam** | [**SpamOwnershipResponse**](SpamOwnershipResponse.md) | Owned Token&#39;s Spam status |  [optional] |
|**collection** | [**TokenCollectionResponse**](TokenCollectionResponse.md) | Parent collection information |  [optional] |
|**balance** | **String** |  |  |
|**vaultAccountId** | **String** |  |  [optional] |
|**ownershipStartTime** | **BigDecimal** |  |  |
|**ownershipLastUpdateTime** | **BigDecimal** |  |  |
|**blockchainDescriptor** | [**BlockchainDescriptorEnum**](#BlockchainDescriptorEnum) |  |  |
|**description** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**ncwId** | **String** | Ownership Non-Custodial Wallet ID |  [optional] |
|**ncwAccountId** | **String** | Ownership Non-Custodial Wallet&#39;s account ID |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Owned Token&#39;s status |  |



## Enum: BlockchainDescriptorEnum

| Name | Value |
|---- | -----|
| ETH | &quot;ETH&quot; |
| ETH_TEST3 | &quot;ETH_TEST3&quot; |
| ETH_TEST5 | &quot;ETH_TEST5&quot; |
| ETH_TEST6 | &quot;ETH_TEST6&quot; |
| POLYGON | &quot;POLYGON&quot; |
| POLYGON_TEST_MUMBAI | &quot;POLYGON_TEST_MUMBAI&quot; |
| AMOY_POLYGON_TEST | &quot;AMOY_POLYGON_TEST&quot; |
| XTZ | &quot;XTZ&quot; |
| XTZ_TEST | &quot;XTZ_TEST&quot; |
| BASECHAIN_ETH | &quot;BASECHAIN_ETH&quot; |
| BASECHAIN_ETH_TEST3 | &quot;BASECHAIN_ETH_TEST3&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| LISTED | &quot;LISTED&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |



