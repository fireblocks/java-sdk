

# ContactsPagedResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;Contact&gt;**](Contact.md) | The page of contacts |  |
|**next** | **String** | Cursor to the next page; absent when the current page is the last. Opaque, and bound to the sort that minted it — replay it unchanged and keep sortBy/order steady across pages. |  [optional] |
|**total** | **Integer** | The number of contacts matching the filters, ignoring pagination. Present only when the request passed &#x60;includeTotal&#x3D;true&#x60;; the key is absent otherwise. |  [optional] |



