

# PolicyRule

Policy rule which is enforced on transactions

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | **String** | (deprecated - replaced by \&quot;operators\&quot;)  | Defines users who can initiate the type of transaction to which the rule applies. options are * \&quot;*\&quot; - All users are allowed * Specific User id |  [optional] |
|**operators** | [**PolicyRuleOperators**](PolicyRuleOperators.md) |  |  [optional] |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Defines the type of transaction to which the rule applies.   * TRANSFER - Default. Transfers funds from one account to another   * CONTRACT_CALL - Calls a smart contract, mainly for DeFi operations.   * APPROVE - Allows a smart contract to withdraw from a designated wallet.   * MINT - Perform a mint operation (increase supply) on a supported token   * BURN - Perform a burn operation (reduce supply) on a supported token   * SUPPLY - Use for DeFi to lend assets   * REDEEM - Use for DeFi to get lending back   * STAKE - Allows you to allocate and lock certain assets for earning staking rewards.   * RAW - An off-chain message with no predefined format, use it to sign any message with your private key.   * TYPED_MESSAGE - An off-chain message type that follows a predefined format, used to sign specific messages that are not actual transactions.   * PROGRAM_CALL - In Solana refers to invoking on-chain programs (smart contracts) to execute transactions and interact with the blockchain.  |  [optional] |
|**designatedSigner** | **String** | (deprecated - replaced by \&quot;designatedSigners\&quot;) Id representing the user who signs transactions that match a specific rule |  [optional] |
|**designatedSigners** | [**PolicyRuleDesignatedSigners**](PolicyRuleDesignatedSigners.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Policy rule type |  |
|**action** | [**ActionEnum**](#ActionEnum) | Defines what occurs when a transaction meets the rule&#39;s criteria * ALLOW - The transaction goes through and can be signed without requiring additional approvals * BLOCK - The transaction is automatically blocked * 2-TIER - Only these users or user groups can approve             If any of them reject the transaction before the required approval threshold is met, the transaction doesn&#39;t go through            The list of entities are set is \&quot;authorizationGroups\&quot; field  |  |
|**asset** | **String** | Defines the type of asset being transacted, options are * \&quot;*\&quot; - All assets * Specific asset  |  |
|**srcType** | **PolicySrcOrDestType** | (deprecated - replaced by &quot;src&quot;) source account type |  [optional] |
|**srcSubType** | **PolicySrcOrDestSubType** | (deprecated - replaced by &quot;src&quot;) source sub account type |  [optional] |
|**srcId** | **String** | (deprecated - replaced by &quot;src&quot;) source account id |  [optional] |
|**src** | [**PolicyRuleSrc**](PolicyRuleSrc.md) |  |  [optional] |
|**dstType** | **PolicySrcOrDestType** | (deprecated - replaced by &quot;dst&quot;) destination account type |  [optional] |
|**dstSubType** | **PolicySrcOrDestSubType** | (deprecated - replaced by &quot;dst&quot;) destination sub account type |  [optional] |
|**dstId** | **String** | (deprecated - replaced by &quot;dst&quot;) destination account id |  [optional] |
|**dst** | [**PolicyRuleDst**](PolicyRuleDst.md) |  |  [optional] |
|**dstAddressType** | [**DstAddressTypeEnum**](#DstAddressTypeEnum) | Defines whether the destination to which you are sending funds must be whitelisted, to allow one-time transfers to non-whitelisted external addresses, or both. By default, you can only transfer to an external address after it’s whitelisted.   * WHITELISTED - Can only be sent to whitelisted addresses.   * ONE_TIME - Can only be sent to non-whitelisted external addresses.   * \&quot;*\&quot; - can be sent to whitelisted addresses or non-whitelisted external  |  [optional] |
|**amountCurrency** | [**AmountCurrencyEnum**](#AmountCurrencyEnum) | * USD - Limits the amount of any asset users can transfer based on the USD equivalent of the asset. * EUR - Limits the amount of any asset users can transfer based on the EURO equivalent of the asset. * NATIVE - Limits the amount of an asset a user can transfer when using a specific asset.  |  |
|**amountScope** | [**AmountScopeEnum**](#AmountScopeEnum) | * SINGLE_TX - limit applies to a single transaction * TIMEFRAME - limit applies to all transactions within the defined time period  |  |
|**amount** | [**PolicyRuleAmount**](PolicyRuleAmount.md) |  |  |
|**periodSec** | **BigDecimal** | Time period in seconds applied by the amountScope field to accumulate transferred amounts in transactions that match the rule, until the total exceeds the value you specify under Minimum. When the specified amount is reached within that period, whether by one or many transactions, further transactions in that period either fail or require more approvals.  |  |
|**authorizers** | **List&lt;String&gt;** | (deprecated - replaced by \&quot;authorizationGroups\&quot;) Allowed entities which can approves a transaction |  [optional] |
|**authorizersCount** | **BigDecimal** | (deprecated - replaced by \&quot;authorizationGroups\&quot;) Min amount of entities which are needed to approve a transaction |  [optional] |
|**authorizationGroups** | [**PolicyRuleAuthorizationGroups**](PolicyRuleAuthorizationGroups.md) |  |  [optional] |
|**amountAggregation** | [**PolicyRuleAmountAggregation**](PolicyRuleAmountAggregation.md) |  |  [optional] |
|**rawMessageSigning** | [**PolicyRuleRawMessageSigning**](PolicyRuleRawMessageSigning.md) |  |  [optional] |
|**applyForApprove** | **Boolean** | Applying this rule over APPROVE type transactions (can only be enabled when rule&#39;s transaction type is TRANSFER) |  [optional] |
|**applyForTypedMessage** | **Boolean** | Applying this rule over TYPED_MESSAGE type transactions (can only be enabled when rule&#39;s transaction type is CONTRACT_CALL) |  [optional] |
|**externalDescriptor** | **String** | A unique id identifying the rule |  [optional] |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| TRANSFER | &quot;TRANSFER&quot; |
| CONTRACT_CALL | &quot;CONTRACT_CALL&quot; |
| APPROVE | &quot;APPROVE&quot; |
| MINT | &quot;MINT&quot; |
| BURN | &quot;BURN&quot; |
| SUPPLY | &quot;SUPPLY&quot; |
| REDEEM | &quot;REDEEM&quot; |
| STAKE | &quot;STAKE&quot; |
| RAW | &quot;RAW&quot; |
| TYPED_MESSAGE | &quot;TYPED_MESSAGE&quot; |
| PROGRAM_CALL | &quot;PROGRAM_CALL&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TRANSFER | &quot;TRANSFER&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ALLOW | &quot;ALLOW&quot; |
| BLOCK | &quot;BLOCK&quot; |
| _2_TIER | &quot;2-TIER&quot; |



## Enum: DstAddressTypeEnum

| Name | Value |
|---- | -----|
| WHITELISTED | &quot;WHITELISTED&quot; |
| ONE_TIME | &quot;ONE_TIME&quot; |
| STAR | &quot;*&quot; |



## Enum: AmountCurrencyEnum

| Name | Value |
|---- | -----|
| USD | &quot;USD&quot; |
| EUR | &quot;EUR&quot; |
| NATIVE | &quot;NATIVE&quot; |



## Enum: AmountScopeEnum

| Name | Value |
|---- | -----|
| SINGLE_TX | &quot;SINGLE_TX&quot; |
| TIMEFRAME | &quot;TIMEFRAME&quot; |



