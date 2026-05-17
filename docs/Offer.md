

# Offer

## oneOf schemas
* [QuoteOffer](QuoteOffer.md)
* [RateOffer](RateOffer.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.Offer;
import com.fireblocks.sdk.model.QuoteOffer;
import com.fireblocks.sdk.model.RateOffer;

public class Example {
    public static void main(String[] args) {
        Offer exampleOffer = new Offer();

        // create a new QuoteOffer
        QuoteOffer exampleQuoteOffer = new QuoteOffer();
        // set Offer to QuoteOffer
        exampleOffer.setActualInstance(exampleQuoteOffer);
        // to get back the QuoteOffer set earlier
        QuoteOffer testQuoteOffer = (QuoteOffer) exampleOffer.getActualInstance();

        // create a new RateOffer
        RateOffer exampleRateOffer = new RateOffer();
        // set Offer to RateOffer
        exampleOffer.setActualInstance(exampleRateOffer);
        // to get back the RateOffer set earlier
        RateOffer testRateOffer = (RateOffer) exampleOffer.getActualInstance();
    }
}
```


