

# NetworkConnectionRoutingPolicyCrypto

## oneOf schemas
* [CustomCryptoRoutingDest](CustomCryptoRoutingDest.md)
* [DefaultNetworkRoutingDest](DefaultNetworkRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicyCrypto;
import com.fireblocks.sdk.model.CustomCryptoRoutingDest;
import com.fireblocks.sdk.model.DefaultNetworkRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkConnectionRoutingPolicyCrypto exampleNetworkConnectionRoutingPolicyCrypto = new NetworkConnectionRoutingPolicyCrypto();

        // create a new CustomCryptoRoutingDest
        CustomCryptoRoutingDest exampleCustomCryptoRoutingDest = new CustomCryptoRoutingDest();
        // set NetworkConnectionRoutingPolicyCrypto to CustomCryptoRoutingDest
        exampleNetworkConnectionRoutingPolicyCrypto.setActualInstance(exampleCustomCryptoRoutingDest);
        // to get back the CustomCryptoRoutingDest set earlier
        CustomCryptoRoutingDest testCustomCryptoRoutingDest = (CustomCryptoRoutingDest) exampleNetworkConnectionRoutingPolicyCrypto.getActualInstance();

        // create a new DefaultNetworkRoutingDest
        DefaultNetworkRoutingDest exampleDefaultNetworkRoutingDest = new DefaultNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicyCrypto to DefaultNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicyCrypto.setActualInstance(exampleDefaultNetworkRoutingDest);
        // to get back the DefaultNetworkRoutingDest set earlier
        DefaultNetworkRoutingDest testDefaultNetworkRoutingDest = (DefaultNetworkRoutingDest) exampleNetworkConnectionRoutingPolicyCrypto.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicyCrypto to NoneNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicyCrypto.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkConnectionRoutingPolicyCrypto.getActualInstance();
    }
}
```


