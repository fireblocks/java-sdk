

# TransactionRequestNetworkStaking

This feature is no longer supported.

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransactionRequestNetworkStaking;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        TransactionRequestNetworkStaking exampleTransactionRequestNetworkStaking = new TransactionRequestNetworkStaking();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set TransactionRequestNetworkStaking to BigDecimal
        exampleTransactionRequestNetworkStaking.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleTransactionRequestNetworkStaking.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TransactionRequestNetworkStaking to String
        exampleTransactionRequestNetworkStaking.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTransactionRequestNetworkStaking.getActualInstance();
    }
}
```


