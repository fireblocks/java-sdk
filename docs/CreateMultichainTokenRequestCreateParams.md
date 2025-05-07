

# CreateMultichainTokenRequestCreateParams

## oneOf schemas
* [EVMTokenCreateParamsDto](EVMTokenCreateParamsDto.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateMultichainTokenRequestCreateParams;
import com.fireblocks.sdk.model.EVMTokenCreateParamsDto;

public class Example {
    public static void main(String[] args) {
        CreateMultichainTokenRequestCreateParams exampleCreateMultichainTokenRequestCreateParams = new CreateMultichainTokenRequestCreateParams();

        // create a new EVMTokenCreateParamsDto
        EVMTokenCreateParamsDto exampleEVMTokenCreateParamsDto = new EVMTokenCreateParamsDto();
        // set CreateMultichainTokenRequestCreateParams to EVMTokenCreateParamsDto
        exampleCreateMultichainTokenRequestCreateParams.setActualInstance(exampleEVMTokenCreateParamsDto);
        // to get back the EVMTokenCreateParamsDto set earlier
        EVMTokenCreateParamsDto testEVMTokenCreateParamsDto = (EVMTokenCreateParamsDto) exampleCreateMultichainTokenRequestCreateParams.getActualInstance();
    }
}
```


