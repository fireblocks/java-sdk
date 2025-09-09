# Official Fireblocks Java SDK
<!--[![Maven version](https://badge.fury.io/java/fireblocks.svg)](https://badge.fury.io/java/fireblocks)-->

For detailed API documentation please refer to the [Fireblocks API Reference](https://developers.fireblocks.com/reference/).

Building the API client library requires:

1. Java 11+
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
  <groupId>com.fireblocks.sdk</groupId>
  <artifactId>fireblocks-sdk</artifactId>
  <version>0.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.fireblocks.sdk:fireblocks-sdk:0.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/fireblocks-sdk-0.0.0.jar`
- `target/lib/*.jar`


## Getting Started
### Initiate Fireblocks Client
You can initialize the Fireblocks SDK in two ways, either by setting environment variables or providing the parameters directly:

<p><strong>Using Environment Variables</strong><br>
    You can initialize the SDK using environment variables from your .env file or by setting them programmatically:</p>

use bash commands to set environment variables:
```bash
export FIREBLOCKS_BASE_PATH="https://sandbox-api.fireblocks.io/v1"
export FIREBLOCKS_API_KEY="my-api-key"
export FIREBLOCKS_SECRET_KEY="my-secret-key"
```

execute the following java code:
```java
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;

ConfigurationOptions configurationOptions = new ConfigurationOptions();
Fireblocks fireblocks = new Fireblocks(configurationOptions);
```

<p><strong>Providing Local Variables</strong><br>
    Alternatively, you can directly pass the required parameters when initializing the Fireblocks API instance:</p>

```java
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;

ConfigurationOptions configurationOptions = new ConfigurationOptions()
    .basePath(BasePath.Sandbox)
    .apiKey("my-api-key")
    .secretKey("my-secret-key");
Fireblocks fireblocks = new Fireblocks(configurationOptions);
```


## Examples
### **Creating a Vault Account**
```java
CreateVaultAccountRequest request = new CreateVaultAccountRequest().name("My Vault Account");
String idempotencyKey = Integer.toString(new Random().nextInt()); // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
// Async request
CompletableFuture<VaultAccount> response = fireblocks.vaults().createVaultAccount(request, idempotencyKey);
// Waiting for the request
VaultAccount vaultAccount = response.get();
```

### **Retrieving Vault Accounts**
```java
BigDecimal limit = new BigDecimal(10);
CompletableFuture<VaultAccountsPagedResponse> response = fireblocks.vaults().getPagedVaultAccounts(null, null, null, null, null, null, null, limit);
VaultAccountsPagedResponse vaultAccountsPagedResponse = response.get();
```

### **Creating a Transaction**
```java
TransactionRequest transactionRequest = new TransactionRequest()
    .operation(TransactionOperation.TRANSFER)
    .source(new TransferPeerPath()
        .type(TransferPeerPath.TypeEnum.VAULT_ACCOUNT)
        .id("0"))
    .destination(new DestinationTransferPeerPath()
        .type(DestinationTransferPeerPath.TypeEnum.VAULT_ACCOUNT)
        .id("1"))
    .amount(new TransactionRequestAmount("0.001"))
    .assetId("ETH_TEST3"); // Ethereum Goerli testnet
    .note("My first Java transaction!");
String idempotencyKey = Integer.toString(new Random().nextInt()); // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
CompletableFuture<CreateTransactionResponse> response = fireblocks.transactions().createTransaction(transactionRequest, null, idempotencyKey);
CreateTransactionResponse transactionResponse = response.get();
String txId = transactionResponse.getId();
```

## Documentation for API Endpoints

All URIs are relative to *https://api.fireblocks.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiUserApi* | [**createApiUser**](docs/ApiUserApi.md#createApiUser) | **POST** /management/api_users | Create Api user
*ApiUserApi* | [**getApiUsers**](docs/ApiUserApi.md#getApiUsers) | **GET** /management/api_users | Get Api users
*AssetsApi* | [**createAssetsBulk**](docs/AssetsApi.md#createAssetsBulk) | **POST** /vault/assets/bulk | Bulk creation of wallets
*AuditLogsApi* | [**getAuditLogs**](docs/AuditLogsApi.md#getAuditLogs) | **GET** /management/audit_logs | Get audit logs
*BlockchainsAssetsApi* | [**getAsset**](docs/BlockchainsAssetsApi.md#getAsset) | **GET** /assets/{id} | Get an asset
*BlockchainsAssetsApi* | [**getBlockchain**](docs/BlockchainsAssetsApi.md#getBlockchain) | **GET** /blockchains/{id} | Get an blockchain
*BlockchainsAssetsApi* | [**getSupportedAssets**](docs/BlockchainsAssetsApi.md#getSupportedAssets) | **GET** /supported_assets | List all asset types supported by Fireblocks - legacy endpoint
*BlockchainsAssetsApi* | [**listAssets**](docs/BlockchainsAssetsApi.md#listAssets) | **GET** /assets | List assets
*BlockchainsAssetsApi* | [**listBlockchains**](docs/BlockchainsAssetsApi.md#listBlockchains) | **GET** /blockchains | List blockchains
*BlockchainsAssetsApi* | [**registerNewAsset**](docs/BlockchainsAssetsApi.md#registerNewAsset) | **POST** /assets | Register an asset
*BlockchainsAssetsApi* | [**setAssetPrice**](docs/BlockchainsAssetsApi.md#setAssetPrice) | **POST** /assets/prices/{id} | Set asset price
*BlockchainsAssetsApi* | [**updateAssetUserMetadata**](docs/BlockchainsAssetsApi.md#updateAssetUserMetadata) | **PATCH** /assets/{id} | Update the user’s metadata for an asset
*ComplianceApi* | [**getAmlPostScreeningPolicy**](docs/ComplianceApi.md#getAmlPostScreeningPolicy) | **GET** /screening/aml/post_screening_policy | AML - View Post-Screening Policy
*ComplianceApi* | [**getAmlScreeningPolicy**](docs/ComplianceApi.md#getAmlScreeningPolicy) | **GET** /screening/aml/screening_policy | AML - View Screening Policy
*ComplianceApi* | [**getPostScreeningPolicy**](docs/ComplianceApi.md#getPostScreeningPolicy) | **GET** /screening/travel_rule/post_screening_policy | Travel Rule - View Post-Screening Policy
*ComplianceApi* | [**getScreeningFullDetails**](docs/ComplianceApi.md#getScreeningFullDetails) | **GET** /screening/transaction/{txId} | Provides all the compliance details for the given screened transaction.
*ComplianceApi* | [**getScreeningPolicy**](docs/ComplianceApi.md#getScreeningPolicy) | **GET** /screening/travel_rule/screening_policy | Travel Rule - View Screening Policy
*ComplianceApi* | [**retryRejectedTransactionBypassScreeningChecks**](docs/ComplianceApi.md#retryRejectedTransactionBypassScreeningChecks) | **POST** /screening/transaction/{txId}/bypass_screening_policy | Calling the \&quot;Bypass Screening Policy\&quot; API endpoint triggers a new transaction, with the API user as the initiator, bypassing the screening policy check
*ComplianceApi* | [**setAmlVerdict**](docs/ComplianceApi.md#setAmlVerdict) | **POST** /screening/aml/verdict/manual | Set AML Verdict for Manual Screening Verdict.
*ComplianceApi* | [**updateAmlScreeningConfiguration**](docs/ComplianceApi.md#updateAmlScreeningConfiguration) | **PUT** /screening/aml/policy_configuration | Update AML Configuration
*ComplianceApi* | [**updateScreeningConfiguration**](docs/ComplianceApi.md#updateScreeningConfiguration) | **PUT** /screening/configurations | Tenant - Screening Configuration
*ComplianceApi* | [**updateTravelRuleConfig**](docs/ComplianceApi.md#updateTravelRuleConfig) | **PUT** /screening/travel_rule/policy_configuration | Update Travel Rule Configuration
*ComplianceScreeningConfigurationApi* | [**getAmlScreeningConfiguration**](docs/ComplianceScreeningConfigurationApi.md#getAmlScreeningConfiguration) | **GET** /screening/aml/policy_configuration | Get AML Screening Policy Configuration
*ComplianceScreeningConfigurationApi* | [**getScreeningConfiguration**](docs/ComplianceScreeningConfigurationApi.md#getScreeningConfiguration) | **GET** /screening/travel_rule/policy_configuration | Get Travel Rule Screening Policy Configuration
*ConnectedAccountsBetaApi* | [**getConnectedAccount**](docs/ConnectedAccountsBetaApi.md#getConnectedAccount) | **GET** /connected_accounts/{accountId} | Get connected account
*ConnectedAccountsBetaApi* | [**getConnectedAccountBalances**](docs/ConnectedAccountsBetaApi.md#getConnectedAccountBalances) | **GET** /connected_accounts/{accountId}/balances | Get balances for an account
*ConnectedAccountsBetaApi* | [**getConnectedAccountRates**](docs/ConnectedAccountsBetaApi.md#getConnectedAccountRates) | **GET** /connected_accounts/{accountId}/rates | Get exchange rates for an account
*ConnectedAccountsBetaApi* | [**getConnectedAccountTradingPairs**](docs/ConnectedAccountsBetaApi.md#getConnectedAccountTradingPairs) | **GET** /connected_accounts/{accountId}/manifest/capabilities/trading/pairs | Get supported trading pairs for an account
*ConnectedAccountsBetaApi* | [**getConnectedAccounts**](docs/ConnectedAccountsBetaApi.md#getConnectedAccounts) | **GET** /connected_accounts | Get connected accounts
*ConsoleUserApi* | [**createConsoleUser**](docs/ConsoleUserApi.md#createConsoleUser) | **POST** /management/users | Create console user
*ConsoleUserApi* | [**getConsoleUsers**](docs/ConsoleUserApi.md#getConsoleUsers) | **GET** /management/users | Get console users
*ContractInteractionsApi* | [**decodeContractData**](docs/ContractInteractionsApi.md#decodeContractData) | **POST** /contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/decode | Decode a function call data, error, or event log
*ContractInteractionsApi* | [**getDeployedContractAbi**](docs/ContractInteractionsApi.md#getDeployedContractAbi) | **GET** /contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions | Return deployed contract&#39;s ABI
*ContractInteractionsApi* | [**getTransactionReceipt**](docs/ContractInteractionsApi.md#getTransactionReceipt) | **GET** /contract_interactions/base_asset_id/{baseAssetId}/tx_hash/{txHash}/receipt | Get transaction receipt
*ContractInteractionsApi* | [**readCallFunction**](docs/ContractInteractionsApi.md#readCallFunction) | **POST** /contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions/read | Call a read function on a deployed contract
*ContractInteractionsApi* | [**writeCallFunction**](docs/ContractInteractionsApi.md#writeCallFunction) | **POST** /contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions/write | Call a write function on a deployed contract
*ContractTemplatesApi* | [**deleteContractTemplateById**](docs/ContractTemplatesApi.md#deleteContractTemplateById) | **DELETE** /tokenization/templates/{contractTemplateId} | Delete a contract template by id
*ContractTemplatesApi* | [**deployContract**](docs/ContractTemplatesApi.md#deployContract) | **POST** /tokenization/templates/{contractTemplateId}/deploy | Deploy contract
*ContractTemplatesApi* | [**getConstructorByContractTemplateId**](docs/ContractTemplatesApi.md#getConstructorByContractTemplateId) | **GET** /tokenization/templates/{contractTemplateId}/constructor | Return contract template&#39;s constructor
*ContractTemplatesApi* | [**getContractTemplateById**](docs/ContractTemplatesApi.md#getContractTemplateById) | **GET** /tokenization/templates/{contractTemplateId} | Return contract template by id
*ContractTemplatesApi* | [**getContractTemplates**](docs/ContractTemplatesApi.md#getContractTemplates) | **GET** /tokenization/templates | List all contract templates
*ContractTemplatesApi* | [**getFunctionAbiByContractTemplateId**](docs/ContractTemplatesApi.md#getFunctionAbiByContractTemplateId) | **GET** /tokenization/templates/{contractTemplateId}/function | Return contract template&#39;s function
*ContractTemplatesApi* | [**uploadContractTemplate**](docs/ContractTemplatesApi.md#uploadContractTemplate) | **POST** /tokenization/templates | Upload contract template
*ContractsApi* | [**addContractAsset**](docs/ContractsApi.md#addContractAsset) | **POST** /contracts/{contractId}/{assetId} | Add an asset to a contract
*ContractsApi* | [**createContract**](docs/ContractsApi.md#createContract) | **POST** /contracts | Create a contract
*ContractsApi* | [**deleteContract**](docs/ContractsApi.md#deleteContract) | **DELETE** /contracts/{contractId} | Delete a contract
*ContractsApi* | [**deleteContractAsset**](docs/ContractsApi.md#deleteContractAsset) | **DELETE** /contracts/{contractId}/{assetId} | Delete a contract asset
*ContractsApi* | [**getContract**](docs/ContractsApi.md#getContract) | **GET** /contracts/{contractId} | Find a specific contract
*ContractsApi* | [**getContractAsset**](docs/ContractsApi.md#getContractAsset) | **GET** /contracts/{contractId}/{assetId} | Find a contract asset
*ContractsApi* | [**getContracts**](docs/ContractsApi.md#getContracts) | **GET** /contracts | List contracts
*CosignersBetaApi* | [**addCosigner**](docs/CosignersBetaApi.md#addCosigner) | **POST** /cosigners | Add cosigner
*CosignersBetaApi* | [**getApiKey**](docs/CosignersBetaApi.md#getApiKey) | **GET** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Get API key
*CosignersBetaApi* | [**getApiKeys**](docs/CosignersBetaApi.md#getApiKeys) | **GET** /cosigners/{cosignerId}/api_keys | Get all API keys
*CosignersBetaApi* | [**getCosigner**](docs/CosignersBetaApi.md#getCosigner) | **GET** /cosigners/{cosignerId} | Get cosigner
*CosignersBetaApi* | [**getCosigners**](docs/CosignersBetaApi.md#getCosigners) | **GET** /cosigners | Get all cosigners
*CosignersBetaApi* | [**getRequestStatus**](docs/CosignersBetaApi.md#getRequestStatus) | **GET** /cosigners/{cosignerId}/api_keys/{apiKeyId}/{requestId} | Get request status
*CosignersBetaApi* | [**pairApiKey**](docs/CosignersBetaApi.md#pairApiKey) | **PUT** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Pair API key
*CosignersBetaApi* | [**renameCosigner**](docs/CosignersBetaApi.md#renameCosigner) | **PATCH** /cosigners/{cosignerId} | Rename cosigner
*CosignersBetaApi* | [**unpairApiKey**](docs/CosignersBetaApi.md#unpairApiKey) | **DELETE** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Unpair API key
*CosignersBetaApi* | [**updateCallbackHandler**](docs/CosignersBetaApi.md#updateCallbackHandler) | **PATCH** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Update API key callback handler
*DeployedContractsApi* | [**addContractABI**](docs/DeployedContractsApi.md#addContractABI) | **POST** /tokenization/contracts/abi | Save contract ABI
*DeployedContractsApi* | [**fetchContractAbi**](docs/DeployedContractsApi.md#fetchContractAbi) | **POST** /tokenization/contracts/fetch_abi | Fetch the contract ABI
*DeployedContractsApi* | [**getDeployedContractByAddress**](docs/DeployedContractsApi.md#getDeployedContractByAddress) | **GET** /tokenization/contracts/{assetId}/{contractAddress} | Return deployed contract data
*DeployedContractsApi* | [**getDeployedContractById**](docs/DeployedContractsApi.md#getDeployedContractById) | **GET** /tokenization/contracts/{id} | Return deployed contract data by id
*DeployedContractsApi* | [**getDeployedContracts**](docs/DeployedContractsApi.md#getDeployedContracts) | **GET** /tokenization/contracts | List deployed contracts data
*EmbeddedWalletsApi* | [**addEmbeddedWalletAsset**](docs/EmbeddedWalletsApi.md#addEmbeddedWalletAsset) | **POST** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId} | Add asset to account
*EmbeddedWalletsApi* | [**createEmbeddedWallet**](docs/EmbeddedWalletsApi.md#createEmbeddedWallet) | **POST** /ncw/wallets | Create a new wallet
*EmbeddedWalletsApi* | [**createEmbeddedWalletAccount**](docs/EmbeddedWalletsApi.md#createEmbeddedWalletAccount) | **POST** /ncw/wallets/{walletId}/accounts | Create a new account
*EmbeddedWalletsApi* | [**getEmbeddedWallet**](docs/EmbeddedWalletsApi.md#getEmbeddedWallet) | **GET** /ncw/wallets/{walletId} | Get a wallet
*EmbeddedWalletsApi* | [**getEmbeddedWalletAccount**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletAccount) | **GET** /ncw/wallets/{walletId}/accounts/{accountId} | Get a account
*EmbeddedWalletsApi* | [**getEmbeddedWalletAddresses**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletAddresses) | **GET** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId}/addresses | Retrieve asset addresses
*EmbeddedWalletsApi* | [**getEmbeddedWalletAsset**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletAsset) | **GET** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId} | Retrieve asset
*EmbeddedWalletsApi* | [**getEmbeddedWalletAssetBalance**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletAssetBalance) | **GET** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId}/balance | Retrieve asset balance
*EmbeddedWalletsApi* | [**getEmbeddedWalletDevice**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletDevice) | **GET** /ncw/wallets/{walletId}/devices/{deviceId} | Get Embedded Wallet Device
*EmbeddedWalletsApi* | [**getEmbeddedWalletDeviceSetupState**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletDeviceSetupState) | **GET** /ncw/wallets/{walletId}/devices/{deviceId}/setup_status | Get device key setup state
*EmbeddedWalletsApi* | [**getEmbeddedWalletLatestBackup**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletLatestBackup) | **GET** /ncw/wallets/{walletId}/backup/latest | Get wallet Latest Backup details
*EmbeddedWalletsApi* | [**getEmbeddedWalletPublicKeyInfoForAddress**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletPublicKeyInfoForAddress) | **GET** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key of an asset
*EmbeddedWalletsApi* | [**getEmbeddedWalletSupportedAssets**](docs/EmbeddedWalletsApi.md#getEmbeddedWalletSupportedAssets) | **GET** /ncw/wallets/supported_assets | Retrieve supported assets
*EmbeddedWalletsApi* | [**getEmbeddedWallets**](docs/EmbeddedWalletsApi.md#getEmbeddedWallets) | **GET** /ncw/wallets | List wallets
*EmbeddedWalletsApi* | [**getPublicKeyInfoNcw**](docs/EmbeddedWalletsApi.md#getPublicKeyInfoNcw) | **GET** /ncw/wallets/{walletId}/public_key_info | Get the public key for a derivation path
*EmbeddedWalletsApi* | [**refreshEmbeddedWalletAssetBalance**](docs/EmbeddedWalletsApi.md#refreshEmbeddedWalletAssetBalance) | **PUT** /ncw/wallets/{walletId}/accounts/{accountId}/assets/{assetId}/balance | Refresh asset balance
*ExchangeAccountsApi* | [**addExchangeAccount**](docs/ExchangeAccountsApi.md#addExchangeAccount) | **POST** /exchange_accounts | Add an exchange account
*ExchangeAccountsApi* | [**convertAssets**](docs/ExchangeAccountsApi.md#convertAssets) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset.
*ExchangeAccountsApi* | [**getExchangeAccount**](docs/ExchangeAccountsApi.md#getExchangeAccount) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account
*ExchangeAccountsApi* | [**getExchangeAccountAsset**](docs/ExchangeAccountsApi.md#getExchangeAccountAsset) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account
*ExchangeAccountsApi* | [**getExchangeAccountsCredentialsPublicKey**](docs/ExchangeAccountsApi.md#getExchangeAccountsCredentialsPublicKey) | **GET** /exchange_accounts/credentials_public_key | Get public key to encrypt exchange credentials
*ExchangeAccountsApi* | [**getPagedExchangeAccounts**](docs/ExchangeAccountsApi.md#getPagedExchangeAccounts) | **GET** /exchange_accounts/paged | Pagination list exchange accounts
*ExchangeAccountsApi* | [**internalTransfer**](docs/ExchangeAccountsApi.md#internalTransfer) | **POST** /exchange_accounts/{exchangeAccountId}/internal_transfer | Internal transfer for exchange accounts
*ExternalWalletsApi* | [**addAssetToExternalWallet**](docs/ExternalWalletsApi.md#addAssetToExternalWallet) | **POST** /external_wallets/{walletId}/{assetId} | Add an asset to an external wallet.
*ExternalWalletsApi* | [**createExternalWallet**](docs/ExternalWalletsApi.md#createExternalWallet) | **POST** /external_wallets | Create an external wallet
*ExternalWalletsApi* | [**deleteExternalWallet**](docs/ExternalWalletsApi.md#deleteExternalWallet) | **DELETE** /external_wallets/{walletId} | Delete an external wallet
*ExternalWalletsApi* | [**getExternalWallet**](docs/ExternalWalletsApi.md#getExternalWallet) | **GET** /external_wallets/{walletId} | Find an external wallet
*ExternalWalletsApi* | [**getExternalWalletAsset**](docs/ExternalWalletsApi.md#getExternalWalletAsset) | **GET** /external_wallets/{walletId}/{assetId} | Get an asset from an external wallet
*ExternalWalletsApi* | [**getExternalWallets**](docs/ExternalWalletsApi.md#getExternalWallets) | **GET** /external_wallets | List external wallets
*ExternalWalletsApi* | [**removeAssetFromExternalWallet**](docs/ExternalWalletsApi.md#removeAssetFromExternalWallet) | **DELETE** /external_wallets/{walletId}/{assetId} | Delete an asset from an external wallet
*ExternalWalletsApi* | [**setExternalWalletCustomerRefId**](docs/ExternalWalletsApi.md#setExternalWalletCustomerRefId) | **POST** /external_wallets/{walletId}/set_customer_ref_id | Set an AML customer reference ID for an external wallet
*FiatAccountsApi* | [**depositFundsFromLinkedDDA**](docs/FiatAccountsApi.md#depositFundsFromLinkedDDA) | **POST** /fiat_accounts/{accountId}/deposit_from_linked_dda | Deposit funds from DDA
*FiatAccountsApi* | [**getFiatAccount**](docs/FiatAccountsApi.md#getFiatAccount) | **GET** /fiat_accounts/{accountId} | Find a specific fiat account
*FiatAccountsApi* | [**getFiatAccounts**](docs/FiatAccountsApi.md#getFiatAccounts) | **GET** /fiat_accounts | List fiat accounts
*FiatAccountsApi* | [**redeemFundsToLinkedDDA**](docs/FiatAccountsApi.md#redeemFundsToLinkedDDA) | **POST** /fiat_accounts/{accountId}/redeem_to_linked_dda | Redeem funds to DDA
*GasStationsApi* | [**getGasStationByAssetId**](docs/GasStationsApi.md#getGasStationByAssetId) | **GET** /gas_station/{assetId} | Get gas station settings by asset
*GasStationsApi* | [**getGasStationInfo**](docs/GasStationsApi.md#getGasStationInfo) | **GET** /gas_station | Get gas station settings
*GasStationsApi* | [**updateGasStationConfiguration**](docs/GasStationsApi.md#updateGasStationConfiguration) | **PUT** /gas_station/configuration | Edit gas station settings
*GasStationsApi* | [**updateGasStationConfigurationByAssetId**](docs/GasStationsApi.md#updateGasStationConfigurationByAssetId) | **PUT** /gas_station/configuration/{assetId} | Edit gas station settings for an asset
*InternalWalletsApi* | [**createInternalWallet**](docs/InternalWalletsApi.md#createInternalWallet) | **POST** /internal_wallets | Create an internal wallet
*InternalWalletsApi* | [**createInternalWalletAsset**](docs/InternalWalletsApi.md#createInternalWalletAsset) | **POST** /internal_wallets/{walletId}/{assetId} | Add an asset to an internal wallet
*InternalWalletsApi* | [**deleteInternalWallet**](docs/InternalWalletsApi.md#deleteInternalWallet) | **DELETE** /internal_wallets/{walletId} | Delete an internal wallet
*InternalWalletsApi* | [**deleteInternalWalletAsset**](docs/InternalWalletsApi.md#deleteInternalWalletAsset) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address
*InternalWalletsApi* | [**getInternalWallet**](docs/InternalWalletsApi.md#getInternalWallet) | **GET** /internal_wallets/{walletId} | Get an asset from an internal wallet
*InternalWalletsApi* | [**getInternalWalletAsset**](docs/InternalWalletsApi.md#getInternalWalletAsset) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet
*InternalWalletsApi* | [**getInternalWalletAssetsPaginated**](docs/InternalWalletsApi.md#getInternalWalletAssetsPaginated) | **GET** /internal_wallets/{walletId}/assets | List assets in an internal wallet (Paginated)
*InternalWalletsApi* | [**getInternalWallets**](docs/InternalWalletsApi.md#getInternalWallets) | **GET** /internal_wallets | List internal wallets
*InternalWalletsApi* | [**setCustomerRefIdForInternalWallet**](docs/InternalWalletsApi.md#setCustomerRefIdForInternalWallet) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet
*JobManagementApi* | [**cancelJob**](docs/JobManagementApi.md#cancelJob) | **POST** /batch/{jobId}/cancel | Cancel a running job
*JobManagementApi* | [**continueJob**](docs/JobManagementApi.md#continueJob) | **POST** /batch/{jobId}/continue | Continue a paused job
*JobManagementApi* | [**getJob**](docs/JobManagementApi.md#getJob) | **GET** /batch/{jobId} | Get job details
*JobManagementApi* | [**getJobTasks**](docs/JobManagementApi.md#getJobTasks) | **GET** /batch/{jobId}/tasks | Return a list of tasks for given job
*JobManagementApi* | [**getJobs**](docs/JobManagementApi.md#getJobs) | **GET** /batch/jobs | Return a list of jobs belonging to tenant
*JobManagementApi* | [**pauseJob**](docs/JobManagementApi.md#pauseJob) | **POST** /batch/{jobId}/pause | Pause a job
*KeyLinkBetaApi* | [**createSigningKey**](docs/KeyLinkBetaApi.md#createSigningKey) | **POST** /key_link/signing_keys | Add a new signing key
*KeyLinkBetaApi* | [**createValidationKey**](docs/KeyLinkBetaApi.md#createValidationKey) | **POST** /key_link/validation_keys | Add a new validation key
*KeyLinkBetaApi* | [**disableValidationKey**](docs/KeyLinkBetaApi.md#disableValidationKey) | **PATCH** /key_link/validation_keys/{keyId} | Disables a validation key
*KeyLinkBetaApi* | [**getSigningKey**](docs/KeyLinkBetaApi.md#getSigningKey) | **GET** /key_link/signing_keys/{keyId} | Get a signing key by &#x60;keyId&#x60;
*KeyLinkBetaApi* | [**getSigningKeysList**](docs/KeyLinkBetaApi.md#getSigningKeysList) | **GET** /key_link/signing_keys | Get list of signing keys
*KeyLinkBetaApi* | [**getValidationKey**](docs/KeyLinkBetaApi.md#getValidationKey) | **GET** /key_link/validation_keys/{keyId} | Get a validation key by &#x60;keyId&#x60;
*KeyLinkBetaApi* | [**getValidationKeysList**](docs/KeyLinkBetaApi.md#getValidationKeysList) | **GET** /key_link/validation_keys | Get list of registered validation keys
*KeyLinkBetaApi* | [**setAgentId**](docs/KeyLinkBetaApi.md#setAgentId) | **PATCH** /key_link/signing_keys/{keyId}/agent_user_id | Set agent user id that can sign with the signing key identified by the Fireblocks provided &#x60;keyId&#x60;
*KeyLinkBetaApi* | [**updateSigningKey**](docs/KeyLinkBetaApi.md#updateSigningKey) | **PATCH** /key_link/signing_keys/{keyId} | Modify the signing by Fireblocks provided &#x60;keyId&#x60;
*KeysBetaApi* | [**getMpcKeysList**](docs/KeysBetaApi.md#getMpcKeysList) | **GET** /keys/mpc/list | Get list of mpc keys
*KeysBetaApi* | [**getMpcKeysListByUser**](docs/KeysBetaApi.md#getMpcKeysListByUser) | **GET** /keys/mpc/list/{userId} | Get list of mpc keys by &#x60;userId&#x60;
*NetworkConnectionsApi* | [**checkThirdPartyRouting**](docs/NetworkConnectionsApi.md#checkThirdPartyRouting) | **GET** /network_connections/{connectionId}/is_third_party_routing/{assetType} | Retrieve third-party network routing validation by asset type.
*NetworkConnectionsApi* | [**createNetworkConnection**](docs/NetworkConnectionsApi.md#createNetworkConnection) | **POST** /network_connections | Creates a new network connection
*NetworkConnectionsApi* | [**createNetworkId**](docs/NetworkConnectionsApi.md#createNetworkId) | **POST** /network_ids | Creates a new Network ID
*NetworkConnectionsApi* | [**deleteNetworkConnection**](docs/NetworkConnectionsApi.md#deleteNetworkConnection) | **DELETE** /network_connections/{connectionId} | Deletes a network connection by ID
*NetworkConnectionsApi* | [**deleteNetworkId**](docs/NetworkConnectionsApi.md#deleteNetworkId) | **DELETE** /network_ids/{networkId} | Deletes specific network ID.
*NetworkConnectionsApi* | [**getNetwork**](docs/NetworkConnectionsApi.md#getNetwork) | **GET** /network_connections/{connectionId} | Get a network connection
*NetworkConnectionsApi* | [**getNetworkConnections**](docs/NetworkConnectionsApi.md#getNetworkConnections) | **GET** /network_connections | List network connections
*NetworkConnectionsApi* | [**getNetworkId**](docs/NetworkConnectionsApi.md#getNetworkId) | **GET** /network_ids/{networkId} | Returns specific network ID.
*NetworkConnectionsApi* | [**getNetworkIds**](docs/NetworkConnectionsApi.md#getNetworkIds) | **GET** /network_ids | Returns all network IDs, both local IDs and discoverable remote IDs
*NetworkConnectionsApi* | [**getRoutingPolicyAssetGroups**](docs/NetworkConnectionsApi.md#getRoutingPolicyAssetGroups) | **GET** /network_ids/routing_policy_asset_groups | Returns all enabled routing policy asset groups
*NetworkConnectionsApi* | [**searchNetworkIds**](docs/NetworkConnectionsApi.md#searchNetworkIds) | **GET** /network_ids/search | Search network IDs, both local IDs and discoverable remote IDs
*NetworkConnectionsApi* | [**setNetworkIdDiscoverability**](docs/NetworkConnectionsApi.md#setNetworkIdDiscoverability) | **PATCH** /network_ids/{networkId}/set_discoverability | Update network ID&#39;s discoverability.
*NetworkConnectionsApi* | [**setNetworkIdName**](docs/NetworkConnectionsApi.md#setNetworkIdName) | **PATCH** /network_ids/{networkId}/set_name | Update network ID&#39;s name.
*NetworkConnectionsApi* | [**setNetworkIdRoutingPolicy**](docs/NetworkConnectionsApi.md#setNetworkIdRoutingPolicy) | **PATCH** /network_ids/{networkId}/set_routing_policy | Update network id routing policy.
*NetworkConnectionsApi* | [**setRoutingPolicy**](docs/NetworkConnectionsApi.md#setRoutingPolicy) | **PATCH** /network_connections/{connectionId}/set_routing_policy | Update network connection routing policy.
*NftsApi* | [**getNFT**](docs/NftsApi.md#getNFT) | **GET** /nfts/tokens/{id} | List token data by ID
*NftsApi* | [**getNFTs**](docs/NftsApi.md#getNFTs) | **GET** /nfts/tokens | List tokens by IDs
*NftsApi* | [**getOwnershipTokens**](docs/NftsApi.md#getOwnershipTokens) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated)
*NftsApi* | [**listOwnedCollections**](docs/NftsApi.md#listOwnedCollections) | **GET** /nfts/ownership/collections | List owned collections (paginated)
*NftsApi* | [**listOwnedTokens**](docs/NftsApi.md#listOwnedTokens) | **GET** /nfts/ownership/assets | List all distinct owned tokens (paginated)
*NftsApi* | [**refreshNFTMetadata**](docs/NftsApi.md#refreshNFTMetadata) | **PUT** /nfts/tokens/{id} | Refresh token metadata
*NftsApi* | [**updateOwnershipTokens**](docs/NftsApi.md#updateOwnershipTokens) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens
*NftsApi* | [**updateTokenOwnershipStatus**](docs/NftsApi.md#updateTokenOwnershipStatus) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status
*NftsApi* | [**updateTokensOwnershipSpam**](docs/NftsApi.md#updateTokensOwnershipSpam) | **PUT** /nfts/ownership/tokens/spam | Update tokens ownership spam property
*NftsApi* | [**updateTokensOwnershipStatus**](docs/NftsApi.md#updateTokensOwnershipStatus) | **PUT** /nfts/ownership/tokens/status | Update tokens ownership status
*OffExchangesApi* | [**addOffExchange**](docs/OffExchangesApi.md#addOffExchange) | **POST** /off_exchange/add | add collateral
*OffExchangesApi* | [**getOffExchangeCollateralAccounts**](docs/OffExchangesApi.md#getOffExchangeCollateralAccounts) | **GET** /off_exchange/collateral_accounts/{mainExchangeAccountId} | Find a specific collateral exchange account
*OffExchangesApi* | [**getOffExchangeSettlementTransactions**](docs/OffExchangesApi.md#getOffExchangeSettlementTransactions) | **GET** /off_exchange/settlements/transactions | get settlements transactions from exchange
*OffExchangesApi* | [**removeOffExchange**](docs/OffExchangesApi.md#removeOffExchange) | **POST** /off_exchange/remove | remove collateral
*OffExchangesApi* | [**settleOffExchangeTrades**](docs/OffExchangesApi.md#settleOffExchangeTrades) | **POST** /off_exchange/settlements/trader | create settlement for a trader
*OtaBetaApi* | [**getOtaStatus**](docs/OtaBetaApi.md#getOtaStatus) | **GET** /management/ota | Returns current OTA status
*OtaBetaApi* | [**setOtaStatus**](docs/OtaBetaApi.md#setOtaStatus) | **PUT** /management/ota | Enable or disable transactions to OTA
*PaymentsPayoutApi* | [**createPayout**](docs/PaymentsPayoutApi.md#createPayout) | **POST** /payments/payout | Create a payout instruction set
*PaymentsPayoutApi* | [**executePayoutAction**](docs/PaymentsPayoutApi.md#executePayoutAction) | **POST** /payments/payout/{payoutId}/actions/execute | Execute a payout instruction set
*PaymentsPayoutApi* | [**getPayout**](docs/PaymentsPayoutApi.md#getPayout) | **GET** /payments/payout/{payoutId} | Get the status of a payout instruction set
*PolicyEditorBetaApi* | [**getActivePolicyLegacy**](docs/PolicyEditorBetaApi.md#getActivePolicyLegacy) | **GET** /tap/active_policy | Get the active policy and its validation
*PolicyEditorBetaApi* | [**getDraftLegacy**](docs/PolicyEditorBetaApi.md#getDraftLegacy) | **GET** /tap/draft | Get the active draft
*PolicyEditorBetaApi* | [**publishDraftLegacy**](docs/PolicyEditorBetaApi.md#publishDraftLegacy) | **POST** /tap/draft | Send publish request for a certain draft id
*PolicyEditorBetaApi* | [**publishPolicyRules**](docs/PolicyEditorBetaApi.md#publishPolicyRules) | **POST** /tap/publish | Send publish request for a set of policy rules
*PolicyEditorBetaApi* | [**updateDraftLegacy**](docs/PolicyEditorBetaApi.md#updateDraftLegacy) | **PUT** /tap/draft | Update the draft with a new set of rules
*PolicyEditorV2BetaApi* | [**getActivePolicy**](docs/PolicyEditorV2BetaApi.md#getActivePolicy) | **GET** /policy/active_policy | Get the active policy and its validation by policy type
*PolicyEditorV2BetaApi* | [**getDraft**](docs/PolicyEditorV2BetaApi.md#getDraft) | **GET** /policy/draft | Get the active draft by policy type
*PolicyEditorV2BetaApi* | [**publishDraft**](docs/PolicyEditorV2BetaApi.md#publishDraft) | **POST** /policy/draft | Send publish request for a certain draft id
*PolicyEditorV2BetaApi* | [**updateDraft**](docs/PolicyEditorV2BetaApi.md#updateDraft) | **PUT** /policy/draft | Update the draft with a new set of rules by policy types
*ResetDeviceApi* | [**resetDevice**](docs/ResetDeviceApi.md#resetDevice) | **POST** /management/users/{id}/reset_device | Resets device
*SmartTransferApi* | [**approveDvPTicketTerm**](docs/SmartTransferApi.md#approveDvPTicketTerm) | **PUT** /smart_transfers/{ticketId}/terms/{termId}/dvp/approve | Define funding source and give approve to contract to transfer asset
*SmartTransferApi* | [**cancelTicket**](docs/SmartTransferApi.md#cancelTicket) | **PUT** /smart-transfers/{ticketId}/cancel | Cancel Ticket
*SmartTransferApi* | [**createTicket**](docs/SmartTransferApi.md#createTicket) | **POST** /smart-transfers | Create Ticket
*SmartTransferApi* | [**createTicketTerm**](docs/SmartTransferApi.md#createTicketTerm) | **POST** /smart-transfers/{ticketId}/terms | Create leg (term)
*SmartTransferApi* | [**findTicketById**](docs/SmartTransferApi.md#findTicketById) | **GET** /smart-transfers/{ticketId} | Search Tickets by ID
*SmartTransferApi* | [**findTicketTermById**](docs/SmartTransferApi.md#findTicketTermById) | **GET** /smart-transfers/{ticketId}/terms/{termId} | Search ticket by leg (term) ID
*SmartTransferApi* | [**fulfillTicket**](docs/SmartTransferApi.md#fulfillTicket) | **PUT** /smart-transfers/{ticketId}/fulfill | Fund ticket manually
*SmartTransferApi* | [**fundDvpTicket**](docs/SmartTransferApi.md#fundDvpTicket) | **PUT** /smart_transfers/{ticketId}/dvp/fund | Fund dvp ticket
*SmartTransferApi* | [**fundTicketTerm**](docs/SmartTransferApi.md#fundTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/fund | Define funding source
*SmartTransferApi* | [**getSmartTransferStatistic**](docs/SmartTransferApi.md#getSmartTransferStatistic) | **GET** /smart_transfers/statistic | Get smart transfers statistic
*SmartTransferApi* | [**getSmartTransferUserGroups**](docs/SmartTransferApi.md#getSmartTransferUserGroups) | **GET** /smart-transfers/settings/user-groups | Get user group
*SmartTransferApi* | [**manuallyFundTicketTerm**](docs/SmartTransferApi.md#manuallyFundTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/manually-fund | Manually add term transaction
*SmartTransferApi* | [**removeTicketTerm**](docs/SmartTransferApi.md#removeTicketTerm) | **DELETE** /smart-transfers/{ticketId}/terms/{termId} | Delete ticket leg (term)
*SmartTransferApi* | [**searchTickets**](docs/SmartTransferApi.md#searchTickets) | **GET** /smart-transfers | Find Ticket
*SmartTransferApi* | [**setExternalRefId**](docs/SmartTransferApi.md#setExternalRefId) | **PUT** /smart-transfers/{ticketId}/external-id | Add external ref. ID
*SmartTransferApi* | [**setTicketExpiration**](docs/SmartTransferApi.md#setTicketExpiration) | **PUT** /smart-transfers/{ticketId}/expires-in | Set expiration
*SmartTransferApi* | [**setUserGroups**](docs/SmartTransferApi.md#setUserGroups) | **POST** /smart-transfers/settings/user-groups | Set user group
*SmartTransferApi* | [**submitTicket**](docs/SmartTransferApi.md#submitTicket) | **PUT** /smart-transfers/{ticketId}/submit | Submit ticket
*SmartTransferApi* | [**updateTicketTerm**](docs/SmartTransferApi.md#updateTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId} | Update ticket leg (term)
*StakingApi* | [**approveTermsOfServiceByProviderId**](docs/StakingApi.md#approveTermsOfServiceByProviderId) | **POST** /staking/providers/{providerId}/approveTermsOfService | Approve staking terms of service
*StakingApi* | [**claimRewards**](docs/StakingApi.md#claimRewards) | **POST** /staking/chains/{chainDescriptor}/claim_rewards | Execute a Claim Rewards operation
*StakingApi* | [**getAllDelegations**](docs/StakingApi.md#getAllDelegations) | **GET** /staking/positions | List staking positions details
*StakingApi* | [**getChainInfo**](docs/StakingApi.md#getChainInfo) | **GET** /staking/chains/{chainDescriptor}/chainInfo | Get chain-specific staking summary
*StakingApi* | [**getChains**](docs/StakingApi.md#getChains) | **GET** /staking/chains | List staking supported chains
*StakingApi* | [**getDelegationById**](docs/StakingApi.md#getDelegationById) | **GET** /staking/positions/{id} | Get staking position details
*StakingApi* | [**getProviders**](docs/StakingApi.md#getProviders) | **GET** /staking/providers | List staking providers details
*StakingApi* | [**getSummary**](docs/StakingApi.md#getSummary) | **GET** /staking/positions/summary | Get staking summary details
*StakingApi* | [**getSummaryByVault**](docs/StakingApi.md#getSummaryByVault) | **GET** /staking/positions/summary/vaults | Get staking summary details by vault
*StakingApi* | [**mergeStakeAccounts**](docs/StakingApi.md#mergeStakeAccounts) | **POST** /staking/chains/{chainDescriptor}/merge | Merge Solana on stake accounts
*StakingApi* | [**split**](docs/StakingApi.md#split) | **POST** /staking/chains/{chainDescriptor}/split | Execute a Split operation on SOL/SOL_TEST stake account
*StakingApi* | [**stake**](docs/StakingApi.md#stake) | **POST** /staking/chains/{chainDescriptor}/stake | Initiate Stake Operation
*StakingApi* | [**unstake**](docs/StakingApi.md#unstake) | **POST** /staking/chains/{chainDescriptor}/unstake | Execute an Unstake operation
*StakingApi* | [**withdraw**](docs/StakingApi.md#withdraw) | **POST** /staking/chains/{chainDescriptor}/withdraw | Execute a Withdraw operation
*TagsApi* | [**createTag**](docs/TagsApi.md#createTag) | **POST** /tags | Create a tag
*TagsApi* | [**deleteTag**](docs/TagsApi.md#deleteTag) | **DELETE** /tags/{tagId} | Delete a tag
*TagsApi* | [**getTag**](docs/TagsApi.md#getTag) | **GET** /tags/{tagId} | Get a tag
*TagsApi* | [**getTags**](docs/TagsApi.md#getTags) | **GET** /tags | Get list of tags
*TagsApi* | [**updateTag**](docs/TagsApi.md#updateTag) | **PATCH** /tags/{tagId} | Update a tag
*TokenizationApi* | [**burnCollectionToken**](docs/TokenizationApi.md#burnCollectionToken) | **POST** /tokenization/collections/{id}/tokens/burn | Burn tokens
*TokenizationApi* | [**createNewCollection**](docs/TokenizationApi.md#createNewCollection) | **POST** /tokenization/collections | Create a new collection
*TokenizationApi* | [**deactivateAndUnlinkAdapters**](docs/TokenizationApi.md#deactivateAndUnlinkAdapters) | **DELETE** /tokenization/multichain/bridge/layerzero | Remove LayerZero adapters
*TokenizationApi* | [**deployAndLinkAdapters**](docs/TokenizationApi.md#deployAndLinkAdapters) | **POST** /tokenization/multichain/bridge/layerzero | Deploy LayerZero adapters
*TokenizationApi* | [**fetchCollectionTokenDetails**](docs/TokenizationApi.md#fetchCollectionTokenDetails) | **GET** /tokenization/collections/{id}/tokens/{tokenId} | Get collection token details
*TokenizationApi* | [**getCollectionById**](docs/TokenizationApi.md#getCollectionById) | **GET** /tokenization/collections/{id} | Get a collection by id
*TokenizationApi* | [**getDeployableAddress**](docs/TokenizationApi.md#getDeployableAddress) | **POST** /tokenization/multichain/deterministic_address | Get deterministic address for contract deployment
*TokenizationApi* | [**getLayerZeroDvnConfig**](docs/TokenizationApi.md#getLayerZeroDvnConfig) | **GET** /tokenization/multichain/bridge/layerzero/config/{adapterTokenLinkId}/dvns | Get LayerZero DVN configuration
*TokenizationApi* | [**getLayerZeroPeers**](docs/TokenizationApi.md#getLayerZeroPeers) | **GET** /tokenization/multichain/bridge/layerzero/config/{adapterTokenLinkId}/peers | Get LayerZero peers
*TokenizationApi* | [**getLinkedCollections**](docs/TokenizationApi.md#getLinkedCollections) | **GET** /tokenization/collections | Get collections
*TokenizationApi* | [**getLinkedToken**](docs/TokenizationApi.md#getLinkedToken) | **GET** /tokenization/tokens/{id} | Return a linked token
*TokenizationApi* | [**getLinkedTokens**](docs/TokenizationApi.md#getLinkedTokens) | **GET** /tokenization/tokens | List all linked tokens
*TokenizationApi* | [**issueNewToken**](docs/TokenizationApi.md#issueNewToken) | **POST** /tokenization/tokens | Issue a new token
*TokenizationApi* | [**issueTokenMultiChain**](docs/TokenizationApi.md#issueTokenMultiChain) | **POST** /tokenization/multichain/tokens | Issue a token on one or more blockchains
*TokenizationApi* | [**link**](docs/TokenizationApi.md#link) | **POST** /tokenization/tokens/link | Link a contract
*TokenizationApi* | [**mintCollectionToken**](docs/TokenizationApi.md#mintCollectionToken) | **POST** /tokenization/collections/{id}/tokens/mint | Mint tokens
*TokenizationApi* | [**reIssueTokenMultiChain**](docs/TokenizationApi.md#reIssueTokenMultiChain) | **POST** /tokenization/multichain/reissue/token/{tokenLinkId} | Reissue a multichain token
*TokenizationApi* | [**removeLayerZeroPeers**](docs/TokenizationApi.md#removeLayerZeroPeers) | **DELETE** /tokenization/multichain/bridge/layerzero/config/peers | Remove LayerZero peers
*TokenizationApi* | [**setLayerZeroDvnConfig**](docs/TokenizationApi.md#setLayerZeroDvnConfig) | **POST** /tokenization/multichain/bridge/layerzero/config/dvns | Set LayerZero DVN configuration
*TokenizationApi* | [**setLayerZeroPeers**](docs/TokenizationApi.md#setLayerZeroPeers) | **POST** /tokenization/multichain/bridge/layerzero/config/peers | Set LayerZero peers
*TokenizationApi* | [**unlink**](docs/TokenizationApi.md#unlink) | **DELETE** /tokenization/tokens/{id} | Unlink a token
*TokenizationApi* | [**unlinkCollection**](docs/TokenizationApi.md#unlinkCollection) | **DELETE** /tokenization/collections/{id} | Delete a collection link
*TokenizationApi* | [**validateLayerZeroChannelConfig**](docs/TokenizationApi.md#validateLayerZeroChannelConfig) | **GET** /tokenization/multichain/bridge/layerzero/validate | Validate LayerZero channel configuration
*TradingBetaApi* | [**createOrder**](docs/TradingBetaApi.md#createOrder) | **POST** /trading/orders | Create an order
*TradingBetaApi* | [**createQuote**](docs/TradingBetaApi.md#createQuote) | **POST** /trading/quotes | Create a quote
*TradingBetaApi* | [**getOrder**](docs/TradingBetaApi.md#getOrder) | **GET** /trading/orders/{orderId} | Get order details
*TradingBetaApi* | [**getOrders**](docs/TradingBetaApi.md#getOrders) | **GET** /trading/orders | Get orders
*TradingBetaApi* | [**getTradingProviders**](docs/TradingBetaApi.md#getTradingProviders) | **GET** /trading/providers | Get providers
*TransactionsApi* | [**cancelTransaction**](docs/TransactionsApi.md#cancelTransaction) | **POST** /transactions/{txId}/cancel | Cancel a transaction
*TransactionsApi* | [**createTransaction**](docs/TransactionsApi.md#createTransaction) | **POST** /transactions | Create a new transaction
*TransactionsApi* | [**dropTransaction**](docs/TransactionsApi.md#dropTransaction) | **POST** /transactions/{txId}/drop | Drop ETH transaction by ID
*TransactionsApi* | [**estimateNetworkFee**](docs/TransactionsApi.md#estimateNetworkFee) | **GET** /estimate_network_fee | Estimate the required fee for an asset
*TransactionsApi* | [**estimateTransactionFee**](docs/TransactionsApi.md#estimateTransactionFee) | **POST** /transactions/estimate_fee | Estimate transaction fee
*TransactionsApi* | [**freezeTransaction**](docs/TransactionsApi.md#freezeTransaction) | **POST** /transactions/{txId}/freeze | Freeze a transaction
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /transactions/{txId} | Find a specific transaction by Fireblocks transaction ID
*TransactionsApi* | [**getTransactionByExternalId**](docs/TransactionsApi.md#getTransactionByExternalId) | **GET** /transactions/external_tx_id/{externalTxId} | Find a specific transaction by external transaction ID
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#getTransactions) | **GET** /transactions | List transaction history
*TransactionsApi* | [**rescanTransactionsBeta**](docs/TransactionsApi.md#rescanTransactionsBeta) | **POST** /transactions/rescan | rescan array of transactions
*TransactionsApi* | [**setConfirmationThresholdByTransactionHash**](docs/TransactionsApi.md#setConfirmationThresholdByTransactionHash) | **POST** /txHash/{txHash}/set_confirmation_threshold | Set confirmation threshold by transaction hash
*TransactionsApi* | [**setTransactionConfirmationThreshold**](docs/TransactionsApi.md#setTransactionConfirmationThreshold) | **POST** /transactions/{txId}/set_confirmation_threshold | Set confirmation threshold by transaction ID
*TransactionsApi* | [**unfreezeTransaction**](docs/TransactionsApi.md#unfreezeTransaction) | **POST** /transactions/{txId}/unfreeze | Unfreeze a transaction
*TransactionsApi* | [**validateAddress**](docs/TransactionsApi.md#validateAddress) | **GET** /transactions/validate_address/{assetId}/{address} | Validate destination address
*TravelRuleApi* | [**getVASPByDID**](docs/TravelRuleApi.md#getVASPByDID) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details
*TravelRuleApi* | [**getVASPs**](docs/TravelRuleApi.md#getVASPs) | **GET** /screening/travel_rule/vasp | Get All VASPs
*TravelRuleApi* | [**getVaspForVault**](docs/TravelRuleApi.md#getVaspForVault) | **GET** /screening/travel_rule/vault/{vaultAccountId}/vasp | Get assigned VASP to vault
*TravelRuleApi* | [**setVaspForVault**](docs/TravelRuleApi.md#setVaspForVault) | **POST** /screening/travel_rule/vault/{vaultAccountId}/vasp | Assign VASP to vault
*TravelRuleApi* | [**updateVasp**](docs/TravelRuleApi.md#updateVasp) | **PUT** /screening/travel_rule/vasp/update | Add jsonDidKey to VASP details
*TravelRuleApi* | [**validateFullTravelRuleTransaction**](docs/TravelRuleApi.md#validateFullTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction
*UserGroupsBetaApi* | [**createUserGroup**](docs/UserGroupsBetaApi.md#createUserGroup) | **POST** /management/user_groups | Create user group
*UserGroupsBetaApi* | [**deleteUserGroup**](docs/UserGroupsBetaApi.md#deleteUserGroup) | **DELETE** /management/user_groups/{groupId} | Delete user group
*UserGroupsBetaApi* | [**getUserGroup**](docs/UserGroupsBetaApi.md#getUserGroup) | **GET** /management/user_groups/{groupId} | Get user group
*UserGroupsBetaApi* | [**getUserGroups**](docs/UserGroupsBetaApi.md#getUserGroups) | **GET** /management/user_groups | List user groups
*UserGroupsBetaApi* | [**updateUserGroup**](docs/UserGroupsBetaApi.md#updateUserGroup) | **PUT** /management/user_groups/{groupId} | Update user group
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | List users
*VaultsApi* | [**activateAssetForVaultAccount**](docs/VaultsApi.md#activateAssetForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account
*VaultsApi* | [**attachTagsToVaultAccounts**](docs/VaultsApi.md#attachTagsToVaultAccounts) | **POST** /vault/accounts/attached_tags/attach | Attach tags to a vault accounts
*VaultsApi* | [**createLegacyAddress**](docs/VaultsApi.md#createLegacyAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format
*VaultsApi* | [**createMultipleAccounts**](docs/VaultsApi.md#createMultipleAccounts) | **POST** /vault/accounts/bulk | Bulk creation of new vault accounts
*VaultsApi* | [**createMultipleDepositAddresses**](docs/VaultsApi.md#createMultipleDepositAddresses) | **POST** /vault/accounts/addresses/bulk | Bulk creation of new deposit addresses
*VaultsApi* | [**createVaultAccount**](docs/VaultsApi.md#createVaultAccount) | **POST** /vault/accounts | Create a new vault account
*VaultsApi* | [**createVaultAccountAsset**](docs/VaultsApi.md#createVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet
*VaultsApi* | [**createVaultAccountAssetAddress**](docs/VaultsApi.md#createVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address
*VaultsApi* | [**detachTagsFromVaultAccounts**](docs/VaultsApi.md#detachTagsFromVaultAccounts) | **POST** /vault/accounts/attached_tags/detach | Detach tags from a vault accounts
*VaultsApi* | [**getAssetWallets**](docs/VaultsApi.md#getAssetWallets) | **GET** /vault/asset_wallets | List asset wallets (Paginated)
*VaultsApi* | [**getCreateMultipleDepositAddressesJobStatus**](docs/VaultsApi.md#getCreateMultipleDepositAddressesJobStatus) | **GET** /vault/accounts/addresses/bulk/{jobId} | Get job status of bulk creation of new deposit addresses
*VaultsApi* | [**getCreateMultipleVaultAccountsJobStatus**](docs/VaultsApi.md#getCreateMultipleVaultAccountsJobStatus) | **GET** /vault/accounts/bulk/{jobId} | Get job status of bulk creation of new vault accounts
*VaultsApi* | [**getMaxSpendableAmount**](docs/VaultsApi.md#getMaxSpendableAmount) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount | Get the maximum spendable amount in a single transaction.
*VaultsApi* | [**getPagedVaultAccounts**](docs/VaultsApi.md#getPagedVaultAccounts) | **GET** /vault/accounts_paged | List vault accounts (Paginated)
*VaultsApi* | [**getPublicKeyInfo**](docs/VaultsApi.md#getPublicKeyInfo) | **GET** /vault/public_key_info | Get the public key information
*VaultsApi* | [**getPublicKeyInfoForAddress**](docs/VaultsApi.md#getPublicKeyInfoForAddress) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key for a vault account
*VaultsApi* | [**getUnspentInputs**](docs/VaultsApi.md#getUnspentInputs) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs | Get UTXO unspent inputs information
*VaultsApi* | [**getVaultAccount**](docs/VaultsApi.md#getVaultAccount) | **GET** /vault/accounts/{vaultAccountId} | Find a vault account by ID
*VaultsApi* | [**getVaultAccountAsset**](docs/VaultsApi.md#getVaultAccountAsset) | **GET** /vault/accounts/{vaultAccountId}/{assetId} | Get the asset balance for a vault account
*VaultsApi* | [**getVaultAccountAssetAddressesPaginated**](docs/VaultsApi.md#getVaultAccountAssetAddressesPaginated) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated | List addresses (Paginated)
*VaultsApi* | [**getVaultAssets**](docs/VaultsApi.md#getVaultAssets) | **GET** /vault/assets | Get asset balance for chosen assets
*VaultsApi* | [**getVaultBalanceByAsset**](docs/VaultsApi.md#getVaultBalanceByAsset) | **GET** /vault/assets/{assetId} | Get vault balance by asset
*VaultsApi* | [**hideVaultAccount**](docs/VaultsApi.md#hideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/hide | Hide a vault account in the console
*VaultsApi* | [**setCustomerRefIdForAddress**](docs/VaultsApi.md#setCustomerRefIdForAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id | Assign AML customer reference ID
*VaultsApi* | [**setVaultAccountAutoFuel**](docs/VaultsApi.md#setVaultAccountAutoFuel) | **POST** /vault/accounts/{vaultAccountId}/set_auto_fuel | Turn autofueling on or off
*VaultsApi* | [**setVaultAccountCustomerRefId**](docs/VaultsApi.md#setVaultAccountCustomerRefId) | **POST** /vault/accounts/{vaultAccountId}/set_customer_ref_id | Set an AML/KYT customer reference ID for a vault account
*VaultsApi* | [**unhideVaultAccount**](docs/VaultsApi.md#unhideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/unhide | Unhide a vault account in the console
*VaultsApi* | [**updateVaultAccount**](docs/VaultsApi.md#updateVaultAccount) | **PUT** /vault/accounts/{vaultAccountId} | Rename a vault account
*VaultsApi* | [**updateVaultAccountAssetAddress**](docs/VaultsApi.md#updateVaultAccountAssetAddress) | **PUT** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId} | Update address description
*VaultsApi* | [**updateVaultAccountAssetBalance**](docs/VaultsApi.md#updateVaultAccountAssetBalance) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/balance | Refresh asset balance data
*Web3ConnectionsApi* | [**create**](docs/Web3ConnectionsApi.md#create) | **POST** /connections/wc | Create a new Web3 connection.
*Web3ConnectionsApi* | [**get**](docs/Web3ConnectionsApi.md#get) | **GET** /connections | List all open Web3 connections.
*Web3ConnectionsApi* | [**remove**](docs/Web3ConnectionsApi.md#remove) | **DELETE** /connections/wc/{id} | Remove an existing Web3 connection.
*Web3ConnectionsApi* | [**submit**](docs/Web3ConnectionsApi.md#submit) | **PUT** /connections/wc/{id} | Respond to a pending Web3 connection request.
*WebhooksApi* | [**resendTransactionWebhooks**](docs/WebhooksApi.md#resendTransactionWebhooks) | **POST** /webhooks/resend/{txId} | Resend failed webhooks for a transaction by ID
*WebhooksApi* | [**resendWebhooks**](docs/WebhooksApi.md#resendWebhooks) | **POST** /webhooks/resend | Resend failed webhooks
*WebhooksV2Api* | [**createWebhook**](docs/WebhooksV2Api.md#createWebhook) | **POST** /webhooks | Create new webhook
*WebhooksV2Api* | [**deleteWebhook**](docs/WebhooksV2Api.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete webhook
*WebhooksV2Api* | [**getNotification**](docs/WebhooksV2Api.md#getNotification) | **GET** /webhooks/{webhookId}/notifications/{notificationId} | Get notification by id
*WebhooksV2Api* | [**getNotificationAttempts**](docs/WebhooksV2Api.md#getNotificationAttempts) | **GET** /webhooks/{webhookId}/notifications/{notificationId}/attempts | Get notification attempts
*WebhooksV2Api* | [**getNotifications**](docs/WebhooksV2Api.md#getNotifications) | **GET** /webhooks/{webhookId}/notifications | Get all notifications by webhook id
*WebhooksV2Api* | [**getResendJobStatus**](docs/WebhooksV2Api.md#getResendJobStatus) | **GET** /webhooks/{webhookId}/notifications/resend_failed/jobs/{jobId} | Get resend job status
*WebhooksV2Api* | [**getWebhook**](docs/WebhooksV2Api.md#getWebhook) | **GET** /webhooks/{webhookId} | Get webhook by id
*WebhooksV2Api* | [**getWebhooks**](docs/WebhooksV2Api.md#getWebhooks) | **GET** /webhooks | Get all webhooks
*WebhooksV2Api* | [**resendFailedNotifications**](docs/WebhooksV2Api.md#resendFailedNotifications) | **POST** /webhooks/{webhookId}/notifications/resend_failed | Resend failed notifications
*WebhooksV2Api* | [**resendNotificationById**](docs/WebhooksV2Api.md#resendNotificationById) | **POST** /webhooks/{webhookId}/notifications/{notificationId}/resend | Resend notification by id
*WebhooksV2Api* | [**resendNotificationsByResourceId**](docs/WebhooksV2Api.md#resendNotificationsByResourceId) | **POST** /webhooks/{webhookId}/notifications/resend_by_resource | Resend notifications by resource Id
*WebhooksV2Api* | [**updateWebhook**](docs/WebhooksV2Api.md#updateWebhook) | **PATCH** /webhooks/{webhookId} | Update webhook
*WhitelistIpAddressesApi* | [**getWhitelistIpAddresses**](docs/WhitelistIpAddressesApi.md#getWhitelistIpAddresses) | **GET** /management/api_users/{userId}/whitelist_ip_addresses | Gets whitelisted ip addresses
*WorkspaceStatusBetaApi* | [**getWorkspaceStatus**](docs/WorkspaceStatusBetaApi.md#getWorkspaceStatus) | **GET** /management/workspace_status | Returns current workspace status


## Documentation for Models

 - [APIUser](docs/APIUser.md)
 - [AbaPaymentInfo](docs/AbaPaymentInfo.md)
 - [AbiFunction](docs/AbiFunction.md)
 - [AccessType](docs/AccessType.md)
 - [Account](docs/Account.md)
 - [AccountAccess](docs/AccountAccess.md)
 - [AccountBase](docs/AccountBase.md)
 - [AccountBasedAccessProvider](docs/AccountBasedAccessProvider.md)
 - [AccountConfig](docs/AccountConfig.md)
 - [AccountHolderDetails](docs/AccountHolderDetails.md)
 - [AccountIdentifier](docs/AccountIdentifier.md)
 - [AccountProviderID](docs/AccountProviderID.md)
 - [AccountReference](docs/AccountReference.md)
 - [AccountType](docs/AccountType.md)
 - [AccountType2](docs/AccountType2.md)
 - [AchPaymentInfo](docs/AchPaymentInfo.md)
 - [AdapterProcessingResult](docs/AdapterProcessingResult.md)
 - [AddAbiRequestDto](docs/AddAbiRequestDto.md)
 - [AddAssetToExternalWalletRequest](docs/AddAssetToExternalWalletRequest.md)
 - [AddCollateralRequestBody](docs/AddCollateralRequestBody.md)
 - [AddContractAssetRequest](docs/AddContractAssetRequest.md)
 - [AddCosignerRequest](docs/AddCosignerRequest.md)
 - [AddCosignerResponse](docs/AddCosignerResponse.md)
 - [AddExchangeAccountRequest](docs/AddExchangeAccountRequest.md)
 - [AddExchangeAccountResponse](docs/AddExchangeAccountResponse.md)
 - [AdditionalInfo](docs/AdditionalInfo.md)
 - [AdditionalInfoRequest](docs/AdditionalInfoRequest.md)
 - [AdditionalInfoRequestAdditionalInfo](docs/AdditionalInfoRequestAdditionalInfo.md)
 - [AddressNotAvailableError](docs/AddressNotAvailableError.md)
 - [AmlRegistrationResult](docs/AmlRegistrationResult.md)
 - [AmlRegistrationResultFullPayload](docs/AmlRegistrationResultFullPayload.md)
 - [AmlScreeningResult](docs/AmlScreeningResult.md)
 - [AmlVerdictManualRequest](docs/AmlVerdictManualRequest.md)
 - [AmlVerdictManualResponse](docs/AmlVerdictManualResponse.md)
 - [AmountAndChainDescriptor](docs/AmountAndChainDescriptor.md)
 - [AmountInfo](docs/AmountInfo.md)
 - [AmountOverTimeConfig](docs/AmountOverTimeConfig.md)
 - [AmountOverTimeConfigRange](docs/AmountOverTimeConfigRange.md)
 - [AmountRange](docs/AmountRange.md)
 - [ApiKey](docs/ApiKey.md)
 - [ApiKeysPaginatedResponse](docs/ApiKeysPaginatedResponse.md)
 - [ApproversConfig](docs/ApproversConfig.md)
 - [ApproversConfigApprovalGroupsInner](docs/ApproversConfigApprovalGroupsInner.md)
 - [Asset](docs/Asset.md)
 - [AssetAlreadyExistHttpError](docs/AssetAlreadyExistHttpError.md)
 - [AssetAmount](docs/AssetAmount.md)
 - [AssetBadRequestErrorResponse](docs/AssetBadRequestErrorResponse.md)
 - [AssetClass](docs/AssetClass.md)
 - [AssetConfig](docs/AssetConfig.md)
 - [AssetConflictErrorResponse](docs/AssetConflictErrorResponse.md)
 - [AssetDetailsMetadata](docs/AssetDetailsMetadata.md)
 - [AssetDetailsOnchain](docs/AssetDetailsOnchain.md)
 - [AssetFeature](docs/AssetFeature.md)
 - [AssetForbiddenErrorResponse](docs/AssetForbiddenErrorResponse.md)
 - [AssetInternalServerErrorResponse](docs/AssetInternalServerErrorResponse.md)
 - [AssetMedia](docs/AssetMedia.md)
 - [AssetMediaAttributes](docs/AssetMediaAttributes.md)
 - [AssetMetadata](docs/AssetMetadata.md)
 - [AssetMetadataDto](docs/AssetMetadataDto.md)
 - [AssetMetadataRequest](docs/AssetMetadataRequest.md)
 - [AssetNotFoundErrorResponse](docs/AssetNotFoundErrorResponse.md)
 - [AssetNote](docs/AssetNote.md)
 - [AssetNoteRequest](docs/AssetNoteRequest.md)
 - [AssetOnchain](docs/AssetOnchain.md)
 - [AssetPriceForbiddenErrorResponse](docs/AssetPriceForbiddenErrorResponse.md)
 - [AssetPriceNotFoundErrorResponse](docs/AssetPriceNotFoundErrorResponse.md)
 - [AssetPriceResponse](docs/AssetPriceResponse.md)
 - [AssetResponse](docs/AssetResponse.md)
 - [AssetScope](docs/AssetScope.md)
 - [AssetTypeResponse](docs/AssetTypeResponse.md)
 - [AssetTypesConfigInner](docs/AssetTypesConfigInner.md)
 - [AssetWallet](docs/AssetWallet.md)
 - [AuditLogData](docs/AuditLogData.md)
 - [AuditorData](docs/AuditorData.md)
 - [AuthorizationGroups](docs/AuthorizationGroups.md)
 - [AuthorizationInfo](docs/AuthorizationInfo.md)
 - [BaseProvider](docs/BaseProvider.md)
 - [BasicAddressRequest](docs/BasicAddressRequest.md)
 - [BlockInfo](docs/BlockInfo.md)
 - [BlockchainExplorer](docs/BlockchainExplorer.md)
 - [BlockchainMedia](docs/BlockchainMedia.md)
 - [BlockchainMetadata](docs/BlockchainMetadata.md)
 - [BlockchainNotFoundErrorResponse](docs/BlockchainNotFoundErrorResponse.md)
 - [BlockchainOnchain](docs/BlockchainOnchain.md)
 - [BlockchainResponse](docs/BlockchainResponse.md)
 - [BlockchainTransfer](docs/BlockchainTransfer.md)
 - [BpsFee](docs/BpsFee.md)
 - [BusinessIdentification](docs/BusinessIdentification.md)
 - [CallbackHandler](docs/CallbackHandler.md)
 - [CallbackHandlerRequest](docs/CallbackHandlerRequest.md)
 - [CancelTransactionResponse](docs/CancelTransactionResponse.md)
 - [Capability](docs/Capability.md)
 - [ChainDescriptor](docs/ChainDescriptor.md)
 - [ChainInfoResponse](docs/ChainInfoResponse.md)
 - [ChannelDvnConfigWithConfirmations](docs/ChannelDvnConfigWithConfirmations.md)
 - [ClaimRewardsRequest](docs/ClaimRewardsRequest.md)
 - [CollectionBurnRequestDto](docs/CollectionBurnRequestDto.md)
 - [CollectionBurnResponseDto](docs/CollectionBurnResponseDto.md)
 - [CollectionDeployRequestDto](docs/CollectionDeployRequestDto.md)
 - [CollectionLinkDto](docs/CollectionLinkDto.md)
 - [CollectionMetadataDto](docs/CollectionMetadataDto.md)
 - [CollectionMintRequestDto](docs/CollectionMintRequestDto.md)
 - [CollectionMintResponseDto](docs/CollectionMintResponseDto.md)
 - [CollectionOwnershipResponse](docs/CollectionOwnershipResponse.md)
 - [CollectionTokenMetadataAttributeDto](docs/CollectionTokenMetadataAttributeDto.md)
 - [CollectionTokenMetadataDto](docs/CollectionTokenMetadataDto.md)
 - [CollectionType](docs/CollectionType.md)
 - [CommittedQuoteType](docs/CommittedQuoteType.md)
 - [ComplianceResultFullPayload](docs/ComplianceResultFullPayload.md)
 - [ComplianceResultStatusesEnum](docs/ComplianceResultStatusesEnum.md)
 - [ComplianceResults](docs/ComplianceResults.md)
 - [ComplianceScreeningResult](docs/ComplianceScreeningResult.md)
 - [ComplianceScreeningResultFullPayload](docs/ComplianceScreeningResultFullPayload.md)
 - [ConfigChangeRequestStatus](docs/ConfigChangeRequestStatus.md)
 - [ConfigConversionOperationSnapshot](docs/ConfigConversionOperationSnapshot.md)
 - [ConfigDisbursementOperationSnapshot](docs/ConfigDisbursementOperationSnapshot.md)
 - [ConfigOperation](docs/ConfigOperation.md)
 - [ConfigOperationSnapshot](docs/ConfigOperationSnapshot.md)
 - [ConfigOperationStatus](docs/ConfigOperationStatus.md)
 - [ConfigTransferOperationSnapshot](docs/ConfigTransferOperationSnapshot.md)
 - [ConnectedAccount](docs/ConnectedAccount.md)
 - [ConnectedAccountApprovalStatus](docs/ConnectedAccountApprovalStatus.md)
 - [ConnectedAccountAssetType](docs/ConnectedAccountAssetType.md)
 - [ConnectedAccountBalances](docs/ConnectedAccountBalances.md)
 - [ConnectedAccountBalancesResponse](docs/ConnectedAccountBalancesResponse.md)
 - [ConnectedAccountCapability](docs/ConnectedAccountCapability.md)
 - [ConnectedAccountManifest](docs/ConnectedAccountManifest.md)
 - [ConnectedAccountRateResponse](docs/ConnectedAccountRateResponse.md)
 - [ConnectedAccountTotalBalance](docs/ConnectedAccountTotalBalance.md)
 - [ConnectedAccountTradingPair](docs/ConnectedAccountTradingPair.md)
 - [ConnectedAccountTradingPairSupportedType](docs/ConnectedAccountTradingPairSupportedType.md)
 - [ConnectedAccountTradingPairsResponse](docs/ConnectedAccountTradingPairsResponse.md)
 - [ConnectedAccountsResponse](docs/ConnectedAccountsResponse.md)
 - [ConnectedSingleAccount](docs/ConnectedSingleAccount.md)
 - [ConnectedSingleAccountResponse](docs/ConnectedSingleAccountResponse.md)
 - [ConsoleUser](docs/ConsoleUser.md)
 - [ContractAbiResponseDto](docs/ContractAbiResponseDto.md)
 - [ContractAbiResponseDtoAbiInner](docs/ContractAbiResponseDtoAbiInner.md)
 - [ContractAttributes](docs/ContractAttributes.md)
 - [ContractDataDecodeDataType](docs/ContractDataDecodeDataType.md)
 - [ContractDataDecodeError](docs/ContractDataDecodeError.md)
 - [ContractDataDecodeRequest](docs/ContractDataDecodeRequest.md)
 - [ContractDataDecodeRequestData](docs/ContractDataDecodeRequestData.md)
 - [ContractDataDecodeResponseParams](docs/ContractDataDecodeResponseParams.md)
 - [ContractDataDecodedResponse](docs/ContractDataDecodedResponse.md)
 - [ContractDataLogDataParam](docs/ContractDataLogDataParam.md)
 - [ContractDeployRequest](docs/ContractDeployRequest.md)
 - [ContractDeployResponse](docs/ContractDeployResponse.md)
 - [ContractDoc](docs/ContractDoc.md)
 - [ContractMetadataDto](docs/ContractMetadataDto.md)
 - [ContractMethodConfig](docs/ContractMethodConfig.md)
 - [ContractMethodPattern](docs/ContractMethodPattern.md)
 - [ContractTemplateDto](docs/ContractTemplateDto.md)
 - [ContractUploadRequest](docs/ContractUploadRequest.md)
 - [ContractWithAbiDto](docs/ContractWithAbiDto.md)
 - [ConversionConfigOperation](docs/ConversionConfigOperation.md)
 - [ConversionOperationConfigParams](docs/ConversionOperationConfigParams.md)
 - [ConversionOperationExecution](docs/ConversionOperationExecution.md)
 - [ConversionOperationExecutionOutput](docs/ConversionOperationExecutionOutput.md)
 - [ConversionOperationExecutionParams](docs/ConversionOperationExecutionParams.md)
 - [ConversionOperationExecutionParamsExecutionParams](docs/ConversionOperationExecutionParamsExecutionParams.md)
 - [ConversionOperationFailure](docs/ConversionOperationFailure.md)
 - [ConversionOperationPreview](docs/ConversionOperationPreview.md)
 - [ConversionOperationPreviewOutput](docs/ConversionOperationPreviewOutput.md)
 - [ConversionOperationType](docs/ConversionOperationType.md)
 - [ConversionValidationFailure](docs/ConversionValidationFailure.md)
 - [ConvertAssetsRequest](docs/ConvertAssetsRequest.md)
 - [ConvertAssetsResponse](docs/ConvertAssetsResponse.md)
 - [Cosigner](docs/Cosigner.md)
 - [CosignersPaginatedResponse](docs/CosignersPaginatedResponse.md)
 - [CreateAPIUser](docs/CreateAPIUser.md)
 - [CreateAddressRequest](docs/CreateAddressRequest.md)
 - [CreateAddressResponse](docs/CreateAddressResponse.md)
 - [CreateAssetsBulkRequest](docs/CreateAssetsBulkRequest.md)
 - [CreateAssetsRequest](docs/CreateAssetsRequest.md)
 - [CreateConfigOperationRequest](docs/CreateConfigOperationRequest.md)
 - [CreateConnectionRequest](docs/CreateConnectionRequest.md)
 - [CreateConnectionResponse](docs/CreateConnectionResponse.md)
 - [CreateConsoleUser](docs/CreateConsoleUser.md)
 - [CreateContractRequest](docs/CreateContractRequest.md)
 - [CreateConversionConfigOperationRequest](docs/CreateConversionConfigOperationRequest.md)
 - [CreateDisbursementConfigOperationRequest](docs/CreateDisbursementConfigOperationRequest.md)
 - [CreateInternalTransferRequest](docs/CreateInternalTransferRequest.md)
 - [CreateInternalWalletAssetRequest](docs/CreateInternalWalletAssetRequest.md)
 - [CreateMultichainTokenRequest](docs/CreateMultichainTokenRequest.md)
 - [CreateMultipleAccountsRequest](docs/CreateMultipleAccountsRequest.md)
 - [CreateMultipleDepositAddressesJobStatus](docs/CreateMultipleDepositAddressesJobStatus.md)
 - [CreateMultipleDepositAddressesRequest](docs/CreateMultipleDepositAddressesRequest.md)
 - [CreateMultipleVaultAccountsJobStatus](docs/CreateMultipleVaultAccountsJobStatus.md)
 - [CreateNcwConnectionRequest](docs/CreateNcwConnectionRequest.md)
 - [CreateNetworkIdRequest](docs/CreateNetworkIdRequest.md)
 - [CreateOrderRequest](docs/CreateOrderRequest.md)
 - [CreatePayoutRequest](docs/CreatePayoutRequest.md)
 - [CreateQuote](docs/CreateQuote.md)
 - [CreateQuoteScopeInner](docs/CreateQuoteScopeInner.md)
 - [CreateSigningKeyDto](docs/CreateSigningKeyDto.md)
 - [CreateSigningKeyDtoProofOfOwnership](docs/CreateSigningKeyDtoProofOfOwnership.md)
 - [CreateTagRequest](docs/CreateTagRequest.md)
 - [CreateTokenRequestDto](docs/CreateTokenRequestDto.md)
 - [CreateTokenRequestDtoCreateParams](docs/CreateTokenRequestDtoCreateParams.md)
 - [CreateTransactionResponse](docs/CreateTransactionResponse.md)
 - [CreateTransferConfigOperationRequest](docs/CreateTransferConfigOperationRequest.md)
 - [CreateUserGroupResponse](docs/CreateUserGroupResponse.md)
 - [CreateValidationKeyDto](docs/CreateValidationKeyDto.md)
 - [CreateValidationKeyResponseDto](docs/CreateValidationKeyResponseDto.md)
 - [CreateVaultAccountConnectionRequest](docs/CreateVaultAccountConnectionRequest.md)
 - [CreateVaultAccountRequest](docs/CreateVaultAccountRequest.md)
 - [CreateVaultAssetResponse](docs/CreateVaultAssetResponse.md)
 - [CreateWalletRequest](docs/CreateWalletRequest.md)
 - [CreateWebhookRequest](docs/CreateWebhookRequest.md)
 - [CreateWorkflowExecutionRequestParamsInner](docs/CreateWorkflowExecutionRequestParamsInner.md)
 - [CustomRoutingDest](docs/CustomRoutingDest.md)
 - [DVPSettlement](docs/DVPSettlement.md)
 - [DefaultNetworkRoutingDest](docs/DefaultNetworkRoutingDest.md)
 - [Delegation](docs/Delegation.md)
 - [DelegationSummary](docs/DelegationSummary.md)
 - [DeleteNetworkConnectionResponse](docs/DeleteNetworkConnectionResponse.md)
 - [DeleteNetworkIdResponse](docs/DeleteNetworkIdResponse.md)
 - [DeployLayerZeroAdaptersRequest](docs/DeployLayerZeroAdaptersRequest.md)
 - [DeployableAddressResponse](docs/DeployableAddressResponse.md)
 - [DeployedContractNotFoundError](docs/DeployedContractNotFoundError.md)
 - [DeployedContractResponseDto](docs/DeployedContractResponseDto.md)
 - [DeployedContractsPaginatedResponse](docs/DeployedContractsPaginatedResponse.md)
 - [DepositFundsFromLinkedDDAResponse](docs/DepositFundsFromLinkedDDAResponse.md)
 - [DerivationPathConfig](docs/DerivationPathConfig.md)
 - [DesignatedSignersConfig](docs/DesignatedSignersConfig.md)
 - [Destination](docs/Destination.md)
 - [DestinationConfig](docs/DestinationConfig.md)
 - [DestinationTransferPeerPath](docs/DestinationTransferPeerPath.md)
 - [DestinationTransferPeerPathResponse](docs/DestinationTransferPeerPathResponse.md)
 - [DirectAccess](docs/DirectAccess.md)
 - [DirectAccessProvider](docs/DirectAccessProvider.md)
 - [DisbursementAmountInstruction](docs/DisbursementAmountInstruction.md)
 - [DisbursementConfigOperation](docs/DisbursementConfigOperation.md)
 - [DisbursementInstruction](docs/DisbursementInstruction.md)
 - [DisbursementInstructionOutput](docs/DisbursementInstructionOutput.md)
 - [DisbursementOperationConfigParams](docs/DisbursementOperationConfigParams.md)
 - [DisbursementOperationExecution](docs/DisbursementOperationExecution.md)
 - [DisbursementOperationExecutionOutput](docs/DisbursementOperationExecutionOutput.md)
 - [DisbursementOperationExecutionParams](docs/DisbursementOperationExecutionParams.md)
 - [DisbursementOperationExecutionParamsExecutionParams](docs/DisbursementOperationExecutionParamsExecutionParams.md)
 - [DisbursementOperationInput](docs/DisbursementOperationInput.md)
 - [DisbursementOperationPreview](docs/DisbursementOperationPreview.md)
 - [DisbursementOperationPreviewOutput](docs/DisbursementOperationPreviewOutput.md)
 - [DisbursementOperationPreviewOutputInstructionSetInner](docs/DisbursementOperationPreviewOutputInstructionSetInner.md)
 - [DisbursementOperationType](docs/DisbursementOperationType.md)
 - [DisbursementPercentageInstruction](docs/DisbursementPercentageInstruction.md)
 - [DisbursementValidationFailure](docs/DisbursementValidationFailure.md)
 - [DispatchPayoutResponse](docs/DispatchPayoutResponse.md)
 - [DraftResponse](docs/DraftResponse.md)
 - [DraftReviewAndValidationResponse](docs/DraftReviewAndValidationResponse.md)
 - [DropTransactionRequest](docs/DropTransactionRequest.md)
 - [DropTransactionResponse](docs/DropTransactionResponse.md)
 - [DvnConfig](docs/DvnConfig.md)
 - [DvnConfigWithConfirmations](docs/DvnConfigWithConfirmations.md)
 - [EVMTokenCreateParamsDto](docs/EVMTokenCreateParamsDto.md)
 - [EditGasStationConfigurationResponse](docs/EditGasStationConfigurationResponse.md)
 - [EmbeddedWallet](docs/EmbeddedWallet.md)
 - [EmbeddedWalletAccount](docs/EmbeddedWalletAccount.md)
 - [EmbeddedWalletAddressDetails](docs/EmbeddedWalletAddressDetails.md)
 - [EmbeddedWalletAlgoritm](docs/EmbeddedWalletAlgoritm.md)
 - [EmbeddedWalletAssetBalance](docs/EmbeddedWalletAssetBalance.md)
 - [EmbeddedWalletAssetResponse](docs/EmbeddedWalletAssetResponse.md)
 - [EmbeddedWalletAssetRewardInfo](docs/EmbeddedWalletAssetRewardInfo.md)
 - [EmbeddedWalletDevice](docs/EmbeddedWalletDevice.md)
 - [EmbeddedWalletDeviceKeySetupResponse](docs/EmbeddedWalletDeviceKeySetupResponse.md)
 - [EmbeddedWalletDeviceKeySetupResponseSetupStatusInner](docs/EmbeddedWalletDeviceKeySetupResponseSetupStatusInner.md)
 - [EmbeddedWalletLatestBackupKey](docs/EmbeddedWalletLatestBackupKey.md)
 - [EmbeddedWalletLatestBackupResponse](docs/EmbeddedWalletLatestBackupResponse.md)
 - [EmbeddedWalletPaginatedAddressesResponse](docs/EmbeddedWalletPaginatedAddressesResponse.md)
 - [EmbeddedWalletPaginatedAssetsResponse](docs/EmbeddedWalletPaginatedAssetsResponse.md)
 - [EmbeddedWalletPaginatedWalletsResponse](docs/EmbeddedWalletPaginatedWalletsResponse.md)
 - [EmbeddedWalletSetUpStatus](docs/EmbeddedWalletSetUpStatus.md)
 - [ErrorCodes](docs/ErrorCodes.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorResponseError](docs/ErrorResponseError.md)
 - [ErrorSchema](docs/ErrorSchema.md)
 - [EstimatedFeeDetails](docs/EstimatedFeeDetails.md)
 - [EstimatedNetworkFeeResponse](docs/EstimatedNetworkFeeResponse.md)
 - [EstimatedTransactionFeeResponse](docs/EstimatedTransactionFeeResponse.md)
 - [ExchangeAccount](docs/ExchangeAccount.md)
 - [ExchangeAccountsPaged](docs/ExchangeAccountsPaged.md)
 - [ExchangeAccountsPagedPaging](docs/ExchangeAccountsPagedPaging.md)
 - [ExchangeAsset](docs/ExchangeAsset.md)
 - [ExchangeSettlementTransactionsResponse](docs/ExchangeSettlementTransactionsResponse.md)
 - [ExchangeTradingAccount](docs/ExchangeTradingAccount.md)
 - [ExchangeType](docs/ExchangeType.md)
 - [ExecutionConversionOperation](docs/ExecutionConversionOperation.md)
 - [ExecutionDisbursementOperation](docs/ExecutionDisbursementOperation.md)
 - [ExecutionOperationStatus](docs/ExecutionOperationStatus.md)
 - [ExecutionRequestBaseDetails](docs/ExecutionRequestBaseDetails.md)
 - [ExecutionRequestDetails](docs/ExecutionRequestDetails.md)
 - [ExecutionResponseBaseDetails](docs/ExecutionResponseBaseDetails.md)
 - [ExecutionResponseDetails](docs/ExecutionResponseDetails.md)
 - [ExecutionScreeningOperation](docs/ExecutionScreeningOperation.md)
 - [ExecutionStep](docs/ExecutionStep.md)
 - [ExecutionStepDetails](docs/ExecutionStepDetails.md)
 - [ExecutionStepError](docs/ExecutionStepError.md)
 - [ExecutionStepStatusEnum](docs/ExecutionStepStatusEnum.md)
 - [ExecutionStepType](docs/ExecutionStepType.md)
 - [ExecutionTransferOperation](docs/ExecutionTransferOperation.md)
 - [ExternalAccount](docs/ExternalAccount.md)
 - [ExternalWalletAsset](docs/ExternalWalletAsset.md)
 - [Fee](docs/Fee.md)
 - [FeeBreakdown](docs/FeeBreakdown.md)
 - [FeeBreakdownOneOf](docs/FeeBreakdownOneOf.md)
 - [FeeBreakdownOneOf1](docs/FeeBreakdownOneOf1.md)
 - [FeeInfo](docs/FeeInfo.md)
 - [FeeLevel](docs/FeeLevel.md)
 - [FetchAbiRequestDto](docs/FetchAbiRequestDto.md)
 - [FiatAccount](docs/FiatAccount.md)
 - [FiatAccountType](docs/FiatAccountType.md)
 - [FiatAsset](docs/FiatAsset.md)
 - [FiatTransfer](docs/FiatTransfer.md)
 - [FixedFee](docs/FixedFee.md)
 - [FreezeTransactionResponse](docs/FreezeTransactionResponse.md)
 - [FunctionDoc](docs/FunctionDoc.md)
 - [Funds](docs/Funds.md)
 - [GasStationConfiguration](docs/GasStationConfiguration.md)
 - [GasStationConfigurationResponse](docs/GasStationConfigurationResponse.md)
 - [GasStationPropertiesResponse](docs/GasStationPropertiesResponse.md)
 - [GasslessStandardConfigurations](docs/GasslessStandardConfigurations.md)
 - [GasslessStandardConfigurationsGaslessStandardConfigurationsValue](docs/GasslessStandardConfigurationsGaslessStandardConfigurationsValue.md)
 - [GetAPIUsersResponse](docs/GetAPIUsersResponse.md)
 - [GetAuditLogsResponse](docs/GetAuditLogsResponse.md)
 - [GetConnectionsResponse](docs/GetConnectionsResponse.md)
 - [GetConsoleUsersResponse](docs/GetConsoleUsersResponse.md)
 - [GetDeployableAddressRequest](docs/GetDeployableAddressRequest.md)
 - [GetExchangeAccountsCredentialsPublicKeyResponse](docs/GetExchangeAccountsCredentialsPublicKeyResponse.md)
 - [GetFilterParameter](docs/GetFilterParameter.md)
 - [GetLayerZeroDvnConfigResponse](docs/GetLayerZeroDvnConfigResponse.md)
 - [GetLayerZeroPeersResponse](docs/GetLayerZeroPeersResponse.md)
 - [GetLinkedCollectionsPaginatedResponse](docs/GetLinkedCollectionsPaginatedResponse.md)
 - [GetMaxSpendableAmountResponse](docs/GetMaxSpendableAmountResponse.md)
 - [GetMpcKeysResponse](docs/GetMpcKeysResponse.md)
 - [GetNFTsResponse](docs/GetNFTsResponse.md)
 - [GetOrdersResponse](docs/GetOrdersResponse.md)
 - [GetOtaStatusResponse](docs/GetOtaStatusResponse.md)
 - [GetOwnershipTokensResponse](docs/GetOwnershipTokensResponse.md)
 - [GetSigningKeyResponseDto](docs/GetSigningKeyResponseDto.md)
 - [GetTransactionOperation](docs/GetTransactionOperation.md)
 - [GetValidationKeyResponseDto](docs/GetValidationKeyResponseDto.md)
 - [GetWhitelistIpAddressesResponse](docs/GetWhitelistIpAddressesResponse.md)
 - [GetWorkspaceStatusResponse](docs/GetWorkspaceStatusResponse.md)
 - [HttpContractDoesNotExistError](docs/HttpContractDoesNotExistError.md)
 - [IbanPaymentInfo](docs/IbanPaymentInfo.md)
 - [Identification](docs/Identification.md)
 - [IdlType](docs/IdlType.md)
 - [IndicativeQuoteType](docs/IndicativeQuoteType.md)
 - [InitiatorConfig](docs/InitiatorConfig.md)
 - [InitiatorConfigPattern](docs/InitiatorConfigPattern.md)
 - [InstructionAmount](docs/InstructionAmount.md)
 - [InternalReference](docs/InternalReference.md)
 - [InternalTransferResponse](docs/InternalTransferResponse.md)
 - [InvalidParamaterValueError](docs/InvalidParamaterValueError.md)
 - [Job](docs/Job.md)
 - [JobCreated](docs/JobCreated.md)
 - [LayerZeroAdapterCreateParams](docs/LayerZeroAdapterCreateParams.md)
 - [LbtPaymentInfo](docs/LbtPaymentInfo.md)
 - [LeanAbiFunction](docs/LeanAbiFunction.md)
 - [LeanContractDto](docs/LeanContractDto.md)
 - [LeanDeployedContractResponseDto](docs/LeanDeployedContractResponseDto.md)
 - [LegacyAmountAggregationTimePeriodMethod](docs/LegacyAmountAggregationTimePeriodMethod.md)
 - [LegacyDraftResponse](docs/LegacyDraftResponse.md)
 - [LegacyDraftReviewAndValidationResponse](docs/LegacyDraftReviewAndValidationResponse.md)
 - [LegacyPolicyAndValidationResponse](docs/LegacyPolicyAndValidationResponse.md)
 - [LegacyPolicyCheckResult](docs/LegacyPolicyCheckResult.md)
 - [LegacyPolicyMetadata](docs/LegacyPolicyMetadata.md)
 - [LegacyPolicyResponse](docs/LegacyPolicyResponse.md)
 - [LegacyPolicyRule](docs/LegacyPolicyRule.md)
 - [LegacyPolicyRuleAmount](docs/LegacyPolicyRuleAmount.md)
 - [LegacyPolicyRuleAmountAggregation](docs/LegacyPolicyRuleAmountAggregation.md)
 - [LegacyPolicyRuleAuthorizationGroups](docs/LegacyPolicyRuleAuthorizationGroups.md)
 - [LegacyPolicyRuleAuthorizationGroupsGroupsInner](docs/LegacyPolicyRuleAuthorizationGroupsGroupsInner.md)
 - [LegacyPolicyRuleCheckResult](docs/LegacyPolicyRuleCheckResult.md)
 - [LegacyPolicyRuleDesignatedSigners](docs/LegacyPolicyRuleDesignatedSigners.md)
 - [LegacyPolicyRuleDst](docs/LegacyPolicyRuleDst.md)
 - [LegacyPolicyRuleError](docs/LegacyPolicyRuleError.md)
 - [LegacyPolicyRuleOperators](docs/LegacyPolicyRuleOperators.md)
 - [LegacyPolicyRuleRawMessageSigning](docs/LegacyPolicyRuleRawMessageSigning.md)
 - [LegacyPolicyRuleRawMessageSigningDerivationPath](docs/LegacyPolicyRuleRawMessageSigningDerivationPath.md)
 - [LegacyPolicyRuleSrc](docs/LegacyPolicyRuleSrc.md)
 - [LegacyPolicyRules](docs/LegacyPolicyRules.md)
 - [LegacyPolicySrcOrDestSubType](docs/LegacyPolicySrcOrDestSubType.md)
 - [LegacyPolicySrcOrDestType](docs/LegacyPolicySrcOrDestType.md)
 - [LegacyPolicyStatus](docs/LegacyPolicyStatus.md)
 - [LegacyPolicyValidation](docs/LegacyPolicyValidation.md)
 - [LegacyPublishDraftRequest](docs/LegacyPublishDraftRequest.md)
 - [LegacyPublishResult](docs/LegacyPublishResult.md)
 - [LegacySrcOrDestAttributesInner](docs/LegacySrcOrDestAttributesInner.md)
 - [LimitExecutionRequestDetails](docs/LimitExecutionRequestDetails.md)
 - [LimitExecutionResponseDetails](docs/LimitExecutionResponseDetails.md)
 - [ListAssetsResponse](docs/ListAssetsResponse.md)
 - [ListBlockchainsResponse](docs/ListBlockchainsResponse.md)
 - [ListOwnedCollectionsResponse](docs/ListOwnedCollectionsResponse.md)
 - [ListOwnedTokensResponse](docs/ListOwnedTokensResponse.md)
 - [Manifest](docs/Manifest.md)
 - [MarketExecutionRequestDetails](docs/MarketExecutionRequestDetails.md)
 - [MarketExecutionResponseDetails](docs/MarketExecutionResponseDetails.md)
 - [MarketRequoteRequestDetails](docs/MarketRequoteRequestDetails.md)
 - [MediaEntityResponse](docs/MediaEntityResponse.md)
 - [MergeStakeAccountsRequest](docs/MergeStakeAccountsRequest.md)
 - [MergeStakeAccountsResponse](docs/MergeStakeAccountsResponse.md)
 - [ModifySigningKeyAgentIdDto](docs/ModifySigningKeyAgentIdDto.md)
 - [ModifySigningKeyDto](docs/ModifySigningKeyDto.md)
 - [ModifyValidationKeyDto](docs/ModifyValidationKeyDto.md)
 - [MomoPaymentInfo](docs/MomoPaymentInfo.md)
 - [MpcKey](docs/MpcKey.md)
 - [MultichainDeploymentMetadata](docs/MultichainDeploymentMetadata.md)
 - [NetworkChannel](docs/NetworkChannel.md)
 - [NetworkConnection](docs/NetworkConnection.md)
 - [NetworkConnectionResponse](docs/NetworkConnectionResponse.md)
 - [NetworkConnectionRoutingPolicyValue](docs/NetworkConnectionRoutingPolicyValue.md)
 - [NetworkConnectionStatus](docs/NetworkConnectionStatus.md)
 - [NetworkFee](docs/NetworkFee.md)
 - [NetworkId](docs/NetworkId.md)
 - [NetworkIdResponse](docs/NetworkIdResponse.md)
 - [NetworkIdRoutingPolicyValue](docs/NetworkIdRoutingPolicyValue.md)
 - [NetworkRecord](docs/NetworkRecord.md)
 - [NewAddress](docs/NewAddress.md)
 - [NoneNetworkRoutingDest](docs/NoneNetworkRoutingDest.md)
 - [NotFoundException](docs/NotFoundException.md)
 - [Notification](docs/Notification.md)
 - [NotificationAttempt](docs/NotificationAttempt.md)
 - [NotificationAttemptsPaginatedResponse](docs/NotificationAttemptsPaginatedResponse.md)
 - [NotificationPaginatedResponse](docs/NotificationPaginatedResponse.md)
 - [NotificationStatus](docs/NotificationStatus.md)
 - [NotificationWithData](docs/NotificationWithData.md)
 - [OneTimeAddress](docs/OneTimeAddress.md)
 - [OneTimeAddressAccount](docs/OneTimeAddressAccount.md)
 - [OneTimeAddressReference](docs/OneTimeAddressReference.md)
 - [OperationExecutionFailure](docs/OperationExecutionFailure.md)
 - [OrderDetails](docs/OrderDetails.md)
 - [OrderStatus](docs/OrderStatus.md)
 - [OrderSummary](docs/OrderSummary.md)
 - [PaginatedAddressResponse](docs/PaginatedAddressResponse.md)
 - [PaginatedAddressResponsePaging](docs/PaginatedAddressResponsePaging.md)
 - [PaginatedAssetWalletResponse](docs/PaginatedAssetWalletResponse.md)
 - [PaginatedAssetWalletResponsePaging](docs/PaginatedAssetWalletResponsePaging.md)
 - [PaginatedAssetsResponse](docs/PaginatedAssetsResponse.md)
 - [Paging](docs/Paging.md)
 - [PairApiKeyRequest](docs/PairApiKeyRequest.md)
 - [PairApiKeyResponse](docs/PairApiKeyResponse.md)
 - [Parameter](docs/Parameter.md)
 - [ParameterWithValue](docs/ParameterWithValue.md)
 - [ParticipantRelationshipType](docs/ParticipantRelationshipType.md)
 - [ParticipantsIdentification](docs/ParticipantsIdentification.md)
 - [PayeeAccount](docs/PayeeAccount.md)
 - [PayeeAccountResponse](docs/PayeeAccountResponse.md)
 - [PayeeAccountType](docs/PayeeAccountType.md)
 - [PaymentAccount](docs/PaymentAccount.md)
 - [PaymentAccountResponse](docs/PaymentAccountResponse.md)
 - [PaymentAccountType](docs/PaymentAccountType.md)
 - [PaymentInstructions](docs/PaymentInstructions.md)
 - [PayoutInitMethod](docs/PayoutInitMethod.md)
 - [PayoutInstruction](docs/PayoutInstruction.md)
 - [PayoutInstructionResponse](docs/PayoutInstructionResponse.md)
 - [PayoutInstructionState](docs/PayoutInstructionState.md)
 - [PayoutResponse](docs/PayoutResponse.md)
 - [PayoutState](docs/PayoutState.md)
 - [PayoutStatus](docs/PayoutStatus.md)
 - [PeerAdapterInfo](docs/PeerAdapterInfo.md)
 - [PeerType](docs/PeerType.md)
 - [PersonalIdentification](docs/PersonalIdentification.md)
 - [PersonalIdentificationFullName](docs/PersonalIdentificationFullName.md)
 - [PixPaymentInfo](docs/PixPaymentInfo.md)
 - [PlatformAccount](docs/PlatformAccount.md)
 - [Players](docs/Players.md)
 - [PolicyAndValidationResponse](docs/PolicyAndValidationResponse.md)
 - [PolicyCheckResult](docs/PolicyCheckResult.md)
 - [PolicyMetadata](docs/PolicyMetadata.md)
 - [PolicyOperator](docs/PolicyOperator.md)
 - [PolicyResponse](docs/PolicyResponse.md)
 - [PolicyRule](docs/PolicyRule.md)
 - [PolicyRuleCheckResult](docs/PolicyRuleCheckResult.md)
 - [PolicyRuleError](docs/PolicyRuleError.md)
 - [PolicyStatus](docs/PolicyStatus.md)
 - [PolicyType](docs/PolicyType.md)
 - [PolicyValidation](docs/PolicyValidation.md)
 - [PostOrderSettlement](docs/PostOrderSettlement.md)
 - [PostalAddress](docs/PostalAddress.md)
 - [PreScreening](docs/PreScreening.md)
 - [PrefundedSettlement](docs/PrefundedSettlement.md)
 - [ProgramCallConfig](docs/ProgramCallConfig.md)
 - [Provider](docs/Provider.md)
 - [ProviderID](docs/ProviderID.md)
 - [ProvidersListResponse](docs/ProvidersListResponse.md)
 - [PublicKeyInformation](docs/PublicKeyInformation.md)
 - [PublishDraftRequest](docs/PublishDraftRequest.md)
 - [PublishResult](docs/PublishResult.md)
 - [Quote](docs/Quote.md)
 - [QuoteExecutionRequestDetails](docs/QuoteExecutionRequestDetails.md)
 - [QuoteExecutionResponseDetails](docs/QuoteExecutionResponseDetails.md)
 - [QuoteExecutionWithRequoteRequestDetails](docs/QuoteExecutionWithRequoteRequestDetails.md)
 - [QuoteExecutionWithRequoteRequestDetailsAllOfReQuote](docs/QuoteExecutionWithRequoteRequestDetailsAllOfReQuote.md)
 - [QuoteExecutionWithRequoteResponseDetails](docs/QuoteExecutionWithRequoteResponseDetails.md)
 - [QuoteExecutionWithRequoteResponseDetailsAllOfReQuote](docs/QuoteExecutionWithRequoteResponseDetailsAllOfReQuote.md)
 - [QuotesResponse](docs/QuotesResponse.md)
 - [ReadAbiFunction](docs/ReadAbiFunction.md)
 - [ReadCallFunctionDto](docs/ReadCallFunctionDto.md)
 - [ReadCallFunctionDtoAbiFunction](docs/ReadCallFunctionDtoAbiFunction.md)
 - [RedeemFundsToLinkedDDAResponse](docs/RedeemFundsToLinkedDDAResponse.md)
 - [RegisterNewAssetRequest](docs/RegisterNewAssetRequest.md)
 - [ReissueMultichainTokenRequest](docs/ReissueMultichainTokenRequest.md)
 - [RelatedRequest](docs/RelatedRequest.md)
 - [RelatedTransaction](docs/RelatedTransaction.md)
 - [RemoveCollateralRequestBody](docs/RemoveCollateralRequestBody.md)
 - [RemoveLayerZeroAdapterFailedResult](docs/RemoveLayerZeroAdapterFailedResult.md)
 - [RemoveLayerZeroAdaptersRequest](docs/RemoveLayerZeroAdaptersRequest.md)
 - [RemoveLayerZeroAdaptersResponse](docs/RemoveLayerZeroAdaptersResponse.md)
 - [RemoveLayerZeroPeersRequest](docs/RemoveLayerZeroPeersRequest.md)
 - [RemoveLayerZeroPeersResponse](docs/RemoveLayerZeroPeersResponse.md)
 - [RenameCosigner](docs/RenameCosigner.md)
 - [RenameVaultAccountResponse](docs/RenameVaultAccountResponse.md)
 - [RescanTransaction](docs/RescanTransaction.md)
 - [ResendFailedNotificationsJobStatusResponse](docs/ResendFailedNotificationsJobStatusResponse.md)
 - [ResendFailedNotificationsRequest](docs/ResendFailedNotificationsRequest.md)
 - [ResendFailedNotificationsResponse](docs/ResendFailedNotificationsResponse.md)
 - [ResendNotificationsByResourceIdRequest](docs/ResendNotificationsByResourceIdRequest.md)
 - [ResendTransactionWebhooksRequest](docs/ResendTransactionWebhooksRequest.md)
 - [ResendWebhooksByTransactionIdResponse](docs/ResendWebhooksByTransactionIdResponse.md)
 - [ResendWebhooksResponse](docs/ResendWebhooksResponse.md)
 - [RespondToConnectionRequest](docs/RespondToConnectionRequest.md)
 - [RetryRequoteRequestDetails](docs/RetryRequoteRequestDetails.md)
 - [RewardInfo](docs/RewardInfo.md)
 - [RewardsInfo](docs/RewardsInfo.md)
 - [SOLAccount](docs/SOLAccount.md)
 - [SOLAccountWithValue](docs/SOLAccountWithValue.md)
 - [ScreeningConfigurationsRequest](docs/ScreeningConfigurationsRequest.md)
 - [ScreeningMetadataConfig](docs/ScreeningMetadataConfig.md)
 - [ScreeningOperationExecution](docs/ScreeningOperationExecution.md)
 - [ScreeningOperationExecutionOutput](docs/ScreeningOperationExecutionOutput.md)
 - [ScreeningOperationFailure](docs/ScreeningOperationFailure.md)
 - [ScreeningOperationType](docs/ScreeningOperationType.md)
 - [ScreeningPolicyResponse](docs/ScreeningPolicyResponse.md)
 - [ScreeningProviderRulesConfigurationResponse](docs/ScreeningProviderRulesConfigurationResponse.md)
 - [ScreeningUpdateConfigurations](docs/ScreeningUpdateConfigurations.md)
 - [ScreeningValidationFailure](docs/ScreeningValidationFailure.md)
 - [ScreeningVerdict](docs/ScreeningVerdict.md)
 - [ScreeningVerdictMatchedRule](docs/ScreeningVerdictMatchedRule.md)
 - [SearchNetworkIdsResponse](docs/SearchNetworkIdsResponse.md)
 - [SepaPaymentInfo](docs/SepaPaymentInfo.md)
 - [SessionDTO](docs/SessionDTO.md)
 - [SessionMetadata](docs/SessionMetadata.md)
 - [SetAdminQuorumThresholdRequest](docs/SetAdminQuorumThresholdRequest.md)
 - [SetAdminQuorumThresholdResponse](docs/SetAdminQuorumThresholdResponse.md)
 - [SetAssetPriceRequest](docs/SetAssetPriceRequest.md)
 - [SetAutoFuelRequest](docs/SetAutoFuelRequest.md)
 - [SetConfirmationsThresholdRequest](docs/SetConfirmationsThresholdRequest.md)
 - [SetConfirmationsThresholdResponse](docs/SetConfirmationsThresholdResponse.md)
 - [SetCustomerRefIdForAddressRequest](docs/SetCustomerRefIdForAddressRequest.md)
 - [SetCustomerRefIdRequest](docs/SetCustomerRefIdRequest.md)
 - [SetLayerZeroDvnConfigRequest](docs/SetLayerZeroDvnConfigRequest.md)
 - [SetLayerZeroDvnConfigResponse](docs/SetLayerZeroDvnConfigResponse.md)
 - [SetLayerZeroPeersRequest](docs/SetLayerZeroPeersRequest.md)
 - [SetLayerZeroPeersResponse](docs/SetLayerZeroPeersResponse.md)
 - [SetNetworkIdDiscoverabilityRequest](docs/SetNetworkIdDiscoverabilityRequest.md)
 - [SetNetworkIdNameRequest](docs/SetNetworkIdNameRequest.md)
 - [SetNetworkIdResponse](docs/SetNetworkIdResponse.md)
 - [SetNetworkIdRoutingPolicyRequest](docs/SetNetworkIdRoutingPolicyRequest.md)
 - [SetOtaStatusRequest](docs/SetOtaStatusRequest.md)
 - [SetOtaStatusResponse](docs/SetOtaStatusResponse.md)
 - [SetOtaStatusResponseOneOf](docs/SetOtaStatusResponseOneOf.md)
 - [SetRoutingPolicyRequest](docs/SetRoutingPolicyRequest.md)
 - [SetRoutingPolicyResponse](docs/SetRoutingPolicyResponse.md)
 - [Settlement](docs/Settlement.md)
 - [SettlementRequestBody](docs/SettlementRequestBody.md)
 - [SettlementResponse](docs/SettlementResponse.md)
 - [SettlementSourceAccount](docs/SettlementSourceAccount.md)
 - [SignedMessage](docs/SignedMessage.md)
 - [SignedMessageSignature](docs/SignedMessageSignature.md)
 - [SigningKeyDto](docs/SigningKeyDto.md)
 - [SmartTransferApproveTerm](docs/SmartTransferApproveTerm.md)
 - [SmartTransferBadRequestResponse](docs/SmartTransferBadRequestResponse.md)
 - [SmartTransferCoinStatistic](docs/SmartTransferCoinStatistic.md)
 - [SmartTransferCreateTicket](docs/SmartTransferCreateTicket.md)
 - [SmartTransferCreateTicketTerm](docs/SmartTransferCreateTicketTerm.md)
 - [SmartTransferForbiddenResponse](docs/SmartTransferForbiddenResponse.md)
 - [SmartTransferFundDvpTicket](docs/SmartTransferFundDvpTicket.md)
 - [SmartTransferFundTerm](docs/SmartTransferFundTerm.md)
 - [SmartTransferManuallyFundTerm](docs/SmartTransferManuallyFundTerm.md)
 - [SmartTransferNotFoundResponse](docs/SmartTransferNotFoundResponse.md)
 - [SmartTransferSetTicketExpiration](docs/SmartTransferSetTicketExpiration.md)
 - [SmartTransferSetTicketExternalId](docs/SmartTransferSetTicketExternalId.md)
 - [SmartTransferSetUserGroups](docs/SmartTransferSetUserGroups.md)
 - [SmartTransferStatistic](docs/SmartTransferStatistic.md)
 - [SmartTransferStatisticInflow](docs/SmartTransferStatisticInflow.md)
 - [SmartTransferStatisticOutflow](docs/SmartTransferStatisticOutflow.md)
 - [SmartTransferSubmitTicket](docs/SmartTransferSubmitTicket.md)
 - [SmartTransferTicket](docs/SmartTransferTicket.md)
 - [SmartTransferTicketFilteredResponse](docs/SmartTransferTicketFilteredResponse.md)
 - [SmartTransferTicketResponse](docs/SmartTransferTicketResponse.md)
 - [SmartTransferTicketTerm](docs/SmartTransferTicketTerm.md)
 - [SmartTransferTicketTermResponse](docs/SmartTransferTicketTermResponse.md)
 - [SmartTransferUpdateTicketTerm](docs/SmartTransferUpdateTicketTerm.md)
 - [SmartTransferUserGroups](docs/SmartTransferUserGroups.md)
 - [SmartTransferUserGroupsResponse](docs/SmartTransferUserGroupsResponse.md)
 - [SolParameter](docs/SolParameter.md)
 - [SolParameterWithValue](docs/SolParameterWithValue.md)
 - [SolanaBlockchainData](docs/SolanaBlockchainData.md)
 - [SolanaConfig](docs/SolanaConfig.md)
 - [SolanaInstruction](docs/SolanaInstruction.md)
 - [SolanaInstructionWithValue](docs/SolanaInstructionWithValue.md)
 - [SolanaSimpleCreateParams](docs/SolanaSimpleCreateParams.md)
 - [SourceTransferPeerPath](docs/SourceTransferPeerPath.md)
 - [SourceTransferPeerPathResponse](docs/SourceTransferPeerPathResponse.md)
 - [SpamOwnershipResponse](docs/SpamOwnershipResponse.md)
 - [SpamTokenResponse](docs/SpamTokenResponse.md)
 - [SpeiAdvancedPaymentInfo](docs/SpeiAdvancedPaymentInfo.md)
 - [SpeiBasicPaymentInfo](docs/SpeiBasicPaymentInfo.md)
 - [SplitRequest](docs/SplitRequest.md)
 - [SplitResponse](docs/SplitResponse.md)
 - [StakeRequest](docs/StakeRequest.md)
 - [StakeResponse](docs/StakeResponse.md)
 - [StakingProvider](docs/StakingProvider.md)
 - [Status](docs/Status.md)
 - [StellarRippleCreateParamsDto](docs/StellarRippleCreateParamsDto.md)
 - [SystemMessageInfo](docs/SystemMessageInfo.md)
 - [Tag](docs/Tag.md)
 - [TagsPagedResponse](docs/TagsPagedResponse.md)
 - [Task](docs/Task.md)
 - [TemplatesPaginatedResponse](docs/TemplatesPaginatedResponse.md)
 - [ThirdPartyRouting](docs/ThirdPartyRouting.md)
 - [TimeInForce](docs/TimeInForce.md)
 - [TimePeriodConfig](docs/TimePeriodConfig.md)
 - [TimePeriodMatchType](docs/TimePeriodMatchType.md)
 - [ToCollateralTransaction](docs/ToCollateralTransaction.md)
 - [ToExchangeTransaction](docs/ToExchangeTransaction.md)
 - [TokenCollectionResponse](docs/TokenCollectionResponse.md)
 - [TokenInfoNotFoundErrorResponse](docs/TokenInfoNotFoundErrorResponse.md)
 - [TokenLinkDto](docs/TokenLinkDto.md)
 - [TokenLinkDtoTokenMetadata](docs/TokenLinkDtoTokenMetadata.md)
 - [TokenLinkExistsHttpError](docs/TokenLinkExistsHttpError.md)
 - [TokenLinkNotMultichainCompatibleHttpError](docs/TokenLinkNotMultichainCompatibleHttpError.md)
 - [TokenLinkRequestDto](docs/TokenLinkRequestDto.md)
 - [TokenOwnershipResponse](docs/TokenOwnershipResponse.md)
 - [TokenOwnershipSpamUpdatePayload](docs/TokenOwnershipSpamUpdatePayload.md)
 - [TokenOwnershipStatusUpdatePayload](docs/TokenOwnershipStatusUpdatePayload.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [TokensPaginatedResponse](docs/TokensPaginatedResponse.md)
 - [TradingAccountType](docs/TradingAccountType.md)
 - [TradingErrorResponse](docs/TradingErrorResponse.md)
 - [TradingErrorResponseError](docs/TradingErrorResponseError.md)
 - [TradingProvider](docs/TradingProvider.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionFee](docs/TransactionFee.md)
 - [TransactionOperation](docs/TransactionOperation.md)
 - [TransactionReceiptResponse](docs/TransactionReceiptResponse.md)
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
 - [TransferConfigOperation](docs/TransferConfigOperation.md)
 - [TransferOperationConfigParams](docs/TransferOperationConfigParams.md)
 - [TransferOperationExecution](docs/TransferOperationExecution.md)
 - [TransferOperationExecutionOutput](docs/TransferOperationExecutionOutput.md)
 - [TransferOperationExecutionParams](docs/TransferOperationExecutionParams.md)
 - [TransferOperationExecutionParamsExecutionParams](docs/TransferOperationExecutionParamsExecutionParams.md)
 - [TransferOperationFailure](docs/TransferOperationFailure.md)
 - [TransferOperationFailureData](docs/TransferOperationFailureData.md)
 - [TransferOperationPreview](docs/TransferOperationPreview.md)
 - [TransferOperationPreviewOutput](docs/TransferOperationPreviewOutput.md)
 - [TransferOperationType](docs/TransferOperationType.md)
 - [TransferPeerPathSubType](docs/TransferPeerPathSubType.md)
 - [TransferPeerPathType](docs/TransferPeerPathType.md)
 - [TransferRail](docs/TransferRail.md)
 - [TransferReceipt](docs/TransferReceipt.md)
 - [TransferValidationFailure](docs/TransferValidationFailure.md)
 - [TravelRuleAddress](docs/TravelRuleAddress.md)
 - [TravelRuleCreateTransactionRequest](docs/TravelRuleCreateTransactionRequest.md)
 - [TravelRuleDateAndPlaceOfBirth](docs/TravelRuleDateAndPlaceOfBirth.md)
 - [TravelRuleGeographicAddress](docs/TravelRuleGeographicAddress.md)
 - [TravelRuleGetAllVASPsResponse](docs/TravelRuleGetAllVASPsResponse.md)
 - [TravelRuleIssuer](docs/TravelRuleIssuer.md)
 - [TravelRuleIssuers](docs/TravelRuleIssuers.md)
 - [TravelRuleLegalPerson](docs/TravelRuleLegalPerson.md)
 - [TravelRuleLegalPersonNameIdentifier](docs/TravelRuleLegalPersonNameIdentifier.md)
 - [TravelRuleNationalIdentification](docs/TravelRuleNationalIdentification.md)
 - [TravelRuleNaturalNameIdentifier](docs/TravelRuleNaturalNameIdentifier.md)
 - [TravelRuleNaturalPerson](docs/TravelRuleNaturalPerson.md)
 - [TravelRuleNaturalPersonNameIdentifier](docs/TravelRuleNaturalPersonNameIdentifier.md)
 - [TravelRuleOwnershipProof](docs/TravelRuleOwnershipProof.md)
 - [TravelRulePerson](docs/TravelRulePerson.md)
 - [TravelRulePiiIVMS](docs/TravelRulePiiIVMS.md)
 - [TravelRulePolicyRuleResponse](docs/TravelRulePolicyRuleResponse.md)
 - [TravelRuleTransactionBlockchainInfo](docs/TravelRuleTransactionBlockchainInfo.md)
 - [TravelRuleUpdateVASPDetails](docs/TravelRuleUpdateVASPDetails.md)
 - [TravelRuleVASP](docs/TravelRuleVASP.md)
 - [TravelRuleValidateDateAndPlaceOfBirth](docs/TravelRuleValidateDateAndPlaceOfBirth.md)
 - [TravelRuleValidateFullTransactionRequest](docs/TravelRuleValidateFullTransactionRequest.md)
 - [TravelRuleValidateGeographicAddress](docs/TravelRuleValidateGeographicAddress.md)
 - [TravelRuleValidateLegalPerson](docs/TravelRuleValidateLegalPerson.md)
 - [TravelRuleValidateLegalPersonNameIdentifier](docs/TravelRuleValidateLegalPersonNameIdentifier.md)
 - [TravelRuleValidateNationalIdentification](docs/TravelRuleValidateNationalIdentification.md)
 - [TravelRuleValidateNaturalNameIdentifier](docs/TravelRuleValidateNaturalNameIdentifier.md)
 - [TravelRuleValidateNaturalPerson](docs/TravelRuleValidateNaturalPerson.md)
 - [TravelRuleValidateNaturalPersonNameIdentifier](docs/TravelRuleValidateNaturalPersonNameIdentifier.md)
 - [TravelRuleValidatePerson](docs/TravelRuleValidatePerson.md)
 - [TravelRuleValidatePiiIVMS](docs/TravelRuleValidatePiiIVMS.md)
 - [TravelRuleValidateTransactionRequest](docs/TravelRuleValidateTransactionRequest.md)
 - [TravelRuleValidateTransactionResponse](docs/TravelRuleValidateTransactionResponse.md)
 - [TravelRuleVaspForVault](docs/TravelRuleVaspForVault.md)
 - [TxLog](docs/TxLog.md)
 - [UnfreezeTransactionResponse](docs/UnfreezeTransactionResponse.md)
 - [UnmanagedWallet](docs/UnmanagedWallet.md)
 - [UnspentInput](docs/UnspentInput.md)
 - [UnspentInputsResponse](docs/UnspentInputsResponse.md)
 - [UnstakeRequest](docs/UnstakeRequest.md)
 - [UpdateAssetUserMetadataRequest](docs/UpdateAssetUserMetadataRequest.md)
 - [UpdateCallbackHandlerRequest](docs/UpdateCallbackHandlerRequest.md)
 - [UpdateCallbackHandlerResponse](docs/UpdateCallbackHandlerResponse.md)
 - [UpdateDraftRequest](docs/UpdateDraftRequest.md)
 - [UpdateTagRequest](docs/UpdateTagRequest.md)
 - [UpdateTokenOwnershipStatusDto](docs/UpdateTokenOwnershipStatusDto.md)
 - [UpdateVaultAccountAssetAddressRequest](docs/UpdateVaultAccountAssetAddressRequest.md)
 - [UpdateVaultAccountRequest](docs/UpdateVaultAccountRequest.md)
 - [UpdateWebhookRequest](docs/UpdateWebhookRequest.md)
 - [UsWirePaymentInfo](docs/UsWirePaymentInfo.md)
 - [UserGroupCreateRequest](docs/UserGroupCreateRequest.md)
 - [UserGroupCreateResponse](docs/UserGroupCreateResponse.md)
 - [UserGroupResponse](docs/UserGroupResponse.md)
 - [UserGroupUpdateRequest](docs/UserGroupUpdateRequest.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserRole](docs/UserRole.md)
 - [UserStatus](docs/UserStatus.md)
 - [UserType](docs/UserType.md)
 - [ValidateAddressResponse](docs/ValidateAddressResponse.md)
 - [ValidateLayerZeroChannelResponse](docs/ValidateLayerZeroChannelResponse.md)
 - [ValidatedTransactionsForRescan](docs/ValidatedTransactionsForRescan.md)
 - [ValidationKeyDto](docs/ValidationKeyDto.md)
 - [Validator](docs/Validator.md)
 - [VaultAccount](docs/VaultAccount.md)
 - [VaultAccountsPagedResponse](docs/VaultAccountsPagedResponse.md)
 - [VaultAccountsPagedResponsePaging](docs/VaultAccountsPagedResponsePaging.md)
 - [VaultAccountsTagAttachmentsRequest](docs/VaultAccountsTagAttachmentsRequest.md)
 - [VaultActionStatus](docs/VaultActionStatus.md)
 - [VaultAsset](docs/VaultAsset.md)
 - [VaultWalletAddress](docs/VaultWalletAddress.md)
 - [VendorDto](docs/VendorDto.md)
 - [VerdictConfig](docs/VerdictConfig.md)
 - [Version](docs/Version.md)
 - [WalletAsset](docs/WalletAsset.md)
 - [WalletAssetAdditionalInfo](docs/WalletAssetAdditionalInfo.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookEvent](docs/WebhookEvent.md)
 - [WebhookPaginatedResponse](docs/WebhookPaginatedResponse.md)
 - [WithdrawRequest](docs/WithdrawRequest.md)
 - [WorkflowConfigStatus](docs/WorkflowConfigStatus.md)
 - [WorkflowConfigurationId](docs/WorkflowConfigurationId.md)
 - [WorkflowExecutionOperation](docs/WorkflowExecutionOperation.md)
 - [WriteAbiFunction](docs/WriteAbiFunction.md)
 - [WriteCallFunctionDto](docs/WriteCallFunctionDto.md)
 - [WriteCallFunctionDtoAbiFunction](docs/WriteCallFunctionDtoAbiFunction.md)
 - [WriteCallFunctionResponseDto](docs/WriteCallFunctionResponseDto.md)


## Author

support@fireblocks.com

