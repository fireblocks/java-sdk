

# AdditionalInfoRequestAdditionalInfo

Additional payment information based on the payment rail type

## oneOf schemas
* [AbaPaymentInfo](AbaPaymentInfo.md)
* [AchPaymentInfo](AchPaymentInfo.md)
* [ChapsPaymentInfo](ChapsPaymentInfo.md)
* [IbanPaymentInfo](IbanPaymentInfo.md)
* [InteracPaymentInfo](InteracPaymentInfo.md)
* [LbtPaymentInfo](LbtPaymentInfo.md)
* [MomoPaymentInfo](MomoPaymentInfo.md)
* [PayidPaymentInfo](PayidPaymentInfo.md)
* [PixPaymentInfo](PixPaymentInfo.md)
* [SepaPaymentInfo](SepaPaymentInfo.md)
* [SpeiAdvancedPaymentInfo](SpeiAdvancedPaymentInfo.md)
* [SpeiBasicPaymentInfo](SpeiBasicPaymentInfo.md)
* [UsWirePaymentInfo](UsWirePaymentInfo.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AdditionalInfoRequestAdditionalInfo;
import com.fireblocks.sdk.model.AbaPaymentInfo;
import com.fireblocks.sdk.model.AchPaymentInfo;
import com.fireblocks.sdk.model.ChapsPaymentInfo;
import com.fireblocks.sdk.model.IbanPaymentInfo;
import com.fireblocks.sdk.model.InteracPaymentInfo;
import com.fireblocks.sdk.model.LbtPaymentInfo;
import com.fireblocks.sdk.model.MomoPaymentInfo;
import com.fireblocks.sdk.model.PayidPaymentInfo;
import com.fireblocks.sdk.model.PixPaymentInfo;
import com.fireblocks.sdk.model.SepaPaymentInfo;
import com.fireblocks.sdk.model.SpeiAdvancedPaymentInfo;
import com.fireblocks.sdk.model.SpeiBasicPaymentInfo;
import com.fireblocks.sdk.model.UsWirePaymentInfo;

public class Example {
    public static void main(String[] args) {
        AdditionalInfoRequestAdditionalInfo exampleAdditionalInfoRequestAdditionalInfo = new AdditionalInfoRequestAdditionalInfo();

        // create a new AbaPaymentInfo
        AbaPaymentInfo exampleAbaPaymentInfo = new AbaPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to AbaPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleAbaPaymentInfo);
        // to get back the AbaPaymentInfo set earlier
        AbaPaymentInfo testAbaPaymentInfo = (AbaPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new AchPaymentInfo
        AchPaymentInfo exampleAchPaymentInfo = new AchPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to AchPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleAchPaymentInfo);
        // to get back the AchPaymentInfo set earlier
        AchPaymentInfo testAchPaymentInfo = (AchPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new ChapsPaymentInfo
        ChapsPaymentInfo exampleChapsPaymentInfo = new ChapsPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to ChapsPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleChapsPaymentInfo);
        // to get back the ChapsPaymentInfo set earlier
        ChapsPaymentInfo testChapsPaymentInfo = (ChapsPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new IbanPaymentInfo
        IbanPaymentInfo exampleIbanPaymentInfo = new IbanPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to IbanPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleIbanPaymentInfo);
        // to get back the IbanPaymentInfo set earlier
        IbanPaymentInfo testIbanPaymentInfo = (IbanPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new InteracPaymentInfo
        InteracPaymentInfo exampleInteracPaymentInfo = new InteracPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to InteracPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleInteracPaymentInfo);
        // to get back the InteracPaymentInfo set earlier
        InteracPaymentInfo testInteracPaymentInfo = (InteracPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new LbtPaymentInfo
        LbtPaymentInfo exampleLbtPaymentInfo = new LbtPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to LbtPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleLbtPaymentInfo);
        // to get back the LbtPaymentInfo set earlier
        LbtPaymentInfo testLbtPaymentInfo = (LbtPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new MomoPaymentInfo
        MomoPaymentInfo exampleMomoPaymentInfo = new MomoPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to MomoPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleMomoPaymentInfo);
        // to get back the MomoPaymentInfo set earlier
        MomoPaymentInfo testMomoPaymentInfo = (MomoPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new PayidPaymentInfo
        PayidPaymentInfo examplePayidPaymentInfo = new PayidPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to PayidPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(examplePayidPaymentInfo);
        // to get back the PayidPaymentInfo set earlier
        PayidPaymentInfo testPayidPaymentInfo = (PayidPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new PixPaymentInfo
        PixPaymentInfo examplePixPaymentInfo = new PixPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to PixPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(examplePixPaymentInfo);
        // to get back the PixPaymentInfo set earlier
        PixPaymentInfo testPixPaymentInfo = (PixPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new SepaPaymentInfo
        SepaPaymentInfo exampleSepaPaymentInfo = new SepaPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to SepaPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleSepaPaymentInfo);
        // to get back the SepaPaymentInfo set earlier
        SepaPaymentInfo testSepaPaymentInfo = (SepaPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new SpeiAdvancedPaymentInfo
        SpeiAdvancedPaymentInfo exampleSpeiAdvancedPaymentInfo = new SpeiAdvancedPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to SpeiAdvancedPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleSpeiAdvancedPaymentInfo);
        // to get back the SpeiAdvancedPaymentInfo set earlier
        SpeiAdvancedPaymentInfo testSpeiAdvancedPaymentInfo = (SpeiAdvancedPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new SpeiBasicPaymentInfo
        SpeiBasicPaymentInfo exampleSpeiBasicPaymentInfo = new SpeiBasicPaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to SpeiBasicPaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleSpeiBasicPaymentInfo);
        // to get back the SpeiBasicPaymentInfo set earlier
        SpeiBasicPaymentInfo testSpeiBasicPaymentInfo = (SpeiBasicPaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();

        // create a new UsWirePaymentInfo
        UsWirePaymentInfo exampleUsWirePaymentInfo = new UsWirePaymentInfo();
        // set AdditionalInfoRequestAdditionalInfo to UsWirePaymentInfo
        exampleAdditionalInfoRequestAdditionalInfo.setActualInstance(exampleUsWirePaymentInfo);
        // to get back the UsWirePaymentInfo set earlier
        UsWirePaymentInfo testUsWirePaymentInfo = (UsWirePaymentInfo) exampleAdditionalInfoRequestAdditionalInfo.getActualInstance();
    }
}
```


