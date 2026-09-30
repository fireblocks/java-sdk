

# CantonCallDetails

A call made through the Canton calls endpoint. Written once and never changed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** | The shape of this block. Stamped at creation and never changed, so a reader always knows which version it is holding. |  [optional] |
|**domain** | **CantonDomainEnum** |  |  [optional] |
|**type** | **String** | The call type, matching the &#x60;type&#x60; sent when the call was created. |  [optional] |
|**vendor** | **CantonVendorEnum** |  |  [optional] |
|**originalTransactionId** | **String** | The transaction this call acts on. On a withdraw it is the allocation that was withdrawn, so the withdraw transaction read on its own still says what it withdrew. |  [optional] |



