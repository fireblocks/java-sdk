

# NetworkIdRoutingPolicyValue

## oneOf schemas
* [CustomRoutingDest](CustomRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkIdRoutingPolicyValue;
import com.fireblocks.sdk.model.CustomRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkIdRoutingPolicyValue exampleNetworkIdRoutingPolicyValue = new NetworkIdRoutingPolicyValue();

        // create a new CustomRoutingDest
        CustomRoutingDest exampleCustomRoutingDest = new CustomRoutingDest();
        // set NetworkIdRoutingPolicyValue to CustomRoutingDest
        exampleNetworkIdRoutingPolicyValue.setActualInstance(exampleCustomRoutingDest);
        // to get back the CustomRoutingDest set earlier
        CustomRoutingDest testCustomRoutingDest = (CustomRoutingDest) exampleNetworkIdRoutingPolicyValue.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkIdRoutingPolicyValue to NoneNetworkRoutingDest
        exampleNetworkIdRoutingPolicyValue.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkIdRoutingPolicyValue.getActualInstance();
    }
}
```


