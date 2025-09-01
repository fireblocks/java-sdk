

# InitiatorConfigPattern

## oneOf schemas
* [InitiatorConfig](InitiatorConfig.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.InitiatorConfigPattern;
import com.fireblocks.sdk.model.InitiatorConfig;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        InitiatorConfigPattern exampleInitiatorConfigPattern = new InitiatorConfigPattern();

        // create a new InitiatorConfig
        InitiatorConfig exampleInitiatorConfig = new InitiatorConfig();
        // set InitiatorConfigPattern to InitiatorConfig
        exampleInitiatorConfigPattern.setActualInstance(exampleInitiatorConfig);
        // to get back the InitiatorConfig set earlier
        InitiatorConfig testInitiatorConfig = (InitiatorConfig) exampleInitiatorConfigPattern.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set InitiatorConfigPattern to String
        exampleInitiatorConfigPattern.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleInitiatorConfigPattern.getActualInstance();
    }
}
```


