

# QuoteResponse

## oneOf schemas
* [NonWalletQuoteResponse](NonWalletQuoteResponse.md)
* [WalletQuoteResponse](WalletQuoteResponse.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.QuoteResponse;
import com.fireblocks.sdk.model.NonWalletQuoteResponse;
import com.fireblocks.sdk.model.WalletQuoteResponse;

public class Example {
    public static void main(String[] args) {
        QuoteResponse exampleQuoteResponse = new QuoteResponse();

        // create a new NonWalletQuoteResponse
        NonWalletQuoteResponse exampleNonWalletQuoteResponse = new NonWalletQuoteResponse();
        // set QuoteResponse to NonWalletQuoteResponse
        exampleQuoteResponse.setActualInstance(exampleNonWalletQuoteResponse);
        // to get back the NonWalletQuoteResponse set earlier
        NonWalletQuoteResponse testNonWalletQuoteResponse = (NonWalletQuoteResponse) exampleQuoteResponse.getActualInstance();

        // create a new WalletQuoteResponse
        WalletQuoteResponse exampleWalletQuoteResponse = new WalletQuoteResponse();
        // set QuoteResponse to WalletQuoteResponse
        exampleQuoteResponse.setActualInstance(exampleWalletQuoteResponse);
        // to get back the WalletQuoteResponse set earlier
        WalletQuoteResponse testWalletQuoteResponse = (WalletQuoteResponse) exampleQuoteResponse.getActualInstance();
    }
}
```


