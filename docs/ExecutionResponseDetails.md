

# ExecutionResponseDetails

## oneOf schemas
* [LimitExecutionResponseDetails](LimitExecutionResponseDetails.md)
* [MarketExecutionResponseDetails](MarketExecutionResponseDetails.md)
* [QuoteExecutionWithRequoteResponseDetails](QuoteExecutionWithRequoteResponseDetails.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ExecutionResponseDetails;
import com.fireblocks.sdk.model.LimitExecutionResponseDetails;
import com.fireblocks.sdk.model.MarketExecutionResponseDetails;
import com.fireblocks.sdk.model.QuoteExecutionWithRequoteResponseDetails;

public class Example {
    public static void main(String[] args) {
        ExecutionResponseDetails exampleExecutionResponseDetails = new ExecutionResponseDetails();

        // create a new LimitExecutionResponseDetails
        LimitExecutionResponseDetails exampleLimitExecutionResponseDetails = new LimitExecutionResponseDetails();
        // set ExecutionResponseDetails to LimitExecutionResponseDetails
        exampleExecutionResponseDetails.setActualInstance(exampleLimitExecutionResponseDetails);
        // to get back the LimitExecutionResponseDetails set earlier
        LimitExecutionResponseDetails testLimitExecutionResponseDetails = (LimitExecutionResponseDetails) exampleExecutionResponseDetails.getActualInstance();

        // create a new MarketExecutionResponseDetails
        MarketExecutionResponseDetails exampleMarketExecutionResponseDetails = new MarketExecutionResponseDetails();
        // set ExecutionResponseDetails to MarketExecutionResponseDetails
        exampleExecutionResponseDetails.setActualInstance(exampleMarketExecutionResponseDetails);
        // to get back the MarketExecutionResponseDetails set earlier
        MarketExecutionResponseDetails testMarketExecutionResponseDetails = (MarketExecutionResponseDetails) exampleExecutionResponseDetails.getActualInstance();

        // create a new QuoteExecutionWithRequoteResponseDetails
        QuoteExecutionWithRequoteResponseDetails exampleQuoteExecutionWithRequoteResponseDetails = new QuoteExecutionWithRequoteResponseDetails();
        // set ExecutionResponseDetails to QuoteExecutionWithRequoteResponseDetails
        exampleExecutionResponseDetails.setActualInstance(exampleQuoteExecutionWithRequoteResponseDetails);
        // to get back the QuoteExecutionWithRequoteResponseDetails set earlier
        QuoteExecutionWithRequoteResponseDetails testQuoteExecutionWithRequoteResponseDetails = (QuoteExecutionWithRequoteResponseDetails) exampleExecutionResponseDetails.getActualInstance();
    }
}
```


