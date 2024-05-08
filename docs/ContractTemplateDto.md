

# ContractTemplateDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of the contract template |  |
|**name** | **String** | The name of the contract template |  |
|**description** | **String** | A short description of the contract template |  |
|**longDescription** | **String** | A full description of the contract template. May contain   to break the lines |  [optional] |
|**abi** | **List&lt;List&lt;AbiFunction&gt;&gt;** |  |  |
|**attributes** | [**ContractAttributes**](ContractAttributes.md) | The attributes related to this contract template. It will be displayed in the tokenization page |  [optional] |
|**docs** | [**ContractDoc**](ContractDoc.md) | A &#x60;natspec&#x60; compliant documentation json. Can be retrieved from the output json after compilation |  [optional] |
|**owner** | **String** | The workspace id of the owner of this contract template. If it&#39;s a private contract, only this workspace will be allowed to deploy it |  [optional] |
|**vendor** | [**VendorDto**](VendorDto.md) | The details of the vendor of this contract template. Applicable only for public contract templates |  [optional] |
|**isPublic** | **Boolean** | Is this a contract that is viewable by all fireblocks&#39;s users or is it visible only for this workspace |  |
|**canDeploy** | **Boolean** | True if the workspace allowed to deploy this contract, false otherwise |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the contract template |  [optional] |
|**implementationContractId** | **String** |  |  [optional] |
|**initializationPhase** | [**InitializationPhaseEnum**](#InitializationPhaseEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNGIBLE_TOKEN | &quot;FUNGIBLE_TOKEN&quot; |
| NON_FUNGIBLE_TOKEN | &quot;NON_FUNGIBLE_TOKEN&quot; |
| NON_TOKEN | &quot;NON_TOKEN&quot; |
| TOKEN_EXTENSION | &quot;TOKEN_EXTENSION&quot; |
| TOKEN_UTILITY | &quot;TOKEN_UTILITY&quot; |



## Enum: InitializationPhaseEnum

| Name | Value |
|---- | -----|
| ON_DEPLOYMENT | &quot;ON_DEPLOYMENT&quot; |
| POST_DEPLOYMENT | &quot;POST_DEPLOYMENT&quot; |



