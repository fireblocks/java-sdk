

# DestinationConfig

Destination configuration for policy rules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **List&lt;AccountType2&gt;** | Destination account types |  [optional] |
|**subType** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) |  |  [optional] |
|**ids** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) |  |  [optional] |
|**tags** | [**List&lt;PolicyTag&gt;**](PolicyTag.md) | Tags for destination matching |  [optional] |
|**operator** | **PolicyOperator** |  |  |
|**matchFrom** | [**MatchFromEnum**](#MatchFromEnum) | Whether to match from account or source (relevant only for ORDER policy type). If set to ACCOUNT, only matchFrom is allowed and other fields are not required. |  [optional] |
|**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) | Type of destination addresses allowed |  |



## Enum: MatchFromEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;ACCOUNT&quot; |
| SOURCE | &quot;SOURCE&quot; |



## Enum: AddressTypeEnum

| Name | Value |
|---- | -----|
| STAR | &quot;*&quot; |
| WHITELISTED | &quot;WHITELISTED&quot; |
| ONE_TIME | &quot;ONE_TIME&quot; |



