

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
|**spam** | [**SpamTokenResponse**](SpamTokenResponse.md) | Token spam status |  [optional] |
|**collection** | [**TokenCollectionResponse**](TokenCollectionResponse.md) | Parent collection information |  [optional] |
|**blockchainDescriptor** | [**BlockchainDescriptorEnum**](#BlockchainDescriptorEnum) |  |  |
|**description** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |



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
| BASECHAIN_ETH_TEST5 | &quot;BASECHAIN_ETH_TEST5&quot; |
| ETHERLINK | &quot;ETHERLINK&quot; |
| ETHERLINK_TEST | &quot;ETHERLINK_TEST&quot; |
| MANTLE | &quot;MANTLE&quot; |
| MANTLE_TEST | &quot;MANTLE_TEST&quot; |
| GUN_GUNZILLA_TEST | &quot;GUN_GUNZILLA_TEST&quot; |
| ETH_SONEIUM | &quot;ETH_SONEIUM&quot; |
| SONEIUM_MINATO_TEST | &quot;SONEIUM_MINATO_TEST&quot; |
| IOTX_IOTEX | &quot;IOTX_IOTEX&quot; |



