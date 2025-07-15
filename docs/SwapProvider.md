

# SwapProvider


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The uuid that identifies the provider |  |
|**name** | **String** | Name of the provider |  |
|**protocols** | **List&lt;SwapProviderProtocolsEnum&gt;** | List of supported protocols. Protocols are specific per provider |  |
|**category** | **ProviderCategoryEnum** |  |  |
|**isTermsApprovalRequired** | **Boolean** | Indicates whether the terms of service are required for the provider. if &#x60;true&#x60;, the user must approve the terms of service before using the provider. otherwise, &#x60;termsOfServiceUrl&#x60; and &#x60;isTermsOfServiceApproved&#x60; are not shown under the provider data. |  |
|**termsOfServiceUrl** | **String** | URL to the terms of service |  [optional] |
|**isTermsOfServiceApproved** | **Boolean** | Indicates whether the terms of service are approved by the user |  [optional] |



