

# GetFindingsExternalResponse

A paginated list of FSPM findings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;SecurityFinding&gt;**](SecurityFinding.md) | List of FSPM findings for the current page. |  |
|**total** | **Integer** | Total number of findings matching the query. |  |
|**next** | **String** | Cursor for the next page of results, omitted when there are no more results. |  [optional] |



