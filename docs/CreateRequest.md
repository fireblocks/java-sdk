

# CreateRequest

## oneOf schemas
* [CreateConnectionRequest](CreateConnectionRequest.md)
* [CreateNcwConnectionRequest](CreateNcwConnectionRequest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateRequest;
import com.fireblocks.sdk.model.CreateConnectionRequest;
import com.fireblocks.sdk.model.CreateNcwConnectionRequest;

public class Example {
    public static void main(String[] args) {
        CreateRequest exampleCreateRequest = new CreateRequest();

        // create a new CreateConnectionRequest
        CreateConnectionRequest exampleCreateConnectionRequest = new CreateConnectionRequest();
        // set CreateRequest to CreateConnectionRequest
        exampleCreateRequest.setActualInstance(exampleCreateConnectionRequest);
        // to get back the CreateConnectionRequest set earlier
        CreateConnectionRequest testCreateConnectionRequest = (CreateConnectionRequest) exampleCreateRequest.getActualInstance();

        // create a new CreateNcwConnectionRequest
        CreateNcwConnectionRequest exampleCreateNcwConnectionRequest = new CreateNcwConnectionRequest();
        // set CreateRequest to CreateNcwConnectionRequest
        exampleCreateRequest.setActualInstance(exampleCreateNcwConnectionRequest);
        // to get back the CreateNcwConnectionRequest set earlier
        CreateNcwConnectionRequest testCreateNcwConnectionRequest = (CreateNcwConnectionRequest) exampleCreateRequest.getActualInstance();
    }
}
```


