

# ExecuteActionResponse

## oneOf schemas
* [Object](Object.md)
* [StakeResponseDto](StakeResponseDto.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ExecuteActionResponse;
import com.fireblocks.sdk.model.Object;
import com.fireblocks.sdk.model.StakeResponseDto;

public class Example {
    public static void main(String[] args) {
        ExecuteActionResponse exampleExecuteActionResponse = new ExecuteActionResponse();

        // create a new Object
        Object exampleObject = new Object();
        // set ExecuteActionResponse to Object
        exampleExecuteActionResponse.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleExecuteActionResponse.getActualInstance();

        // create a new StakeResponseDto
        StakeResponseDto exampleStakeResponseDto = new StakeResponseDto();
        // set ExecuteActionResponse to StakeResponseDto
        exampleExecuteActionResponse.setActualInstance(exampleStakeResponseDto);
        // to get back the StakeResponseDto set earlier
        StakeResponseDto testStakeResponseDto = (StakeResponseDto) exampleExecuteActionResponse.getActualInstance();
    }
}
```


