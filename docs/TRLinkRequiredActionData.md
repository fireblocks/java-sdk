

# TRLinkRequiredActionData

Data describing what fields are required to resolve the action. The structure varies by action type and is defined by the TRP provider.  For UPLOAD_BENEFICIARY_PII action type: Contains beneficiaryRequiredFields and/or originatorRequiredFields listing the IVMS101 field paths that must be provided. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beneficiaryRequiredFields** | [**List&lt;TRLinkRequiredField&gt;**](TRLinkRequiredField.md) | List of required beneficiary IVMS101 fields |  [optional] |
|**originatorRequiredFields** | [**List&lt;TRLinkRequiredField&gt;**](TRLinkRequiredField.md) | List of required originator IVMS101 fields |  [optional] |



