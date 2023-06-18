# Fireblocks SDK

The Fireblocks SDK allows developers to integrate with the Fireblocks platform and perform various operations, such as managing vault accounts and executing transactions.

For detailed documentation and additional resources, please refer to the [Fireblocks Developer Portal](https://developer.fireblocks.com/).

## Installation

To use the Fireblocks SDK, follow these steps:

Install the SDK using npm:

```shell
npm install fireblocks-sdk
```

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
