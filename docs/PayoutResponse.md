

# PayoutResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **String** |  |  |
|**paymentAccount** | [**PaymentAccountResponse**](PaymentAccountResponse.md) |  |  |
|**createdAt** | **BigDecimal** |  |  |
|**state** | **PayoutState** |  |  |
|**status** | **PayoutStatus** |  |  |
|**reasonOfFailure** | **String** | - INSUFFICIENT_BALANCE - SOURCE_TRANSLATION - SOURCE_NOT_UNIQUE - SOURCE_NOT_FOUND - SOURCE_TYPE_NOT_SUPPORTED - EMPTY_SOURCE - DESTINATION_TRANSLATION - DESTINATION_NOT_UNIQUE - DESTINATION_NOT_FOUND - EMPTY_DESTINATION - PARSING - UNKNOWN - FIREBLOCKS_CLIENT - TRANSACTION_SUBMISSION  |  [optional] |
|**initMethod** | **PayoutInitMethod** |  |  [optional] |
|**instructionSet** | [**List&lt;PayoutInstructionResponse&gt;**](PayoutInstructionResponse.md) |  |  |
|**reportUrl** | **String** |  |  [optional] |



