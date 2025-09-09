

# QuoteExecutionWithRequoteRequestDetailsAllOfReQuote

## oneOf schemas
* [MarketRequoteRequestDetails](MarketRequoteRequestDetails.md)
* [RetryRequoteRequestDetails](RetryRequoteRequestDetails.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.QuoteExecutionWithRequoteRequestDetailsAllOfReQuote;
import com.fireblocks.sdk.model.MarketRequoteRequestDetails;
import com.fireblocks.sdk.model.RetryRequoteRequestDetails;

public class Example {
    public static void main(String[] args) {
        QuoteExecutionWithRequoteRequestDetailsAllOfReQuote exampleQuoteExecutionWithRequoteRequestDetailsAllOfReQuote = new QuoteExecutionWithRequoteRequestDetailsAllOfReQuote();

        // create a new MarketRequoteRequestDetails
        MarketRequoteRequestDetails exampleMarketRequoteRequestDetails = new MarketRequoteRequestDetails();
        // set QuoteExecutionWithRequoteRequestDetailsAllOfReQuote to MarketRequoteRequestDetails
        exampleQuoteExecutionWithRequoteRequestDetailsAllOfReQuote.setActualInstance(exampleMarketRequoteRequestDetails);
        // to get back the MarketRequoteRequestDetails set earlier
        MarketRequoteRequestDetails testMarketRequoteRequestDetails = (MarketRequoteRequestDetails) exampleQuoteExecutionWithRequoteRequestDetailsAllOfReQuote.getActualInstance();

        // create a new RetryRequoteRequestDetails
        RetryRequoteRequestDetails exampleRetryRequoteRequestDetails = new RetryRequoteRequestDetails();
        // set QuoteExecutionWithRequoteRequestDetailsAllOfReQuote to RetryRequoteRequestDetails
        exampleQuoteExecutionWithRequoteRequestDetailsAllOfReQuote.setActualInstance(exampleRetryRequoteRequestDetails);
        // to get back the RetryRequoteRequestDetails set earlier
        RetryRequoteRequestDetails testRetryRequoteRequestDetails = (RetryRequoteRequestDetails) exampleQuoteExecutionWithRequoteRequestDetailsAllOfReQuote.getActualInstance();
    }
}
```


