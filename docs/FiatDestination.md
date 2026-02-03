

# FiatDestination

## oneOf schemas
* [AchDestination](AchDestination.md)
* [EuropeanSEPADestination](EuropeanSEPADestination.md)
* [IbanDestination](IbanDestination.md)
* [LocalBankTransferAfricaDestination](LocalBankTransferAfricaDestination.md)
* [MobileMoneyDestination](MobileMoneyDestination.md)
* [PixDestination](PixDestination.md)
* [SEPADestination](SEPADestination.md)
* [SpeiDestination](SpeiDestination.md)
* [SwiftDestination](SwiftDestination.md)
* [USWireDestination](USWireDestination.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.FiatDestination;
import com.fireblocks.sdk.model.AchDestination;
import com.fireblocks.sdk.model.EuropeanSEPADestination;
import com.fireblocks.sdk.model.IbanDestination;
import com.fireblocks.sdk.model.LocalBankTransferAfricaDestination;
import com.fireblocks.sdk.model.MobileMoneyDestination;
import com.fireblocks.sdk.model.PixDestination;
import com.fireblocks.sdk.model.SEPADestination;
import com.fireblocks.sdk.model.SpeiDestination;
import com.fireblocks.sdk.model.SwiftDestination;
import com.fireblocks.sdk.model.USWireDestination;

public class Example {
    public static void main(String[] args) {
        FiatDestination exampleFiatDestination = new FiatDestination();

        // create a new AchDestination
        AchDestination exampleAchDestination = new AchDestination();
        // set FiatDestination to AchDestination
        exampleFiatDestination.setActualInstance(exampleAchDestination);
        // to get back the AchDestination set earlier
        AchDestination testAchDestination = (AchDestination) exampleFiatDestination.getActualInstance();

        // create a new EuropeanSEPADestination
        EuropeanSEPADestination exampleEuropeanSEPADestination = new EuropeanSEPADestination();
        // set FiatDestination to EuropeanSEPADestination
        exampleFiatDestination.setActualInstance(exampleEuropeanSEPADestination);
        // to get back the EuropeanSEPADestination set earlier
        EuropeanSEPADestination testEuropeanSEPADestination = (EuropeanSEPADestination) exampleFiatDestination.getActualInstance();

        // create a new IbanDestination
        IbanDestination exampleIbanDestination = new IbanDestination();
        // set FiatDestination to IbanDestination
        exampleFiatDestination.setActualInstance(exampleIbanDestination);
        // to get back the IbanDestination set earlier
        IbanDestination testIbanDestination = (IbanDestination) exampleFiatDestination.getActualInstance();

        // create a new LocalBankTransferAfricaDestination
        LocalBankTransferAfricaDestination exampleLocalBankTransferAfricaDestination = new LocalBankTransferAfricaDestination();
        // set FiatDestination to LocalBankTransferAfricaDestination
        exampleFiatDestination.setActualInstance(exampleLocalBankTransferAfricaDestination);
        // to get back the LocalBankTransferAfricaDestination set earlier
        LocalBankTransferAfricaDestination testLocalBankTransferAfricaDestination = (LocalBankTransferAfricaDestination) exampleFiatDestination.getActualInstance();

        // create a new MobileMoneyDestination
        MobileMoneyDestination exampleMobileMoneyDestination = new MobileMoneyDestination();
        // set FiatDestination to MobileMoneyDestination
        exampleFiatDestination.setActualInstance(exampleMobileMoneyDestination);
        // to get back the MobileMoneyDestination set earlier
        MobileMoneyDestination testMobileMoneyDestination = (MobileMoneyDestination) exampleFiatDestination.getActualInstance();

        // create a new PixDestination
        PixDestination examplePixDestination = new PixDestination();
        // set FiatDestination to PixDestination
        exampleFiatDestination.setActualInstance(examplePixDestination);
        // to get back the PixDestination set earlier
        PixDestination testPixDestination = (PixDestination) exampleFiatDestination.getActualInstance();

        // create a new SEPADestination
        SEPADestination exampleSEPADestination = new SEPADestination();
        // set FiatDestination to SEPADestination
        exampleFiatDestination.setActualInstance(exampleSEPADestination);
        // to get back the SEPADestination set earlier
        SEPADestination testSEPADestination = (SEPADestination) exampleFiatDestination.getActualInstance();

        // create a new SpeiDestination
        SpeiDestination exampleSpeiDestination = new SpeiDestination();
        // set FiatDestination to SpeiDestination
        exampleFiatDestination.setActualInstance(exampleSpeiDestination);
        // to get back the SpeiDestination set earlier
        SpeiDestination testSpeiDestination = (SpeiDestination) exampleFiatDestination.getActualInstance();

        // create a new SwiftDestination
        SwiftDestination exampleSwiftDestination = new SwiftDestination();
        // set FiatDestination to SwiftDestination
        exampleFiatDestination.setActualInstance(exampleSwiftDestination);
        // to get back the SwiftDestination set earlier
        SwiftDestination testSwiftDestination = (SwiftDestination) exampleFiatDestination.getActualInstance();

        // create a new USWireDestination
        USWireDestination exampleUSWireDestination = new USWireDestination();
        // set FiatDestination to USWireDestination
        exampleFiatDestination.setActualInstance(exampleUSWireDestination);
        // to get back the USWireDestination set earlier
        USWireDestination testUSWireDestination = (USWireDestination) exampleFiatDestination.getActualInstance();
    }
}
```


