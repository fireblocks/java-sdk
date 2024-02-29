

# SessionDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id of the connection |  |
|**userId** | **String** | Id of the user that created the connection |  |
|**sessionMetadata** | [**SessionMetadata**](SessionMetadata.md) |  |  |
|**vaultAccountId** | **BigDecimal** | The vault to connect |  |
|**feeLevel** | [**FeeLevelEnum**](#FeeLevelEnum) | The default fee level |  |
|**chainIds** | **List&lt;String&gt;** | The chains approved for the connection |  |
|**connectionType** | [**ConnectionTypeEnum**](#ConnectionTypeEnum) | The connection&#39;s type |  |
|**connectionMethod** | [**ConnectionMethodEnum**](#ConnectionMethodEnum) | The method through which the connection was established |  |
|**creationDate** | **OffsetDateTime** | Timestamp of the session&#39;s creation |  |



## Enum: FeeLevelEnum

| Name | Value |
|---- | -----|
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



## Enum: ConnectionTypeEnum

| Name | Value |
|---- | -----|
| WALLETCONNECT | &quot;WalletConnect&quot; |



## Enum: ConnectionMethodEnum

| Name | Value |
|---- | -----|
| DESKTOP | &quot;DESKTOP&quot; |
| MOBILE | &quot;MOBILE&quot; |
| API | &quot;API&quot; |



