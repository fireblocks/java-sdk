

# NetworkIdRoutingPolicySenTest

## oneOf schemas
* [CustomFiatRoutingDest](CustomFiatRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkIdRoutingPolicySenTest;
import com.fireblocks.sdk.model.CustomFiatRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkIdRoutingPolicySenTest exampleNetworkIdRoutingPolicySenTest = new NetworkIdRoutingPolicySenTest();

        // create a new CustomFiatRoutingDest
        CustomFiatRoutingDest exampleCustomFiatRoutingDest = new CustomFiatRoutingDest();
        // set NetworkIdRoutingPolicySenTest to CustomFiatRoutingDest
        exampleNetworkIdRoutingPolicySenTest.setActualInstance(exampleCustomFiatRoutingDest);
        // to get back the CustomFiatRoutingDest set earlier
        CustomFiatRoutingDest testCustomFiatRoutingDest = (CustomFiatRoutingDest) exampleNetworkIdRoutingPolicySenTest.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkIdRoutingPolicySenTest to NoneNetworkRoutingDest
        exampleNetworkIdRoutingPolicySenTest.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkIdRoutingPolicySenTest.getActualInstance();
    }
}
```


