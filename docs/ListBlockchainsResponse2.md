

# ListBlockchainsResponse2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;Blockchain&gt;**](Blockchain.md) | Blockchains for the current page. |  |
|**total** | **BigDecimal** | Total number of items across all pages, matching the current filter. |  |
|**next** | **String** | Cursor for the next page; absent when the current page is the last. Opaque base64 blob bundling the target pageCursor and current query params (pageSize, search, status, statusExclude, blockchainEnv, sortBy, order). |  [optional] |
|**prev** | **String** | Cursor for the previous page; absent when the current page is the first. |  [optional] |



