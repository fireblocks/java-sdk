

# ConfigOperationSnapshot

## oneOf schemas
* [ConfigConversionOperationSnapshot](ConfigConversionOperationSnapshot.md)
* [ConfigDisbursementOperationSnapshot](ConfigDisbursementOperationSnapshot.md)
* [ConfigTransferOperationSnapshot](ConfigTransferOperationSnapshot.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ConfigOperationSnapshot;
import com.fireblocks.sdk.model.ConfigConversionOperationSnapshot;
import com.fireblocks.sdk.model.ConfigDisbursementOperationSnapshot;
import com.fireblocks.sdk.model.ConfigTransferOperationSnapshot;

public class Example {
    public static void main(String[] args) {
        ConfigOperationSnapshot exampleConfigOperationSnapshot = new ConfigOperationSnapshot();

        // create a new ConfigConversionOperationSnapshot
        ConfigConversionOperationSnapshot exampleConfigConversionOperationSnapshot = new ConfigConversionOperationSnapshot();
        // set ConfigOperationSnapshot to ConfigConversionOperationSnapshot
        exampleConfigOperationSnapshot.setActualInstance(exampleConfigConversionOperationSnapshot);
        // to get back the ConfigConversionOperationSnapshot set earlier
        ConfigConversionOperationSnapshot testConfigConversionOperationSnapshot = (ConfigConversionOperationSnapshot) exampleConfigOperationSnapshot.getActualInstance();

        // create a new ConfigDisbursementOperationSnapshot
        ConfigDisbursementOperationSnapshot exampleConfigDisbursementOperationSnapshot = new ConfigDisbursementOperationSnapshot();
        // set ConfigOperationSnapshot to ConfigDisbursementOperationSnapshot
        exampleConfigOperationSnapshot.setActualInstance(exampleConfigDisbursementOperationSnapshot);
        // to get back the ConfigDisbursementOperationSnapshot set earlier
        ConfigDisbursementOperationSnapshot testConfigDisbursementOperationSnapshot = (ConfigDisbursementOperationSnapshot) exampleConfigOperationSnapshot.getActualInstance();

        // create a new ConfigTransferOperationSnapshot
        ConfigTransferOperationSnapshot exampleConfigTransferOperationSnapshot = new ConfigTransferOperationSnapshot();
        // set ConfigOperationSnapshot to ConfigTransferOperationSnapshot
        exampleConfigOperationSnapshot.setActualInstance(exampleConfigTransferOperationSnapshot);
        // to get back the ConfigTransferOperationSnapshot set earlier
        ConfigTransferOperationSnapshot testConfigTransferOperationSnapshot = (ConfigTransferOperationSnapshot) exampleConfigOperationSnapshot.getActualInstance();
    }
}
```


