

# ScreeningMetadataConfig

Screening metadata configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | [**DirectionEnum**](#DirectionEnum) | Direction of transaction |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) | Screening provider |  [optional] |
|**riskRating** | [**RiskRatingEnum**](#RiskRatingEnum) | Risk rating threshold |  [optional] |
|**riskScore** | **String** | Risk score threshold |  [optional] |
|**exposureType** | [**ExposureTypeEnum**](#ExposureTypeEnum) | Exposure type |  [optional] |
|**category** | **List&lt;String&gt;** |  |  [optional] |
|**name** | **List&lt;String&gt;** |  |  [optional] |
|**categoryId** | **List&lt;String&gt;** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Transaction status |  [optional] |
|**sourceAddress** | **String** | Source address |  [optional] |
|**destAddress** | **String** | Destination address |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |
| ANY | &quot;ANY&quot; |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| CHAINALYSIS | &quot;CHAINALYSIS&quot; |
| CHAINALYSIS_V2 | &quot;CHAINALYSIS_V2&quot; |
| ELLIPTIC | &quot;ELLIPTIC&quot; |
| ELLIPTIC_HOLISTIC | &quot;ELLIPTIC_HOLISTIC&quot; |
| NOTABENE | &quot;NOTABENE&quot; |



## Enum: RiskRatingEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |
| SEVERE | &quot;SEVERE&quot; |
| ANY | &quot;ANY&quot; |



## Enum: ExposureTypeEnum

| Name | Value |
|---- | -----|
| DIRECT | &quot;DIRECT&quot; |
| INDIRECT | &quot;INDIRECT&quot; |
| ANY | &quot;ANY&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| PENDING | &quot;PENDING&quot; |
| REJECTED | &quot;REJECTED&quot; |
| FAILED | &quot;FAILED&quot; |
| CANCELED | &quot;CANCELED&quot; |
| BLOCKING_TIME_EXPIRED | &quot;BLOCKING_TIME_EXPIRED&quot; |



