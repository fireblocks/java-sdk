

# FeeBreakdown

## oneOf schemas
* [FeeBreakdownOneOf](FeeBreakdownOneOf.md)
* [FeeBreakdownOneOf1](FeeBreakdownOneOf1.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.FeeBreakdown;
import com.fireblocks.sdk.model.FeeBreakdownOneOf;
import com.fireblocks.sdk.model.FeeBreakdownOneOf1;

public class Example {
    public static void main(String[] args) {
        FeeBreakdown exampleFeeBreakdown = new FeeBreakdown();

        // create a new FeeBreakdownOneOf
        FeeBreakdownOneOf exampleFeeBreakdownOneOf = new FeeBreakdownOneOf();
        // set FeeBreakdown to FeeBreakdownOneOf
        exampleFeeBreakdown.setActualInstance(exampleFeeBreakdownOneOf);
        // to get back the FeeBreakdownOneOf set earlier
        FeeBreakdownOneOf testFeeBreakdownOneOf = (FeeBreakdownOneOf) exampleFeeBreakdown.getActualInstance();

        // create a new FeeBreakdownOneOf1
        FeeBreakdownOneOf1 exampleFeeBreakdownOneOf1 = new FeeBreakdownOneOf1();
        // set FeeBreakdown to FeeBreakdownOneOf1
        exampleFeeBreakdown.setActualInstance(exampleFeeBreakdownOneOf1);
        // to get back the FeeBreakdownOneOf1 set earlier
        FeeBreakdownOneOf1 testFeeBreakdownOneOf1 = (FeeBreakdownOneOf1) exampleFeeBreakdown.getActualInstance();
    }
}
```


