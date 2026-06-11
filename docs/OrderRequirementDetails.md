

# OrderRequirementDetails

Order requirement details for an order that is awaiting compliance requirements. Returned by GET /trading/orders/{orderId}/requirement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requirementId** | **String** | Unique identifier of the order requirement request as issued by the provider. |  |
|**dueBy** | **OffsetDateTime** | ISO-8601 timestamp indicating when the order requirement submission is due. |  [optional] |
|**requiredData** | **String** | A JSON Schema (Draft-7) in string format describing the shape of the &#x60;data&#x60; object expected on the corresponding POST /trading/orders/{orderId}/requirement/data request. The schema is the contract: the client builds the &#x60;data&#x60; payload to match it, and SDKs can validate before sending. The string content is expected to be valid JSON (application/json).  |  |
|**requiredFiles** | [**List&lt;OrderRequirementFile&gt;**](OrderRequirementFile.md) | Descriptors for files the provider requires as part of the order requirement response. Empty when no files are required. Each entry&#39;s &#x60;fileKey&#x60; is used to correlate uploads on the corresponding upload request. |  |



