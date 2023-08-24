

# TransactionRequestFee

For UTXO-based blockchains, the fee per bytes in the asset’s smallest unit (Satoshi, Latoshi, etc.).  For Ripple, the fee for the transaction. Fireblocks recommends using a numeric string for accurate precision. Although a number input exists, it is deprecated.

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransactionRequestFee;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        TransactionRequestFee exampleTransactionRequestFee = new TransactionRequestFee();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set TransactionRequestFee to BigDecimal
        exampleTransactionRequestFee.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleTransactionRequestFee.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TransactionRequestFee to String
        exampleTransactionRequestFee.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTransactionRequestFee.getActualInstance();
    }
}
```


