

# ParameterWithValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the parameter as it appears in the ABI |  |
|**description** | **String** | A description of the parameter, fetched from the devdoc of this contract |  [optional] |
|**internalType** | **String** | The  internal type of the parameter as it appears in the ABI |  [optional] |
|**type** | **String** | The type of the parameter as it appears in the ABI |  |
|**components** | [**List&lt;Parameter&gt;**](Parameter.md) |  |  [optional] |
|**value** | **String** | The value of the parameter. can also be ParameterWithValue |  [optional] |
|**functionValue** | [**LeanAbiFunction**](LeanAbiFunction.md) | The function value of this param (if has one). If this is set, the &#x60;value&#x60; shouldn&#x60;t be. Used for proxies |  [optional] |



