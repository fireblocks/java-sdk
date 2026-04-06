

# InteracAddress

When true, funds are deposited directly into the recipient's bank account without a security question.  When false, a security question and answer are required to complete the transfer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountHolder** | [**AccountHolderDetails**](AccountHolderDetails.md) |  |  |
|**recipientHandle** | [**RecipientHandle**](RecipientHandle.md) |  |  |
|**message** | **String** | The message to be sent to the recipient |  [optional] |
|**autoDeposit** | **Boolean** | Whether to automatically deposit the funds into the account |  |
|**securityQuestion** | **String** | The security question to be used for the security answer |  [optional] |
|**securityAnswer** | **String** | The security answer to be used for the security question |  [optional] |



