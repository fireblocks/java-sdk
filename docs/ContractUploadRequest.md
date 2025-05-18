

# ContractUploadRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the contract template |  |
|**description** | **String** | A short description of the contract template |  |
|**longDescription** | **String** | A full description of the contract template. May contain   to break the lines |  [optional] |
|**bytecode** | **String** | The compiled artifact of this smart contract. Used for deployment of this contract template |  |
|**sourcecode** | **String** | The source code of the contract. Optional. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the contract template |  |
|**docs** | [**ContractDoc**](ContractDoc.md) | A &#x60;natspec&#x60; compliant documentation json. Can be retrieved from the output json after compilation |  [optional] |
|**abi** | [**List&lt;AbiFunction&gt;**](AbiFunction.md) | The abi of the contract template. Necessary for displaying and for after deployment encoding |  |
|**attributes** | [**ContractAttributes**](ContractAttributes.md) | The attributes related to this contract template. It will be displayed in the tokenization page |  [optional] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | The protocol that the template will be used for |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNGIBLE_TOKEN | &quot;FUNGIBLE_TOKEN&quot; |
| NON_FUNGIBLE_TOKEN | &quot;NON_FUNGIBLE_TOKEN&quot; |
| NON_TOKEN | &quot;NON_TOKEN&quot; |
| TOKEN_EXTENSION | &quot;TOKEN_EXTENSION&quot; |
| TOKEN_UTILITY | &quot;TOKEN_UTILITY&quot; |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| ETH | &quot;ETH&quot; |
| SOL | &quot;SOL&quot; |



