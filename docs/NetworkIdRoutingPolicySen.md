

# NetworkIdRoutingPolicySen

## oneOf schemas
* [CustomFiatRoutingDest](CustomFiatRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkIdRoutingPolicySen;
import com.fireblocks.sdk.model.CustomFiatRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkIdRoutingPolicySen exampleNetworkIdRoutingPolicySen = new NetworkIdRoutingPolicySen();

        // create a new CustomFiatRoutingDest
        CustomFiatRoutingDest exampleCustomFiatRoutingDest = new CustomFiatRoutingDest();
        // set NetworkIdRoutingPolicySen to CustomFiatRoutingDest
        exampleNetworkIdRoutingPolicySen.setActualInstance(exampleCustomFiatRoutingDest);
        // to get back the CustomFiatRoutingDest set earlier
        CustomFiatRoutingDest testCustomFiatRoutingDest = (CustomFiatRoutingDest) exampleNetworkIdRoutingPolicySen.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkIdRoutingPolicySen to NoneNetworkRoutingDest
        exampleNetworkIdRoutingPolicySen.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkIdRoutingPolicySen.getActualInstance();
    }
}
```


