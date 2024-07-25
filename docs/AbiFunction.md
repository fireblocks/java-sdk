

# AbiFunction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the contract function as it appears in the ABI |  [optional] |
|**stateMutability** | [**StateMutabilityEnum**](#StateMutabilityEnum) | The state mutability of the contract function as it appears in the ABI |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the function |  |
|**inputs** | [**List&lt;Parameter&gt;**](Parameter.md) | The parameters that this function/constructor posses |  |
|**outputs** | [**List&lt;Parameter&gt;**](Parameter.md) | The parameters that this &#39;read&#39; function returns |  [optional] |
|**description** | **String** | The documentation of this function (if has any) |  [optional] |



## Enum: StateMutabilityEnum

| Name | Value |
|---- | -----|
| PURE | &quot;pure&quot; |
| VIEW | &quot;view&quot; |
| NONPAYABLE | &quot;nonpayable&quot; |
| PAYABLE | &quot;payable&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONSTRUCTOR | &quot;constructor&quot; |
| FUNCTION | &quot;function&quot; |
| ERROR | &quot;error&quot; |
| EVENT | &quot;event&quot; |
| RECEIVE | &quot;receive&quot; |
| FALLBACK | &quot;fallback&quot; |



