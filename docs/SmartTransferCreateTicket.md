

# SmartTransferCreateTicket


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdByNetworkId** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**expiresIn** | **BigDecimal** | Number of hours after which an OPEN ticket will expire if no term is funded. |  [optional] |
|**terms** | [**List&lt;SmartTransferCreateTicketTerm&gt;**](SmartTransferCreateTicketTerm.md) |  |  [optional] |
|**externalRefId** | **String** |  |  [optional] |
|**note** | **String** |  |  [optional] |
|**submit** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ASYNC | &quot;ASYNC&quot; |
| DVP | &quot;DVP&quot; |



