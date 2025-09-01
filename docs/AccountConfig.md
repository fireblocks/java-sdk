

# AccountConfig

Policy source/destination configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **AccountType2** |  |  |
|**subType** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) |  |  [optional] |
|**ids** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) |  |  [optional] |
|**operator** | **PolicyOperator** |  |  |
|**matchFrom** | [**MatchFromEnum**](#MatchFromEnum) | Whether to match from account or source |  [optional] |



## Enum: MatchFromEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;ACCOUNT&quot; |
| SOURCE | &quot;SOURCE&quot; |



