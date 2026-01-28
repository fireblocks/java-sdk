

# AddAssetToExternalWalletRequest

## oneOf schemas
* [AddAssetToExternalWalletRequestOneOf](AddAssetToExternalWalletRequestOneOf.md)
* [AddAssetToExternalWalletRequestOneOf1](AddAssetToExternalWalletRequestOneOf1.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AddAssetToExternalWalletRequest;
import com.fireblocks.sdk.model.AddAssetToExternalWalletRequestOneOf;
import com.fireblocks.sdk.model.AddAssetToExternalWalletRequestOneOf1;

public class Example {
    public static void main(String[] args) {
        AddAssetToExternalWalletRequest exampleAddAssetToExternalWalletRequest = new AddAssetToExternalWalletRequest();

        // create a new AddAssetToExternalWalletRequestOneOf
        AddAssetToExternalWalletRequestOneOf exampleAddAssetToExternalWalletRequestOneOf = new AddAssetToExternalWalletRequestOneOf();
        // set AddAssetToExternalWalletRequest to AddAssetToExternalWalletRequestOneOf
        exampleAddAssetToExternalWalletRequest.setActualInstance(exampleAddAssetToExternalWalletRequestOneOf);
        // to get back the AddAssetToExternalWalletRequestOneOf set earlier
        AddAssetToExternalWalletRequestOneOf testAddAssetToExternalWalletRequestOneOf = (AddAssetToExternalWalletRequestOneOf) exampleAddAssetToExternalWalletRequest.getActualInstance();

        // create a new AddAssetToExternalWalletRequestOneOf1
        AddAssetToExternalWalletRequestOneOf1 exampleAddAssetToExternalWalletRequestOneOf1 = new AddAssetToExternalWalletRequestOneOf1();
        // set AddAssetToExternalWalletRequest to AddAssetToExternalWalletRequestOneOf1
        exampleAddAssetToExternalWalletRequest.setActualInstance(exampleAddAssetToExternalWalletRequestOneOf1);
        // to get back the AddAssetToExternalWalletRequestOneOf1 set earlier
        AddAssetToExternalWalletRequestOneOf1 testAddAssetToExternalWalletRequestOneOf1 = (AddAssetToExternalWalletRequestOneOf1) exampleAddAssetToExternalWalletRequest.getActualInstance();
    }
}
```


