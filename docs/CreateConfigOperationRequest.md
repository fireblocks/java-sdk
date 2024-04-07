

# CreateConfigOperationRequest

## oneOf schemas
* [CreateConversionConfigOperationRequest](CreateConversionConfigOperationRequest.md)
* [CreateDisbursementConfigOperationRequest](CreateDisbursementConfigOperationRequest.md)
* [CreateTransferConfigOperationRequest](CreateTransferConfigOperationRequest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateConfigOperationRequest;
import com.fireblocks.sdk.model.CreateConversionConfigOperationRequest;
import com.fireblocks.sdk.model.CreateDisbursementConfigOperationRequest;
import com.fireblocks.sdk.model.CreateTransferConfigOperationRequest;

public class Example {
    public static void main(String[] args) {
        CreateConfigOperationRequest exampleCreateConfigOperationRequest = new CreateConfigOperationRequest();

        // create a new CreateConversionConfigOperationRequest
        CreateConversionConfigOperationRequest exampleCreateConversionConfigOperationRequest = new CreateConversionConfigOperationRequest();
        // set CreateConfigOperationRequest to CreateConversionConfigOperationRequest
        exampleCreateConfigOperationRequest.setActualInstance(exampleCreateConversionConfigOperationRequest);
        // to get back the CreateConversionConfigOperationRequest set earlier
        CreateConversionConfigOperationRequest testCreateConversionConfigOperationRequest = (CreateConversionConfigOperationRequest) exampleCreateConfigOperationRequest.getActualInstance();

        // create a new CreateDisbursementConfigOperationRequest
        CreateDisbursementConfigOperationRequest exampleCreateDisbursementConfigOperationRequest = new CreateDisbursementConfigOperationRequest();
        // set CreateConfigOperationRequest to CreateDisbursementConfigOperationRequest
        exampleCreateConfigOperationRequest.setActualInstance(exampleCreateDisbursementConfigOperationRequest);
        // to get back the CreateDisbursementConfigOperationRequest set earlier
        CreateDisbursementConfigOperationRequest testCreateDisbursementConfigOperationRequest = (CreateDisbursementConfigOperationRequest) exampleCreateConfigOperationRequest.getActualInstance();

        // create a new CreateTransferConfigOperationRequest
        CreateTransferConfigOperationRequest exampleCreateTransferConfigOperationRequest = new CreateTransferConfigOperationRequest();
        // set CreateConfigOperationRequest to CreateTransferConfigOperationRequest
        exampleCreateConfigOperationRequest.setActualInstance(exampleCreateTransferConfigOperationRequest);
        // to get back the CreateTransferConfigOperationRequest set earlier
        CreateTransferConfigOperationRequest testCreateTransferConfigOperationRequest = (CreateTransferConfigOperationRequest) exampleCreateConfigOperationRequest.getActualInstance();
    }
}
```


