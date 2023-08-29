# Fireblocks Java SDK (Beta)
<!--[![Maven version](https://badge.fury.io/java/fireblocks.svg)](https://badge.fury.io/java/fireblocks)-->
> **Warning**
> This package is currently in a beta stage and should be used at your own risk.
> The provided interfaces might go through backwards-incompatibale changes.

For detailed API documentation please refer to the [Fireblocks API Reference](https://developers.fireblocks.com/reference/).

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
<properties>
    <fireblocks.sdk.version>last version</fireblocks.sdk.version>
</properties>

<dependencies>
    <dependency>
        <groupId>com.fireblocks.sdk</groupId>
        <artifactId>fireblocks-java-sdk</artifactId>
        <version>${fireblocks.sdk.version}</version>
        <scope>compile</scope>
    </dependency>
    <!-- Other dependencies -->
</dependencies>
```

See the [Releases page](https://github.com/fireblocks/fireblocks-api-client-java/releases) for the latest available version.

### Gradle users

Add this dependency to your project's build file:

See the [Releases page](https://github.com/fireblocks/fireblocks-api-client-java/releases) for the latest available version.

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/fireblocks-java-sdk-<VERSION>.jar`
    - `target/lib/*.jar`

## Examples
<p><strong>Creating a Vault Account</strong><br>
To create a new vault account, you can use the following function:</p>

```java
package org.example;
import com.fireblocks.sdk.client.model.*;
import com.fireblocks.sdk.client.api.VaultsApi;
import com.fireblocks.sdk.client.Configuration;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static final String BASE_PATH = "https://sandbox-api.fireblocks.io/v1";
    private static final String API_KEY = "<api-key>";

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        /** Define Vaults API instance **/
        VaultsApi vaultApi = new VaultsApi(configuration);

        /** Create Vault Account **/
        CreateVaultAccountRequest createVaultAccountRequest = new CreateVaultAccountRequest();
        createVaultAccountRequest.name("My New Vault Account");
        VaultAccount createVaultAccountResponse = vaultApi.createVaultAccount(createVaultAccountRequest);
    }

    public static String getKey() throws Exception {
        byte[] fileBytes = Files.readAllBytes(Paths.get("fireblocks_secret_sandbox.key"));
        String pk = new String(fileBytes).replaceAll("-----(BEGIN|END) PRIVATE KEY-----", "").replaceAll("\\s", ""); // Convert bytes to a String
        return pk;
    }
}
```

<p><strong>Retrieving Vault Accounts</strong><br>
To get a list of vault accounts, you can use the following function:</p>

```java
package org.example;
import com.fireblocks.sdk.client.model.*;
import com.fireblocks.sdk.client.api.VaultsApi;
import com.fireblocks.sdk.client.Configuration;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static final String BASE_PATH = "https://sandbox-api.fireblocks.io/v1";
    private static final String API_KEY = "<api-key>";

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        /** Define Vaults API instance **/
        VaultsApi vaultApi = new VaultsApi(configuration);

        /** Get Paged Vault Accounts **/
        BigDecimal limit = new BigDecimal(3);
        VaultAccountsPagedResponse vaults = vaultApi.getPagedVaultAccounts(null,null, null, null, null,null,null, limit);
    }

    public static String getKey() throws Exception {
        byte[] fileBytes = Files.readAllBytes(Paths.get("fireblocks_secret_sandbox.key"));
        String pk = new String(fileBytes).replaceAll("-----(BEGIN|END) PRIVATE KEY-----", "").replaceAll("\\s", ""); // Convert bytes to a String
        return pk;
    }
}
```

<p><strong>Creating a Transaction</strong><br>
To make a transaction between vault accounts, you can use the following function:</p>

```java
package org.example;
import com.fireblocks.sdk.client.model.*;
import com.fireblocks.sdk.client.api.TransactionApi;
import com.fireblocks.sdk.client.Configuration;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static final String BASE_PATH = "https://sandbox-api.fireblocks.io/v1";
    private static final String API_KEY = "<api-key>";

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        /** Define Transactions API instance **/
        TransactionsApi txApi = new TransactionsApi(configuration);
        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setAmount(new TransactionRequestAmount("0.001"));
        transactionRequest.assetId("ETH_TEST3");

        DestinationTransferPeerPath destinationTransferPeerPath = new DestinationTransferPeerPath();
        destinationTransferPeerPath.type(DestinationTransferPeerPath.TypeEnum.VAULT_ACCOUNT);
        destinationTransferPeerPath.id("1");
        transactionRequest.setDestination(destinationTransferPeerPath);

        TransferPeerPath source = new TransferPeerPath();
        source.id("0");
        source.type(TransferPeerPath.TypeEnum.VAULT_ACCOUNT);
        transactionRequest.source(source);

        transactionRequest.note("Your first transaction Java!");

        CreateTransactionResponse transactionResponse = txApi.createTransaction(transactionRequest);
        System.out.println(transactionResponse);
    }

    public static String getKey() throws Exception {
        byte[] fileBytes = Files.readAllBytes(Paths.get("fireblocks_secret_sandbox.key"));
        String pk = new String(fileBytes).replaceAll("-----(BEGIN|END) PRIVATE KEY-----", "").replaceAll("\\s", ""); // Convert bytes to a String
        return pk;
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.fireblocks.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuditLogsApi* | [**getAudits**](docs/AuditLogsApi.md#getAudits) | **GET** /audits | Get audit logs
*BlockchainsAssetsApi* | [**getSupportedAssets**](docs/BlockchainsAssetsApi.md#getSupportedAssets) | **GET** /supported_assets | List all asset types supported by Fireblocks
*ContractsApi* | [**addAssetToContract**](docs/ContractsApi.md#addAssetToContract) | **POST** /contracts/{contractId}/{assetId} | Add an asset to a contract
*ContractsApi* | [**createContract**](docs/ContractsApi.md#createContract) | **POST** /contracts | Create a contract
*ContractsApi* | [**deleteContract**](docs/ContractsApi.md#deleteContract) | **DELETE** /contracts/{contractId} | Delete a contract
*ContractsApi* | [**getAssetInContract**](docs/ContractsApi.md#getAssetInContract) | **GET** /contracts/{contractId}/{assetId} | Find a contract asset
*ContractsApi* | [**getContractById**](docs/ContractsApi.md#getContractById) | **GET** /contracts/{contractId} | Find a specific contract
*ContractsApi* | [**getContracts**](docs/ContractsApi.md#getContracts) | **GET** /contracts | List contracts
*ContractsApi* | [**removeAssetFromContract**](docs/ContractsApi.md#removeAssetFromContract) | **DELETE** /contracts/{contractId}/{assetId} | Delete a contract asset
*ExchangeAccountsApi* | [**convertAssets**](docs/ExchangeAccountsApi.md#convertAssets) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset. Coinbase (USD to USDC, USDC to USD) and Bitso (MXN to USD) are supported conversions.
*ExchangeAccountsApi* | [**getExchangeAccountAsset**](docs/ExchangeAccountsApi.md#getExchangeAccountAsset) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account
*ExchangeAccountsApi* | [**getExchangeAccountById**](docs/ExchangeAccountsApi.md#getExchangeAccountById) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account
*ExchangeAccountsApi* | [**getExchangeAccounts**](docs/ExchangeAccountsApi.md#getExchangeAccounts) | **GET** /exchange_accounts | List exchange accounts
*ExchangeAccountsApi* | [**internalTransfer**](docs/ExchangeAccountsApi.md#internalTransfer) | **POST** /exchange_accounts/{exchangeAccountId}/internal_transfer | Internal tranfer for exchange accounts
*ExternalWalletsApi* | [**addAssetToExternalWallet**](docs/ExternalWalletsApi.md#addAssetToExternalWallet) | **POST** /external_wallets/{walletId}/{assetId} | Add an asset to an external wallet.
*ExternalWalletsApi* | [**createExternalWallet**](docs/ExternalWalletsApi.md#createExternalWallet) | **POST** /external_wallets | Create an external wallet
*ExternalWalletsApi* | [**deleteExternalWallet**](docs/ExternalWalletsApi.md#deleteExternalWallet) | **DELETE** /external_wallets/{walletId} | Delete an external wallet
*ExternalWalletsApi* | [**getAssetInExternalWallet**](docs/ExternalWalletsApi.md#getAssetInExternalWallet) | **GET** /external_wallets/{walletId}/{assetId} | Get an asset from an external wallet
*ExternalWalletsApi* | [**getExternalWalletById**](docs/ExternalWalletsApi.md#getExternalWalletById) | **GET** /external_wallets/{walletId} | Find an external wallet
*ExternalWalletsApi* | [**getExternalWallets**](docs/ExternalWalletsApi.md#getExternalWallets) | **GET** /external_wallets | List external wallets
*ExternalWalletsApi* | [**removeAssetFromExternalWallet**](docs/ExternalWalletsApi.md#removeAssetFromExternalWallet) | **DELETE** /external_wallets/{walletId}/{assetId} | Delete an asset from an external wallet
*ExternalWalletsApi* | [**setCustomerRefIdForExternalWallet**](docs/ExternalWalletsApi.md#setCustomerRefIdForExternalWallet) | **POST** /external_wallets/{walletId}/set_customer_ref_id | Set an AML customer reference ID for an external wallet
*FiatAccountsApi* | [**depositFundsFromLinkedDDA**](docs/FiatAccountsApi.md#depositFundsFromLinkedDDA) | **POST** /fiat_accounts/{accountId}/deposit_from_linked_dda | Deposit funds from DDA
*FiatAccountsApi* | [**getFiatAccountById**](docs/FiatAccountsApi.md#getFiatAccountById) | **GET** /fiat_accounts/{accountId} | Find a specific fiat account
*FiatAccountsApi* | [**getFiatAccounts**](docs/FiatAccountsApi.md#getFiatAccounts) | **GET** /fiat_accounts | List fiat accounts
*FiatAccountsApi* | [**redeemFundsToLinkedDDA**](docs/FiatAccountsApi.md#redeemFundsToLinkedDDA) | **POST** /fiat_accounts/{accountId}/redeem_to_linked_dda | Redeem funds to DDA
*GasStationsApi* | [**getGasStation**](docs/GasStationsApi.md#getGasStation) | **GET** /gas_station | Get gas station settings
*GasStationsApi* | [**getGasStationByAssetId**](docs/GasStationsApi.md#getGasStationByAssetId) | **GET** /gas_station/{assetId} | Get gas station settings by asset
*GasStationsApi* | [**updateGasStationConfiguration**](docs/GasStationsApi.md#updateGasStationConfiguration) | **PUT** /gas_station/configuration | Edit gas station settings
*GasStationsApi* | [**updateGasStationConfigurationByAssetId**](docs/GasStationsApi.md#updateGasStationConfigurationByAssetId) | **PUT** /gas_station/configuration/{assetId} | Edit gas station settings for an asset
*InternalWalletsApi* | [**createInternalWallet**](docs/InternalWalletsApi.md#createInternalWallet) | **POST** /internal_wallets | Create an internal wallet
*InternalWalletsApi* | [**createInternalWalletAsset**](docs/InternalWalletsApi.md#createInternalWalletAsset) | **POST** /internal_wallets/{walletId}/{assetId} | Add an asset to an internal wallet
*InternalWalletsApi* | [**deleteInternalWallet**](docs/InternalWalletsApi.md#deleteInternalWallet) | **DELETE** /internal_wallets/{walletId} | Delete an internal wallet
*InternalWalletsApi* | [**deleteInternalWalletAsset**](docs/InternalWalletsApi.md#deleteInternalWalletAsset) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address from an internal wallet
*InternalWalletsApi* | [**getInternalWalletAsset**](docs/InternalWalletsApi.md#getInternalWalletAsset) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet
*InternalWalletsApi* | [**getInternalWalletById**](docs/InternalWalletsApi.md#getInternalWalletById) | **GET** /internal_wallets/{walletId} | Get assets for internal wallet
*InternalWalletsApi* | [**getInternalWallets**](docs/InternalWalletsApi.md#getInternalWallets) | **GET** /internal_wallets | List internal wallets
*InternalWalletsApi* | [**setCustomerRefIdForInternalWallet**](docs/InternalWalletsApi.md#setCustomerRefIdForInternalWallet) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet
*NetworkConnectionsApi* | [**checkThirdPartyRoutingForNetworkConnection**](docs/NetworkConnectionsApi.md#checkThirdPartyRoutingForNetworkConnection) | **GET** /network_connections/{connectionId}/is_third_party_routing/{assetType} | Retrieve third-party network routing validation by asset type.
*NetworkConnectionsApi* | [**createNetworkConnection**](docs/NetworkConnectionsApi.md#createNetworkConnection) | **POST** /network_connections | Creates a new network connection
*NetworkConnectionsApi* | [**createNetworkId**](docs/NetworkConnectionsApi.md#createNetworkId) | **POST** /network_ids | Creates a new Network ID
*NetworkConnectionsApi* | [**deleteNetworkConnection**](docs/NetworkConnectionsApi.md#deleteNetworkConnection) | **DELETE** /network_connections/{connectionId} | Deletes a network connection by ID
*NetworkConnectionsApi* | [**deleteNetworkId**](docs/NetworkConnectionsApi.md#deleteNetworkId) | **DELETE** /network_ids/{networkId} | Deletes specific network ID.
*NetworkConnectionsApi* | [**getNetworkConnectionById**](docs/NetworkConnectionsApi.md#getNetworkConnectionById) | **GET** /network_connections/{connectionId} | Get a network connection
*NetworkConnectionsApi* | [**getNetworkConnections**](docs/NetworkConnectionsApi.md#getNetworkConnections) | **GET** /network_connections | List network connections
*NetworkConnectionsApi* | [**getNetworkIdById**](docs/NetworkConnectionsApi.md#getNetworkIdById) | **GET** /network_ids/{networkId} | Returns specific network ID.
*NetworkConnectionsApi* | [**getNetworkIds**](docs/NetworkConnectionsApi.md#getNetworkIds) | **GET** /network_ids | Returns all network IDs, both local IDs and discoverable remote IDs
*NetworkConnectionsApi* | [**setDiscoverabilityForNetworkId**](docs/NetworkConnectionsApi.md#setDiscoverabilityForNetworkId) | **PATCH** /network_ids/{networkId}/set_discoverability | Update network ID&#39;s discoverability.
*NetworkConnectionsApi* | [**setNetworkIdName**](docs/NetworkConnectionsApi.md#setNetworkIdName) | **PATCH** /network_ids/{networkId}/set_name | Update network ID&#39;s name.
*NetworkConnectionsApi* | [**setRoutingPolicyForNetworkConnection**](docs/NetworkConnectionsApi.md#setRoutingPolicyForNetworkConnection) | **PATCH** /network_connections/{connectionId}/set_routing_policy | Update network connection routing policy.
*NetworkConnectionsApi* | [**setRoutingPolicyForNetworkId**](docs/NetworkConnectionsApi.md#setRoutingPolicyForNetworkId) | **PATCH** /network_ids/{networkId}/set_routing_policy | Update network id routing policy.
*NftsApi* | [**getNFT**](docs/NftsApi.md#getNFT) | **GET** /nfts/tokens/{id} | List token data by ID
*NftsApi* | [**getNFTs**](docs/NftsApi.md#getNFTs) | **GET** /nfts/tokens | List tokens by IDs
*NftsApi* | [**getOwnershipTokens**](docs/NftsApi.md#getOwnershipTokens) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated)
*NftsApi* | [**listOwnedCollections**](docs/NftsApi.md#listOwnedCollections) | **GET** /nfts/ownership/collections | List owned collections (paginated)
*NftsApi* | [**refreshNFTMetadata**](docs/NftsApi.md#refreshNFTMetadata) | **PUT** /nfts/tokens/{id} | Refresh token metadata
*NftsApi* | [**updateOwnershipTokens**](docs/NftsApi.md#updateOwnershipTokens) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens
*NftsApi* | [**updateTokenOwnershipStatus**](docs/NftsApi.md#updateTokenOwnershipStatus) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status
*OffExchangesApi* | [**addOffExchange**](docs/OffExchangesApi.md#addOffExchange) | **POST** /off_exchange/add | add collateral
*OffExchangesApi* | [**getOffExchangeCollateralAccounts**](docs/OffExchangesApi.md#getOffExchangeCollateralAccounts) | **GET** /off_exchange/collateral_accounts/{mainExchangeAccountId} | Find a specific collateral exchange account
*OffExchangesApi* | [**getOffExchangeSettlementTransactions**](docs/OffExchangesApi.md#getOffExchangeSettlementTransactions) | **GET** /off_exchange/settlements/transactions | get settlements transactions from exchange
*OffExchangesApi* | [**removeOffExchange**](docs/OffExchangesApi.md#removeOffExchange) | **POST** /off_exchange/remove | remove collateral
*OffExchangesApi* | [**settleOffExchangeTrades**](docs/OffExchangesApi.md#settleOffExchangeTrades) | **POST** /off_exchange/settlements/trader | create settlement for a trader
*OtaBetaApi* | [**getOtaStatus**](docs/OtaBetaApi.md#getOtaStatus) | **GET** /management/ota | Returns current OTA status
*OtaBetaApi* | [**setOtaStatus**](docs/OtaBetaApi.md#setOtaStatus) | **POST** /management/ota | Enable or disable transactions to OTA
*PaymentsCrossBorderSettlementApi* | [**createXBSettlementConfig**](docs/PaymentsCrossBorderSettlementApi.md#createXBSettlementConfig) | **POST** /payments/xb-settlements/configs | Create a new cross-border settlement configuration
*PaymentsCrossBorderSettlementApi* | [**createXBSettlementFlow**](docs/PaymentsCrossBorderSettlementApi.md#createXBSettlementFlow) | **POST** /payments/xb-settlements/flows | Create a new cross-border settlement flow
*PaymentsCrossBorderSettlementApi* | [**deleteXBSettlementConfig**](docs/PaymentsCrossBorderSettlementApi.md#deleteXBSettlementConfig) | **DELETE** /payments/xb-settlements/configs/{configId} | Delete a cross-border settlement configuration
*PaymentsCrossBorderSettlementApi* | [**executeXBSettlementFlowAction**](docs/PaymentsCrossBorderSettlementApi.md#executeXBSettlementFlowAction) | **POST** /payments/xb-settlements/flows/{flowId}/actions/execute | Execute cross-border settlement flow
*PaymentsCrossBorderSettlementApi* | [**getXBSettlementConfigById**](docs/PaymentsCrossBorderSettlementApi.md#getXBSettlementConfigById) | **GET** /payments/xb-settlements/configs/{configId} | Get a specific cross-border settlement configuration
*PaymentsCrossBorderSettlementApi* | [**getXBSettlementConfigs**](docs/PaymentsCrossBorderSettlementApi.md#getXBSettlementConfigs) | **GET** /payments/xb-settlements/configs | Get all the cross-border settlement configurations
*PaymentsCrossBorderSettlementApi* | [**getXBSettlementFlowById**](docs/PaymentsCrossBorderSettlementApi.md#getXBSettlementFlowById) | **GET** /payments/xb-settlements/flows/{flowId} | Get specific cross-border settlement flow details
*PaymentsCrossBorderSettlementApi* | [**updateXBSettlementConfig**](docs/PaymentsCrossBorderSettlementApi.md#updateXBSettlementConfig) | **PUT** /payments/xb-settlements/configs/{configId} | Edit a cross-border settlement configuration
*PaymentsPayoutApi* | [**createPayout**](docs/PaymentsPayoutApi.md#createPayout) | **POST** /payments/payout | Create a payout instruction set
*PaymentsPayoutApi* | [**executePayoutAction**](docs/PaymentsPayoutApi.md#executePayoutAction) | **POST** /payments/payout/{payoutId}/actions/execute | Execute a payout instruction set
*PaymentsPayoutApi* | [**getPayoutById**](docs/PaymentsPayoutApi.md#getPayoutById) | **GET** /payments/payout/{payoutId} | Get the status of a payout instruction set
*PolicyEditorBetaApi* | [**getActivePolicy**](docs/PolicyEditorBetaApi.md#getActivePolicy) | **GET** /tap/active_policy | Get the active policy and its validation
*PolicyEditorBetaApi* | [**getDraft**](docs/PolicyEditorBetaApi.md#getDraft) | **GET** /tap/draft | Get the active draft
*PolicyEditorBetaApi* | [**publishDraft**](docs/PolicyEditorBetaApi.md#publishDraft) | **POST** /tap/draft | Send publish request for a certain draft id
*PolicyEditorBetaApi* | [**publishPolicyRules**](docs/PolicyEditorBetaApi.md#publishPolicyRules) | **POST** /tap/publish | Send publish request for a set of policy rules
*PolicyEditorBetaApi* | [**updateDraft**](docs/PolicyEditorBetaApi.md#updateDraft) | **PUT** /tap/draft | Update the draft with a new set of rules
*TransactionsApi* | [**cancelTransaction**](docs/TransactionsApi.md#cancelTransaction) | **POST** /transactions/{txId}/cancel | Cancel a transaction
*TransactionsApi* | [**createTransaction**](docs/TransactionsApi.md#createTransaction) | **POST** /transactions | Create a new transaction
*TransactionsApi* | [**dropTransaction**](docs/TransactionsApi.md#dropTransaction) | **POST** /transactions/{txId}/drop | Drop ETH transaction by ID
*TransactionsApi* | [**estimateNetworkFee**](docs/TransactionsApi.md#estimateNetworkFee) | **GET** /estimate_network_fee | Estimate the required fee for an asset
*TransactionsApi* | [**estimateTransactionFee**](docs/TransactionsApi.md#estimateTransactionFee) | **POST** /transactions/estimate_fee | Estimate transaction fee
*TransactionsApi* | [**freezeTransaction**](docs/TransactionsApi.md#freezeTransaction) | **POST** /transactions/{txId}/freeze | Freeze a transaction
*TransactionsApi* | [**getTransactionByExternalId**](docs/TransactionsApi.md#getTransactionByExternalId) | **GET** /transactions/external_tx_id/{externalTxId}/ | Find a specific transaction by external transaction ID
*TransactionsApi* | [**getTransactionById**](docs/TransactionsApi.md#getTransactionById) | **GET** /transactions/{txId} | Find a specific transaction by Fireblocks transaction ID
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#getTransactions) | **GET** /transactions | List transaction history
*TransactionsApi* | [**setConfirmationThresholdForTransaction**](docs/TransactionsApi.md#setConfirmationThresholdForTransaction) | **POST** /transactions/{txId}/set_confirmation_threshold | Set confirmation threshold by transaction ID
*TransactionsApi* | [**setConfirmationThresholdForTransactionByHash**](docs/TransactionsApi.md#setConfirmationThresholdForTransactionByHash) | **POST** /txHash/{txHash}/set_confirmation_threshold | Set confirmation threshold by transaction hash
*TransactionsApi* | [**unfreezeTransaction**](docs/TransactionsApi.md#unfreezeTransaction) | **POST** /transactions/{txId}/unfreeze | Unfreeze a transaction
*TransactionsApi* | [**validateAddress**](docs/TransactionsApi.md#validateAddress) | **GET** /transactions/validate_address/{assetId}/{address} | Validate destination address
*TravelRuleBetaApi* | [**getVASPByDID**](docs/TravelRuleBetaApi.md#getVASPByDID) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details
*TravelRuleBetaApi* | [**getVASPs**](docs/TravelRuleBetaApi.md#getVASPs) | **GET** /screening/travel_rule/vasp | Get All VASPs
*TravelRuleBetaApi* | [**travelRuleApiControllerUpdateVasp**](docs/TravelRuleBetaApi.md#travelRuleApiControllerUpdateVasp) | **PUT** /screeening/travel_rule/vasp/update | Add jsonDidKey to VASP details
*TravelRuleBetaApi* | [**validateFullTravelRuleTransaction**](docs/TravelRuleBetaApi.md#validateFullTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction
*TravelRuleBetaApi* | [**validateTravelRuleTransaction**](docs/TravelRuleBetaApi.md#validateTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate | Validate Travel Rule Transaction
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | List users
*UsersGroupsBetaApi* | [**createUserGroup**](docs/UsersGroupsBetaApi.md#createUserGroup) | **POST** /users_groups | Create users group
*UsersGroupsBetaApi* | [**deleteUserGroup**](docs/UsersGroupsBetaApi.md#deleteUserGroup) | **DELETE** /users_groups/{groupId} | Delete users group
*UsersGroupsBetaApi* | [**getUserGroup**](docs/UsersGroupsBetaApi.md#getUserGroup) | **GET** /users_groups/{groupId} | Get users group
*UsersGroupsBetaApi* | [**getUserGroups**](docs/UsersGroupsBetaApi.md#getUserGroups) | **GET** /users_groups | List users groups
*UsersGroupsBetaApi* | [**updateUserGroup**](docs/UsersGroupsBetaApi.md#updateUserGroup) | **PUT** /users_groups/{groupId} | Update users group
*VaultsApi* | [**activateAssetForVaultAccount**](docs/VaultsApi.md#activateAssetForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account
*VaultsApi* | [**createLegacyAddressForVaultAccountAsset**](docs/VaultsApi.md#createLegacyAddressForVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format
*VaultsApi* | [**createVaultAccount**](docs/VaultsApi.md#createVaultAccount) | **POST** /vault/accounts | Create a new vault account
*VaultsApi* | [**createVaultAccountAsset**](docs/VaultsApi.md#createVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet
*VaultsApi* | [**createVaultAccountAssetAddress**](docs/VaultsApi.md#createVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address
*VaultsApi* | [**getAssetWallets**](docs/VaultsApi.md#getAssetWallets) | **GET** /vault/asset_wallets | List asset wallets (Paginated)
*VaultsApi* | [**getMaxSpendableAmount**](docs/VaultsApi.md#getMaxSpendableAmount) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount | Get the maximum spendable amount in a single transaction.
*VaultsApi* | [**getPagedVaultAccounts**](docs/VaultsApi.md#getPagedVaultAccounts) | **GET** /vault/accounts_paged | List vault acounts (Paginated)
*VaultsApi* | [**getPublicKeyInfo**](docs/VaultsApi.md#getPublicKeyInfo) | **GET** /vault/public_key_info/ | Get the public key information
*VaultsApi* | [**getPublicKeyInfoForAddress**](docs/VaultsApi.md#getPublicKeyInfoForAddress) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key for a vault account
*VaultsApi* | [**getVaultAccountAsset**](docs/VaultsApi.md#getVaultAccountAsset) | **GET** /vault/accounts/{vaultAccountId}/{assetId} | Get the asset balance for a vault account
*VaultsApi* | [**getVaultAccountAssetAddresses**](docs/VaultsApi.md#getVaultAccountAssetAddresses) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Get asset addresses
*VaultsApi* | [**getVaultAccountAssetUnspentInputs**](docs/VaultsApi.md#getVaultAccountAssetUnspentInputs) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs | Get UTXO unspent inputs information
*VaultsApi* | [**getVaultAccountById**](docs/VaultsApi.md#getVaultAccountById) | **GET** /vault/accounts/{vaultAccountId} | Find a vault account by ID
*VaultsApi* | [**getVaultAccounts**](docs/VaultsApi.md#getVaultAccounts) | **GET** /vault/accounts | List vault accounts
*VaultsApi* | [**getVaultAssetById**](docs/VaultsApi.md#getVaultAssetById) | **GET** /vault/assets/{assetId} | Get vault balance by asset
*VaultsApi* | [**getVaultAssets**](docs/VaultsApi.md#getVaultAssets) | **GET** /vault/assets | Get asset balance for chosen assets
*VaultsApi* | [**hideVaultAccount**](docs/VaultsApi.md#hideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/hide | Hide a vault account in the console
*VaultsApi* | [**setAutoFuelForVaultAccount**](docs/VaultsApi.md#setAutoFuelForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/set_auto_fuel | Turn autofueling on or off
*VaultsApi* | [**setCustomerRefIdForVaultAccount**](docs/VaultsApi.md#setCustomerRefIdForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/set_customer_ref_id | Set an AML/KYT customer reference ID for a vault account
*VaultsApi* | [**setCustomerRefIdForVaultAccountAssetAddress**](docs/VaultsApi.md#setCustomerRefIdForVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id | Assign AML customer reference ID
*VaultsApi* | [**unhideVaultAccount**](docs/VaultsApi.md#unhideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/unhide | Unhide a vault account in the console
*VaultsApi* | [**updateVaultAccount**](docs/VaultsApi.md#updateVaultAccount) | **PUT** /vault/accounts/{vaultAccountId} | Rename a vault account
*VaultsApi* | [**updateVaultAccountAssetAddress**](docs/VaultsApi.md#updateVaultAccountAssetAddress) | **PUT** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId} | Update address description
*VaultsApi* | [**updateVaultAccountAssetBalance**](docs/VaultsApi.md#updateVaultAccountAssetBalance) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/balance | Refresh asset balance data
*Web3ConnectionsApi* | [**create**](docs/Web3ConnectionsApi.md#create) | **POST** /connections/wc | Create a new Web3 connection.
*Web3ConnectionsApi* | [**get**](docs/Web3ConnectionsApi.md#get) | **GET** /connections | List all open Web3 connections.
*Web3ConnectionsApi* | [**remove**](docs/Web3ConnectionsApi.md#remove) | **DELETE** /connections/wc/{id} | Remove an existing Web3 connection.
*Web3ConnectionsApi* | [**submit**](docs/Web3ConnectionsApi.md#submit) | **PUT** /connections/wc/{id} | Respond to a pending Web3 connection request.
*WebhooksApi* | [**resendWebhooks**](docs/WebhooksApi.md#resendWebhooks) | **POST** /webhooks/resend | Resend failed webhooks
*WebhooksApi* | [**resendWebhooksForTransaction**](docs/WebhooksApi.md#resendWebhooksForTransaction) | **POST** /webhooks/resend/{txId} | Resend failed webhooks for a transaction by ID


## Documentation for Models

 - [AddAssetToContractRequest](docs/AddAssetToContractRequest.md)
 - [AddAssetToExternalWalletRequest](docs/AddAssetToExternalWalletRequest.md)
 - [AddAssetToExternalWalletRequestOneOf](docs/AddAssetToExternalWalletRequestOneOf.md)
 - [AddAssetToExternalWalletRequestOneOf1](docs/AddAssetToExternalWalletRequestOneOf1.md)
 - [AddAssetToExternalWalletRequestOneOf1AdditionalInfo](docs/AddAssetToExternalWalletRequestOneOf1AdditionalInfo.md)
 - [AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf](docs/AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf.md)
 - [AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf1](docs/AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf1.md)
 - [AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf2](docs/AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf2.md)
 - [AddCollateralRequestBody](docs/AddCollateralRequestBody.md)
 - [AmlScreeningResult](docs/AmlScreeningResult.md)
 - [AmountAggregationTimePeriodMethod](docs/AmountAggregationTimePeriodMethod.md)
 - [AmountInfo](docs/AmountInfo.md)
 - [AssetTypeResponse](docs/AssetTypeResponse.md)
 - [AssetWallet](docs/AssetWallet.md)
 - [AuthorizationGroups](docs/AuthorizationGroups.md)
 - [AuthorizationInfo](docs/AuthorizationInfo.md)
 - [BlockInfo](docs/BlockInfo.md)
 - [CancelTransactionResponse](docs/CancelTransactionResponse.md)
 - [CheckThirdPartyRoutingForNetworkConnection200Response](docs/CheckThirdPartyRoutingForNetworkConnection200Response.md)
 - [CollectionOwnershipResponse](docs/CollectionOwnershipResponse.md)
 - [ConfigChangeRequestStatus](docs/ConfigChangeRequestStatus.md)
 - [ConvertAssetsRequest](docs/ConvertAssetsRequest.md)
 - [CreateAddressResponse](docs/CreateAddressResponse.md)
 - [CreateConnectionRequest](docs/CreateConnectionRequest.md)
 - [CreateConnectionResponse](docs/CreateConnectionResponse.md)
 - [CreateConnectionResponseSessionMetadata](docs/CreateConnectionResponseSessionMetadata.md)
 - [CreateContractRequest](docs/CreateContractRequest.md)
 - [CreateInternalTransferRequest](docs/CreateInternalTransferRequest.md)
 - [CreateInternalWalletAssetRequest](docs/CreateInternalWalletAssetRequest.md)
 - [CreateInternalWalletRequest](docs/CreateInternalWalletRequest.md)
 - [CreateNetworkIdRequest](docs/CreateNetworkIdRequest.md)
 - [CreatePayoutRequest](docs/CreatePayoutRequest.md)
 - [CreateTransactionResponse](docs/CreateTransactionResponse.md)
 - [CreateUsersGroupResponse](docs/CreateUsersGroupResponse.md)
 - [CreateVaultAccountAssetAddressRequest](docs/CreateVaultAccountAssetAddressRequest.md)
 - [CreateVaultAccountAssetRequest](docs/CreateVaultAccountAssetRequest.md)
 - [CreateVaultAccountRequest](docs/CreateVaultAccountRequest.md)
 - [CreateVaultAssetResponse](docs/CreateVaultAssetResponse.md)
 - [CustomCryptoRoutingDest](docs/CustomCryptoRoutingDest.md)
 - [CustomFiatRoutingDest](docs/CustomFiatRoutingDest.md)
 - [DefaultNetworkRoutingDest](docs/DefaultNetworkRoutingDest.md)
 - [DestinationTransferPeerPath](docs/DestinationTransferPeerPath.md)
 - [DestinationTransferPeerPathAllOf](docs/DestinationTransferPeerPathAllOf.md)
 - [DestinationTransferPeerPathResponse](docs/DestinationTransferPeerPathResponse.md)
 - [DestinationTransferPeerPathResponseAllOf](docs/DestinationTransferPeerPathResponseAllOf.md)
 - [DispatchPayoutResponse](docs/DispatchPayoutResponse.md)
 - [DraftResponse](docs/DraftResponse.md)
 - [DraftReviewAndValidationResponse](docs/DraftReviewAndValidationResponse.md)
 - [DropTransactionRequest](docs/DropTransactionRequest.md)
 - [DropTransactionResponse](docs/DropTransactionResponse.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorResponseError](docs/ErrorResponseError.md)
 - [EstimatedNetworkFeeResponse](docs/EstimatedNetworkFeeResponse.md)
 - [EstimatedTransactionFeeResponse](docs/EstimatedTransactionFeeResponse.md)
 - [ExchangeAccount](docs/ExchangeAccount.md)
 - [ExchangeAsset](docs/ExchangeAsset.md)
 - [ExchangeTradingAccount](docs/ExchangeTradingAccount.md)
 - [ExchangeType](docs/ExchangeType.md)
 - [ExternalWalletAsset](docs/ExternalWalletAsset.md)
 - [FeeInfo](docs/FeeInfo.md)
 - [FiatAccount](docs/FiatAccount.md)
 - [FiatAccountType](docs/FiatAccountType.md)
 - [FiatAsset](docs/FiatAsset.md)
 - [FreezeTransactionResponse](docs/FreezeTransactionResponse.md)
 - [GasStationConfiguration](docs/GasStationConfiguration.md)
 - [GasStationPropertiesResponse](docs/GasStationPropertiesResponse.md)
 - [GetConnectionsResponse](docs/GetConnectionsResponse.md)
 - [GetFilterParameter](docs/GetFilterParameter.md)
 - [GetNFTs200Response](docs/GetNFTs200Response.md)
 - [GetNetworkIds200ResponseInner](docs/GetNetworkIds200ResponseInner.md)
 - [GetOtaStatus200Response](docs/GetOtaStatus200Response.md)
 - [GetOwnershipTokens200Response](docs/GetOwnershipTokens200Response.md)
 - [GetTransactionOperation](docs/GetTransactionOperation.md)
 - [GetUsersResponse](docs/GetUsersResponse.md)
 - [InstructionAmount](docs/InstructionAmount.md)
 - [ListOwnedCollections200Response](docs/ListOwnedCollections200Response.md)
 - [MediaEntityResponse](docs/MediaEntityResponse.md)
 - [NetworkChannel](docs/NetworkChannel.md)
 - [NetworkConnection](docs/NetworkConnection.md)
 - [NetworkConnectionResponse](docs/NetworkConnectionResponse.md)
 - [NetworkConnectionResponseLocalChannel](docs/NetworkConnectionResponseLocalChannel.md)
 - [NetworkConnectionResponseRemoteChannel](docs/NetworkConnectionResponseRemoteChannel.md)
 - [NetworkConnectionRoutingPolicy](docs/NetworkConnectionRoutingPolicy.md)
 - [NetworkConnectionRoutingPolicyCrypto](docs/NetworkConnectionRoutingPolicyCrypto.md)
 - [NetworkConnectionRoutingPolicySen](docs/NetworkConnectionRoutingPolicySen.md)
 - [NetworkConnectionRoutingPolicySenTest](docs/NetworkConnectionRoutingPolicySenTest.md)
 - [NetworkConnectionRoutingPolicySignet](docs/NetworkConnectionRoutingPolicySignet.md)
 - [NetworkConnectionRoutingPolicySignetTest](docs/NetworkConnectionRoutingPolicySignetTest.md)
 - [NetworkFee](docs/NetworkFee.md)
 - [NetworkId](docs/NetworkId.md)
 - [NetworkIdResponse](docs/NetworkIdResponse.md)
 - [NetworkIdResponseAllOf](docs/NetworkIdResponseAllOf.md)
 - [NetworkIdRoutingPolicy](docs/NetworkIdRoutingPolicy.md)
 - [NetworkIdRoutingPolicyCrypto](docs/NetworkIdRoutingPolicyCrypto.md)
 - [NetworkIdRoutingPolicySen](docs/NetworkIdRoutingPolicySen.md)
 - [NetworkIdRoutingPolicySenTest](docs/NetworkIdRoutingPolicySenTest.md)
 - [NetworkRecord](docs/NetworkRecord.md)
 - [NoneNetworkRoutingDest](docs/NoneNetworkRoutingDest.md)
 - [OneTimeAddress](docs/OneTimeAddress.md)
 - [PaginatedAssetWalletResponse](docs/PaginatedAssetWalletResponse.md)
 - [PaginatedAssetWalletResponsePaging](docs/PaginatedAssetWalletResponsePaging.md)
 - [Paging](docs/Paging.md)
 - [PayeeAccount](docs/PayeeAccount.md)
 - [PayeeAccountResponse](docs/PayeeAccountResponse.md)
 - [PayeeAccountType](docs/PayeeAccountType.md)
 - [PaymentAccount](docs/PaymentAccount.md)
 - [PaymentAccountResponse](docs/PaymentAccountResponse.md)
 - [PaymentAccountType](docs/PaymentAccountType.md)
 - [PayoutInitMethod](docs/PayoutInitMethod.md)
 - [PayoutInstruction](docs/PayoutInstruction.md)
 - [PayoutInstructionResponse](docs/PayoutInstructionResponse.md)
 - [PayoutInstructionState](docs/PayoutInstructionState.md)
 - [PayoutResponse](docs/PayoutResponse.md)
 - [PayoutState](docs/PayoutState.md)
 - [PayoutStatus](docs/PayoutStatus.md)
 - [PolicyAndValidationResponse](docs/PolicyAndValidationResponse.md)
 - [PolicyCheckResult](docs/PolicyCheckResult.md)
 - [PolicyMetadata](docs/PolicyMetadata.md)
 - [PolicyResponse](docs/PolicyResponse.md)
 - [PolicyRule](docs/PolicyRule.md)
 - [PolicyRuleAmountAggregation](docs/PolicyRuleAmountAggregation.md)
 - [PolicyRuleAuthorizationGroups](docs/PolicyRuleAuthorizationGroups.md)
 - [PolicyRuleAuthorizationGroupsGroupsInner](docs/PolicyRuleAuthorizationGroupsGroupsInner.md)
 - [PolicyRuleCheckResult](docs/PolicyRuleCheckResult.md)
 - [PolicyRuleDesignatedSigners](docs/PolicyRuleDesignatedSigners.md)
 - [PolicyRuleDst](docs/PolicyRuleDst.md)
 - [PolicyRuleError](docs/PolicyRuleError.md)
 - [PolicyRuleOperators](docs/PolicyRuleOperators.md)
 - [PolicyRuleRawMessageSigning](docs/PolicyRuleRawMessageSigning.md)
 - [PolicyRuleRawMessageSigningDerivationPath](docs/PolicyRuleRawMessageSigningDerivationPath.md)
 - [PolicyRuleSrc](docs/PolicyRuleSrc.md)
 - [PolicyRuleSrcIdsInnerInner](docs/PolicyRuleSrcIdsInnerInner.md)
 - [PolicySrcOrDestSubType](docs/PolicySrcOrDestSubType.md)
 - [PolicySrcOrDestType](docs/PolicySrcOrDestType.md)
 - [PolicyStatus](docs/PolicyStatus.md)
 - [PolicyValidation](docs/PolicyValidation.md)
 - [PublicKeyInformation](docs/PublicKeyInformation.md)
 - [PublishDraftRequest](docs/PublishDraftRequest.md)
 - [PublishPolicyRulesRequest](docs/PublishPolicyRulesRequest.md)
 - [PublishResult](docs/PublishResult.md)
 - [RedeemFundsToLinkedDDARequest](docs/RedeemFundsToLinkedDDARequest.md)
 - [RemoveCollateralRequestBody](docs/RemoveCollateralRequestBody.md)
 - [ResendWebhooksForTransactionRequest](docs/ResendWebhooksForTransactionRequest.md)
 - [ResendWebhooksResponse](docs/ResendWebhooksResponse.md)
 - [RespondToConnectionRequest](docs/RespondToConnectionRequest.md)
 - [RewardInfo](docs/RewardInfo.md)
 - [RewardsInfo](docs/RewardsInfo.md)
 - [SessionDTO](docs/SessionDTO.md)
 - [SessionDTOSessionMetadata](docs/SessionDTOSessionMetadata.md)
 - [SessionMetadata](docs/SessionMetadata.md)
 - [SetAutoFuelForVaultAccountRequest](docs/SetAutoFuelForVaultAccountRequest.md)
 - [SetConfirmationsThresholdRequest](docs/SetConfirmationsThresholdRequest.md)
 - [SetConfirmationsThresholdResponse](docs/SetConfirmationsThresholdResponse.md)
 - [SetCustomerRefIdForVaultAccountRequest](docs/SetCustomerRefIdForVaultAccountRequest.md)
 - [SetDiscoverabilityForNetworkIdRequest](docs/SetDiscoverabilityForNetworkIdRequest.md)
 - [SetNetworkIdNameRequest](docs/SetNetworkIdNameRequest.md)
 - [SetOtaStatusRequest](docs/SetOtaStatusRequest.md)
 - [SetRoutingPolicyForNetworkConnection200Response](docs/SetRoutingPolicyForNetworkConnection200Response.md)
 - [SetRoutingPolicyForNetworkConnectionRequest](docs/SetRoutingPolicyForNetworkConnectionRequest.md)
 - [SetRoutingPolicyForNetworkIdRequest](docs/SetRoutingPolicyForNetworkIdRequest.md)
 - [SettlementRequestBody](docs/SettlementRequestBody.md)
 - [SettlementResponse](docs/SettlementResponse.md)
 - [SignedMessage](docs/SignedMessage.md)
 - [SignedMessageSignature](docs/SignedMessageSignature.md)
 - [SourceTransferPeerPathResponse](docs/SourceTransferPeerPathResponse.md)
 - [SourceTransferPeerPathResponseAllOf](docs/SourceTransferPeerPathResponseAllOf.md)
 - [SystemMessageInfo](docs/SystemMessageInfo.md)
 - [Term](docs/Term.md)
 - [ToCollateralTransaction](docs/ToCollateralTransaction.md)
 - [ToExchangeTransaction](docs/ToExchangeTransaction.md)
 - [TokenCollectionResponse](docs/TokenCollectionResponse.md)
 - [TokenOwnershipResponse](docs/TokenOwnershipResponse.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [TokenResponseCollection](docs/TokenResponseCollection.md)
 - [TradingAccountType](docs/TradingAccountType.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionFee](docs/TransactionFee.md)
 - [TransactionOperation](docs/TransactionOperation.md)
 - [TransactionRequest](docs/TransactionRequest.md)
 - [TransactionRequestAmount](docs/TransactionRequestAmount.md)
 - [TransactionRequestDestination](docs/TransactionRequestDestination.md)
 - [TransactionRequestFee](docs/TransactionRequestFee.md)
 - [TransactionRequestGasLimit](docs/TransactionRequestGasLimit.md)
 - [TransactionRequestGasPrice](docs/TransactionRequestGasPrice.md)
 - [TransactionRequestNetworkFee](docs/TransactionRequestNetworkFee.md)
 - [TransactionRequestNetworkStaking](docs/TransactionRequestNetworkStaking.md)
 - [TransactionRequestPriorityFee](docs/TransactionRequestPriorityFee.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [TransactionResponseContractCallDecodedData](docs/TransactionResponseContractCallDecodedData.md)
 - [TransactionResponseDestination](docs/TransactionResponseDestination.md)
 - [TransferPeerPath](docs/TransferPeerPath.md)
 - [TravelRuleAddress](docs/TravelRuleAddress.md)
 - [TravelRuleGetAllVASPsResponse](docs/TravelRuleGetAllVASPsResponse.md)
 - [TravelRuleIssuer](docs/TravelRuleIssuer.md)
 - [TravelRuleIssuers](docs/TravelRuleIssuers.md)
 - [TravelRuleOwnershipProof](docs/TravelRuleOwnershipProof.md)
 - [TravelRulePiiIVMS](docs/TravelRulePiiIVMS.md)
 - [TravelRuleTransactionBlockchainInfo](docs/TravelRuleTransactionBlockchainInfo.md)
 - [TravelRuleUpdateVASPDetails](docs/TravelRuleUpdateVASPDetails.md)
 - [TravelRuleVASP](docs/TravelRuleVASP.md)
 - [TravelRuleValidateFullTransactionRequest](docs/TravelRuleValidateFullTransactionRequest.md)
 - [TravelRuleValidateFullTransactionRequestBeneficiary](docs/TravelRuleValidateFullTransactionRequestBeneficiary.md)
 - [TravelRuleValidateFullTransactionRequestBeneficiaryProof](docs/TravelRuleValidateFullTransactionRequestBeneficiaryProof.md)
 - [TravelRuleValidateFullTransactionRequestOriginator](docs/TravelRuleValidateFullTransactionRequestOriginator.md)
 - [TravelRuleValidateFullTransactionRequestOriginatorProof](docs/TravelRuleValidateFullTransactionRequestOriginatorProof.md)
 - [TravelRuleValidateFullTransactionRequestPii](docs/TravelRuleValidateFullTransactionRequestPii.md)
 - [TravelRuleValidateFullTransactionRequestTransactionBlockchainInfo](docs/TravelRuleValidateFullTransactionRequestTransactionBlockchainInfo.md)
 - [TravelRuleValidateTransactionRequest](docs/TravelRuleValidateTransactionRequest.md)
 - [TravelRuleValidateTransactionRequestBeneficiaryAddress](docs/TravelRuleValidateTransactionRequestBeneficiaryAddress.md)
 - [TravelRuleValidateTransactionResponse](docs/TravelRuleValidateTransactionResponse.md)
 - [UnfreezeTransactionResponse](docs/UnfreezeTransactionResponse.md)
 - [UnmanagedWallet](docs/UnmanagedWallet.md)
 - [UnsignedMessage](docs/UnsignedMessage.md)
 - [UnspentInput](docs/UnspentInput.md)
 - [UnspentInputsResponse](docs/UnspentInputsResponse.md)
 - [UpdateDraftRequest](docs/UpdateDraftRequest.md)
 - [UpdateTokenOwnershipStatusDto](docs/UpdateTokenOwnershipStatusDto.md)
 - [UpdateVaultAccountAssetAddressRequest](docs/UpdateVaultAccountAssetAddressRequest.md)
 - [UpdateVaultAccountRequest](docs/UpdateVaultAccountRequest.md)
 - [UserGroupCreateRequest](docs/UserGroupCreateRequest.md)
 - [UserGroupCreateResponse](docs/UserGroupCreateResponse.md)
 - [UserGroupUpdateRequest](docs/UserGroupUpdateRequest.md)
 - [UserResponse](docs/UserResponse.md)
 - [UsersGroupResponse](docs/UsersGroupResponse.md)
 - [ValidateAddressResponse](docs/ValidateAddressResponse.md)
 - [VaultAccount](docs/VaultAccount.md)
 - [VaultAccountsPagedResponse](docs/VaultAccountsPagedResponse.md)
 - [VaultAccountsPagedResponsePaging](docs/VaultAccountsPagedResponsePaging.md)
 - [VaultAsset](docs/VaultAsset.md)
 - [VaultWalletAddress](docs/VaultWalletAddress.md)
 - [WalletAsset](docs/WalletAsset.md)
 - [WalletAssetAdditionalInfo](docs/WalletAssetAdditionalInfo.md)
 - [XBSettlementAsset](docs/XBSettlementAsset.md)
 - [XBSettlementAssetID](docs/XBSettlementAssetID.md)
 - [XBSettlementConfigCreationRequestBody](docs/XBSettlementConfigCreationRequestBody.md)
 - [XBSettlementConfigEditRequestBody](docs/XBSettlementConfigEditRequestBody.md)
 - [XBSettlementConfigModel](docs/XBSettlementConfigModel.md)
 - [XBSettlementConfigStep](docs/XBSettlementConfigStep.md)
 - [XBSettlementConfigStepsRecord](docs/XBSettlementConfigStepsRecord.md)
 - [XBSettlementConfigStepsRecordValue](docs/XBSettlementConfigStepsRecordValue.md)
 - [XBSettlementCorridorId](docs/XBSettlementCorridorId.md)
 - [XBSettlementCreateFlowRequestBody](docs/XBSettlementCreateFlowRequestBody.md)
 - [XBSettlementCryptoAsset](docs/XBSettlementCryptoAsset.md)
 - [XBSettlementFiatAsset](docs/XBSettlementFiatAsset.md)
 - [XBSettlementFlowExecutionModel](docs/XBSettlementFlowExecutionModel.md)
 - [XBSettlementFlowExecutionModelSelectedConversionSlippage](docs/XBSettlementFlowExecutionModelSelectedConversionSlippage.md)
 - [XBSettlementFlowExecutionRequestBody](docs/XBSettlementFlowExecutionRequestBody.md)
 - [XBSettlementFlowExecutionStatus](docs/XBSettlementFlowExecutionStatus.md)
 - [XBSettlementFlowExecutionStep](docs/XBSettlementFlowExecutionStep.md)
 - [XBSettlementFlowExecutionStepStatus](docs/XBSettlementFlowExecutionStepStatus.md)
 - [XBSettlementFlowPreviewModel](docs/XBSettlementFlowPreviewModel.md)
 - [XBSettlementFlowSelectedConversionSlippageReason](docs/XBSettlementFlowSelectedConversionSlippageReason.md)
 - [XBSettlementFlowSetupStep](docs/XBSettlementFlowSetupStep.md)
 - [XBSettlementFlowStepsExecutionRecord](docs/XBSettlementFlowStepsExecutionRecord.md)
 - [XBSettlementFlowStepsRecord](docs/XBSettlementFlowStepsRecord.md)
 - [XBSettlementGetAllConfigsResponse](docs/XBSettlementGetAllConfigsResponse.md)
 - [XBSettlementGetFlowResponse](docs/XBSettlementGetFlowResponse.md)
 - [XBSettlementStepType](docs/XBSettlementStepType.md)

