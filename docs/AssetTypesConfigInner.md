

# AssetTypesConfigInner

## oneOf schemas
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AssetTypesConfigInner;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        AssetTypesConfigInner exampleAssetTypesConfigInner = new AssetTypesConfigInner();

        // create a new String
        String exampleString = new String();
        // set AssetTypesConfigInner to String
        exampleAssetTypesConfigInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleAssetTypesConfigInner.getActualInstance();
    }
}
```


