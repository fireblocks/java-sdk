

# TransactionRequestGasLimit

For EVM-based blockchains only. Units of gas required to process the transaction. Note: Only two of the three arguments can be specified in a single transaction: `gasLimit`, `gasPrice` and `networkFee`. Fireblocks recommends using a numeric string for accurate precision. Although a number input exists, it is deprecated.

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransactionRequestGasLimit;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        TransactionRequestGasLimit exampleTransactionRequestGasLimit = new TransactionRequestGasLimit();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set TransactionRequestGasLimit to BigDecimal
        exampleTransactionRequestGasLimit.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleTransactionRequestGasLimit.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TransactionRequestGasLimit to String
        exampleTransactionRequestGasLimit.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTransactionRequestGasLimit.getActualInstance();
    }
}
```


