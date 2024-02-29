

# SrcOrDestAttributesInner

## anyOf schemas
* [PolicySrcOrDestSubType](PolicySrcOrDestSubType.md)
* [PolicySrcOrDestType](PolicySrcOrDestType.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.SrcOrDestAttributesInner;
import com.fireblocks.sdk.model.PolicySrcOrDestSubType;
import com.fireblocks.sdk.model.PolicySrcOrDestType;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        SrcOrDestAttributesInner exampleSrcOrDestAttributesInner = new SrcOrDestAttributesInner();

        // create a new PolicySrcOrDestSubType
        PolicySrcOrDestSubType examplePolicySrcOrDestSubType = new PolicySrcOrDestSubType();
        // set SrcOrDestAttributesInner to PolicySrcOrDestSubType
        exampleSrcOrDestAttributesInner.setActualInstance(examplePolicySrcOrDestSubType);
        // to get back the PolicySrcOrDestSubType set earlier
        PolicySrcOrDestSubType testPolicySrcOrDestSubType = (PolicySrcOrDestSubType) exampleSrcOrDestAttributesInner.getActualInstance();

        // create a new PolicySrcOrDestType
        PolicySrcOrDestType examplePolicySrcOrDestType = new PolicySrcOrDestType();
        // set SrcOrDestAttributesInner to PolicySrcOrDestType
        exampleSrcOrDestAttributesInner.setActualInstance(examplePolicySrcOrDestType);
        // to get back the PolicySrcOrDestType set earlier
        PolicySrcOrDestType testPolicySrcOrDestType = (PolicySrcOrDestType) exampleSrcOrDestAttributesInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set SrcOrDestAttributesInner to String
        exampleSrcOrDestAttributesInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleSrcOrDestAttributesInner.getActualInstance();
    }
}
```


