

# TransferReceipt

## oneOf schemas
* [BlockchainTransfer](BlockchainTransfer.md)
* [FiatTransfer](FiatTransfer.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.TransferReceipt;
import com.fireblocks.sdk.model.BlockchainTransfer;
import com.fireblocks.sdk.model.FiatTransfer;

public class Example {
    public static void main(String[] args) {
        TransferReceipt exampleTransferReceipt = new TransferReceipt();

        // create a new BlockchainTransfer
        BlockchainTransfer exampleBlockchainTransfer = new BlockchainTransfer();
        // set TransferReceipt to BlockchainTransfer
        exampleTransferReceipt.setActualInstance(exampleBlockchainTransfer);
        // to get back the BlockchainTransfer set earlier
        BlockchainTransfer testBlockchainTransfer = (BlockchainTransfer) exampleTransferReceipt.getActualInstance();

        // create a new FiatTransfer
        FiatTransfer exampleFiatTransfer = new FiatTransfer();
        // set TransferReceipt to FiatTransfer
        exampleTransferReceipt.setActualInstance(exampleFiatTransfer);
        // to get back the FiatTransfer set earlier
        FiatTransfer testFiatTransfer = (FiatTransfer) exampleTransferReceipt.getActualInstance();
    }
}
```


