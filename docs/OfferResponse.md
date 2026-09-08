

# OfferResponse

## oneOf schemas
* [OfferResponseAllocation](OfferResponseAllocation.md)
* [OfferResponseOnboarding](OfferResponseOnboarding.md)
* [OfferResponseTransfer](OfferResponseTransfer.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.OfferResponse;
import com.fireblocks.sdk.model.OfferResponseAllocation;
import com.fireblocks.sdk.model.OfferResponseOnboarding;
import com.fireblocks.sdk.model.OfferResponseTransfer;

public class Example {
    public static void main(String[] args) {
        OfferResponse exampleOfferResponse = new OfferResponse();

        // create a new OfferResponseAllocation
        OfferResponseAllocation exampleOfferResponseAllocation = new OfferResponseAllocation();
        // set OfferResponse to OfferResponseAllocation
        exampleOfferResponse.setActualInstance(exampleOfferResponseAllocation);
        // to get back the OfferResponseAllocation set earlier
        OfferResponseAllocation testOfferResponseAllocation = (OfferResponseAllocation) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseOnboarding
        OfferResponseOnboarding exampleOfferResponseOnboarding = new OfferResponseOnboarding();
        // set OfferResponse to OfferResponseOnboarding
        exampleOfferResponse.setActualInstance(exampleOfferResponseOnboarding);
        // to get back the OfferResponseOnboarding set earlier
        OfferResponseOnboarding testOfferResponseOnboarding = (OfferResponseOnboarding) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseTransfer
        OfferResponseTransfer exampleOfferResponseTransfer = new OfferResponseTransfer();
        // set OfferResponse to OfferResponseTransfer
        exampleOfferResponse.setActualInstance(exampleOfferResponseTransfer);
        // to get back the OfferResponseTransfer set earlier
        OfferResponseTransfer testOfferResponseTransfer = (OfferResponseTransfer) exampleOfferResponse.getActualInstance();
    }
}
```


