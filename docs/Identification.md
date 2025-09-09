

# Identification

## oneOf schemas
* [BusinessIdentification](BusinessIdentification.md)
* [PersonalIdentification](PersonalIdentification.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.Identification;
import com.fireblocks.sdk.model.BusinessIdentification;
import com.fireblocks.sdk.model.PersonalIdentification;

public class Example {
    public static void main(String[] args) {
        Identification exampleIdentification = new Identification();

        // create a new BusinessIdentification
        BusinessIdentification exampleBusinessIdentification = new BusinessIdentification();
        // set Identification to BusinessIdentification
        exampleIdentification.setActualInstance(exampleBusinessIdentification);
        // to get back the BusinessIdentification set earlier
        BusinessIdentification testBusinessIdentification = (BusinessIdentification) exampleIdentification.getActualInstance();

        // create a new PersonalIdentification
        PersonalIdentification examplePersonalIdentification = new PersonalIdentification();
        // set Identification to PersonalIdentification
        exampleIdentification.setActualInstance(examplePersonalIdentification);
        // to get back the PersonalIdentification set earlier
        PersonalIdentification testPersonalIdentification = (PersonalIdentification) exampleIdentification.getActualInstance();
    }
}
```


