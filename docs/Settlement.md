

# Settlement

Settlement configuration for the order

## oneOf schemas
* [DVPSettlement](DVPSettlement.md)
* [PostOrderSettlement](PostOrderSettlement.md)
* [PrefundedSettlement](PrefundedSettlement.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.Settlement;
import com.fireblocks.sdk.model.DVPSettlement;
import com.fireblocks.sdk.model.PostOrderSettlement;
import com.fireblocks.sdk.model.PrefundedSettlement;

public class Example {
    public static void main(String[] args) {
        Settlement exampleSettlement = new Settlement();

        // create a new DVPSettlement
        DVPSettlement exampleDVPSettlement = new DVPSettlement();
        // set Settlement to DVPSettlement
        exampleSettlement.setActualInstance(exampleDVPSettlement);
        // to get back the DVPSettlement set earlier
        DVPSettlement testDVPSettlement = (DVPSettlement) exampleSettlement.getActualInstance();

        // create a new PostOrderSettlement
        PostOrderSettlement examplePostOrderSettlement = new PostOrderSettlement();
        // set Settlement to PostOrderSettlement
        exampleSettlement.setActualInstance(examplePostOrderSettlement);
        // to get back the PostOrderSettlement set earlier
        PostOrderSettlement testPostOrderSettlement = (PostOrderSettlement) exampleSettlement.getActualInstance();

        // create a new PrefundedSettlement
        PrefundedSettlement examplePrefundedSettlement = new PrefundedSettlement();
        // set Settlement to PrefundedSettlement
        exampleSettlement.setActualInstance(examplePrefundedSettlement);
        // to get back the PrefundedSettlement set earlier
        PrefundedSettlement testPrefundedSettlement = (PrefundedSettlement) exampleSettlement.getActualInstance();
    }
}
```


