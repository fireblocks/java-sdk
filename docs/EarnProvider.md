

# EarnProvider


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerId** | [**ProviderIdEnum**](#ProviderIdEnum) | Stable protocol identifier (&#x60;MORPHO&#x60; or &#x60;AAVE&#x60;). |  [optional] |
|**displayName** | **String** | Human-readable protocol name for UI. |  [optional] |
|**logoUrl** | **String** | URL for the provider logo asset. |  [optional] |
|**supportedChainIds** | **List&lt;Integer&gt;** | EVM chain IDs where this provider is supported. |  [optional] |
|**isTermsApprovalRequired** | **Boolean** | Whether the user must accept terms before using this provider. |  [optional] |
|**termsOfServiceUrl** | **String** | URL to the provider terms of service, when applicable. |  [optional] |
|**isTermsOfServiceApproved** | **Boolean** | Whether terms have been approved for this workspace / context. |  [optional] |



## Enum: ProviderIdEnum

| Name | Value |
|---- | -----|
| MORPHO | &quot;MORPHO&quot; |
| AAVE | &quot;AAVE&quot; |



