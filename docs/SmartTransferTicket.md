

# SmartTransferTicket

Data object with result data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique id of Smart Transfer ticket |  |
|**type** | [**TypeEnum**](#TypeEnum) | Kind of Smart Transfer. Can be either &#x60;ASYNC&#x60; or &#x60;DVP&#x60; |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Direction of Smart Transfer. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of Smart Transfer ticket |  |
|**dvpExecutionStatus** | [**DvpExecutionStatusEnum**](#DvpExecutionStatusEnum) | Current status of DVP execution |  [optional] |
|**orderCreatedByNetworkId** | **String** | ID of network profile that created order |  [optional] |
|**terms** | [**List&lt;SmartTransferTicketTerm&gt;**](SmartTransferTicketTerm.md) | Ticket terms (legs) |  [optional] |
|**expiresIn** | **BigDecimal** | Number of hours for expiration.This data is valid only it ticket not in DRAFT state and it will be used to calculate expiresAt value |  [optional] |
|**expiresAt** | **OffsetDateTime** | Date and time at which the ticket will expire if no funding is performed. |  [optional] |
|**submittedAt** | **OffsetDateTime** | Date and time when ticket is submitted. |  [optional] |
|**expiredAt** | **OffsetDateTime** | Date and time when ticket is expired. |  [optional] |
|**canceledAt** | **OffsetDateTime** | Date and time when ticket is canceled. |  [optional] |
|**fulfilledAt** | **OffsetDateTime** | Date and time when ticket is fulfilled. |  [optional] |
|**externalRefId** | **String** | External Ref ID for Smart Transfer ticket. |  [optional] |
|**note** | **String** | Note |  [optional] |
|**createdByNetworkId** | **String** | ID of network profile that created ticket |  |
|**createdByNetworkIdName** | **String** | Name of network profile that created ticket |  |
|**canceledByNetworkIdName** | **String** | Name of network profile that canceled ticket |  [optional] |
|**createdAt** | **OffsetDateTime** | Date and time at which the ticket is created. |  |
|**updatedAt** | **OffsetDateTime** | Date and time of last ticket update. |  |
|**canceledByMe** | **Boolean** |  |  [optional] |
|**createdByMe** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ASYNC | &quot;ASYNC&quot; |
| DVP | &quot;DVP&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| EXCHANGE | &quot;EXCHANGE&quot; |
| SEND | &quot;SEND&quot; |
| RECEIVE | &quot;RECEIVE&quot; |
| INTERMEDIATE | &quot;INTERMEDIATE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| PENDING_APPROVAL | &quot;PENDING_APPROVAL&quot; |
| OPEN | &quot;OPEN&quot; |
| IN_SETTLEMENT | &quot;IN_SETTLEMENT&quot; |
| FULFILLED | &quot;FULFILLED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| CANCELED | &quot;CANCELED&quot; |



## Enum: DvpExecutionStatusEnum

| Name | Value |
|---- | -----|
| STARTED | &quot;STARTED&quot; |
| CREATING_ORDER | &quot;CREATING_ORDER&quot; |
| ORDER_CREATED | &quot;ORDER_CREATED&quot; |
| FULFILLING | &quot;FULFILLING&quot; |
| FULFILLING_ORDER_FAILED | &quot;FULFILLING_ORDER_FAILED&quot; |
| CREATING_ORDER_FAILED | &quot;CREATING_ORDER_FAILED&quot; |
| FULFILLED | &quot;FULFILLED&quot; |



