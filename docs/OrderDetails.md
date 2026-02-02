

# OrderDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**via** | [**AccessType**](AccessType.md) |  |  |
|**status** | **OrderStatus** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**receipt** | [**TransferReceipt**](TransferReceipt.md) |  |  [optional] |
|**generalFees** | [**List&lt;Fee&gt;**](Fee.md) |  |  [optional] |
|**executionSteps** | [**List&lt;OrderExecutionStep&gt;**](OrderExecutionStep.md) |  |  |
|**executionResponseDetails** | [**ExecutionResponseDetails**](ExecutionResponseDetails.md) |  |  |
|**settlement** | [**Settlement**](Settlement.md) |  |  |
|**participantsIdentification** | [**ParticipantsIdentification**](ParticipantsIdentification.md) |  |  [optional] |
|**paymentInstructions** | [**List&lt;PaymentInstructions&gt;**](PaymentInstructions.md) | Payment instructions for the order, the client can use one of these to pay the order. |  [optional] |
|**createdBy** | **String** | The ID of the user who created the order |  |
|**customerInternalReferenceId** | **String** | Internal reference ID for the customer |  [optional] |
|**note** | **String** | Optional note for the Order |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  [optional] |
|**failure** | [**Failure**](Failure.md) |  |  [optional] |



