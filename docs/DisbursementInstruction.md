

# DisbursementInstruction

## oneOf schemas
* [DisbursementAmountInstruction](DisbursementAmountInstruction.md)
* [DisbursementPercentageInstruction](DisbursementPercentageInstruction.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.DisbursementInstruction;
import com.fireblocks.sdk.model.DisbursementAmountInstruction;
import com.fireblocks.sdk.model.DisbursementPercentageInstruction;

public class Example {
    public static void main(String[] args) {
        DisbursementInstruction exampleDisbursementInstruction = new DisbursementInstruction();

        // create a new DisbursementAmountInstruction
        DisbursementAmountInstruction exampleDisbursementAmountInstruction = new DisbursementAmountInstruction();
        // set DisbursementInstruction to DisbursementAmountInstruction
        exampleDisbursementInstruction.setActualInstance(exampleDisbursementAmountInstruction);
        // to get back the DisbursementAmountInstruction set earlier
        DisbursementAmountInstruction testDisbursementAmountInstruction = (DisbursementAmountInstruction) exampleDisbursementInstruction.getActualInstance();

        // create a new DisbursementPercentageInstruction
        DisbursementPercentageInstruction exampleDisbursementPercentageInstruction = new DisbursementPercentageInstruction();
        // set DisbursementInstruction to DisbursementPercentageInstruction
        exampleDisbursementInstruction.setActualInstance(exampleDisbursementPercentageInstruction);
        // to get back the DisbursementPercentageInstruction set earlier
        DisbursementPercentageInstruction testDisbursementPercentageInstruction = (DisbursementPercentageInstruction) exampleDisbursementInstruction.getActualInstance();
    }
}
```


