

# ListOmnibusAddressesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**total** | **Integer** | The total number of addresses matching the request (respecting &#x60;fromIndex&#x60; and &#x60;search&#x60;, ignoring pagination). Returned only on the first page. |  [optional] |
|**data** | [**List&lt;OmnibusAddress&gt;**](OmnibusAddress.md) | A page of deposit addresses, ordered by index, highest first |  |
|**next** | **String** | The cursor for the next page. Absent on the last page. |  [optional] |



