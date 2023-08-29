

# PolicyRuleSrcIdsInnerInner

## oneOf schemas
* [PolicySrcOrDestSubType](PolicySrcOrDestSubType.md)
* [PolicySrcOrDestType](PolicySrcOrDestType.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.PolicyRuleSrcIdsInnerInner;
import com.fireblocks.sdk.model.PolicySrcOrDestSubType;
import com.fireblocks.sdk.model.PolicySrcOrDestType;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        PolicyRuleSrcIdsInnerInner examplePolicyRuleSrcIdsInnerInner = new PolicyRuleSrcIdsInnerInner();

        // create a new PolicySrcOrDestSubType
        PolicySrcOrDestSubType examplePolicySrcOrDestSubType = new PolicySrcOrDestSubType();
        // set PolicyRuleSrcIdsInnerInner to PolicySrcOrDestSubType
        examplePolicyRuleSrcIdsInnerInner.setActualInstance(examplePolicySrcOrDestSubType);
        // to get back the PolicySrcOrDestSubType set earlier
        PolicySrcOrDestSubType testPolicySrcOrDestSubType = (PolicySrcOrDestSubType) examplePolicyRuleSrcIdsInnerInner.getActualInstance();

        // create a new PolicySrcOrDestType
        PolicySrcOrDestType examplePolicySrcOrDestType = new PolicySrcOrDestType();
        // set PolicyRuleSrcIdsInnerInner to PolicySrcOrDestType
        examplePolicyRuleSrcIdsInnerInner.setActualInstance(examplePolicySrcOrDestType);
        // to get back the PolicySrcOrDestType set earlier
        PolicySrcOrDestType testPolicySrcOrDestType = (PolicySrcOrDestType) examplePolicyRuleSrcIdsInnerInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set PolicyRuleSrcIdsInnerInner to String
        examplePolicyRuleSrcIdsInnerInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) examplePolicyRuleSrcIdsInnerInner.getActualInstance();
    }
}
```


