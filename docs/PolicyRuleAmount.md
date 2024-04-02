

# PolicyRuleAmount

Defines the value a transaction must exceed for the rule to apply to it (according to the amountCurrency field)

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.PolicyRuleAmount;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        PolicyRuleAmount examplePolicyRuleAmount = new PolicyRuleAmount();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set PolicyRuleAmount to BigDecimal
        examplePolicyRuleAmount.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) examplePolicyRuleAmount.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set PolicyRuleAmount to String
        examplePolicyRuleAmount.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) examplePolicyRuleAmount.getActualInstance();
    }
}
```


