

# WriteCallFunctionDtoAbiFunction

## oneOf schemas
* [SolanaInstructionWithValue](SolanaInstructionWithValue.md)
* [WriteAbiFunction](WriteAbiFunction.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.WriteCallFunctionDtoAbiFunction;
import com.fireblocks.sdk.model.SolanaInstructionWithValue;
import com.fireblocks.sdk.model.WriteAbiFunction;

public class Example {
    public static void main(String[] args) {
        WriteCallFunctionDtoAbiFunction exampleWriteCallFunctionDtoAbiFunction = new WriteCallFunctionDtoAbiFunction();

        // create a new SolanaInstructionWithValue
        SolanaInstructionWithValue exampleSolanaInstructionWithValue = new SolanaInstructionWithValue();
        // set WriteCallFunctionDtoAbiFunction to SolanaInstructionWithValue
        exampleWriteCallFunctionDtoAbiFunction.setActualInstance(exampleSolanaInstructionWithValue);
        // to get back the SolanaInstructionWithValue set earlier
        SolanaInstructionWithValue testSolanaInstructionWithValue = (SolanaInstructionWithValue) exampleWriteCallFunctionDtoAbiFunction.getActualInstance();

        // create a new WriteAbiFunction
        WriteAbiFunction exampleWriteAbiFunction = new WriteAbiFunction();
        // set WriteCallFunctionDtoAbiFunction to WriteAbiFunction
        exampleWriteCallFunctionDtoAbiFunction.setActualInstance(exampleWriteAbiFunction);
        // to get back the WriteAbiFunction set earlier
        WriteAbiFunction testWriteAbiFunction = (WriteAbiFunction) exampleWriteCallFunctionDtoAbiFunction.getActualInstance();
    }
}
```


