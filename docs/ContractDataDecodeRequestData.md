

# ContractDataDecodeRequestData

The data to decode, which can be a string or an object containing the data and its type.

## oneOf schemas
* [ContractDataLogDataParam](ContractDataLogDataParam.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ContractDataDecodeRequestData;
import com.fireblocks.sdk.model.ContractDataLogDataParam;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        ContractDataDecodeRequestData exampleContractDataDecodeRequestData = new ContractDataDecodeRequestData();

        // create a new ContractDataLogDataParam
        ContractDataLogDataParam exampleContractDataLogDataParam = new ContractDataLogDataParam();
        // set ContractDataDecodeRequestData to ContractDataLogDataParam
        exampleContractDataDecodeRequestData.setActualInstance(exampleContractDataLogDataParam);
        // to get back the ContractDataLogDataParam set earlier
        ContractDataLogDataParam testContractDataLogDataParam = (ContractDataLogDataParam) exampleContractDataDecodeRequestData.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ContractDataDecodeRequestData to String
        exampleContractDataDecodeRequestData.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleContractDataDecodeRequestData.getActualInstance();
    }
}
```


