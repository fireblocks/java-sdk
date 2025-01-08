

# Cosigner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archived** | **Boolean** | Whether the cosigner is archived |  |
|**id** | **UUID** | The unique identifier of the cosigner |  |
|**name** | **String** | The name of the cosigner |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the cosigner |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SANDBOX | &quot;SANDBOX&quot; |
| SGX | &quot;SGX&quot; |
| GCP_CONFSPACE | &quot;GCP-CONFSPACE&quot; |
| AWS_NITRO | &quot;AWS-NITRO&quot; |
| PLAIN | &quot;PLAIN&quot; |



