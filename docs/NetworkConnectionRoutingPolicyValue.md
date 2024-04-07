

# NetworkConnectionRoutingPolicyValue

## oneOf schemas
* [CustomRoutingDest](CustomRoutingDest.md)
* [DefaultNetworkRoutingDest](DefaultNetworkRoutingDest.md)
* [NoneNetworkRoutingDest](NoneNetworkRoutingDest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicyValue;
import com.fireblocks.sdk.model.CustomRoutingDest;
import com.fireblocks.sdk.model.DefaultNetworkRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;

public class Example {
    public static void main(String[] args) {
        NetworkConnectionRoutingPolicyValue exampleNetworkConnectionRoutingPolicyValue = new NetworkConnectionRoutingPolicyValue();

        // create a new CustomRoutingDest
        CustomRoutingDest exampleCustomRoutingDest = new CustomRoutingDest();
        // set NetworkConnectionRoutingPolicyValue to CustomRoutingDest
        exampleNetworkConnectionRoutingPolicyValue.setActualInstance(exampleCustomRoutingDest);
        // to get back the CustomRoutingDest set earlier
        CustomRoutingDest testCustomRoutingDest = (CustomRoutingDest) exampleNetworkConnectionRoutingPolicyValue.getActualInstance();

        // create a new DefaultNetworkRoutingDest
        DefaultNetworkRoutingDest exampleDefaultNetworkRoutingDest = new DefaultNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicyValue to DefaultNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicyValue.setActualInstance(exampleDefaultNetworkRoutingDest);
        // to get back the DefaultNetworkRoutingDest set earlier
        DefaultNetworkRoutingDest testDefaultNetworkRoutingDest = (DefaultNetworkRoutingDest) exampleNetworkConnectionRoutingPolicyValue.getActualInstance();

        // create a new NoneNetworkRoutingDest
        NoneNetworkRoutingDest exampleNoneNetworkRoutingDest = new NoneNetworkRoutingDest();
        // set NetworkConnectionRoutingPolicyValue to NoneNetworkRoutingDest
        exampleNetworkConnectionRoutingPolicyValue.setActualInstance(exampleNoneNetworkRoutingDest);
        // to get back the NoneNetworkRoutingDest set earlier
        NoneNetworkRoutingDest testNoneNetworkRoutingDest = (NoneNetworkRoutingDest) exampleNetworkConnectionRoutingPolicyValue.getActualInstance();
    }
}
```


