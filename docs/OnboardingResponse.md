

# OnboardingResponse

## oneOf schemas
* [OnboardingResponseDtccAccept](OnboardingResponseDtccAccept.md)
* [OnboardingResponseDtccReject](OnboardingResponseDtccReject.md)
* [OnboardingResponseTradewebAccept](OnboardingResponseTradewebAccept.md)
* [OnboardingResponseTradewebReject](OnboardingResponseTradewebReject.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.OnboardingResponse;
import com.fireblocks.sdk.model.OnboardingResponseDtccAccept;
import com.fireblocks.sdk.model.OnboardingResponseDtccReject;
import com.fireblocks.sdk.model.OnboardingResponseTradewebAccept;
import com.fireblocks.sdk.model.OnboardingResponseTradewebReject;

public class Example {
    public static void main(String[] args) {
        OnboardingResponse exampleOnboardingResponse = new OnboardingResponse();

        // create a new OnboardingResponseDtccAccept
        OnboardingResponseDtccAccept exampleOnboardingResponseDtccAccept = new OnboardingResponseDtccAccept();
        // set OnboardingResponse to OnboardingResponseDtccAccept
        exampleOnboardingResponse.setActualInstance(exampleOnboardingResponseDtccAccept);
        // to get back the OnboardingResponseDtccAccept set earlier
        OnboardingResponseDtccAccept testOnboardingResponseDtccAccept = (OnboardingResponseDtccAccept) exampleOnboardingResponse.getActualInstance();

        // create a new OnboardingResponseDtccReject
        OnboardingResponseDtccReject exampleOnboardingResponseDtccReject = new OnboardingResponseDtccReject();
        // set OnboardingResponse to OnboardingResponseDtccReject
        exampleOnboardingResponse.setActualInstance(exampleOnboardingResponseDtccReject);
        // to get back the OnboardingResponseDtccReject set earlier
        OnboardingResponseDtccReject testOnboardingResponseDtccReject = (OnboardingResponseDtccReject) exampleOnboardingResponse.getActualInstance();

        // create a new OnboardingResponseTradewebAccept
        OnboardingResponseTradewebAccept exampleOnboardingResponseTradewebAccept = new OnboardingResponseTradewebAccept();
        // set OnboardingResponse to OnboardingResponseTradewebAccept
        exampleOnboardingResponse.setActualInstance(exampleOnboardingResponseTradewebAccept);
        // to get back the OnboardingResponseTradewebAccept set earlier
        OnboardingResponseTradewebAccept testOnboardingResponseTradewebAccept = (OnboardingResponseTradewebAccept) exampleOnboardingResponse.getActualInstance();

        // create a new OnboardingResponseTradewebReject
        OnboardingResponseTradewebReject exampleOnboardingResponseTradewebReject = new OnboardingResponseTradewebReject();
        // set OnboardingResponse to OnboardingResponseTradewebReject
        exampleOnboardingResponse.setActualInstance(exampleOnboardingResponseTradewebReject);
        // to get back the OnboardingResponseTradewebReject set earlier
        OnboardingResponseTradewebReject testOnboardingResponseTradewebReject = (OnboardingResponseTradewebReject) exampleOnboardingResponse.getActualInstance();
    }
}
```


