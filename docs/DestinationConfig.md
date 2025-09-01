

# DestinationConfig

Destination configuration for policy rules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **AccountType2** |  |  |
|**subType** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) |  |  [optional] |
|**ids** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) |  |  [optional] |
|**operator** | **PolicyOperator** |  |  |
|**matchFrom** | [**MatchFromEnum**](#MatchFromEnum) | Whether to match from account or source |  [optional] |
|**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) | Type of destination addresses allowed |  |



## Enum: MatchFromEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;ACCOUNT&quot; |
| SOURCE | &quot;SOURCE&quot; |



## Enum: AddressTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| STAR | &quot;*&quot; |
| WHITELISTED | &quot;WHITELISTED&quot; |
| ONE_TIME | &quot;ONE_TIME&quot; |
| OEC_PARTNER | &quot;OEC_PARTNER&quot; |



