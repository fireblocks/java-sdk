

# NetworkConnectionRoutingPolicySignetTest

## oneOf schemas
* [CustomFiatRoutingDest](CustomFiatRoutingDest.md)
* [DefaultNetworkRoutingDest](DefaultNetworkRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySignetTest;
import com.fireblocks.sdk.model.CustomFiatRoutingDest;
import com.fireblocks.sdk.model.DefaultNetworkRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkConnectionRoutingPolicySignetTest exampleNetworkConnectionRoutingPolicySignetTest = new NetworkConnectionRoutingPolicySignetTest();

        // create a new CustomFiatRoutingDest
        CustomFiatRoutingDest exampleCustomFiatRoutingDest = new CustomFiatRoutingDest();
        // set NetworkConnectionRoutingPolicySignetTest to CustomFiatRoutingDest
        exampleNetworkConnectionRoutingPolicySignetTest.setActualInstance(exampleCustomFiatRoutingDest);
        // to get back the CustomFiatRoutingDest set earlier
        CustomFiatRoutingDest testCustomFiatRoutingDest = (CustomFiatRoutingDest) exampleNetworkConnectionRoutingPolicySignetTest.getActualInstance();

        // create a new DefaultNetworkRoutingDest
        DefaultNetworkRoutingDest exampleDefaultNetworkRoutingDest = new DefaultNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicySignetTest to DefaultNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicySignetTest.setActualInstance(exampleDefaultNetworkRoutingDest);
        // to get back the DefaultNetworkRoutingDest set earlier
        DefaultNetworkRoutingDest testDefaultNetworkRoutingDest = (DefaultNetworkRoutingDest) exampleNetworkConnectionRoutingPolicySignetTest.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicySignetTest to NoneNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicySignetTest.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkConnectionRoutingPolicySignetTest.getActualInstance();
    }
}
```


