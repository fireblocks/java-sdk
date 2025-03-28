

# CreateMultichainTokenRequestDtoCreateParams

## oneOf schemas
* [EVMTokenCreateParamsDto](EVMTokenCreateParamsDto.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateMultichainTokenRequestDtoCreateParams;
import com.fireblocks.sdk.model.EVMTokenCreateParamsDto;

public class Example {
    public static void main(String[] args) {
        CreateMultichainTokenRequestDtoCreateParams exampleCreateMultichainTokenRequestDtoCreateParams = new CreateMultichainTokenRequestDtoCreateParams();

        // create a new EVMTokenCreateParamsDto
        EVMTokenCreateParamsDto exampleEVMTokenCreateParamsDto = new EVMTokenCreateParamsDto();
        // set CreateMultichainTokenRequestDtoCreateParams to EVMTokenCreateParamsDto
        exampleCreateMultichainTokenRequestDtoCreateParams.setActualInstance(exampleEVMTokenCreateParamsDto);
        // to get back the EVMTokenCreateParamsDto set earlier
        EVMTokenCreateParamsDto testEVMTokenCreateParamsDto = (EVMTokenCreateParamsDto) exampleCreateMultichainTokenRequestDtoCreateParams.getActualInstance();
    }
}
```


