

# TransactionRequestAmount

For `TRANSFER` operations, the requested amount to transfer, in the asset’s unit. Fireblocks recommends using a numeric string for accurate precision. Although a number input exists, it is deprecated.

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransactionRequestAmount;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        TransactionRequestAmount exampleTransactionRequestAmount = new TransactionRequestAmount();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set TransactionRequestAmount to BigDecimal
        exampleTransactionRequestAmount.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleTransactionRequestAmount.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TransactionRequestAmount to String
        exampleTransactionRequestAmount.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTransactionRequestAmount.getActualInstance();
    }
}
```


