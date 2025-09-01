

# SmartTransferTicketTerm

Data object with result data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique id of Smart Transfer ticket term |  |
|**ticketId** | **String** | Unique id of Smart Transfer ticket |  |
|**asset** | **String** | Asset name |  |
|**amount** | **String** | Amount |  |
|**dvpSrcDstVaultId** | **String** | Identifier of the source and destination vault for DVP execution |  [optional] |
|**amountUsd** | **String** | Amount USD |  [optional] |
|**fromNetworkId** | **String** | Identifier of the origination Network Profile |  |
|**fromNetworkIdName** | **String** | Source network name |  |
|**toNetworkId** | **String** | Identifier of the destination Network Profile |  |
|**toNetworkIdName** | **String** | Destination network name |  |
|**txHash** | **String** | Blockchain TX hash |  |
|**fbTxId** | **String** | Fireblocks transaction ID. It is set when the funding transaction is created. |  |
|**txStatus** | [**TxStatusEnum**](#TxStatusEnum) | Ticket term transaction status |  |
|**status** | [**StatusEnum**](#StatusEnum) | Ticket term status |  |
|**createdAt** | **OffsetDateTime** | Date and time when the term is created. |  |
|**updatedAt** | **OffsetDateTime** | Date and time of last term update. |  |



## Enum: TxStatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| SUBMITTED | &quot;submitted&quot; |
| PENDING_SIGNATURE | &quot;pendingSignature&quot; |
| PENDING_AUTHORIZATION | &quot;pendingAuthorization&quot; |
| BROADCASTING | &quot;broadcasting&quot; |
| CONFIRMING | &quot;confirming&quot; |
| PENDING_AML_SCREENING | &quot;pendingAmlScreening&quot; |
| COMPLETED | &quot;completed&quot; |
| CANCELLED | &quot;cancelled&quot; |
| FAILED | &quot;failed&quot; |
| REJECTED | &quot;rejected&quot; |
| BLOCKED | &quot;blocked&quot; |
| THIRD_PARTY_PENDING_MANUAL_APPROVAL | &quot;thirdPartyPendingManualApproval&quot; |
| THIRD_PARTY_PENDING | &quot;thirdPartyPending&quot; |
| PARTIALLY_COMPLETED | &quot;partiallyCompleted&quot; |
| CANCELLING | &quot;cancelling&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| FUNDING | &quot;FUNDING&quot; |
| FUNDING_FAILED | &quot;FUNDING_FAILED&quot; |
| FUNDED | &quot;FUNDED&quot; |
| REJECTED | &quot;REJECTED&quot; |



