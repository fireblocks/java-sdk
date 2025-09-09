

# ExecutionRequestDetails

Order execution details

## oneOf schemas
* [LimitExecutionRequestDetails](LimitExecutionRequestDetails.md)
* [MarketExecutionRequestDetails](MarketExecutionRequestDetails.md)
* [QuoteExecutionWithRequoteRequestDetails](QuoteExecutionWithRequoteRequestDetails.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ExecutionRequestDetails;
import com.fireblocks.sdk.model.LimitExecutionRequestDetails;
import com.fireblocks.sdk.model.MarketExecutionRequestDetails;
import com.fireblocks.sdk.model.QuoteExecutionWithRequoteRequestDetails;

public class Example {
    public static void main(String[] args) {
        ExecutionRequestDetails exampleExecutionRequestDetails = new ExecutionRequestDetails();

        // create a new LimitExecutionRequestDetails
        LimitExecutionRequestDetails exampleLimitExecutionRequestDetails = new LimitExecutionRequestDetails();
        // set ExecutionRequestDetails to LimitExecutionRequestDetails
        exampleExecutionRequestDetails.setActualInstance(exampleLimitExecutionRequestDetails);
        // to get back the LimitExecutionRequestDetails set earlier
        LimitExecutionRequestDetails testLimitExecutionRequestDetails = (LimitExecutionRequestDetails) exampleExecutionRequestDetails.getActualInstance();

        // create a new MarketExecutionRequestDetails
        MarketExecutionRequestDetails exampleMarketExecutionRequestDetails = new MarketExecutionRequestDetails();
        // set ExecutionRequestDetails to MarketExecutionRequestDetails
        exampleExecutionRequestDetails.setActualInstance(exampleMarketExecutionRequestDetails);
        // to get back the MarketExecutionRequestDetails set earlier
        MarketExecutionRequestDetails testMarketExecutionRequestDetails = (MarketExecutionRequestDetails) exampleExecutionRequestDetails.getActualInstance();

        // create a new QuoteExecutionWithRequoteRequestDetails
        QuoteExecutionWithRequoteRequestDetails exampleQuoteExecutionWithRequoteRequestDetails = new QuoteExecutionWithRequoteRequestDetails();
        // set ExecutionRequestDetails to QuoteExecutionWithRequoteRequestDetails
        exampleExecutionRequestDetails.setActualInstance(exampleQuoteExecutionWithRequoteRequestDetails);
        // to get back the QuoteExecutionWithRequoteRequestDetails set earlier
        QuoteExecutionWithRequoteRequestDetails testQuoteExecutionWithRequoteRequestDetails = (QuoteExecutionWithRequoteRequestDetails) exampleExecutionRequestDetails.getActualInstance();
    }
}
```


