# Fireblocks Java SDK (Beta)
<!--[![Maven version](https://badge.fury.io/java/fireblocks.svg)](https://badge.fury.io/java/fireblocks)-->
> **Warning**
> This package is currently in a beta stage and should be used at your own risk.
> The provided interfaces might go through backwards-incompatibale changes.

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
  <version>1.6.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.fireblocks.sdk:fireblocks-sdk:1.6.2"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/fireblocks-sdk-1.6.2.jar`
- `target/lib/*.jar`


## Getting Started
### Initiate Fireblocks Client
```java
ConfigurationOptions configurationOptions = new ConfigurationOptions()
    .basePath(BASE_PATH)
    .apiKey(API_KEY)
    .secretKey(SECRET_KEY);
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
*AdminQuorumApi* | [**setAdminQuorumThreshold**](docs/AdminQuorumApi.md#setAdminQuorumThreshold) | **PUT** /admin_quorum | Update admin quorum threshold
*AdminQuorumApi* | [**setAdminQuorumThresholdWithHttpInfo**](docs/AdminQuorumApi.md#setAdminQuorumThresholdWithHttpInfo) | **PUT** /admin_quorum | Update admin quorum threshold
*ApiUserApi* | [**createApiUser**](docs/ApiUserApi.md#createApiUser) | **POST** /management/api_users | create api user
*ApiUserApi* | [**createApiUserWithHttpInfo**](docs/ApiUserApi.md#createApiUserWithHttpInfo) | **POST** /management/api_users | create api user
*ApiUserApi* | [**getApiUsers**](docs/ApiUserApi.md#getApiUsers) | **GET** /management/api_users | get api users
*ApiUserApi* | [**getApiUsersWithHttpInfo**](docs/ApiUserApi.md#getApiUsersWithHttpInfo) | **GET** /management/api_users | get api users
*AssetsApi* | [**createAssetsBulk**](docs/AssetsApi.md#createAssetsBulk) | **POST** /vault/assets/bulk | Bulk creation of wallets
*AssetsApi* | [**createAssetsBulkWithHttpInfo**](docs/AssetsApi.md#createAssetsBulkWithHttpInfo) | **POST** /vault/assets/bulk | Bulk creation of wallets
*AuditLogsApi* | [**getAuditLogs**](docs/AuditLogsApi.md#getAuditLogs) | **GET** /management/audit_logs | Get audit logs
*AuditLogsApi* | [**getAuditLogsWithHttpInfo**](docs/AuditLogsApi.md#getAuditLogsWithHttpInfo) | **GET** /management/audit_logs | Get audit logs
*AuditLogsApi* | [**getAudits**](docs/AuditLogsApi.md#getAudits) | **GET** /audits | Get audit logs
*AuditLogsApi* | [**getAuditsWithHttpInfo**](docs/AuditLogsApi.md#getAuditsWithHttpInfo) | **GET** /audits | Get audit logs
*BlockchainsAssetsApi* | [**getSupportedAssets**](docs/BlockchainsAssetsApi.md#getSupportedAssets) | **GET** /supported_assets | List all asset types supported by Fireblocks
*BlockchainsAssetsApi* | [**getSupportedAssetsWithHttpInfo**](docs/BlockchainsAssetsApi.md#getSupportedAssetsWithHttpInfo) | **GET** /supported_assets | List all asset types supported by Fireblocks
*ComplianceApi* | [**getAmlPostScreeningPolicy**](docs/ComplianceApi.md#getAmlPostScreeningPolicy) | **GET** /screening/aml/post_screening_policy | AML - View Post-Screening Policy
*ComplianceApi* | [**getAmlPostScreeningPolicyWithHttpInfo**](docs/ComplianceApi.md#getAmlPostScreeningPolicyWithHttpInfo) | **GET** /screening/aml/post_screening_policy | AML - View Post-Screening Policy
*ComplianceApi* | [**getAmlScreeningPolicy**](docs/ComplianceApi.md#getAmlScreeningPolicy) | **GET** /screening/aml/screening_policy | AML - View Screening Policy
*ComplianceApi* | [**getAmlScreeningPolicyWithHttpInfo**](docs/ComplianceApi.md#getAmlScreeningPolicyWithHttpInfo) | **GET** /screening/aml/screening_policy | AML - View Screening Policy
*ComplianceApi* | [**getPostScreeningPolicy**](docs/ComplianceApi.md#getPostScreeningPolicy) | **GET** /screening/travel_rule/post_screening_policy | Travel Rule - View Post-Screening Policy
*ComplianceApi* | [**getPostScreeningPolicyWithHttpInfo**](docs/ComplianceApi.md#getPostScreeningPolicyWithHttpInfo) | **GET** /screening/travel_rule/post_screening_policy | Travel Rule - View Post-Screening Policy
*ComplianceApi* | [**getScreeningPolicy**](docs/ComplianceApi.md#getScreeningPolicy) | **GET** /screening/travel_rule/screening_policy | Travel Rule - View Screening Policy
*ComplianceApi* | [**getScreeningPolicyWithHttpInfo**](docs/ComplianceApi.md#getScreeningPolicyWithHttpInfo) | **GET** /screening/travel_rule/screening_policy | Travel Rule - View Screening Policy
*ComplianceApi* | [**updateAmlScreeningConfiguration**](docs/ComplianceApi.md#updateAmlScreeningConfiguration) | **PUT** /screening/aml/policy_configuration | Update AML Configuration
*ComplianceApi* | [**updateAmlScreeningConfigurationWithHttpInfo**](docs/ComplianceApi.md#updateAmlScreeningConfigurationWithHttpInfo) | **PUT** /screening/aml/policy_configuration | Update AML Configuration
*ComplianceApi* | [**updateScreeningConfiguration**](docs/ComplianceApi.md#updateScreeningConfiguration) | **PUT** /screening/configurations | Tenant - Screening Configuration
*ComplianceApi* | [**updateScreeningConfigurationWithHttpInfo**](docs/ComplianceApi.md#updateScreeningConfigurationWithHttpInfo) | **PUT** /screening/configurations | Tenant - Screening Configuration
*ComplianceApi* | [**updateTravelRuleConfig**](docs/ComplianceApi.md#updateTravelRuleConfig) | **PUT** /screening/travel_rule/policy_configuration | Update Travel Rule Configuration
*ComplianceApi* | [**updateTravelRuleConfigWithHttpInfo**](docs/ComplianceApi.md#updateTravelRuleConfigWithHttpInfo) | **PUT** /screening/travel_rule/policy_configuration | Update Travel Rule Configuration
*ComplianceScreeningConfigurationApi* | [**getAmlScreeningConfiguration**](docs/ComplianceScreeningConfigurationApi.md#getAmlScreeningConfiguration) | **GET** /screening/aml/policy_configuration | Get AML Screening Policy Configuration
*ComplianceScreeningConfigurationApi* | [**getAmlScreeningConfigurationWithHttpInfo**](docs/ComplianceScreeningConfigurationApi.md#getAmlScreeningConfigurationWithHttpInfo) | **GET** /screening/aml/policy_configuration | Get AML Screening Policy Configuration
*ComplianceScreeningConfigurationApi* | [**getScreeningConfiguration**](docs/ComplianceScreeningConfigurationApi.md#getScreeningConfiguration) | **GET** /screening/travel_rule/policy_configuration | Get Travel Rule Screening Policy Configuration
*ComplianceScreeningConfigurationApi* | [**getScreeningConfigurationWithHttpInfo**](docs/ComplianceScreeningConfigurationApi.md#getScreeningConfigurationWithHttpInfo) | **GET** /screening/travel_rule/policy_configuration | Get Travel Rule Screening Policy Configuration
*ConsoleUserApi* | [**createConsoleUser**](docs/ConsoleUserApi.md#createConsoleUser) | **POST** /management/users | create console user
*ConsoleUserApi* | [**createConsoleUserWithHttpInfo**](docs/ConsoleUserApi.md#createConsoleUserWithHttpInfo) | **POST** /management/users | create console user
*ConsoleUserApi* | [**getConsoleUsers**](docs/ConsoleUserApi.md#getConsoleUsers) | **GET** /management/users | get console users
*ConsoleUserApi* | [**getConsoleUsersWithHttpInfo**](docs/ConsoleUserApi.md#getConsoleUsersWithHttpInfo) | **GET** /management/users | get console users
*ContractsApi* | [**addContractAsset**](docs/ContractsApi.md#addContractAsset) | **POST** /contracts/{contractId}/{assetId} | Add an asset to a contract
*ContractsApi* | [**addContractAssetWithHttpInfo**](docs/ContractsApi.md#addContractAssetWithHttpInfo) | **POST** /contracts/{contractId}/{assetId} | Add an asset to a contract
*ContractsApi* | [**createContract**](docs/ContractsApi.md#createContract) | **POST** /contracts | Create a contract
*ContractsApi* | [**createContractWithHttpInfo**](docs/ContractsApi.md#createContractWithHttpInfo) | **POST** /contracts | Create a contract
*ContractsApi* | [**deleteContract**](docs/ContractsApi.md#deleteContract) | **DELETE** /contracts/{contractId} | Delete a contract
*ContractsApi* | [**deleteContractWithHttpInfo**](docs/ContractsApi.md#deleteContractWithHttpInfo) | **DELETE** /contracts/{contractId} | Delete a contract
*ContractsApi* | [**deleteContractAsset**](docs/ContractsApi.md#deleteContractAsset) | **DELETE** /contracts/{contractId}/{assetId} | Delete a contract asset
*ContractsApi* | [**deleteContractAssetWithHttpInfo**](docs/ContractsApi.md#deleteContractAssetWithHttpInfo) | **DELETE** /contracts/{contractId}/{assetId} | Delete a contract asset
*ContractsApi* | [**getContract**](docs/ContractsApi.md#getContract) | **GET** /contracts/{contractId} | Find a specific contract
*ContractsApi* | [**getContractWithHttpInfo**](docs/ContractsApi.md#getContractWithHttpInfo) | **GET** /contracts/{contractId} | Find a specific contract
*ContractsApi* | [**getContractAsset**](docs/ContractsApi.md#getContractAsset) | **GET** /contracts/{contractId}/{assetId} | Find a contract asset
*ContractsApi* | [**getContractAssetWithHttpInfo**](docs/ContractsApi.md#getContractAssetWithHttpInfo) | **GET** /contracts/{contractId}/{assetId} | Find a contract asset
*ContractsApi* | [**getContracts**](docs/ContractsApi.md#getContracts) | **GET** /contracts | List contracts
*ContractsApi* | [**getContractsWithHttpInfo**](docs/ContractsApi.md#getContractsWithHttpInfo) | **GET** /contracts | List contracts
*DefaultApi* | [**cancelJob**](docs/DefaultApi.md#cancelJob) | **POST** /batch/{jobId}/cancel | Cancel a running job
*DefaultApi* | [**cancelJobWithHttpInfo**](docs/DefaultApi.md#cancelJobWithHttpInfo) | **POST** /batch/{jobId}/cancel | Cancel a running job
*DefaultApi* | [**continueJob**](docs/DefaultApi.md#continueJob) | **POST** /batch/{jobId}/continue | Continue a paused job
*DefaultApi* | [**continueJobWithHttpInfo**](docs/DefaultApi.md#continueJobWithHttpInfo) | **POST** /batch/{jobId}/continue | Continue a paused job
*DefaultApi* | [**getJob**](docs/DefaultApi.md#getJob) | **GET** /batch/{jobId} | Get job details
*DefaultApi* | [**getJobWithHttpInfo**](docs/DefaultApi.md#getJobWithHttpInfo) | **GET** /batch/{jobId} | Get job details
*DefaultApi* | [**getJobTasks**](docs/DefaultApi.md#getJobTasks) | **GET** /batch/{jobId}/tasks | Return a list of tasks for given job
*DefaultApi* | [**getJobTasksWithHttpInfo**](docs/DefaultApi.md#getJobTasksWithHttpInfo) | **GET** /batch/{jobId}/tasks | Return a list of tasks for given job
*DefaultApi* | [**getJobs**](docs/DefaultApi.md#getJobs) | **GET** /batch/jobs | Return a list of jobs belonging to tenant
*DefaultApi* | [**getJobsWithHttpInfo**](docs/DefaultApi.md#getJobsWithHttpInfo) | **GET** /batch/jobs | Return a list of jobs belonging to tenant
*DefaultApi* | [**pauseJob**](docs/DefaultApi.md#pauseJob) | **POST** /batch/{jobId}/pause | Pause a job
*DefaultApi* | [**pauseJobWithHttpInfo**](docs/DefaultApi.md#pauseJobWithHttpInfo) | **POST** /batch/{jobId}/pause | Pause a job
*ExchangeAccountsApi* | [**convertAssets**](docs/ExchangeAccountsApi.md#convertAssets) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset.
*ExchangeAccountsApi* | [**convertAssetsWithHttpInfo**](docs/ExchangeAccountsApi.md#convertAssetsWithHttpInfo) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset.
*ExchangeAccountsApi* | [**getExchangeAccount**](docs/ExchangeAccountsApi.md#getExchangeAccount) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account
*ExchangeAccountsApi* | [**getExchangeAccountWithHttpInfo**](docs/ExchangeAccountsApi.md#getExchangeAccountWithHttpInfo) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account
*ExchangeAccountsApi* | [**getExchangeAccountAsset**](docs/ExchangeAccountsApi.md#getExchangeAccountAsset) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account
*ExchangeAccountsApi* | [**getExchangeAccountAssetWithHttpInfo**](docs/ExchangeAccountsApi.md#getExchangeAccountAssetWithHttpInfo) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account
*ExchangeAccountsApi* | [**getExchangeAccounts**](docs/ExchangeAccountsApi.md#getExchangeAccounts) | **GET** /exchange_accounts | List exchange accounts
*ExchangeAccountsApi* | [**getExchangeAccountsWithHttpInfo**](docs/ExchangeAccountsApi.md#getExchangeAccountsWithHttpInfo) | **GET** /exchange_accounts | List exchange accounts
*ExchangeAccountsApi* | [**getPagedExchangeAccounts**](docs/ExchangeAccountsApi.md#getPagedExchangeAccounts) | **GET** /exchange_accounts/paged | Pagination list exchange accounts
*ExchangeAccountsApi* | [**getPagedExchangeAccountsWithHttpInfo**](docs/ExchangeAccountsApi.md#getPagedExchangeAccountsWithHttpInfo) | **GET** /exchange_accounts/paged | Pagination list exchange accounts
*ExchangeAccountsApi* | [**internalTransfer**](docs/ExchangeAccountsApi.md#internalTransfer) | **POST** /exchange_accounts/{exchangeAccountId}/internal_transfer | Internal transfer for exchange accounts
*ExchangeAccountsApi* | [**internalTransferWithHttpInfo**](docs/ExchangeAccountsApi.md#internalTransferWithHttpInfo) | **POST** /exchange_accounts/{exchangeAccountId}/internal_transfer | Internal transfer for exchange accounts
*ExternalWalletsApi* | [**addAssetToExternalWallet**](docs/ExternalWalletsApi.md#addAssetToExternalWallet) | **POST** /external_wallets/{walletId}/{assetId} | Add an asset to an external wallet.
*ExternalWalletsApi* | [**addAssetToExternalWalletWithHttpInfo**](docs/ExternalWalletsApi.md#addAssetToExternalWalletWithHttpInfo) | **POST** /external_wallets/{walletId}/{assetId} | Add an asset to an external wallet.
*ExternalWalletsApi* | [**createExternalWallet**](docs/ExternalWalletsApi.md#createExternalWallet) | **POST** /external_wallets | Create an external wallet
*ExternalWalletsApi* | [**createExternalWalletWithHttpInfo**](docs/ExternalWalletsApi.md#createExternalWalletWithHttpInfo) | **POST** /external_wallets | Create an external wallet
*ExternalWalletsApi* | [**deleteExternalWallet**](docs/ExternalWalletsApi.md#deleteExternalWallet) | **DELETE** /external_wallets/{walletId} | Delete an external wallet
*ExternalWalletsApi* | [**deleteExternalWalletWithHttpInfo**](docs/ExternalWalletsApi.md#deleteExternalWalletWithHttpInfo) | **DELETE** /external_wallets/{walletId} | Delete an external wallet
*ExternalWalletsApi* | [**getExternalWallet**](docs/ExternalWalletsApi.md#getExternalWallet) | **GET** /external_wallets/{walletId} | Find an external wallet
*ExternalWalletsApi* | [**getExternalWalletWithHttpInfo**](docs/ExternalWalletsApi.md#getExternalWalletWithHttpInfo) | **GET** /external_wallets/{walletId} | Find an external wallet
*ExternalWalletsApi* | [**getExternalWalletAsset**](docs/ExternalWalletsApi.md#getExternalWalletAsset) | **GET** /external_wallets/{walletId}/{assetId} | Get an asset from an external wallet
*ExternalWalletsApi* | [**getExternalWalletAssetWithHttpInfo**](docs/ExternalWalletsApi.md#getExternalWalletAssetWithHttpInfo) | **GET** /external_wallets/{walletId}/{assetId} | Get an asset from an external wallet
*ExternalWalletsApi* | [**getExternalWallets**](docs/ExternalWalletsApi.md#getExternalWallets) | **GET** /external_wallets | List external wallets
*ExternalWalletsApi* | [**getExternalWalletsWithHttpInfo**](docs/ExternalWalletsApi.md#getExternalWalletsWithHttpInfo) | **GET** /external_wallets | List external wallets
*ExternalWalletsApi* | [**removeAssetFromExternalWallet**](docs/ExternalWalletsApi.md#removeAssetFromExternalWallet) | **DELETE** /external_wallets/{walletId}/{assetId} | Delete an asset from an external wallet
*ExternalWalletsApi* | [**removeAssetFromExternalWalletWithHttpInfo**](docs/ExternalWalletsApi.md#removeAssetFromExternalWalletWithHttpInfo) | **DELETE** /external_wallets/{walletId}/{assetId} | Delete an asset from an external wallet
*ExternalWalletsApi* | [**setExternalWalletCustomerRefId**](docs/ExternalWalletsApi.md#setExternalWalletCustomerRefId) | **POST** /external_wallets/{walletId}/set_customer_ref_id | Set an AML customer reference ID for an external wallet
*ExternalWalletsApi* | [**setExternalWalletCustomerRefIdWithHttpInfo**](docs/ExternalWalletsApi.md#setExternalWalletCustomerRefIdWithHttpInfo) | **POST** /external_wallets/{walletId}/set_customer_ref_id | Set an AML customer reference ID for an external wallet
*FiatAccountsApi* | [**depositFundsFromLinkedDDA**](docs/FiatAccountsApi.md#depositFundsFromLinkedDDA) | **POST** /fiat_accounts/{accountId}/deposit_from_linked_dda | Deposit funds from DDA
*FiatAccountsApi* | [**depositFundsFromLinkedDDAWithHttpInfo**](docs/FiatAccountsApi.md#depositFundsFromLinkedDDAWithHttpInfo) | **POST** /fiat_accounts/{accountId}/deposit_from_linked_dda | Deposit funds from DDA
*FiatAccountsApi* | [**getFiatAccount**](docs/FiatAccountsApi.md#getFiatAccount) | **GET** /fiat_accounts/{accountId} | Find a specific fiat account
*FiatAccountsApi* | [**getFiatAccountWithHttpInfo**](docs/FiatAccountsApi.md#getFiatAccountWithHttpInfo) | **GET** /fiat_accounts/{accountId} | Find a specific fiat account
*FiatAccountsApi* | [**getFiatAccounts**](docs/FiatAccountsApi.md#getFiatAccounts) | **GET** /fiat_accounts | List fiat accounts
*FiatAccountsApi* | [**getFiatAccountsWithHttpInfo**](docs/FiatAccountsApi.md#getFiatAccountsWithHttpInfo) | **GET** /fiat_accounts | List fiat accounts
*FiatAccountsApi* | [**redeemFundsToLinkedDDA**](docs/FiatAccountsApi.md#redeemFundsToLinkedDDA) | **POST** /fiat_accounts/{accountId}/redeem_to_linked_dda | Redeem funds to DDA
*FiatAccountsApi* | [**redeemFundsToLinkedDDAWithHttpInfo**](docs/FiatAccountsApi.md#redeemFundsToLinkedDDAWithHttpInfo) | **POST** /fiat_accounts/{accountId}/redeem_to_linked_dda | Redeem funds to DDA
*GasStationsApi* | [**getGasStationByAssetId**](docs/GasStationsApi.md#getGasStationByAssetId) | **GET** /gas_station/{assetId} | Get gas station settings by asset
*GasStationsApi* | [**getGasStationByAssetIdWithHttpInfo**](docs/GasStationsApi.md#getGasStationByAssetIdWithHttpInfo) | **GET** /gas_station/{assetId} | Get gas station settings by asset
*GasStationsApi* | [**getGasStationInfo**](docs/GasStationsApi.md#getGasStationInfo) | **GET** /gas_station | Get gas station settings
*GasStationsApi* | [**getGasStationInfoWithHttpInfo**](docs/GasStationsApi.md#getGasStationInfoWithHttpInfo) | **GET** /gas_station | Get gas station settings
*GasStationsApi* | [**updateGasStationConfiguration**](docs/GasStationsApi.md#updateGasStationConfiguration) | **PUT** /gas_station/configuration | Edit gas station settings
*GasStationsApi* | [**updateGasStationConfigurationWithHttpInfo**](docs/GasStationsApi.md#updateGasStationConfigurationWithHttpInfo) | **PUT** /gas_station/configuration | Edit gas station settings
*GasStationsApi* | [**updateGasStationConfigurationByAssetId**](docs/GasStationsApi.md#updateGasStationConfigurationByAssetId) | **PUT** /gas_station/configuration/{assetId} | Edit gas station settings for an asset
*GasStationsApi* | [**updateGasStationConfigurationByAssetIdWithHttpInfo**](docs/GasStationsApi.md#updateGasStationConfigurationByAssetIdWithHttpInfo) | **PUT** /gas_station/configuration/{assetId} | Edit gas station settings for an asset
*InternalWalletsApi* | [**createInternalWallet**](docs/InternalWalletsApi.md#createInternalWallet) | **POST** /internal_wallets | Create an internal wallet
*InternalWalletsApi* | [**createInternalWalletWithHttpInfo**](docs/InternalWalletsApi.md#createInternalWalletWithHttpInfo) | **POST** /internal_wallets | Create an internal wallet
*InternalWalletsApi* | [**createInternalWalletAsset**](docs/InternalWalletsApi.md#createInternalWalletAsset) | **POST** /internal_wallets/{walletId}/{assetId} | Add an asset to an internal wallet
*InternalWalletsApi* | [**createInternalWalletAssetWithHttpInfo**](docs/InternalWalletsApi.md#createInternalWalletAssetWithHttpInfo) | **POST** /internal_wallets/{walletId}/{assetId} | Add an asset to an internal wallet
*InternalWalletsApi* | [**deleteInternalWallet**](docs/InternalWalletsApi.md#deleteInternalWallet) | **DELETE** /internal_wallets/{walletId} | Delete an internal wallet
*InternalWalletsApi* | [**deleteInternalWalletWithHttpInfo**](docs/InternalWalletsApi.md#deleteInternalWalletWithHttpInfo) | **DELETE** /internal_wallets/{walletId} | Delete an internal wallet
*InternalWalletsApi* | [**deleteInternalWalletAsset**](docs/InternalWalletsApi.md#deleteInternalWalletAsset) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address from an internal wallet
*InternalWalletsApi* | [**deleteInternalWalletAssetWithHttpInfo**](docs/InternalWalletsApi.md#deleteInternalWalletAssetWithHttpInfo) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address from an internal wallet
*InternalWalletsApi* | [**getInternalWallet**](docs/InternalWalletsApi.md#getInternalWallet) | **GET** /internal_wallets/{walletId} | Get assets for internal wallet
*InternalWalletsApi* | [**getInternalWalletWithHttpInfo**](docs/InternalWalletsApi.md#getInternalWalletWithHttpInfo) | **GET** /internal_wallets/{walletId} | Get assets for internal wallet
*InternalWalletsApi* | [**getInternalWalletAsset**](docs/InternalWalletsApi.md#getInternalWalletAsset) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet
*InternalWalletsApi* | [**getInternalWalletAssetWithHttpInfo**](docs/InternalWalletsApi.md#getInternalWalletAssetWithHttpInfo) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet
*InternalWalletsApi* | [**getInternalWallets**](docs/InternalWalletsApi.md#getInternalWallets) | **GET** /internal_wallets | List internal wallets
*InternalWalletsApi* | [**getInternalWalletsWithHttpInfo**](docs/InternalWalletsApi.md#getInternalWalletsWithHttpInfo) | **GET** /internal_wallets | List internal wallets
*InternalWalletsApi* | [**setCustomerRefIdForInternalWallet**](docs/InternalWalletsApi.md#setCustomerRefIdForInternalWallet) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet
*InternalWalletsApi* | [**setCustomerRefIdForInternalWalletWithHttpInfo**](docs/InternalWalletsApi.md#setCustomerRefIdForInternalWalletWithHttpInfo) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet
*NetworkConnectionsApi* | [**checkThirdPartyRouting**](docs/NetworkConnectionsApi.md#checkThirdPartyRouting) | **GET** /network_connections/{connectionId}/is_third_party_routing/{assetType} | Retrieve third-party network routing validation by asset type.
*NetworkConnectionsApi* | [**checkThirdPartyRoutingWithHttpInfo**](docs/NetworkConnectionsApi.md#checkThirdPartyRoutingWithHttpInfo) | **GET** /network_connections/{connectionId}/is_third_party_routing/{assetType} | Retrieve third-party network routing validation by asset type.
*NetworkConnectionsApi* | [**createNetworkConnection**](docs/NetworkConnectionsApi.md#createNetworkConnection) | **POST** /network_connections | Creates a new network connection
*NetworkConnectionsApi* | [**createNetworkConnectionWithHttpInfo**](docs/NetworkConnectionsApi.md#createNetworkConnectionWithHttpInfo) | **POST** /network_connections | Creates a new network connection
*NetworkConnectionsApi* | [**createNetworkId**](docs/NetworkConnectionsApi.md#createNetworkId) | **POST** /network_ids | Creates a new Network ID
*NetworkConnectionsApi* | [**createNetworkIdWithHttpInfo**](docs/NetworkConnectionsApi.md#createNetworkIdWithHttpInfo) | **POST** /network_ids | Creates a new Network ID
*NetworkConnectionsApi* | [**deleteNetworkConnection**](docs/NetworkConnectionsApi.md#deleteNetworkConnection) | **DELETE** /network_connections/{connectionId} | Deletes a network connection by ID
*NetworkConnectionsApi* | [**deleteNetworkConnectionWithHttpInfo**](docs/NetworkConnectionsApi.md#deleteNetworkConnectionWithHttpInfo) | **DELETE** /network_connections/{connectionId} | Deletes a network connection by ID
*NetworkConnectionsApi* | [**deleteNetworkId**](docs/NetworkConnectionsApi.md#deleteNetworkId) | **DELETE** /network_ids/{networkId} | Deletes specific network ID.
*NetworkConnectionsApi* | [**deleteNetworkIdWithHttpInfo**](docs/NetworkConnectionsApi.md#deleteNetworkIdWithHttpInfo) | **DELETE** /network_ids/{networkId} | Deletes specific network ID.
*NetworkConnectionsApi* | [**getNetwork**](docs/NetworkConnectionsApi.md#getNetwork) | **GET** /network_connections/{connectionId} | Get a network connection
*NetworkConnectionsApi* | [**getNetworkWithHttpInfo**](docs/NetworkConnectionsApi.md#getNetworkWithHttpInfo) | **GET** /network_connections/{connectionId} | Get a network connection
*NetworkConnectionsApi* | [**getNetworkConnections**](docs/NetworkConnectionsApi.md#getNetworkConnections) | **GET** /network_connections | List network connections
*NetworkConnectionsApi* | [**getNetworkConnectionsWithHttpInfo**](docs/NetworkConnectionsApi.md#getNetworkConnectionsWithHttpInfo) | **GET** /network_connections | List network connections
*NetworkConnectionsApi* | [**getNetworkId**](docs/NetworkConnectionsApi.md#getNetworkId) | **GET** /network_ids/{networkId} | Returns specific network ID.
*NetworkConnectionsApi* | [**getNetworkIdWithHttpInfo**](docs/NetworkConnectionsApi.md#getNetworkIdWithHttpInfo) | **GET** /network_ids/{networkId} | Returns specific network ID.
*NetworkConnectionsApi* | [**getNetworkIds**](docs/NetworkConnectionsApi.md#getNetworkIds) | **GET** /network_ids | Returns all network IDs, both local IDs and discoverable remote IDs
*NetworkConnectionsApi* | [**getNetworkIdsWithHttpInfo**](docs/NetworkConnectionsApi.md#getNetworkIdsWithHttpInfo) | **GET** /network_ids | Returns all network IDs, both local IDs and discoverable remote IDs
*NetworkConnectionsApi* | [**setNetworkIdDiscoverability**](docs/NetworkConnectionsApi.md#setNetworkIdDiscoverability) | **PATCH** /network_ids/{networkId}/set_discoverability | Update network ID&#39;s discoverability.
*NetworkConnectionsApi* | [**setNetworkIdDiscoverabilityWithHttpInfo**](docs/NetworkConnectionsApi.md#setNetworkIdDiscoverabilityWithHttpInfo) | **PATCH** /network_ids/{networkId}/set_discoverability | Update network ID&#39;s discoverability.
*NetworkConnectionsApi* | [**setNetworkIdName**](docs/NetworkConnectionsApi.md#setNetworkIdName) | **PATCH** /network_ids/{networkId}/set_name | Update network ID&#39;s name.
*NetworkConnectionsApi* | [**setNetworkIdNameWithHttpInfo**](docs/NetworkConnectionsApi.md#setNetworkIdNameWithHttpInfo) | **PATCH** /network_ids/{networkId}/set_name | Update network ID&#39;s name.
*NetworkConnectionsApi* | [**setNetworkIdRoutingPolicy**](docs/NetworkConnectionsApi.md#setNetworkIdRoutingPolicy) | **PATCH** /network_ids/{networkId}/set_routing_policy | Update network id routing policy.
*NetworkConnectionsApi* | [**setNetworkIdRoutingPolicyWithHttpInfo**](docs/NetworkConnectionsApi.md#setNetworkIdRoutingPolicyWithHttpInfo) | **PATCH** /network_ids/{networkId}/set_routing_policy | Update network id routing policy.
*NetworkConnectionsApi* | [**setRoutingPolicy**](docs/NetworkConnectionsApi.md#setRoutingPolicy) | **PATCH** /network_connections/{connectionId}/set_routing_policy | Update network connection routing policy.
*NetworkConnectionsApi* | [**setRoutingPolicyWithHttpInfo**](docs/NetworkConnectionsApi.md#setRoutingPolicyWithHttpInfo) | **PATCH** /network_connections/{connectionId}/set_routing_policy | Update network connection routing policy.
*NftsApi* | [**getNFT**](docs/NftsApi.md#getNFT) | **GET** /nfts/tokens/{id} | List token data by ID
*NftsApi* | [**getNFTWithHttpInfo**](docs/NftsApi.md#getNFTWithHttpInfo) | **GET** /nfts/tokens/{id} | List token data by ID
*NftsApi* | [**getNFTs**](docs/NftsApi.md#getNFTs) | **GET** /nfts/tokens | List tokens by IDs
*NftsApi* | [**getNFTsWithHttpInfo**](docs/NftsApi.md#getNFTsWithHttpInfo) | **GET** /nfts/tokens | List tokens by IDs
*NftsApi* | [**getOwnershipTokens**](docs/NftsApi.md#getOwnershipTokens) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated)
*NftsApi* | [**getOwnershipTokensWithHttpInfo**](docs/NftsApi.md#getOwnershipTokensWithHttpInfo) | **GET** /nfts/ownership/tokens | List all owned tokens (paginated)
*NftsApi* | [**listOwnedCollections**](docs/NftsApi.md#listOwnedCollections) | **GET** /nfts/ownership/collections | List owned collections (paginated)
*NftsApi* | [**listOwnedCollectionsWithHttpInfo**](docs/NftsApi.md#listOwnedCollectionsWithHttpInfo) | **GET** /nfts/ownership/collections | List owned collections (paginated)
*NftsApi* | [**listOwnedTokens**](docs/NftsApi.md#listOwnedTokens) | **GET** /nfts/ownership/assets | List all distinct owned tokens (paginated)
*NftsApi* | [**listOwnedTokensWithHttpInfo**](docs/NftsApi.md#listOwnedTokensWithHttpInfo) | **GET** /nfts/ownership/assets | List all distinct owned tokens (paginated)
*NftsApi* | [**refreshNFTMetadata**](docs/NftsApi.md#refreshNFTMetadata) | **PUT** /nfts/tokens/{id} | Refresh token metadata
*NftsApi* | [**refreshNFTMetadataWithHttpInfo**](docs/NftsApi.md#refreshNFTMetadataWithHttpInfo) | **PUT** /nfts/tokens/{id} | Refresh token metadata
*NftsApi* | [**updateOwnershipTokens**](docs/NftsApi.md#updateOwnershipTokens) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens
*NftsApi* | [**updateOwnershipTokensWithHttpInfo**](docs/NftsApi.md#updateOwnershipTokensWithHttpInfo) | **PUT** /nfts/ownership/tokens | Refresh vault account tokens
*NftsApi* | [**updateTokenOwnershipStatus**](docs/NftsApi.md#updateTokenOwnershipStatus) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status
*NftsApi* | [**updateTokenOwnershipStatusWithHttpInfo**](docs/NftsApi.md#updateTokenOwnershipStatusWithHttpInfo) | **PUT** /nfts/ownership/tokens/{id}/status | Update token ownership status
*NftsApi* | [**updateTokensOwnershipSpam**](docs/NftsApi.md#updateTokensOwnershipSpam) | **PUT** /nfts/ownership/tokens/spam | Update tokens ownership spam property
*NftsApi* | [**updateTokensOwnershipSpamWithHttpInfo**](docs/NftsApi.md#updateTokensOwnershipSpamWithHttpInfo) | **PUT** /nfts/ownership/tokens/spam | Update tokens ownership spam property
*NftsApi* | [**updateTokensOwnershipStatus**](docs/NftsApi.md#updateTokensOwnershipStatus) | **PUT** /nfts/ownership/tokens/status | Update tokens ownership status
*NftsApi* | [**updateTokensOwnershipStatusWithHttpInfo**](docs/NftsApi.md#updateTokensOwnershipStatusWithHttpInfo) | **PUT** /nfts/ownership/tokens/status | Update tokens ownership status
*OffExchangesApi* | [**addOffExchange**](docs/OffExchangesApi.md#addOffExchange) | **POST** /off_exchange/add | add collateral
*OffExchangesApi* | [**addOffExchangeWithHttpInfo**](docs/OffExchangesApi.md#addOffExchangeWithHttpInfo) | **POST** /off_exchange/add | add collateral
*OffExchangesApi* | [**getOffExchangeCollateralAccounts**](docs/OffExchangesApi.md#getOffExchangeCollateralAccounts) | **GET** /off_exchange/collateral_accounts/{mainExchangeAccountId} | Find a specific collateral exchange account
*OffExchangesApi* | [**getOffExchangeCollateralAccountsWithHttpInfo**](docs/OffExchangesApi.md#getOffExchangeCollateralAccountsWithHttpInfo) | **GET** /off_exchange/collateral_accounts/{mainExchangeAccountId} | Find a specific collateral exchange account
*OffExchangesApi* | [**getOffExchangeSettlementTransactions**](docs/OffExchangesApi.md#getOffExchangeSettlementTransactions) | **GET** /off_exchange/settlements/transactions | get settlements transactions from exchange
*OffExchangesApi* | [**getOffExchangeSettlementTransactionsWithHttpInfo**](docs/OffExchangesApi.md#getOffExchangeSettlementTransactionsWithHttpInfo) | **GET** /off_exchange/settlements/transactions | get settlements transactions from exchange
*OffExchangesApi* | [**removeOffExchange**](docs/OffExchangesApi.md#removeOffExchange) | **POST** /off_exchange/remove | remove collateral
*OffExchangesApi* | [**removeOffExchangeWithHttpInfo**](docs/OffExchangesApi.md#removeOffExchangeWithHttpInfo) | **POST** /off_exchange/remove | remove collateral
*OffExchangesApi* | [**settleOffExchangeTrades**](docs/OffExchangesApi.md#settleOffExchangeTrades) | **POST** /off_exchange/settlements/trader | create settlement for a trader
*OffExchangesApi* | [**settleOffExchangeTradesWithHttpInfo**](docs/OffExchangesApi.md#settleOffExchangeTradesWithHttpInfo) | **POST** /off_exchange/settlements/trader | create settlement for a trader
*OtaBetaApi* | [**getOtaStatus**](docs/OtaBetaApi.md#getOtaStatus) | **GET** /management/ota | Returns current OTA status
*OtaBetaApi* | [**getOtaStatusWithHttpInfo**](docs/OtaBetaApi.md#getOtaStatusWithHttpInfo) | **GET** /management/ota | Returns current OTA status
*OtaBetaApi* | [**setOtaStatus**](docs/OtaBetaApi.md#setOtaStatus) | **PUT** /management/ota | Enable or disable transactions to OTA
*OtaBetaApi* | [**setOtaStatusWithHttpInfo**](docs/OtaBetaApi.md#setOtaStatusWithHttpInfo) | **PUT** /management/ota | Enable or disable transactions to OTA
*PaymentsPayoutApi* | [**createPayout**](docs/PaymentsPayoutApi.md#createPayout) | **POST** /payments/payout | Create a payout instruction set
*PaymentsPayoutApi* | [**createPayoutWithHttpInfo**](docs/PaymentsPayoutApi.md#createPayoutWithHttpInfo) | **POST** /payments/payout | Create a payout instruction set
*PaymentsPayoutApi* | [**executePayoutAction**](docs/PaymentsPayoutApi.md#executePayoutAction) | **POST** /payments/payout/{payoutId}/actions/execute | Execute a payout instruction set
*PaymentsPayoutApi* | [**executePayoutActionWithHttpInfo**](docs/PaymentsPayoutApi.md#executePayoutActionWithHttpInfo) | **POST** /payments/payout/{payoutId}/actions/execute | Execute a payout instruction set
*PaymentsPayoutApi* | [**getPayout**](docs/PaymentsPayoutApi.md#getPayout) | **GET** /payments/payout/{payoutId} | Get the status of a payout instruction set
*PaymentsPayoutApi* | [**getPayoutWithHttpInfo**](docs/PaymentsPayoutApi.md#getPayoutWithHttpInfo) | **GET** /payments/payout/{payoutId} | Get the status of a payout instruction set
*PolicyEditorBetaApi* | [**getActivePolicy**](docs/PolicyEditorBetaApi.md#getActivePolicy) | **GET** /tap/active_policy | Get the active policy and its validation
*PolicyEditorBetaApi* | [**getActivePolicyWithHttpInfo**](docs/PolicyEditorBetaApi.md#getActivePolicyWithHttpInfo) | **GET** /tap/active_policy | Get the active policy and its validation
*PolicyEditorBetaApi* | [**getDraft**](docs/PolicyEditorBetaApi.md#getDraft) | **GET** /tap/draft | Get the active draft
*PolicyEditorBetaApi* | [**getDraftWithHttpInfo**](docs/PolicyEditorBetaApi.md#getDraftWithHttpInfo) | **GET** /tap/draft | Get the active draft
*PolicyEditorBetaApi* | [**publishDraft**](docs/PolicyEditorBetaApi.md#publishDraft) | **POST** /tap/draft | Send publish request for a certain draft id
*PolicyEditorBetaApi* | [**publishDraftWithHttpInfo**](docs/PolicyEditorBetaApi.md#publishDraftWithHttpInfo) | **POST** /tap/draft | Send publish request for a certain draft id
*PolicyEditorBetaApi* | [**publishPolicyRules**](docs/PolicyEditorBetaApi.md#publishPolicyRules) | **POST** /tap/publish | Send publish request for a set of policy rules
*PolicyEditorBetaApi* | [**publishPolicyRulesWithHttpInfo**](docs/PolicyEditorBetaApi.md#publishPolicyRulesWithHttpInfo) | **POST** /tap/publish | Send publish request for a set of policy rules
*PolicyEditorBetaApi* | [**updateDraft**](docs/PolicyEditorBetaApi.md#updateDraft) | **PUT** /tap/draft | Update the draft with a new set of rules
*PolicyEditorBetaApi* | [**updateDraftWithHttpInfo**](docs/PolicyEditorBetaApi.md#updateDraftWithHttpInfo) | **PUT** /tap/draft | Update the draft with a new set of rules
*ResetDeviceApi* | [**resetDevice**](docs/ResetDeviceApi.md#resetDevice) | **POST** /management/users/{id}/reset_device | resets device
*ResetDeviceApi* | [**resetDeviceWithHttpInfo**](docs/ResetDeviceApi.md#resetDeviceWithHttpInfo) | **POST** /management/users/{id}/reset_device | resets device
*SmartTransferApi* | [**cancelTicket**](docs/SmartTransferApi.md#cancelTicket) | **PUT** /smart-transfers/{ticketId}/cancel | Cancel Ticket
*SmartTransferApi* | [**cancelTicketWithHttpInfo**](docs/SmartTransferApi.md#cancelTicketWithHttpInfo) | **PUT** /smart-transfers/{ticketId}/cancel | Cancel Ticket
*SmartTransferApi* | [**createTicket**](docs/SmartTransferApi.md#createTicket) | **POST** /smart-transfers | Create Ticket
*SmartTransferApi* | [**createTicketWithHttpInfo**](docs/SmartTransferApi.md#createTicketWithHttpInfo) | **POST** /smart-transfers | Create Ticket
*SmartTransferApi* | [**createTicketTerm**](docs/SmartTransferApi.md#createTicketTerm) | **POST** /smart-transfers/{ticketId}/terms | Create leg (term)
*SmartTransferApi* | [**createTicketTermWithHttpInfo**](docs/SmartTransferApi.md#createTicketTermWithHttpInfo) | **POST** /smart-transfers/{ticketId}/terms | Create leg (term)
*SmartTransferApi* | [**findTicketById**](docs/SmartTransferApi.md#findTicketById) | **GET** /smart-transfers/{ticketId} | Search Tickets by ID
*SmartTransferApi* | [**findTicketByIdWithHttpInfo**](docs/SmartTransferApi.md#findTicketByIdWithHttpInfo) | **GET** /smart-transfers/{ticketId} | Search Tickets by ID
*SmartTransferApi* | [**findTicketTermById**](docs/SmartTransferApi.md#findTicketTermById) | **GET** /smart-transfers/{ticketId}/terms/{termId} | Search ticket by leg (term) ID
*SmartTransferApi* | [**findTicketTermByIdWithHttpInfo**](docs/SmartTransferApi.md#findTicketTermByIdWithHttpInfo) | **GET** /smart-transfers/{ticketId}/terms/{termId} | Search ticket by leg (term) ID
*SmartTransferApi* | [**fulfillTicket**](docs/SmartTransferApi.md#fulfillTicket) | **PUT** /smart-transfers/{ticketId}/fulfill | Fund ticket manually
*SmartTransferApi* | [**fulfillTicketWithHttpInfo**](docs/SmartTransferApi.md#fulfillTicketWithHttpInfo) | **PUT** /smart-transfers/{ticketId}/fulfill | Fund ticket manually
*SmartTransferApi* | [**fundTicketTerm**](docs/SmartTransferApi.md#fundTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/fund | Define funding source
*SmartTransferApi* | [**fundTicketTermWithHttpInfo**](docs/SmartTransferApi.md#fundTicketTermWithHttpInfo) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/fund | Define funding source
*SmartTransferApi* | [**getSmartTransferUserGroups**](docs/SmartTransferApi.md#getSmartTransferUserGroups) | **GET** /smart-transfers/settings/user-groups | Get user group
*SmartTransferApi* | [**getSmartTransferUserGroupsWithHttpInfo**](docs/SmartTransferApi.md#getSmartTransferUserGroupsWithHttpInfo) | **GET** /smart-transfers/settings/user-groups | Get user group
*SmartTransferApi* | [**manuallyFundTicketTerm**](docs/SmartTransferApi.md#manuallyFundTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/manually-fund | Manually add term transaction
*SmartTransferApi* | [**manuallyFundTicketTermWithHttpInfo**](docs/SmartTransferApi.md#manuallyFundTicketTermWithHttpInfo) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/manually-fund | Manually add term transaction
*SmartTransferApi* | [**removeTicketTerm**](docs/SmartTransferApi.md#removeTicketTerm) | **DELETE** /smart-transfers/{ticketId}/terms/{termId} | Delete ticket leg (term)
*SmartTransferApi* | [**removeTicketTermWithHttpInfo**](docs/SmartTransferApi.md#removeTicketTermWithHttpInfo) | **DELETE** /smart-transfers/{ticketId}/terms/{termId} | Delete ticket leg (term)
*SmartTransferApi* | [**searchTickets**](docs/SmartTransferApi.md#searchTickets) | **GET** /smart-transfers | Find Ticket
*SmartTransferApi* | [**searchTicketsWithHttpInfo**](docs/SmartTransferApi.md#searchTicketsWithHttpInfo) | **GET** /smart-transfers | Find Ticket
*SmartTransferApi* | [**setExternalRefId**](docs/SmartTransferApi.md#setExternalRefId) | **PUT** /smart-transfers/{ticketId}/external-id | Add external ref. ID
*SmartTransferApi* | [**setExternalRefIdWithHttpInfo**](docs/SmartTransferApi.md#setExternalRefIdWithHttpInfo) | **PUT** /smart-transfers/{ticketId}/external-id | Add external ref. ID
*SmartTransferApi* | [**setTicketExpiration**](docs/SmartTransferApi.md#setTicketExpiration) | **PUT** /smart-transfers/{ticketId}/expires-in | Set expiration
*SmartTransferApi* | [**setTicketExpirationWithHttpInfo**](docs/SmartTransferApi.md#setTicketExpirationWithHttpInfo) | **PUT** /smart-transfers/{ticketId}/expires-in | Set expiration
*SmartTransferApi* | [**setUserGroups**](docs/SmartTransferApi.md#setUserGroups) | **POST** /smart-transfers/settings/user-groups | Set user group
*SmartTransferApi* | [**setUserGroupsWithHttpInfo**](docs/SmartTransferApi.md#setUserGroupsWithHttpInfo) | **POST** /smart-transfers/settings/user-groups | Set user group
*SmartTransferApi* | [**submitTicket**](docs/SmartTransferApi.md#submitTicket) | **PUT** /smart-transfers/{ticketId}/submit | Submit ticket
*SmartTransferApi* | [**submitTicketWithHttpInfo**](docs/SmartTransferApi.md#submitTicketWithHttpInfo) | **PUT** /smart-transfers/{ticketId}/submit | Submit ticket
*SmartTransferApi* | [**updateTicketTerm**](docs/SmartTransferApi.md#updateTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId} | Update ticket leg (term)
*SmartTransferApi* | [**updateTicketTermWithHttpInfo**](docs/SmartTransferApi.md#updateTicketTermWithHttpInfo) | **PUT** /smart-transfers/{ticketId}/terms/{termId} | Update ticket leg (term)
*StakingBetaApi* | [**approveTermsOfServiceByProviderId**](docs/StakingBetaApi.md#approveTermsOfServiceByProviderId) | **POST** /staking/providers/{providerId}/approveTermsOfService | 
*StakingBetaApi* | [**approveTermsOfServiceByProviderIdWithHttpInfo**](docs/StakingBetaApi.md#approveTermsOfServiceByProviderIdWithHttpInfo) | **POST** /staking/providers/{providerId}/approveTermsOfService | 
*StakingBetaApi* | [**executeAction**](docs/StakingBetaApi.md#executeAction) | **POST** /staking/chains/{chainDescriptor}/{actionId} | 
*StakingBetaApi* | [**executeActionWithHttpInfo**](docs/StakingBetaApi.md#executeActionWithHttpInfo) | **POST** /staking/chains/{chainDescriptor}/{actionId} | 
*StakingBetaApi* | [**getAllDelegations**](docs/StakingBetaApi.md#getAllDelegations) | **GET** /staking/positions | 
*StakingBetaApi* | [**getAllDelegationsWithHttpInfo**](docs/StakingBetaApi.md#getAllDelegationsWithHttpInfo) | **GET** /staking/positions | 
*StakingBetaApi* | [**getChainInfo**](docs/StakingBetaApi.md#getChainInfo) | **GET** /staking/chains/{chainDescriptor}/chainInfo | 
*StakingBetaApi* | [**getChainInfoWithHttpInfo**](docs/StakingBetaApi.md#getChainInfoWithHttpInfo) | **GET** /staking/chains/{chainDescriptor}/chainInfo | 
*StakingBetaApi* | [**getChains**](docs/StakingBetaApi.md#getChains) | **GET** /staking/chains | 
*StakingBetaApi* | [**getChainsWithHttpInfo**](docs/StakingBetaApi.md#getChainsWithHttpInfo) | **GET** /staking/chains | 
*StakingBetaApi* | [**getDelegationById**](docs/StakingBetaApi.md#getDelegationById) | **GET** /staking/positions/{id} | 
*StakingBetaApi* | [**getDelegationByIdWithHttpInfo**](docs/StakingBetaApi.md#getDelegationByIdWithHttpInfo) | **GET** /staking/positions/{id} | 
*StakingBetaApi* | [**getProviders**](docs/StakingBetaApi.md#getProviders) | **GET** /staking/providers | 
*StakingBetaApi* | [**getProvidersWithHttpInfo**](docs/StakingBetaApi.md#getProvidersWithHttpInfo) | **GET** /staking/providers | 
*StakingBetaApi* | [**getSummary**](docs/StakingBetaApi.md#getSummary) | **GET** /staking/positions/summary | 
*StakingBetaApi* | [**getSummaryWithHttpInfo**](docs/StakingBetaApi.md#getSummaryWithHttpInfo) | **GET** /staking/positions/summary | 
*StakingBetaApi* | [**getSummaryByVault**](docs/StakingBetaApi.md#getSummaryByVault) | **GET** /staking/positions/summary/vaults | 
*StakingBetaApi* | [**getSummaryByVaultWithHttpInfo**](docs/StakingBetaApi.md#getSummaryByVaultWithHttpInfo) | **GET** /staking/positions/summary/vaults | 
*TransactionsApi* | [**cancelTransaction**](docs/TransactionsApi.md#cancelTransaction) | **POST** /transactions/{txId}/cancel | Cancel a transaction
*TransactionsApi* | [**cancelTransactionWithHttpInfo**](docs/TransactionsApi.md#cancelTransactionWithHttpInfo) | **POST** /transactions/{txId}/cancel | Cancel a transaction
*TransactionsApi* | [**createTransaction**](docs/TransactionsApi.md#createTransaction) | **POST** /transactions | Create a new transaction
*TransactionsApi* | [**createTransactionWithHttpInfo**](docs/TransactionsApi.md#createTransactionWithHttpInfo) | **POST** /transactions | Create a new transaction
*TransactionsApi* | [**dropTransaction**](docs/TransactionsApi.md#dropTransaction) | **POST** /transactions/{txId}/drop | Drop ETH transaction by ID
*TransactionsApi* | [**dropTransactionWithHttpInfo**](docs/TransactionsApi.md#dropTransactionWithHttpInfo) | **POST** /transactions/{txId}/drop | Drop ETH transaction by ID
*TransactionsApi* | [**estimateNetworkFee**](docs/TransactionsApi.md#estimateNetworkFee) | **GET** /estimate_network_fee | Estimate the required fee for an asset
*TransactionsApi* | [**estimateNetworkFeeWithHttpInfo**](docs/TransactionsApi.md#estimateNetworkFeeWithHttpInfo) | **GET** /estimate_network_fee | Estimate the required fee for an asset
*TransactionsApi* | [**estimateTransactionFee**](docs/TransactionsApi.md#estimateTransactionFee) | **POST** /transactions/estimate_fee | Estimate transaction fee
*TransactionsApi* | [**estimateTransactionFeeWithHttpInfo**](docs/TransactionsApi.md#estimateTransactionFeeWithHttpInfo) | **POST** /transactions/estimate_fee | Estimate transaction fee
*TransactionsApi* | [**freezeTransaction**](docs/TransactionsApi.md#freezeTransaction) | **POST** /transactions/{txId}/freeze | Freeze a transaction
*TransactionsApi* | [**freezeTransactionWithHttpInfo**](docs/TransactionsApi.md#freezeTransactionWithHttpInfo) | **POST** /transactions/{txId}/freeze | Freeze a transaction
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /transactions/{txId} | Find a specific transaction by Fireblocks transaction ID
*TransactionsApi* | [**getTransactionWithHttpInfo**](docs/TransactionsApi.md#getTransactionWithHttpInfo) | **GET** /transactions/{txId} | Find a specific transaction by Fireblocks transaction ID
*TransactionsApi* | [**getTransactionByExternalId**](docs/TransactionsApi.md#getTransactionByExternalId) | **GET** /transactions/external_tx_id/{externalTxId} | Find a specific transaction by external transaction ID
*TransactionsApi* | [**getTransactionByExternalIdWithHttpInfo**](docs/TransactionsApi.md#getTransactionByExternalIdWithHttpInfo) | **GET** /transactions/external_tx_id/{externalTxId} | Find a specific transaction by external transaction ID
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#getTransactions) | **GET** /transactions | List transaction history
*TransactionsApi* | [**getTransactionsWithHttpInfo**](docs/TransactionsApi.md#getTransactionsWithHttpInfo) | **GET** /transactions | List transaction history
*TransactionsApi* | [**setConfirmationThresholdByTransactionHash**](docs/TransactionsApi.md#setConfirmationThresholdByTransactionHash) | **POST** /txHash/{txHash}/set_confirmation_threshold | Set confirmation threshold by transaction hash
*TransactionsApi* | [**setConfirmationThresholdByTransactionHashWithHttpInfo**](docs/TransactionsApi.md#setConfirmationThresholdByTransactionHashWithHttpInfo) | **POST** /txHash/{txHash}/set_confirmation_threshold | Set confirmation threshold by transaction hash
*TransactionsApi* | [**setTransactionConfirmationThreshold**](docs/TransactionsApi.md#setTransactionConfirmationThreshold) | **POST** /transactions/{txId}/set_confirmation_threshold | Set confirmation threshold by transaction ID
*TransactionsApi* | [**setTransactionConfirmationThresholdWithHttpInfo**](docs/TransactionsApi.md#setTransactionConfirmationThresholdWithHttpInfo) | **POST** /transactions/{txId}/set_confirmation_threshold | Set confirmation threshold by transaction ID
*TransactionsApi* | [**unfreezeTransaction**](docs/TransactionsApi.md#unfreezeTransaction) | **POST** /transactions/{txId}/unfreeze | Unfreeze a transaction
*TransactionsApi* | [**unfreezeTransactionWithHttpInfo**](docs/TransactionsApi.md#unfreezeTransactionWithHttpInfo) | **POST** /transactions/{txId}/unfreeze | Unfreeze a transaction
*TransactionsApi* | [**validateAddress**](docs/TransactionsApi.md#validateAddress) | **GET** /transactions/validate_address/{assetId}/{address} | Validate destination address
*TransactionsApi* | [**validateAddressWithHttpInfo**](docs/TransactionsApi.md#validateAddressWithHttpInfo) | **GET** /transactions/validate_address/{assetId}/{address} | Validate destination address
*TravelRuleBetaApi* | [**getVASPByDID**](docs/TravelRuleBetaApi.md#getVASPByDID) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details
*TravelRuleBetaApi* | [**getVASPByDIDWithHttpInfo**](docs/TravelRuleBetaApi.md#getVASPByDIDWithHttpInfo) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details
*TravelRuleBetaApi* | [**getVASPs**](docs/TravelRuleBetaApi.md#getVASPs) | **GET** /screening/travel_rule/vasp | Get All VASPs
*TravelRuleBetaApi* | [**getVASPsWithHttpInfo**](docs/TravelRuleBetaApi.md#getVASPsWithHttpInfo) | **GET** /screening/travel_rule/vasp | Get All VASPs
*TravelRuleBetaApi* | [**updateVasp**](docs/TravelRuleBetaApi.md#updateVasp) | **PUT** /screening/travel_rule/vasp/update | Add jsonDidKey to VASP details
*TravelRuleBetaApi* | [**updateVaspWithHttpInfo**](docs/TravelRuleBetaApi.md#updateVaspWithHttpInfo) | **PUT** /screening/travel_rule/vasp/update | Add jsonDidKey to VASP details
*TravelRuleBetaApi* | [**validateFullTravelRuleTransaction**](docs/TravelRuleBetaApi.md#validateFullTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction
*TravelRuleBetaApi* | [**validateFullTravelRuleTransactionWithHttpInfo**](docs/TravelRuleBetaApi.md#validateFullTravelRuleTransactionWithHttpInfo) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction
*TravelRuleBetaApi* | [**validateTravelRuleTransaction**](docs/TravelRuleBetaApi.md#validateTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate | Validate Travel Rule Transaction
*TravelRuleBetaApi* | [**validateTravelRuleTransactionWithHttpInfo**](docs/TravelRuleBetaApi.md#validateTravelRuleTransactionWithHttpInfo) | **POST** /screening/travel_rule/transaction/validate | Validate Travel Rule Transaction
*UserGroupsBetaApi* | [**createUserGroup**](docs/UserGroupsBetaApi.md#createUserGroup) | **POST** /management/user_groups | Create user group
*UserGroupsBetaApi* | [**createUserGroupWithHttpInfo**](docs/UserGroupsBetaApi.md#createUserGroupWithHttpInfo) | **POST** /management/user_groups | Create user group
*UserGroupsBetaApi* | [**deleteUserGroup**](docs/UserGroupsBetaApi.md#deleteUserGroup) | **DELETE** /management/user_groups/{groupId} | Delete user group
*UserGroupsBetaApi* | [**deleteUserGroupWithHttpInfo**](docs/UserGroupsBetaApi.md#deleteUserGroupWithHttpInfo) | **DELETE** /management/user_groups/{groupId} | Delete user group
*UserGroupsBetaApi* | [**getUserGroup**](docs/UserGroupsBetaApi.md#getUserGroup) | **GET** /management/user_groups/{groupId} | Get user group
*UserGroupsBetaApi* | [**getUserGroupWithHttpInfo**](docs/UserGroupsBetaApi.md#getUserGroupWithHttpInfo) | **GET** /management/user_groups/{groupId} | Get user group
*UserGroupsBetaApi* | [**getUserGroups**](docs/UserGroupsBetaApi.md#getUserGroups) | **GET** /management/user_groups | List user groups
*UserGroupsBetaApi* | [**getUserGroupsWithHttpInfo**](docs/UserGroupsBetaApi.md#getUserGroupsWithHttpInfo) | **GET** /management/user_groups | List user groups
*UserGroupsBetaApi* | [**updateUserGroup**](docs/UserGroupsBetaApi.md#updateUserGroup) | **PUT** /management/user_groups/{groupId} | Update user group
*UserGroupsBetaApi* | [**updateUserGroupWithHttpInfo**](docs/UserGroupsBetaApi.md#updateUserGroupWithHttpInfo) | **PUT** /management/user_groups/{groupId} | Update user group
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | List users
*UsersApi* | [**getUsersWithHttpInfo**](docs/UsersApi.md#getUsersWithHttpInfo) | **GET** /users | List users
*VaultsApi* | [**activateAssetForVaultAccount**](docs/VaultsApi.md#activateAssetForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account
*VaultsApi* | [**activateAssetForVaultAccountWithHttpInfo**](docs/VaultsApi.md#activateAssetForVaultAccountWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account
*VaultsApi* | [**createLegacyAddress**](docs/VaultsApi.md#createLegacyAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format
*VaultsApi* | [**createLegacyAddressWithHttpInfo**](docs/VaultsApi.md#createLegacyAddressWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format
*VaultsApi* | [**createMultipleAccounts**](docs/VaultsApi.md#createMultipleAccounts) | **POST** /vault/accounts/bulk | Bulk creation of new vault accounts
*VaultsApi* | [**createMultipleAccountsWithHttpInfo**](docs/VaultsApi.md#createMultipleAccountsWithHttpInfo) | **POST** /vault/accounts/bulk | Bulk creation of new vault accounts
*VaultsApi* | [**createVaultAccount**](docs/VaultsApi.md#createVaultAccount) | **POST** /vault/accounts | Create a new vault account
*VaultsApi* | [**createVaultAccountWithHttpInfo**](docs/VaultsApi.md#createVaultAccountWithHttpInfo) | **POST** /vault/accounts | Create a new vault account
*VaultsApi* | [**createVaultAccountAsset**](docs/VaultsApi.md#createVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet
*VaultsApi* | [**createVaultAccountAssetWithHttpInfo**](docs/VaultsApi.md#createVaultAccountAssetWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet
*VaultsApi* | [**createVaultAccountAssetAddress**](docs/VaultsApi.md#createVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address
*VaultsApi* | [**createVaultAccountAssetAddressWithHttpInfo**](docs/VaultsApi.md#createVaultAccountAssetAddressWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address
*VaultsApi* | [**getAssetWallets**](docs/VaultsApi.md#getAssetWallets) | **GET** /vault/asset_wallets | List asset wallets (Paginated)
*VaultsApi* | [**getAssetWalletsWithHttpInfo**](docs/VaultsApi.md#getAssetWalletsWithHttpInfo) | **GET** /vault/asset_wallets | List asset wallets (Paginated)
*VaultsApi* | [**getMaxSpendableAmount**](docs/VaultsApi.md#getMaxSpendableAmount) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount | Get the maximum spendable amount in a single transaction.
*VaultsApi* | [**getMaxSpendableAmountWithHttpInfo**](docs/VaultsApi.md#getMaxSpendableAmountWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/max_spendable_amount | Get the maximum spendable amount in a single transaction.
*VaultsApi* | [**getPagedVaultAccounts**](docs/VaultsApi.md#getPagedVaultAccounts) | **GET** /vault/accounts_paged | List vault accounts (Paginated)
*VaultsApi* | [**getPagedVaultAccountsWithHttpInfo**](docs/VaultsApi.md#getPagedVaultAccountsWithHttpInfo) | **GET** /vault/accounts_paged | List vault accounts (Paginated)
*VaultsApi* | [**getPublicKeyInfo**](docs/VaultsApi.md#getPublicKeyInfo) | **GET** /vault/public_key_info | Get the public key information
*VaultsApi* | [**getPublicKeyInfoWithHttpInfo**](docs/VaultsApi.md#getPublicKeyInfoWithHttpInfo) | **GET** /vault/public_key_info | Get the public key information
*VaultsApi* | [**getPublicKeyInfoForAddress**](docs/VaultsApi.md#getPublicKeyInfoForAddress) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key for a vault account
*VaultsApi* | [**getPublicKeyInfoForAddressWithHttpInfo**](docs/VaultsApi.md#getPublicKeyInfoForAddressWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/{change}/{addressIndex}/public_key_info | Get the public key for a vault account
*VaultsApi* | [**getUnspentInputs**](docs/VaultsApi.md#getUnspentInputs) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs | Get UTXO unspent inputs information
*VaultsApi* | [**getUnspentInputsWithHttpInfo**](docs/VaultsApi.md#getUnspentInputsWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/unspent_inputs | Get UTXO unspent inputs information
*VaultsApi* | [**getVaultAccount**](docs/VaultsApi.md#getVaultAccount) | **GET** /vault/accounts/{vaultAccountId} | Find a vault account by ID
*VaultsApi* | [**getVaultAccountWithHttpInfo**](docs/VaultsApi.md#getVaultAccountWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId} | Find a vault account by ID
*VaultsApi* | [**getVaultAccountAsset**](docs/VaultsApi.md#getVaultAccountAsset) | **GET** /vault/accounts/{vaultAccountId}/{assetId} | Get the asset balance for a vault account
*VaultsApi* | [**getVaultAccountAssetWithHttpInfo**](docs/VaultsApi.md#getVaultAccountAssetWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId} | Get the asset balance for a vault account
*VaultsApi* | [**getVaultAccountAssetAddresses**](docs/VaultsApi.md#getVaultAccountAssetAddresses) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Get asset addresses
*VaultsApi* | [**getVaultAccountAssetAddressesWithHttpInfo**](docs/VaultsApi.md#getVaultAccountAssetAddressesWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Get asset addresses
*VaultsApi* | [**getVaultAccountAssetAddressesPaginated**](docs/VaultsApi.md#getVaultAccountAssetAddressesPaginated) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated | List addresses (Paginated)
*VaultsApi* | [**getVaultAccountAssetAddressesPaginatedWithHttpInfo**](docs/VaultsApi.md#getVaultAccountAssetAddressesPaginatedWithHttpInfo) | **GET** /vault/accounts/{vaultAccountId}/{assetId}/addresses_paginated | List addresses (Paginated)
*VaultsApi* | [**getVaultAccounts**](docs/VaultsApi.md#getVaultAccounts) | **GET** /vault/accounts | List vault accounts
*VaultsApi* | [**getVaultAccountsWithHttpInfo**](docs/VaultsApi.md#getVaultAccountsWithHttpInfo) | **GET** /vault/accounts | List vault accounts
*VaultsApi* | [**getVaultAssets**](docs/VaultsApi.md#getVaultAssets) | **GET** /vault/assets | Get asset balance for chosen assets
*VaultsApi* | [**getVaultAssetsWithHttpInfo**](docs/VaultsApi.md#getVaultAssetsWithHttpInfo) | **GET** /vault/assets | Get asset balance for chosen assets
*VaultsApi* | [**getVaultBalanceByAsset**](docs/VaultsApi.md#getVaultBalanceByAsset) | **GET** /vault/assets/{assetId} | Get vault balance by asset
*VaultsApi* | [**getVaultBalanceByAssetWithHttpInfo**](docs/VaultsApi.md#getVaultBalanceByAssetWithHttpInfo) | **GET** /vault/assets/{assetId} | Get vault balance by asset
*VaultsApi* | [**hideVaultAccount**](docs/VaultsApi.md#hideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/hide | Hide a vault account in the console
*VaultsApi* | [**hideVaultAccountWithHttpInfo**](docs/VaultsApi.md#hideVaultAccountWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/hide | Hide a vault account in the console
*VaultsApi* | [**setCustomerRefIdForAddress**](docs/VaultsApi.md#setCustomerRefIdForAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id | Assign AML customer reference ID
*VaultsApi* | [**setCustomerRefIdForAddressWithHttpInfo**](docs/VaultsApi.md#setCustomerRefIdForAddressWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/set_customer_ref_id | Assign AML customer reference ID
*VaultsApi* | [**setVaultAccountAutoFuel**](docs/VaultsApi.md#setVaultAccountAutoFuel) | **POST** /vault/accounts/{vaultAccountId}/set_auto_fuel | Turn autofueling on or off
*VaultsApi* | [**setVaultAccountAutoFuelWithHttpInfo**](docs/VaultsApi.md#setVaultAccountAutoFuelWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/set_auto_fuel | Turn autofueling on or off
*VaultsApi* | [**setVaultAccountCustomerRefId**](docs/VaultsApi.md#setVaultAccountCustomerRefId) | **POST** /vault/accounts/{vaultAccountId}/set_customer_ref_id | Set an AML/KYT customer reference ID for a vault account
*VaultsApi* | [**setVaultAccountCustomerRefIdWithHttpInfo**](docs/VaultsApi.md#setVaultAccountCustomerRefIdWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/set_customer_ref_id | Set an AML/KYT customer reference ID for a vault account
*VaultsApi* | [**unhideVaultAccount**](docs/VaultsApi.md#unhideVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/unhide | Unhide a vault account in the console
*VaultsApi* | [**unhideVaultAccountWithHttpInfo**](docs/VaultsApi.md#unhideVaultAccountWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/unhide | Unhide a vault account in the console
*VaultsApi* | [**updateVaultAccount**](docs/VaultsApi.md#updateVaultAccount) | **PUT** /vault/accounts/{vaultAccountId} | Rename a vault account
*VaultsApi* | [**updateVaultAccountWithHttpInfo**](docs/VaultsApi.md#updateVaultAccountWithHttpInfo) | **PUT** /vault/accounts/{vaultAccountId} | Rename a vault account
*VaultsApi* | [**updateVaultAccountAssetAddress**](docs/VaultsApi.md#updateVaultAccountAssetAddress) | **PUT** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId} | Update address description
*VaultsApi* | [**updateVaultAccountAssetAddressWithHttpInfo**](docs/VaultsApi.md#updateVaultAccountAssetAddressWithHttpInfo) | **PUT** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId} | Update address description
*VaultsApi* | [**updateVaultAccountAssetBalance**](docs/VaultsApi.md#updateVaultAccountAssetBalance) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/balance | Refresh asset balance data
*VaultsApi* | [**updateVaultAccountAssetBalanceWithHttpInfo**](docs/VaultsApi.md#updateVaultAccountAssetBalanceWithHttpInfo) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/balance | Refresh asset balance data
*Web3ConnectionsApi* | [**create**](docs/Web3ConnectionsApi.md#create) | **POST** /connections/wc | Create a new Web3 connection.
*Web3ConnectionsApi* | [**createWithHttpInfo**](docs/Web3ConnectionsApi.md#createWithHttpInfo) | **POST** /connections/wc | Create a new Web3 connection.
*Web3ConnectionsApi* | [**get**](docs/Web3ConnectionsApi.md#get) | **GET** /connections | List all open Web3 connections.
*Web3ConnectionsApi* | [**getWithHttpInfo**](docs/Web3ConnectionsApi.md#getWithHttpInfo) | **GET** /connections | List all open Web3 connections.
*Web3ConnectionsApi* | [**remove**](docs/Web3ConnectionsApi.md#remove) | **DELETE** /connections/wc/{id} | Remove an existing Web3 connection.
*Web3ConnectionsApi* | [**removeWithHttpInfo**](docs/Web3ConnectionsApi.md#removeWithHttpInfo) | **DELETE** /connections/wc/{id} | Remove an existing Web3 connection.
*Web3ConnectionsApi* | [**submit**](docs/Web3ConnectionsApi.md#submit) | **PUT** /connections/wc/{id} | Respond to a pending Web3 connection request.
*Web3ConnectionsApi* | [**submitWithHttpInfo**](docs/Web3ConnectionsApi.md#submitWithHttpInfo) | **PUT** /connections/wc/{id} | Respond to a pending Web3 connection request.
*WebhooksApi* | [**resendTransactionWebhooks**](docs/WebhooksApi.md#resendTransactionWebhooks) | **POST** /webhooks/resend/{txId} | Resend failed webhooks for a transaction by ID
*WebhooksApi* | [**resendTransactionWebhooksWithHttpInfo**](docs/WebhooksApi.md#resendTransactionWebhooksWithHttpInfo) | **POST** /webhooks/resend/{txId} | Resend failed webhooks for a transaction by ID
*WebhooksApi* | [**resendWebhooks**](docs/WebhooksApi.md#resendWebhooks) | **POST** /webhooks/resend | Resend failed webhooks
*WebhooksApi* | [**resendWebhooksWithHttpInfo**](docs/WebhooksApi.md#resendWebhooksWithHttpInfo) | **POST** /webhooks/resend | Resend failed webhooks
*WhitelistIpAddressesApi* | [**getWhitelistIpAddresses**](docs/WhitelistIpAddressesApi.md#getWhitelistIpAddresses) | **GET** /management/api_users/{userId}/whitelist_ip_addresses | gets ip addresses
*WhitelistIpAddressesApi* | [**getWhitelistIpAddressesWithHttpInfo**](docs/WhitelistIpAddressesApi.md#getWhitelistIpAddressesWithHttpInfo) | **GET** /management/api_users/{userId}/whitelist_ip_addresses | gets ip addresses
*WorkspaceApi* | [**freezeWorkspace**](docs/WorkspaceApi.md#freezeWorkspace) | **POST** /workspace/freeze | Freeze Workspace
*WorkspaceApi* | [**freezeWorkspaceWithHttpInfo**](docs/WorkspaceApi.md#freezeWorkspaceWithHttpInfo) | **POST** /workspace/freeze | Freeze Workspace
*WorkspaceStatusBetaApi* | [**getWorkspaceStatus**](docs/WorkspaceStatusBetaApi.md#getWorkspaceStatus) | **GET** /management/workspace_status | Returns current workspace status
*WorkspaceStatusBetaApi* | [**getWorkspaceStatusWithHttpInfo**](docs/WorkspaceStatusBetaApi.md#getWorkspaceStatusWithHttpInfo) | **GET** /management/workspace_status | Returns current workspace status


## Documentation for Models

 - [AddAssetToExternalWalletRequest](docs/AddAssetToExternalWalletRequest.md)
 - [AddAssetToExternalWalletRequestOneOf](docs/AddAssetToExternalWalletRequestOneOf.md)
 - [AddAssetToExternalWalletRequestOneOf1](docs/AddAssetToExternalWalletRequestOneOf1.md)
 - [AddAssetToExternalWalletRequestOneOf1AdditionalInfo](docs/AddAssetToExternalWalletRequestOneOf1AdditionalInfo.md)
 - [AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf](docs/AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf.md)
 - [AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf1](docs/AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf1.md)
 - [AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf2](docs/AddAssetToExternalWalletRequestOneOf1AdditionalInfoOneOf2.md)
 - [AddCollateralRequestBody](docs/AddCollateralRequestBody.md)
 - [AddContractAssetRequest](docs/AddContractAssetRequest.md)
 - [AdditionalInfoDto](docs/AdditionalInfoDto.md)
 - [AmlRegistrationResult](docs/AmlRegistrationResult.md)
 - [AmlScreeningResult](docs/AmlScreeningResult.md)
 - [AmountAggregationTimePeriodMethod](docs/AmountAggregationTimePeriodMethod.md)
 - [AmountAndChainDescriptor](docs/AmountAndChainDescriptor.md)
 - [AmountInfo](docs/AmountInfo.md)
 - [AssetTypeResponse](docs/AssetTypeResponse.md)
 - [AssetWallet](docs/AssetWallet.md)
 - [AuthorizationGroups](docs/AuthorizationGroups.md)
 - [AuthorizationInfo](docs/AuthorizationInfo.md)
 - [BlockInfo](docs/BlockInfo.md)
 - [CancelTransactionResponse](docs/CancelTransactionResponse.md)
 - [ChainInfoResponseDto](docs/ChainInfoResponseDto.md)
 - [CollectionOwnershipResponse](docs/CollectionOwnershipResponse.md)
 - [ComplianceResult](docs/ComplianceResult.md)
 - [ComplianceScreeningResult](docs/ComplianceScreeningResult.md)
 - [ConfigChangeRequestStatus](docs/ConfigChangeRequestStatus.md)
 - [ConvertAssetsRequest](docs/ConvertAssetsRequest.md)
 - [CreateAPIUser](docs/CreateAPIUser.md)
 - [CreateAddressRequest](docs/CreateAddressRequest.md)
 - [CreateAddressResponse](docs/CreateAddressResponse.md)
 - [CreateAssetsBulkRequest](docs/CreateAssetsBulkRequest.md)
 - [CreateAssetsRequest](docs/CreateAssetsRequest.md)
 - [CreateConnectionRequest](docs/CreateConnectionRequest.md)
 - [CreateConnectionResponse](docs/CreateConnectionResponse.md)
 - [CreateConsoleUser](docs/CreateConsoleUser.md)
 - [CreateContractRequest](docs/CreateContractRequest.md)
 - [CreateInternalTransferRequest](docs/CreateInternalTransferRequest.md)
 - [CreateInternalWalletAssetRequest](docs/CreateInternalWalletAssetRequest.md)
 - [CreateMultipleAccountsRequest](docs/CreateMultipleAccountsRequest.md)
 - [CreateNcwConnectionRequest](docs/CreateNcwConnectionRequest.md)
 - [CreateNetworkIdRequest](docs/CreateNetworkIdRequest.md)
 - [CreatePayoutRequest](docs/CreatePayoutRequest.md)
 - [CreateRequest](docs/CreateRequest.md)
 - [CreateTransactionResponse](docs/CreateTransactionResponse.md)
 - [CreateUserGroupResponse](docs/CreateUserGroupResponse.md)
 - [CreateVaultAccountRequest](docs/CreateVaultAccountRequest.md)
 - [CreateVaultAssetResponse](docs/CreateVaultAssetResponse.md)
 - [CreateWalletRequest](docs/CreateWalletRequest.md)
 - [CustomCryptoRoutingDest](docs/CustomCryptoRoutingDest.md)
 - [CustomFiatRoutingDest](docs/CustomFiatRoutingDest.md)
 - [DefaultNetworkRoutingDest](docs/DefaultNetworkRoutingDest.md)
 - [DelegationDto](docs/DelegationDto.md)
 - [DelegationSummaryDto](docs/DelegationSummaryDto.md)
 - [DestinationTransferPeerPath](docs/DestinationTransferPeerPath.md)
 - [DestinationTransferPeerPathResponse](docs/DestinationTransferPeerPathResponse.md)
 - [DispatchPayoutResponse](docs/DispatchPayoutResponse.md)
 - [DraftResponse](docs/DraftResponse.md)
 - [DraftReviewAndValidationResponse](docs/DraftReviewAndValidationResponse.md)
 - [DropTransactionRequest](docs/DropTransactionRequest.md)
 - [DropTransactionResponse](docs/DropTransactionResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorResponseError](docs/ErrorResponseError.md)
 - [ErrorSchema](docs/ErrorSchema.md)
 - [EstimatedNetworkFeeResponse](docs/EstimatedNetworkFeeResponse.md)
 - [EstimatedTransactionFeeResponse](docs/EstimatedTransactionFeeResponse.md)
 - [ExchangeAccount](docs/ExchangeAccount.md)
 - [ExchangeAccountsPaged](docs/ExchangeAccountsPaged.md)
 - [ExchangeAccountsPagedPaging](docs/ExchangeAccountsPagedPaging.md)
 - [ExchangeAsset](docs/ExchangeAsset.md)
 - [ExchangeSettlementTransactionsResponse](docs/ExchangeSettlementTransactionsResponse.md)
 - [ExchangeTradingAccount](docs/ExchangeTradingAccount.md)
 - [ExchangeType](docs/ExchangeType.md)
 - [ExecuteActionRequest](docs/ExecuteActionRequest.md)
 - [ExecuteActionResponse](docs/ExecuteActionResponse.md)
 - [ExternalWalletAsset](docs/ExternalWalletAsset.md)
 - [FeeInfo](docs/FeeInfo.md)
 - [FiatAccount](docs/FiatAccount.md)
 - [FiatAccountType](docs/FiatAccountType.md)
 - [FiatAsset](docs/FiatAsset.md)
 - [FreezeTransactionResponse](docs/FreezeTransactionResponse.md)
 - [Funds](docs/Funds.md)
 - [GasStationConfiguration](docs/GasStationConfiguration.md)
 - [GasStationPropertiesResponse](docs/GasStationPropertiesResponse.md)
 - [GetAuditLogsResponseDTO](docs/GetAuditLogsResponseDTO.md)
 - [GetConnectionsResponse](docs/GetConnectionsResponse.md)
 - [GetFilterParameter](docs/GetFilterParameter.md)
 - [GetOtaStatus200Response](docs/GetOtaStatus200Response.md)
 - [GetOwnershipTokens200Response](docs/GetOwnershipTokens200Response.md)
 - [GetTransactionOperation](docs/GetTransactionOperation.md)
 - [GetUsersResponse](docs/GetUsersResponse.md)
 - [GetWorkspaceStatus200Response](docs/GetWorkspaceStatus200Response.md)
 - [InstructionAmount](docs/InstructionAmount.md)
 - [Job](docs/Job.md)
 - [JobCreated](docs/JobCreated.md)
 - [ListOwnedCollections200Response](docs/ListOwnedCollections200Response.md)
 - [ListOwnedTokens200Response](docs/ListOwnedTokens200Response.md)
 - [MediaEntityResponse](docs/MediaEntityResponse.md)
 - [NetworkChannel](docs/NetworkChannel.md)
 - [NetworkConnection](docs/NetworkConnection.md)
 - [NetworkConnectionResponse](docs/NetworkConnectionResponse.md)
 - [NetworkConnectionRoutingPolicy](docs/NetworkConnectionRoutingPolicy.md)
 - [NetworkConnectionRoutingPolicyCrypto](docs/NetworkConnectionRoutingPolicyCrypto.md)
 - [NetworkConnectionRoutingPolicySen](docs/NetworkConnectionRoutingPolicySen.md)
 - [NetworkConnectionRoutingPolicySenTest](docs/NetworkConnectionRoutingPolicySenTest.md)
 - [NetworkConnectionRoutingPolicySignet](docs/NetworkConnectionRoutingPolicySignet.md)
 - [NetworkConnectionRoutingPolicySignetTest](docs/NetworkConnectionRoutingPolicySignetTest.md)
 - [NetworkFee](docs/NetworkFee.md)
 - [NetworkId](docs/NetworkId.md)
 - [NetworkIdResponse](docs/NetworkIdResponse.md)
 - [NetworkIdRoutingPolicy](docs/NetworkIdRoutingPolicy.md)
 - [NetworkIdRoutingPolicyCrypto](docs/NetworkIdRoutingPolicyCrypto.md)
 - [NetworkIdRoutingPolicySen](docs/NetworkIdRoutingPolicySen.md)
 - [NetworkIdRoutingPolicySenTest](docs/NetworkIdRoutingPolicySenTest.md)
 - [NetworkRecord](docs/NetworkRecord.md)
 - [NoneNetworkRoutingDest](docs/NoneNetworkRoutingDest.md)
 - [OneTimeAddress](docs/OneTimeAddress.md)
 - [PaginatedAddressResponse](docs/PaginatedAddressResponse.md)
 - [PaginatedAddressResponsePaging](docs/PaginatedAddressResponsePaging.md)
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
 - [PolicyRuleAmount](docs/PolicyRuleAmount.md)
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
 - [PolicyRules](docs/PolicyRules.md)
 - [PolicySrcOrDestSubType](docs/PolicySrcOrDestSubType.md)
 - [PolicySrcOrDestType](docs/PolicySrcOrDestType.md)
 - [PolicyStatus](docs/PolicyStatus.md)
 - [PolicyValidation](docs/PolicyValidation.md)
 - [ProviderDto](docs/ProviderDto.md)
 - [PublicKeyInformation](docs/PublicKeyInformation.md)
 - [PublishDraftRequest](docs/PublishDraftRequest.md)
 - [PublishResult](docs/PublishResult.md)
 - [RelatedTransactionDto](docs/RelatedTransactionDto.md)
 - [RemoveCollateralRequestBody](docs/RemoveCollateralRequestBody.md)
 - [ResendTransactionWebhooksRequest](docs/ResendTransactionWebhooksRequest.md)
 - [ResendWebhooksResponse](docs/ResendWebhooksResponse.md)
 - [RespondToConnectionRequest](docs/RespondToConnectionRequest.md)
 - [RewardInfo](docs/RewardInfo.md)
 - [RewardsInfo](docs/RewardsInfo.md)
 - [ScreeningConfigurationsRequest](docs/ScreeningConfigurationsRequest.md)
 - [ScreeningPolicyResponse](docs/ScreeningPolicyResponse.md)
 - [ScreeningProviderRulesConfigurationResponse](docs/ScreeningProviderRulesConfigurationResponse.md)
 - [ScreeningUpdateConfigurationsRequest](docs/ScreeningUpdateConfigurationsRequest.md)
 - [SessionDTO](docs/SessionDTO.md)
 - [SessionMetadata](docs/SessionMetadata.md)
 - [SetAdminQuorumThresholdRequest](docs/SetAdminQuorumThresholdRequest.md)
 - [SetAutoFuelRequest](docs/SetAutoFuelRequest.md)
 - [SetConfirmationsThresholdRequest](docs/SetConfirmationsThresholdRequest.md)
 - [SetConfirmationsThresholdResponse](docs/SetConfirmationsThresholdResponse.md)
 - [SetCustomerRefIdForAddressRequest](docs/SetCustomerRefIdForAddressRequest.md)
 - [SetCustomerRefIdRequest](docs/SetCustomerRefIdRequest.md)
 - [SetNetworkIdDiscoverabilityRequest](docs/SetNetworkIdDiscoverabilityRequest.md)
 - [SetNetworkIdNameRequest](docs/SetNetworkIdNameRequest.md)
 - [SetNetworkIdResponse](docs/SetNetworkIdResponse.md)
 - [SetNetworkIdRoutingPolicyRequest](docs/SetNetworkIdRoutingPolicyRequest.md)
 - [SetOtaStatusRequest](docs/SetOtaStatusRequest.md)
 - [SetRoutingPolicy200Response](docs/SetRoutingPolicy200Response.md)
 - [SetRoutingPolicyRequest](docs/SetRoutingPolicyRequest.md)
 - [SettlementRequestBody](docs/SettlementRequestBody.md)
 - [SettlementResponse](docs/SettlementResponse.md)
 - [SignedMessage](docs/SignedMessage.md)
 - [SignedMessageSignature](docs/SignedMessageSignature.md)
 - [SmartTransferBadRequestResponse](docs/SmartTransferBadRequestResponse.md)
 - [SmartTransferCreateTicket](docs/SmartTransferCreateTicket.md)
 - [SmartTransferCreateTicketTerm](docs/SmartTransferCreateTicketTerm.md)
 - [SmartTransferForbiddenResponse](docs/SmartTransferForbiddenResponse.md)
 - [SmartTransferFundTerm](docs/SmartTransferFundTerm.md)
 - [SmartTransferManuallyFundTerm](docs/SmartTransferManuallyFundTerm.md)
 - [SmartTransferNotFoundResponse](docs/SmartTransferNotFoundResponse.md)
 - [SmartTransferSetTicketExpiration](docs/SmartTransferSetTicketExpiration.md)
 - [SmartTransferSetTicketExternalId](docs/SmartTransferSetTicketExternalId.md)
 - [SmartTransferSetUserGroups](docs/SmartTransferSetUserGroups.md)
 - [SmartTransferSubmitTicket](docs/SmartTransferSubmitTicket.md)
 - [SmartTransferTicket](docs/SmartTransferTicket.md)
 - [SmartTransferTicketFilteredResponse](docs/SmartTransferTicketFilteredResponse.md)
 - [SmartTransferTicketResponse](docs/SmartTransferTicketResponse.md)
 - [SmartTransferTicketTerm](docs/SmartTransferTicketTerm.md)
 - [SmartTransferTicketTermResponse](docs/SmartTransferTicketTermResponse.md)
 - [SmartTransferUpdateTicketTerm](docs/SmartTransferUpdateTicketTerm.md)
 - [SmartTransferUserGroups](docs/SmartTransferUserGroups.md)
 - [SmartTransferUserGroupsResponse](docs/SmartTransferUserGroupsResponse.md)
 - [SolanaBlockchainDataDto](docs/SolanaBlockchainDataDto.md)
 - [SourceTransferPeerPathResponse](docs/SourceTransferPeerPathResponse.md)
 - [SpamOwnershipResponse](docs/SpamOwnershipResponse.md)
 - [SpamTokenResponse](docs/SpamTokenResponse.md)
 - [SrcOrDestAttributesInner](docs/SrcOrDestAttributesInner.md)
 - [StakeRequestDto](docs/StakeRequestDto.md)
 - [StakeResponseDto](docs/StakeResponseDto.md)
 - [SystemMessageInfo](docs/SystemMessageInfo.md)
 - [Task](docs/Task.md)
 - [ThirdPartyRouting](docs/ThirdPartyRouting.md)
 - [ToCollateralTransaction](docs/ToCollateralTransaction.md)
 - [ToExchangeTransaction](docs/ToExchangeTransaction.md)
 - [TokenCollectionResponse](docs/TokenCollectionResponse.md)
 - [TokenOwnershipResponse](docs/TokenOwnershipResponse.md)
 - [TokenOwnershipSpamUpdatePayload](docs/TokenOwnershipSpamUpdatePayload.md)
 - [TokenOwnershipStatusUpdatePayload](docs/TokenOwnershipStatusUpdatePayload.md)
 - [TokenResponse](docs/TokenResponse.md)
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
 - [TravelRuleCreateTransactionRequest](docs/TravelRuleCreateTransactionRequest.md)
 - [TravelRuleGetAllVASPsResponse](docs/TravelRuleGetAllVASPsResponse.md)
 - [TravelRuleIssuer](docs/TravelRuleIssuer.md)
 - [TravelRuleIssuers](docs/TravelRuleIssuers.md)
 - [TravelRuleOwnershipProof](docs/TravelRuleOwnershipProof.md)
 - [TravelRulePiiIVMS](docs/TravelRulePiiIVMS.md)
 - [TravelRulePolicyRuleResponse](docs/TravelRulePolicyRuleResponse.md)
 - [TravelRuleTransactionBlockchainInfo](docs/TravelRuleTransactionBlockchainInfo.md)
 - [TravelRuleUpdateVASPDetails](docs/TravelRuleUpdateVASPDetails.md)
 - [TravelRuleVASP](docs/TravelRuleVASP.md)
 - [TravelRuleValidateFullTransactionRequest](docs/TravelRuleValidateFullTransactionRequest.md)
 - [TravelRuleValidateTransactionRequest](docs/TravelRuleValidateTransactionRequest.md)
 - [TravelRuleValidateTransactionResponse](docs/TravelRuleValidateTransactionResponse.md)
 - [UnfreezeTransactionResponse](docs/UnfreezeTransactionResponse.md)
 - [UnmanagedWallet](docs/UnmanagedWallet.md)
 - [UnspentInput](docs/UnspentInput.md)
 - [UnspentInputsResponse](docs/UnspentInputsResponse.md)
 - [UnstakeRequestDto](docs/UnstakeRequestDto.md)
 - [UpdateTokenOwnershipStatusDto](docs/UpdateTokenOwnershipStatusDto.md)
 - [UpdateVaultAccountAssetAddressRequest](docs/UpdateVaultAccountAssetAddressRequest.md)
 - [UpdateVaultAccountRequest](docs/UpdateVaultAccountRequest.md)
 - [UserGroupCreateRequest](docs/UserGroupCreateRequest.md)
 - [UserGroupCreateResponse](docs/UserGroupCreateResponse.md)
 - [UserGroupResponse](docs/UserGroupResponse.md)
 - [UserGroupUpdateRequest](docs/UserGroupUpdateRequest.md)
 - [UserResponse](docs/UserResponse.md)
 - [ValidateAddressResponse](docs/ValidateAddressResponse.md)
 - [ValidatorDto](docs/ValidatorDto.md)
 - [VaultAccount](docs/VaultAccount.md)
 - [VaultAccountsPagedResponse](docs/VaultAccountsPagedResponse.md)
 - [VaultAccountsPagedResponsePaging](docs/VaultAccountsPagedResponsePaging.md)
 - [VaultAsset](docs/VaultAsset.md)
 - [VaultWalletAddress](docs/VaultWalletAddress.md)
 - [WalletAsset](docs/WalletAsset.md)
 - [WalletAssetAdditionalInfo](docs/WalletAssetAdditionalInfo.md)
 - [WithdrawRequestDto](docs/WithdrawRequestDto.md)


## Author

support@fireblocks.com

