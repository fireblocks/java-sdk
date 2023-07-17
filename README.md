# Fireblocks SDK

The Fireblocks SDK allows developers to integrate with the Fireblocks platform and perform various operations, such as managing vault accounts and executing transactions.

For detailed documentation and additional resources, please refer to the [Fireblocks Developer Portal](https://developers.fireblocks.com/).

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.fireblocks</groupId>
    <artifactId>fireblocks-api-client</artifactId>
    <version>2.10.0</version>
    <scope>compile</scope>
</dependency>
```

See the [Releases page](https://github.com/fireblocks/fireblocks-api-client-java/releases) for the latest available version.

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.fireblocks:fireblocks-api-client:2.0.0"
```

See the [Releases page](https://github.com/fireblocks/fireblocks-api-client-java/releases) for the latest available version.

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/fireblocks-api-client-<VERSION>.jar`
    - `target/lib/*.jar`

## Usage

Lets see an example. create a vault accounts and make a transaction! 
```java
package org.example;
import org.openapitools.client.model.*;
import org.openapitools.client.api.VaultsApi;
import org.openapitools.client.Configuration;
import com.nimbusds.jose.util.IOUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;

public class Main {
private static final String BASE_PATH = "https://sandbox-api.fireblocks.io/v1";
private static final String API_KEY = "cf8e4b36-84ca-4393-9bd9-84dd9bd640c8";

public static void main(String[] args) throws Exception {
Configuration configuration = new Configuration();
configuration.setApiKey(API_KEY);
configuration.setBasePath(BASE_PATH);
configuration.setSecretKey(getKey());

VaultAccountsPostRequest vaultAccountsPostRequest = new VaultAccountsPostRequest();
vaultAccountsPostRequest = vaultAccountsPostRequest.name("Shahar Test Java2222");

VaultsApi vaultApi = new VaultsApi(configuration);
VaultAccountsPagedResponse vaultAccountsPagedResponse = vaultApi.vaultAccountsPagedGet(null,null,null,null,null,null,null,null,null,null);
VaultAccount vaultAccountsPostResponse = vaultApi.vaultAccountsPost(vaultAccountsPostRequest);
System.out.print(vaultAccountsPagedResponse.toString());
System.out.print(vaultAccountsPostResponse.toString());
}
public static String getKey() throws Exception {
File file = new File("../fireblocks_secret.key");
String privateKeyContent = new String(IOUtils.readFileToString(file).getBytes(), StandardCharsets.UTF_8).replaceAll("-----(BEGIN|END) PRIVATE KEY-----", "").replaceAll("\\s", "");

return privateKeyContent;
}
}
```
