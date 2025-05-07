

# GetDeployableAddressRequest

Request body for calculating deterministic address

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainDescriptor** | **String** | The base asset identifier of the blockchain (legacyId) to calculate deterministic address |  |
|**templateId** | **UUID** | The template identifier |  |
|**initParams** | [**List&lt;ParameterWithValue&gt;**](ParameterWithValue.md) | The deploy function parameters and values of the contract template |  |
|**salt** | **String** | The salt to calculate the deterministic address. Must be a number between 0 and 2^256 -1, for it to fit in the bytes32 parameter |  |



