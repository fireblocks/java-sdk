

# OfferResponse

## oneOf schemas
* [OfferResponseAllocationAccept](OfferResponseAllocationAccept.md)
* [OfferResponseAllocationReject](OfferResponseAllocationReject.md)
* [OfferResponseDtccOnboardingAccept](OfferResponseDtccOnboardingAccept.md)
* [OfferResponseDtccOnboardingReject](OfferResponseDtccOnboardingReject.md)
* [OfferResponseTradewebAccept](OfferResponseTradewebAccept.md)
* [OfferResponseTradewebReject](OfferResponseTradewebReject.md)
* [OfferResponseTransferAccept](OfferResponseTransferAccept.md)
* [OfferResponseTransferReject](OfferResponseTransferReject.md)
* [OfferResponseTransferWithdraw](OfferResponseTransferWithdraw.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.OfferResponse;
import com.fireblocks.sdk.model.OfferResponseAllocationAccept;
import com.fireblocks.sdk.model.OfferResponseAllocationReject;
import com.fireblocks.sdk.model.OfferResponseDtccOnboardingAccept;
import com.fireblocks.sdk.model.OfferResponseDtccOnboardingReject;
import com.fireblocks.sdk.model.OfferResponseTradewebAccept;
import com.fireblocks.sdk.model.OfferResponseTradewebReject;
import com.fireblocks.sdk.model.OfferResponseTransferAccept;
import com.fireblocks.sdk.model.OfferResponseTransferReject;
import com.fireblocks.sdk.model.OfferResponseTransferWithdraw;

public class Example {
    public static void main(String[] args) {
        OfferResponse exampleOfferResponse = new OfferResponse();

        // create a new OfferResponseAllocationAccept
        OfferResponseAllocationAccept exampleOfferResponseAllocationAccept = new OfferResponseAllocationAccept();
        // set OfferResponse to OfferResponseAllocationAccept
        exampleOfferResponse.setActualInstance(exampleOfferResponseAllocationAccept);
        // to get back the OfferResponseAllocationAccept set earlier
        OfferResponseAllocationAccept testOfferResponseAllocationAccept = (OfferResponseAllocationAccept) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseAllocationReject
        OfferResponseAllocationReject exampleOfferResponseAllocationReject = new OfferResponseAllocationReject();
        // set OfferResponse to OfferResponseAllocationReject
        exampleOfferResponse.setActualInstance(exampleOfferResponseAllocationReject);
        // to get back the OfferResponseAllocationReject set earlier
        OfferResponseAllocationReject testOfferResponseAllocationReject = (OfferResponseAllocationReject) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseDtccOnboardingAccept
        OfferResponseDtccOnboardingAccept exampleOfferResponseDtccOnboardingAccept = new OfferResponseDtccOnboardingAccept();
        // set OfferResponse to OfferResponseDtccOnboardingAccept
        exampleOfferResponse.setActualInstance(exampleOfferResponseDtccOnboardingAccept);
        // to get back the OfferResponseDtccOnboardingAccept set earlier
        OfferResponseDtccOnboardingAccept testOfferResponseDtccOnboardingAccept = (OfferResponseDtccOnboardingAccept) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseDtccOnboardingReject
        OfferResponseDtccOnboardingReject exampleOfferResponseDtccOnboardingReject = new OfferResponseDtccOnboardingReject();
        // set OfferResponse to OfferResponseDtccOnboardingReject
        exampleOfferResponse.setActualInstance(exampleOfferResponseDtccOnboardingReject);
        // to get back the OfferResponseDtccOnboardingReject set earlier
        OfferResponseDtccOnboardingReject testOfferResponseDtccOnboardingReject = (OfferResponseDtccOnboardingReject) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseTradewebAccept
        OfferResponseTradewebAccept exampleOfferResponseTradewebAccept = new OfferResponseTradewebAccept();
        // set OfferResponse to OfferResponseTradewebAccept
        exampleOfferResponse.setActualInstance(exampleOfferResponseTradewebAccept);
        // to get back the OfferResponseTradewebAccept set earlier
        OfferResponseTradewebAccept testOfferResponseTradewebAccept = (OfferResponseTradewebAccept) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseTradewebReject
        OfferResponseTradewebReject exampleOfferResponseTradewebReject = new OfferResponseTradewebReject();
        // set OfferResponse to OfferResponseTradewebReject
        exampleOfferResponse.setActualInstance(exampleOfferResponseTradewebReject);
        // to get back the OfferResponseTradewebReject set earlier
        OfferResponseTradewebReject testOfferResponseTradewebReject = (OfferResponseTradewebReject) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseTransferAccept
        OfferResponseTransferAccept exampleOfferResponseTransferAccept = new OfferResponseTransferAccept();
        // set OfferResponse to OfferResponseTransferAccept
        exampleOfferResponse.setActualInstance(exampleOfferResponseTransferAccept);
        // to get back the OfferResponseTransferAccept set earlier
        OfferResponseTransferAccept testOfferResponseTransferAccept = (OfferResponseTransferAccept) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseTransferReject
        OfferResponseTransferReject exampleOfferResponseTransferReject = new OfferResponseTransferReject();
        // set OfferResponse to OfferResponseTransferReject
        exampleOfferResponse.setActualInstance(exampleOfferResponseTransferReject);
        // to get back the OfferResponseTransferReject set earlier
        OfferResponseTransferReject testOfferResponseTransferReject = (OfferResponseTransferReject) exampleOfferResponse.getActualInstance();

        // create a new OfferResponseTransferWithdraw
        OfferResponseTransferWithdraw exampleOfferResponseTransferWithdraw = new OfferResponseTransferWithdraw();
        // set OfferResponse to OfferResponseTransferWithdraw
        exampleOfferResponse.setActualInstance(exampleOfferResponseTransferWithdraw);
        // to get back the OfferResponseTransferWithdraw set earlier
        OfferResponseTransferWithdraw testOfferResponseTransferWithdraw = (OfferResponseTransferWithdraw) exampleOfferResponse.getActualInstance();
    }
}
```


