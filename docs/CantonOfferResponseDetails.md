

# CantonOfferResponseDetails

The transaction belongs to an offer conversation: the offer itself, a response to it, or a leg that carries no answer of its own. The only block that changes over a transaction's lifetime. An offer can have more than one response — an allocation offer is accepted and later withdrawn — so every response transaction states which answer it is in `responseType`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **Integer** | The shape of this block. Stamped at creation and never changed, so a reader always knows which version it is holding. |  [optional] |
|**domain** | **CantonDomainEnum** |  |  [optional] |
|**vendor** | **CantonVendorEnum** |  |  [optional] |
|**availableResponses** | **List&lt;String&gt;** | The responses this offer accepts — copy one into &#x60;responseType&#x60; to answer it. Present on the offer only, set when it arrives and never changed: it states what the offer TYPE accepts, not whether it is answerable right now. The respond endpoint is the authority on that, and answers &#x60;409&#x60; when the offer&#39;s state or expiry rules a response out — for example an &#x60;ALLOCATION_WITHDRAW&#x60; sent before the accept has settled. An empty array means nothing is answerable on this transaction — the difference between an actionable offer and a linked leg that shares its sub-status. |  [optional] |
|**expiresAt** | **OffsetDateTime** | When the offer expires, where it has a deadline. |  [optional] |
|**approvalTransactionId** | **String** | The response transaction, once one has been dispatched for this offer. |  [optional] |
|**originalTransactionId** | **String** | The transaction this one relates to — the offer a response answered. |  [optional] |
|**responseType** | **String** | On a response transaction, which answer it is — the &#x60;responseType&#x60; that was sent. Absent on the offer itself. |  [optional] |
|**allocationTransactionId** | **String** | On an &#x60;ALLOCATION_WITHDRAW&#x60; response only — the accept whose allocation this withdraw released, so the withdraw transaction read on its own says what it undid. |  [optional] |
|**verdict** | [**VerdictEnum**](#VerdictEnum) | The outcome, set once the transaction reaches a terminal status. |  [optional] |



## Enum: VerdictEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;ACCEPTED&quot; |
| REJECTED | &quot;REJECTED&quot; |



