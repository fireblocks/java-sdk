

# ContractMethodPattern

## oneOf schemas
* [ContractMethodConfig](ContractMethodConfig.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ContractMethodPattern;
import com.fireblocks.sdk.model.ContractMethodConfig;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        ContractMethodPattern exampleContractMethodPattern = new ContractMethodPattern();

        // create a new ContractMethodConfig
        ContractMethodConfig exampleContractMethodConfig = new ContractMethodConfig();
        // set ContractMethodPattern to ContractMethodConfig
        exampleContractMethodPattern.setActualInstance(exampleContractMethodConfig);
        // to get back the ContractMethodConfig set earlier
        ContractMethodConfig testContractMethodConfig = (ContractMethodConfig) exampleContractMethodPattern.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ContractMethodPattern to String
        exampleContractMethodPattern.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleContractMethodPattern.getActualInstance();
    }
}
```


