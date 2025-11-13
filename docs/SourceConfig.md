

# SourceConfig

Source account configuration for policy rules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **List&lt;AccountType2&gt;** | Source account types |  [optional] |
|**subType** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) | Source account subtypes |  [optional] |
|**ids** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) | Source account identifiers |  [optional] |
|**tags** | [**List&lt;PolicyTag&gt;**](PolicyTag.md) | Tags for source matching |  [optional] |
|**operator** | **PolicyOperator** |  |  |
|**matchFrom** | [**MatchFromEnum**](#MatchFromEnum) | Whether to match from account (relevant only for ORDER policy type) |  [optional] |



## Enum: MatchFromEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;ACCOUNT&quot; |



