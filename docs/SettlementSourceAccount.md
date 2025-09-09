

# SettlementSourceAccount

## oneOf schemas
* [ExternalAccount](ExternalAccount.md)
* [PlatformAccount](PlatformAccount.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.SettlementSourceAccount;
import com.fireblocks.sdk.model.ExternalAccount;
import com.fireblocks.sdk.model.PlatformAccount;

public class Example {
    public static void main(String[] args) {
        SettlementSourceAccount exampleSettlementSourceAccount = new SettlementSourceAccount();

        // create a new ExternalAccount
        ExternalAccount exampleExternalAccount = new ExternalAccount();
        // set SettlementSourceAccount to ExternalAccount
        exampleSettlementSourceAccount.setActualInstance(exampleExternalAccount);
        // to get back the ExternalAccount set earlier
        ExternalAccount testExternalAccount = (ExternalAccount) exampleSettlementSourceAccount.getActualInstance();

        // create a new PlatformAccount
        PlatformAccount examplePlatformAccount = new PlatformAccount();
        // set SettlementSourceAccount to PlatformAccount
        exampleSettlementSourceAccount.setActualInstance(examplePlatformAccount);
        // to get back the PlatformAccount set earlier
        PlatformAccount testPlatformAccount = (PlatformAccount) exampleSettlementSourceAccount.getActualInstance();
    }
}
```


