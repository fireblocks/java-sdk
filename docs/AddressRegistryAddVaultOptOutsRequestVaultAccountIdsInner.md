

# AddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner

## oneOf schemas
* [Integer](Integer.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner;
import com.fireblocks.sdk.model.Integer;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        AddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner exampleAddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner = new AddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set AddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner to Integer
        exampleAddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleAddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set AddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner to String
        exampleAddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleAddressRegistryAddVaultOptOutsRequestVaultAccountIdsInner.getActualInstance();
    }
}
```


