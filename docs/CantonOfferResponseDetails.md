

# CantonOfferResponseDetails

The transaction belongs to an offer conversation: the offer itself, the response to it, or a leg that carries no answer of its own. The only block that changes over a transaction's lifetime.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** | The shape of this block. Stamped at creation and never changed, so a reader always knows which version it is holding. |  [optional] |
|**domain** | **CantonDomainEnum** |  |  [optional] |
|**vendor** | **CantonVendorEnum** |  |  [optional] |
|**availableResponses** | **List&lt;String&gt;** | The responses that can be sent for this offer right now. An empty array means nothing is answerable on this transaction — which is the difference between an actionable offer and a linked leg that shares its sub-status. |  [optional] |
|**expiresAt** | **OffsetDateTime** | When the offer expires, where it has a deadline. |  [optional] |
|**approvalTransactionId** | **String** | The response transaction, once one has been dispatched for this offer. |  [optional] |
|**originalTransactionId** | **String** | The transaction this one relates to — the offer a response answered. |  [optional] |
|**verdict** | [**VerdictEnum**](#VerdictEnum) | The outcome, set once the transaction reaches a terminal status. |  [optional] |



## Enum: VerdictEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;ACCEPTED&quot; |
| REJECTED | &quot;REJECTED&quot; |



