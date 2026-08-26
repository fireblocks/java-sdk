

# UpdateFindingExternalRequest

Request to update the status of a FSPM finding. Only OPEN (reopen) and ACCEPTED (accept) are settable; findings become RESOLVED via automated detection, not through this API. `statusUpdatedReason` is required when accepting a finding and ignored when reopening.

## oneOf schemas
* [AcceptFindingRequest](AcceptFindingRequest.md)
* [ReopenFindingRequest](ReopenFindingRequest.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.UpdateFindingExternalRequest;
import com.fireblocks.sdk.model.AcceptFindingRequest;
import com.fireblocks.sdk.model.ReopenFindingRequest;

public class Example {
    public static void main(String[] args) {
        UpdateFindingExternalRequest exampleUpdateFindingExternalRequest = new UpdateFindingExternalRequest();

        // create a new AcceptFindingRequest
        AcceptFindingRequest exampleAcceptFindingRequest = new AcceptFindingRequest();
        // set UpdateFindingExternalRequest to AcceptFindingRequest
        exampleUpdateFindingExternalRequest.setActualInstance(exampleAcceptFindingRequest);
        // to get back the AcceptFindingRequest set earlier
        AcceptFindingRequest testAcceptFindingRequest = (AcceptFindingRequest) exampleUpdateFindingExternalRequest.getActualInstance();

        // create a new ReopenFindingRequest
        ReopenFindingRequest exampleReopenFindingRequest = new ReopenFindingRequest();
        // set UpdateFindingExternalRequest to ReopenFindingRequest
        exampleUpdateFindingExternalRequest.setActualInstance(exampleReopenFindingRequest);
        // to get back the ReopenFindingRequest set earlier
        ReopenFindingRequest testReopenFindingRequest = (ReopenFindingRequest) exampleUpdateFindingExternalRequest.getActualInstance();
    }
}
```


