

# LeanAbiFunction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The function name |  [optional] |
|**inputs** | [**List&lt;ParameterWithValue&gt;**](ParameterWithValue.md) | The function inputs |  |
|**outputs** | [**List&lt;ParameterWithValue&gt;**](ParameterWithValue.md) | The function outputs |  [optional] |
|**stateMutability** | [**StateMutabilityEnum**](#StateMutabilityEnum) | The state mutability of the function (e.g., view, pure, nonpayable, payable) |  [optional] |



## Enum: StateMutabilityEnum

| Name | Value |
|---- | -----|
| VIEW | &quot;view&quot; |
| PURE | &quot;pure&quot; |
| NONPAYABLE | &quot;nonpayable&quot; |
| PAYABLE | &quot;payable&quot; |



