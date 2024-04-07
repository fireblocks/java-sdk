

# WorkflowExecutionOperation

## oneOf schemas
* [ExecutionConversionOperation](ExecutionConversionOperation.md)
* [ExecutionDisbursementOperation](ExecutionDisbursementOperation.md)
* [ExecutionScreeningOperation](ExecutionScreeningOperation.md)
* [ExecutionTransferOperation](ExecutionTransferOperation.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.WorkflowExecutionOperation;
import com.fireblocks.sdk.model.ExecutionConversionOperation;
import com.fireblocks.sdk.model.ExecutionDisbursementOperation;
import com.fireblocks.sdk.model.ExecutionScreeningOperation;
import com.fireblocks.sdk.model.ExecutionTransferOperation;

public class Example {
    public static void main(String[] args) {
        WorkflowExecutionOperation exampleWorkflowExecutionOperation = new WorkflowExecutionOperation();

        // create a new ExecutionConversionOperation
        ExecutionConversionOperation exampleExecutionConversionOperation = new ExecutionConversionOperation();
        // set WorkflowExecutionOperation to ExecutionConversionOperation
        exampleWorkflowExecutionOperation.setActualInstance(exampleExecutionConversionOperation);
        // to get back the ExecutionConversionOperation set earlier
        ExecutionConversionOperation testExecutionConversionOperation = (ExecutionConversionOperation) exampleWorkflowExecutionOperation.getActualInstance();

        // create a new ExecutionDisbursementOperation
        ExecutionDisbursementOperation exampleExecutionDisbursementOperation = new ExecutionDisbursementOperation();
        // set WorkflowExecutionOperation to ExecutionDisbursementOperation
        exampleWorkflowExecutionOperation.setActualInstance(exampleExecutionDisbursementOperation);
        // to get back the ExecutionDisbursementOperation set earlier
        ExecutionDisbursementOperation testExecutionDisbursementOperation = (ExecutionDisbursementOperation) exampleWorkflowExecutionOperation.getActualInstance();

        // create a new ExecutionScreeningOperation
        ExecutionScreeningOperation exampleExecutionScreeningOperation = new ExecutionScreeningOperation();
        // set WorkflowExecutionOperation to ExecutionScreeningOperation
        exampleWorkflowExecutionOperation.setActualInstance(exampleExecutionScreeningOperation);
        // to get back the ExecutionScreeningOperation set earlier
        ExecutionScreeningOperation testExecutionScreeningOperation = (ExecutionScreeningOperation) exampleWorkflowExecutionOperation.getActualInstance();

        // create a new ExecutionTransferOperation
        ExecutionTransferOperation exampleExecutionTransferOperation = new ExecutionTransferOperation();
        // set WorkflowExecutionOperation to ExecutionTransferOperation
        exampleWorkflowExecutionOperation.setActualInstance(exampleExecutionTransferOperation);
        // to get back the ExecutionTransferOperation set earlier
        ExecutionTransferOperation testExecutionTransferOperation = (ExecutionTransferOperation) exampleWorkflowExecutionOperation.getActualInstance();
    }
}
```


