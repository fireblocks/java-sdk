

# ParameterWithValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the parameter as it appears in the ABI |  |
|**description** | **String** | A description of the parameter, fetched from the devdoc of this contract |  [optional] |
|**internalType** | **String** | The  internal type of the parameter as it appears in the ABI |  [optional] |
|**type** | **String** | The type of the parameter as it appears in the ABI |  |
|**components** | [**List&lt;Parameter&gt;**](Parameter.md) |  |  [optional] |
|**value** | **Object** | The value of the parameter. The shape follows the ABI &#x60;type&#x60;: a string for &#x60;string&#x60;/&#x60;address&#x60;/&#x60;bytes*&#x60;, a number for &#x60;uint*&#x60;/&#x60;int*&#x60;, a boolean for &#x60;bool&#x60;, an array for &#x60;T[]&#x60;, and for &#x60;tuple&#x60; an array of nested ParameterWithValue objects (one per entry in &#x60;components&#x60;, in ABI order). |  [optional] |
|**functionValue** | [**LeanAbiFunction**](LeanAbiFunction.md) | The function value of this param (if has one). If this is set, the &#x60;value&#x60; shouldn&#x60;t be. Used for proxies |  [optional] |



