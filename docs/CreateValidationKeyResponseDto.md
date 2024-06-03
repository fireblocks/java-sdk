

# CreateValidationKeyResponseDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validationKey** | [**ValidationKeyDto**](ValidationKeyDto.md) | Created validation key |  |
|**admins** | **List&lt;String&gt;** | Admins who have to approve the validation key addition |  |
|**approvalThreshold** | **BigDecimal** | Minimal number of approvers required. 0 for all |  |
|**requestId** | **BigDecimal** | Approval request id. Can be cancelled |  |



