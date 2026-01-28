

# CreateTokenRequestDtoCreateParams

## oneOf schemas
* [EVMTokenCreateParamsDto](EVMTokenCreateParamsDto.md)
* [StellarRippleCreateParamsDto](StellarRippleCreateParamsDto.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.CreateTokenRequestDtoCreateParams;
import com.fireblocks.sdk.model.EVMTokenCreateParamsDto;
import com.fireblocks.sdk.model.StellarRippleCreateParamsDto;

public class Example {
    public static void main(String[] args) {
        CreateTokenRequestDtoCreateParams exampleCreateTokenRequestDtoCreateParams = new CreateTokenRequestDtoCreateParams();

        // create a new EVMTokenCreateParamsDto
        EVMTokenCreateParamsDto exampleEVMTokenCreateParamsDto = new EVMTokenCreateParamsDto();
        // set CreateTokenRequestDtoCreateParams to EVMTokenCreateParamsDto
        exampleCreateTokenRequestDtoCreateParams.setActualInstance(exampleEVMTokenCreateParamsDto);
        // to get back the EVMTokenCreateParamsDto set earlier
        EVMTokenCreateParamsDto testEVMTokenCreateParamsDto = (EVMTokenCreateParamsDto) exampleCreateTokenRequestDtoCreateParams.getActualInstance();

        // create a new StellarRippleCreateParamsDto
        StellarRippleCreateParamsDto exampleStellarRippleCreateParamsDto = new StellarRippleCreateParamsDto();
        // set CreateTokenRequestDtoCreateParams to StellarRippleCreateParamsDto
        exampleCreateTokenRequestDtoCreateParams.setActualInstance(exampleStellarRippleCreateParamsDto);
        // to get back the StellarRippleCreateParamsDto set earlier
        StellarRippleCreateParamsDto testStellarRippleCreateParamsDto = (StellarRippleCreateParamsDto) exampleCreateTokenRequestDtoCreateParams.getActualInstance();
    }
}
```


