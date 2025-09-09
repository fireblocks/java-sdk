

# QuoteExecutionWithRequoteResponseDetailsAllOfReQuote

## oneOf schemas
* [MarketRequoteRequestDetails](MarketRequoteRequestDetails.md)
* [RetryRequoteRequestDetails](RetryRequoteRequestDetails.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.QuoteExecutionWithRequoteResponseDetailsAllOfReQuote;
import com.fireblocks.sdk.model.MarketRequoteRequestDetails;
import com.fireblocks.sdk.model.RetryRequoteRequestDetails;

public class Example {
    public static void main(String[] args) {
        QuoteExecutionWithRequoteResponseDetailsAllOfReQuote exampleQuoteExecutionWithRequoteResponseDetailsAllOfReQuote = new QuoteExecutionWithRequoteResponseDetailsAllOfReQuote();

        // create a new MarketRequoteRequestDetails
        MarketRequoteRequestDetails exampleMarketRequoteRequestDetails = new MarketRequoteRequestDetails();
        // set QuoteExecutionWithRequoteResponseDetailsAllOfReQuote to MarketRequoteRequestDetails
        exampleQuoteExecutionWithRequoteResponseDetailsAllOfReQuote.setActualInstance(exampleMarketRequoteRequestDetails);
        // to get back the MarketRequoteRequestDetails set earlier
        MarketRequoteRequestDetails testMarketRequoteRequestDetails = (MarketRequoteRequestDetails) exampleQuoteExecutionWithRequoteResponseDetailsAllOfReQuote.getActualInstance();

        // create a new RetryRequoteRequestDetails
        RetryRequoteRequestDetails exampleRetryRequoteRequestDetails = new RetryRequoteRequestDetails();
        // set QuoteExecutionWithRequoteResponseDetailsAllOfReQuote to RetryRequoteRequestDetails
        exampleQuoteExecutionWithRequoteResponseDetailsAllOfReQuote.setActualInstance(exampleRetryRequoteRequestDetails);
        // to get back the RetryRequoteRequestDetails set earlier
        RetryRequoteRequestDetails testRetryRequoteRequestDetails = (RetryRequoteRequestDetails) exampleQuoteExecutionWithRequoteResponseDetailsAllOfReQuote.getActualInstance();
    }
}
```


