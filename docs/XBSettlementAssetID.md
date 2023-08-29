

# XBSettlementAssetID

## oneOf schemas
* [XBSettlementCryptoAsset](XBSettlementCryptoAsset.md)
* [XBSettlementFiatAsset](XBSettlementFiatAsset.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.XBSettlementAssetID;
import com.fireblocks.sdk.model.XBSettlementCryptoAsset;
import com.fireblocks.sdk.model.XBSettlementFiatAsset;

public class Example {
    public static void main(String[] args) {
        XBSettlementAssetID exampleXBSettlementAssetID = new XBSettlementAssetID();

        // create a new XBSettlementCryptoAsset
        XBSettlementCryptoAsset exampleXBSettlementCryptoAsset = new XBSettlementCryptoAsset();
        // set XBSettlementAssetID to XBSettlementCryptoAsset
        exampleXBSettlementAssetID.setActualInstance(exampleXBSettlementCryptoAsset);
        // to get back the XBSettlementCryptoAsset set earlier
        XBSettlementCryptoAsset testXBSettlementCryptoAsset = (XBSettlementCryptoAsset) exampleXBSettlementAssetID.getActualInstance();

        // create a new XBSettlementFiatAsset
        XBSettlementFiatAsset exampleXBSettlementFiatAsset = new XBSettlementFiatAsset();
        // set XBSettlementAssetID to XBSettlementFiatAsset
        exampleXBSettlementAssetID.setActualInstance(exampleXBSettlementFiatAsset);
        // to get back the XBSettlementFiatAsset set earlier
        XBSettlementFiatAsset testXBSettlementFiatAsset = (XBSettlementFiatAsset) exampleXBSettlementAssetID.getActualInstance();
    }
}
```


