

# LegacyPolicyRuleAmount

Defines the value a transaction must exceed for the rule to apply to it (according to the amountCurrency field)

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.LegacyPolicyRuleAmount;
import com.fireblocks.sdk.model.BigDecimal;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        LegacyPolicyRuleAmount exampleLegacyPolicyRuleAmount = new LegacyPolicyRuleAmount();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set LegacyPolicyRuleAmount to BigDecimal
        exampleLegacyPolicyRuleAmount.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleLegacyPolicyRuleAmount.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set LegacyPolicyRuleAmount to String
        exampleLegacyPolicyRuleAmount.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLegacyPolicyRuleAmount.getActualInstance();
    }
}
```


