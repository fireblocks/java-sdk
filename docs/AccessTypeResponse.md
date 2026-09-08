

# AccessTypeResponse

Response-only counterpart of AccessType. Used by the `via` field of response schemas (Quote, Rate, OrderDetails, OrderSummary — and therefore QuoteOffer, RateOffer and Offer) so that the PROVIDER variant can expose `subProviders` without that field ever becoming reachable from a request body. Request schemas (CreateOrderRequest.via) keep using AccessType.

## oneOf schemas
* [AccountAccessResponse](AccountAccessResponse.md)
* [DirectAccessResponse](DirectAccessResponse.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.AccessTypeResponse;
import com.fireblocks.sdk.model.AccountAccessResponse;
import com.fireblocks.sdk.model.DirectAccessResponse;

public class Example {
    public static void main(String[] args) {
        AccessTypeResponse exampleAccessTypeResponse = new AccessTypeResponse();

        // create a new AccountAccessResponse
        AccountAccessResponse exampleAccountAccessResponse = new AccountAccessResponse();
        // set AccessTypeResponse to AccountAccessResponse
        exampleAccessTypeResponse.setActualInstance(exampleAccountAccessResponse);
        // to get back the AccountAccessResponse set earlier
        AccountAccessResponse testAccountAccessResponse = (AccountAccessResponse) exampleAccessTypeResponse.getActualInstance();

        // create a new DirectAccessResponse
        DirectAccessResponse exampleDirectAccessResponse = new DirectAccessResponse();
        // set AccessTypeResponse to DirectAccessResponse
        exampleAccessTypeResponse.setActualInstance(exampleDirectAccessResponse);
        // to get back the DirectAccessResponse set earlier
        DirectAccessResponse testDirectAccessResponse = (DirectAccessResponse) exampleAccessTypeResponse.getActualInstance();
    }
}
```


