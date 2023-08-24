

# NetworkIdRoutingPolicyCrypto

## oneOf schemas
* [CustomCryptoRoutingDest](CustomCryptoRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkIdRoutingPolicyCrypto;
import com.fireblocks.sdk.model.CustomCryptoRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkIdRoutingPolicyCrypto exampleNetworkIdRoutingPolicyCrypto = new NetworkIdRoutingPolicyCrypto();

        // create a new CustomCryptoRoutingDest
        CustomCryptoRoutingDest exampleCustomCryptoRoutingDest = new CustomCryptoRoutingDest();
        // set NetworkIdRoutingPolicyCrypto to CustomCryptoRoutingDest
        exampleNetworkIdRoutingPolicyCrypto.setActualInstance(exampleCustomCryptoRoutingDest);
        // to get back the CustomCryptoRoutingDest set earlier
        CustomCryptoRoutingDest testCustomCryptoRoutingDest = (CustomCryptoRoutingDest) exampleNetworkIdRoutingPolicyCrypto.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkIdRoutingPolicyCrypto to NoneNetworkRoutingDest
        exampleNetworkIdRoutingPolicyCrypto.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkIdRoutingPolicyCrypto.getActualInstance();
    }
}
```


