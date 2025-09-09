

# AccessType

## oneOf schemas
* [AccountAccess](AccountAccess.md)
* [DirectAccess](DirectAccess.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AccessType;
import com.fireblocks.sdk.model.AccountAccess;
import com.fireblocks.sdk.model.DirectAccess;

public class Example {
    public static void main(String[] args) {
        AccessType exampleAccessType = new AccessType();

        // create a new AccountAccess
        AccountAccess exampleAccountAccess = new AccountAccess();
        // set AccessType to AccountAccess
        exampleAccessType.setActualInstance(exampleAccountAccess);
        // to get back the AccountAccess set earlier
        AccountAccess testAccountAccess = (AccountAccess) exampleAccessType.getActualInstance();

        // create a new DirectAccess
        DirectAccess exampleDirectAccess = new DirectAccess();
        // set AccessType to DirectAccess
        exampleAccessType.setActualInstance(exampleDirectAccess);
        // to get back the DirectAccess set earlier
        DirectAccess testDirectAccess = (DirectAccess) exampleAccessType.getActualInstance();
    }
}
```


