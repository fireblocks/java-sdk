

# CreateQuoteScopeInner

## oneOf schemas
* [ScopeItem](ScopeItem.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateQuoteScopeInner;
import com.fireblocks.sdk.model.ScopeItem;

public class Example {
    public static void main(String[] args) {
        CreateQuoteScopeInner exampleCreateQuoteScopeInner = new CreateQuoteScopeInner();

        // create a new ScopeItem
        ScopeItem exampleScopeItem = new ScopeItem();
        // set CreateQuoteScopeInner to ScopeItem
        exampleCreateQuoteScopeInner.setActualInstance(exampleScopeItem);
        // to get back the ScopeItem set earlier
        ScopeItem testScopeItem = (ScopeItem) exampleCreateQuoteScopeInner.getActualInstance();
    }
}
```


