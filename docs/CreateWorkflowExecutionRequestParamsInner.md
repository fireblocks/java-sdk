

# CreateWorkflowExecutionRequestParamsInner

## anyOf schemas
* [ConversionOperationExecutionParams](ConversionOperationExecutionParams.md)
* [DisbursementOperationExecutionParams](DisbursementOperationExecutionParams.md)
* [TransferOperationExecutionParams](TransferOperationExecutionParams.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateWorkflowExecutionRequestParamsInner;
import com.fireblocks.sdk.model.ConversionOperationExecutionParams;
import com.fireblocks.sdk.model.DisbursementOperationExecutionParams;
import com.fireblocks.sdk.model.TransferOperationExecutionParams;

public class Example {
    public static void main(String[] args) {
        CreateWorkflowExecutionRequestParamsInner exampleCreateWorkflowExecutionRequestParamsInner = new CreateWorkflowExecutionRequestParamsInner();

        // create a new ConversionOperationExecutionParams
        ConversionOperationExecutionParams exampleConversionOperationExecutionParams = new ConversionOperationExecutionParams();
        // set CreateWorkflowExecutionRequestParamsInner to ConversionOperationExecutionParams
        exampleCreateWorkflowExecutionRequestParamsInner.setActualInstance(exampleConversionOperationExecutionParams);
        // to get back the ConversionOperationExecutionParams set earlier
        ConversionOperationExecutionParams testConversionOperationExecutionParams = (ConversionOperationExecutionParams) exampleCreateWorkflowExecutionRequestParamsInner.getActualInstance();

        // create a new DisbursementOperationExecutionParams
        DisbursementOperationExecutionParams exampleDisbursementOperationExecutionParams = new DisbursementOperationExecutionParams();
        // set CreateWorkflowExecutionRequestParamsInner to DisbursementOperationExecutionParams
        exampleCreateWorkflowExecutionRequestParamsInner.setActualInstance(exampleDisbursementOperationExecutionParams);
        // to get back the DisbursementOperationExecutionParams set earlier
        DisbursementOperationExecutionParams testDisbursementOperationExecutionParams = (DisbursementOperationExecutionParams) exampleCreateWorkflowExecutionRequestParamsInner.getActualInstance();

        // create a new TransferOperationExecutionParams
        TransferOperationExecutionParams exampleTransferOperationExecutionParams = new TransferOperationExecutionParams();
        // set CreateWorkflowExecutionRequestParamsInner to TransferOperationExecutionParams
        exampleCreateWorkflowExecutionRequestParamsInner.setActualInstance(exampleTransferOperationExecutionParams);
        // to get back the TransferOperationExecutionParams set earlier
        TransferOperationExecutionParams testTransferOperationExecutionParams = (TransferOperationExecutionParams) exampleCreateWorkflowExecutionRequestParamsInner.getActualInstance();
    }
}
```


