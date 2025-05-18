

# ReadCallFunctionDtoAbiFunction

## oneOf schemas
* [ReadAbiFunction](ReadAbiFunction.md)
* [SolanaInstructionWithValue](SolanaInstructionWithValue.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ReadCallFunctionDtoAbiFunction;
import com.fireblocks.sdk.model.ReadAbiFunction;
import com.fireblocks.sdk.model.SolanaInstructionWithValue;

public class Example {
    public static void main(String[] args) {
        ReadCallFunctionDtoAbiFunction exampleReadCallFunctionDtoAbiFunction = new ReadCallFunctionDtoAbiFunction();

        // create a new ReadAbiFunction
        ReadAbiFunction exampleReadAbiFunction = new ReadAbiFunction();
        // set ReadCallFunctionDtoAbiFunction to ReadAbiFunction
        exampleReadCallFunctionDtoAbiFunction.setActualInstance(exampleReadAbiFunction);
        // to get back the ReadAbiFunction set earlier
        ReadAbiFunction testReadAbiFunction = (ReadAbiFunction) exampleReadCallFunctionDtoAbiFunction.getActualInstance();

        // create a new SolanaInstructionWithValue
        SolanaInstructionWithValue exampleSolanaInstructionWithValue = new SolanaInstructionWithValue();
        // set ReadCallFunctionDtoAbiFunction to SolanaInstructionWithValue
        exampleReadCallFunctionDtoAbiFunction.setActualInstance(exampleSolanaInstructionWithValue);
        // to get back the SolanaInstructionWithValue set earlier
        SolanaInstructionWithValue testSolanaInstructionWithValue = (SolanaInstructionWithValue) exampleReadCallFunctionDtoAbiFunction.getActualInstance();
    }
}
```


