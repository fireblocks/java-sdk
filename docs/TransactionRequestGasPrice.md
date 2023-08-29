

# TransactionRequestGasPrice

For non-EIP-1559, EVM-based transactions. Price per gas unit (in Ethereum this is specified in Gwei).  Note: Only two of the three arguments can be specified in a single transaction: `gasLimit`, `gasPrice` and `networkFee`. Fireblocks recommends using a numeric string for accurate precision.  Although a number input exists, it is deprecated.

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransactionRequestGasPrice;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        TransactionRequestGasPrice exampleTransactionRequestGasPrice = new TransactionRequestGasPrice();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set TransactionRequestGasPrice to BigDecimal
        exampleTransactionRequestGasPrice.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleTransactionRequestGasPrice.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TransactionRequestGasPrice to String
        exampleTransactionRequestGasPrice.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTransactionRequestGasPrice.getActualInstance();
    }
}
```


