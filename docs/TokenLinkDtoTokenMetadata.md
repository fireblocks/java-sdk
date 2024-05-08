

# TokenLinkDtoTokenMetadata

The token's metadata

## oneOf schemas
* [AssetMetadataDto](AssetMetadataDto.md)
* [CollectionMetadataDto](CollectionMetadataDto.md)
* [ContractMetadataDto](ContractMetadataDto.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TokenLinkDtoTokenMetadata;
import com.fireblocks.sdk.model.AssetMetadataDto;
import com.fireblocks.sdk.model.CollectionMetadataDto;
import com.fireblocks.sdk.model.ContractMetadataDto;

public class Example {
    public static void main(String[] args) {
        TokenLinkDtoTokenMetadata exampleTokenLinkDtoTokenMetadata = new TokenLinkDtoTokenMetadata();

        // create a new AssetMetadataDto
        AssetMetadataDto exampleAssetMetadataDto = new AssetMetadataDto();
        // set TokenLinkDtoTokenMetadata to AssetMetadataDto
        exampleTokenLinkDtoTokenMetadata.setActualInstance(exampleAssetMetadataDto);
        // to get back the AssetMetadataDto set earlier
        AssetMetadataDto testAssetMetadataDto = (AssetMetadataDto) exampleTokenLinkDtoTokenMetadata.getActualInstance();

        // create a new CollectionMetadataDto
        CollectionMetadataDto exampleCollectionMetadataDto = new CollectionMetadataDto();
        // set TokenLinkDtoTokenMetadata to CollectionMetadataDto
        exampleTokenLinkDtoTokenMetadata.setActualInstance(exampleCollectionMetadataDto);
        // to get back the CollectionMetadataDto set earlier
        CollectionMetadataDto testCollectionMetadataDto = (CollectionMetadataDto) exampleTokenLinkDtoTokenMetadata.getActualInstance();

        // create a new ContractMetadataDto
        ContractMetadataDto exampleContractMetadataDto = new ContractMetadataDto();
        // set TokenLinkDtoTokenMetadata to ContractMetadataDto
        exampleTokenLinkDtoTokenMetadata.setActualInstance(exampleContractMetadataDto);
        // to get back the ContractMetadataDto set earlier
        ContractMetadataDto testContractMetadataDto = (ContractMetadataDto) exampleTokenLinkDtoTokenMetadata.getActualInstance();
    }
}
```


