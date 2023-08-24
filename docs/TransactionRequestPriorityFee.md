

# TransactionRequestPriorityFee

For Ethereum-based blockchains only, the fee for EIP-1559 transaction pricing mechanism. Value is in Gwei.  Fireblocks recommends using a numeric string for accurate precision. Although a number input exists, it is deprecated.

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransactionRequestPriorityFee;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        TransactionRequestPriorityFee exampleTransactionRequestPriorityFee = new TransactionRequestPriorityFee();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set TransactionRequestPriorityFee to BigDecimal
        exampleTransactionRequestPriorityFee.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleTransactionRequestPriorityFee.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TransactionRequestPriorityFee to String
        exampleTransactionRequestPriorityFee.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTransactionRequestPriorityFee.getActualInstance();
    }
}
```


