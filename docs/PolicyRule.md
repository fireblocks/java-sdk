

# PolicyRule

V2 Policy rule which is enforced on transactions

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the policy rule |  |
|**id** | **String** | Unique identifier for the policy rule |  |
|**policyEngineVersion** | [**PolicyEngineVersionEnum**](#PolicyEngineVersionEnum) | Policy engine version |  |
|**type** | **PolicyType** |  |  |
|**subType** | **PolicyType** |  |  [optional] |
|**initiator** | [**InitiatorConfigPattern**](InitiatorConfigPattern.md) |  |  |
|**asset** | [**AssetConfig**](AssetConfig.md) |  |  |
|**source** | [**AccountConfig**](AccountConfig.md) |  |  |
|**destination** | [**DestinationConfig**](DestinationConfig.md) |  |  [optional] |
|**account** | [**AccountConfig**](AccountConfig.md) |  |  [optional] |
|**verdict** | [**VerdictConfig**](VerdictConfig.md) |  |  |
|**amountOverTime** | [**AmountOverTimeConfig**](AmountOverTimeConfig.md) |  |  [optional] |
|**amount** | [**AmountRange**](AmountRange.md) |  |  [optional] |
|**externalDescriptor** | **String** | External descriptor for the rule |  [optional] |
|**method** | [**ContractMethodPattern**](ContractMethodPattern.md) |  |  [optional] |
|**isGlobalPolicy** | **Boolean** | Whether this is a global policy |  [optional] |
|**programCall** | [**ProgramCallConfig**](ProgramCallConfig.md) |  |  [optional] |
|**screeningMetadata** | [**ScreeningMetadataConfig**](ScreeningMetadataConfig.md) |  |  [optional] |
|**quoteAsset** | [**AssetConfig**](AssetConfig.md) |  |  [optional] |
|**baseAsset** | [**AssetConfig**](AssetConfig.md) |  |  [optional] |
|**quoteAmount** | [**AmountRange**](AmountRange.md) |  |  [optional] |
|**baseAmount** | [**AmountRange**](AmountRange.md) |  |  [optional] |
|**derivationPath** | [**DerivationPathConfig**](DerivationPathConfig.md) |  |  [optional] |
|**index** | **BigDecimal** | Index for the policy rule |  [optional] |



## Enum: PolicyEngineVersionEnum

| Name | Value |
|---- | -----|
| V2 | &quot;v2&quot; |



