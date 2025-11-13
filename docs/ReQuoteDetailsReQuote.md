

# ReQuoteDetailsReQuote

## oneOf schemas
* [MarketRequoteRequestDetails](MarketRequoteRequestDetails.md)
* [RetryRequoteRequestDetails](RetryRequoteRequestDetails.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ReQuoteDetailsReQuote;
import com.fireblocks.sdk.model.MarketRequoteRequestDetails;
import com.fireblocks.sdk.model.RetryRequoteRequestDetails;

public class Example {
    public static void main(String[] args) {
        ReQuoteDetailsReQuote exampleReQuoteDetailsReQuote = new ReQuoteDetailsReQuote();

        // create a new MarketRequoteRequestDetails
        MarketRequoteRequestDetails exampleMarketRequoteRequestDetails = new MarketRequoteRequestDetails();
        // set ReQuoteDetailsReQuote to MarketRequoteRequestDetails
        exampleReQuoteDetailsReQuote.setActualInstance(exampleMarketRequoteRequestDetails);
        // to get back the MarketRequoteRequestDetails set earlier
        MarketRequoteRequestDetails testMarketRequoteRequestDetails = (MarketRequoteRequestDetails) exampleReQuoteDetailsReQuote.getActualInstance();

        // create a new RetryRequoteRequestDetails
        RetryRequoteRequestDetails exampleRetryRequoteRequestDetails = new RetryRequoteRequestDetails();
        // set ReQuoteDetailsReQuote to RetryRequoteRequestDetails
        exampleReQuoteDetailsReQuote.setActualInstance(exampleRetryRequoteRequestDetails);
        // to get back the RetryRequoteRequestDetails set earlier
        RetryRequoteRequestDetails testRetryRequoteRequestDetails = (RetryRequoteRequestDetails) exampleReQuoteDetailsReQuote.getActualInstance();
    }
}
```


