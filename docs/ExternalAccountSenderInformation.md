

# ExternalAccountSenderInformation

Additional data for the external account, depending on the type used.

## oneOf schemas
* [ExternalAccountLocalBankAfrica](ExternalAccountLocalBankAfrica.md)
* [ExternalAccountMobileMoney](ExternalAccountMobileMoney.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.ExternalAccountSenderInformation;
import com.fireblocks.sdk.model.ExternalAccountLocalBankAfrica;
import com.fireblocks.sdk.model.ExternalAccountMobileMoney;

public class Example {
    public static void main(String[] args) {
        ExternalAccountSenderInformation exampleExternalAccountSenderInformation = new ExternalAccountSenderInformation();

        // create a new ExternalAccountLocalBankAfrica
        ExternalAccountLocalBankAfrica exampleExternalAccountLocalBankAfrica = new ExternalAccountLocalBankAfrica();
        // set ExternalAccountSenderInformation to ExternalAccountLocalBankAfrica
        exampleExternalAccountSenderInformation.setActualInstance(exampleExternalAccountLocalBankAfrica);
        // to get back the ExternalAccountLocalBankAfrica set earlier
        ExternalAccountLocalBankAfrica testExternalAccountLocalBankAfrica = (ExternalAccountLocalBankAfrica) exampleExternalAccountSenderInformation.getActualInstance();

        // create a new ExternalAccountMobileMoney
        ExternalAccountMobileMoney exampleExternalAccountMobileMoney = new ExternalAccountMobileMoney();
        // set ExternalAccountSenderInformation to ExternalAccountMobileMoney
        exampleExternalAccountSenderInformation.setActualInstance(exampleExternalAccountMobileMoney);
        // to get back the ExternalAccountMobileMoney set earlier
        ExternalAccountMobileMoney testExternalAccountMobileMoney = (ExternalAccountMobileMoney) exampleExternalAccountSenderInformation.getActualInstance();
    }
}
```


