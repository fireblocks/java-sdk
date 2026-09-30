

# UtxoLabelsErrorResponse

Returned when a label request is rejected. The request is all-or-nothing, so no UTXO was labelled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | Summary of the rejection. When &#x60;failures&#x60; is present, it names the identifiers that blocked the request. |  |
|**failures** | [**List&lt;UtxoLabelFailure&gt;**](UtxoLabelFailure.md) | Every identifier that blocked the request, each with its own reason. Identifiers not listed were valid; resend them without the failed ones. Absent when the request itself was invalid (e.g. a malformed label). |  [optional] |



