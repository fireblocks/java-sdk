

# TransferResponse

## oneOf schemas
* [TransferResponseAccept](TransferResponseAccept.md)
* [TransferResponseReject](TransferResponseReject.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransferResponse;
import com.fireblocks.sdk.model.TransferResponseAccept;
import com.fireblocks.sdk.model.TransferResponseReject;

public class Example {
    public static void main(String[] args) {
        TransferResponse exampleTransferResponse = new TransferResponse();

        // create a new TransferResponseAccept
        TransferResponseAccept exampleTransferResponseAccept = new TransferResponseAccept();
        // set TransferResponse to TransferResponseAccept
        exampleTransferResponse.setActualInstance(exampleTransferResponseAccept);
        // to get back the TransferResponseAccept set earlier
        TransferResponseAccept testTransferResponseAccept = (TransferResponseAccept) exampleTransferResponse.getActualInstance();

        // create a new TransferResponseReject
        TransferResponseReject exampleTransferResponseReject = new TransferResponseReject();
        // set TransferResponse to TransferResponseReject
        exampleTransferResponse.setActualInstance(exampleTransferResponseReject);
        // to get back the TransferResponseReject set earlier
        TransferResponseReject testTransferResponseReject = (TransferResponseReject) exampleTransferResponse.getActualInstance();
    }
}
```


