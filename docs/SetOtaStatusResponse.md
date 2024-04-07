

# SetOtaStatusResponse

## oneOf schemas
* [SetOtaStatusResponseOneOf](SetOtaStatusResponseOneOf.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.SetOtaStatusResponse;
import com.fireblocks.sdk.model.SetOtaStatusResponseOneOf;
import com.fireblocks.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        SetOtaStatusResponse exampleSetOtaStatusResponse = new SetOtaStatusResponse();

        // create a new SetOtaStatusResponseOneOf
        SetOtaStatusResponseOneOf exampleSetOtaStatusResponseOneOf = new SetOtaStatusResponseOneOf();
        // set SetOtaStatusResponse to SetOtaStatusResponseOneOf
        exampleSetOtaStatusResponse.setActualInstance(exampleSetOtaStatusResponseOneOf);
        // to get back the SetOtaStatusResponseOneOf set earlier
        SetOtaStatusResponseOneOf testSetOtaStatusResponseOneOf = (SetOtaStatusResponseOneOf) exampleSetOtaStatusResponse.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set SetOtaStatusResponse to String
        exampleSetOtaStatusResponse.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleSetOtaStatusResponse.getActualInstance();
    }
}
```


