

# AccountConfig

Policy account configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **List&lt;AccountType2&gt;** | Account types |  [optional] |
|**subType** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) |  |  [optional] |
|**ids** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) |  |  [optional] |
|**tags** | [**List&lt;PolicyTag&gt;**](PolicyTag.md) | Tags for account matching |  [optional] |
|**operator** | **PolicyOperator** |  |  |
|**matchFrom** | [**MatchFromEnum**](#MatchFromEnum) | Whether to match from account or source |  [optional] |



## Enum: MatchFromEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;ACCOUNT&quot; |
| SOURCE | &quot;SOURCE&quot; |



