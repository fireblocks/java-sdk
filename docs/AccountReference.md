

# AccountReference

## oneOf schemas
* [InternalReference](InternalReference.md)
* [OneTimeAddressReference](OneTimeAddressReference.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AccountReference;
import com.fireblocks.sdk.model.InternalReference;
import com.fireblocks.sdk.model.OneTimeAddressReference;

public class Example {
    public static void main(String[] args) {
        AccountReference exampleAccountReference = new AccountReference();

        // create a new InternalReference
        InternalReference exampleInternalReference = new InternalReference();
        // set AccountReference to InternalReference
        exampleAccountReference.setActualInstance(exampleInternalReference);
        // to get back the InternalReference set earlier
        InternalReference testInternalReference = (InternalReference) exampleAccountReference.getActualInstance();

        // create a new OneTimeAddressReference
        OneTimeAddressReference exampleOneTimeAddressReference = new OneTimeAddressReference();
        // set AccountReference to OneTimeAddressReference
        exampleAccountReference.setActualInstance(exampleOneTimeAddressReference);
        // to get back the OneTimeAddressReference set earlier
        OneTimeAddressReference testOneTimeAddressReference = (OneTimeAddressReference) exampleAccountReference.getActualInstance();
    }
}
```


