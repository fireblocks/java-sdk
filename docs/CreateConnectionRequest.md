

# CreateConnectionRequest

## oneOf schemas
* [CreateNcwConnectionRequest](CreateNcwConnectionRequest.md)
* [CreateVaultAccountConnectionRequest](CreateVaultAccountConnectionRequest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateConnectionRequest;
import com.fireblocks.sdk.model.CreateNcwConnectionRequest;
import com.fireblocks.sdk.model.CreateVaultAccountConnectionRequest;

public class Example {
    public static void main(String[] args) {
        CreateConnectionRequest exampleCreateConnectionRequest = new CreateConnectionRequest();

        // create a new CreateNcwConnectionRequest
        CreateNcwConnectionRequest exampleCreateNcwConnectionRequest = new CreateNcwConnectionRequest();
        // set CreateConnectionRequest to CreateNcwConnectionRequest
        exampleCreateConnectionRequest.setActualInstance(exampleCreateNcwConnectionRequest);
        // to get back the CreateNcwConnectionRequest set earlier
        CreateNcwConnectionRequest testCreateNcwConnectionRequest = (CreateNcwConnectionRequest) exampleCreateConnectionRequest.getActualInstance();

        // create a new CreateVaultAccountConnectionRequest
        CreateVaultAccountConnectionRequest exampleCreateVaultAccountConnectionRequest = new CreateVaultAccountConnectionRequest();
        // set CreateConnectionRequest to CreateVaultAccountConnectionRequest
        exampleCreateConnectionRequest.setActualInstance(exampleCreateVaultAccountConnectionRequest);
        // to get back the CreateVaultAccountConnectionRequest set earlier
        CreateVaultAccountConnectionRequest testCreateVaultAccountConnectionRequest = (CreateVaultAccountConnectionRequest) exampleCreateConnectionRequest.getActualInstance();
    }
}
```


