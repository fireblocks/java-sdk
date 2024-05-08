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
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.fireblocks.sdk:fireblocks-sdk:2.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/fireblocks-sdk-2.0.0.jar`
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
*AuditLogsApi* | [**getAudits**](docs/AuditLogsApi.md#getAudits) | **GET** /audits | Get audit logs
*BlockchainsAssetsApi* | [**getSupportedAssets**](docs/BlockchainsAssetsApi.md#getSupportedAssets) | **GET** /supported_assets | List all asset types supported by Fireblocks
*BlockchainsAssetsApi* | [**registerNewAsset**](docs/BlockchainsAssetsApi.md#registerNewAsset) | **POST** /assets | Register an asset
*ComplianceApi* | [**getAmlPostScreeningPolicy**](docs/ComplianceApi.md#getAmlPostScreeningPolicy) | **GET** /screening/aml/post_screening_policy | AML - View Post-Screening Policy
*ComplianceApi* | [**getAmlScreeningPolicy**](docs/ComplianceApi.md#getAmlScreeningPolicy) | **GET** /screening/aml/screening_policy | AML - View Screening Policy
*ComplianceApi* | [**getPostScreeningPolicy**](docs/ComplianceApi.md#getPostScreeningPolicy) | **GET** /screening/travel_rule/post_screening_policy | Travel Rule - View Post-Screening Policy
*ComplianceApi* | [**getScreeningPolicy**](docs/ComplianceApi.md#getScreeningPolicy) | **GET** /screening/travel_rule/screening_policy | Travel Rule - View Screening Policy
*ComplianceApi* | [**updateAmlScreeningConfiguration**](docs/ComplianceApi.md#updateAmlScreeningConfiguration) | **PUT** /screening/aml/policy_configuration | Update AML Configuration
*ComplianceApi* | [**updateScreeningConfiguration**](docs/ComplianceApi.md#updateScreeningConfiguration) | **PUT** /screening/configurations | Tenant - Screening Configuration
*ComplianceApi* | [**updateTravelRuleConfig**](docs/ComplianceApi.md#updateTravelRuleConfig) | **PUT** /screening/travel_rule/policy_configuration | Update Travel Rule Configuration
*ComplianceScreeningConfigurationApi* | [**getAmlScreeningConfiguration**](docs/ComplianceScreeningConfigurationApi.md#getAmlScreeningConfiguration) | **GET** /screening/aml/policy_configuration | Get AML Screening Policy Configuration
*ComplianceScreeningConfigurationApi* | [**getScreeningConfiguration**](docs/ComplianceScreeningConfigurationApi.md#getScreeningConfiguration) | **GET** /screening/travel_rule/policy_configuration | Get Travel Rule Screening Policy Configuration
*ConsoleUserApi* | [**createConsoleUser**](docs/ConsoleUserApi.md#createConsoleUser) | **POST** /management/users | Create console user
*ConsoleUserApi* | [**getConsoleUsers**](docs/ConsoleUserApi.md#getConsoleUsers) | **GET** /management/users | Get console users
*ContractInteractionsApi* | [**getDeployedContractAbi**](docs/ContractInteractionsApi.md#getDeployedContractAbi) | **GET** /contract_interactions/base_asset_id/{assetId}/contract_address/{contractAddress}/functions | Return deployed contract&#39;s ABI
*ContractInteractionsApi* | [**readCallFunction**](docs/ContractInteractionsApi.md#readCallFunction) | **POST** /contract_interactions/base_asset_id/{assetId}/contract_address/{contractAddress}/functions/read | Call a read function on a deployed contract
*ContractInteractionsApi* | [**writeCallFunction**](docs/ContractInteractionsApi.md#writeCallFunction) | **POST** /contract_interactions/base_asset_id/{assetId}/contract_address/{contractAddress}/functions/write | Call a write function on a deployed contract
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
*CosignersBetaApi* | [**getApiKey**](docs/CosignersBetaApi.md#getApiKey) | **GET** /cosigners/{cosignerId}/api_keys/{apiKeyId} | Get API key
*CosignersBetaApi* | [**getApiKeys**](docs/CosignersBetaApi.md#getApiKeys) | **GET** /cosigners/{cosignerId}/api_keys | Get all API keys
*CosignersBetaApi* | [**getCosigner**](docs/CosignersBetaApi.md#getCosigner) | **GET** /cosigners/{cosignerId} | Get cosigner
*CosignersBetaApi* | [**getCosigners**](docs/CosignersBetaApi.md#getCosigners) | **GET** /cosigners | Get all cosigners
*CosignersBetaApi* | [**renameCosigner**](docs/CosignersBetaApi.md#renameCosigner) | **PATCH** /cosigners/{cosignerId} | Rename cosigner
*DeployedContractsApi* | [**getDeployedContractByAddress**](docs/DeployedContractsApi.md#getDeployedContractByAddress) | **GET** /tokenization/contracts/{assetId}/{contractAddress} | Return deployed contract data
*DeployedContractsApi* | [**getDeployedContractById**](docs/DeployedContractsApi.md#getDeployedContractById) | **GET** /tokenization/contracts/{id} | Return deployed contract data by id
*DeployedContractsApi* | [**getDeployedContracts**](docs/DeployedContractsApi.md#getDeployedContracts) | **GET** /tokenization/contracts | List deployed contracts data
*ExchangeAccountsApi* | [**convertAssets**](docs/ExchangeAccountsApi.md#convertAssets) | **POST** /exchange_accounts/{exchangeAccountId}/convert | Convert exchange account funds from the source asset to the destination asset.
*ExchangeAccountsApi* | [**getExchangeAccount**](docs/ExchangeAccountsApi.md#getExchangeAccount) | **GET** /exchange_accounts/{exchangeAccountId} | Find a specific exchange account
*ExchangeAccountsApi* | [**getExchangeAccountAsset**](docs/ExchangeAccountsApi.md#getExchangeAccountAsset) | **GET** /exchange_accounts/{exchangeAccountId}/{assetId} | Find an asset for an exchange account
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
*InternalWalletsApi* | [**deleteInternalWalletAsset**](docs/InternalWalletsApi.md#deleteInternalWalletAsset) | **DELETE** /internal_wallets/{walletId}/{assetId} | Delete a whitelisted address from an internal wallet
*InternalWalletsApi* | [**getInternalWallet**](docs/InternalWalletsApi.md#getInternalWallet) | **GET** /internal_wallets/{walletId} | Get assets for internal wallet
*InternalWalletsApi* | [**getInternalWalletAsset**](docs/InternalWalletsApi.md#getInternalWalletAsset) | **GET** /internal_wallets/{walletId}/{assetId} | Get an asset from an internal wallet
*InternalWalletsApi* | [**getInternalWallets**](docs/InternalWalletsApi.md#getInternalWallets) | **GET** /internal_wallets | List internal wallets
*InternalWalletsApi* | [**setCustomerRefIdForInternalWallet**](docs/InternalWalletsApi.md#setCustomerRefIdForInternalWallet) | **POST** /internal_wallets/{walletId}/set_customer_ref_id | Set an AML/KYT customer reference ID for an internal wallet
*JobManagementApi* | [**cancelJob**](docs/JobManagementApi.md#cancelJob) | **POST** /batch/{jobId}/cancel | Cancel a running job
*JobManagementApi* | [**continueJob**](docs/JobManagementApi.md#continueJob) | **POST** /batch/{jobId}/continue | Continue a paused job
*JobManagementApi* | [**getJob**](docs/JobManagementApi.md#getJob) | **GET** /batch/{jobId} | Get job details
*JobManagementApi* | [**getJobTasks**](docs/JobManagementApi.md#getJobTasks) | **GET** /batch/{jobId}/tasks | Return a list of tasks for given job
*JobManagementApi* | [**getJobs**](docs/JobManagementApi.md#getJobs) | **GET** /batch/jobs | Return a list of jobs belonging to tenant
*JobManagementApi* | [**pauseJob**](docs/JobManagementApi.md#pauseJob) | **POST** /batch/{jobId}/pause | Pause a job
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
*PolicyEditorBetaApi* | [**getActivePolicy**](docs/PolicyEditorBetaApi.md#getActivePolicy) | **GET** /tap/active_policy | Get the active policy and its validation
*PolicyEditorBetaApi* | [**getDraft**](docs/PolicyEditorBetaApi.md#getDraft) | **GET** /tap/draft | Get the active draft
*PolicyEditorBetaApi* | [**publishDraft**](docs/PolicyEditorBetaApi.md#publishDraft) | **POST** /tap/draft | Send publish request for a certain draft id
*PolicyEditorBetaApi* | [**publishPolicyRules**](docs/PolicyEditorBetaApi.md#publishPolicyRules) | **POST** /tap/publish | Send publish request for a set of policy rules
*PolicyEditorBetaApi* | [**updateDraft**](docs/PolicyEditorBetaApi.md#updateDraft) | **PUT** /tap/draft | Update the draft with a new set of rules
*ResetDeviceApi* | [**resetDevice**](docs/ResetDeviceApi.md#resetDevice) | **POST** /management/users/{id}/reset_device | Resets device
*SmartTransferApi* | [**cancelTicket**](docs/SmartTransferApi.md#cancelTicket) | **PUT** /smart-transfers/{ticketId}/cancel | Cancel Ticket
*SmartTransferApi* | [**createTicket**](docs/SmartTransferApi.md#createTicket) | **POST** /smart-transfers | Create Ticket
*SmartTransferApi* | [**createTicketTerm**](docs/SmartTransferApi.md#createTicketTerm) | **POST** /smart-transfers/{ticketId}/terms | Create leg (term)
*SmartTransferApi* | [**findTicketById**](docs/SmartTransferApi.md#findTicketById) | **GET** /smart-transfers/{ticketId} | Search Tickets by ID
*SmartTransferApi* | [**findTicketTermById**](docs/SmartTransferApi.md#findTicketTermById) | **GET** /smart-transfers/{ticketId}/terms/{termId} | Search ticket by leg (term) ID
*SmartTransferApi* | [**fulfillTicket**](docs/SmartTransferApi.md#fulfillTicket) | **PUT** /smart-transfers/{ticketId}/fulfill | Fund ticket manually
*SmartTransferApi* | [**fundTicketTerm**](docs/SmartTransferApi.md#fundTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/fund | Define funding source
*SmartTransferApi* | [**getSmartTransferUserGroups**](docs/SmartTransferApi.md#getSmartTransferUserGroups) | **GET** /smart-transfers/settings/user-groups | Get user group
*SmartTransferApi* | [**manuallyFundTicketTerm**](docs/SmartTransferApi.md#manuallyFundTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId}/manually-fund | Manually add term transaction
*SmartTransferApi* | [**removeTicketTerm**](docs/SmartTransferApi.md#removeTicketTerm) | **DELETE** /smart-transfers/{ticketId}/terms/{termId} | Delete ticket leg (term)
*SmartTransferApi* | [**searchTickets**](docs/SmartTransferApi.md#searchTickets) | **GET** /smart-transfers | Find Ticket
*SmartTransferApi* | [**setExternalRefId**](docs/SmartTransferApi.md#setExternalRefId) | **PUT** /smart-transfers/{ticketId}/external-id | Add external ref. ID
*SmartTransferApi* | [**setTicketExpiration**](docs/SmartTransferApi.md#setTicketExpiration) | **PUT** /smart-transfers/{ticketId}/expires-in | Set expiration
*SmartTransferApi* | [**setUserGroups**](docs/SmartTransferApi.md#setUserGroups) | **POST** /smart-transfers/settings/user-groups | Set user group
*SmartTransferApi* | [**submitTicket**](docs/SmartTransferApi.md#submitTicket) | **PUT** /smart-transfers/{ticketId}/submit | Submit ticket
*SmartTransferApi* | [**updateTicketTerm**](docs/SmartTransferApi.md#updateTicketTerm) | **PUT** /smart-transfers/{ticketId}/terms/{termId} | Update ticket leg (term)
*StakingBetaApi* | [**approveTermsOfServiceByProviderId**](docs/StakingBetaApi.md#approveTermsOfServiceByProviderId) | **POST** /staking/providers/{providerId}/approveTermsOfService | 
*StakingBetaApi* | [**executeAction**](docs/StakingBetaApi.md#executeAction) | **POST** /staking/chains/{chainDescriptor}/{actionId} | 
*StakingBetaApi* | [**getAllDelegations**](docs/StakingBetaApi.md#getAllDelegations) | **GET** /staking/positions | 
*StakingBetaApi* | [**getChainInfo**](docs/StakingBetaApi.md#getChainInfo) | **GET** /staking/chains/{chainDescriptor}/chainInfo | 
*StakingBetaApi* | [**getChains**](docs/StakingBetaApi.md#getChains) | **GET** /staking/chains | 
*StakingBetaApi* | [**getDelegationById**](docs/StakingBetaApi.md#getDelegationById) | **GET** /staking/positions/{id} | 
*StakingBetaApi* | [**getProviders**](docs/StakingBetaApi.md#getProviders) | **GET** /staking/providers | 
*StakingBetaApi* | [**getSummary**](docs/StakingBetaApi.md#getSummary) | **GET** /staking/positions/summary | 
*StakingBetaApi* | [**getSummaryByVault**](docs/StakingBetaApi.md#getSummaryByVault) | **GET** /staking/positions/summary/vaults | 
*TokenizationApi* | [**getLinkedToken**](docs/TokenizationApi.md#getLinkedToken) | **GET** /tokenization/tokens/{id} | Return a linked token
*TokenizationApi* | [**getLinkedTokens**](docs/TokenizationApi.md#getLinkedTokens) | **GET** /tokenization/tokens | List all linked tokens
*TokenizationApi* | [**issueNewToken**](docs/TokenizationApi.md#issueNewToken) | **POST** /tokenization/tokens | Issue a new token
*TokenizationApi* | [**link**](docs/TokenizationApi.md#link) | **POST** /tokenization/tokens/link | Link a token
*TokenizationApi* | [**unlink**](docs/TokenizationApi.md#unlink) | **DELETE** /tokenization/tokens/{id} | Unlink a token
*TransactionsApi* | [**cancelTransaction**](docs/TransactionsApi.md#cancelTransaction) | **POST** /transactions/{txId}/cancel | Cancel a transaction
*TransactionsApi* | [**createTransaction**](docs/TransactionsApi.md#createTransaction) | **POST** /transactions | Create a new transaction
*TransactionsApi* | [**dropTransaction**](docs/TransactionsApi.md#dropTransaction) | **POST** /transactions/{txId}/drop | Drop ETH transaction by ID
*TransactionsApi* | [**estimateNetworkFee**](docs/TransactionsApi.md#estimateNetworkFee) | **GET** /estimate_network_fee | Estimate the required fee for an asset
*TransactionsApi* | [**estimateTransactionFee**](docs/TransactionsApi.md#estimateTransactionFee) | **POST** /transactions/estimate_fee | Estimate transaction fee
*TransactionsApi* | [**freezeTransaction**](docs/TransactionsApi.md#freezeTransaction) | **POST** /transactions/{txId}/freeze | Freeze a transaction
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /transactions/{txId} | Find a specific transaction by Fireblocks transaction ID
*TransactionsApi* | [**getTransactionByExternalId**](docs/TransactionsApi.md#getTransactionByExternalId) | **GET** /transactions/external_tx_id/{externalTxId} | Find a specific transaction by external transaction ID
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#getTransactions) | **GET** /transactions | List transaction history
*TransactionsApi* | [**setConfirmationThresholdByTransactionHash**](docs/TransactionsApi.md#setConfirmationThresholdByTransactionHash) | **POST** /txHash/{txHash}/set_confirmation_threshold | Set confirmation threshold by transaction hash
*TransactionsApi* | [**setTransactionConfirmationThreshold**](docs/TransactionsApi.md#setTransactionConfirmationThreshold) | **POST** /transactions/{txId}/set_confirmation_threshold | Set confirmation threshold by transaction ID
*TransactionsApi* | [**unfreezeTransaction**](docs/TransactionsApi.md#unfreezeTransaction) | **POST** /transactions/{txId}/unfreeze | Unfreeze a transaction
*TransactionsApi* | [**validateAddress**](docs/TransactionsApi.md#validateAddress) | **GET** /transactions/validate_address/{assetId}/{address} | Validate destination address
*TravelRuleBetaApi* | [**getVASPByDID**](docs/TravelRuleBetaApi.md#getVASPByDID) | **GET** /screening/travel_rule/vasp/{did} | Get VASP details
*TravelRuleBetaApi* | [**getVASPs**](docs/TravelRuleBetaApi.md#getVASPs) | **GET** /screening/travel_rule/vasp | Get All VASPs
*TravelRuleBetaApi* | [**updateVasp**](docs/TravelRuleBetaApi.md#updateVasp) | **PUT** /screening/travel_rule/vasp/update | Add jsonDidKey to VASP details
*TravelRuleBetaApi* | [**validateFullTravelRuleTransaction**](docs/TravelRuleBetaApi.md#validateFullTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate/full | Validate Full Travel Rule Transaction
*TravelRuleBetaApi* | [**validateTravelRuleTransaction**](docs/TravelRuleBetaApi.md#validateTravelRuleTransaction) | **POST** /screening/travel_rule/transaction/validate | Validate Travel Rule Transaction
*UserGroupsBetaApi* | [**createUserGroup**](docs/UserGroupsBetaApi.md#createUserGroup) | **POST** /management/user_groups | Create user group
*UserGroupsBetaApi* | [**deleteUserGroup**](docs/UserGroupsBetaApi.md#deleteUserGroup) | **DELETE** /management/user_groups/{groupId} | Delete user group
*UserGroupsBetaApi* | [**getUserGroup**](docs/UserGroupsBetaApi.md#getUserGroup) | **GET** /management/user_groups/{groupId} | Get user group
*UserGroupsBetaApi* | [**getUserGroups**](docs/UserGroupsBetaApi.md#getUserGroups) | **GET** /management/user_groups | List user groups
*UserGroupsBetaApi* | [**updateUserGroup**](docs/UserGroupsBetaApi.md#updateUserGroup) | **PUT** /management/user_groups/{groupId} | Update user group
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | List users
*VaultsApi* | [**activateAssetForVaultAccount**](docs/VaultsApi.md#activateAssetForVaultAccount) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/activate | Activate a wallet in a vault account
*VaultsApi* | [**createLegacyAddress**](docs/VaultsApi.md#createLegacyAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses/{addressId}/create_legacy | Convert a segwit address to legacy format
*VaultsApi* | [**createMultipleAccounts**](docs/VaultsApi.md#createMultipleAccounts) | **POST** /vault/accounts/bulk | Bulk creation of new vault accounts
*VaultsApi* | [**createVaultAccount**](docs/VaultsApi.md#createVaultAccount) | **POST** /vault/accounts | Create a new vault account
*VaultsApi* | [**createVaultAccountAsset**](docs/VaultsApi.md#createVaultAccountAsset) | **POST** /vault/accounts/{vaultAccountId}/{assetId} | Create a new wallet
*VaultsApi* | [**createVaultAccountAssetAddress**](docs/VaultsApi.md#createVaultAccountAssetAddress) | **POST** /vault/accounts/{vaultAccountId}/{assetId}/addresses | Create new asset deposit address
*VaultsApi* | [**getAssetWallets**](docs/VaultsApi.md#getAssetWallets) | **GET** /vault/asset_wallets | List asset wallets (Paginated)
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
*WhitelistIpAddressesApi* | [**getWhitelistIpAddresses**](docs/WhitelistIpAddressesApi.md#getWhitelistIpAddresses) | **GET** /management/api_users/{userId}/whitelist_ip_addresses | Gets whitelisted ip addresses
*WorkspaceStatusBetaApi* | [**getWorkspaceStatus**](docs/WorkspaceStatusBetaApi.md#getWorkspaceStatus) | **GET** /management/workspace_status | Returns current workspace status


## Documentation for Models

 - [APIUser](docs/APIUser.md)
 - [AbiFunction](docs/AbiFunction.md)
 - [Account](docs/Account.md)
 - [AccountType](docs/AccountType.md)
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
 - [ApiKey](docs/ApiKey.md)
 - [ApiKeysPaginatedResponse](docs/ApiKeysPaginatedResponse.md)
 - [AssetAlreadyExistHttpError](docs/AssetAlreadyExistHttpError.md)
 - [AssetAmount](docs/AssetAmount.md)
 - [AssetBadRequestErrorResponse](docs/AssetBadRequestErrorResponse.md)
 - [AssetConflictErrorResponse](docs/AssetConflictErrorResponse.md)
 - [AssetDoesNotExistHttpError](docs/AssetDoesNotExistHttpError.md)
 - [AssetForbiddenErrorResponse](docs/AssetForbiddenErrorResponse.md)
 - [AssetInternalServerErrorResponse](docs/AssetInternalServerErrorResponse.md)
 - [AssetMetadataDto](docs/AssetMetadataDto.md)
 - [AssetNotFoundErrorResponse](docs/AssetNotFoundErrorResponse.md)
 - [AssetResponse](docs/AssetResponse.md)
 - [AssetResponseMetadata](docs/AssetResponseMetadata.md)
 - [AssetResponseOnchain](docs/AssetResponseOnchain.md)
 - [AssetTypeResponse](docs/AssetTypeResponse.md)
 - [AssetWallet](docs/AssetWallet.md)
 - [AuditLogData](docs/AuditLogData.md)
 - [AuditorData](docs/AuditorData.md)
 - [AuthorizationGroups](docs/AuthorizationGroups.md)
 - [AuthorizationInfo](docs/AuthorizationInfo.md)
 - [BlockInfo](docs/BlockInfo.md)
 - [CancelTransactionResponse](docs/CancelTransactionResponse.md)
 - [ChainInfoResponseDto](docs/ChainInfoResponseDto.md)
 - [CollectionMetadataDto](docs/CollectionMetadataDto.md)
 - [CollectionOwnershipResponse](docs/CollectionOwnershipResponse.md)
 - [ComplianceResult](docs/ComplianceResult.md)
 - [ComplianceScreeningResult](docs/ComplianceScreeningResult.md)
 - [ConfigChangeRequestStatus](docs/ConfigChangeRequestStatus.md)
 - [ConfigConversionOperationSnapshot](docs/ConfigConversionOperationSnapshot.md)
 - [ConfigDisbursementOperationSnapshot](docs/ConfigDisbursementOperationSnapshot.md)
 - [ConfigOperation](docs/ConfigOperation.md)
 - [ConfigOperationSnapshot](docs/ConfigOperationSnapshot.md)
 - [ConfigOperationStatus](docs/ConfigOperationStatus.md)
 - [ConfigTransferOperationSnapshot](docs/ConfigTransferOperationSnapshot.md)
 - [ConsoleUser](docs/ConsoleUser.md)
 - [ContractAbiResponseDto](docs/ContractAbiResponseDto.md)
 - [ContractAttributes](docs/ContractAttributes.md)
 - [ContractDeployRequest](docs/ContractDeployRequest.md)
 - [ContractDeployResponse](docs/ContractDeployResponse.md)
 - [ContractDoc](docs/ContractDoc.md)
 - [ContractMetadataDto](docs/ContractMetadataDto.md)
 - [ContractTemplateDto](docs/ContractTemplateDto.md)
 - [ContractUploadRequest](docs/ContractUploadRequest.md)
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
 - [CreateMultipleAccountsRequest](docs/CreateMultipleAccountsRequest.md)
 - [CreateNcwConnectionRequest](docs/CreateNcwConnectionRequest.md)
 - [CreateNetworkIdRequest](docs/CreateNetworkIdRequest.md)
 - [CreatePayoutRequest](docs/CreatePayoutRequest.md)
 - [CreateTokenRequestDto](docs/CreateTokenRequestDto.md)
 - [CreateTokenRequestDtoCreateParams](docs/CreateTokenRequestDtoCreateParams.md)
 - [CreateTransactionResponse](docs/CreateTransactionResponse.md)
 - [CreateTransferConfigOperationRequest](docs/CreateTransferConfigOperationRequest.md)
 - [CreateUserGroupResponse](docs/CreateUserGroupResponse.md)
 - [CreateVaultAccountConnectionRequest](docs/CreateVaultAccountConnectionRequest.md)
 - [CreateVaultAccountRequest](docs/CreateVaultAccountRequest.md)
 - [CreateVaultAssetResponse](docs/CreateVaultAssetResponse.md)
 - [CreateWalletRequest](docs/CreateWalletRequest.md)
 - [CreateWorkflowExecutionRequestParamsInner](docs/CreateWorkflowExecutionRequestParamsInner.md)
 - [CustomRoutingDest](docs/CustomRoutingDest.md)
 - [DefaultNetworkRoutingDest](docs/DefaultNetworkRoutingDest.md)
 - [DelegationDto](docs/DelegationDto.md)
 - [DelegationSummaryDto](docs/DelegationSummaryDto.md)
 - [DeleteNetworkConnectionResponse](docs/DeleteNetworkConnectionResponse.md)
 - [DeleteNetworkIdResponse](docs/DeleteNetworkIdResponse.md)
 - [DeployedContractResponseDto](docs/DeployedContractResponseDto.md)
 - [DeployedContractsPaginatedResponse](docs/DeployedContractsPaginatedResponse.md)
 - [DepositFundsFromLinkedDDAResponse](docs/DepositFundsFromLinkedDDAResponse.md)
 - [Destination](docs/Destination.md)
 - [DestinationTransferPeerPath](docs/DestinationTransferPeerPath.md)
 - [DestinationTransferPeerPathResponse](docs/DestinationTransferPeerPathResponse.md)
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
 - [EVMTokenCreateParamsDto](docs/EVMTokenCreateParamsDto.md)
 - [EditGasStationConfigurationResponse](docs/EditGasStationConfigurationResponse.md)
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
 - [ExecutionConversionOperation](docs/ExecutionConversionOperation.md)
 - [ExecutionDisbursementOperation](docs/ExecutionDisbursementOperation.md)
 - [ExecutionOperationStatus](docs/ExecutionOperationStatus.md)
 - [ExecutionScreeningOperation](docs/ExecutionScreeningOperation.md)
 - [ExecutionTransferOperation](docs/ExecutionTransferOperation.md)
 - [ExternalWalletAsset](docs/ExternalWalletAsset.md)
 - [FeeInfo](docs/FeeInfo.md)
 - [FiatAccount](docs/FiatAccount.md)
 - [FiatAccountType](docs/FiatAccountType.md)
 - [FiatAsset](docs/FiatAsset.md)
 - [FreezeTransactionResponse](docs/FreezeTransactionResponse.md)
 - [FunctionDoc](docs/FunctionDoc.md)
 - [Funds](docs/Funds.md)
 - [GasStationConfiguration](docs/GasStationConfiguration.md)
 - [GasStationConfigurationResponse](docs/GasStationConfigurationResponse.md)
 - [GasStationPropertiesResponse](docs/GasStationPropertiesResponse.md)
 - [GetAPIUsersResponse](docs/GetAPIUsersResponse.md)
 - [GetAuditLogsResponse](docs/GetAuditLogsResponse.md)
 - [GetAuditLogsResponseDTO](docs/GetAuditLogsResponseDTO.md)
 - [GetConnectionsResponse](docs/GetConnectionsResponse.md)
 - [GetConsoleUsersResponse](docs/GetConsoleUsersResponse.md)
 - [GetFilterParameter](docs/GetFilterParameter.md)
 - [GetMaxSpendableAmountResponse](docs/GetMaxSpendableAmountResponse.md)
 - [GetNFTsResponse](docs/GetNFTsResponse.md)
 - [GetOtaStatusResponse](docs/GetOtaStatusResponse.md)
 - [GetOwnershipTokensResponse](docs/GetOwnershipTokensResponse.md)
 - [GetTransactionOperation](docs/GetTransactionOperation.md)
 - [GetWhitelistIpAddressesResponse](docs/GetWhitelistIpAddressesResponse.md)
 - [GetWorkspaceStatusResponse](docs/GetWorkspaceStatusResponse.md)
 - [HttpContractDoesNotExistError](docs/HttpContractDoesNotExistError.md)
 - [InstructionAmount](docs/InstructionAmount.md)
 - [InternalTransferResponse](docs/InternalTransferResponse.md)
 - [Job](docs/Job.md)
 - [JobCreated](docs/JobCreated.md)
 - [LeanAbiFunction](docs/LeanAbiFunction.md)
 - [LeanContractDto](docs/LeanContractDto.md)
 - [LeanDeployedContractResponseDto](docs/LeanDeployedContractResponseDto.md)
 - [ListOwnedCollectionsResponse](docs/ListOwnedCollectionsResponse.md)
 - [ListOwnedTokensResponse](docs/ListOwnedTokensResponse.md)
 - [MediaEntityResponse](docs/MediaEntityResponse.md)
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
 - [NoneNetworkRoutingDest](docs/NoneNetworkRoutingDest.md)
 - [NotFoundException](docs/NotFoundException.md)
 - [OneTimeAddress](docs/OneTimeAddress.md)
 - [OneTimeAddressAccount](docs/OneTimeAddressAccount.md)
 - [OperationExecutionFailure](docs/OperationExecutionFailure.md)
 - [PaginatedAddressResponse](docs/PaginatedAddressResponse.md)
 - [PaginatedAddressResponsePaging](docs/PaginatedAddressResponsePaging.md)
 - [PaginatedAssetWalletResponse](docs/PaginatedAssetWalletResponse.md)
 - [PaginatedAssetWalletResponsePaging](docs/PaginatedAssetWalletResponsePaging.md)
 - [Paging](docs/Paging.md)
 - [Parameter](docs/Parameter.md)
 - [ParameterWithValue](docs/ParameterWithValue.md)
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
 - [PreScreening](docs/PreScreening.md)
 - [ProviderDto](docs/ProviderDto.md)
 - [PublicKeyInformation](docs/PublicKeyInformation.md)
 - [PublishDraftRequest](docs/PublishDraftRequest.md)
 - [PublishResult](docs/PublishResult.md)
 - [ReadAbiFunction](docs/ReadAbiFunction.md)
 - [ReadCallFunctionDto](docs/ReadCallFunctionDto.md)
 - [RedeemFundsToLinkedDDAResponse](docs/RedeemFundsToLinkedDDAResponse.md)
 - [RegisterNewAssetRequest](docs/RegisterNewAssetRequest.md)
 - [RelatedTransactionDto](docs/RelatedTransactionDto.md)
 - [RemoveCollateralRequestBody](docs/RemoveCollateralRequestBody.md)
 - [RenameCosigner](docs/RenameCosigner.md)
 - [RenameVaultAccountResponse](docs/RenameVaultAccountResponse.md)
 - [ResendTransactionWebhooksRequest](docs/ResendTransactionWebhooksRequest.md)
 - [ResendWebhooksByTransactionIdResponse](docs/ResendWebhooksByTransactionIdResponse.md)
 - [ResendWebhooksResponse](docs/ResendWebhooksResponse.md)
 - [RespondToConnectionRequest](docs/RespondToConnectionRequest.md)
 - [RewardInfo](docs/RewardInfo.md)
 - [RewardsInfo](docs/RewardsInfo.md)
 - [ScreeningConfigurationsRequest](docs/ScreeningConfigurationsRequest.md)
 - [ScreeningOperationExecution](docs/ScreeningOperationExecution.md)
 - [ScreeningOperationExecutionOutput](docs/ScreeningOperationExecutionOutput.md)
 - [ScreeningOperationFailure](docs/ScreeningOperationFailure.md)
 - [ScreeningOperationType](docs/ScreeningOperationType.md)
 - [ScreeningPolicyResponse](docs/ScreeningPolicyResponse.md)
 - [ScreeningProviderRulesConfigurationResponse](docs/ScreeningProviderRulesConfigurationResponse.md)
 - [ScreeningUpdateConfigurationsRequest](docs/ScreeningUpdateConfigurationsRequest.md)
 - [ScreeningValidationFailure](docs/ScreeningValidationFailure.md)
 - [ScreeningVerdict](docs/ScreeningVerdict.md)
 - [ScreeningVerdictMatchedRule](docs/ScreeningVerdictMatchedRule.md)
 - [SessionDTO](docs/SessionDTO.md)
 - [SessionMetadata](docs/SessionMetadata.md)
 - [SetAdminQuorumThresholdRequest](docs/SetAdminQuorumThresholdRequest.md)
 - [SetAdminQuorumThresholdResponse](docs/SetAdminQuorumThresholdResponse.md)
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
 - [SetOtaStatusResponse](docs/SetOtaStatusResponse.md)
 - [SetOtaStatusResponseOneOf](docs/SetOtaStatusResponseOneOf.md)
 - [SetRoutingPolicyRequest](docs/SetRoutingPolicyRequest.md)
 - [SetRoutingPolicyResponse](docs/SetRoutingPolicyResponse.md)
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
 - [SourceTransferPeerPath](docs/SourceTransferPeerPath.md)
 - [SourceTransferPeerPathResponse](docs/SourceTransferPeerPathResponse.md)
 - [SpamOwnershipResponse](docs/SpamOwnershipResponse.md)
 - [SpamTokenResponse](docs/SpamTokenResponse.md)
 - [SrcOrDestAttributesInner](docs/SrcOrDestAttributesInner.md)
 - [StakeRequestDto](docs/StakeRequestDto.md)
 - [StakeResponseDto](docs/StakeResponseDto.md)
 - [StellarRippleCreateParamsDto](docs/StellarRippleCreateParamsDto.md)
 - [SystemMessageInfo](docs/SystemMessageInfo.md)
 - [Task](docs/Task.md)
 - [TemplatesPaginatedResponse](docs/TemplatesPaginatedResponse.md)
 - [ThirdPartyRouting](docs/ThirdPartyRouting.md)
 - [ToCollateralTransaction](docs/ToCollateralTransaction.md)
 - [ToExchangeTransaction](docs/ToExchangeTransaction.md)
 - [TokenCollectionResponse](docs/TokenCollectionResponse.md)
 - [TokenLinkDto](docs/TokenLinkDto.md)
 - [TokenLinkDtoTokenMetadata](docs/TokenLinkDtoTokenMetadata.md)
 - [TokenLinkExistsHttpError](docs/TokenLinkExistsHttpError.md)
 - [TokenLinkRequestDto](docs/TokenLinkRequestDto.md)
 - [TokenOwnershipResponse](docs/TokenOwnershipResponse.md)
 - [TokenOwnershipSpamUpdatePayload](docs/TokenOwnershipSpamUpdatePayload.md)
 - [TokenOwnershipStatusUpdatePayload](docs/TokenOwnershipStatusUpdatePayload.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [TokensPaginatedResponse](docs/TokensPaginatedResponse.md)
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
 - [TransferValidationFailure](docs/TransferValidationFailure.md)
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
 - [UserRole](docs/UserRole.md)
 - [UserStatus](docs/UserStatus.md)
 - [UserType](docs/UserType.md)
 - [ValidateAddressResponse](docs/ValidateAddressResponse.md)
 - [ValidatorDto](docs/ValidatorDto.md)
 - [VaultAccount](docs/VaultAccount.md)
 - [VaultAccountsPagedResponse](docs/VaultAccountsPagedResponse.md)
 - [VaultAccountsPagedResponsePaging](docs/VaultAccountsPagedResponsePaging.md)
 - [VaultActionStatus](docs/VaultActionStatus.md)
 - [VaultAsset](docs/VaultAsset.md)
 - [VaultWalletAddress](docs/VaultWalletAddress.md)
 - [VendorDto](docs/VendorDto.md)
 - [WalletAsset](docs/WalletAsset.md)
 - [WalletAssetAdditionalInfo](docs/WalletAssetAdditionalInfo.md)
 - [WithdrawRequestDto](docs/WithdrawRequestDto.md)
 - [WorkflowConfigStatus](docs/WorkflowConfigStatus.md)
 - [WorkflowConfigurationId](docs/WorkflowConfigurationId.md)
 - [WorkflowExecutionOperation](docs/WorkflowExecutionOperation.md)
 - [WriteAbiFunction](docs/WriteAbiFunction.md)
 - [WriteCallFunctionDto](docs/WriteCallFunctionDto.md)
 - [WriteCallFunctionResponseDto](docs/WriteCallFunctionResponseDto.md)


## Author

support@fireblocks.com

