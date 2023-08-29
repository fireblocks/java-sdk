

# NetworkConnectionRoutingPolicySenTest

## oneOf schemas
* [CustomFiatRoutingDest](CustomFiatRoutingDest.md)
* [DefaultNetworkRoutingDest](DefaultNetworkRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySenTest;
import com.fireblocks.sdk.model.CustomFiatRoutingDest;
import com.fireblocks.sdk.model.DefaultNetworkRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkConnectionRoutingPolicySenTest exampleNetworkConnectionRoutingPolicySenTest = new NetworkConnectionRoutingPolicySenTest();

        // create a new CustomFiatRoutingDest
        CustomFiatRoutingDest exampleCustomFiatRoutingDest = new CustomFiatRoutingDest();
        // set NetworkConnectionRoutingPolicySenTest to CustomFiatRoutingDest
        exampleNetworkConnectionRoutingPolicySenTest.setActualInstance(exampleCustomFiatRoutingDest);
        // to get back the CustomFiatRoutingDest set earlier
        CustomFiatRoutingDest testCustomFiatRoutingDest = (CustomFiatRoutingDest) exampleNetworkConnectionRoutingPolicySenTest.getActualInstance();

        // create a new DefaultNetworkRoutingDest
        DefaultNetworkRoutingDest exampleDefaultNetworkRoutingDest = new DefaultNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicySenTest to DefaultNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicySenTest.setActualInstance(exampleDefaultNetworkRoutingDest);
        // to get back the DefaultNetworkRoutingDest set earlier
        DefaultNetworkRoutingDest testDefaultNetworkRoutingDest = (DefaultNetworkRoutingDest) exampleNetworkConnectionRoutingPolicySenTest.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicySenTest to NoneNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicySenTest.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkConnectionRoutingPolicySenTest.getActualInstance();
    }
}
```


