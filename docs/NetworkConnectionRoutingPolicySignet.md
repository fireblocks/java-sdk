

# NetworkConnectionRoutingPolicySignet

## oneOf schemas
* [CustomFiatRoutingDest](CustomFiatRoutingDest.md)
* [DefaultNetworkRoutingDest](DefaultNetworkRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySignet;
import com.fireblocks.sdk.model.CustomFiatRoutingDest;
import com.fireblocks.sdk.model.DefaultNetworkRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkConnectionRoutingPolicySignet exampleNetworkConnectionRoutingPolicySignet = new NetworkConnectionRoutingPolicySignet();

        // create a new CustomFiatRoutingDest
        CustomFiatRoutingDest exampleCustomFiatRoutingDest = new CustomFiatRoutingDest();
        // set NetworkConnectionRoutingPolicySignet to CustomFiatRoutingDest
        exampleNetworkConnectionRoutingPolicySignet.setActualInstance(exampleCustomFiatRoutingDest);
        // to get back the CustomFiatRoutingDest set earlier
        CustomFiatRoutingDest testCustomFiatRoutingDest = (CustomFiatRoutingDest) exampleNetworkConnectionRoutingPolicySignet.getActualInstance();

        // create a new DefaultNetworkRoutingDest
        DefaultNetworkRoutingDest exampleDefaultNetworkRoutingDest = new DefaultNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicySignet to DefaultNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicySignet.setActualInstance(exampleDefaultNetworkRoutingDest);
        // to get back the DefaultNetworkRoutingDest set earlier
        DefaultNetworkRoutingDest testDefaultNetworkRoutingDest = (DefaultNetworkRoutingDest) exampleNetworkConnectionRoutingPolicySignet.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicySignet to NoneNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicySignet.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkConnectionRoutingPolicySignet.getActualInstance();
    }
}
```


