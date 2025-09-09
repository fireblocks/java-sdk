

# TradingProvider

## oneOf schemas
* [AccountBasedAccessProvider](AccountBasedAccessProvider.md)
* [DirectAccessProvider](DirectAccessProvider.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TradingProvider;
import com.fireblocks.sdk.model.AccountBasedAccessProvider;
import com.fireblocks.sdk.model.DirectAccessProvider;

public class Example {
    public static void main(String[] args) {
        TradingProvider exampleTradingProvider = new TradingProvider();

        // create a new AccountBasedAccessProvider
        AccountBasedAccessProvider exampleAccountBasedAccessProvider = new AccountBasedAccessProvider();
        // set TradingProvider to AccountBasedAccessProvider
        exampleTradingProvider.setActualInstance(exampleAccountBasedAccessProvider);
        // to get back the AccountBasedAccessProvider set earlier
        AccountBasedAccessProvider testAccountBasedAccessProvider = (AccountBasedAccessProvider) exampleTradingProvider.getActualInstance();

        // create a new DirectAccessProvider
        DirectAccessProvider exampleDirectAccessProvider = new DirectAccessProvider();
        // set TradingProvider to DirectAccessProvider
        exampleTradingProvider.setActualInstance(exampleDirectAccessProvider);
        // to get back the DirectAccessProvider set earlier
        DirectAccessProvider testDirectAccessProvider = (DirectAccessProvider) exampleTradingProvider.getActualInstance();
    }
}
```


