

# FiatDestination

## oneOf schemas
* [AchDestination](AchDestination.md)
* [ChapsDestination](ChapsDestination.md)
* [CipsDestination](CipsDestination.md)
* [EuropeanSEPADestination](EuropeanSEPADestination.md)
* [FpsHkDestination](FpsHkDestination.md)
* [FpsUkDestination](FpsUkDestination.md)
* [IbanDestination](IbanDestination.md)
* [InstaPayDestination](InstaPayDestination.md)
* [InteracDestination](InteracDestination.md)
* [InternalTransferDestination](InternalTransferDestination.md)
* [LocalBankTransferAfricaDestination](LocalBankTransferAfricaDestination.md)
* [MobileMoneyDestination](MobileMoneyDestination.md)
* [NequiDestination](NequiDestination.md)
* [PayidDestination](PayidDestination.md)
* [PesonetDestination](PesonetDestination.md)
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
import com.fireblocks.sdk.model.ChapsDestination;
import com.fireblocks.sdk.model.CipsDestination;
import com.fireblocks.sdk.model.EuropeanSEPADestination;
import com.fireblocks.sdk.model.FpsHkDestination;
import com.fireblocks.sdk.model.FpsUkDestination;
import com.fireblocks.sdk.model.IbanDestination;
import com.fireblocks.sdk.model.InstaPayDestination;
import com.fireblocks.sdk.model.InteracDestination;
import com.fireblocks.sdk.model.InternalTransferDestination;
import com.fireblocks.sdk.model.LocalBankTransferAfricaDestination;
import com.fireblocks.sdk.model.MobileMoneyDestination;
import com.fireblocks.sdk.model.NequiDestination;
import com.fireblocks.sdk.model.PayidDestination;
import com.fireblocks.sdk.model.PesonetDestination;
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

        // create a new ChapsDestination
        ChapsDestination exampleChapsDestination = new ChapsDestination();
        // set FiatDestination to ChapsDestination
        exampleFiatDestination.setActualInstance(exampleChapsDestination);
        // to get back the ChapsDestination set earlier
        ChapsDestination testChapsDestination = (ChapsDestination) exampleFiatDestination.getActualInstance();

        // create a new CipsDestination
        CipsDestination exampleCipsDestination = new CipsDestination();
        // set FiatDestination to CipsDestination
        exampleFiatDestination.setActualInstance(exampleCipsDestination);
        // to get back the CipsDestination set earlier
        CipsDestination testCipsDestination = (CipsDestination) exampleFiatDestination.getActualInstance();

        // create a new EuropeanSEPADestination
        EuropeanSEPADestination exampleEuropeanSEPADestination = new EuropeanSEPADestination();
        // set FiatDestination to EuropeanSEPADestination
        exampleFiatDestination.setActualInstance(exampleEuropeanSEPADestination);
        // to get back the EuropeanSEPADestination set earlier
        EuropeanSEPADestination testEuropeanSEPADestination = (EuropeanSEPADestination) exampleFiatDestination.getActualInstance();

        // create a new FpsHkDestination
        FpsHkDestination exampleFpsHkDestination = new FpsHkDestination();
        // set FiatDestination to FpsHkDestination
        exampleFiatDestination.setActualInstance(exampleFpsHkDestination);
        // to get back the FpsHkDestination set earlier
        FpsHkDestination testFpsHkDestination = (FpsHkDestination) exampleFiatDestination.getActualInstance();

        // create a new FpsUkDestination
        FpsUkDestination exampleFpsUkDestination = new FpsUkDestination();
        // set FiatDestination to FpsUkDestination
        exampleFiatDestination.setActualInstance(exampleFpsUkDestination);
        // to get back the FpsUkDestination set earlier
        FpsUkDestination testFpsUkDestination = (FpsUkDestination) exampleFiatDestination.getActualInstance();

        // create a new IbanDestination
        IbanDestination exampleIbanDestination = new IbanDestination();
        // set FiatDestination to IbanDestination
        exampleFiatDestination.setActualInstance(exampleIbanDestination);
        // to get back the IbanDestination set earlier
        IbanDestination testIbanDestination = (IbanDestination) exampleFiatDestination.getActualInstance();

        // create a new InstaPayDestination
        InstaPayDestination exampleInstaPayDestination = new InstaPayDestination();
        // set FiatDestination to InstaPayDestination
        exampleFiatDestination.setActualInstance(exampleInstaPayDestination);
        // to get back the InstaPayDestination set earlier
        InstaPayDestination testInstaPayDestination = (InstaPayDestination) exampleFiatDestination.getActualInstance();

        // create a new InteracDestination
        InteracDestination exampleInteracDestination = new InteracDestination();
        // set FiatDestination to InteracDestination
        exampleFiatDestination.setActualInstance(exampleInteracDestination);
        // to get back the InteracDestination set earlier
        InteracDestination testInteracDestination = (InteracDestination) exampleFiatDestination.getActualInstance();

        // create a new InternalTransferDestination
        InternalTransferDestination exampleInternalTransferDestination = new InternalTransferDestination();
        // set FiatDestination to InternalTransferDestination
        exampleFiatDestination.setActualInstance(exampleInternalTransferDestination);
        // to get back the InternalTransferDestination set earlier
        InternalTransferDestination testInternalTransferDestination = (InternalTransferDestination) exampleFiatDestination.getActualInstance();

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

        // create a new NequiDestination
        NequiDestination exampleNequiDestination = new NequiDestination();
        // set FiatDestination to NequiDestination
        exampleFiatDestination.setActualInstance(exampleNequiDestination);
        // to get back the NequiDestination set earlier
        NequiDestination testNequiDestination = (NequiDestination) exampleFiatDestination.getActualInstance();

        // create a new PayidDestination
        PayidDestination examplePayidDestination = new PayidDestination();
        // set FiatDestination to PayidDestination
        exampleFiatDestination.setActualInstance(examplePayidDestination);
        // to get back the PayidDestination set earlier
        PayidDestination testPayidDestination = (PayidDestination) exampleFiatDestination.getActualInstance();

        // create a new PesonetDestination
        PesonetDestination examplePesonetDestination = new PesonetDestination();
        // set FiatDestination to PesonetDestination
        exampleFiatDestination.setActualInstance(examplePesonetDestination);
        // to get back the PesonetDestination set earlier
        PesonetDestination testPesonetDestination = (PesonetDestination) exampleFiatDestination.getActualInstance();

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


