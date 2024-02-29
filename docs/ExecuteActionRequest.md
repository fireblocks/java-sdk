

# ExecuteActionRequest

## oneOf schemas
* [StakeRequestDto](StakeRequestDto.md)
* [UnstakeRequestDto](UnstakeRequestDto.md)
* [WithdrawRequestDto](WithdrawRequestDto.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ExecuteActionRequest;
import com.fireblocks.sdk.model.StakeRequestDto;
import com.fireblocks.sdk.model.UnstakeRequestDto;
import com.fireblocks.sdk.model.WithdrawRequestDto;

public class Example {
    public static void main(String[] args) {
        ExecuteActionRequest exampleExecuteActionRequest = new ExecuteActionRequest();

        // create a new StakeRequestDto
        StakeRequestDto exampleStakeRequestDto = new StakeRequestDto();
        // set ExecuteActionRequest to StakeRequestDto
        exampleExecuteActionRequest.setActualInstance(exampleStakeRequestDto);
        // to get back the StakeRequestDto set earlier
        StakeRequestDto testStakeRequestDto = (StakeRequestDto) exampleExecuteActionRequest.getActualInstance();

        // create a new UnstakeRequestDto
        UnstakeRequestDto exampleUnstakeRequestDto = new UnstakeRequestDto();
        // set ExecuteActionRequest to UnstakeRequestDto
        exampleExecuteActionRequest.setActualInstance(exampleUnstakeRequestDto);
        // to get back the UnstakeRequestDto set earlier
        UnstakeRequestDto testUnstakeRequestDto = (UnstakeRequestDto) exampleExecuteActionRequest.getActualInstance();

        // create a new WithdrawRequestDto
        WithdrawRequestDto exampleWithdrawRequestDto = new WithdrawRequestDto();
        // set ExecuteActionRequest to WithdrawRequestDto
        exampleExecuteActionRequest.setActualInstance(exampleWithdrawRequestDto);
        // to get back the WithdrawRequestDto set earlier
        WithdrawRequestDto testWithdrawRequestDto = (WithdrawRequestDto) exampleExecuteActionRequest.getActualInstance();
    }
}
```


