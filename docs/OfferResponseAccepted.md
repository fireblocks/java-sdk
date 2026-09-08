

# OfferResponseAccepted

The outgoing transaction that carries the response. Its on-chain outcome arrives by webhook as a status update on this transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | The outgoing response transaction. |  |
|**status** | **String** | The transaction&#39;s status at the time of this response — &#x60;SUBMITTED&#x60;. |  |
|**responseType** | **String** | The response type you sent, echoed back so you can correlate without re-reading. |  |



