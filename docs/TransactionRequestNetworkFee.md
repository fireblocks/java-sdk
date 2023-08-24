

# TransactionRequestNetworkFee

For EVM-based blockchains only. The total transaction fee in the blockchain’s largest unit. Note: Only two of the three arguments can be specified in a single transaction: `gasLimit`, `gasPrice` and `networkFee`. Fireblocks recommends using a numeric string for accurate precision. Although a number input exists, it is deprecated. - The transaction blockchain fee. - For Ethereum, you can't pass gasPrice, gasLimit and networkFee all together. - A numeric value representation is required.

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransactionRequestNetworkFee;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        TransactionRequestNetworkFee exampleTransactionRequestNetworkFee = new TransactionRequestNetworkFee();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set TransactionRequestNetworkFee to BigDecimal
        exampleTransactionRequestNetworkFee.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleTransactionRequestNetworkFee.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set TransactionRequestNetworkFee to String
        exampleTransactionRequestNetworkFee.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleTransactionRequestNetworkFee.getActualInstance();
    }
}
```


