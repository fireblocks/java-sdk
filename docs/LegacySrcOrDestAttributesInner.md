

# LegacySrcOrDestAttributesInner

## anyOf schemas
* [LegacyPolicySrcOrDestSubType](LegacyPolicySrcOrDestSubType.md)
* [LegacyPolicySrcOrDestType](LegacyPolicySrcOrDestType.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.LegacySrcOrDestAttributesInner;
import com.fireblocks.sdk.model.LegacyPolicySrcOrDestSubType;
import com.fireblocks.sdk.model.LegacyPolicySrcOrDestType;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        LegacySrcOrDestAttributesInner exampleLegacySrcOrDestAttributesInner = new LegacySrcOrDestAttributesInner();

        // create a new LegacyPolicySrcOrDestSubType
        LegacyPolicySrcOrDestSubType exampleLegacyPolicySrcOrDestSubType = new LegacyPolicySrcOrDestSubType();
        // set LegacySrcOrDestAttributesInner to LegacyPolicySrcOrDestSubType
        exampleLegacySrcOrDestAttributesInner.setActualInstance(exampleLegacyPolicySrcOrDestSubType);
        // to get back the LegacyPolicySrcOrDestSubType set earlier
        LegacyPolicySrcOrDestSubType testLegacyPolicySrcOrDestSubType = (LegacyPolicySrcOrDestSubType) exampleLegacySrcOrDestAttributesInner.getActualInstance();

        // create a new LegacyPolicySrcOrDestType
        LegacyPolicySrcOrDestType exampleLegacyPolicySrcOrDestType = new LegacyPolicySrcOrDestType();
        // set LegacySrcOrDestAttributesInner to LegacyPolicySrcOrDestType
        exampleLegacySrcOrDestAttributesInner.setActualInstance(exampleLegacyPolicySrcOrDestType);
        // to get back the LegacyPolicySrcOrDestType set earlier
        LegacyPolicySrcOrDestType testLegacyPolicySrcOrDestType = (LegacyPolicySrcOrDestType) exampleLegacySrcOrDestAttributesInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set LegacySrcOrDestAttributesInner to String
        exampleLegacySrcOrDestAttributesInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLegacySrcOrDestAttributesInner.getActualInstance();
    }
}
```


