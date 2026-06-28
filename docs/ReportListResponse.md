

# ReportListResponse

Paginated list of report jobs. Download URLs are not included in list items — call `GET /v1/reports/{reportId}` to retrieve the download URL for a specific completed report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;ReportJob&gt;**](ReportJob.md) | Page of report jobs |  |
|**next** | **String** | Opaque cursor for the next page. Null on the last page. |  |
|**prev** | **String** | Opaque cursor for the previous page. Null on the first page. |  |



