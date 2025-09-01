

# AddAssetToExternalWalletRequest

Request schema for adding an asset to an external wallet

## oneOf schemas
* [AdditionalInfoRequest](AdditionalInfoRequest.md)
* [BasicAddressRequest](BasicAddressRequest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AddAssetToExternalWalletRequest;
import com.fireblocks.sdk.model.AdditionalInfoRequest;
import com.fireblocks.sdk.model.BasicAddressRequest;

public class Example {
    public static void main(String[] args) {
        AddAssetToExternalWalletRequest exampleAddAssetToExternalWalletRequest = new AddAssetToExternalWalletRequest();

        // create a new AdditionalInfoRequest
        AdditionalInfoRequest exampleAdditionalInfoRequest = new AdditionalInfoRequest();
        // set AddAssetToExternalWalletRequest to AdditionalInfoRequest
        exampleAddAssetToExternalWalletRequest.setActualInstance(exampleAdditionalInfoRequest);
        // to get back the AdditionalInfoRequest set earlier
        AdditionalInfoRequest testAdditionalInfoRequest = (AdditionalInfoRequest) exampleAddAssetToExternalWalletRequest.getActualInstance();

        // create a new BasicAddressRequest
        BasicAddressRequest exampleBasicAddressRequest = new BasicAddressRequest();
        // set AddAssetToExternalWalletRequest to BasicAddressRequest
        exampleAddAssetToExternalWalletRequest.setActualInstance(exampleBasicAddressRequest);
        // to get back the BasicAddressRequest set earlier
        BasicAddressRequest testBasicAddressRequest = (BasicAddressRequest) exampleAddAssetToExternalWalletRequest.getActualInstance();
    }
}
```


