

# ContractAbiResponseDtoAbiInner

## oneOf schemas
* [AbiFunction](AbiFunction.md)
* [SolanaInstruction](SolanaInstruction.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ContractAbiResponseDtoAbiInner;
import com.fireblocks.sdk.model.AbiFunction;
import com.fireblocks.sdk.model.SolanaInstruction;

public class Example {
    public static void main(String[] args) {
        ContractAbiResponseDtoAbiInner exampleContractAbiResponseDtoAbiInner = new ContractAbiResponseDtoAbiInner();

        // create a new AbiFunction
        AbiFunction exampleAbiFunction = new AbiFunction();
        // set ContractAbiResponseDtoAbiInner to AbiFunction
        exampleContractAbiResponseDtoAbiInner.setActualInstance(exampleAbiFunction);
        // to get back the AbiFunction set earlier
        AbiFunction testAbiFunction = (AbiFunction) exampleContractAbiResponseDtoAbiInner.getActualInstance();

        // create a new SolanaInstruction
        SolanaInstruction exampleSolanaInstruction = new SolanaInstruction();
        // set ContractAbiResponseDtoAbiInner to SolanaInstruction
        exampleContractAbiResponseDtoAbiInner.setActualInstance(exampleSolanaInstruction);
        // to get back the SolanaInstruction set earlier
        SolanaInstruction testSolanaInstruction = (SolanaInstruction) exampleContractAbiResponseDtoAbiInner.getActualInstance();
    }
}
```


