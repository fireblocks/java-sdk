

# ConfigOperation

## oneOf schemas
* [ConversionConfigOperation](ConversionConfigOperation.md)
* [DisbursementConfigOperation](DisbursementConfigOperation.md)
* [TransferConfigOperation](TransferConfigOperation.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ConfigOperation;
import com.fireblocks.sdk.model.ConversionConfigOperation;
import com.fireblocks.sdk.model.DisbursementConfigOperation;
import com.fireblocks.sdk.model.TransferConfigOperation;

public class Example {
    public static void main(String[] args) {
        ConfigOperation exampleConfigOperation = new ConfigOperation();

        // create a new ConversionConfigOperation
        ConversionConfigOperation exampleConversionConfigOperation = new ConversionConfigOperation();
        // set ConfigOperation to ConversionConfigOperation
        exampleConfigOperation.setActualInstance(exampleConversionConfigOperation);
        // to get back the ConversionConfigOperation set earlier
        ConversionConfigOperation testConversionConfigOperation = (ConversionConfigOperation) exampleConfigOperation.getActualInstance();

        // create a new DisbursementConfigOperation
        DisbursementConfigOperation exampleDisbursementConfigOperation = new DisbursementConfigOperation();
        // set ConfigOperation to DisbursementConfigOperation
        exampleConfigOperation.setActualInstance(exampleDisbursementConfigOperation);
        // to get back the DisbursementConfigOperation set earlier
        DisbursementConfigOperation testDisbursementConfigOperation = (DisbursementConfigOperation) exampleConfigOperation.getActualInstance();

        // create a new TransferConfigOperation
        TransferConfigOperation exampleTransferConfigOperation = new TransferConfigOperation();
        // set ConfigOperation to TransferConfigOperation
        exampleConfigOperation.setActualInstance(exampleTransferConfigOperation);
        // to get back the TransferConfigOperation set earlier
        TransferConfigOperation testTransferConfigOperation = (TransferConfigOperation) exampleConfigOperation.getActualInstance();
    }
}
```


