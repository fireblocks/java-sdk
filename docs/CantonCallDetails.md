

# CantonCallDetails

A call made through the Canton calls endpoint. Written once and never changed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** | The shape of this block. Stamped at creation and never changed, so a reader always knows which version it is holding. |  [optional] |
|**domain** | **CantonDomainEnum** |  |  [optional] |
|**type** | **String** | The call type, matching the &#x60;type&#x60; sent when the call was created. Transactions created before a type moved to the offers endpoint keep the value they were written with — &#x60;ALLOCATION_WITHDRAW&#x60; is one; new withdraws are offer responses. |  [optional] |
|**vendor** | **CantonVendorEnum** |  |  [optional] |
|**originalTransactionId** | **String** | The transaction this call acts on, where it acts on one. |  [optional] |



