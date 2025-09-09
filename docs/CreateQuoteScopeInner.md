

# CreateQuoteScopeInner

## oneOf schemas
* [AccountProviderID](AccountProviderID.md)
* [ProviderID](ProviderID.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateQuoteScopeInner;
import com.fireblocks.sdk.model.AccountProviderID;
import com.fireblocks.sdk.model.ProviderID;

public class Example {
    public static void main(String[] args) {
        CreateQuoteScopeInner exampleCreateQuoteScopeInner = new CreateQuoteScopeInner();

        // create a new AccountProviderID
        AccountProviderID exampleAccountProviderID = new AccountProviderID();
        // set CreateQuoteScopeInner to AccountProviderID
        exampleCreateQuoteScopeInner.setActualInstance(exampleAccountProviderID);
        // to get back the AccountProviderID set earlier
        AccountProviderID testAccountProviderID = (AccountProviderID) exampleCreateQuoteScopeInner.getActualInstance();

        // create a new ProviderID
        ProviderID exampleProviderID = new ProviderID();
        // set CreateQuoteScopeInner to ProviderID
        exampleCreateQuoteScopeInner.setActualInstance(exampleProviderID);
        // to get back the ProviderID set earlier
        ProviderID testProviderID = (ProviderID) exampleCreateQuoteScopeInner.getActualInstance();
    }
}
```


