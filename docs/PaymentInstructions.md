

# PaymentInstructions

## oneOf schemas
* [BlockchainDestination](BlockchainDestination.md)
* [PaymentInstructionsOneOf](PaymentInstructionsOneOf.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.PaymentInstructions;
import com.fireblocks.sdk.model.BlockchainDestination;
import com.fireblocks.sdk.model.PaymentInstructionsOneOf;

public class Example {
    public static void main(String[] args) {
        PaymentInstructions examplePaymentInstructions = new PaymentInstructions();

        // create a new BlockchainDestination
        BlockchainDestination exampleBlockchainDestination = new BlockchainDestination();
        // set PaymentInstructions to BlockchainDestination
        examplePaymentInstructions.setActualInstance(exampleBlockchainDestination);
        // to get back the BlockchainDestination set earlier
        BlockchainDestination testBlockchainDestination = (BlockchainDestination) examplePaymentInstructions.getActualInstance();

        // create a new PaymentInstructionsOneOf
        PaymentInstructionsOneOf examplePaymentInstructionsOneOf = new PaymentInstructionsOneOf();
        // set PaymentInstructions to PaymentInstructionsOneOf
        examplePaymentInstructions.setActualInstance(examplePaymentInstructionsOneOf);
        // to get back the PaymentInstructionsOneOf set earlier
        PaymentInstructionsOneOf testPaymentInstructionsOneOf = (PaymentInstructionsOneOf) examplePaymentInstructions.getActualInstance();
    }
}
```


