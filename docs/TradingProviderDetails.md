

# TradingProviderDetails

## oneOf schemas
* [AccountBasedProviderDetails](AccountBasedProviderDetails.md)
* [DirectProviderDetails](DirectProviderDetails.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TradingProviderDetails;
import com.fireblocks.sdk.model.AccountBasedProviderDetails;
import com.fireblocks.sdk.model.DirectProviderDetails;

public class Example {
    public static void main(String[] args) {
        TradingProviderDetails exampleTradingProviderDetails = new TradingProviderDetails();

        // create a new AccountBasedProviderDetails
        AccountBasedProviderDetails exampleAccountBasedProviderDetails = new AccountBasedProviderDetails();
        // set TradingProviderDetails to AccountBasedProviderDetails
        exampleTradingProviderDetails.setActualInstance(exampleAccountBasedProviderDetails);
        // to get back the AccountBasedProviderDetails set earlier
        AccountBasedProviderDetails testAccountBasedProviderDetails = (AccountBasedProviderDetails) exampleTradingProviderDetails.getActualInstance();

        // create a new DirectProviderDetails
        DirectProviderDetails exampleDirectProviderDetails = new DirectProviderDetails();
        // set TradingProviderDetails to DirectProviderDetails
        exampleTradingProviderDetails.setActualInstance(exampleDirectProviderDetails);
        // to get back the DirectProviderDetails set earlier
        DirectProviderDetails testDirectProviderDetails = (DirectProviderDetails) exampleTradingProviderDetails.getActualInstance();
    }
}
```


