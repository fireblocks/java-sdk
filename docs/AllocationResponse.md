

# AllocationResponse

## oneOf schemas
* [AllocationResponseAccept](AllocationResponseAccept.md)
* [AllocationResponseReject](AllocationResponseReject.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AllocationResponse;
import com.fireblocks.sdk.model.AllocationResponseAccept;
import com.fireblocks.sdk.model.AllocationResponseReject;

public class Example {
    public static void main(String[] args) {
        AllocationResponse exampleAllocationResponse = new AllocationResponse();

        // create a new AllocationResponseAccept
        AllocationResponseAccept exampleAllocationResponseAccept = new AllocationResponseAccept();
        // set AllocationResponse to AllocationResponseAccept
        exampleAllocationResponse.setActualInstance(exampleAllocationResponseAccept);
        // to get back the AllocationResponseAccept set earlier
        AllocationResponseAccept testAllocationResponseAccept = (AllocationResponseAccept) exampleAllocationResponse.getActualInstance();

        // create a new AllocationResponseReject
        AllocationResponseReject exampleAllocationResponseReject = new AllocationResponseReject();
        // set AllocationResponse to AllocationResponseReject
        exampleAllocationResponse.setActualInstance(exampleAllocationResponseReject);
        // to get back the AllocationResponseReject set earlier
        AllocationResponseReject testAllocationResponseReject = (AllocationResponseReject) exampleAllocationResponse.getActualInstance();
    }
}
```


