

# Destination

## oneOf schemas
* [Account](Account.md)
* [OneTimeAddressAccount](OneTimeAddressAccount.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.Destination;
import com.fireblocks.sdk.model.Account;
import com.fireblocks.sdk.model.OneTimeAddressAccount;

public class Example {
    public static void main(String[] args) {
        Destination exampleDestination = new Destination();

        // create a new Account
        Account exampleAccount = new Account();
        // set Destination to Account
        exampleDestination.setActualInstance(exampleAccount);
        // to get back the Account set earlier
        Account testAccount = (Account) exampleDestination.getActualInstance();

        // create a new OneTimeAddressAccount
        OneTimeAddressAccount exampleOneTimeAddressAccount = new OneTimeAddressAccount();
        // set Destination to OneTimeAddressAccount
        exampleDestination.setActualInstance(exampleOneTimeAddressAccount);
        // to get back the OneTimeAddressAccount set earlier
        OneTimeAddressAccount testOneTimeAddressAccount = (OneTimeAddressAccount) exampleDestination.getActualInstance();
    }
}
```


